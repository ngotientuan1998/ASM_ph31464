package com.example.asm_ph31464.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Categories (val id: Int, val name: String, val image: ImageVector, var isSelected: Boolean = false) {
}