package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public final class kkkuukk {
    public static int m006D006D006Dm006Dm = 0;
    public static int m006D006Dm006D006Dm = 2;
    public static int mm006D006Dm006Dm = 76;
    public static int mmmm006D006Dm = 1;
    public static final int r0072007200720072rr = 55296;
    public static final int r0072rrr0072r = 56320;
    public static final int rr0072rr0072r = 57344;
    public static final int rrrrr0072r = 56320;
    private final String r00720072rr0072r;
    private int r0072r0072r0072r;
    private final int rrr0072r0072r;

    public kkkuukk(String str) {
        this.r00720072rr0072r = str;
        this.rrr0072r0072r = str.length();
    }

    public static int m006Dmm006D006Dm() {
        return 2;
    }

    public static int mm006Dm006D006Dm() {
        return 21;
    }

    public static int mmm006D006D006Dm() {
        return 0;
    }

    public boolean k006B006Bkk006Bk() {
        int i = mm006D006Dm006Dm;
        if (((mmmm006D006Dm + i) * i) % m006D006Dm006D006Dm != mmm006D006D006Dm()) {
            int i2 = mm006D006Dm006Dm;
            if (((mmmm006D006Dm + i2) * i2) % m006D006Dm006D006Dm != m006D006D006Dm006Dm) {
                mm006D006Dm006Dm = mm006Dm006D006Dm();
                m006D006D006Dm006Dm = 83;
            }
            mm006D006Dm006Dm = mm006Dm006D006Dm();
            m006D006D006Dm006Dm = 62;
        }
        return this.r0072r0072r0072r < this.rrr0072r0072r;
    }

    public int kk006Bkk006Bk() {
        char cCharAt = this.r00720072rr0072r.charAt(this.r0072r0072r0072r);
        int i = mm006D006Dm006Dm;
        if (((mmmm006D006Dm + i) * i) % m006Dmm006D006Dm() != m006D006D006Dm006Dm) {
            int i2 = mm006D006Dm006Dm;
            if (((mmmm006D006Dm + i2) * i2) % m006D006Dm006D006Dm != 0) {
                mm006D006Dm006Dm = mm006Dm006D006Dm();
                m006D006D006Dm006Dm = 14;
            }
            mm006D006Dm006Dm = mm006Dm006D006Dm();
            m006D006D006Dm006Dm = mm006Dm006D006Dm();
        }
        this.r0072r0072r0072r++;
        return cCharAt & 65535;
    }
}
