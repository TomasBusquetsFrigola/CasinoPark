package com.tomasbusfri.files.casinopark.model.api.apiclasses


import com.google.gson.annotations.SerializedName

data class APICard(
    @SerializedName("code")
    val code: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("images")
    val images: Images,
    @SerializedName("suit")
    val suit: String,
    @SerializedName("value")
    val value: String
)