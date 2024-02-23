package di

import app.cash.sqldelight.db.SqlDriver
import com.iamkdblue.dailynews.db.DailyNewsDatabase
import org.koin.dsl.module
import ui.db.createDriver

val sharedKoinModules = listOf(
    articlesModule,
    networkModule,
    viewmodelModule,
    module {
        single<SqlDriver> {
            createDriver()
        }
        single {
            DailyNewsDatabase(get())
        }
    }
)