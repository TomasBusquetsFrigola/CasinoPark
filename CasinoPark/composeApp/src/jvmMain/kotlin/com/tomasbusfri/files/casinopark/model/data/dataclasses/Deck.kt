package com.tomasbusfri.files.casinopark.model.data.dataclasses

import com.tomasbusfri.files.casinopark.model.api.apiclasses.APIDeck

data class Deck(
    val deckId: String,
    val nCards: Int,
    val cards: List<Card>
) {
    fun fillDeck() {

    }
}

fun APIDeck.toDeck(): Deck {
    return Deck(
        deckId = deckId,
        nCards = remaining,
        cards = listOf()
    )
}
