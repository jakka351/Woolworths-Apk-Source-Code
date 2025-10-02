package org.tensorflow.lite.support.common.internal;

/* loaded from: classes8.dex */
public final class SupportPreconditions {
    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
