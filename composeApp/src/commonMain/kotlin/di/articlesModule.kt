package di

import org.koin.dsl.module
import ui.article.ArticlesService
import ui.article.ArticlesUseCase
import ui.article.ArticlesViewModel

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}