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
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(y = (-20).dp),  // Đẩy toàn bộ nội dung lên trên 20dp
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 🖼️ Hình ảnh
        Image(
            painter = painterResource(id = R.drawable.logo2),
            contentDescription = "Welcome Logo",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)  // Tỷ lệ ảnh 4:3
                .offset(y = (-10).dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 📝 Tiêu đề
        Text(
            text = "Easy Time Management",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 📝 Mô tả
        Text(
            text = "With management based on priority and " +
                    "daily tasks, it will give you convenience in " +
                    "managing and determining the tasks that " +
                    "must be done first.",
            fontSize = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 🛠 Hàng chứa nút điều hướng
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = { navController.navigate("thirdScreen") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Next", color = Color.White)
            }
        }
    }
}
