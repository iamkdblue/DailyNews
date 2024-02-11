package ui.about

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

internal class AboutScreen() :Screen{

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        AboutScreenContent{
            navigator.pop()
        }
    }
}
