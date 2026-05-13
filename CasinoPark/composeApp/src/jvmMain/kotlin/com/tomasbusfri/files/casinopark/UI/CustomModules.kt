package com.tomasbusfri.files.casinopark.UI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GameButton(
    label: String,
    action: () -> Unit,
) {
    OutlinedButton(
        onClick = action,
        border = BorderStroke(
            width = 2.dp,
            color = Colors.SILVER
        ),
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Text(label)
    }
}

@Composable
fun CreditSlider(
    maxCredit: Int,
    initialCredit: Int = 0,
    onCreditChange: (Int) -> Unit
) {
    var selectedCredit by remember { mutableStateOf(initialCredit.toFloat()) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Starting Credit: ${selectedCredit.toInt()} / $maxCredit")

        Slider(
            value = selectedCredit,
            onValueChange = {
                selectedCredit = it
                onCreditChange(it.toInt())
            },
            valueRange = 0f..maxCredit.toFloat(),
            steps = maxCredit - 1, // atenció: això només si vols que sigui només enters
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Current selected credit: $selectedCredit")
            Text(text = "Max: $maxCredit")
        }
    }
}