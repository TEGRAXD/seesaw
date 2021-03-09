package com.suganda8.seesaw.reactive

import com.suganda8.seesaw.data.ErrorsResponse

data class Resource<out T>(
    val status: Status,
    val data: T?,
    val errors: ErrorsResponse?,
    val message: String?,
    val otherMessage: String?
) {
    companion object {
        fun <T> success(
            data: T,
            message: String? = null,
            otherMessage: String? = null
        ): Resource<T> = Resource(Status.SUCCESS, data, null, message, otherMessage)

        fun <T> loading(
            data: T? = null,
            message: String? = null,
            otherMessage: String? = null
        ): Resource<T> = Resource(Status.LOADING, data, null, message, otherMessage)

        fun <T> error(
            data: T? = null,
            errors: ErrorsResponse? = null,
            message: String? = null,
            otherMessage: String? = null
        ): Resource<T> = Resource(Status.ERROR, data, errors, message, otherMessage)
    }
}
