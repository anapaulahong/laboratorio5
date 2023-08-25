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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory5.ui.theme.Laboratory5Theme

class Configuracion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory5Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White){
                    Configuracionn(name = "")
                }
            }
        }
    }

    @Composable
    fun Configuracionn(name: String, modifier: Modifier = Modifier) {
        Column{
            Text(
                text = "Settings",
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
            text = "Edit Profile",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 80.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito8),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 75.dp)
            )
        }

        Text(
            text = "Email Addresses",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 140.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito9),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 135.dp)
            )
        }

        Text(
            text = "Notifications",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 200.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito10),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 193.dp)
            )
        }

        Text(
            text = "Privacy",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 260.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito11),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 255.dp)
            )
        }

        Text(
            text = "Help & Feedback",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 330.dp) //start: de izq a derecha, top: de arriba a abajo
        )
        Text(
            text = "Troubleshooting tips and guides",
            color = Color.DarkGray,
            style = TextStyle(fontSize = 15.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 353.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito12),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 330.dp)
            )
        }

        Text(
            text = "About",
            color = Color.Black,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 400.dp) //start: de izq a derecha, top: de arriba a abajo
        )
        Text(
            text = "App information and documents",
            color = Color.DarkGray,
            style = TextStyle(fontSize = 15.sp),
            modifier = modifier
                .padding(start = 55.dp, top = 423.dp)
        )
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconito13),
                contentDescription = null,
                modifier = modifier
                    .size(40.dp)
                    .offset(x = 10.dp, y = 400.dp)
            )
        }

        Text(
            text = "Logout",
            color = Color.Red,
            style = TextStyle(fontSize = 19.sp),
            modifier = modifier
                .padding(start = 170.dp, top = 480.dp) //start: de izq a derecha, top: de arriba a abajo
        )


    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Laboratory5Theme {
            Configuracionn("Campus central")

        }
    }}