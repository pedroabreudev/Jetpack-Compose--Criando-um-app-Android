package br.com.pedroabreudev.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ChallengePreview() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .width(100.dp)
                .fillMaxHeight()
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Test 1",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFededed))
                    .padding(16.dp)
            )
            Text(
                text = "Test 2",
                modifier = Modifier.padding(16.dp)
            )
        }
    }

}