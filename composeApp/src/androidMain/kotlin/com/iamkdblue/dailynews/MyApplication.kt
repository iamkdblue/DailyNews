package com.iamkdblue.dailynews
import android.app.Application
import android.content.Context
import android.util.Log


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("com.iamkdblue.dailynews.MyApplication","Hello com.iamkdblue.dailynews.MyApplication")
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
    }
}