package org.tensorflow.lite.support.metadata;

import YU.a;

/* loaded from: classes8.dex */
final class Preconditions {
    public static void a(int i, int i2, String str) {
        String str2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str2 = str + " (" + i + ") must not be negative";
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.d(i2, "negative size: "));
                }
                str2 = str + " (" + i + ") must be less than size (" + i2 + ")";
            }
            throw new IndexOutOfBoundsException(str2);
        }
    }
}
