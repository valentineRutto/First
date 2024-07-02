package com.valentinerutto

import android.app.Application
import com.valentinerutto.first.di.networkingModule
import com.valentinerutto.first.di.viewmodelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    companion object {
        lateinit var INSTANCE: App
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        val modules = listOf(networkingModule, viewmodelModule)

        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@App)
            modules(modules)
        }
    }
}