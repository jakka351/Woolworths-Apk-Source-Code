package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public class vvmmvvm {
    public static int d00640064dd00640064 = 1;
    public static int d0064ddd00640064 = 16;
    public static int dd0064dd00640064 = 0;
    public static int ddd0064d00640064 = 2;
    public static Object p007000700070ppp = new Object();
    public static long p00700070pppp = 0;
    public static boolean p0070p0070ppp = false;
    public static long pp00700070ppp = 2;
    public static long ppp0070ppp = 1;

    static {
        int i = d0064ddd00640064;
        if (((d00640064dd00640064 + i) * i) % ddd0064d00640064 != dd0064dd00640064) {
            d0064ddd00640064 = d0064d0064d00640064();
            dd0064dd00640064 = d0064d0064d00640064();
        }
        p00700070pppp = 6821995055224618566L;
        ppp0070ppp = 5093555657761125437L;
    }

    public static int d0064d0064d00640064() {
        return 89;
    }

    public static long h006800680068h00680068() {
        long j = p00700070pppp;
        long j2 = ppp0070ppp;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        p00700070pppp = (hh00680068h00680068(j, 55) ^ j4) ^ (j4 << 14);
        if ((d0064d0064d00640064() * (d0064d0064d00640064() + d00640064dd00640064)) % ddd0064d00640064 != dd0064dd00640064) {
            d0064ddd00640064 = d0064d0064d00640064();
            dd0064dd00640064 = 33;
        }
        ppp0070ppp = hh00680068h00680068(j4, 36);
        return j3;
    }

    public static long hh00680068h00680068(long j, int i) {
        int i2 = d0064ddd00640064;
        if (((d00640064dd00640064 + i2) * i2) % ddd0064d00640064 != dd0064dd00640064) {
            d0064ddd00640064 = 63;
            dd0064dd00640064 = 3;
        }
        return (j >> (64 - i)) | (j << i);
    }

    public static int hhhh006800680068() {
        if (!p0070p0070ppp) {
            synchronized (p007000700070ppp) {
                try {
                    if (!p0070p0070ppp) {
                        for (long j = 0; j < 10; j++) {
                            pp00700070ppp = h006800680068h00680068();
                        }
                        p0070p0070ppp = true;
                    }
                } finally {
                }
            }
        }
        return (int) pp00700070ppp;
    }
}
