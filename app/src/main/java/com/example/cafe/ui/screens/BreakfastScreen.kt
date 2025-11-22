package com.example.cafe.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cafe.ui.components.BreakfastItem
import com.example.cafe.R


@Composable
fun BreakfastScreen() {
    Surface(
        color = Color(0xFFF8F3EC),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxSize()
        ) {
            Text(
                text = "Menu",
                style = MaterialTheme.typography.headlineMedium.copy(fontSize = 32.sp),
                color = Color(0xFF333333)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Breakfast",
                style = MaterialTheme.typography.headlineSmall.copy(fontSize = 26.sp),
                color = Color(0xFF333333)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BreakfastItem(
                    title = "Avocado Toast",
                    imageRes = R.drawable.coffee_cup
                )

                BreakfastItem(
                    title = "Classic Breakfast",
                    imageRes = R.drawable.breakfast_avocado
                )
            }
        }
    }
}