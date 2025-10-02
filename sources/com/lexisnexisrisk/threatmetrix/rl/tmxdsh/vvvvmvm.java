package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public class vvvvmvm {
    public static int d0064d0064006400640064 = 0;
    public static int ddd0064006400640064 = 37;
    public static long p0070007000700070pp = 0;
    public static long p0070p00700070pp = 0;
    public static boolean pp007000700070pp = false;
    public static long ppp00700070pp = 0;
    public static Object ppppp0070p = null;
    public static int s0073sssss = 2;
    public static int ss0073ssss = 1;

    static {
        int i = ddd0064006400640064;
        if (((ss0073ssss + i) * i) % s0073sssss != 0) {
            ddd0064006400640064 = s00730073ssss();
            d0064d0064006400640064 = 87;
        }
        pp007000700070pp = false;
        p0070007000700070pp = 2L;
        ppppp0070p = new Object();
        ppp00700070pp = -6706306112949763315L;
        p0070p00700070pp = -5999830938915426496L;
    }

    public static int dd00640064006400640064() {
        return 1;
    }

    public static int h00680068h006800680068() {
        if (!pp007000700070pp) {
            synchronized (ppppp0070p) {
                try {
                    if (!pp007000700070pp) {
                        for (long j = 0; j < 10; j++) {
                            p0070007000700070pp = hhh0068006800680068();
                        }
                        pp007000700070pp = true;
                    }
                } finally {
                }
            }
        }
        return (int) p0070007000700070pp;
    }

    public static long hhh0068006800680068() {
        if (((dd00640064006400640064() + ddd0064006400640064) * ddd0064006400640064) % s0073sssss != d0064d0064006400640064) {
            ddd0064006400640064 = 96;
            d0064d0064006400640064 = 49;
        }
        long j = ppp00700070pp;
        long j2 = p0070p00700070pp;
        long j3 = j2 + j;
        ppp00700070pp = j2;
        long j4 = j ^ (j << 23);
        p0070p00700070pp = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }

    public static int s00730073ssss() {
        return 72;
    }
}
