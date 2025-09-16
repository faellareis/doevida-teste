package br.senai.sp.jandira.doevida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.doevida.screens.TelaInicial
import br.senai.sp.jandira.doevida.screens.TelaLogin
import br.senai.sp.jandira.doevida.screens.TelaRecuperacaoEmail

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            AppNavHost(navController)
        }
    }
}

@Composable
fun AppNavHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "tela_inicial"
    ) {
        composable("tela_inicial") {
            TelaInicial(navController)
        }
        composable("tela_login") {
            TelaLogin(navController)
        }
        composable("tela_recuperacao_email") {
            TelaRecuperacaoEmail(navController)
        }
    }
}
