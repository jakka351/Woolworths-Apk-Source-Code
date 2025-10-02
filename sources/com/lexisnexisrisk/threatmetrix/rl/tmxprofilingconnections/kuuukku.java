package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public class kuuukku {
    public static int i00690069i0069i0069 = 1;
    public static int i0069i00690069i0069 = 96;
    public static int ii0069i0069i0069 = 0;
    public static int iii00690069i0069 = 2;
    public static boolean r0072007200720072r0072;
    public static long r0072r00720072r0072;
    public static Object r0072rrr00720072;
    public static long rr007200720072r0072;
    public static long rrrrr00720072;

    static {
        int i = i0069i00690069i0069;
        if (((i00690069i0069i0069 + i) * i) % iii00690069i0069 != ii0069i0069i0069) {
            i0069i00690069i0069 = 87;
            ii0069i0069i0069 = i0069ii0069i0069();
        }
        r0072007200720072r0072 = false;
        rrrrr00720072 = 2L;
        r0072rrr00720072 = new Object();
        r0072r00720072r0072 = -6475891230947340318L;
        rr007200720072r0072 = -1266595958516579727L;
    }

    public static int i0069ii0069i0069() {
        return 35;
    }

    public static int ii006900690069i0069() {
        return 1;
    }

    public static long k006B006Bkkk006B(long j, int i) {
        long j2 = j << i;
        if ((i0069ii0069i0069() * (i0069ii0069i0069() + i00690069i0069i0069)) % iii00690069i0069 != ii0069i0069i0069) {
            ii0069i0069i0069 = 1;
        }
        return (j >> (64 - i)) | j2;
    }

    public static int k006Bk006Bkk006B() {
        if (!r0072007200720072r0072) {
            synchronized (r0072rrr00720072) {
                try {
                    if (!r0072007200720072r0072) {
                        for (long j = 0; j < 10; j++) {
                            rrrrr00720072 = kkk006Bkk006B();
                        }
                        r0072007200720072r0072 = true;
                    }
                } finally {
                }
            }
        }
        return (int) rrrrr00720072;
    }

    public static long kkk006Bkk006B() {
        long j = r0072r00720072r0072;
        long j2 = rr007200720072r0072;
        int i = i0069i00690069i0069;
        if (((ii006900690069i0069() + i) * i) % iii00690069i0069 != 0) {
            i0069i00690069i0069 = 2;
            ii0069i0069i0069 = i0069ii0069i0069();
        }
        long j3 = j + j2;
        long j4 = j2 ^ j;
        r0072r00720072r0072 = (k006B006Bkkk006B(j, 55) ^ j4) ^ (j4 << 14);
        rr007200720072r0072 = k006B006Bkkk006B(j4, 36);
        return j3;
    }
}
