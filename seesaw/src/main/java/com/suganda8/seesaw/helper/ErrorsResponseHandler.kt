package com.suganda8.seesaw.helper

import com.suganda8.seesaw.data.ErrorsResponse
import com.google.gson.JsonArray

class ErrorsResponseHandler {
    companion object {
        fun getHashMap(errorMessages: ErrorsResponse?): HashMap<String, MutableList<String>> {
            if (errorMessages != null) {
                val errorMessagesObject = errorMessages.error_messages
                val errorHashMap = HashMap<String, MutableList<String>>()
                errorMessagesObject.keySet().forEachIndexed { _, key ->
                    val errorMessagesArray = errorMessagesObject[key] as JsonArray
                    if (errorHashMap.containsKey(key)) {
                        errorMessagesArray.forEachIndexed { _, jsonElement ->
                            errorHashMap[key]?.add(jsonElement.asString)
                        }
                    } else {
                        errorHashMap[key] = mutableListOf()
                        errorMessagesArray.forEachIndexed { _, jsonElement ->
                            errorHashMap[key]?.add(jsonElement.asString)
                        }
                    }
                }
                return errorHashMap
            }
            return hashMapOf()
        }
    }
}