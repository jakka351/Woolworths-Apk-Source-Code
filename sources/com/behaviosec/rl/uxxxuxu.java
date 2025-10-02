package com.behaviosec.rl;

import YU.a;

/* loaded from: classes4.dex */
public final class uxxxuxu extends uxuuxxu {
    public static int g006700670067gggg = 64;
    public static int g00670067g0067ggg = 0;
    public static int g0067gg0067ggg = 2;
    public static int gggg0067ggg = 1;
    private static final int j006A006Ajjj006A = 65536;
    private static final int j006Aj006Ajj006A = 1048576;
    private static final int jjj006Ajj006A = 1114112;

    public static int gg0067g0067ggg() {
        return 25;
    }

    public static int ggg00670067ggg() {
        return 2;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int r00720072r007200720072() {
        int i = g006700670067gggg;
        int i2 = gggg0067ggg;
        int i3 = (i + i2) * i;
        int i4 = g0067gg0067ggg;
        if (a.z(i, i2, i, i4) != g00670067g0067ggg) {
            g006700670067gggg = gg0067g0067ggg();
            g00670067g0067ggg = gg0067g0067ggg();
        }
        if (i3 % i4 != 0) {
            g006700670067gggg = 59;
            gggg0067ggg = gg0067g0067ggg();
        }
        return j006Aj006Ajj006A;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public boolean r0072r0072007200720072(int i) {
        return i >= j006A006Ajjj006A && i < jjj006Ajj006A;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rr0072r007200720072(int i) {
        int i2 = i % j006Aj006Ajj006A;
        if (i2 < 0) {
            int i3 = g006700670067gggg;
            int i4 = gggg0067ggg;
            if (((i3 + i4) * i3) % g0067gg0067ggg != g00670067g0067ggg) {
                g006700670067gggg = gg0067g0067ggg();
                g00670067g0067ggg = 23;
            }
            if (((i4 + i3) * i3) % g0067gg0067ggg != 0) {
                g006700670067gggg = 34;
                g00670067g0067ggg = gg0067g0067ggg();
            }
            i2 += j006Aj006Ajj006A;
        }
        return i2 + j006A006Ajjj006A;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rrr0072007200720072(int i) {
        int i2 = g006700670067gggg;
        if (((gggg0067ggg + i2) * i2) % g0067gg0067ggg != g00670067g0067ggg) {
            g006700670067gggg = gg0067g0067ggg();
            g00670067g0067ggg = 33;
        }
        return i - j006A006Ajjj006A;
    }
}
