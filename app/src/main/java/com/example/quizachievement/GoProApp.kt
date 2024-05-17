package com.example.quizachievement

import Survey
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.quizachievement.ui.theme.PostTask
import com.example.quizachievement.ui.theme.QuizHistory
import com.example.quizachievement.ui.theme.StudentDashboard
import com.example.quizachievement.ui.theme.TaskScreen

@Composable
fun GoProApp() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Crossfade(targetState = GoProAppRoute.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.StudentDashboard -> StudentDashboard()
                is Screen.QuizAchievement -> QuizHistory()
                is Screen.TaskScreen -> TaskScreen()
                is Screen.PostTask -> PostTask()
                is Screen.Survey -> Survey()
            }
        }
    }
}