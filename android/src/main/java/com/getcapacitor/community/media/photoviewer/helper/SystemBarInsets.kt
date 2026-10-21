package com.getcapacitor.community.media.photoviewer.helper

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

// Keeps a top-aligned view clear of the status bar and display cutout when the app draws edge-to-edge
fun applySystemBarInsets(view: View) {
    val initialLeft = view.paddingLeft
    val initialTop = view.paddingTop
    val initialRight = view.paddingRight
    ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
        val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout())
        v.updatePadding(
            left = initialLeft + bars.left,
            top = initialTop + bars.top,
            right = initialRight + bars.right
        )
        insets
    }
    ViewCompat.requestApplyInsets(view)
}
