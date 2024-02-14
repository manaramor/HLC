package com.example.examen_manuelaragonmora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen_manuelaragonmora.data.Asignatura
import com.example.examen_manuelaragonmora.data.DataSource
import com.example.examen_manuelaragonmora.ui.theme.Examen_ManuelAragonMoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Examen_ManuelAragonMoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExamenApp()
                }
            }
        }
    }
}

@Composable
fun ExamenApp(modifier: Modifier = Modifier) {
    var mensajeAccion by remember{ mutableStateOf("No has hecho ninguna acción") }
    var mensajeResumen by remember{ mutableStateOf("No hay nada que mostrar (defecto)") }
    var asignatura = Asignatura("",0)
    var listaAsignaturas by remember {mutableStateOf(DataSource.loterias)}


    var horasContratar by remember {mutableStateOf(0)}
    var horasContratarString by remember {mutableStateOf("0")}
    var horasContratadas by remember {mutableStateOf(0)}
    var horasTotales by remember {mutableStateOf(0)}




    Column() {
        Column(
            modifier = modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .height(40.dp)
        ) {
            Text(text = "Bienvenido a la academia de Manuel Aragón", modifier = Modifier
                .padding(10.dp))
        }


        Column(){
            LazyRow(){
                items(listaAsignaturas){ item ->
                    Card(modifier = Modifier.run { padding(10.dp) }){
                        Column(){

                            Text("Asig: " + asignatura.nombre,modifier = modifier
                                .background(Color.Yellow)
                                .fillMaxWidth()
                                .padding(20.dp) )

                            Text("€/hora: " + asignatura.precioHora,modifier = modifier
                                .background(Color.Cyan)
                                .fillMaxWidth()
                                .padding(20.dp))

                            Row(modifier = Modifier.align(CenterHorizontally)) {
                                Button(onClick = {

                                    for (asignatura in listaAsignaturas){
                                        if (asignatura.nombre == "Historia"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Lengua"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Inglés"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Sociales"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Biología"){
                                            horasContratadas + horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Física"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }

                                        if (asignatura.nombre == "Química"){
                                            horasContratadas += horasContratar
                                            mensajeAccion = "Se han añadido " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                        }
                                    }




                                }) {
                                    Text(text = "+")
                                }

                                Button(onClick = {
                                    for (asignatura in listaAsignaturas){
                                    if (asignatura.nombre == "Historia"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Lengua"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Inglés"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Sociales"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Biología"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Física"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }

                                    if (asignatura.nombre == "Química"){
                                        horasContratadas -= horasContratar
                                        mensajeAccion = "Se han eliminado " + horasContratarString + " horas de la asignatura " + asignatura.nombre + " con precio " + asignatura.precioHora
                                    }
                                } }) {
                                    Text(text = "-")
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }

        }


        Column(){
            InputText(value = horasContratarString, onValueChanged = {horasContratarString = it} , texto = "Horas a contratar o eliminar", modifier = Modifier
                .width(400.dp)
                .padding(15.dp)
                .align(CenterHorizontally))
        }

        Column(modifier = Modifier
            .background(Color.Gray)
            .align(CenterHorizontally)){
            Column( modifier = Modifier
                .background(Color.Magenta)) {
                Text(
                    text = "Última acción: " + mensajeAccion
                )
            }

            Column(modifier = Modifier
                .background(Color.White)) {
                    Text(
                        text = "Resumen:" + mensajeResumen, modifier = Modifier
                            .background(Color.White)
                    )
                }
        }

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputText(value: String, onValueChanged: (String) -> Unit, texto: String,modifier: Modifier = Modifier){
    TextField(
        value = value ,
        onValueChange = onValueChanged ,
        label = {Text (text = texto)},
        modifier = modifier.width(180.dp),
        singleLine = true
        )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Examen_ManuelAragonMoraTheme {
        ExamenApp()
    }
}