package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public class kukukku {
    public static int i00690069006900690069i = 1;
    public static int i0069i006900690069i = 88;
    public static int ii0069006900690069i = 0;
    public static int iiiiii0069 = 2;
    public static long r007200720072rr0072 = 0;
    public static long r0072r0072rr0072 = 1;
    public static boolean rr00720072rr0072 = false;
    public static long rrr0072rr0072;
    public static Object rrrr0072r0072;

    static {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                i0069i006900690069i = i0069iiii0069();
                r007200720072rr0072 = 2L;
                rrrr0072r0072 = new Object();
                rrr0072rr0072 = 2772396713820017912L;
                r0072r0072rr0072 = -2494122140096404772L;
                return;
            }
        }
    }

    public static int i0069iiii0069() {
        return 9;
    }

    public static int k006B006B006B006B006Bk() {
        if (!rr00720072rr0072) {
            synchronized (rrrr0072r0072) {
                try {
                    if (!rr00720072rr0072) {
                        for (long j = 0; j < 10; j++) {
                            r007200720072rr0072 = kkkkkk006B();
                        }
                        rr00720072rr0072 = true;
                    }
                } finally {
                }
            }
        }
        return (int) r007200720072rr0072;
    }

    public static long kkkkkk006B() {
        long j = rrr0072rr0072;
        long j2 = r0072r0072rr0072;
        int i = i0069i006900690069i;
        if (((i00690069006900690069i + i) * i) % iiiiii0069 != ii0069006900690069i) {
            i0069i006900690069i = i0069iiii0069();
            ii0069006900690069i = 83;
        }
        long j3 = j2 + j;
        rrr0072rr0072 = j2;
        long j4 = j ^ (j << 23);
        r0072r0072rr0072 = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }
}
