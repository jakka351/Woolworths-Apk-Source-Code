package kotlin.jvm.internal;

import YU.a;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes.dex */
public class Intrinsics {

    @SinceKotlin
    /* loaded from: classes7.dex */
    public static class Kotlin {
    }

    public static boolean a(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static boolean b(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        l(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void e(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        l(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        l(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a.g(str, " must not be null"));
        l(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(k(str));
        l(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(k(str));
        l(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbV = a.v("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbV.append(str);
        return sbV.toString();
    }

    public static void l(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static void n() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        l(kotlinNullPointerException, Intrinsics.class.getName());
        throw kotlinNullPointerException;
    }

    public static void o() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void p(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(a.h("lateinit property ", str, " has not been initialized"));
        l(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
