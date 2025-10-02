package com.google.protobuf;

/* loaded from: classes.dex */
final class Android {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f16012a;
    public static final boolean b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f16012a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        b = cls2 != null;
    }

    public static boolean a() {
        return (f16012a == null || b) ? false : true;
    }
}
