package com.example.samplearch.addPhoto.presentation

import android.Manifest
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.example.samplearch.R
import com.example.samplearch.addPhoto.domain.model.WeatherDetails
import com.example.samplearch.base.BaseFragment
import com.example.samplearch.databinding.FragmentAddNewPhotoBinding
import com.example.samplearch.model.ViewState
import com.example.samplearch.utils.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class AddNewPhotoFragment : BaseFragment<FragmentAddNewPhotoBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentAddNewPhotoBinding
        get() = FragmentAddNewPhotoBinding ::inflate

    private val addNewPhotoViewModel by viewModels<AddNewPhotoViewModel>()


    private lateinit var finalImage : Bitmap
    private var isValid = false
    private lateinit var uri : Uri
    private lateinit var weatherDetails: WeatherDetails

    @RequiresApi(Build.VERSION_CODES.R)
    private val cameraResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val extras: Bundle? = result.data?.extras
            extras?.let {
                val imageBitmap = it[DATA] as Bitmap
                finalImage = imageBitmap.drawImages()
                binding.imgProduct.setImageBitmap(finalImage)
                uri = finalImage.toFile(requireContext(),ShareImage
                    ,false).toUri(requireContext())!!
                isValid = true
                binding.img.isVisible = false
                saveImage(weatherDetails.temp.toString(),weatherDetails.condition.toString(),uri)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun setup() {
        setToolbar(
            mToolbar = binding.toolbarDetails.toolbar,
            navigationIconDrawable = R.drawable.ic_back
        )
        observeViewModel()
        setListeners()
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun setListeners(){
        with(binding){
            cardProduct.setOnClickListener {
                if (weatherDetails.temp==null){
                    showToast(getString(R.string.no_network_connection))
                } else {
                    checkCameraPermission()
                }
            }

            imgFacebook.setOnClickListener {
               if (isValid)
                    shareImage(FaceBook)
                else
                   showToast(getString(R.string.please_fill_empty))
            }

            imgTwitter.setOnClickListener {
                if (isValid)
                    shareImage(Twitter)
                else
                    showToast(getString(R.string.please_fill_empty))
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun checkCameraPermission(){
        if (ActivityCompat.checkSelfPermission(
                requireActivity().applicationContext,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                requireActivity().applicationContext,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE),
                1002
            )
        } else {
            openCameraIntent()
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun openCameraIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraResultLauncher.launch(takePictureIntent)
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun Bitmap.drawImages(): Bitmap {
        val width = requireContext().display?.width ?: 0
        val height = requireContext().display?.height ?: 0

        val image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(image)

        val bg = Bitmap.createScaledBitmap(this, width, height, true)
        canvas.drawBitmap(bg, 0F, 0F, null)

        val paint = Paint().apply {
            textSize = 75f
            alpha = 80
            typeface = requireContext().resources.getFont(R.font.cairo_bold)
        }

        canvas.run {
            drawPaint(paint)
            paint.color = Color.BLACK
            drawText(City, 40F, 200F, paint)
            drawText(weatherDetails.temp.toString(), 40F, 300F, paint)
            drawText(weatherDetails.condition.toString(), 40F, 400F, paint)
        }

        return image
    }

    private fun saveImage(place: String, temp: String, uri: Uri) {
        runBlocking{
            addNewPhotoViewModel.saveTask(place,temp,uri.toString())
        }
    }

    private fun shareImage(app:String){
        val sendIntent = Intent(Intent.ACTION_VIEW)
        sendIntent.type = "image/*"
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_STREAM,uri )
        if (app == FaceBook){
            sendIntent.setPackage("com.facebook.katana")

        } else {
            sendIntent.setPackage("com.twitter.android")
        }
        sendIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        try {
            startActivity(Intent.createChooser(sendIntent, "Share images..."))
        } catch (ex: ActivityNotFoundException) {
            showToast(getString(R.string.please_install_app))
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    private fun observeViewModel() {
        addNewPhotoViewModel.weatherState.observe(viewLifecycleOwner,::bindState)
    }

    private fun bindState(state: ViewState<WeatherDetails>) {
        when (state) {
            is ViewState.Success -> bindWeatherData(state.data)
            else -> {
            }
        }
    }

    private fun bindWeatherData(data : WeatherDetails) {
       weatherDetails = data
    }

}