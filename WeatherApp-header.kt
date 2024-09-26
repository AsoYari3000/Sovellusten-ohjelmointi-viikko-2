package com.example.weatherapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(title: String, modifier: Modifier = Modifier)
{
    Text(
        text = title,
        style = TextStyle(
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
            fontWeight = FontWeight.Light
        ),
        modifier = Modifier.padding(24.dp).background(Color.Magenta)
    )
}
