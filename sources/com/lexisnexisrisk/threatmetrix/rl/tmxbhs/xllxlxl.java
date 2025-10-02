package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import YU.a;

/* loaded from: classes6.dex */
public final class xllxlxl extends jjkkjjj {
    private static final int b006200620062b0062b = 127;
    private static final int b0062b0062b0062b = 1;
    private static final int bb00620062b0062b = 128;
    public static int p00700070pp00700070 = 1;
    public static int pp007000700070p0070 = 28;
    public static int pp0070pp00700070 = 0;
    public static int ppppp00700070 = 2;

    public static int p0070007000700070p0070() {
        return 1;
    }

    public static int p0070ppp00700070() {
        return 40;
    }

    public static int ppp0070p00700070() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r00720072r0072rr(int i) {
        int i2 = pp007000700070p0070;
        if (((p00700070pp00700070 + i2) * i2) % ppppp00700070 != pp0070pp00700070) {
            pp007000700070p0070 = 53;
            pp0070pp00700070 = p0070ppp00700070();
            int i3 = pp007000700070p0070;
            if (((p00700070pp00700070 + i3) * i3) % ppppp00700070 != ppp0070p00700070()) {
                pp007000700070p0070 = 89;
                pp0070pp00700070 = 35;
            }
        }
        return i - 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r0072rr0072rr(int i) {
        int i2 = i % 127;
        if (i2 < 0) {
            i2 += 127;
            int i3 = pp007000700070p0070;
            int i4 = p00700070pp00700070;
            int i5 = ppppp00700070;
            if (((i3 + i4) * i3) % i5 != pp0070pp00700070) {
                pp007000700070p0070 = 75;
                pp0070pp00700070 = 83;
            }
            if (((i3 + i4) * pp007000700070p0070) % i5 != pp0070pp00700070) {
                pp007000700070p0070 = p0070ppp00700070();
                pp0070pp00700070 = 10;
            }
        }
        return i2 + 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int rr0072r0072rr() {
        int i = pp007000700070p0070;
        int iP0070007000700070p0070 = (p0070007000700070p0070() + i) * i;
        int i2 = ppppp00700070;
        if (iP0070007000700070p0070 % i2 == 0) {
            return 127;
        }
        pp007000700070p0070 = 37;
        if (a.z(37, p00700070pp00700070, 37, i2) != pp0070pp00700070) {
            pp007000700070p0070 = p0070ppp00700070();
            pp0070pp00700070 = p0070ppp00700070();
        }
        ppppp00700070 = p0070ppp00700070();
        return 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public boolean rrr00720072rr(int i) {
        if (i >= 1) {
            int i2 = pp007000700070p0070;
            if (((p00700070pp00700070 + i2) * i2) % ppppp00700070 != pp0070pp00700070) {
                pp007000700070p0070 = p0070ppp00700070();
                pp0070pp00700070 = 42;
            }
            if (i < 128) {
                return true;
            }
        }
        int i3 = pp007000700070p0070;
        if (((p00700070pp00700070 + i3) * i3) % ppppp00700070 != 0) {
            pp007000700070p0070 = p0070ppp00700070();
            pp0070pp00700070 = p0070ppp00700070();
        }
        return false;
    }
}
