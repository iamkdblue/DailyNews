package db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.iamkdblue.dailynews.db.DailyNewsDatabase

actual fun createDriver(): SqlDriver {
    return NativeSqliteDriver(
        schema = DailyNewsDatabase.Schema,
        name = "DailyNewsDatabase.db"
    )
}