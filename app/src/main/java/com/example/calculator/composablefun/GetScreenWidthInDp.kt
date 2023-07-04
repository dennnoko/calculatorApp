package com.example.calculator.composablefun

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun getScreenWidthInDp(): Dp {
    val screenWidth = LocalDensity.current.run {
        LocalConfiguration.current.screenWidthDp.dp
    }
    return screenWidth
}