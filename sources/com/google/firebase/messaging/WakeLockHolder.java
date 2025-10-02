package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class WakeLockHolder {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15658a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static WakeLock c;

    public static void a(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (b) {
            try {
                if (c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.acquire(f15658a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
