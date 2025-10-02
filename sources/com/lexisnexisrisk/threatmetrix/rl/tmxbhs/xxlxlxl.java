package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import YU.a;

/* loaded from: classes6.dex */
public final class xxlxlxl extends jjkkjjj {
    private static final int b00620062bb0062b = 2048;
    private static final int bb0062bb0062b = 127;
    private static final int bbb0062b0062b = 1921;
    public static int p0070pp0070p0070 = 1;
    public static int pp0070p0070p0070 = 2;
    public static int ppp00700070p0070 = 0;
    public static int pppp0070p0070 = 46;

    public static int p00700070p0070p0070() {
        return 44;
    }

    public static int p0070p00700070p0070() {
        return 2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r00720072r0072rr(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 127;
        if ((p00700070p0070p0070() * (p00700070p0070p0070() + p0070pp0070p0070)) % p0070p00700070p0070() != ppp00700070p0070) {
            pppp0070p0070 = 31;
            ppp00700070p0070 = p00700070p0070p0070();
        }
        return i2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r0072rr0072rr(int i) {
        int i2 = i % bbb0062b0062b;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 += bbb0062b0062b;
            }
            return i2 + 127;
        }
        int iP00700070p0070p0070 = p00700070p0070p0070() * (p00700070p0070p0070() + p0070pp0070p0070);
        int i3 = pp0070p0070p0070;
        int i4 = iP00700070p0070p0070 % i3;
        int i5 = pppp0070p0070;
        if (a.z(i5, p0070pp0070p0070, i5, i3) != ppp00700070p0070) {
            pppp0070p0070 = 15;
            ppp00700070p0070 = 86;
        }
        if (i4 != ppp00700070p0070) {
            pppp0070p0070 = 47;
            ppp00700070p0070 = p00700070p0070p0070();
        }
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int rr0072r0072rr() {
        int i = pppp0070p0070;
        if (((p0070pp0070p0070 + i) * i) % pp0070p0070p0070 != 0) {
            pppp0070p0070 = 53;
            p0070pp0070p0070 = 39;
        }
        return bbb0062b0062b;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public boolean rrr00720072rr(int i) {
        if (i < 0 || ((i > 0 && i < 128) || i >= 2048)) {
            return false;
        }
        int i2 = pppp0070p0070;
        int i3 = (p0070pp0070p0070 + i2) * i2;
        int iP00700070p0070p0070 = p00700070p0070p0070();
        if (((p0070pp0070p0070 + iP00700070p0070p0070) * iP00700070p0070p0070) % pp0070p0070p0070 != 0) {
            pppp0070p0070 = p00700070p0070p0070();
            ppp00700070p0070 = p00700070p0070p0070();
        }
        if (i3 % p0070p00700070p0070() != 0) {
            pppp0070p0070 = 21;
            ppp00700070p0070 = p00700070p0070p0070();
        }
        return true;
    }
}
