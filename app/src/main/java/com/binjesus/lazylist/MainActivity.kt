package com.binjesus.lazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.binjesus.lazylist.ui.theme.LazyListTheme
import java.util.Calendar
import java.util.Date

class MainActivity : ComponentActivity() {
    val transactionsList: List<Transaction> = listOf(
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),
        Transaction("withdraw", 80.0, "KWD", Date()),






        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        items(transactionsList){transaction ->
                            TransactionCard(type = transaction.type,amount = transaction.amount, currency = transaction.currency, date = transaction.date)
                        }
                    }
                }
            }
        }
    }
}

/*
1. Account statement model data class
    1. Think of the data usually used in a Account statements
        1. One of them is the Transaction type (Deposit/Withdraw)
    2. We need at least 5 types of data including the transaction type (Deposit/Withdraw)
2. Create the Account statement composable
    1. Arrange the data in a usable way to improve the UX and make the user happy
3. Create the list of Account statements
    1. Using the Account statement card to create the Account statements list page
4. Add dummy data to the Account Statements list
 */