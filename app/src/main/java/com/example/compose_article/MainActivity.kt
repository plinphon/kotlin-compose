package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                ArticleScreen()
            }
        }
    }


@Composable
fun ArticleScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.banner_image),
            contentDescription = "Article Banner",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Of Monsters and Men - Little Talks",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Watch Of Monsters and Men cover Post Malone's \"Circles\" here: http://bit.ly/2Rfkx4q",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Download 'Little Talks' EP on iTunes here: http://po.st/OMAMLittleTalksEP\n" +
                    "Download the album on iTunes here: http://po.st/OMAMAlbum\n" +
                    "Buy the album on Amazon here: http://po.st/OMAMAlbum2\n" +
                    "Follow Of Monsters & Men: \n" +
                    " \n" +
                    "  / ofmonstersan.  .\n" +
                    "  / monstersandmen  \n" +
                    "  / ofmonstersandmenmusic  \n" +
                    "\n" +
                    "http://www.ofmonstersandmen.is/\n" +
                    "\n" +
                    "Directed by WeWereMonkeys\n" +
                    "\n" +
                    "Music video by Of Monsters and Men performing Little Talks. (C) 2012 SKRIMSL ehf Laekjaras 1, under exclusive license to Republic Records, a Division of UMG Recordings, Inc.",
            fontSize = 14.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}
