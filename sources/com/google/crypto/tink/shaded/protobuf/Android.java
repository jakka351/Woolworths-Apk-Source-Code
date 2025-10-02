package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class Android {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f15076a;
    public static final boolean b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f15076a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        b = cls2 != null;
    }

    public static boolean a() {
        return (f15076a == null || b) ? false : true;
    }
}
