package com.example.composablelayout2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen( modifier: Modifier = Modifier,
                   onPrivacy: () -> Unit = {},
                   onHistory: () -> Unit = {},
                   onSettings: () -> Unit = {}
) {
    val bgTop = Color(0xFF0E1116)
    val bgBottom = Color (0xFF1A1F26)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(listOf(bgTop, bgBottom))
            )
            .padding(horizontal = 20.dp)
    ){
    }
}