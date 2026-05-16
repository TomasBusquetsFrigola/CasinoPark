package com.tomasbusfri.files.casinopark

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.tomasbusfri.files.casinopark.UI.screens.MainScreen
import com.tomasbusfri.files.casinopark.model.dao.config.DAOFactory
import com.tomasbusfri.files.casinopark.model.data.dataclasses.Player

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "casinopark",) {
        val dao = DAOFactory()
        val decker = dao.startDAO()
        val decks = decker.getAll()
        val player = Player(5000)
        MainScreen(
            decks = decks,
            player = player,)
    }
}