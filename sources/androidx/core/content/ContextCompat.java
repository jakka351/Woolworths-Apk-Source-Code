package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint
/* loaded from: classes.dex */
public class ContextCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2413a = null;

    @RequiresApi
    public static class Api21Impl {
    }

    @RequiresApi
    public static class Api23Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            if (androidx.core.content.PermissionChecker.b(r6, r9) == 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.content.Intent a(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, java.lang.String r9, android.os.Handler r10, int r11) {
            /*
                r11 = r11 & 4
                if (r11 == 0) goto L58
                if (r9 != 0) goto L58
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                android.content.Context r11 = r6.getApplicationContext()
                java.lang.String r11 = r11.getPackageName()
                r9.append(r11)
                java.lang.String r11 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                int r0 = androidx.core.content.PermissionChecker.b(r6, r9)
                if (r0 == 0) goto L53
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L45
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = androidx.compose.ui.platform.l.i(r6)
                r9.append(r0)
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                int r11 = androidx.core.content.PermissionChecker.b(r6, r9)
                if (r11 != 0) goto L45
                goto L53
            L45:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "Permission "
                java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
                java.lang.String r7 = YU.a.h(r7, r9, r8)
                r6.<init>(r7)
                throw r6
            L53:
                android.content.Intent r6 = r6.registerReceiver(r7, r8, r9, r10)
                return r6
            L58:
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.ContextCompat.Api26Impl.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, int):android.content.Intent");
        }

        public static void b(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api30Impl {
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api33Impl {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LegacyServiceMapHolder {
        static {
            HashMap map = new HashMap();
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, "alarm");
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface RegisterReceiverFlags {
    }

    public static int a(Context context, String str) {
        ObjectsCompat.a(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new NotificationManagerCompat(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static String b(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.a(context);
        }
        return null;
    }

    public static ColorStateList c(int i, Context context) {
        return ResourcesCompat.b(i, context.getTheme(), context.getResources());
    }

    public static Executor d(Context context) {
        return Api28Impl.a(context);
    }

    public static Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? Api33Impl.a(context, broadcastReceiver, intentFilter, str, handler, i) : Api26Impl.a(context, broadcastReceiver, intentFilter, str, handler, i);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        e(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static void g(Context context, Intent intent) {
        Api26Impl.b(context, intent);
    }
}
