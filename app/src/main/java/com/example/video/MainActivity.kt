package com.example.video

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.video.ui.theme.VideoTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.video.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VideoTheme {
                Video()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Video() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFEB3B)) // Cor de fundo amarela
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.icon), // Substitua pelo ID do seu ícone
                contentDescription = "Video Call Icon",
                modifier = Modifier.size(100.dp),
                tint = Color(0xFF4CAF50) // Cor verde para o ícone
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "EasyCall",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF212121)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Let's get started",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF212121),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("User ID") },
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { /* Ação do botão */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)), // Cor roxa para o botão
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "START",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VideoTheme {
        Video()
    }
}