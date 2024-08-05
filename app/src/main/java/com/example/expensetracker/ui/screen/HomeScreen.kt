package com.example.expensetracker.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.expensetracker.R
import com.example.expensetracker.ui.components.CardItem
import com.example.expensetracker.ui.components.TransactionList
import com.example.expensetracker.ui.theme.Zinc

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (nameRow, list, card, topBar) = createRefs()


            Image(painter = painterResource(id = R.drawable.ic_topbar),
                contentDescription = "top bar image",
                modifier = Modifier.constrainAs(topBar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                    .constrainAs(nameRow) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },

                ) {
                Column {
                    Text(text = "Good Morning,", fontSize = 16.sp, color = Color.White)
                    Text(
                        text = "Sanket Mane",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = "notification",
                    modifier = Modifier.align(Alignment.CenterEnd)
                )

            }

            Spacer(modifier = Modifier.height(20.dp))

            CardItem(
                modifier = Modifier.constrainAs(card) {
                    top.linkTo(nameRow.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            )

            TransactionList(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .constrainAs(list) {
                        top.linkTo(card.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                        height = Dimension.fillToConstraints //the remaining space is used by this composable
                    },
            )

        }
    }

}




@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewHomeScreen() {
    HomeScreen()
}