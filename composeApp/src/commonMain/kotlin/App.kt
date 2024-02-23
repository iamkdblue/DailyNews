import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.cash.sqldelight.db.SqlDriver
import ui.article.ArticlesScreen
import cafe.adriel.voyager.navigator.Navigator
import com.iamkdblue.dailynews.db.DailyNewsDatabase
import di.sharedKoinModules
import org.koin.compose.KoinApplication
import org.koin.dsl.module
import ui.db.createDriver

@Composable
fun App() {
    // Set current Koin instance to Compose context
    KoinApplication(application = {
        modules(sharedKoinModules,)
        /*module {
            *//*single {
                Database(
                    databaseDriverFactory = get()
                )
            }*//*

            *//*single {
                Database(
                    databaseDriverFactory = get()
                )
            }*//*
        }*/
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

