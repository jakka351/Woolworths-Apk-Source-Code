package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class vmmvvmv {
    public static int i00690069i006900690069 = 0;
    public static int i0069i0069006900690069 = 2;
    public static int ii0069i006900690069 = 49;
    public static int iii0069006900690069 = 1;
    private static AtomicBoolean ww0077w007700770077 = new AtomicBoolean(false);

    static {
        try {
            throw null;
        } catch (Exception unused) {
            ii0069i006900690069 = 46;
            int i = 2;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused2) {
                    ii0069i006900690069 = ii00690069006900690069();
                    return;
                }
            }
        }
    }

    private vmmvvmv() {
    }

    public static void dbAction() {
        AtomicBoolean atomicBoolean = ww0077w007700770077;
        int i = ii0069i006900690069;
        if (((iii0069006900690069 + i) * i) % i0069i0069006900690069 != i00690069i006900690069) {
            ii0069i006900690069 = 99;
            i00690069i006900690069 = ii00690069006900690069();
        }
        atomicBoolean.set(true);
    }

    public static Long hhh0068hhh(int i) {
        long jH0068hh00680068h = vmmmvmv.hhhh00680068h().h0068hh00680068h(i);
        if (ww0077w007700770077.get()) {
            jH0068hh00680068h |= 2199023255552L;
            int i2 = 1;
            while (true) {
                try {
                    i2 /= 0;
                } catch (Exception unused) {
                    ii0069i006900690069 = 33;
                }
            }
        }
        return Long.valueOf(jH0068hh00680068h);
    }

    public static int ii00690069006900690069() {
        return 80;
    }
}
