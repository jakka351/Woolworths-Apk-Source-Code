package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public class jjkjkjj {
    public static int l006C006Cll006Cl = 2;
    public static int l006Clll006Cl = 0;
    public static int ll006Cll006Cl = 1;
    public static int lllll006Cl = 45;
    public static long o006F006F006F006Foo = 0;
    public static long o006Fo006F006Foo = 1;
    public static boolean oo006F006F006Foo = false;
    public static long ooo006F006Foo;
    public static Object ooooo006Fo;

    static {
        int i = 2;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                lllll006Cl = lll006Cl006Cl();
                o006F006F006F006Foo = 2L;
                ooooo006Fo = new Object();
                ooo006F006Foo = -7831571027773320176L;
                o006Fo006F006Foo = -2825337039746956276L;
                return;
            }
        }
    }

    public static int lll006Cl006Cl() {
        return 69;
    }

    public static int r00720072rrr0072() {
        if (!oo006F006F006Foo) {
            synchronized (ooooo006Fo) {
                try {
                    if (!oo006F006F006Foo) {
                        for (long j = 0; j < 10; j++) {
                            o006F006F006F006Foo = rrr0072rr0072();
                        }
                        oo006F006F006Foo = true;
                    }
                } finally {
                }
            }
        }
        return (int) o006F006F006F006Foo;
    }

    public static long rrr0072rr0072() {
        long j = ooo006F006Foo;
        long j2 = o006Fo006F006Foo;
        long j3 = j2 + j;
        int i = lllll006Cl;
        if (((ll006Cll006Cl + i) * i) % l006C006Cll006Cl != l006Clll006Cl) {
            lllll006Cl = lll006Cl006Cl();
            l006Clll006Cl = lll006Cl006Cl();
        }
        ooo006F006Foo = j2;
        long j4 = j ^ (j << 23);
        o006Fo006F006Foo = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }
}
