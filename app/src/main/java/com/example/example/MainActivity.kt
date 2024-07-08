package com.example.example

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.example.ui.theme.ExampleTheme
import com.example.example.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ExampleTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Text(text = "Hello Android", color = Color.Green,
                        modifier = Modifier.background(Red),
                        fontSize = 40.sp, fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic)
                    val offset= Offset(20.0f,10.0f)
                    Text(text = "hi Piyush", fontSize = 40.sp,
                        style = TextStyle(
                            fontSize = 40.sp,
                            shadow = Shadow(
                                color = Color.Green, offset = offset
                            )
                        )
                    )
                    val gradientColor= listOf(Cyan, Blue, Green)
                    Text(text ="Jetpack Compose",fontSize = 30.sp,
                        fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold,
                        style = TextStyle(
                            brush = Brush.linearGradient(
                                colors = gradientColor
                            )
                        )
                    )
                    Row {
                        Button(onClick = { println("1 is clicked") }, colors = ButtonDefaults.buttonColors(Color.LightGray))
                        {
                            Text(text = "1")                            
                        }
                        FilledTonalButton(onClick = { println("2 is clicked") })
                        {
                            Text(text = "2")
                        }
                        OutlinedButton(onClick = { println("3 is cliked") })
                        {
                            Text(text = "3")
                        }
                    }
                    FloatingActionButton(onClick = { /*TODO*/ },
                        containerColor = Color.Green) {
                        Icon(Icons.Default.Add, contentDescription = "")
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("Lifecycle=start")
    }

    override fun onResume() {
        super.onResume()
        println("Lifecycle=resume")
    }

    override fun onPause() {
        super.onPause()
        println("Lifecycle=pause")
    }

    override fun onStop() {
        super.onStop()
        println("Lifecycle=stop")
    }
}
