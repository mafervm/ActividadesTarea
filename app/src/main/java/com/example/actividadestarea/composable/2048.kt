package com.example.actividadestarea.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .height(320.dp)
            .width(320.dp)
            .background(Color(0xFFBAAC9F))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "16",
                color = Color.White,
                fontSize = 14.sp,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF48D62))
                    .padding(32.dp)
                    .weight(2f)
                    .fillMaxSize()
            )
            Text(
                text = "  ",
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFCCC0B3))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "  ",
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFCCC0B3))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "4",
                fontSize = 14.sp,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFECDFC7))
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
                text = "128",
                fontSize = 9.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFECCE72))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "16",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF49463))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "  ",
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFCCC0B3))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "  ",
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFCCC0B3))
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
                text = "32",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF57C5F))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "64",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF55E3B))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "2",
                fontSize = 14.sp,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFEDE3D9))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "  ",
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFCCC0B3))
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
                text = "16",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF49463))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "8",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF1B079))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "8",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFF1B079))
                    .padding(32.dp)
                    .weight(2f)
            )
            Text(
                text = "2",
                fontSize = 14.sp,
                modifier = Modifier
                    .border(10.dp, Color(0xFFBAAC9F))
                    .background(Color(0xFFEDE3D9))
                    .padding(32.dp)
                    .weight(2f)
            )
        }
    }
}

