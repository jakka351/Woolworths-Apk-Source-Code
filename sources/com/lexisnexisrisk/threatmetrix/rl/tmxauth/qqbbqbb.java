package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public final class qqbbqbb extends qbqbqbb {
    private static final int k006B006Bk006B006Bk = 65536;
    private static final int kk006Bk006B006Bk = 2048;
    private static final int kkk006B006B006Bk = 63488;
    public static int l006Clll006Cl = 6;
    public static int ll006C006Cl006Cl = 1;
    public static int ll006Cll006Cl = 0;
    public static int lll006Cl006Cl = 2;

    public static int l006C006C006Cl006Cl() {
        return 0;
    }

    public static int l006C006Cll006Cl() {
        return 1;
    }

    public static int l006Cl006Cl006Cl() {
        return 61;
    }

    public static int llll006C006Cl() {
        return 2;
    }

    private static int qq00710071qq0071(int i, int i2) {
        int i3 = l006Clll006Cl;
        if (((ll006C006Cl006Cl + i3) * i3) % lll006Cl006Cl != 0) {
            l006Clll006Cl = l006Cl006Cl006Cl();
            ll006Cll006Cl = l006Cl006Cl006Cl();
        }
        if (((l006C006Cll006Cl() + l006Clll006Cl) * l006Clll006Cl) % lll006Cl006Cl != ll006Cll006Cl) {
            l006Clll006Cl = 52;
            ll006Cll006Cl = l006Cl006Cl006Cl();
        }
        int i4 = i % i2;
        return i4 < 0 ? i4 + i2 : i4;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q00710071qqq0071(int i) {
        return i - 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q0071qqqq0071(int i) {
        int i2 = l006Clll006Cl;
        if (((ll006C006Cl006Cl + i2) * i2) % lll006Cl006Cl != 0) {
            l006Clll006Cl = 40;
            ll006Cll006Cl = l006Cl006Cl006Cl();
        }
        int i3 = l006Clll006Cl;
        if (((ll006C006Cl006Cl + i3) * i3) % lll006Cl006Cl != ll006Cll006Cl) {
            l006Clll006Cl = l006Cl006Cl006Cl();
            ll006Cll006Cl = l006Cl006Cl006Cl();
        }
        return qq00710071qq0071(i, kkk006B006B006Bk) + 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int qq0071qqq0071() {
        int i = l006Clll006Cl;
        if (((ll006C006Cl006Cl + i) * i) % lll006Cl006Cl != ll006Cll006Cl) {
            l006Clll006Cl = l006Cl006Cl006Cl();
            ll006Cll006Cl = 81;
        }
        int i2 = l006Clll006Cl;
        if (((ll006C006Cl006Cl + i2) * i2) % lll006Cl006Cl != l006C006C006Cl006Cl()) {
            l006Clll006Cl = 33;
            ll006Cll006Cl = 53;
        }
        return kkk006B006B006Bk;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public boolean qqq0071qq0071(int i) {
        return i >= 2048 && i < k006B006Bk006B006Bk;
    }
}
