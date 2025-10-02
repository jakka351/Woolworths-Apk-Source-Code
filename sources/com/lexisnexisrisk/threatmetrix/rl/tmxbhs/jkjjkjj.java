package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public class jkjjkjj {
    public static int l006C006C006C006Cll = 2;
    public static int ll006C006C006Cll = 1;
    public static Object o006F006Fo006Foo = new Object();
    public static boolean o006Foo006Foo = false;
    public static long oo006Fo006Foo = 1;
    public static long oooo006Foo;

    static {
        int iL006Cl006C006Cll = l006Cl006C006Cll();
        if (((ll006C006C006Cll + iL006Cl006C006Cll) * iL006Cl006C006Cll) % l006C006C006C006Cll != 0) {
            ll006C006C006Cll = 32;
        }
        oooo006Foo = 8332907414948746388L;
    }

    public static int l006Cl006C006Cll() {
        return 74;
    }

    public static long r0072rrrr0072() {
        long j = oooo006Foo - 7046029254386353131L;
        oooo006Foo = j;
        int iL006Cl006C006Cll = l006Cl006C006Cll();
        if (((ll006C006C006Cll + iL006Cl006C006Cll) * iL006Cl006C006Cll) % l006C006C006C006Cll != 0) {
            ll006C006C006Cll = l006Cl006C006Cll();
        }
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }

    public static int rr0072rrr0072() {
        if (!o006Foo006Foo) {
            synchronized (o006F006Fo006Foo) {
                try {
                    if (!o006Foo006Foo) {
                        for (long j = 0; j < 10; j++) {
                            oo006Fo006Foo = r0072rrrr0072();
                        }
                        o006Foo006Foo = true;
                    }
                } finally {
                }
            }
        }
        return (int) oo006Fo006Foo;
    }
}
