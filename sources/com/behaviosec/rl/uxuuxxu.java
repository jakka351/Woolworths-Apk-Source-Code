package com.behaviosec.rl;

/* loaded from: classes4.dex */
public abstract class uxuuxxu {
    public static int g006700670067g0067gg = 1;
    public static int g0067g0067g0067gg = 59;
    public static int gg0067g00670067gg = 0;
    public static int gggg00670067gg = 2;
    public static final uxuuxxu j006A006Aj006Aj006A;
    public static final uxuuxxu j006Ajj006Aj006A = new yylllll();
    public static final uxuuxxu jj006Aj006Aj006A;

    static {
        ylyllll ylyllllVar = new ylyllll();
        int iG0067gg00670067gg = g0067gg00670067gg();
        if (((g006700670067g0067gg + iG0067gg00670067gg) * iG0067gg00670067gg) % gggg00670067gg != 0) {
            g0067g0067g0067gg = 73;
            gg0067g00670067gg = g0067gg00670067gg();
        }
        jj006Aj006Aj006A = ylyllllVar;
        j006A006Aj006Aj006A = new uuuuxxu();
        if ((g0067gg00670067gg() * (g0067gg00670067gg() + g006700670067g0067gg)) % g00670067g00670067gg() != gg0067g00670067gg) {
            g0067g0067g0067gg = 47;
            gg0067g00670067gg = 18;
        }
    }

    public static int g00670067g00670067gg() {
        return 2;
    }

    public static int g0067gg00670067gg() {
        return 47;
    }

    public static int gg00670067g0067gg() {
        return 0;
    }

    public static uxuuxxu ppp00700070ppp(int i) {
        if (i == 0) {
            return jj006Aj006Aj006A;
        }
        int i2 = g0067g0067g0067gg;
        if (((g006700670067g0067gg + i2) * i2) % gggg00670067gg != gg00670067g0067gg()) {
            g0067g0067g0067gg = g0067gg00670067gg();
            g006700670067g0067gg = 53;
        }
        if ((63488 & i) != 0) {
            return j006A006Aj006Aj006A;
        }
        int i3 = g0067g0067g0067gg;
        if (((g006700670067g0067gg + i3) * i3) % gggg00670067gg != gg00670067g0067gg()) {
            g0067g0067g0067gg = 30;
            g006700670067g0067gg = g0067gg00670067gg();
        }
        return (i & 1920) != 0 ? jj006Aj006Aj006A : j006Ajj006Aj006A;
    }

    public abstract int r00720072r007200720072();

    public abstract boolean r0072r0072007200720072(int i);

    public abstract int rr0072r007200720072(int i);

    public abstract int rrr0072007200720072(int i);
}
