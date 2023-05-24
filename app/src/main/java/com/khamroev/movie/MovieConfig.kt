package com.khamroev.movie

import android.app.Application
import com.khamroev.movie.di.appModule
import com.khamroev.movie.di.getSharedModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MovieConfig: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
//            androidLogger()
            androidContext(this@MovieConfig)
            modules(appModule + getSharedModules())
        }
    }
}