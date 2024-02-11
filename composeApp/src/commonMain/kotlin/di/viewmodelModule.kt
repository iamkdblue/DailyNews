package di

import org.koin.dsl.module
import ui.article.ArticlesViewModel

val viewmodelModule = module {
    single {
        ArticlesViewModel(get())
    }
}