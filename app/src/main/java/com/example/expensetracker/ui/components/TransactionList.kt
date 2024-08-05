package com.example.expensetracker.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetracker.R

@Composable
fun TransactionList(modifier: Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 16.dp)) {
        item {
            Column {
                Box(modifier = modifier.fillMaxWidth()) {
                    Text(
                        text = "Transaction History",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Text(
                        text = "See All",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.align(Alignment.CenterEnd),
                        color = Color.Gray
                    )
                }

                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )

                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )
                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )
                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )
                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )
                TransactionListItem(
                    modifier = Modifier,
                    image = R.drawable.ic_netflix,
                    title = "Netflix",
                    amount = "$3000",
                    color = Color.Green,
                    date = "23/02/2004"
                )
            }
        }
    }
}

@Composable
fun TransactionListItem(
    modifier: Modifier,
    image: Int,
    title: String,
    amount: String,
    color: Color,
    date: String
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row {
            Image(painter = painterResource(id = image), contentDescription = "null")
            Spacer(modifier = Modifier.width(4.dp))
            Column {
                Text(text = "$title", fontSize = 16.sp)
                Text(text = "$date", fontSize = 12.sp)
            }

        }
        Text(
            text = "$amount", fontSize = 16.sp, color = color,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }

}


