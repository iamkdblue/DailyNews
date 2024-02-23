package di

import org.koin.dsl.module
import ui.article.ArticlesDataSource
import ui.article.ArticlesRepository
import ui.article.ArticlesService
import ui.article.ArticlesUseCase
import ui.article.ArticlesViewModel

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel( get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(),get()) }
}