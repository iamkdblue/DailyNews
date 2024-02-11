import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.article.ArticlesScreen
import cafe.adriel.voyager.navigator.Navigator
import di.sharedKoinModules
import org.koin.compose.KoinApplication

@Composable
fun App() {
    // Set current Koin instance to Compose context
    KoinApplication(application = {
        modules(sharedKoinModules)
    }) {
        Screen()
    }
}


@Composable
fun Screen(){
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Navigator(ArticlesScreen())
            }
        }
    }
}

