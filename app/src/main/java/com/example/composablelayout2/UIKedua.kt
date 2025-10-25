package com.example.composablelayout2

import android.R.attr.bottom
import android.R.attr.top
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

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
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(top = 24.dp, bottom = 16.dp)
        ){
            Avatar(
                modifier = Modifier
                    .size(96.dp)
                    .shadow(16.dp, CircleShape, clip = true)
            )
            Spacer(Modifier.height(12.dp))

            SocialRow()

            Spacer(Modifier.height(12.dp))
            Text(
                text = "Ryan Syaputra Maulana Arsad",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "@Ryan Syaputra MA",
                color = Color(0xFFB8C0CC),
                fontSize = 13.sp
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Saya seorang Back End Developer",
                color = Color(0xFFE4E7EC),
                fontSize = 14.sp
            )


        }
    }
}