package com.example.myapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun ThirdScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(y = (-20).dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 🖼️ Ảnh
        Image(
            painter = painterResource(id = R.drawable.logo3),
            contentDescription = "Third Screen Logo",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)
                .offset(y = (-10).dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 📝 Tiêu đề
        Text(
            text = "Increase Work Effectiveness",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 📝 Mô tả
        Text(
            text = "Time management and the determination " +
                    "of more important tasks will give your job " +
                    "statistics better and always improve.",
            fontSize = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 🛠 Hàng chứa nút "Back" và "Next"
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // ⬅️ Nút "Back"
            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Back", color = Color.White)
            }

            // ➡️ Nút "Next"
            Button(
                onClick = { navController.navigate("fourthScreen") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Next", color = Color.White)
            }
        }
    }
}
