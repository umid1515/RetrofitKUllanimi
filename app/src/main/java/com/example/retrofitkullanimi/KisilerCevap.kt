package com.example.retrofitkullanimi


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class KisilerCevap(
    @SerializedName("kisiler")
    @Expose
    val kisiler: List<Kisiler>?,
    @SerializedName("success")
    @Expose
    val success: Int?
)