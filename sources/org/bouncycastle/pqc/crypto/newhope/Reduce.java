package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes8.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    public static short barrett(short s) {
        int i = s & HPKE.aead_EXPORT_ONLY;
        return (short) (i - (((i * 5) >>> 16) * 12289));
    }

    public static short montgomery(int i) {
        return (short) (((((i * QInv) & RMask) * 12289) + i) >>> 18);
    }
}
