package com.tomasbusfri.files.casinopark.model.dao.interfaces

import com.tomasbusfri.files.casinopark.model.data.dataclasses.Card
import com.tomasbusfri.files.casinopark.model.data.dataclasses.Deck

interface DAOCasino {
    fun getDeckByID(deckId: String): Deck?

    fun getCardsOfDeck(deckId: String): List<Card>

    fun fillDeck(deckId: String): Boolean

    fun createDeck(deck: Deck): Boolean

    fun updateDeck(deck: Deck): Boolean

    fun deleteDeck(deckId: String): Boolean

    fun commitDecks(): Boolean

    fun getAll(): List<Deck>

    fun getAllInMemory(): List<Deck>
}