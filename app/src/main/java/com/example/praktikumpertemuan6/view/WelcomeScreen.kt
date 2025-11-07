package com.example.praktikumpertemuan6.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumpertemuan6.R

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,

) {
    val LightPurple = Color(0xFFF0E6FF)
    val DarkPurple = Color(0xFF6200EE)
    val TextColor = Color(0xFF4A00E0)

    Surface(

    ) {
        Column(

        ) {
            Text(
                text = "Selamat Datang",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Placeholder",
                modifier = Modifier.size(150.dp)
            )

            Column(){
                Text(
                    text = "Khonsadiya Nasywa Salsabila",
                    fontSize = 18.sp,
                    color = TextColor
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "20230140112",
                    fontSize = 16.sp,
                    color = TextColor.copy(alpha = 0.7f)
                )

            }

        }
    }
}