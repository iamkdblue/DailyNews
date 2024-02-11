package ui.article
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import ui.about.AboutScreen

internal class ArticlesScreen: Screen {

    @Composable
    override fun Content() {
        val articleViewModel = getViewModel(Unit, viewModelFactory { ArticlesViewModel() })
        val navigator = LocalNavigator.currentOrThrow

        ArticlesScreenContent(
            onAboutButtonClick = {
                navigator.push(AboutScreen())
            },
            articleViewModel = articleViewModel
        )

    }
}