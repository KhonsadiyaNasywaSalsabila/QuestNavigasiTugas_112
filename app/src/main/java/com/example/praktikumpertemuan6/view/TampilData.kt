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

    ) {

    }
}