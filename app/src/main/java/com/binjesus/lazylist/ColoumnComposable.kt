package com.binjesus.lazylist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.util.Date

//val type: String, var amount: Double, val currency: String, var date: Date

@Composable
fun TransactionCard(type: String,amount: Double, currency: String, date: Date ,modifier: Modifier = Modifier) {

    Card {
        Row(
            modifier = Modifier.fillMaxWidth().padding(20.dp).align(Alignment.CenterHorizontally).height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(text = "  $type || $amount")
            Text(text = "  $currency || $date")
        }
    }

}