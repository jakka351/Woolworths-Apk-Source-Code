package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public abstract class jjkkjjj {
    public static final jjkkjjj b00620062b0062b0062;
    public static final jjkkjjj bb0062b0062b0062 = new xllxlxl();
    public static final jjkkjjj bbb00620062b0062;
    public static int g006700670067g00670067 = 1;
    public static int g0067g0067g00670067 = 96;
    public static int gg00670067g00670067 = 0;
    public static int gggg006700670067 = 2;

    static {
        xxlxlxl xxlxlxlVar = new xxlxlxl();
        int i = g0067g0067g00670067;
        if (((g006700670067g00670067 + i) * i) % g0067gg006700670067() != 0) {
            g0067g0067g00670067 = gg0067g006700670067();
            gg00670067g00670067 = 19;
        }
        b00620062b0062b0062 = xxlxlxlVar;
        bbb00620062b0062 = new jkjkjjj();
    }

    public static int g0067gg006700670067() {
        return 2;
    }

    public static int gg0067g006700670067() {
        return 18;
    }

    public static jjkkjjj r0072rr00720072r(int i) {
        if (i != 0) {
            return (63488 & i) != 0 ? bbb00620062b0062 : (i & 1920) != 0 ? b00620062b0062b0062 : bb0062b0062b0062;
        }
        int i2 = g0067g0067g00670067;
        int i3 = g006700670067g00670067;
        int i4 = ((i2 + i3) * i2) % gggg006700670067;
        if (((i3 + i2) * i2) % g0067gg006700670067() != 0) {
            g0067g0067g00670067 = gg0067g006700670067();
            gg00670067g00670067 = 32;
        }
        if (i4 != gg00670067g00670067) {
            g0067g0067g00670067 = 53;
            gg00670067g00670067 = 94;
        }
        return b00620062b0062b0062;
    }

    public abstract int r00720072r0072rr(int i);

    public abstract int r0072rr0072rr(int i);

    public abstract int rr0072r0072rr();

    public abstract boolean rrr00720072rr(int i);
}
