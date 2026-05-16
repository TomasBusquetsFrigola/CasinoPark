package com.tomasbusfri.files.casinopark.UI.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.tomasbusfri.files.casinopark.UI.Colors
import com.tomasbusfri.files.casinopark.UI.customcomposables.CreditSlider
import com.tomasbusfri.files.casinopark.UI.customcomposables.GameButton
import com.tomasbusfri.files.casinopark.model.data.dataclasses.Deck
import com.tomasbusfri.files.casinopark.model.data.dataclasses.Player

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    decks: List<Deck>,
    player: Player
) {
    var numberOfPlays by remember { mutableStateOf(0) }
    var nDecks by remember { mutableStateOf(0) }
    var credit by remember { mutableStateOf(0) }
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Colors.POKER_GREEN)
            .padding(24.dp)
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "WELCOME",
                color = Colors.GOLD,
                fontSize = 32.em,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                GameButton(
                    label = "POKER",
                    action = {}
                )
                GameButton(
                    label = "BLACKJACK",
                    action = {}
                )
                GameButton(
                    label = "SOLITAIRE",
                    action = {}
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            TextField(
                value = "NUMBER OF ROUNDS PER GAME OF POKER: ",
                onValueChange = {
                    numberOfPlays = it.toInt()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                enabled = true,
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = "NUMBER OF DECKS PER GAME OF POKER: ",
                onValueChange = {
                    nDecks = it.toInt()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                enabled = true,
            )
            Spacer(modifier = Modifier.height(8.dp))
            CreditSlider(
                maxCredit = player.points,
                initialCredit = credit,
                onCreditChange = { credit = it }
            )
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    val decks = mutableListOf<Deck>()
    val player = Player(5000)
    MainScreen(decks = decks, player = player)
}