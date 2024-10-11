package com.example.ejercicio3.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyLogin (modifier: Modifier = Modifier) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var text by remember { mutableStateOf("") }
    var color by remember { mutableStateOf(Color.Unspecified) }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(
                value = username,
                onValueChange = {username = it},
                label = { Text("Usuario") }
            )
            Spacer(Modifier.height(50.dp))
            TextField(
                value = password,
                onValueChange = {password = it},
                label = {Text("Contraseña")}
            )
            Spacer(Modifier.height(10.dp))
            Text(text = text, color = color)
            Spacer(Modifier.height(10.dp))
            Button(
                onClick = {
                    if(username == "admin" && password == "1234") {
                        color = Color.Green
                        text = "Usuario correcto"
                    }
                    else {
                        color = Color.Red
                        text = "Usuario incorrecto"
                    }
                }
            ) {
                Text("Acceder")
            }
        }
    }
}
