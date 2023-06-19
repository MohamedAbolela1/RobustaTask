package com.example.samplearch.home.presentation

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.samplearch.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionFragmentHomeToFragmentFullScreen(
    public val imageItem: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragmentHome_to_fragmentFullScreen

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("imageItem", this.imageItem)
        return result
      }
  }

  public companion object {
    public fun actionFragmentHomeToFragmentAddNewPhoto(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentHome_to_fragmentAddNewPhoto)

    public fun actionFragmentHomeToFragmentFullScreen(imageItem: String? = null): NavDirections =
        ActionFragmentHomeToFragmentFullScreen(imageItem)
  }
}
