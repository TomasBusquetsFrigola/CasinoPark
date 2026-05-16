package com.tomasbusfri.files.casinopark.UI.customcomposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tomasbusfri.files.casinopark.model.data.dataclasses.Card
import org.jetbrains.compose.resources.painterResource

@Composable
fun CardView(
    card: Card,
    modifier: Modifier = Modifier
) {
    Box(
       modifier = Modifier
           .width(120.dp)
           .height(1280.dp)
           .padding(8.dp)
    ){
        Image(
            painter = androidx.compose.ui.res.painterResource(card.cardSideSVG),
            contentDescription = "${card.cardValue} ${card.cardSuit}",
        )
    }
}