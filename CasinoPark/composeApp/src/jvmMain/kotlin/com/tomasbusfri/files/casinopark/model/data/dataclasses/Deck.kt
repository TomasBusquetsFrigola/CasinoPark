package com.tomasbusfri.files.casinopark.model.data.dataclasses

data class Deck(
    val deckId: String,
    val nCards: Int,
    val cards: List<Card>
)
