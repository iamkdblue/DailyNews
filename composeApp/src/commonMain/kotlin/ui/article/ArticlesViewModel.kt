package ui.article

import ui.ArticlesState
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ArticlesViewModel(
    private val useCase: ArticlesUseCase
) : ViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState


    init {
        getArticles()
    }

    private fun getArticles() {
        viewModelScope.launch {
            val fetchedArticles = useCase.getArticles()
            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
}