package com.suganda8.seesaw.data

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ErrorResponse(
    @SerializedName("error_messages") @Expose var error_messages: JsonObject
) : Serializable