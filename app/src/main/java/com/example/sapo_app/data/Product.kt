package com.example.sapo_app.data

data class Product(
    val id: String,
    val name: String,
    val price: String,
    val description: String
)
object SampleData {
    val products = listOf(
        Product("0", "iPhone 15", "$999", "Apple flagship phone"),
        Product("1", "Samsung S23", "$899", "Android flagship"),
        Product("2", "Xiaomi 13", "$699", "Best price/performance")
    )
}