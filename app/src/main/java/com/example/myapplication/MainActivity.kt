package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.*
import com.example.myapplication.ui.SplashScreen
import com.example.myapplication.ui.WelcomeScreen
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.ThirdScreen
import com.example.myapplication.ui.FourthScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("welcome") { WelcomeScreen(navController) }
        composable("thirdScreen") {ThirdScreen(navController)}
        composable("fourthScreen") { FourthScreen(navController) }
    }
}
