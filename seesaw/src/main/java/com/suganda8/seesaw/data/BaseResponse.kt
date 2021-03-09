package com.suganda8.seesaw.data

import android.os.Parcelable

abstract class BaseResponse : Parcelable {
    abstract val statusMessage: String
    abstract val statusCode: Int
}
