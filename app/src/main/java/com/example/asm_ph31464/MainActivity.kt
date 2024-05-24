package com.example.asm_ph31464

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm_ph31464.ui.screen.LoginScreen
import com.example.asm_ph31464.ui.theme.screen.HomeScreen
import com.example.asm_ph31464.ui.screen.ProductDetail
import com.example.asm_ph31464.ui.screen.SignupScreen
import com.example.asm_ph31464.ui.theme.ASM_ph31464Theme
import com.example.asm_ph31464.ui.screen.Wellcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ASM_ph31464Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navControl = rememberNavController()

                    NavHost(
                        navController = navControl,
                        startDestination = "splash"
                    ) {
                        composable("splash") {
                            Wellcome(navControl)
                        }
                        composable("login") {
                            LoginScreen(navControl)
                        }
                        composable("sign") {
                            SignupScreen(navControl)
                        }

                        composable("home") {
                            HomeScreen(navControl)
                        }
                        composable(Screens.ProductDetail.screen) {
                            ProductDetail()
                        }


                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ASM_ph31464Theme {
            val navControl = rememberNavController()
            HomeScreen(navControl)
        }
    }
}



