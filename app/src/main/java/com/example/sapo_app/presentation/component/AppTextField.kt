package com.example.sapo_app.presentation.component

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label)}
    )
}