package com.tomasbusfri.files.casinopark.model.data.dataclasses

import com.tomasbusfri.files.casinopark.model.api.apiclasses.APICard
import com.tomasbusfri.files.casinopark.model.data.enums.CardColor

data class Card(
    val cardValue: Int,
    val cardSuit: String,
    val cardSideSVG: String,
    val cardSidePNG: String,
    val cardColor: CardColor
)

fun APICard.toCard(): Card {
    return Card(
        cardValue = value.toInt(),
        cardSuit = suit,
        cardSideSVG = images.svg,
        cardSidePNG = images.png,
        cardColor =
            if (suit == "SPADES" || suit == "CLUBS") CardColor.BLACK
            else if (suit == "DIAMONDS" || suit == "HEARTS") CardColor.RED
            else throw Exception(),
    )
}