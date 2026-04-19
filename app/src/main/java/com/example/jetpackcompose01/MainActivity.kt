package com.example.jetpackcompose01

import android.R
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose01.ui.theme.JetpackCompose01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ejemplos(){
    //Ejemplo1(nombre="Jeremy");
    //Ejemplo2();
    Ejercicio();
}

@Composable
fun Ejercicio(){
    //lista de catalogo
    var productos = listOf<String>("Teclado", "Mouse", "Monitor", "Auriculares", "Impresora");
    var precios = listOf<String>("60.0", "50.0", "250.0", "80.0", "750.0");
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        //titulo
        Box(modifier = Modifier.padding(4.dp)){
        Text("CATALOGO", color=Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold);
        }
        //tamaño de array
        var sizeProductos:Int = productos.size;
        //for
        for(i in 1..sizeProductos){
            Box(modifier=Modifier.fillMaxWidth().padding(4.dp).background(Color(
                232,
                229,
                232
            ))){
                //columnna
                Column(modifier = Modifier.padding(5.dp)) {
                    Text(productos[i-1], fontSize = 18.sp, fontWeight = FontWeight.Bold);
                    Text("S/. ${precios[i-1]}");
                }
            }
        }
    }
}

//Funcion para listar un conjunto de ciudades (lista)
@Composable
fun Ejemplo2(){
    //Declaramos una lista de ciudades
    var ciudades = listOf<String>("Lima", "Arequipa", "Piura", "Chiclayo", "Tacna", "Cuzco", "Cajamarca");
    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        Text("Listado de Ciudades",
            color=Color.Blue,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold);
        for(ciudad in ciudades){
            Box(modifier = Modifier.fillMaxWidth().padding(4.dp).background(Color(30, 30, 30))){
                Text(ciudad, color=Color(255,255,255),
                    fontSize = 20.sp);
            }
        }
        Spacer(modifier = Modifier.height(10.dp));
        Text("Listado Ciudades 2", color=Color.Cyan, fontSize = 24.sp, fontWeight = FontWeight.Bold);
        //Recorremos la lista de ciudades por posicion desde 1 hasta la cantidad de elementos
        var cant_ciudades:Int = ciudades.size;
        for(i in 1..cant_ciudades){
            //Text("$i, " + ciudades[i-1], color = Color.White);
            Box(modifier = Modifier.fillMaxWidth().padding(4.dp).background(Color(40, 40, 40))){
                Text("$i, ${ciudades[i-1]}", color=Color.White);
            }
        }
    }
}

@Composable
fun Ejemplo1(nombre:String) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black),
        contentAlignment = Alignment.Center) {
        Column() {
            Text("Bienvenido \n$nombre a Jetpack Compose",
                color=Color.Blue,
                fontSize = 24.sp);
            Spacer(modifier = Modifier.height(24.dp));
            Text("Aplicaciones Móviles para Android", color=Color.Yellow,
                fontSize = 24.sp )}
    }
}