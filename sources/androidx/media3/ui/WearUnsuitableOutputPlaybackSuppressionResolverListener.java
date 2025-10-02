package androidx.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@UnstableApi
/* loaded from: classes2.dex */
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    public static final long i = TimeUnit.MINUTES.toMillis(5);
    public final Context d;
    public final long e;
    public final SystemClock f;
    public final PowerManager.WakeLock g;
    public long h;

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        long j = i;
        Assertions.b(j >= 0);
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = j;
        this.f = Clock.f2906a;
        this.h = -9223372036854775807L;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock");
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            wakeLockNewWakeLock = null;
        }
        this.g = wakeLockNewWakeLock;
    }

    public static ComponentName C(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void L(Player player, Player.Events events) {
        int i2 = Util.f2928a;
        Context context = this.d;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            boolean zA = events.a(6);
            long j = this.e;
            SystemClock systemClock = this.f;
            PowerManager.WakeLock wakeLock = this.g;
            if ((!zA && !events.a(5)) || !player.l() || player.I() != 3) {
                if (events.a(6) && player.I() == 0 && this.h != -9223372036854775807L) {
                    systemClock.getClass();
                    if (android.os.SystemClock.elapsedRealtime() - this.h < j) {
                        this.h = -9223372036854775807L;
                        ((BasePlayer) player).E(true);
                        if (wakeLock != null) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ((BasePlayer) player).E(false);
            systemClock.getClass();
            this.h = android.os.SystemClock.elapsedRealtime();
            if (wakeLock != null && !wakeLock.isHeld()) {
                wakeLock.acquire(j);
            }
            if (events.a(5)) {
                Intent intentPutExtra = new Intent("com.android.settings.panel.action.MEDIA_OUTPUT").addFlags(268435456).putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
                ComponentName componentNameC = C(context, intentPutExtra);
                if (componentNameC != null) {
                    intentPutExtra.setComponent(componentNameC);
                    context.startActivity(intentPutExtra);
                    return;
                }
                Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CLOSE_ON_CONNECT", true).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                ComponentName componentNameC2 = C(context, intentPutExtra2);
                if (componentNameC2 != null) {
                    intentPutExtra2.setComponent(componentNameC2);
                    context.startActivity(intentPutExtra2);
                }
            }
        }
    }
}
