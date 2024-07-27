package com.example.ep1.ui.theme.funciones

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.ep1.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue


@Composable
fun Laptops(navController: NavController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {

            Cabecera2()

            CarouselCard2()

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "PORTÁTILES GAMING",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Green
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Text(
                text = "Los portátiles más potentes y portátiles para gamers, creadores/as y profesionales",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 1.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "PORTÁTILES GEFORCE RTX™ SERIE 40",
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 2.dp)
            )
            Text(
                text = "Los portátiles más potentes y portátiles para gamers,\núltimas tarjetas gráficas NVIDIA y\nprocesadores Intel y AMD",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            CarouselCardSegundo2()

            Spacer(modifier = Modifier.height(30.dp))

            CarouselCardTercero2()

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "PORTÁTILES GEFORCE RTX™ SERIE 30",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
            Text(
                text = "Descubre las ofertas exclusivas de Razer.com\nen estos potentes portátiles",
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))

            CarouselCardCuarto2()

            Spacer(modifier = Modifier.height(20.dp))

            CarouselCardDoble()

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "ÚLTIMA RONDA DE PORTÁTILES",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
            Text(
                text = "Aprovecha tu última oportunidad para hacerte\ncon una de estas potentes gráficas GeForce\nRTX 30 y 40",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            CarouselCardQuinto()

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "ÚLTIMA RONDA DE PERIFÉRICOS",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
            Text(
                text = "No dejes pasar la última oportunidad de\ncomprar estos clásicos",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            CarouselCardSexto()

        }

    }
}









@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cabecera2() {
    val context = LocalContext.current.applicationContext
    val options = arrayOf("Tienda", "PC", "Consola", "Móvil", "Estilo de vida", "Servicios", "Comunidad", "Asistencia")

    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(options[0]) }


    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        title = {},
        actions = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null,
                        tint = Color.White
                    )
                }

                AnimatedVisibility(
                    visible = expanded,            //Modificar velocidad
                    enter = fadeIn(animationSpec = tween(durationMillis = 500)) + expandVertically(animationSpec = tween(durationMillis = 500)),
                    exit = fadeOut(animationSpec = tween(durationMillis = 300)) + shrinkVertically(animationSpec = tween(durationMillis = 300))
                ) {
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(Color.Black)
                    ) {
                        DropdownMenuItem(
                            text = {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = null,
                                        tint = Color.White
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.logorazer),
                                        contentDescription = null,
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Default.AccountCircle,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(32.dp)
                                    )
                                }
                            },
                            onClick = {
                                expanded = false
                            }
                        )

                        DropdownMenuItem(
                            text = {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.Gray)
                                        .padding(8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = null,
                                        tint = Color.White
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "Buscador.Razer.app",
                                        color = Color.White,
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                }
                            },
                            onClick = {

                            }
                        )

                        options.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option, color = Color.White) },
                                onClick = {
                                    selectedText = option
                                    expanded = false
                                    Toast.makeText(context, option, Toast.LENGTH_LONG).show()
                                }
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logorazer),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .weight(1f)
                    )

                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCard2() {
    val pagerState = rememberPagerState(initialPage = 1)
    val sliderList = listOf(
        "https://i.ibb.co/W0s74zB/zonade.png",
        "https://i.ibb.co/rHPKGs2/laptop.png",
        "https://i.ibb.co/ZBM6xWP/mouse.png",
        "https://i.ibb.co/GpjDZwq/teclado.png",
        "https://i.ibb.co/dc25gsc/auricular.png",
        "https://i.ibb.co/bJCvzfb/camara.png",
        "https://i.ibb.co/D5TbTD9/silla.png",
        "https://i.ibb.co/025K8Tw/mando.png",
        "https://i.ibb.co/TgRnrtQ/swtch.png",
        "https://i.ibb.co/JRv069t/ropa.png"
    )
    val textList = listOf(
        "Zona de Juego",
        "Laptops",
        "Ratones",
        "Teclados",
        "Auriculares",
        "Camaras",
        "Sillas",
        "Mando",
        "Móvil",
        "Ropa y Equipo"
    )
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = sliderList.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 120.dp),
            modifier = Modifier.height(150.dp)
        ) { page ->
            Card(
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black),
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(start = 0.75f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f))
                            .also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }
                        alpha = lerp(
                            start = 0.6f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
                    .aspectRatio(1f)
                    .height(250.dp)
                    .width(160.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(sliderList[page])
                            .crossfade(true)
                            .scale(Scale.FILL)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .weight(1f)
                            .clickable {}
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = textList[page],
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 8.dp)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardSegundo2() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/RcYVWZf/1.png",
        "https://i.ibb.co/y8yXVBw/2.png",
        "https://i.ibb.co/v3VrnWQ/3.png",
        "https://i.ibb.co/Mh5YD80/4.png",
        "https://i.ibb.co/FgDXCTn/5.png",
        "https://i.ibb.co/FgDXCTn/5.png"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = sliderList.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 25.dp),
            modifier = Modifier.height(650.dp)
        ) { page ->
            Card(
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF222222)),
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(start = 0.75f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f))
                            .also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }
                        alpha = lerp(
                            start = 0.6f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(sliderList[page])
                            .crossfade(true)
                            .scale(Scale.FILL)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(350.dp)
                            .clickable {},
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    when (page) {
                        0 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevo Razer Blade 14",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil gaming ultrapotente y ultraportátil de 14\ncon procesador AMD Ryzen™ 98945HS y tarjeta gráfica NVIDIA® GeForce\nRTX™ serie 40",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Ahora disponible en un elegante acabado\nMercury o negro mate.",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(50.dp))


                                    Text(
                                        text = "Desde\n2.499,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        1 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevo Razer Blade 15 (2023)",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA® GeForce RTX™ serie 40 de\n15' con procesador Intel® Core™ i7 de 13ª\ngeneración (14 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(80.dp))


                                    Text(
                                        text = "Desde\n2.199,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        2 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevo Razer Blade 16",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil gaming de 16” de alto rendimiento\ncon pantalla OLED a 240 Hz",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Consigue el juego Star Wars Outlaw™ al\ncomprar un portátil con procesador Intel®\nCore™ i9-14900HX.",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(50.dp))

                                    Text(
                                        text = "Desde\n3.499,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        3 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevos Razer Blade 18 4K\nMercury",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil gaming de 18\" de alto rendimiento\ncon pantalla 4K a 200 Hz",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Modelo 4K Disponible en Breve",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )


                                    Spacer(modifier = Modifier.height(130.dp))


                                    Text(
                                        text = "Desde\n5.199,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        4 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevos Razer Blade 18 4K",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil gaming de 18\" de alto rendimiento\ncon pantalla 4K a 200 Hz",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Modelo 4K Disponible en Breve",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(110.dp))


                                    Text(
                                        text = "Desde\n5.399,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        5 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Nuevos Razer Blade 18",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil gaming de 18\" de alto rendimiento\ncon pantalla QHD+ Mini-LED a 240 Hz",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Consigue el juego Star Wars Outlaw™ a\ncomprar un portátil con procesador Intel®\nCore™ i9-14900HX.",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n3.599,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier.align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }

                        else -> {

                        }
                    }


                }

            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardTercero2(modifier: Modifier = Modifier) {
    val images = listOf(
        R.drawable.starr
    )

    val texts = listOf(
        "DESCUBRE UNA GALAXIA DE\nOPORTUNIDADES",
    )

    val descriptions = listOf(
        "OBTÉN STAR WARS OUTLAWS CON LA\nCOMPRA DE PRODUCTOS INTEL CORE DE\n14° GENERACIÓN QUE CUMPLAN LOS\nREQUISITOS. DESCUBRE UNA GALAXIA DE\nOPORTUNIDADES",
    )

    val actions = listOf(
        "Compra ahora>"
    )

    val pagerState = rememberPagerState()


    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                count = images.size,
                modifier = Modifier
                    .fillMaxWidth()
            ) { currentPage ->
                Column {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = images[currentPage]),
                            contentDescription = ""
                        )

                    }


                    Text(
                        text = texts[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(26.dp)
                    )

                    Text(
                        text = descriptions[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Gray,
                        modifier = Modifier.padding(horizontal = 18.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = actions[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Green,
                        modifier = Modifier.padding(horizontal = 20.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Row(
                        Modifier
                            .height(50.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        repeat(images.size){
                            val color =
                                if (pagerState.currentPage == it) Color.Green else Color.White
                            Box(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .clip(CircleShape)
                                    .size(20.dp)
                                    .background(color)
                                    .clickable{
                                        scope.launch{
                                            pagerState.animateScrollToPage(it)
                                        }
                                    }
                            )

                        }
                    }

                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardCuarto2() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/vJ9MBRj/laptopcase2-fotor-bg-remover-20240703104531.png"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = sliderList.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 25.dp),
            modifier = Modifier.height(650.dp)
        ) { page ->
            Card(
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF222222)),
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(start = 0.75f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f))
                            .also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }
                        alpha = lerp(
                            start = 0.6f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(sliderList[page])
                            .crossfade(true)
                            .scale(Scale.FILL)
                            .build(),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(350.dp)
                            .clickable {},
                        contentScale = ContentScale.Crop // Aplica ContentScale.Crop aquí
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    when (page) {
                        0 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Razer Blade 2017 (2022)",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil para sustituir al ordenador de\nsobremesa con procesador de 12.\ngeneración",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(110.dp))


                                    Text(
                                        text = "Desde\n2.199,99 €",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                }
                                Button(
                                    onClick = {},
                                    shape = CutCornerShape(4.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "COMPRAR",
                                        color = Color.Black
                                    )
                                }
                            }
                        }


                        else -> {

                        }
                    }


                }

            }
        }
    }
}

