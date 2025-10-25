package com.example.composablelayout2

import android.R.attr.bottom
import android.R.attr.contentDescription
import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextPainter.paint
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
            Spacer(Modifier.height(24.dp))

            SettingCard(
                title = "Privacy",
                subtitle = null,
                leading = {
                    Icon(
                        Icons.Filled.Security,
                        contentDescription = null,
                        tint = Color(0xFF7CD6F9),
                        modifier = Modifier.size(22.dp)
                    )
                },
                onClick = onPrivacy
            )
            Spacer(Modifier.height(12.dp))
            SettingCard(
                title = "Riwayat Transaksi",
                subtitle = null,
                leading = {
                    Icon(
                        Icons.Filled.History,
                        contentDescription = null,
                        tint = Color(0xFF9BA8FF),
                        modifier = Modifier.size(22.dp)
                    )
                },
                onClick = onHistory
            )
            Spacer(Modifier.height(12.dp))
            SettingCard(
                title = "Pengaturan",
                subtitle = null,
                leading = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = null,
                        tint = Color(0xFFF3B46B),
                        modifier = Modifier.size(22.dp)
                    )
                },
                onClick = onSettings
            )
            Spacer(Modifier.weight(1f))

            Text(
                text = "© 2025 Ryan Syaputra Maulana Arsad",
                color = Color(0xFF8C96A6),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
private fun Avatar(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ryan),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(3.dp, Color.White, CircleShape),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
        )
    }
}












