package androidx.media3.common.util;

@UnstableApi
/* loaded from: classes2.dex */
public final class Assertions {
    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void d(Object obj) {
        obj.getClass();
    }

    public static void e(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
