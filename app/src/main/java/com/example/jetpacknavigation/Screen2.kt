package com.example.jetpacknavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen2(ControladorDeNavegacao:NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar ( {  Text(text = "Página 2") } )
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Página 2")
            Button(onClick = {ControladorDeNavegacao.popBackStack()}) {
                Text(text = "Próxima")
            }
            // Button(onClick = {navController.navigateUp()}) {
               // Text(text = "Back")
            }
       // }
    }
}

