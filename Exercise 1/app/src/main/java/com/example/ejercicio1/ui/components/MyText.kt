package com.example.ejercicio1.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun MyText(name: String, color: Color, fontSize: TextUnit, modifier: Modifier = Modifier)
{
    Text(
        text = name,
        color = color,
        fontSize = fontSize,
        modifier = modifier
    )
}