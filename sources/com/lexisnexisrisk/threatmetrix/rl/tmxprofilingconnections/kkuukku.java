package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public class kkuukku {
    public static int i006900690069ii0069 = 15;
    public static int ii00690069ii0069 = 2;
    public static int iiii0069i0069 = 1;
    public static long r00720072r0072r0072 = 1;
    public static long r0072rr0072r0072 = 0;
    public static boolean rr0072r0072r0072 = false;
    public static Object rrr00720072r0072;

    static {
        Object obj = new Object();
        int i = i006900690069ii0069;
        if (((iiii0069i0069 + i) * i) % ii00690069ii0069 != 0) {
            i006900690069ii0069 = iii0069ii0069();
            iiii0069i0069 = 37;
        }
        rrr00720072r0072 = obj;
        r0072rr0072r0072 = 7809135824592986561L;
    }

    public static int i0069i0069ii0069() {
        return 1;
    }

    public static int iii0069ii0069() {
        return 80;
    }

    public static long k006Bkkkk006B() {
        long j = r0072rr0072r0072 - 7046029254386353131L;
        r0072rr0072r0072 = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        int iIii0069ii0069 = iii0069ii0069();
        if (((i0069i0069ii0069() + iIii0069ii0069) * iIii0069ii0069) % ii00690069ii0069 != 0) {
            ii00690069ii0069 = iii0069ii0069();
        }
        return j3 ^ (j3 >> 31);
    }

    public static int kk006Bkkk006B() {
        if (!rr0072r0072r0072) {
            synchronized (rrr00720072r0072) {
                try {
                    if (!rr0072r0072r0072) {
                        for (long j = 0; j < 10; j++) {
                            r00720072r0072r0072 = k006Bkkkk006B();
                        }
                        rr0072r0072r0072 = true;
                    }
                } finally {
                }
            }
        }
        return (int) r00720072r0072r0072;
    }
}
