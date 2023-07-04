package com.example.calculator.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.composablefun.getScreenWidthInDp

@Preview
@Composable
fun Keybord() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        RowButtons(num1 = "AC", num2 = "+/-", num3 = "%", num4 = "<")
        RowButtons(num1 = "7", num2 = "8", num3 = "9", num4 = "/")
        RowButtons(num1 = "4", num2 = "5", num3 = "6", num4 = "*")
        RowButtons(num1 = "1", num2 = "2", num3 = "3", num4 = "-")
        RowButtons(num1 = "0", num2 = ".", num3 = "=", num4 = "+")
    }
}


@Composable
fun NumButton(num: String) {
    val screenWidthInDp = getScreenWidthInDp()

    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black,
        ),
        shape = RoundedCornerShape(1.dp),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .size(screenWidthInDp/4)
            .padding(2.dp)
    ) {
        Text(
            text = num,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun RowButtons(num1: String, num2: String, num3: String, num4: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        NumButton(num = num1)
        NumButton(num = num2)
        NumButton(num = num3)
        NumButton(num = num4)
    }
}