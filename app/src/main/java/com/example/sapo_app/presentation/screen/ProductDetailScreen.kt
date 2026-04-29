package com.example.sapo_app.presentation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.example.sapo_app.data.Product
import com.example.sapo_app.data.SampleData
import com.example.sapo_app.presentation.component.AppButton

@Composable
fun ProductDetailScreen(navController: NavController, backStackEntry: NavBackStackEntry) {
    val productId = backStackEntry.arguments?.getString("productId")
    val products = SampleData.products
    val product = products.find { it.id == productId }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Back", modifier = Modifier.clickable {
                navController.popBackStack()
            }
        )
        Spacer(modifier = Modifier.padding(16.dp))

        if (product != null) {
            Text(
                text = product.name,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = product.price,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = product.description
            )
            AppButton("add to cart", onClick = {})
        }
        else {
            Text("Product not found")
        }

        }
    }