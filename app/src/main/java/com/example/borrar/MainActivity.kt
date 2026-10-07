package com.example.borrar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.borrar.ui.theme.BorrarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BorrarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()){
        Text(
            text = "Hello $name!",
            fontSize = 32.sp,
            modifier = modifier
        )
        Text(
            text = "genesis",
            fontSize = 32.sp,
            modifier = modifier
        )
        Text(
            text = "como $name!",
            fontSize = 32.sp,
            modifier = modifier
        )
        Text(
            text = "estas",
            fontSize = 32.sp,
            modifier = modifier
        )
        Text(
            text = "tuuu",
            fontSize = 32.sp,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BorrarTheme {
        Greeting("Android")
    }
}