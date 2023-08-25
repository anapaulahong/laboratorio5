package com.example.laboratory5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory5.ui.theme.Laboratory5Theme

class EmergencyContacts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory5Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White){
                    Emergency(name = "")
                }
            }
        }
    }

    @Composable
    fun Emergency(name: String, modifier: Modifier = Modifier) {
        Column{
            Text(
                text = "Emergency Contacts",
                style = TextStyle(fontSize = 18.sp),
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.TopCenter)
                    .padding(28.dp)
            )
        }
        Image(
            painterResource(id = R.drawable.close__1_),
            contentDescription = null,
            modifier = modifier
                .padding(top = 35.dp, start = 25.dp)
        )


        Text(
            text = "Emergencias",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 80.dp) //start: de izq a derecha, top: de arriba a abajo
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito14),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 75.dp)
            )
        }
        Text(
            text = "Si se presenta un incidente o un percance\n" +
                    "por favor marca el número de emergencia y\n" +
                    "rápidamente te apoyamos.",
            color = Color.DarkGray,
            style = TextStyle(fontSize = 15.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 105.dp)
        )
        Text(
            "         Call 5978-1736                                       ",
            color = Color.White,
            modifier = Modifier
                .offset(x = 15.dp, y = 170.dp)
                .drawBehind {
                    drawRoundRect(
                        Color(0xFF2E8B57),
                        cornerRadius = CornerRadius(7.dp.toPx())
                    )
                }
                .padding(6.dp)
        )

        Text(
            text = "Clínica UVG",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 235.dp) //start: de izq a derecha, top: de arriba a abajo
        )
        Text(
            text = "La clínica UVG presenta los siguientes\n" +
                    "servicios:\n" +
                    "\n" +
                    "○ Atención a emergencias\n" +
                    "○ Atención primaria a enfermedades\n" +
                    "   comunes\n" +
                    "○ Plan educacional sobre enfermedades\n" +
                    "\n" +
                    "Horario de atención: 7:00 a.m. a 8:30 p.m.\n" +
                    "Campus central Edificio F 119-120",
            color = Color.DarkGray,
            style = TextStyle(fontSize = 15.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 263.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.clinicaa),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 8.dp, y = 238.dp)
            )
        }
        Text(
            "         Call 2507-1500 ex 21312                       ",
            color = Color.White,
            modifier = Modifier
                .offset(x = 15.dp, y = 460.dp)
                .drawBehind {
                    drawRoundRect(
                        Color(0xFF2E8B57),
                        cornerRadius = CornerRadius(7.dp.toPx())
                    )
                }
                .padding(6.dp)
        )


    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Laboratory5Theme {
            Emergency("Campus central")

        }
    }}