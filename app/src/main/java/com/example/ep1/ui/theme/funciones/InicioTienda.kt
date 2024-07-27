package com.example.ep1.ui.theme.funciones


import android.util.Log
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
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
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
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.util.lerp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.size.Scale
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import com.google.accompanist.pager.HorizontalPager
import coil.request.ImageRequest
import com.example.ep1.R
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import kotlin.math.absoluteValue

@Composable
fun InicioTienda(navController: NavController) {

    val carouselItems = listOf(
        CarouselItem("Zona de Juego", "https://i.ibb.co/W0s74zB/zonade.png") {

            navController.navigate("gamingZone")
        },
        CarouselItem("Laptops", "https://i.ibb.co/rHPKGs2/laptop.png") {
            navController.navigate("laptops")
        },
        CarouselItem("Ratones", "https://i.ibb.co/ZBM6xWP/mouse.png") {
            navController.navigate("Mouses")
        },
        CarouselItem("Teclados", "https://i.ibb.co/GpjDZwq/teclado.png") {
            navController.navigate("keyboards")
        },
        // Añade más elementos según tus necesidades
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {

            Cabecera { screen -> navController.navigate(screen.route) }

            CarouselCard(carouselItems)

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "DESCUBRE EL EQUIPO DE\n" +
                        "GAMERS. PARA GAMERS.",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Green
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Text(
                text = "Razer ratones, teclados, auriculares,\nordenadores portátiles y mucho más",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 1.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            // Tercer texto
            Text(
                text = "ÚLTIMOS LANZAMIENTOS",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp)
            )
            Text(
                text = "Echa un vistazo a nuestros últimos \nlanzamientos para conseguir las \nactualizaciones más recientes para tu equipo",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            CarouselCardSegundo()

            Spacer(modifier = Modifier.height(30.dp))

            CarouselCardTercero()

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "SOLO EN RAZER",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
            Text(
                text = "Explora productos y servicios únicos que solo\nestán disponibles en nuestra tienda oficial\nonline",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )


            Spacer(modifier = Modifier.height(10.dp))

            CarouselCardCuarto()

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

            Spacer(modifier = Modifier.height(20.dp))

            Foot()
        }

    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCard(carouselItems: List<CarouselItem>) {

    val pagerState = rememberPagerState(initialPage = 1)
    val sliderList = listOf(
        R.drawable.zonade,
        R.drawable.laptop,
        R.drawable.mouse,
        R.drawable.teclado,
        R.drawable.auricular,
        R.drawable.camara,
        R.drawable.silla,
        R.drawable.mando,
        R.drawable.swtch,
        R.drawable.ropa
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
            if (page in carouselItems.indices && page in textList.indices) {
                val item = carouselItems[page]
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
                                .clickable {
                                    item.onClickAction()
                                }
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
            } else {
                // Maneja el caso donde el índice está fuera de los límites
                Log.e("Error", "Índice fuera de límites: $page")
            }
        }
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardSegundo() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/zNNf0v0/laptop1.png",
        "https://i.ibb.co/3ry5bH3/laptop2.png",
        "https://i.ibb.co/QFWXw2r/laptop3.png",
        "https://i.ibb.co/ckn2X3R/teclado1.png",
        "https://i.ibb.co/RvYySWL/teclado2.png",
        "https://i.ibb.co/WvgW9NR/microfono.png",
        "https://i.ibb.co/vZpkCH3/mouseblanco.png"
    )

    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            HorizontalPager(
                count = sliderList.size,
                state = pagerState,
                contentPadding = PaddingValues(horizontal = 15.dp),
                modifier = Modifier
                    .height(640.dp)
                    .align(Alignment.Center)
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
                                        Spacer(modifier = Modifier.height(20.dp))


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
                                            text = "Nuevo Razer Blade 16",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Portátil gaming de 16' de alto rendimiento\ncon pantalla OLED a 240 Hz",
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
                                        Spacer(modifier = Modifier.height(70.dp))


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
                                            text = "Nuevo Razer Blade 18",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Portátil gaming de 18' de alto rendimiento\ncon pantalla QHD+ Mini-LED a 240 Hz",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                color = Color.Gray
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )

                                        Spacer(modifier = Modifier.height(120.dp))


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
                                            text = "Razer BlackWidow V4 Pro",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Teclado mecanico gaming con Razer\n" +
                                                    "Chroma RGB",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                color = Color.Gray
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )

                                        Spacer(modifier = Modifier.height(120.dp))


                                        Text(
                                            text = "Desde\n269,49 €",
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
                                            text = "Razer Hunstman V3 Pro\n" +
                                                    "Tenkeyless",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Teclado óptico analógico para esports sin\n" +
                                                    "teclado numérico",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                color = Color.Gray
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )

                                        Spacer(modifier = Modifier.height(100.dp))


                                        Text(
                                            text = "Desde\n249,99 €",
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
                                            text = "Razer Seiren V3 CHROMA",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Microfono USB RGB con pulsación para\nilenciar",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                color = Color.Gray
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )

                                        Spacer(modifier = Modifier.height(120.dp))


                                        Text(
                                            text = "Desde\n159,99 €",
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
                            6 -> {
                                Box(
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(16.dp)
                                    ) {
                                        Text(
                                            text = "Razer Cobra Pro",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                color = Color.White
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )
                                        Spacer(modifier = Modifier.height(9.dp))

                                        Text(
                                            text = "Ratón gaming inámbrico y personalizable\ncon Razer Chroma RGB",
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                color = Color.Gray
                                            ),
                                            modifier = Modifier.padding(bottom = 9.dp)
                                        )

                                        Spacer(modifier = Modifier.height(120.dp))


                                        Text(
                                            text = "Desde\n149,99 €",
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

                IconButton(
                    onClick = {
                        scope.launch {
                            val previousPage = pagerState.currentPage - 1
                            if (previousPage >= 0) {
                                pagerState.animateScrollToPage(previousPage)
                            }
                        }
                    },
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(16.dp)
                        .background(Color(0x80000000), CircleShape)
                ) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = "Previous",
                        tint = Color.Green
                    )
                }


                IconButton(
                    onClick = {
                        scope.launch {
                            val nextPage = pagerState.currentPage + 1
                            if (nextPage < sliderList.size) {
                                pagerState.animateScrollToPage(nextPage)
                            }
                        }
                    },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(16.dp)
                        .background(Color(0x80000000), CircleShape)

                ) {
                    Icon(Icons.Default.ArrowForward, contentDescription = "Next", tint = Color.Green)
                }

            }

        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(sliderList.size) {
                val color =
                    if (pagerState.currentPage == it) Color.Green else Color.White
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(CircleShape)
                        .size(18.dp)
                        .background(color)
                        .clickable {
                            scope.launch {
                                tween<Float>(durationMillis = 1000)
                                pagerState.animateScrollToPage(page = it)
                            }
                        }
                )
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardTercero(modifier: Modifier = Modifier) {
    val images = listOf(
        R.drawable.p1,
        R.drawable.p3,
        R.drawable.p4,
    )

    val texts = listOf(
        "EDICIÓN BLANCA DE RAZER",
        "AVIVA LA BATALLA",
        "GANA LOS RAZER NOMMO V2 PRO"
    )

    val descriptions = listOf(
        "DESCUBRE LA COLECCIÓN",
        "TE ESPERAn CON OFERTAS EXCLUSIVAS",
        "SORTEO DE RAZERSTORE REWARDS"
    )

    val actions = listOf(
        "Aprende más>",
        "Compra Ahora>",
        "Compra Ahora>"
    )

    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                count = images.size,
                modifier = Modifier.fillMaxWidth()
            ) { currentPage ->
                Column {
                    Box {
                        Image(
                            painter = painterResource(id = images[currentPage]),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth()
                        )

                        IconButton(
                            onClick = {
                                val nextPage = pagerState.currentPage + 1
                                if (nextPage < images.size) {
                                    scope.launch {
                                        pagerState.scrollToPage(nextPage)
                                    }
                                }
                            },
                            modifier = Modifier
                                .padding(20.dp)
                                .size(48.dp)
                                .align(Alignment.CenterEnd)
                                .clip(CircleShape),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(0x52373737)
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Filled.KeyboardArrowRight,
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                tint = Color.Green
                            )
                        }

                        IconButton(
                            onClick = {
                                val prevPage = pagerState.currentPage - 1
                                if (prevPage >= 0) {
                                    scope.launch {
                                        pagerState.scrollToPage(prevPage)
                                    }
                                }
                            },
                            modifier = Modifier
                                .padding(20.dp)
                                .size(48.dp)
                                .align(Alignment.CenterStart)
                                .clip(CircleShape),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(0x52373737)
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Filled.KeyboardArrowLeft,
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                tint = Color.Green
                            )
                        }
                    }

                    Text(
                        text = texts[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(28.dp)
                    )

                    Text(
                        text = descriptions[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Gray,
                        modifier = Modifier.padding(horizontal = 28.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = actions[currentPage],
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Green,
                        modifier = Modifier.padding(horizontal = 28.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Row(
                        Modifier
                            .height(50.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        repeat(images.size) {
                            val color =
                                if (pagerState.currentPage == it) Color.Green else Color.White
                            Box(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .clip(CircleShape)
                                    .size(20.dp)
                                    .background(color)
                                    .clickable {
                                        scope.launch {
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
fun CarouselCardCuarto() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/FzZw4wk/maus.png",
        "https://i.ibb.co/j85gy54/mauspad.png",
        "https://i.ibb.co/QcdvPwg/teclado4.png",
        "https://i.ibb.co/NxRWKHS/nose.png",
        "https://i.ibb.co/7njLjP5/au.png",
        "https://i.ibb.co/dG6s0J0/tecla.png",
        "https://i.ibb.co/XsW3wSg/logito.png"


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
                                        text = "Razer Naga Left-Handed Edition ",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Ráton ergonómico para juegos MMO\ndiseñado para usuarios surdos",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(105.dp))


                                    Text(
                                        text = "Desde\n109,99 €",
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
                                        text = "Razer Firefly V2 Pro-Blanca",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Alfombrilla totalmente iluminada para ráton\ngaming RGB",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(130.dp))


                                    Text(
                                        text = "Desde\n109,99 €",
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
                                        text = "Razer BlackWidow V4 Pro\n-Switches naranja - US - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Teclado mecánico gaming con Razer\nChroma RGB",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(105.dp))


                                    Text(
                                        text = "Desde\n269,99 €",
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
                                        text = "Razer Blue Screen",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Pantalla Chroma de fondo plegable para\nstreaming",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(130.dp))


                                    Text(
                                        text = "Desde\n179,99 €",
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
                                        text = "Razer THS Case for Airpods Pro-\nMercury",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Funda protectora para el estuche de carga\nde los Airpods Pro",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(85.dp))


                                    Text(
                                        text = "Desde\n34,99 €",
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
                                        text = "Razer HyperPolling Wireless\nDongle",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Dongle inalámbrico De 9000 Hz",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(125.dp))


                                    Text(
                                        text = "Desde\n34,99 €",
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

                        6 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Team Razer Floor Rug - Quartz",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Accesorio para silla y habitación para\nesports",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(130.dp))


                                    Text(
                                        text = "Desde\n89,99 €",
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

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardQuinto() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/2F6yxrg/descarga-2-fotor-bg-remover-20240611134245.png",
        "https://i.ibb.co/H4Qxtn8/https-hybrismediaprod-blob-core-windows-net-sys-master-phoenix-images-container-hfe-h86-947071677238.png",
        "https://i.ibb.co/K5wPHCR/https-hybrismediaprod-blob-core-windows-net-sys-master-phoenix-images-container-hfe-h86-947071677238.png",
        "https://i.ibb.co/H4Qxtn8/https-hybrismediaprod-blob-core-windows-net-sys-master-phoenix-images-container-hfe-h86-947071677238.png",
        "https://i.ibb.co/GVrVQCz/descarga-fotor-bg-remover-20240611133343.png",
        "https://i.ibb.co/H4Qxtn8/https-hybrismediaprod-blob-core-windows-net-sys-master-phoenix-images-container-hfe-h86-947071677238.png",
        "https://i.ibb.co/6Jftfyh/https-hybrismediaprod-blob-core-windows-net-sys-master-phoenix-images-container-h57-h84-947071680515.png"

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
                                        text = "Razer Blade 15 - QHD 240 Hz -\nGeForce RTX 4070 - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil Nvidia GeForce RTX serie 40 de\n15' con procesador Intel Core i7 de 13\ngeneración (14 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(90.dp))


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
                                        text = "Razer Blade 16 - QHD+ 240 Hz-\nGeForce RTX 4060 - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA GeForce RTX 40 Series\nde 16° con procesador Inter Core de i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(90.dp))


                                    Text(
                                        text = "Desde\n2.599,99 €",
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
                                        text = "Razer Blade 16 - QHD+ 240 Hz -\nGeForce RTX 4070 - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA GeFor RTX 40 Series\nde 16° con procesador Inter Core i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(70.dp))


                                    Text(
                                        text = "Desde\n2.799,99 €",
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
                                        text = "Razer Blade 16- QHD+ 240 Hz -\nGeForce RTX 4080 - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA GeForce RTX 40 Series\nde 16° con procesador Intel Core i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(95.dp))


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
                                        text = "Razer Blade 16 - Dual UHD+FHD\nMini-LED - GeForce RTX 4080 - \nMercury",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA GeForce RTX 40 Series\nde 16° con procesador Intel Core i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(45.dp))


                                    Text(
                                        text = "Desde\n3,799,99 €",
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
                                        text = "Razer Blade 16 - Dual UHD+FHD*\nMini-LED - GeForce RTX 4090 -\nNegro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA GeForce RTX 40 Series\nde 16° con procesador Intel Core i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(45.dp))


                                    Text(
                                        text = "Desde\n4.399,99 €",
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

                        6 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Razer Blade 18 - QHD+ 240 Hz\nGeForce RTX 4060 - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Portátil NVIDIA Geforce RTX 40 Series\nde 19° con procesador Intel Core i9 de\n13° generación (24 núcleos)",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(90.dp))


                                    Text(
                                        text = "Desde\n2.799,99 €",
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

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardSexto() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/k1RJ12w/descarga-10-fotor-bg-remover-20240611145022.png",
        "https://i.ibb.co/sm19VPz/descarga-3-fotor-bg-remover-2024061114511.png",
        "https://i.ibb.co/MZdnyMV/descarga-4-fotor-bg-remover-20240611145050.png",
        "https://i.ibb.co/P6YC2cC/descarga-5-fotor-bg-remover-20240611145046.png",
        "https://i.ibb.co/HhK7Sdc/descarga-6-fotor-bg-remover-20240611145042.png",
        "https://i.ibb.co/gj86H4G/descarga-7-fotor-bg-remover-20240611145039.png",
        "https://i.ibb.co/8DwynCn/descarga-8-fotor-bg-remover-20240611145035.png",
        "https://i.ibb.co/WynkZ2D/descarga-9-fotor-bg-remover-20240611145028.png"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = sliderList.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 25.dp),
            modifier = Modifier.height(550.dp)
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
                                        text = "Razer Seiren V2 Pro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Micrófono USB de calidad profesional para\ntreamers",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n111,99 €",
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
                                        text = "Razer Seiren BT",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Micrófono Bluethooth para streaming móvil",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(50.dp))


                                    Text(
                                        text = "Desde\n76,99 €",
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
                                        text = "Razer Wolverine V2",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Mando de juego con cable para Xbox\nSeries x",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n83,99 €",
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
                                        text = "Razer Kaira Pro HyperSpeed\nPlaystation Licensed",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Auriculares inalámbricos para gaming\nmultiplataforma con tecnología háptica",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))


                                    Text(
                                        text = "Desde\n167,99 €",
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
                                        text = "Razer Kishi for Android (Xbox)",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Mando universal para juegos Android",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(50.dp))


                                    Text(
                                        text = "Desde\n54,99 €",
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
                                        text = "Razer Tomahawk Mini-ITX",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Chasis mini-ITX para juegos con Razer\nChroma RGB",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n131,99 €",
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

                        6 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Razer Iskur - Negro",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Silla para gamers con soporte lumbar\nintegrado",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n384,99 €",
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

                        7 -> {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "Razer Iskur - Negro / Verde - XL",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            color = Color.White
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )
                                    Spacer(modifier = Modifier.height(9.dp))

                                    Text(
                                        text = "Silla para gamers con soporte lumbar\nintegrado",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            color = Color.Gray
                                        ),
                                        modifier = Modifier.padding(bottom = 9.dp)
                                    )

                                    Spacer(modifier = Modifier.height(30.dp))


                                    Text(
                                        text = "Desde\n454,99 €",
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

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselCardDoble() {
    val pagerState = rememberPagerState(initialPage = 0)
    val sliderList = listOf(
        "https://i.ibb.co/M5pVkJ8/descarga-11.png",
        "https://i.ibb.co/fSQtyFH/descarga-12.png"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = sliderList.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 65.dp),
            modifier = Modifier.height(300.dp)
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
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp), // Añade padding en la parte superior
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = if (page == 0) "RazerStore Rewards" else "PROGRAMAS DE COMPRA",
                            style = TextStyle(fontSize = 20.sp, color = Color.White),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(bottom = 9.dp)
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(sliderList[page])
                                .crossfade(true)
                                .scale(Scale.FILL)
                                .build(),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .defaultMinSize(minHeight = 1.dp)
                                .fillMaxHeight()
                                .size(200.dp)
                                .clickable {},
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cabecera(navigateTo: (Screen) -> Unit) {

    val options = listOf(
        "Tienda" to Screen.Tienda,
        "PC" to Screen.PC,
        "Consola" to Screen.Consola,
        "Móvil" to Screen.Movil,
        "Estilo de vida" to Screen.EstiloDeVida,
        "Servicios" to Screen.Servicios,
        "Comunidad" to Screen.Comunidad,
        "Asistencia" to Screen.Asistencia
    )

    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(options[0].first) }

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
                    visible = expanded,
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

                        options.forEach { (optionText, screen) ->
                            DropdownMenuItem(
                                text = { Text(optionText, color = Color.White) },
                                onClick = {
                                    selectedText = optionText
                                    expanded = false
                                    navigateTo(screen)
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

@Composable
fun Foot() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "Razer Logo",
                modifier = Modifier
                    .size(128.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "Equipos y\nrecompensas\nexclusivas Razer",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Accede a equipos Razer de edición\nlimitada que solo están disponibles en\nRazer.com",
                color = Color.Gray,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Section(title = "Comprar", content = "Texto1")
            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Section(title = "Explorar", content = "Texto2")
            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Section(title = "Asistencia", content = "Texto3")
            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Section(title = "Empresa", content = "Texto4")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Copyright @ 2024 Razer inc. All Rights Reserved\nTérminos Legales | Políticas de Privacidad\nConfiguración de Cookies",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))

            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Spain (España) Cambiar Ubicación",
                color = Color.Gray,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "FOR GAMERS. BY GAMERS.",
                color = Color.Green,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Section(title: String, content: String) {
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable(onClick = { expanded = !expanded }),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp
            )
            Icon(
                imageVector = if (expanded) Icons.Default.Add else Icons.Default.Add,
                contentDescription = if (expanded) "Collapse" else "Expand",
                tint = Color.White
            )
        }
        if (expanded) {
            Text(
                text = content,
                color = Color.Gray,
                fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}





