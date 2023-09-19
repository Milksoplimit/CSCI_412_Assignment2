package com.example.assignment2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Name()
                        ActionButton()
                    }
                }
            }
        }
    }
}

@Composable
fun Name(){
    Text(
        text = "Gregory Beauclair\nID: 1035554",
        color = Color.White
    )
}

@Composable
fun ActionButton() {
    val context : Context = LocalContext.current
    Button(
        onClick = { onClick(context) },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "Challenges"
        )
    }
}

fun onClick(applicationContext : Context) : Unit {
        applicationContext.startActivity(Intent(applicationContext, ChallengesActivity::class.java))
}


@Preview(showBackground = true)
@Composable
fun Preview(){
    Assignment2Theme {
        Surface(
            color = Color.Black
        ) {
            Column(modifier = Modifier.padding(24.dp)) {
                Name()
                ActionButton()
            }
        }
    }
}
