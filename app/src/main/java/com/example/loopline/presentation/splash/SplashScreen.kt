package com.example.loopline.presentation.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loopline.R

@Composable
fun SplashScreen(
  navController: NavController
) {
  val scale = remember {
    Animatable(0f)
  }
  val overshootInterpolator = remember {
    OvershootInterpolator(2f)
  }
  LaunchedEffect(key1 = true) {
    scale.animateTo(
      0.8f,
      animationSpec = tween(
        durationMillis = 2000,
        easing = {
          overshootInterpolator.getInterpolation(it)
        }
      )
    )
  }
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(
      modifier = Modifier.scale(scale.value),
      text = "LoopLine",
      fontFamily = FontFamily(Font(R.font.cinzel_decorative_bold)),
      fontSize = 72.sp
    )
    Image(
      modifier = Modifier.scale(scale.value),
      painter = painterResource(id = R.drawable.splash_icon),
      contentDescription = "Splash Icon for the application"
    )
  }
}