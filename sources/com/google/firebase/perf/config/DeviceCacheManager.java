package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.room.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.logging.AndroidLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@VisibleForTesting
/* loaded from: classes.dex */
public class DeviceCacheManager {
    public static final AndroidLogger c = AndroidLogger.e();
    public static DeviceCacheManager d;

    /* renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f15691a;
    public final ExecutorService b;

    public DeviceCacheManager(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            FirebaseApp.d();
            FirebaseApp firebaseAppD = FirebaseApp.d();
            firebaseAppD.a();
            return firebaseAppD.f15169a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized DeviceCacheManager b() {
        try {
            if (d == null) {
                d = new DeviceCacheManager(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public final synchronized void c(Context context) {
        if (this.f15691a == null && context != null) {
            this.b.execute(new b(4, this, context));
        }
    }

    public final void d(double d2, String str) {
        if (this.f15691a == null) {
            c(a());
            if (this.f15691a == null) {
                return;
            }
        }
        this.f15691a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void e(long j, String str) {
        if (this.f15691a == null) {
            c(a());
            if (this.f15691a == null) {
                return;
            }
        }
        this.f15691a.edit().putLong(str, j).apply();
    }

    public final void f(String str, String str2) {
        if (this.f15691a == null) {
            c(a());
            if (this.f15691a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f15691a.edit().remove(str).apply();
        } else {
            c.v(this.f15691a, str, str2);
        }
    }

    public final void g(String str, boolean z) {
        if (this.f15691a == null) {
            c(a());
            if (this.f15691a == null) {
                return;
            }
        }
        this.f15691a.edit().putBoolean(str, z).apply();
    }
}
