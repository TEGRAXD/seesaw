package com.suganda8.seesaw.helper

import java.util.*

class ErrorMessagesHandler {
    companion object {
        private const val ERROR_MESSAGES_INVALID = "INVALID"
        private const val ERROR_MESSAGES_REQUIRED = "REQUIRED"
        private const val ERROR_MESSAGES_UNIQUE = "UNIQUE"
        private const val ERROR_MESSAGES_MAX = "MAX"
        private const val ERROR_MESSAGES_MIN = "MIN"
        private const val ERROR_MESSAGES_SERVER_INTERNAL_ERROR = "SERVER_INTERNAL_ERROR"

        private const val ERROR_MESSAGES_EMAIL_NOT_VERIFIED = "EMAIL_NOT_VERIFIED"

        fun getErrorMessage(`object`: String, error: String? = null): String {
            val objectLowered = `object`.toLowerCase(Locale.getDefault()).replace("_", " ", ignoreCase = true)
            val objectCapitalized = objectLowered.capitalize(Locale.getDefault())
            return when (error) {
                ERROR_MESSAGES_INVALID -> "$objectCapitalized given was invalid!"
                ERROR_MESSAGES_REQUIRED -> "$objectCapitalized required"
                ERROR_MESSAGES_UNIQUE -> "$objectCapitalized an unique entity"
                ERROR_MESSAGES_MAX -> "$objectCapitalized max"
                ERROR_MESSAGES_MIN -> "$objectCapitalized min"
                ERROR_MESSAGES_SERVER_INTERNAL_ERROR -> "Server Internal Error"
                ERROR_MESSAGES_EMAIL_NOT_VERIFIED -> "Email Not Verified"
                else -> "Something went wrong!"
            }
        }
    }
}