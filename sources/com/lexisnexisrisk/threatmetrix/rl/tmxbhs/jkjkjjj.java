package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import YU.a;

/* loaded from: classes6.dex */
public final class jkjkjjj extends jjkkjjj {
    private static final int b006200620062bb0062 = 2048;
    private static final int b0062bb0062b0062 = 63488;
    private static final int bbbb0062b0062 = 65536;
    public static int g0067006700670067g0067 = 1;
    public static int g0067g00670067g0067 = 49;
    public static int gg006700670067g0067 = 0;
    public static int ggggg00670067 = 2;

    public static int g00670067gg00670067() {
        return 0;
    }

    public static int g0067ggg00670067() {
        return 15;
    }

    public static int gg0067gg00670067() {
        return 2;
    }

    public static int ggg0067g00670067() {
        return 1;
    }

    private static int rrrr00720072r(int i, int i2) {
        int i3 = i % i2;
        int i4 = g0067g00670067g0067;
        int i5 = g0067006700670067g0067;
        int i6 = ggggg00670067;
        int i7 = ((i4 + i5) * i4) % i6;
        int i8 = gg006700670067g0067;
        if (i7 != i8) {
            if (a.z(i4, i5, i4, i6) != i8) {
                g0067g00670067g0067 = g0067ggg00670067();
                gg006700670067g0067 = g0067ggg00670067();
            }
            g0067g00670067g0067 = 49;
            gg006700670067g0067 = g0067ggg00670067();
        }
        return i3 < 0 ? i3 + i2 : i3;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r00720072r0072rr(int i) {
        int iG0067ggg00670067 = g0067ggg00670067() * (g0067ggg00670067() + g0067006700670067g0067);
        int i2 = ggggg00670067;
        if (iG0067ggg00670067 % i2 != gg006700670067g0067) {
            g0067g00670067g0067 = 83;
            gg006700670067g0067 = 77;
        }
        int i3 = g0067g00670067g0067;
        if (a.z(i3, g0067006700670067g0067, i3, i2) != gg006700670067g0067) {
            g0067g00670067g0067 = 43;
            gg006700670067g0067 = 16;
        }
        return i - 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int r0072rr0072rr(int i) {
        int iRrrr00720072r = rrrr00720072r(i, b0062bb0062b0062);
        if (((ggg0067g00670067() + g0067g00670067g0067) * g0067g00670067g0067) % ggggg00670067 != g00670067gg00670067()) {
            g0067g00670067g0067 = g0067ggg00670067();
            gg006700670067g0067 = 7;
        }
        return iRrrr00720072r + 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public int rr0072r0072rr() {
        int i = g0067g00670067g0067;
        if (((g0067006700670067g0067 + i) * i) % gg0067gg00670067() != 0) {
            g0067g00670067g0067 = 75;
            gg006700670067g0067 = g0067ggg00670067();
        }
        return b0062bb0062b0062;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkkjjj
    public boolean rrr00720072rr(int i) {
        int i2 = g0067g00670067g0067;
        int i3 = g0067006700670067g0067;
        int i4 = (i2 + i3) * i2;
        int i5 = ggggg00670067;
        if (i4 % i5 != 0) {
            g0067g00670067g0067 = 77;
            gg006700670067g0067 = 99;
            if (a.z(77, i3, 77, i5) != 99) {
                g0067g00670067g0067 = g0067ggg00670067();
                gg006700670067g0067 = g0067ggg00670067();
            }
        }
        return i >= 2048 && i < bbbb0062b0062;
    }
}
