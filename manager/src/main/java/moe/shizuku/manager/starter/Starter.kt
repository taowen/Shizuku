package moe.shizuku.manager.starter

import moe.shizuku.manager.application
import java.io.File

object Starter {

    private val starterFile = File(application.applicationInfo.nativeLibraryDir, "libshizuku.so")

    val userCommand: String = "${starterFile.absolutePath} --manager-package=${application.packageName}"

    val adbCommand = "adb shell $userCommand"

    val internalCommand = "$userCommand --apk=${application.applicationInfo.sourceDir}"
}
