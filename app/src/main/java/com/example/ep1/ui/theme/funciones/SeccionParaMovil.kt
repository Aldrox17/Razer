package com.example.ep1.ui.theme.funciones

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SeccionParaMovil(navController: NavController, navigateTo: (Screen) -> Unit){

    Column {
        Cabecera(navigateTo = navigateTo)

    }
}

