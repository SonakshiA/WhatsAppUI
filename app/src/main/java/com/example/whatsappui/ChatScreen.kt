package com.example.whatsappui

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        FirstRow()
        TabSection(text = listOf("Chats", "Status", "Calls"))
        Chat(
            chatInfo = listOf(
                ImageWithText(
                    painterResource(id = R.drawable.pizza),
                    sender = "Karan",
                    message = "Hello",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.flowers),
                    sender = "Mummy",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.flight),
                    sender = "Papa",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.dome_building),
                    sender = "Bua",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.painting),
                    sender = "Saumya",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.scenery),
                    sender = "Anindya",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.tree),
                    sender = "CSE-4B",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.diyas),
                    sender = "Dadi",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.wie),
                    sender = "IEEE WIE CCs",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.pizza),
                    sender = "IEEE Genesis Working Team",
                    message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                ),
                ImageWithText(
                    painterResource(id = R.drawable.pizza),
                    sender = "NXP WIT Official",
                    message = "You: Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,",
                    date = "2/2/23"
                )
            )
        )
    }
}


@Composable
fun FirstRow(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color = Color(0xFF35897E))
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "WhatsApp",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        IconSection()
    }
}

@Composable
fun IconSection(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search Icon",
            tint = Color.White,
            modifier = Modifier
                .padding(end = 20.dp)
                .size(26.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_chat_24),
            contentDescription = "Chat Icon",
            tint = Color.White,
            modifier = Modifier
                .padding(end = 20.dp)
                .size(26.dp)
        )

        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "Menu Icon",
            tint = Color.White,
            modifier = Modifier.size(26.dp)
        )
    }
}

@Composable
fun TabSection(
    modifier: Modifier = Modifier,
    text: List<String>
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }

    TabRow(
        selectedTabIndex = selectedTabIndex,
        backgroundColor = Color.Transparent,
        modifier = modifier.background(Color(0xFF35897E)),
        contentColor = Color.White
    ) {
        text.forEachIndexed { index, item ->
            Tab(selected = selectedTabIndex == index,
                selectedContentColor = Color.White,
                onClick = {
                    selectedTabIndex = index
                }) {
                Text(
                    text = item.uppercase(),
                    fontWeight = FontWeight.Bold,
                    color = if (selectedTabIndex == index) Color.White else Color.LightGray,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 15.sp
                )
            }
        }
    }
}

@Composable
fun RoundImage(
    image: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = image,
        contentDescription = "Display Picture",
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(width = 1.dp, color = Color.LightGray, shape = CircleShape)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Message(
    sender: String,
    message: String,
    date: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start=15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top,
        ) {
            Text(
                text = sender,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis,
                color = Color.DarkGray,
                fontSize = 19.sp,
                maxLines = 1
            )
            Text(
                text = date,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }

        Text(
            text = message,
            overflow = TextOverflow.Ellipsis,
            fontSize = 16.sp,
            color = Color.Gray,
            maxLines = 1
        )
    }
}

@Composable
fun Chat(
    modifier: Modifier = Modifier,
    chatInfo: List<ImageWithText>
) {
    LazyColumn {
        items(chatInfo.size) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 20.dp).drawBehind {
                            val borderSize = 2.dp.toPx()
                            val y = size.height
                            drawLine(
                                color = Color(0xFFedede9),
                                start = Offset(y,y+3f),
                                end = Offset(size.width, y),
                                strokeWidth = borderSize
                            )
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RoundImage(image = chatInfo[it].displayPicture, modifier = Modifier.size(70.dp))
                Message(
                    sender = chatInfo[it].sender,
                    message = chatInfo[it].message,
                    date = chatInfo[it].date
                )
            }
        }
    }
}