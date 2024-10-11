package com.example.ejercicio2.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(text: String, color: Color, modifier: Modifier = Modifier)
{
    var shape by remember { mutableStateOf(RoundedCornerShape(20.dp)) }
    var border by remember { mutableStateOf(BorderStroke(1.dp, Color.Black)) }
    var buttonText by remember { mutableStateOf("Pulsa aquí") }
    var buttonColor by remember { mutableStateOf(Color.DarkGray) }
    var textColor by remember { mutableStateOf(Color.White) }
    Button(
        onClick = {
            shape = RoundedCornerShape(4.dp)
            border = BorderStroke(3.dp, Color.Black)
            buttonText = text
            buttonColor = color
            textColor = Color.Black
        },
        modifier = modifier,
        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        )
    ) {
        Text(
            text = buttonText,
            color = textColor
        )
    }
}