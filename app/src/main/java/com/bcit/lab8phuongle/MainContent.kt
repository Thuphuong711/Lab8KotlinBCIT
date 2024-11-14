package com.bcit.lab8phuongle

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screen(val route: String){
    HOME ("home"),
    INFOR("infor"),

}



@Composable
fun Navigator(){

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.HOME.route
    ){
        composable(route = Screen.HOME.route){
            Home(navController = navController)
        }

        composable(route = Screen.INFOR.route){
            Infor(navController = navController)
        }

//        composable(
//            route = Screen.INFOR.route + "/{color}",
//            arguments = listOf(
//                navArgument("color"){
//                    type = NavType.LongType
//                    nullable = false
//                }
//            )
//        ){ entry ->
//            Infor(color = entry.arguments!!.getLong("color"))
//
//        }
    }
}