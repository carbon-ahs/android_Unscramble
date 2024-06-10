package com.example.unscramble.ui


/**
 * Created by Ahsan Habib on 6/10/2024.
 */
data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false
)
