package com.example.actividadestarea.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun GridOfColumns() {
    Column(
        modifier = Modifier
            .height(520.dp)
            .width(320.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF1C3B53))
                    .padding(20.dp)
                    .weight(3f)
                    .fillMaxSize()
            )

        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF7DD592))
                    .weight(3f)
                    .fillMaxSize()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.5f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF1C3B53))
                    .padding(20.dp)
                    .weight(3f)
                    .fillMaxSize()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1.5f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF1C3B53))
                    .padding(32.dp)
                    .weight(1f)
                    .height(500.dp)
            )
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF3D89FC))
                    .padding(32.dp)
                    .weight(1f)
                    .height(500.dp)
            )
            Box(
                modifier = Modifier
                    .border(10.dp, Color(0xFFFFFFFF))
                    .background(Color(0xFF1C3B53))
                    .padding(32.dp)
                    .weight(1f)
                    .height(500.dp)
            )
            
        }
    }
}