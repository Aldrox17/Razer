package com.example.ep1.ui.theme.funciones

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun SeccionParaPC(navController: NavController, navigateTo: (Screen) -> Unit) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.DarkGray //
    ){
        Column {

            Cabecera(navigateTo)

            TopBar()

            ScrollableBoxScreen()
            }

        }
    }


