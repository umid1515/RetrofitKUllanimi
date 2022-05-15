package com.example.retrofitkullanimi


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CRUDCevap(
    @SerializedName("message")
    @Expose
    val message: String?,
    @SerializedName("success")
    @Expose
    val success: Int?
)