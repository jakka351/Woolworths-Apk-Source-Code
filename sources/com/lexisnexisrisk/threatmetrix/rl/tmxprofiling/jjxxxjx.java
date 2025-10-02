package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public class jjxxxjx {
    public static Object l006C006C006Cll006C = new Object();
    public static boolean l006Cl006Cll006C = false;
    public static long ll006C006Cll006C = 1;
    public static long lll006Cll006C = -6703109800581178648L;

    public static int s00730073ss0073ss() {
        if (!l006Cl006Cll006C) {
            synchronized (l006C006C006Cll006C) {
                try {
                    if (!l006Cl006Cll006C) {
                        for (long j = 0; j < 10; j++) {
                            ll006C006Cll006C = ss0073ss0073ss();
                        }
                        l006Cl006Cll006C = true;
                    }
                } finally {
                }
            }
        }
        return (int) ll006C006Cll006C;
    }

    public static long ss0073ss0073ss() {
        long j = lll006Cll006C - 7046029254386353131L;
        lll006Cll006C = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }
}
