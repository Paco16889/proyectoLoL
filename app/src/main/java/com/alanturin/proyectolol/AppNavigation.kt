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
    const val CHAMPION_DETAIL = "championDetail/{championNombre}"

    fun createChampionDetailRoute(championNombre: String) = "championDetail/$championNombre"
}
