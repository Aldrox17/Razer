package com.example.ep1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.ExperimentalSafeArgsApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ep1.ui.theme.Ep1Theme
import com.example.ep1.ui.theme.funciones.Cabecera
import com.example.ep1.ui.theme.funciones.InicioTienda
import com.example.ep1.ui.theme.funciones.Laptops
import com.example.ep1.ui.theme.funciones.Screen
import com.example.ep1.ui.theme.funciones.SeccionParaMovil
import com.example.ep1.ui.theme.funciones.SeccionParaPC

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalSafeArgsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ep1Theme {

                val navController = rememberNavController()

                Cabecera { screen ->
                    navController.navigate(screen.route)
                }


                NavHost(navController = navController, startDestination = "inicio") {
                    // Definición de las pantallas (destinos)
                    composable("inicio") {
                        InicioTienda(navController)
                    }
                    composable("Zona de Juego") {

                    }
                    composable("laptops") {
                        Laptops(navController)
                    }
                    composable("Ratones") {

                    }
                    composable("Teclados") {

                    }
                    composable("Auriculares") {

                    }
                    composable("Camaras") {

                    }
                    composable("Sillas") {

                    }
                    composable("Mando") {

                    }
                    composable("Movil") {

                    }
                    composable("Ropa y Equipo") {

                    }

                    composable(Screen.Tienda.route) {


                    }

                    composable(Screen.PC.route) {
                        // Define la pantalla o composable para "PC"
                        SeccionParaPC(navController = navController, navigateTo = navController::navigate)
                    }

                    composable(Screen.Consola.route) {


                    }

                    composable(Screen.Movil.route) {
                        SeccionParaMovil(navController = navController, navigateTo = navController::navigate)

                    }

                    composable(Screen.EstiloDeVida.route) {


                    }

                    composable(Screen.Servicios.route) {
                        // Utiliza Tienda1 como pantalla para "Tienda"

                    }

                    composable(Screen.Comunidad.route) {
                        // Utiliza Tienda1 como pantalla para "Tienda"

                    }

                    composable(Screen.Asistencia.route) {
                        // Utiliza Tienda1 como pantalla para "Tienda"

                    }
                }
            }
        }
    }
}

