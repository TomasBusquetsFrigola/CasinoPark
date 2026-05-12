package com.tomasbusfri.files.casinopark.model.api.apiclasses


import com.google.gson.annotations.SerializedName

data class APICards(
    @SerializedName("cards")
    val cards: List<APICard>,
    @SerializedName("deck_id")
    val deckId: String,
    @SerializedName("remaining")
    val remaining: Int,
    @SerializedName("success")
    val success: Boolean
)