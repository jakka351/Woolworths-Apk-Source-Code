package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public class jxxxxjx {
    public static long l006C006Cl006Cl006C = 2;
    public static long l006Cll006Cl006C = -4941666308722581287L;
    public static boolean ll006Cl006Cl006C = false;
    public static Object lll006C006Cl006C = new Object();
    public static long llll006Cl006C = -932479725222775965L;

    public static long s0073s0073s0073ss() {
        long j = llll006Cl006C;
        long j2 = l006Cll006Cl006C;
        long j3 = j2 + j;
        llll006Cl006C = j2;
        long j4 = j ^ (j << 23);
        l006Cll006Cl006C = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }

    public static int sss0073s0073ss() {
        if (!ll006Cl006Cl006C) {
            synchronized (lll006C006Cl006C) {
                try {
                    if (!ll006Cl006Cl006C) {
                        for (long j = 0; j < 10; j++) {
                            l006C006Cl006Cl006C = s0073s0073s0073ss();
                        }
                        ll006Cl006Cl006C = true;
                    }
                } finally {
                }
            }
        }
        return (int) l006C006Cl006Cl006C;
    }
}
