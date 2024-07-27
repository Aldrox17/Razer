package com.example.ep1.ui.theme.funciones


sealed class Screen(val route: String) {
    object Tienda : Screen("tienda")
    object PC : Screen("pc")
    object Consola : Screen("consola")
    object Movil : Screen("movil")
    object EstiloDeVida : Screen("estilo_de_vida")
    object Servicios : Screen("servicios")
    object Comunidad : Screen("comunidad")
    object Asistencia : Screen("asistencia")
}
