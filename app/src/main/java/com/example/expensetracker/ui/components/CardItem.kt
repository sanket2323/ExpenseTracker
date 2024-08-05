package com.example.expensetracker.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetracker.R
import com.example.expensetracker.ui.theme.Zinc

@Composable
fun CardItem(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Zinc)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
                .weight(1f)
        ) {
            Column {
                Text(
                    text = "Total Balance",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "$2350", fontSize = 26.sp, color = Color.White)
            }
            Icon(
                painter = painterResource(id = R.drawable.dots_menu),
                contentDescription = "null",
                modifier = Modifier.align(Alignment.TopEnd)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            CardRowItem(
                modifier = Modifier,
                title = "Income",
                amount = "$34000",
                image = R.drawable.ic_income
            )
            CardRowItem(
                modifier = Modifier.align(Alignment.TopEnd),
                title = "Expense",
                amount = "$3000",
                image = R.drawable.ic_expense
            )
        }

    }

}


@Composable
fun CardRowItem(modifier: Modifier, title: String, amount: String, image: Int) {
    Column(modifier = modifier) {
        Row {

            Image(
                painter = painterResource(id = image),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = title, fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        Text(text = amount, fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.SemiBold)
    }
}
