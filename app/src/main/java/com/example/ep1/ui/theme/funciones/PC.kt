package com.example.ep1.ui.theme.funciones

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ep1.R


@Composable
fun TopBar() {
    var showSections by remember { mutableStateOf(false) }

    Column {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            color = Color.Black
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .clickable(onClick = {

                            showSections = !showSections
                        })
                ) {
                    Text(
                        text = "PC",
                        color = Color.White,
                        fontSize = 18.sp,
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Drop Down Icon",
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        if (showSections) {
            SectionList()
        }
    }
}


@Composable
fun SectionList() {
    val sections = listOf(
        "Ordenadores portátiles",
        "Equipos de sobremesa y componentes",
        "Zona de Juego",
        "Ratones",
        "Alfombrillas",
        "Teclados",
        "Auriculares",
        "Altavoces",
        "Creación de contenido",
        "Productividad",
        "Sillas",
        "Software",
        "Mas informacion"
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        sections.forEach { section ->
            SectionItem(title = section, onClick = { /* Acción al hacer clic en la sección */ })
            Divider(color = Color.Gray, thickness = 1.dp)
        }
    }
}


@Composable
fun SectionItem(title: String, onClick: () -> Unit) {
    Text(
        text = title,
        color = Color.White,
        fontSize = 16.sp,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .clickable(onClick = onClick)
    )
}

@Composable
fun ScrollableBoxScreen() {
    val scrollState = rememberScrollState()
    val descriptions = listOf(
        "ORDENADORES PORTÁTILES",
        "EQUIPOS DE SOBREMESA Y COMPONENTES",
        "ZONA DE JUEGO",
        "ACCESORIOS",
        "RATONES",
        "ALFOMBRILLAS DE RATÓN",
        "TECLADOS",
        "AURICULARES",
        "ALTAVOCES",
        "SILLAS"
    )
    val additionalDetails = listOf(
        "Portátiles gaming elegantes y de alto rendimiento",
        "Diseñados para entusiastas y para ofrecer un rendimiento alto",
        "Ahora el Razer Chroma RGB no se limita solo a tu PC gracias a nuestras bombillas, tiras de luces y lámparas",
        "Creamos la experiencia de juego perfecta",
        "Precisión a nivel de píxel para todo tipo de tamaños de mano y estilos de agarre",
        "Diseños suave, duro e híbrido para mejorar tu control",
        "Ópticos, mecánicos y todos los estilos intermedios",
        "Excelentes para jugar, para el día a día o para una combinación perfecta de ambos",
        "Prepara el escenario de sonido para una inmersión completa",
        "En busca de la perfección en comodidad y soporte"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
            .background(Color.DarkGray)
    ) {
        CustomBox(
            title = "PORTÁTILES Y EQUIPOS DE SOBREMESA",
            description = "Los sistemas Razer están diseñados especialmente para ofrecer el rendimiento definitivo en los juegos y el trabajo. Disfruta de una potencia propia de equipos de sobremesa en un formato móvil con nuestros portátiles gaming y para productividad o apuesta fuerte y construye tu estación de combate con tecnología aRGB Chroma más potente."
        )
        Spacer(modifier = Modifier.height(16.dp))

        descriptions.forEachIndexed { index, description ->
            BoxWithContent(
                imageResId = when (index) {
                    0 -> R.drawable.portatil1
                    1 -> R.drawable.portatil2
                    2 -> R.drawable.portatil3
                    3 -> R.drawable.portatil4
                    4 -> R.drawable.portatil5
                    5 -> R.drawable.portatil6
                    6 -> R.drawable.portatil7
                    7 -> R.drawable.portatil8
                    8 -> R.drawable.portatil9
                    9 -> R.drawable.portatil10
                    else -> R.drawable.portatil1
                },
                description = description,
                additionalDetails = additionalDetails[index]
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        // Agregar una imagen grande con una descripción en el medio
        ImageWithDescription(
            imageResId = R.drawable.portatil1, // Reemplaza con tu recurso de imagen grande
            description = "COMPLETA TU CONFIGURACIÓN"
        )

        CustomBox(
            title = "CONTENT CREATION & STREAMING",
            description = "Tanto si estás abriéndote camino como si quieres estar entre los más vistos, tenemos accesorios para todo tipo de streamers, para que siempre disfrutes de la calidad y la claridad que necesitas para mantener a tu público involucrado y entretenido."
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Agregar las tres nuevas cajas con imágenes y descripciones
        val newDescriptions = listOf(
            "CÁMARAS WEB",
            "MICRÓFONOS",
            "TARJETAS DE CAPTURA Y OTROS"
        )
        val newAdditionalDetails = listOf(
            "Fidelidad visual impresionante para el streaming y la productividad",
            "Diseñado para una captación de voz ultranítida",
            "Para una ventaja profesional en el streaming"
        )
        newDescriptions.forEachIndexed { index, description ->
            BoxWithContent(
                imageResId = when (index) {
                    0 -> R.drawable.creation1
                    1 -> R.drawable.creation2
                    2 -> R.drawable.creation3
                    else -> R.drawable.portatil1 // Imagen predeterminada en caso de error
                },
                description = description,
                additionalDetails = newAdditionalDetails[index]
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        // Agregar la nueva caja con título y descripción
        CustomBox(
            title = "SOFTWARE",
            description = "Las plataformas de software de Razer, que proporcionan una experiencia de juego óptima a más de 100 millones de usuarios, están diseñadas para mejorar el rendimiento de nuestro equipo y de tu PC, con distribuciones asignadas, efectos Chroma personalizados, optimizaciones de juego, audio inmersivo y mucho más."
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Agregar siete nuevas cajas con imágenes y descripciones diferentes
        val additionalDescriptions = listOf(
            "RAZER AXON",
            "RAZER CHROMA™ RGB",
            "RAZER CORTEX",
            "RAZER SYNAPSE",
            "THX Spatial Audio",
            "SONIDO ENVOLVENTE 7.1",
            "APLICACIÓN STREAMER COMPANION"
        )
        val additionalDetailsNew = listOf(
            "Experimenta una personalización RGB total y una mayor inmersión con el ecosistema de iluminación más grande del mundo, compatible con cientos de juegos y miles de dispositivos.",
            "From boosting system performance to discovering gaming deals, enhance your play with one powerful platform.",
            "Maximiza tu ventaja injusta con Razer Synapse 3, la herramienta de configuración de hardware unificada y basada en la nube que lleva tus dispositivos Razer al siguiente nivel.",
            "Disfruta de una personalización total con una aplicación de sonido envolvente que cuenta con una mayor calibración de sonido y perfiles de juego personalizados.",
            "Experimenta una sonido posicional preciso para gozar de una ventaja competitiva.",
            "Ofrece un espectáculo en tus retransmisiones personalizando la manera en que tu Seiren Emote o tu Emote Display reaccionan a tu audiencia.",
            "Ofrece un espectáculo en tus retransmisiones personalizando la manera en que tu Seiren Emote o tu Emote Display reaccionan a tu audiencia."
        )
        additionalDescriptions.forEachIndexed { index, description ->
            BoxWithContent(
                imageResId = when (index) {
                    0 -> R.drawable.software1
                    1 -> R.drawable.software2
                    2 -> R.drawable.software3
                    3 -> R.drawable.software4
                    4 -> R.drawable.software5
                    5 -> R.drawable.software6
                    6 -> R.drawable.software7
                    else -> R.drawable.portatil1 // Imagen predeterminada en caso de error
                },
                description = description,
                additionalDetails = additionalDetailsNew[index]
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun BoxWithContent(imageResId: Int, description: String, additionalDetails: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .height(150.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description,
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = additionalDetails,
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun CustomBox(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            color = Color.Green, // Cambia el color del texto a verde
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description,
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ImageWithDescription(imageResId: Int, description: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp) // Ajusta la altura según tus necesidades
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f))
        )
        Text(
            text = description,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

