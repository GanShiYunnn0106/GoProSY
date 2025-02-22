package com.example.quizachievement

import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.activity.OnBackPressedDispatcherOwner
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLifecycleOwner

private val localBackPressedDispatcher =
    staticCompositionLocalOf<OnBackPressedDispatcherOwner?> { null }

private class ComposableBackNavigationHandler(enabled: Boolean) : OnBackPressedCallback(enabled) {
    lateinit var onBackPressed: () -> Unit

    override fun handleOnBackPressed(){
        onBackPressed()
    }
}

@Composable
internal fun ComposableHandler(enabled: Boolean = true, onBackPressed: () -> Unit){
    val dispatcher = (LocalOnBackPressedDispatcherOwner.current ?: return).onBackPressedDispatcher
    val handler = remember { ComposableBackNavigationHandler(enabled) }

    DisposableEffect(dispatcher) {
        dispatcher.addCallback(handler)

        onDispose{ handler.remove() }
    }
    LaunchedEffect(enabled) {
        handler.isEnabled = enabled
        handler.onBackPressed = onBackPressed
    }
}


@Composable
internal fun SystemBackButtonHandler(onBackPressed: () -> Unit){
    CompositionLocalProvider(LocalOnBackPressedDispatcherOwner provides LocalLifecycleOwner.current as ComponentActivity) {
        ComposableHandler {
            onBackPressed()
        }
    }
}