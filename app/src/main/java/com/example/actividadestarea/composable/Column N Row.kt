package com.example.actividadestarea.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun GridOfNumbers() {
    Column(
        modifier = Modifier
            .height(320.dp)
            .width(320.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "E1",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF4C582C))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E2",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF81886F))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E3",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFC08C40))
                    .padding(32.dp)
                    .weight(2f)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "E4",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFB36641))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E5",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFAD7070))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E6",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFBEABAB))
                    .padding(32.dp)
                    .weight(2f)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "E6",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF328A7C))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E7",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF72A8AA))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "E6",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF9AC5C1))
                    .padding(32.dp)
                    .weight(2f)
            )
        }
    }
}
