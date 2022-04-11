package com.example.layoutslessontwo

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutslessontwo.ui.theme.LayoutsLessonTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Clinton", "JetpackCompose"))
        }
    }
}

data class Message(val author:String,val bookName: String)

@Composable
fun MessageCard(msg: com.example.layoutslessontwo.Message ) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = R.drawable.profileimage),
            contentDescription = "profiel image!",
            modifier = Modifier.size(40.dp).clip(CircleShape))
        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(10.dp))
        Column() {
            Text(text = msg.author)
            Text(text = msg.bookName)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MessageCard(msg = com.example.layoutslessontwo.Message("Clinton","JetpackCompose"))
}