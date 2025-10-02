package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class yylylll {
    public static int c00630063c0063006300630063 = 0;
    public static int c0063c00630063006300630063 = 2;
    public static int cc006300630063006300630063 = 32;
    public static int ccc00630063006300630063 = 1;
    public static Object j006A006A006Ajjj = null;
    public static long j006A006Ajjjj = 0;
    public static boolean j006Aj006Ajjj = false;
    public static long jj006A006Ajjj = 0;
    public static long jjj006Ajjj = 1;

    static {
        int i = cc006300630063006300630063;
        if (((ccc00630063006300630063 + i) * i) % c0063c00630063006300630063 != 0) {
            cc006300630063006300630063 = 4;
            c00630063c0063006300630063 = 51;
        }
        jj006A006Ajjj = 2L;
        j006A006A006Ajjj = new Object();
        j006A006Ajjjj = -2610842317503876936L;
        jjj006Ajjj = 6242835425223251637L;
    }

    public static int cc0063c0063006300630063() {
        return 79;
    }

    public static long r00720072rr00720072(long j, int i) {
        long j2 = j << i;
        if ((cc0063c0063006300630063() * (cc0063c0063006300630063() + ccc00630063006300630063)) % c0063c00630063006300630063 != c00630063c0063006300630063) {
            c00630063c0063006300630063 = 43;
        }
        return (j >> (64 - i)) | j2;
    }

    public static int r0072r0072r00720072() {
        if (!j006Aj006Ajjj) {
            synchronized (j006A006A006Ajjj) {
                try {
                    if (!j006Aj006Ajjj) {
                        for (long j = 0; j < 10; j++) {
                            jj006A006Ajjj = rrr0072r00720072();
                        }
                        j006Aj006Ajjj = true;
                    }
                } finally {
                }
            }
        }
        return (int) jj006A006Ajjj;
    }

    public static long rrr0072r00720072() {
        long j = j006A006Ajjjj;
        long j2 = jjj006Ajjj;
        long j3 = j + j2;
        int i = cc006300630063006300630063;
        if (((ccc00630063006300630063 + i) * i) % c0063c00630063006300630063 != 0) {
            cc006300630063006300630063 = 20;
            c00630063c0063006300630063 = 74;
        }
        long j4 = j2 ^ j;
        j006A006Ajjjj = (r00720072rr00720072(j, 55) ^ j4) ^ (j4 << 14);
        jjj006Ajjj = r00720072rr00720072(j4, 36);
        return j3;
    }
}
