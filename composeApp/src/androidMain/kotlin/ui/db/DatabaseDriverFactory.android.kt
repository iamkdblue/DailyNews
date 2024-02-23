package ui.db

import com.iamkdblue.dailynews.MyApplication
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.iamkdblue.dailynews.db.DailyNewsDatabase

actual fun createDriver(): SqlDriver {
    return AndroidSqliteDriver(DailyNewsDatabase.Schema, MyApplication.appContext, "DailyNewsDatabase.db")
}