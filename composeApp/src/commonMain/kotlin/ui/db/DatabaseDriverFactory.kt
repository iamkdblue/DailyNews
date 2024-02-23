package ui.db

import app.cash.sqldelight.db.SqlDriver
import com.iamkdblue.dailynews.db.DailyNewsDatabase

/*expect class DatabaseDriverFactory() {

    fun createDriver(): SqlDriver
}*/
/*
interface DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}
*/


/*
fun createDatabase(driverFactory: DatabaseDriverFactory): DailyNewsDatabase {
    val driver = driverFactory.createDriver()
    DailyNewsDatabase.Schema.create(driver)
    return DailyNewsDatabase(driver)
}*/

expect fun createDriver(): SqlDriver
