//package com.example.quizachievement
//
////import SurveyForm
//import android.util.Log
//import androidx.annotation.StringRes
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Modifier
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.navigation.NavController
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import androidx.navigation.navigation
//import com.example.quizachievement.model.TaskViewModel
////import com.example.quizachievement.ui.theme.PostTaskScreen
////import com.example.quizachievement.ui.theme.QuizScreen
//import com.example.quizachievement.ui.theme.TaskScreen
//
//enum class NavigateScreen(@StringRes val title: Int){
//    PostTaskScreen(title = R.string.post_task),
//    TaskScreen(title = R.string.add_task),
//    SurveyScreen(title = R.string.survey),
//    QuizAchievementScreen(title= R.string.quiz_achievement)
//
//}
//
//@Composable
//fun NavigateScreen(
//    taskViewModel: TaskViewModel = viewModel(),
//    navController: NavHostController = rememberNavController()
//) {
//    val backStackEntry by navController.currentBackStackEntryAsState()
//    val currentScreen = NavigateScreen.valueOf(
//        backStackEntry?.destination?.route ?: NavigateScreen.SurveyScreen.name
//    )
//    Scaffold(
//    ) { innerPadding ->
//
//        NavHost(
//            navController = navController,
//            startDestination = NavigateScreen.TaskScreen.name,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//        ) {
//            //TASK SCREEN
//            composable(route = NavigateScreen.TaskScreen.name) {
//                TaskScreen(
//                    onAddClick = {
//                        navController.navigate(NavigateScreen.PostTaskScreen.name)
//                    }
//                )
//            }
//
//                //POST TASK SCREEN
//            composable(route = NavigateScreen.PostTaskScreen.name) {
//                PostTaskScreen(
//                    onPostClick = {
//                            navController.navigate(NavigateScreen.TaskScreen.name)
//                        }
//                )
//            }
//
//            //SURVEY SCREEN
//            composable(route = NavigateScreen.SurveyScreen.name) {
//                SurveyForm(
//                )
//            }
//            //QUIZ ACHIEVEMENT SCREEN
//            composable(route = NavigateScreen.QuizAchievementScreen.name) {
//                QuizScreen(
//                )
//            }
//
//
//        }
//
//
//    }
//}
//
//
//
