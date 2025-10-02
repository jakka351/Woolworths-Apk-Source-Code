package androidx.camera.core;

import android.util.Log;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public final class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static int f413a = 3;

    public static void a(String str, String str2) {
        if (d(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (d(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (d(6, str)) {
            Log.e(str, str2, th);
        }
    }

    public static boolean d(int i, String str) {
        return f413a <= i || Log.isLoggable(str, i);
    }

    public static void e(String str, String str2) {
        if (d(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        if (d(5, str)) {
            Log.w(str, str2, th);
        }
    }
}
