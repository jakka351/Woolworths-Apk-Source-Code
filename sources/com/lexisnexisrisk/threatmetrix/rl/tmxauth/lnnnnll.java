package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import YU.a;

/* loaded from: classes6.dex */
public final class lnnnnll {
    public static int c006300630063ccc = 0;
    public static int c0063cc0063cc = 2;
    public static int cc00630063ccc = 62;
    public static int cccc0063cc = 1;
    public static final int k006B006B006Bkk006B = 56320;
    public static final int k006Bk006Bkk006B = 55296;
    public static final int kk006B006Bkk006B = 56320;
    public static final int kkkk006Bk006B = 57344;
    private int k006B006Bk006Bk006B;
    private final String k006Bkk006Bk006B;
    private final int kk006Bk006Bk006B;

    public lnnnnll(String str) {
        this.k006Bkk006Bk006B = str;
        this.kk006Bk006Bk006B = str.length();
    }

    public static int cc0063c0063cc() {
        return 49;
    }

    public boolean q0071qqq00710071() {
        int i = this.k006B006Bk006Bk006B;
        int i2 = cc00630063ccc;
        if (((cccc0063cc + i2) * i2) % c0063cc0063cc != 0) {
            cc00630063ccc = cc0063c0063cc();
            c006300630063ccc = 14;
        }
        if (i >= this.kk006Bk006Bk006B) {
            return false;
        }
        int i3 = cc00630063ccc;
        if (((cccc0063cc + i3) * i3) % c0063cc0063cc == c006300630063ccc) {
            return true;
        }
        cc00630063ccc = cc0063c0063cc();
        c006300630063ccc = 85;
        return true;
    }

    public int qqqqq00710071() {
        char cCharAt = this.k006Bkk006Bk006B.charAt(this.k006B006Bk006Bk006B);
        this.k006B006Bk006Bk006B++;
        int i = cc00630063ccc;
        int i2 = cccc0063cc;
        int i3 = (i + i2) * i;
        int i4 = c0063cc0063cc;
        if (i3 % i4 != c006300630063ccc) {
            cc00630063ccc = 24;
            if (a.z(24, i2, 24, i4) != 0) {
                cc00630063ccc = cc0063c0063cc();
                c006300630063ccc = 77;
            }
            c006300630063ccc = 34;
        }
        return cCharAt & 65535;
    }
}
