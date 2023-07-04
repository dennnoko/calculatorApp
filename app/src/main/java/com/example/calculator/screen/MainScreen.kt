package com.example.calculator.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        CalcPreview(num = 0)

        Column(
             verticalArrangement = Arrangement.Bottom,
             modifier = Modifier
                 .fillMaxSize()
        ) {
            Keybord()
        }
    }
}


//計算表示
@Composable
fun CalcPreview(num: Int) {
    Text(
        text = num.toString(),
        fontSize = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Right,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )
}
