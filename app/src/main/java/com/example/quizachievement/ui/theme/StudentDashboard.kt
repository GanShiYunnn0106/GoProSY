package com.example.quizachievement.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizachievement.ButtonComponent
import com.example.quizachievement.GoProAppRoute
import com.example.quizachievement.HeadingTextComponent
import com.example.quizachievement.R
import com.example.quizachievement.Screen

@Composable
fun StudentDashboard(){
    Box(modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.gopro_background2),
            contentDescription = "gopro_background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            HeadingTextComponent(value = "Student Dashboard")
            ButtonComponent(
                value = "Quiz Achievement",
                onButtonClicked = { GoProAppRoute.navigateTo(Screen.QuizAchievement) },
                isEnabled = true
            )
            ButtonComponent(
                value = "To-Do Task",
                onButtonClicked = { GoProAppRoute.navigateTo(Screen.TaskScreen) },
                isEnabled = true
            )
            ButtonComponent(
                value = "Student Survey",
                onButtonClicked = { GoProAppRoute.navigateTo(Screen.Survey) },
                isEnabled = true
            )
        }
    }
}

@Preview
@Composable
fun StudentDashboardPreview(){
    StudentDashboard()
}