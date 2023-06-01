package com.example.calculadoradegastos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoradegastos.ui.theme.CalculadoradegastosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoradegastosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   CalculadoraDeGastos()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CalculadoraDeGastos(
) {
    var qtdDiasMes by remember { mutableStateOf("")}
    var qtdViagensDia by remember { mutableStateOf("")}

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {}

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calculadora De Gastos",
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
        TextField(
            value = qtdDiasMes,
            onValueChange = {qtdDiasMes=it},
            label = { Text(text = "dias/mes")}
        )
        TextField(
            value = qtdViagensDia,
            onValueChange = {qtdViagensDia=it},
            label = { Text(text = "viagens/dias")}
        )
    }
}
@Composable
fun Viagens(){
var valorida by remember { mutableStateOf("")}
var valorvolta by remember { mutableStateOf("")}

    Text(
        text = "Viagem 1"
    )
    Row (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            ){
      TextField(
          value = valorida,
          onValueChange = {valorida=it},
          label = Text(text = "valor ida")
      )
        TextField(
            value = valorVolta,
            onValueChange = {valorvolta=it},

        )
   }
}