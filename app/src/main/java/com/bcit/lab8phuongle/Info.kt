package com.bcit.lab8phuongle

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Infor(color: Long){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(color)),
        contentAlignment = Alignment.Center

    ){
        Text(text= color.toString(), fontSize = 40.sp)
    }
}

@Composable
fun Infor(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
        contentAlignment = Alignment.Center

    ){
        Text(text = "Hello")
    }
}