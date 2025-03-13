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
fun FourthScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(y = (-20).dp),  // Đẩy toàn bộ nội dung lên trên 20dp
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 🖼️ Ảnh chiếm toàn bộ chiều ngang, chiều cao = 3/4 chiều ngang
        Image(
            painter = painterResource(id = R.drawable.logo4),  // Thay bằng ảnh thích hợp
            contentDescription = "UTH Logo",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)  // Chiều cao bằng 3/4 chiều ngang
                .offset(y = (-10).dp)  // Đẩy ảnh lên trên 10dp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 📝 Tiêu đề
        Text(
            text = "Smart Task Scheduling",
            fontSize = 26.sp,  // To hơn 2 cỡ so với đoạn mô tả
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 📝 Nội dung mô tả
        Text(
            text = "Plan your tasks effectively and efficiently " +
                    "to ensure a better workflow and increased " +
                    "productivity every day.",
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
                onClick = { navController.popBackStack() },  // Quay lại màn trước
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Back", color = Color.White)
            }

            // ➡️ Nút "Next" (chuyển tiếp, nếu có màn tiếp theo)
            Button(
                onClick = { /* Điều hướng đến màn hình tiếp theo nếu có */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                Text(text = "Next", color = Color.White)
            }
        }
    }
}
