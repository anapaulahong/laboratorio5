package com.example.laboratory5

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory5.ui.theme.Laboratory5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
            Button(onClick = {
                val navigate = Intent(this@MainActivity, CampusCentral::class.java)
                startActivity(navigate)
            }) {
                Text(text = "Campus central", fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                val navigate = Intent(this@MainActivity, Perfil::class.java)
                startActivity(navigate)
            }) {
                Text(text = "Perfil", fontSize = 18.sp)
            }


             }

        }
    }
}

