package com.google.firebase.perf.logging;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class AndroidLogger {
    public static volatile AndroidLogger c;

    /* renamed from: a, reason: collision with root package name */
    public final LogWrapper f15702a;
    public boolean b = false;

    public AndroidLogger() {
        LogWrapper logWrapper;
        synchronized (LogWrapper.class) {
            try {
                if (LogWrapper.f15703a == null) {
                    LogWrapper.f15703a = new LogWrapper();
                }
                logWrapper = LogWrapper.f15703a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15702a = logWrapper;
    }

    public static AndroidLogger e() {
        if (c == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (c == null) {
                        c = new AndroidLogger();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.b) {
            this.f15702a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f15702a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void c(String str) {
        if (this.b) {
            this.f15702a.getClass();
            Log.e("FirebasePerformance", str);
        }
    }

    public final void d(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f15702a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void f(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f15702a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void g(String str) {
        if (this.b) {
            this.f15702a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void h(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f15702a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
