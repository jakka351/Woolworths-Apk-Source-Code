package com.fasterxml.jackson.databind.util;

/* loaded from: classes4.dex */
public class NativeImageUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f14335a;

    static {
        f14335a = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    public static boolean a(Class cls) {
        return f14335a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode")) && (cls.getDeclaredFields().length == 0 || ClassUtil.z(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
    }
}
