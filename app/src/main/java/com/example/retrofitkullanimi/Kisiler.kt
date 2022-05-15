package com.example.retrofitkullanimi


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Kisiler(
    @SerializedName("kisi_ad")
    @Expose
    val kisiAd: String?,
    @SerializedName("kisi_tel")
    @Expose
    val kisiTel: String?,
    @SerializedName("kisi_id")
    @Expose
    val kisiİd: String?
)