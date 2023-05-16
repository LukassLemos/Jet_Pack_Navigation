package com.example.jetpacknavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar ( { Text(text = "Página 1") } )
        }
    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Página 1")
            Button(onClick = {navController.navigate(Destination.ScreenSecond.route)}) {
                Text(text = "Próxima")
            }

        }
    }
}

