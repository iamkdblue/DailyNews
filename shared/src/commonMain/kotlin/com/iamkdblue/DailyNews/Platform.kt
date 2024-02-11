package com.iamkdblue.DailyNews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform