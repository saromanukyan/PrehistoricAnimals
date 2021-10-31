package com.example.prehistoricanimals

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prehistoricanimals.models.Dino
import com.example.prehistoricanimals.repository.DinosaursRepository
import com.example.prehistoricanimals.ui.theme.PrehistoricAnimalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrehistoricAnimalsTheme {
                DinoApp()
            }
        }
    }
}

@Composable
fun DinoApp() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
    if (shouldShowOnboarding) {
        WelcomeScreen(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        Greetings()
    }
}

@Composable
fun WelcomeScreen(onContinueClicked: () -> Unit) {

    Card {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFF92C8D5)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                color = Color(0xFF073042),
                text = "Welcome to a million years BC!",
                modifier = Modifier.padding(vertical = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.dinos),
                contentDescription = null, modifier = Modifier.padding(horizontal = 20.dp)
            )
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = onContinueClicked
            ) {
                Text("Discover")
            }
        }
    }
}

@Composable
fun Greeting(dino: Dino) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(dino = dino)
    }
}

@Composable
private fun CardContent(dino: Dino) {
    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(12.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Card(
            modifier = Modifier.size(60.dp),
            shape = CircleShape,
        ) {
            Image(
                painterResource(dino.image),
                contentDescription = "",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(
                text = dino.name,
                style = MaterialTheme.typography.h6
                    .copy(
                        fontWeight = FontWeight.ExtraBold
                    )
            )
            if (expanded) {
                Text(
                    text = dino.description,
                )
            }
        }
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if (expanded) {
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                }

            )
        }
    }
}

@Composable
private fun Greetings(
    dinos: List<Dino> = DinosaursRepository.listOfDinosaurs
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = dinos) { dinos ->
            Greeting(dino = dinos)
        }
    }
}

@Preview(showBackground = true, widthDp = 500,uiMode = UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark")
@Preview(showBackground = true, widthDp = 500)
@Composable
fun DefaultPreview() {
    PrehistoricAnimalsTheme {
        Greetings()
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun WelcomeScreenPreview() {
    PrehistoricAnimalsTheme {
        WelcomeScreen(onContinueClicked = {})
    }
}
