package androidx.media3.common.util;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

@UnstableApi
/* loaded from: classes2.dex */
public final class Log {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2913a = new Object();
    public static final Logger b = Logger.f2914a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f2914a = new AnonymousClass1();

        /* renamed from: androidx.media3.common.util.Log$Logger$1, reason: invalid class name */
        public class AnonymousClass1 implements Logger {
        }
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        StringBuilder sbT = YU.a.t(str, "\n  ");
        sbT.append(strE.replace("\n", "\n  "));
        sbT.append('\n');
        return sbT.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f2913a) {
            android.util.Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f2913a) {
            android.util.Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f2913a) {
            android.util.Log.e(str, a(str2, th));
        }
    }

    public static String e(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (f2913a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void f(String str, String str2) {
        synchronized (f2913a) {
            android.util.Log.i(str, a(str2, null));
        }
    }

    public static void g(String str, String str2) {
        synchronized (f2913a) {
            android.util.Log.w(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (f2913a) {
            android.util.Log.w(str, a(str2, th));
        }
    }
}
