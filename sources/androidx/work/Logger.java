package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public abstract class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3904a = new Object();
    public static volatile LogcatLogger b;

    public static class LogcatLogger extends Logger {
        public final int c;

        public LogcatLogger(int i) {
            this.c = i;
        }

        @Override // androidx.work.Logger
        public final void a(String str, String str2) {
            if (this.c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void b(String str, String str2, Throwable th) {
            if (this.c <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public final void c(String str, String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void d(String str, String str2, Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public final void f(String str, String str2) {
            if (this.c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void h(String str, String str2) {
            if (this.c <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void i(String str, String str2, RuntimeException runtimeException) {
            if (this.c <= 5) {
                Log.w(str, str2, runtimeException);
            }
        }
    }

    public static Logger e() {
        LogcatLogger logcatLogger;
        synchronized (f3904a) {
            try {
                if (b == null) {
                    b = new LogcatLogger(3);
                }
                logcatLogger = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return logcatLogger;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(23, "WM-");
        if (length >= 20) {
            sbO.append(str.substring(0, 20));
        } else {
            sbO.append(str);
        }
        return sbO.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void h(String str, String str2);

    public abstract void i(String str, String str2, RuntimeException runtimeException);
}
