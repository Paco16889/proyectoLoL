package com.alanturin.proyectolol

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.alanturin.proyectolol.data.ChampionRepository

object Routes {
    const val CHAMPION_LIST = "champions"
    const val CHAMPION_DETAIL = "championDetail/"

    fun createChampionDetailRoute(championNombre: String) = "championDetail/$championNombre"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.CHAMPION_LIST
    ){
        composable(Routes.CHAMPION_LIST) {
            LazyColumn {
                items(ChampionRepository.champions) { champion ->
                    ChampionItem(
                        champion = champion,
                        onClick = {
                            navController.navigate(Routes.createChampionDetailRoute(champion.nombre))
                        }
                    )

                }
            }
        }

        composable(
            route = Routes.CHAMPION_DETAIL,
            arguments = listOf(navArgument("championName") { type = NavType.StringType})
        ){
            backStackEntry ->
            val championNombre = backStackEntry.arguments?.getString(("championName"))
            requireNotNull(championNombre) { "El nombre del campeón no puede ser nulo" }
            RenderChampion(champion.nombre)
        }
    }
}