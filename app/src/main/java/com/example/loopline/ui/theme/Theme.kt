package com.example.loopline.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
  background = DarkBackground,
  onBackground = WhiteText,
  primary = PrimaryColor,
  onPrimary = WhiteText,
  secondary = SecondaryColor,
  tertiary = TertiaryColor,
  surface = ContainerColor,
  onSurface = GreyText,
  surfaceTint = TextFieldColor,
  outline = BlackText,
  scrim = CommentContainer,
)

@Composable
fun LoopLineTheme(
  content: @Composable () -> Unit
) {
  MaterialTheme(
    colorScheme = DarkColorScheme,
    typography = Typography,
    content = content
  )
}
