package com.google.protobuf;

/* loaded from: classes6.dex */
final class ByteBufferWriter {
    static {
        Class<?> cls;
        new ThreadLocal();
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                if (UnsafeUtil.e) {
                    UnsafeUtil.c.n(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
