package br.senai.sp.jandira.doevida

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(x = (-100).dp, y = (-120).dp)
                .background(
                    color = Color(0xFF990410),
                    shape = CircleShape
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.logologin),
                contentDescription = "Logo DOEVIDA",
                modifier = Modifier.size(170.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 1.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Digite seu Email ou Usuário",
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(bottom = 4.dp)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Digite seu email", color = Color.White) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF990410),
                            shape = RoundedCornerShape(8.dp)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Digite sua Senha",
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(bottom = 4.dp)
                )
                OutlinedTextField(
                    value = senha,
                    onValueChange = { senha = it },
                    placeholder = { Text("Digite sua senha",  color = Color.White) },
                    visualTransformation = PasswordVisualTransformation(), //A senha aparece como bolinha
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF990410),
                            shape = RoundedCornerShape(8.dp)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = "Esqueci minha senha",
                    color = Color(0xFF990410),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .clickable { /* Navegação para recuperação */ },
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .padding(16.dp)
            ) {

                Button(
                    onClick = { /* Login */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF990410)
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .width(200.dp)
                        .height(48.dp)
                        .padding(bottom = 32.dp)
                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun TelaLoginPreview() {
    val navController = rememberNavController()
    TelaLogin(navController = navController)
}
