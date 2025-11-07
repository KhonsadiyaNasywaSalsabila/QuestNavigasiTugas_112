package com.example.praktikumpertemuan6.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilData(
    modifier: Modifier = Modifier,
    onNavigateToWelcome: () -> Unit,
    onNavigateToForm: () -> Unit
) {
    val lightPurpleBg = Color(0xFFF0E6FF)
    val darkPurpleButton = Color(0xFF7C3AED)
    val lightPurpleButton = Color(0xFFB794F6)
    val titleColor = Color(0xFF4A00E0)

    val participantData = listOf(
        Pair("NAMA LENGKAP", "Aprilia Kurnianti"),
        Pair("JENIS KELAMIN", "Perempuan"),
        Pair("STATUS PERKAWINAN", "Lajang"),
        Pair("ALAMAT", "Sleman")
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(lightPurpleBg)
            .padding(16.dp)
    ) {
        Text(
            text = "List Daftar Peserta",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = titleColor,
            modifier = Modifier.padding(top = 16.dp, bottom = 24.dp)
        )
        participantData.forEach { data ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = data.first,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )

                Text(
                    text = data.second,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
            }
        }
        Button(
            onClick = onNavigateToWelcome,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = darkPurpleButton)
        ) {
            Text(text = "Beranda", fontSize = 16.sp)
        }

        Button(
            onClick = onNavigateToForm,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = lightPurpleButton)
        ) {
            Text(text = "Formulir Pendaftaran", fontSize = 16.sp, color = darkPurpleButton)
        }


    }
}