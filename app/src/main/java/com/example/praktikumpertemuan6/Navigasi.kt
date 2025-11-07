package com.example.praktikumpertemuan6

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikumpertemuan6.view.FormDataDiri2
import com.example.praktikumpertemuan6.view.TampilData
import com.example.praktikumpertemuan6.view.WelcomeScreen

enum class AlurLayar {
    Welcome,
    Form,
    Data
}


@Composable
fun AplikasiNavigasi(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AlurLayar.Welcome.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = AlurLayar.Welcome.name) {
                WelcomeScreen(
                    modifier = Modifier.fillMaxSize(),
                    onNavigateToForm = {
                        navController.navigate(AlurLayar.Form.name)
                    }
                )
            }
            composable(route = AlurLayar.Form.name){
                FormDataDiri2(
                    modifier = Modifier.fillMaxSize(),
                    onNavigateToTampilData = {

                    }
                )
            }
            composable(route = AlurLayar.Data.name){
                TampilData(
                    modifier = Modifier.fillMaxSize(),
                    onNavigateToWelcome = {

                    }
                )
            }
        }
    }
}