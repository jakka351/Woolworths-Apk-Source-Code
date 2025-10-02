package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import YU.a;

/* loaded from: classes6.dex */
public final class lnlllnl extends qbqbqbb {
    public static int c00630063cc0063c = 0;
    public static int c0063c0063c0063c = 2;
    public static int cc0063cc0063c = 3;
    public static int ccc0063c0063c = 1;
    private static final int k006B006B006B006Bk006B = 127;
    private static final int k006Bkkk006B006B = 1921;
    private static final int kkkkk006B006B = 2048;

    public static int c006300630063c0063c() {
        return 7;
    }

    public static int cc00630063c0063c() {
        return 0;
    }

    public static int cccc00630063c() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q00710071qqq0071(int i) {
        if (i == 0) {
            return 0;
        }
        return i - 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q0071qqqq0071(int i) {
        int i2 = i % k006Bkkk006B006B;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            int i3 = cc0063cc0063c;
            if (((ccc0063c0063c + i3) * i3) % c0063c0063c0063c != 0) {
                cc0063cc0063c = c006300630063c0063c();
                c00630063cc0063c = c006300630063c0063c();
            }
            i2 += k006Bkkk006B006B;
        }
        return i2 + 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int qq0071qqq0071() {
        int i = cc0063cc0063c;
        int i2 = ccc0063c0063c;
        int i3 = (i + i2) * i;
        int i4 = c0063c0063c0063c;
        if (i3 % i4 == c00630063cc0063c) {
            return k006Bkkk006B006B;
        }
        cc0063cc0063c = 60;
        c00630063cc0063c = 95;
        if (a.z(60, i2, 60, i4) == 0) {
            return k006Bkkk006B006B;
        }
        cc0063cc0063c = 14;
        c00630063cc0063c = 11;
        return k006Bkkk006B006B;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public boolean qqq0071qq0071(int i) {
        if (i < 0) {
            return false;
        }
        if (i > 0 && i < 128) {
            return false;
        }
        if ((c006300630063c0063c() * (c006300630063c0063c() + ccc0063c0063c)) % c0063c0063c0063c != c00630063cc0063c) {
            cc0063cc0063c = c006300630063c0063c();
            c00630063cc0063c = c006300630063c0063c();
        }
        if (i < 2048) {
            return true;
        }
        int i2 = cc0063cc0063c;
        if (((cccc00630063c() + i2) * i2) % c0063c0063c0063c == 0) {
            return false;
        }
        cc0063cc0063c = c006300630063c0063c();
        c00630063cc0063c = 91;
        return false;
    }
}
