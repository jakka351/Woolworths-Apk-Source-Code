package com.behaviosec.rl;

/* loaded from: classes4.dex */
public final class uuuuxxu extends uxuuxxu {
    public static int g0067006700670067ggg = 2;
    public static int g0067g00670067ggg = 68;
    public static int g0067ggg0067gg = 0;
    public static int gg006700670067ggg = 1;
    private static final int j006A006A006Ajj006A = 65536;
    private static final int jj006A006Ajj006A = 2048;
    private static final int jjjj006Aj006A = 63488;

    public static int g00670067gg0067gg() {
        return 1;
    }

    public static int gg0067gg0067gg() {
        return 0;
    }

    public static int ggg0067g0067gg() {
        return 2;
    }

    public static int ggggg0067gg() {
        return 46;
    }

    private static int p00700070p0070ppp(int i, int i2) {
        int i3 = i % i2;
        int i4 = g0067g00670067ggg;
        int i5 = gg006700670067ggg;
        int i6 = (i4 + i5) * i4;
        if (((i5 + i4) * i4) % g0067006700670067ggg != 0) {
            g0067g00670067ggg = ggggg0067gg();
            gg006700670067ggg = ggggg0067gg();
        }
        if (i6 % g0067006700670067ggg != 0) {
            g0067g00670067ggg = 73;
            gg006700670067ggg = 57;
        }
        return i3 < 0 ? i3 + i2 : i3;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int r00720072r007200720072() {
        int i = g0067g00670067ggg;
        if (((gg006700670067ggg + i) * i) % g0067006700670067ggg == g0067ggg0067gg) {
            return jjjj006Aj006A;
        }
        g0067g00670067ggg = ggggg0067gg();
        g0067ggg0067gg = ggggg0067gg();
        if ((ggggg0067gg() * (ggggg0067gg() + gg006700670067ggg)) % g0067006700670067ggg == g0067ggg0067gg) {
            return jjjj006Aj006A;
        }
        g0067g00670067ggg = 62;
        g0067ggg0067gg = ggggg0067gg();
        return jjjj006Aj006A;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public boolean r0072r0072007200720072(int i) {
        boolean z = false;
        if (i < 2048) {
            return false;
        }
        if (i < j006A006A006Ajj006A) {
            int i2 = g0067g00670067ggg;
            z = true;
            if (((gg006700670067ggg + i2) * i2) % ggg0067g0067gg() != g0067ggg0067gg) {
                g0067g00670067ggg = 97;
                g0067ggg0067gg = 31;
            }
        }
        return z;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rr0072r007200720072(int i) {
        int i2 = g0067g00670067ggg;
        if (((gg006700670067ggg + i2) * i2) % g0067006700670067ggg != gg0067gg0067gg()) {
            g0067g00670067ggg = 68;
            g0067ggg0067gg = 99;
        }
        int iP00700070p0070ppp = p00700070p0070ppp(i, jjjj006Aj006A);
        int i3 = g0067g00670067ggg;
        if (((gg006700670067ggg + i3) * i3) % g0067006700670067ggg != g0067ggg0067gg) {
            g0067g00670067ggg = ggggg0067gg();
            g0067ggg0067gg = ggggg0067gg();
        }
        return iP00700070p0070ppp + 2048;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rrr0072007200720072(int i) {
        int i2 = i - 2048;
        if (((g00670067gg0067gg() + g0067g00670067ggg) * g0067g00670067ggg) % g0067006700670067ggg != gg0067gg0067gg()) {
            int i3 = g0067g00670067ggg;
            if (((gg006700670067ggg + i3) * i3) % g0067006700670067ggg != 0) {
                g0067g00670067ggg = 78;
                g0067ggg0067gg = ggggg0067gg();
            }
            g0067g00670067ggg = 15;
            g0067ggg0067gg = 70;
        }
        return i2;
    }
}
