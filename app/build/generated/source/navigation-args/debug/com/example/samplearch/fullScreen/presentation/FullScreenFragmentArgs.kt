package com.example.samplearch.fullScreen.presentation

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class FullScreenFragmentArgs(
  public val imageItem: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("imageItem", this.imageItem)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("imageItem", this.imageItem)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FullScreenFragmentArgs {
      bundle.setClassLoader(FullScreenFragmentArgs::class.java.classLoader)
      val __imageItem : String?
      if (bundle.containsKey("imageItem")) {
        __imageItem = bundle.getString("imageItem")
      } else {
        __imageItem = null
      }
      return FullScreenFragmentArgs(__imageItem)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FullScreenFragmentArgs {
      val __imageItem : String?
      if (savedStateHandle.contains("imageItem")) {
        __imageItem = savedStateHandle["imageItem"]
      } else {
        __imageItem = null
      }
      return FullScreenFragmentArgs(__imageItem)
    }
  }
}
