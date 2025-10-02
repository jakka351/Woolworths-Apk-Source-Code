package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public class jxjxxjx {
    public static long l006C006C006C006C006Cl = 6265216212732089191L;
    public static Object l006C006Clll006C = new Object();
    public static boolean l006Cllll006C = false;
    public static long ll006Clll006C = 2;
    public static long llllll006C = -3263945266550434992L;

    public static long s0073007300730073sss(long j, int i) {
        return (j >> (64 - i)) | (j << i);
    }

    public static int s0073sss0073ss() {
        if (!l006Cllll006C) {
            synchronized (l006C006Clll006C) {
                try {
                    if (!l006Cllll006C) {
                        for (long j = 0; j < 10; j++) {
                            ll006Clll006C = sssss0073ss();
                        }
                        l006Cllll006C = true;
                    }
                } finally {
                }
            }
        }
        return (int) ll006Clll006C;
    }

    public static long sssss0073ss() {
        long j = l006C006C006C006C006Cl;
        long j2 = llllll006C;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        l006C006C006C006C006Cl = (s0073007300730073sss(j, 55) ^ j4) ^ (j4 << 14);
        llllll006C = s0073007300730073sss(j4, 36);
        return j3;
    }
}
