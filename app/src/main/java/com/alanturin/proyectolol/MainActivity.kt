package com.alanturin.proyectolol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alanturin.proyectolol.model.Champion
import com.alanturin.proyectolol.ui.theme.ProyectoLoLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoLoLTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LazyColumn(
                        modifier = Modifier,

                        contentPadding = innerPadding,

                        reverseLayout = false,
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Arrangement.Start as Alignment.Horizontal,
                        userScrollEnabled = true,

                        content =  {
                            items(20){index ->
                                Text(
                                    text= "item nº: $index"
                                )
                            }
                            Champion champion = new Champion(item.nombre, item.title, item.lore, item.imgUrl)
                            ChampionItem(champion)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ChampionItem(champion: Champion?){
    println("champion")
}
