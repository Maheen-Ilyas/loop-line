package com.example.loopline.presentation.util

sealed class Screen(val route: String) {
  data object SplashScreen : Screen("splash_screen")
  data object SignUpScreen : Screen("sign_up_screen")
  data object SignInScreen : Screen("sign_in_screen")
  data object MainFeedScreen : Screen("main_feed_screen")
  data object PostViewScreen : Screen("post_view_screen")
  data object ChatScreen : Screen("chat_screen")
  data object MessageScreen : Screen("message_screen")
  data object ActivityScreen : Screen("activity_screen")
  data object ProfileScreen : Screen("profile_screen")
  data object EditProfileScreen : Screen("edit_profile_screen")
  data object SearchScreen : Screen("search_screen")
  data object LikedByScreen : Screen("liked_by_screen")
  data object PostCreateScreen : Screen("post_create_screen")

}