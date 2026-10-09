# Entrypoints loaded by app_process / the exported rish dex, not Java callers.
-keep class rikka.shizuku.server.ShizukuService { public static void main(java.lang.String[]); }
-keep class moe.shizuku.starter.ServiceStarter { public static void main(java.lang.String[]); }
-keep class moe.shizuku.manager.shell.Shell { public static void main(java.lang.String[], java.lang.String, android.os.IBinder, android.os.Handler); }
-keepnames class moe.shizuku.api.BinderContainer
-keepclassmembers class * implements android.os.Parcelable { public static final ** CREATOR; }
-keepclasseswithmembernames,includedescriptorclasses class * { native <methods>; }
-keepclassmembers class rikka.hidden.compat.adapter.ProcessObserverAdapter { <methods>; }
-keepclassmembers class rikka.hidden.compat.adapter.UidObserverAdapter { <methods>; }

# Framework-only APIs are compileOnly stubs. Android supplies these classes to
# app_process and the manager at runtime; never package replacement stubs.
-dontwarn android.app.ContextImpl
-dontwarn android.app.IActivityManager$Stub
-dontwarn android.app.IActivityManager
-dontwarn android.app.IApplicationThread
-dontwarn android.app.IProcessObserver$Stub
-dontwarn android.app.IProcessObserver
-dontwarn android.app.IUidObserver$Stub
-dontwarn android.app.IUidObserver
-dontwarn android.app.ProfilerInfo
-dontwarn android.content.pm.ILauncherApps
-dontwarn android.content.pm.ParceledListSlice
-dontwarn android.content.pm.UserInfo
-dontwarn android.ddm.DdmHandleAppName
-dontwarn android.os.IBatteryPropertiesRegistrar
-dontwarn android.os.IDeviceIdleController
-dontwarn android.os.IUserManager
-dontwarn android.os.SystemProperties
-dontwarn android.view.IWindowManager
-dontwarn com.android.internal.app.IAppOpsService
-dontwarn com.android.org.conscrypt.Conscrypt
