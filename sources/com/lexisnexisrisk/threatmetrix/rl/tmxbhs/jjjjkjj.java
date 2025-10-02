package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public class jjjjkjj {
    public static int l006C006C006Clll = 2;
    public static int l006Cl006Clll = 0;
    public static int ll006C006Clll = 1;
    public static int lll006Clll = 68;
    public static Object o006F006F006Fooo;
    public static long o006F006Foooo;
    public static boolean o006Fo006Fooo;
    public static long oo006F006Fooo;
    public static long ooo006Fooo;

    static {
        int i = lll006Clll;
        if (((ll006C006Clll + i) * i) % l006C006C006Clll != l006Cl006Clll) {
            lll006Clll = 79;
            l006Cl006Clll = 40;
        }
        o006Fo006Fooo = false;
        oo006F006Fooo = 2L;
        o006F006F006Fooo = new Object();
        o006F006Foooo = 5151658519157095849L;
        ooo006Fooo = -1532203037169036939L;
    }

    public static int llll006Cll() {
        return 87;
    }

    public static long r00720072007200720072r() {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                lll006Clll = 13;
                int i = 5;
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        lll006Clll = llll006Cll();
                        while (true) {
                            try {
                                int[] iArr2 = new int[-1];
                            } catch (Exception unused3) {
                                lll006Clll = llll006Cll();
                                long j = o006F006Foooo;
                                long j2 = ooo006Fooo;
                                long j3 = j + j2;
                                long j4 = j2 ^ j;
                                o006F006Foooo = (rr0072007200720072r(j, 55) ^ j4) ^ (j4 << 14);
                                ooo006Fooo = rr0072007200720072r(j4, 36);
                                return j3;
                            }
                        }
                    }
                }
            }
        }
    }

    public static long rr0072007200720072r(long j, int i) {
        long j2 = j << i;
        int i2 = lll006Clll;
        if (((ll006C006Clll + i2) * i2) % l006C006C006Clll != l006Cl006Clll) {
            lll006Clll = 32;
            l006Cl006Clll = llll006Cll();
        }
        return (j >> (64 - i)) | j2;
    }

    public static int rrrrrr0072() {
        if (!o006Fo006Fooo) {
            synchronized (o006F006F006Fooo) {
                try {
                    if (!o006Fo006Fooo) {
                        for (long j = 0; j < 10; j++) {
                            oo006F006Fooo = r00720072007200720072r();
                        }
                        o006Fo006Fooo = true;
                    }
                } finally {
                }
            }
        }
        return (int) oo006F006Fooo;
    }
}
