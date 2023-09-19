package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2.ui.theme.Assignment2Theme

class ChallengesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Challenges(challengesList())
                }
            }
        }
    }
}

@Composable
fun Challenges(challenges : List<String>, modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier.padding(24.dp).background(color = Color.Black)){
        items(challenges){
            ChallengeText(it)
        }
    }
}

@Composable
fun ChallengeText(str : String, modifier : Modifier = Modifier){
    Text(
        color = Color.White,
        text = str
    )
}

fun challengesList() : List<String>{
    return listOf("Challenges:", "Device Fragmentation", "OS Fragmentation", "Unstable and Dynamic Environment", "Rapid Changes",
        "Tool Support", "Low Tolerance By Users", "Low Security and Privacy Awareness")
}

@Preview(showBackground = true)
@Composable
fun Activity2Preview() {
    Assignment2Theme {
        Challenges(challengesList())
    }
}