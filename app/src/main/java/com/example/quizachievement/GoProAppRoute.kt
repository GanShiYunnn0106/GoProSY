package com.example.quizachievement

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen(){

    object StudentDashboard : Screen()

    object QuizAchievement : Screen()
    object TaskScreen : Screen()
    object PostTask : Screen()
    object Survey : Screen()


}

object GoProAppRoute {
    val currentScreen : MutableState<Screen> = mutableStateOf(Screen.StudentDashboard)

    fun navigateTo(destination : Screen) {
        currentScreen.value = destination
    }
}