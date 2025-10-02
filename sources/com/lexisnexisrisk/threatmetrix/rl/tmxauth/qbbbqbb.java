package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import YU.a;

/* loaded from: classes6.dex */
public final class qbbbqbb extends qbqbqbb {
    private static final int k006B006B006B006B006Bk = 1048576;
    private static final int k006Bk006B006B006Bk = 65536;
    private static final int kk006B006B006B006Bk = 1114112;
    public static int l006C006Cl006C006Cl = 1;
    public static int l006Cll006C006Cl = 39;
    public static int ll006Cl006C006Cl = 0;
    public static int lll006C006C006Cl = 2;

    public static int l006C006C006C006C006Cl() {
        return 2;
    }

    public static int l006Cl006C006C006Cl() {
        return 37;
    }

    public static int ll006C006C006C006Cl() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q00710071qqq0071(int i) {
        int i2 = i - k006Bk006B006B006Bk;
        int i3 = l006Cll006C006Cl;
        int i4 = l006C006Cl006C006Cl;
        int i5 = lll006C006C006Cl;
        int i6 = ((i3 + i4) * i3) % i5;
        int i7 = ll006Cl006C006Cl;
        if (i6 != i7) {
            if (a.z(i3, i4, i3, i5) != i7) {
                l006Cll006C006Cl = 3;
                ll006Cl006C006Cl = 44;
            }
            l006Cll006C006Cl = l006Cl006C006C006Cl();
            ll006Cl006C006Cl = 16;
        }
        return i2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int q0071qqqq0071(int i) {
        int i2 = l006Cll006C006Cl;
        if (((l006C006Cl006C006Cl + i2) * i2) % l006C006C006C006C006Cl() != ll006Cl006C006Cl) {
            l006Cll006C006Cl = 95;
            ll006Cl006C006Cl = l006Cl006C006C006Cl();
        }
        int i3 = i % k006B006B006B006B006Bk;
        if (i3 < 0) {
            i3 += k006B006B006B006B006Bk;
            int iL006Cl006C006C006Cl = l006Cl006C006C006Cl();
            if (((l006C006Cl006C006Cl + iL006Cl006C006C006Cl) * iL006Cl006C006C006Cl) % l006C006C006C006C006Cl() != 0) {
                l006Cll006C006Cl = 93;
                ll006Cl006C006Cl = 55;
            }
        }
        return i3 + k006Bk006B006B006Bk;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public int qq0071qqq0071() {
        int i = l006Cll006C006Cl;
        if (((l006C006Cl006C006Cl + i) * i) % lll006C006C006Cl == ll006Cl006C006Cl) {
            return k006B006B006B006B006Bk;
        }
        l006Cll006C006Cl = l006Cl006C006C006Cl();
        ll006Cl006C006Cl = 41;
        return k006B006B006B006B006Bk;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqbb
    public boolean qqq0071qq0071(int i) {
        if (i < k006Bk006B006B006Bk) {
            return false;
        }
        int i2 = l006Cll006C006Cl;
        int i3 = l006C006Cl006C006Cl;
        int i4 = (i2 + i3) * i2;
        int i5 = lll006C006C006Cl;
        if (i4 % i5 != 0) {
            l006Cll006C006Cl = 9;
            ll006Cl006C006Cl = 37;
        }
        if (i >= kk006B006B006B006Bk) {
            return false;
        }
        int i6 = l006Cll006C006Cl;
        if (a.z(i6, i3, i6, i5) != 0) {
            l006Cll006C006Cl = l006Cl006C006C006Cl();
            ll006Cl006C006Cl = 94;
        }
        return true;
    }
}
