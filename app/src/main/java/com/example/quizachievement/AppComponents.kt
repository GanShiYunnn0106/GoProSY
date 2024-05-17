package com.example.quizachievement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizachievement.R
import java.lang.reflect.Modifier

@Composable
fun ButtonComponent(value: String, onButtonClicked : () -> Unit, isEnabled : Boolean){
    Button(
        onClick = {
            onButtonClicked.invoke()
        },
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .heightIn(40.dp)
            .padding(20.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Magenta),
        enabled = isEnabled
    ) {
        Box(modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .heightIn(40.dp)
            .background(
                brush = Brush.horizontalGradient(listOf(Color.Magenta, Color.Cyan)),
                shape = RoundedCornerShape(50.dp)
            ),
            contentAlignment = Alignment.Center
        ){
            Text(text = value,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily(Font(R.font.regular_font))
            )
        }
    }
}

@Composable
fun NormalTextComponent(value: String) {
    Text(text = value, modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .heightIn(min = 30.dp)
        .padding(10.dp)
        .padding(bottom = 10.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.regular_font))
        )
        , color = Color.White
    )
}

@Composable
fun BoldTextComponent(value: String) {
    Text(text = value, modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .padding(top = 5.dp)
        .padding(10.dp)
        .heightIn(min = 10.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(Font(R.font.regular_font))
        )
        , color = colorResource(id = R.color.white)
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(text = value, modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .padding(10.dp),
        style = TextStyle(
            fontSize = 19.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.title_font))
        ),
        color = Color.White,
        textAlign = TextAlign.Center,
        lineHeight = 40.sp
    )
}

