package com.example.samplearch.utils

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.view.View
import androidx.core.content.FileProvider
import com.example.samplearch.BuildConfig
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream



fun Bitmap.toFile(context: Context, name: String, isLossless: Boolean): File {
    val imageFile =
        File(context.cacheDir, "${System.currentTimeMillis()}_$name.png")
    imageFile.createNewFile()

    val byteArrayOutputStream = ByteArrayOutputStream()
    compress(
        if (isLossless) Bitmap.CompressFormat.JPEG else Bitmap.CompressFormat.PNG,
        50,
        byteArrayOutputStream
    )

    val bitmapByteArray = byteArrayOutputStream.toByteArray()

    val fileOutputStream = FileOutputStream(imageFile)
    fileOutputStream.write(bitmapByteArray)
    fileOutputStream.flush()
    fileOutputStream.close()

    return imageFile
}

fun File.toUri(context: Context): Uri? =
    try {
        FileProvider.getUriForFile(context, "${BuildConfig.APPLICATION_ID}.provider", this)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
        null
    }


