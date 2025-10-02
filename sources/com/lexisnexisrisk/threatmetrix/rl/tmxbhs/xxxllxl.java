package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public final class xxxllxl {
    public static final int b00620062b00620062b = 57344;
    public static final int b0062bb00620062b = 56320;
    public static final int bb0062b00620062b = 56320;
    public static final int bbbb00620062b = 55296;
    public static int p007000700070p00700070 = 2;
    public static int p0070pp007000700070 = 0;
    public static int pp00700070p00700070 = 1;
    public static int pppp007000700070 = 71;
    private final int b0062b006200620062b;
    private int bb0062006200620062b;
    private final String bbb006200620062b;

    public xxxllxl(String str) {
        this.bbb006200620062b = str;
        this.b0062b006200620062b = str.length();
    }

    public static int p0070p0070p00700070() {
        return 22;
    }

    public int r0072r00720072rr() {
        String str = this.bbb006200620062b;
        int i = pppp007000700070;
        if (((pp00700070p00700070 + i) * i) % p007000700070p00700070 != p0070pp007000700070) {
            pppp007000700070 = 54;
            p0070pp007000700070 = p0070p0070p00700070();
        }
        int iP0070p0070p00700070 = p0070p0070p00700070();
        if (((pp00700070p00700070 + iP0070p0070p00700070) * iP0070p0070p00700070) % p007000700070p00700070 != 0) {
            pp00700070p00700070 = 35;
        }
        char cCharAt = str.charAt(this.bb0062006200620062b);
        this.bb0062006200620062b++;
        return cCharAt & 65535;
    }

    public boolean rr007200720072rr() {
        if (this.bb0062006200620062b >= this.b0062b006200620062b) {
            return false;
        }
        int i = pppp007000700070;
        if (((pp00700070p00700070 + i) * i) % p007000700070p00700070 != 0) {
            pppp007000700070 = p0070p0070p00700070();
            p0070pp007000700070 = 88;
        }
        int i2 = pppp007000700070;
        if (((pp00700070p00700070 + i2) * i2) % p007000700070p00700070 != p0070pp007000700070) {
            pppp007000700070 = 35;
            p0070pp007000700070 = 33;
        }
        return true;
    }
}
