package ui.article

import com.iamkdblue.dailynews.db.DailyNewsDatabase

class ArticlesDataSource(private val database: DailyNewsDatabase) {

    fun getAllArticles(): List<ArticleRaw> =
        database.dailyNewsDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    fun insertArticles(articles: List<ArticleRaw>) {
        database.dailyNewsDatabaseQueries.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    fun clearArticles() =
        database.dailyNewsDatabaseQueries.removeAllArticles()

    private fun insertArticle(articleRaw: ArticleRaw) {
        database.dailyNewsDatabaseQueries.insertArticle(
            articleRaw.title,
            articleRaw.desc,
            articleRaw.date,
            articleRaw.imageUrl
        )
    }

    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}