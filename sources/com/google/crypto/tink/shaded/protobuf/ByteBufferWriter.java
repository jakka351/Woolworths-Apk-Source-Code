package com.google.crypto.tink.shaded.protobuf;

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
                if (UnsafeUtil.f) {
                    UnsafeUtil.d.n(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
