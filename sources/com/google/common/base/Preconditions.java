package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public final class Preconditions {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return Strings.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Strings.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(YU.a.d(i2, "negative size: "));
    }

    public static void b(int i, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(Strings.b(str, Integer.valueOf(i)));
        }
    }

    public static void c(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(Strings.b(str, Long.valueOf(j)));
        }
    }

    public static void d(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(Strings.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void e(String str, Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(Strings.b(str, obj));
        }
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.b(str, obj, obj2));
        }
    }

    public static void i(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = Strings.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(YU.a.d(i2, "negative size: "));
                }
                strB = Strings.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void k(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(Strings.b(str, obj2));
        }
    }

    public static void l(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, "index"));
        }
    }

    public static void m(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? a(i, i3, "start index") : (i2 < 0 || i2 > i3) ? a(i2, i3, "end index") : Strings.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void n(int i, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(Strings.b(str, Integer.valueOf(i)));
        }
    }

    public static void o(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(Strings.b(str, Long.valueOf(j)));
        }
    }

    public static void p(String str, Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(Strings.b(str, obj));
        }
    }

    public static void q(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void r(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
