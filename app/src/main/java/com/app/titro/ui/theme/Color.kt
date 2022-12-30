package com.app.titro.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF03A9F4)
val MediumPriorityColor = Color(0xFFFFEB3B)
val HighPriorityColor = Color(0XFFFF4646)
val NonePriorityColor = MediumGray

val Colors.splashScreenBackground: Color
    @Composable
    get() = if (isLight) Purple700 else Color.Black

val Colors.noteItemTextColor: Color
    @Composable
    get() = if (isLight) DarkGray else LightGray

val Colors.noteItemBackgroundColor: Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if (isLight) Teal200 else Purple700

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) Color.White else LightGray

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if (isLight) Purple500 else Color.Black