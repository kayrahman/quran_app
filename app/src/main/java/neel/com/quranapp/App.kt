package neel.com.quranapp

import android.app.Application
import androidx.multidex.MultiDexApplication
import timber.log.Timber

class App : MultiDexApplication(){

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}