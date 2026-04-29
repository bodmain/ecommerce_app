package com.example.sapo_app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sapo_app.presentation.screen.CartScreen
import com.example.sapo_app.presentation.screen.HomeScreen
import com.example.sapo_app.presentation.screen.LoginScreen
import com.example.sapo_app.presentation.screen.OrderHistoryScreen
import com.example.sapo_app.presentation.screen.ProductDetailScreen
import com.example.sapo_app.presentation.screen.ProfileScreen
import com.example.sapo_app.presentation.screen.RegisterScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.login.route
    ) {
        composable(Screen.login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Register.route) {
            RegisterScreen(navController)
        }
        composable(Screen.Home.route)
        {
            HomeScreen(navController)
        }
        composable(Screen.ProductDetail.route) { backStackEntry ->
            ProductDetailScreen(navController, backStackEntry)
        }
        composable(Screen.Cart.route) {
            CartScreen(navController)
        }
        composable(Screen.Profile.route) {
            ProfileScreen(navController)
        }
        composable(Screen.OrderHistory.route) {
            OrderHistoryScreen(navController)
        }
    }
}