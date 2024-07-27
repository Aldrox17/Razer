package com.example.ep1.ui.theme.funciones

data class CarouselItem(
    val title: String,
    val imageUrl: String,
    val onClickAction: () -> Unit
)
