package com.example.ejercicio4.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyScreen(modifier: Modifier=Modifier) {
    var nombre by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }
    var pais by remember { mutableStateOf("") }

    var nombreActualizado by remember { mutableStateOf("")}
    var emailActualizado by remember { mutableStateOf("") }
    var direccionActualizado by remember { mutableStateOf("") }
    var paisActualizado by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column (modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxWidth().background(Color(0,20,39)).height(100.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "Screen",
                    fontSize = 36.sp,
                    color = Color.White)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .background(Color.LightGray).padding(10.dp), horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                repeat(15) {
                    Box(
                        modifier = Modifier
                            .size(65.dp) // Tamaño del círculo
                            .clip(CircleShape) // Recorte con forma de círculo
                            .background(Color(0xFF56494e)) // Color de fondo
                    )
                }
            }
            Row (modifier = Modifier.height(240.dp)) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().padding(20.dp).clip(
                    RoundedCornerShape(15.dp)
                ).background(Color(0xFF489fb5)))
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                        .padding(top=8.dp, end=16.dp)

                ) {
                    Text(
                        "Lorem ipsum dolor sit amet consectetur adipiscing elit sollicitudin, " +
                                "nunc magnis ac duis aenean vehicula parturient cum sed, " +
                                "class interdum proin quam morbi lobortis fusce. " +
                                "Litora praesent molestie bibendum maecenas eros condimentum vestibulum, " +
                                "leo feugiat ultrices vel lacus venenatis, metus arcu parturient suscipit rutrum et. " +
                                "Blandit vulputate dignissim neque hac faucibus dapibus non parturient commodo natoque, " +
                                "viverra nunc id molestie risus mollis porta mattis purus, " +
                                "turpis et habitant condimentum dis tempus donec felis suspendisse." +
                                "\n\n" +
                                "Himenaeos nostra potenti mus semper sagittis nunc pulvinar, " +
                                "blandit nam conubia quis ligula commodo vulputate, " +
                                "turpis inceptos per fringilla erat malesuada. " +
                                "Mus aptent luctus enim dignissim bibendum fringilla lobortis senectus fames, " +
                                "dapibus proin a donec consequat volutpat non nam odio, " +
                                "eu curae venenatis nec commodo habitasse risus vehicula. " +
                                "Fermentum semper mollis nisi congue curae commodo convallis, " +
                                "habitasse mus ante aliquam rhoncus vel, " +
                                "fringilla quis ut cum nunc dapibus."
                    )
                }
            }
            Box(modifier = Modifier.fillMaxWidth().height(80.dp),
                contentAlignment = Alignment.Center) {
                Text(text = "Formulario",
                    fontSize = 36.sp)
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextField(modifier = Modifier.weight(1f),
                        value = nombre,
                        onValueChange = {nombre = it},
                        label = {Text("Nombre")
                        }
                    )
                    Text(modifier = Modifier.weight(1f),text = nombreActualizado, textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextField(modifier = Modifier.weight(1f),
                        value = email,
                        onValueChange = {email = it},
                        label = {Text("Email")}
                    )
                    Text(modifier = Modifier.weight(1f), text= emailActualizado, textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextField(modifier = Modifier.weight(1f),
                        value = direccion,
                        onValueChange = {direccion = it},
                        label = {Text("Dirección")}
                    )
                    Text(modifier = Modifier.weight(1f), text= direccionActualizado, textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextField(modifier = Modifier.weight(1f),
                        value = pais,
                        onValueChange = {pais = it},
                        label = {Text("País")}
                    )
                    Text(modifier = Modifier.weight(1f), text= paisActualizado, textAlign = TextAlign.Center)
                }
            }
            Button(
                onClick = {
                    nombreActualizado = nombre
                    emailActualizado = email
                    direccionActualizado = direccion
                    paisActualizado = pais
                },
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(top= 10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(102,80,164)
                )
            ) {
                Text("Actualizar")
            }
        }
    }
}