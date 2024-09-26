package com.example.valuuttamuuntimen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
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
import com.example.valuuttamuuntimen.Header

@Composable
fun Converter() {
    var inputValue by remember { mutableStateOf("") }
    var resultValue by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.fillMaxSize().padding().background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Header("Converter", modifier = Modifier.weight(0.25f))
        Spacer(modifier = Modifier.height(25.dp))
        Surface(
            modifier = Modifier.fillMaxWidth().
            padding(10.dp).
            background(color = Color.White).
            weight(0.8f)
        )
        {
            Column(modifier = Modifier.fillMaxHeight().
            padding(15.dp),
                horizontalAlignment= Alignment.CenterHorizontally)
            {
                TextField(value = inputValue,
                    onValueChange = {inputValue = it},
                    label = { Text("Input") })
                Button(
                    onClick = {
                        val input = inputValue.toDoubleOrNull() ?: 0.0
                        val result = input * 1.2
                        resultValue = "%.2f € = %.2f $".format(input, result)
                    },
                    modifier = Modifier.padding(10.dp).
                    fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text("Convert")
                }
                Spacer( modifier = Modifier.height(25.dp))
                Text(text = "Converted: $resultValue")

            }
        }
    }
}
