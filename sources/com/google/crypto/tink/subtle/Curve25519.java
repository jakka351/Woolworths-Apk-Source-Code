package com.google.crypto.tink.subtle;

import com.google.crypto.tink.annotations.Alpha;

@Alpha
/* loaded from: classes6.dex */
final class Curve25519 {
    public static void a(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            long j = jArr[i3];
            jArr[i3] = ((int) j) ^ ((((int) j) ^ ((int) jArr2[i3])) & i2);
        }
    }
}
