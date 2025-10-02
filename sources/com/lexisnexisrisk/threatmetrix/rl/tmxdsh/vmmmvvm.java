package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public class vmmmvvm {
    public static int d006400640064d00640064 = 0;
    public static int d00640064d006400640064 = 2;
    public static int dd00640064d00640064 = 79;
    public static int dddd006400640064 = 1;
    public static Object p00700070p0070pp = new Object();
    public static boolean p0070pp0070pp = false;
    public static long pp0070p0070pp = 1;
    public static long pppp0070pp;

    static {
        int i = dd00640064d00640064;
        if (((dddd006400640064 + i) * i) % d00640064d006400640064 != 0) {
            dd00640064d00640064 = dd0064d006400640064();
            d006400640064d00640064 = dd0064d006400640064();
        }
        pppp0070pp = -4997746369343881710L;
    }

    public static int d0064dd006400640064() {
        return 2;
    }

    public static int dd0064d006400640064() {
        return 82;
    }

    public static long h0068hh006800680068() {
        long j = pppp0070pp - 7046029254386353131L;
        pppp0070pp = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        int i = dd00640064d00640064;
        if (((dddd006400640064 + i) * i) % d0064dd006400640064() != d006400640064d00640064) {
            dd00640064d00640064 = 9;
            d006400640064d00640064 = dd0064d006400640064();
        }
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }

    public static int hh0068h006800680068() {
        if (!p0070pp0070pp) {
            synchronized (p00700070p0070pp) {
                try {
                    if (!p0070pp0070pp) {
                        for (long j = 0; j < 10; j++) {
                            pp0070p0070pp = h0068hh006800680068();
                        }
                        p0070pp0070pp = true;
                    }
                } finally {
                }
            }
        }
        return (int) pp0070p0070pp;
    }
}
