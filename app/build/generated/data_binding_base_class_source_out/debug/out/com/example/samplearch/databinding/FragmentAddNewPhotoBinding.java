// Generated by view binder compiler. Do not edit!
package com.example.samplearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.samplearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddNewPhotoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardProduct;

  @NonNull
  public final AppCompatImageView img;

  @NonNull
  public final AppCompatImageView imgFacebook;

  @NonNull
  public final AppCompatImageView imgProduct;

  @NonNull
  public final AppCompatImageView imgTwitter;

  @NonNull
  public final BackToolbarBinding toolbarDetails;

  private FragmentAddNewPhotoBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardProduct, @NonNull AppCompatImageView img,
      @NonNull AppCompatImageView imgFacebook, @NonNull AppCompatImageView imgProduct,
      @NonNull AppCompatImageView imgTwitter, @NonNull BackToolbarBinding toolbarDetails) {
    this.rootView = rootView;
    this.cardProduct = cardProduct;
    this.img = img;
    this.imgFacebook = imgFacebook;
    this.imgProduct = imgProduct;
    this.imgTwitter = imgTwitter;
    this.toolbarDetails = toolbarDetails;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddNewPhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddNewPhotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_new_photo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddNewPhotoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardProduct;
      CardView cardProduct = ViewBindings.findChildViewById(rootView, id);
      if (cardProduct == null) {
        break missingId;
      }

      id = R.id.img;
      AppCompatImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.imgFacebook;
      AppCompatImageView imgFacebook = ViewBindings.findChildViewById(rootView, id);
      if (imgFacebook == null) {
        break missingId;
      }

      id = R.id.imgProduct;
      AppCompatImageView imgProduct = ViewBindings.findChildViewById(rootView, id);
      if (imgProduct == null) {
        break missingId;
      }

      id = R.id.imgTwitter;
      AppCompatImageView imgTwitter = ViewBindings.findChildViewById(rootView, id);
      if (imgTwitter == null) {
        break missingId;
      }

      id = R.id.toolbarDetails;
      View toolbarDetails = ViewBindings.findChildViewById(rootView, id);
      if (toolbarDetails == null) {
        break missingId;
      }
      BackToolbarBinding binding_toolbarDetails = BackToolbarBinding.bind(toolbarDetails);

      return new FragmentAddNewPhotoBinding((ConstraintLayout) rootView, cardProduct, img,
          imgFacebook, imgProduct, imgTwitter, binding_toolbarDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
