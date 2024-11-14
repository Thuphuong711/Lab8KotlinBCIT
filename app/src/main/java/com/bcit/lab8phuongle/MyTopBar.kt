@file:OptIn(ExperimentalStdlibApi::class)

package com.bcit.lab8phuongle

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

data class ColorCode(val colorCode: Long)
val colorList = listOf(
    ColorCode(0xFFF44336.toLong()),
    ColorCode(0xFFE91E63.toLong()),
    ColorCode(0xFF9C27B0.toLong()),
    ColorCode(0xFF3F51B5.toLong()),
    ColorCode(0xFF2196F3.toLong()),
    ColorCode(0xFF009688.toLong()),
    ColorCode(0xFF4CAF50.toLong()),
    ColorCode(0xFFFFEB3B.toLong())
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavBar(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            text = "Colors",
                            fontSize = 40.sp
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            navController.popBackStack()
                        }) {
                            Icon(
                                //imageVector = Icons.Default.ArrowBack
                                //imageVector = Icons.Rounded.ArrowBack
                                imageVector = Icons.Rounded.Home,
                                contentDescription = "Home"
                            )
                        }
                    },
                    actions = {
                        IconButton(
                            onClick = {
                                //make the star changed color as we click on the Card/ Box
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Star,
                                contentDescription = "Star",
                                modifier = Modifier.size(70.dp)
                            )
                        }
                    }
                )
            }
        )
        { values ->
            LazyColumn(
                modifier = Modifier.fillMaxSize()
                    .padding(values)
            ) {
                items(colorList){ colorItem ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(120.dp)
                            .padding(10.dp)
                            .background(color = Color(colorItem.colorCode.toInt()))
                    ){
                        Icon(
                            imageVector = Icons.Outlined.Info,
                            contentDescription = "",
                            modifier = Modifier
                                .padding(top = 8.dp, end = 8.dp)
                                .align(Alignment.TopEnd)
                                .clickable(){
                                    //pay attention to this
//                                    navController.navigate(Screen.INFOR.route + "/{${colorItem.colorCode}}")

                                    navController.navigate(Screen.INFOR.route)
                                }
                            )
                    }
                }

            }
        }
    }

}