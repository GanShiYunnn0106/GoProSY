package com.example.quizachievement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.quizachievement.ui.theme.QuizAchievementTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizAchievementTheme {
                //QuizScreen()
//                SurveyForm()
//              NavigateScreen()
//                TaskScreen(onAddClick = {})
//                    }
                GoProApp()
                }
            }
    }


}








