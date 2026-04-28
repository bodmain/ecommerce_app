package com.example.sapo_app.presentation.navigation

sealed class Screen(val route: String){
    object login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object ProductDetail : Screen("product_detail/{productId}"){
        fun createRoute(productId: String): String {
            return "product_detail/$productId"
        }
    }
    object Cart : Screen("cart")
    object OrderHistory : Screen("order_history")
    object Profile : Screen ("profile")
}