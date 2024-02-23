package ui.db

import app.cash.sqldelight.db.SqlDriver

/*
fun createDatabase(driverFactory: DatabaseDriverFactory): DailyNewsDatabase {
    val driver = driverFactory.createDriver()
    DailyNewsDatabase.Schema.create(driver)
    return DailyNewsDatabase(driver)
}*/
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        TODO("Not yet implemented")
    }
}

actual fun createDriver(): SqlDriver {
    TODO("Not yet implemented")
}