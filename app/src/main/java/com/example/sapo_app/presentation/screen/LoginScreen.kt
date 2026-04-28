package com.example.sapo_app.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.sapo_app.presentation.component.AppButton
import com.example.sapo_app.presentation.component.AppTextField
import com.example.sapo_app.presentation.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    var username by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ){
        Text("login")
        AppTextField(
            value = username,
            onValueChange = {username = it},
            label = "Username"
        )
        AppTextField(
            value = password,
            {password = it},
            "Password"
        )
        AppButton(
            "login",
            {navController.navigate(Screen.Home.route)}
        )
    }
}