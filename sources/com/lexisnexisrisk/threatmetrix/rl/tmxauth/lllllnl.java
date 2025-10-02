package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public final class lllllnl extends qbqbqbb {
    public static int c0063006300630063cc = 0;
    public static int c00630063c0063cc = 2;
    public static int c0063c00630063cc = 1;
    public static int ccccc0063c = 2;
    private static final int k006Bk006B006Bk006B = 128;
    private static final int kk006B006B006Bk006B = 127;
    private static final int kkk006B006Bk006B = 1;

    public static int c0063ccc0063c() {
        return 65;
    }

    public static int cc006300630063cc() {
        return 2;
    }

    public static int ccc00630063cc() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q00710071qqq0071(int i) {
        int i2 = c00630063c0063cc;
        if (((c0063c00630063cc + i2) * i2) % ccccc0063c != 0) {
            c00630063c0063cc = c0063ccc0063c();
            c0063006300630063cc = 35;
        }
        return i - 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q0071qqqq0071(int i) {
        int i2 = i % 127;
        int i3 = c00630063c0063cc;
        if (((c0063c00630063cc + i3) * i3) % ccccc0063c != ccc00630063cc()) {
            c00630063c0063cc = c0063ccc0063c();
            c0063006300630063cc = 81;
        }
        if (i2 < 0) {
            i2 += 127;
            int i4 = c00630063c0063cc;
            if (((c0063c00630063cc + i4) * i4) % ccccc0063c != ccc00630063cc()) {
                c00630063c0063cc = 9;
                c0063006300630063cc = 93;
            }
        }
        return i2 + 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int qq0071qqq0071() {
        int i = c00630063c0063cc;
        if (((c0063c00630063cc + i) * i) % cc006300630063cc() != ccc00630063cc()) {
            int i2 = c00630063c0063cc;
            if (((c0063c00630063cc + i2) * i2) % ccccc0063c != c0063006300630063cc) {
                c00630063c0063cc = c0063ccc0063c();
                c0063006300630063cc = 92;
            }
            c00630063c0063cc = 22;
            c0063c00630063cc = 6;
        }
        return 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public boolean qqq0071qq0071(int i) {
        int i2 = c00630063c0063cc;
        if (((c0063c00630063cc + i2) * i2) % ccccc0063c != 0) {
            c00630063c0063cc = 90;
            c0063006300630063cc = c0063ccc0063c();
        }
        int i3 = c00630063c0063cc;
        if (((c0063c00630063cc + i3) * i3) % ccccc0063c != c0063006300630063cc) {
            c00630063c0063cc = c0063ccc0063c();
            c0063006300630063cc = c0063ccc0063c();
        }
        return i >= 1 && i < 128;
    }
}
