package com.example.examenmanuelam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examenmanuelam.data.DataSource.productos
import com.example.examenmanuelam.data.Producto
import com.example.examenmanuelam.ui.theme.ExamenManuelAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenManuelAMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FoodApp()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodApp(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier

    ) {
        Box(modifier = Modifier.run {
            background(Color.LightGray)
                .fillMaxWidth()
                .padding(50.dp)
        }
        ) {
            Text(
                text = "Hola, soy Manuel Aragón Mora"
            )
        }


    Column(
        modifier = Modifier

    ) {
        Column(
            modifier = Modifier

        ) {

                TextField(value = "", label = { Text("Nombre") }, onValueChange = {

                })

                TextField(value = "", label = { Text("Precio") }, onValueChange = {

                })

                Row(modifier = Modifier) {
                    AppCard()
                }

        }



        Button(onClick = {  }) {
            Text(
                text = "Add/Update producto"
            )
        }
    }
    Column() {
        Box(modifier = Modifier.run {
            background(Color.LightGray)
                .fillMaxWidth()
                .padding(bottom = 50.dp)
                .align(alignment = Alignment.CenterHorizontally)
        }) {
            Text(
                text = "Todavía no se ha añadido ningún valor"
            )
        }
    }
}
}





@Composable
fun AppCard() {
    ExamenManuelAMTheme {
        Card(modifier = Modifier

        ){
            Box(modifier = Modifier
                .background(Color.Yellow)
                .padding(20.dp)
            ) {
                Text(
                    text = "Nombre:"
                )
            }

            Box(modifier = Modifier
                .background(Color.Cyan)
                .padding(20.dp)
            ){
                Text (
                    text = "Precio:"
                )
            }

        }
    }
}

@Composable
fun AppList(modifier: Modifier = Modifier) {
    ExamenManuelAMTheme {
        LazyColumn(
            modifier = Modifier

        ) {
            items(productos) { producto ->
                AppCard()
            }
        }
    }
}
