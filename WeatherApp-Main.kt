package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Header("sääppi", modifier = Modifier
            .fillMaxWidth()
            .weight(0.2f))
        Spacer(modifier = Modifier.padding(20.dp))
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .weight(0.8f)
                .background(color = Color.LightGray)
        )
        {
            Column(
                modifier =
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "Sunny",
                    modifier = Modifier.size(120.dp)
                )
                Text(
                    "Tänään on aurinkoista", modifier = Modifier.padding(10.dp), style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Black
                    ),
                    fontFamily = FontFamily.Monospace
                )
                Text("15°C ja tuulen nopeus on 10 m/s")
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .shadow(4.dp),
                    shape = RoundedCornerShape(10.dp)
                )
                {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh")
                }
            }


        }
    }
}
