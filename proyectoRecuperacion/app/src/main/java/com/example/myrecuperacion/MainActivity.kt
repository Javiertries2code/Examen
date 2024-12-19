package com.example.myrecuperacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myrecuperacion.ui.theme.MyRecuperacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Greeting()
        }
    }


    @Composable
    fun Greeting() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            verticalArrangement = Arrangement.Bottom
        ) {

            Row(
                modifier = Modifier
                    .padding(50.dp)
                    .width(350.dp)
                    .background(Color.Black),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = "Hello Android!",  modifier = Modifier.padding(10.dp)
                    .background(Color.Red))
                Text(text = "Hello Android!",  modifier = Modifier.padding(10.dp)
                    .background(Color.Cyan))
            }
            Row( modifier = Modifier
                .padding(50.dp)
                .width(350.dp)
                .height(80.dp)
                .background(Color.DarkGray),
                verticalAlignment = Alignment.CenterVertically){
                Text(text = "Hello Android!",  modifier = Modifier.padding(10.dp)
                    .background(Color.Red).fillMaxWidth(),
                    textAlign = TextAlign.Center)

            }


        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyRecuperacionTheme {
            Greeting()
        }
    }
}