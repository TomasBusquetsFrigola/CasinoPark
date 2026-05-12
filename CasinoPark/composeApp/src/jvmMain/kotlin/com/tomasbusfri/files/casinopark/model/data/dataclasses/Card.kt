package com.tomasbusfri.files.casinopark.model.data.dataclasses

import com.tomasbusfri.files.casinopark.model.data.enums.CardColor

data class Card(
    val cardValue: Int,
    val cardSuit: String,
    val cardSide: String,
    val cardColor: CardColor
)
