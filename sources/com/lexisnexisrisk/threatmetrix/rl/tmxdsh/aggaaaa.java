package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public final class aggaaaa {
    public static int k006B006B006Bkkk = 2;
    public static int kk006Bkkkk = 34;
    public static int kkk006Bkkk = 1;
    public static int kkkk006Bkk = 0;
    public static final int p00700070007000700070p = 55296;
    public static final int p0070pppp0070 = 56320;
    public static final int pp0070ppp0070 = 57344;
    public static final int pppppp0070 = 56320;
    private final String p00700070ppp0070;
    private int p0070p0070pp0070;
    private final int ppp0070pp0070;

    public aggaaaa(String str) {
        this.p00700070ppp0070 = str;
        this.ppp0070pp0070 = str.length();
    }

    public static int k006B006Bkkkk() {
        return 0;
    }

    public static int k006Bk006Bkkk() {
        return 2;
    }

    public static int kk006B006Bkkk() {
        return 52;
    }

    public boolean n006E006E006E006Enn() {
        int i = this.p0070p0070pp0070;
        int i2 = this.ppp0070pp0070;
        int i3 = kk006Bkkkk;
        if (((kkk006Bkkk + i3) * i3) % k006B006B006Bkkk != 0) {
            kk006Bkkkk = 6;
            int iKk006B006Bkkk = kk006B006Bkkk();
            kkk006Bkkk = iKk006B006Bkkk;
            int i4 = kk006Bkkkk;
            if (((iKk006B006Bkkk + i4) * i4) % k006B006B006Bkkk != kkkk006Bkk) {
                kk006Bkkkk = kk006B006Bkkk();
                kkkk006Bkk = 42;
            }
        }
        return i < i2;
    }

    public int nn006E006E006Enn() {
        int i = kk006Bkkkk;
        if (((kkk006Bkkk + i) * i) % k006B006B006Bkkk != 0) {
            kk006Bkkkk = 15;
            kkk006Bkkk = kk006B006Bkkk();
        }
        char cCharAt = this.p00700070ppp0070.charAt(this.p0070p0070pp0070);
        int i2 = this.p0070p0070pp0070;
        int i3 = kk006Bkkkk;
        if (((kkk006Bkkk + i3) * i3) % k006Bk006Bkkk() != k006B006Bkkkk()) {
            kk006Bkkkk = 63;
            kkk006Bkkk = kk006B006Bkkk();
        }
        this.p0070p0070pp0070 = i2 + 1;
        return cCharAt & 65535;
    }
}
