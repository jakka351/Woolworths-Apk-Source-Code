package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Trace {

    /* renamed from: a, reason: collision with root package name */
    public static long f3776a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    public static void a(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.a(i, f(str));
            return;
        }
        String strF = f(str);
        try {
            if (c == null) {
                c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            c.invoke(null, Long.valueOf(f3776a), strF, Integer.valueOf(i));
        } catch (Exception e2) {
            c(e2, "asyncTraceBegin");
        }
    }

    public static void b(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.b(i, f(str));
            return;
        }
        String strF = f(str);
        try {
            if (d == null) {
                d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(f3776a), strF, Integer.valueOf(i));
        } catch (Exception e2) {
            c(e2, "asyncTraceEnd");
        }
    }

    public static void c(Exception exc, String str) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TraceApi29Impl.c();
        }
        try {
            if (b == null) {
                f3776a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(f3776a))).booleanValue();
        } catch (Exception e2) {
            c(e2, "isTagEnabled");
            return false;
        }
    }

    public static void e(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.d(i, f(str));
            return;
        }
        String strF = f(str);
        try {
            if (e == null) {
                e = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            e.invoke(null, Long.valueOf(f3776a), strF, Integer.valueOf(i));
        } catch (Exception e2) {
            c(e2, "traceCounter");
        }
    }

    public static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
