package com.example.sapo_app.presentation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sapo_app.data.Product
import com.example.sapo_app.data.SampleData.products
import com.example.sapo_app.presentation.component.AppButton
import com.example.sapo_app.presentation.navigation.Screen
import com.google.common.collect.Multimaps.index

@Composable
fun HomeScreen(navController: NavController) {

    Column {
        Text("Home Screen ")

        AppButton(
            "Go to Cart",
            { navController.navigate(Screen.Cart.route) }
        )
        AppButton(
            "GO to Profile",
            { navController.navigate(Screen.Profile.route) }
        )
        LazyColumn {
            items(products.size) { index ->
                val product = products[index]
                Text(
                    text = product.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(Screen.ProductDetail.createRoute(index.toString()))
                        }
                        .padding(16.dp)
                )
            }


        }
    }
}

