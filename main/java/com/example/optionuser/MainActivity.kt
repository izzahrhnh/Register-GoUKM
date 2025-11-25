package com.example.optionuser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.optionuser.ui.theme.OptionUserTheme
import androidx.compose.ui.tooling.preview.Preview


val CBlue = Color(0xFF6b87c0)
val CBlack = Color(0xFF000000)
val CWhite = Color(0xFFFFFFFF)

val CanvaSansBold = FontFamily(
    Font(R.font.canva_sans_bold, FontWeight.Bold)
)
val CanvaSansRegular = FontFamily(
    Font(R.font.canva_sans_regular)
)
val PoppinsLight = FontFamily(
    Font(R.font.poppins_light)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OptionUserTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = CBlue
                ) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.goukm_logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(200.dp)
        )

        Spacer(Modifier.height(32.dp))

        Text(
            text = "ARE YOU A PASSENGER OR A DRIVER",
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = CanvaSansBold
        )

        Spacer(Modifier.height(32.dp))

        Button(
            onClick = { println("Passenger button clicked!") },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CWhite,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "PASSENGER",
                fontFamily = PoppinsLight,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(16.dp))

        Button(
            onClick = { println("Driver button clicked!") },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CBlack,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "DRIVER",
                fontFamily = PoppinsLight,
                fontSize = 16.sp
            )
        }

        Spacer(Modifier.height(80.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OptionUserTheme {
        Greeting()
    }
}
