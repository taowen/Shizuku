package moe.shizuku.manager

import android.app.Application
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate
import com.topjohnwu.superuser.Shell
import moe.shizuku.manager.ktx.logd
import org.lsposed.hiddenapibypass.HiddenApiBypass
import rikka.core.util.BuildUtils.atLeast30
import rikka.material.app.LocaleDelegate

lateinit var application: Application

class ShizukuApplication : Application() {

    companion object {

        @JvmStatic
        fun initialize(host: Application) {
            if (::application.isInitialized) return
            application = host
            ShizukuSettings.initialize(host)
            LocaleDelegate.defaultLocale = ShizukuSettings.getLocale()
            AppCompatDelegate.setDefaultNightMode(ShizukuSettings.getNightMode())
        }

        init {
            logd("ShizukuApplication", "init")

            Shell.setDefaultBuilder(Shell.Builder.create().setFlags(Shell.FLAG_REDIRECT_STDERR))
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.setHiddenApiExemptions("")
            }
            if (atLeast30) {
                System.loadLibrary("adb")
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        initialize(this)

    }

}
