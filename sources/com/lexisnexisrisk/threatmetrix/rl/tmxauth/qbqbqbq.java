package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class qbqbqbq {
    public static int i00690069i006900690069 = 1;
    public static int i0069ii006900690069 = 48;
    public static int ii0069i006900690069 = 0;
    public static int iii0069006900690069 = 2;
    private static AtomicBoolean ww007700770077ww = new AtomicBoolean(false);

    static {
        int i = i0069ii006900690069;
        if (((i00690069i006900690069 + i) * i) % iii0069006900690069 != 0) {
            i0069ii006900690069 = i0069i0069006900690069();
            ii0069i006900690069 = i0069i0069006900690069();
        }
    }

    private qbqbqbq() {
    }

    public static Long bb00620062b0062b(int i) {
        long jBbb0062bb0062 = qqqqbbq.b00620062bbb0062().bbb0062bb0062(i);
        boolean z = ww007700770077ww.get();
        int i2 = i0069ii006900690069;
        if (((i00690069i006900690069 + i2) * i2) % iii0069006900690069 != ii0069i006900690069) {
            i0069ii006900690069 = i0069i0069006900690069();
            ii0069i006900690069 = i0069i0069006900690069();
        }
        if (z) {
            jBbb0062bb0062 |= 2199023255552L;
        }
        return Long.valueOf(jBbb0062bb0062);
    }

    public static void dbAction() {
        ww007700770077ww.set(true);
    }

    public static int i0069i0069006900690069() {
        return 31;
    }
}
