package com.example.whatsappui

import androidx.compose.ui.graphics.painter.Painter

data class ImageWithText(
    val displayPicture: Painter,
    val sender:String,
    val message: String,
    val date:String
)
