package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public final class jjjkjjj extends jjkkjjj {
    private static final int b0062b0062bb0062 = 1114112;
    private static final int bb00620062bb0062 = 1048576;
    private static final int bbb0062bb0062 = 65536;
    public static int g006700670067gg0067 = 1;
    public static int g00670067g0067g0067 = 0;
    public static int gg00670067gg0067 = 58;
    public static int gggg0067g0067 = 2;

    public static int g0067gg0067g0067() {
        return 46;
    }

    public static int gg0067g0067g0067() {
        return 1;
    }

    public static int ggg00670067g0067() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r00720072r0072rr(int i) {
        int i2 = i - bbb0062bb0062;
        int i3 = gg00670067gg0067;
        if (((g006700670067gg0067 + i3) * i3) % gggg0067g0067 != g00670067g0067g0067) {
            gg00670067gg0067 = g0067gg0067g0067();
            g00670067g0067g0067 = g0067gg0067g0067();
        }
        int i4 = gg00670067gg0067;
        if (((gg0067g0067g0067() + i4) * i4) % gggg0067g0067 != 0) {
            gg00670067gg0067 = 28;
            g006700670067gg0067 = 37;
        }
        return i2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r0072rr0072rr(int i) {
        int i2 = i % bb00620062bb0062;
        if (i2 < 0) {
            i2 += bb00620062bb0062;
            int i3 = gg00670067gg0067;
            if (((g006700670067gg0067 + i3) * i3) % gggg0067g0067 != g00670067g0067g0067) {
                gg00670067gg0067 = 30;
                g00670067g0067g0067 = g0067gg0067g0067();
                int i4 = gg00670067gg0067;
                if (((g006700670067gg0067 + i4) * i4) % gggg0067g0067 != 0) {
                    gg00670067gg0067 = 3;
                    g00670067g0067g0067 = g0067gg0067g0067();
                }
            }
        }
        return i2 + bbb0062bb0062;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int rr0072r0072rr() {
        int i = gg00670067gg0067;
        if (((g006700670067gg0067 + i) * i) % gggg0067g0067 != 0) {
            gg00670067gg0067 = 6;
            g006700670067gg0067 = 43;
        }
        return bb00620062bb0062;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public boolean rrr00720072rr(int i) {
        if (((gg0067g0067g0067() + gg00670067gg0067) * gg00670067gg0067) % gggg0067g0067 != g00670067g0067g0067) {
            gg00670067gg0067 = 8;
            g00670067g0067g0067 = g0067gg0067g0067();
        }
        boolean z = false;
        if (i < bbb0062bb0062) {
            return false;
        }
        if (i < b0062b0062bb0062) {
            int i2 = gg00670067gg0067;
            z = true;
            if (((g006700670067gg0067 + i2) * i2) % gggg0067g0067 != ggg00670067g0067()) {
                gg00670067gg0067 = 19;
                g00670067g0067g0067 = g0067gg0067g0067();
            }
        }
        return z;
    }
}
