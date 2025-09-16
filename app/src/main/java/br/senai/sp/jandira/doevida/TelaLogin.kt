package br.senai.sp.jandira.doevida

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun TelaLogin(navController: NavController) {
    
}

@Preview
@Composable
private fun TelaLoginPreview() {
    val navController = rememberNavController()
    TelaLogin(navController = navController)
}