package com.example.loopline.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loopline.presentation.splash.SplashScreen

@Composable
fun Navigation() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = Screen.SplashScreen.route
  )
  {
    composable(Screen.SplashScreen.route) {
      SplashScreen(navController = navController)
    }
  }
}