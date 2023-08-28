package com.example.laboratory5

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory5.ui.theme.Laboratory5Theme

class CampusCentral : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Laboratory5Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background){
                    Campus(name = "", cornerRadius = 5.dp)
                }
            }
        }
    }



@Composable
fun Campus(name: String, modifier: Modifier = Modifier, cornerRadius: Dp) {
    Column{
        Text(
            text = "Campus Central",
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .padding(30.dp)
        )
    }
    Image(
        painter = painterResource(id = R.drawable.campus),
        contentDescription = "fotita campus uvg",
        modifier = modifier
            .width(450.dp)
            .height(360.dp)
    )
    Text(
        text = "DESTACADOS",
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(start = 23.dp, top = 320.dp) //start: de izq a derecha, top: de arriba a abajo
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ingresocitt),
            contentDescription = "personas entrando por el cit xd",
            modifier = modifier
                .size(215.dp)
                .padding(20.dp)
                .offset(y = 310.dp) //bajar la imagen
        )
    }
    Text(
        "Service Now                          ",
        color = Color.White,
        style = TextStyle(fontSize = 13.sp),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .offset(x = 22.dp, y = 442.dp)
            .drawBehind {
                drawRoundRect(
                    Color(0xFF2E8B57),
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
            .padding(6.dp)
    )

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.clasecit),
            contentDescription = "cit",
            modifier = modifier
                .size(220.dp)
                .padding(22.dp)
                .offset(x = 175.dp, y = 308.dp)
        )
    }
    Text(
        "Actualidad UVG                     ",
        color = Color.White,
        style = TextStyle(fontSize = 13.sp),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .offset(x = 199.dp, y = 442.dp)
            .drawBehind {
                drawRoundRect(
                    Color(0xFF818589),
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
            .padding(6.dp)
    )

    Text(
        text = "SERVICIOS Y RECURSOS",
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(start = 25.dp, top = 500.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.biblio),
            contentDescription = null,
            modifier = modifier
                .size(215.dp)
                .padding(20.dp)
                .offset(y = 490.dp) //bajar la imagen
        )
    }
    Text(
        "Directorio de servicios         \n" +
                "estudiantiles",
        color = Color.White,
        style = TextStyle(fontSize = 13.sp),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .offset(x = 23.dp, y = 610.dp)
            .drawBehind {
                drawRoundRect(
                    Color(0xFF2E8B57),
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
            .padding(6.dp)
    )

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.portalbiblio),
            contentDescription = null,
            modifier = modifier
                .size(220.dp)
                .padding(22.dp)
                .offset(x = 175.dp, y = 488.dp)
        )
    }
    Text(
        "Portal Web Bibliotecas UVG",
        color = Color.White,
        style = TextStyle(fontSize = 13.sp),
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .offset(x = 199.dp, y = 620.dp)
            .drawBehind {
                drawRoundRect(
                    Color(0xFF818589),
                    cornerRadius = CornerRadius(8.dp.toPx())
                )
            }
            .padding(6.dp)
    )

}

    @Preview(showBackground = true)
    @Composable
    fun CampusPreview() {
        Laboratory5Theme {
            Campus("Campus central", cornerRadius = 16.dp)

        }
}}