package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;

/* loaded from: classes6.dex */
public final class jxjjjxx extends jjjjjxx {
    private static final int l006Clll006C006C = 65536;
    private static final int ll006Cll006C006C = 63488;
    private static final int lllll006C006C = 2048;
    public static int s00730073ss0073s0073 = 0;
    public static int s0073sss0073s0073 = 1;
    public static int ss0073ss0073s0073 = 2;
    public static int sssss0073s0073 = 15;

    public static int s007300730073s0073s0073() {
        return 2;
    }

    private static int s00730073s00730073ss(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        int i4 = sssss0073s0073;
        if (((s0073sss0073s0073 + i4) * i4) % ss0073ss0073s0073 != s00730073ss0073s0073) {
            sssss0073s0073 = 2;
            s00730073ss0073s0073 = 33;
        }
        return i3 + i2;
    }

    public static int s0073s0073s0073s0073() {
        return 95;
    }

    public static int ss00730073s0073s0073() {
        return 1;
    }

    public static int sss0073s0073s0073() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int s007300730073s0073ss() {
        int i = sssss0073s0073;
        int i2 = s0073sss0073s0073;
        int i3 = (i + i2) * i;
        int i4 = ss0073ss0073s0073;
        if (a.z(i, i2, i, i4) != 0) {
            sssss0073s0073 = s0073s0073s0073s0073();
            s00730073ss0073s0073 = s0073s0073s0073s0073();
        }
        if (i3 % i4 == sss0073s0073s0073()) {
            return ll006Cll006C006C;
        }
        sssss0073s0073 = s0073s0073s0073s0073();
        s00730073ss0073s0073 = s0073s0073s0073s0073();
        return ll006Cll006C006C;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public boolean s0073ss00730073ss(int i) {
        if (i < 2048) {
            return false;
        }
        if (i < l006Clll006C006C) {
            return true;
        }
        int i2 = sssss0073s0073;
        int i3 = s0073sss0073s0073;
        int i4 = i2 + i3;
        if (((i3 + i2) * i2) % ss0073ss0073s0073 != 0) {
            sssss0073s0073 = s0073s0073s0073s0073();
            s00730073ss0073s0073 = 26;
        }
        if ((i2 * i4) % ss0073ss0073s0073 != 0) {
            sssss0073s0073 = s0073s0073s0073s0073();
            s00730073ss0073s0073 = 92;
        }
        return false;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ss00730073s0073ss(int i) {
        int iS00730073s00730073ss = s00730073s00730073ss(i, ll006Cll006C006C);
        int i2 = sssss0073s0073;
        int i3 = s0073sss0073s0073;
        int i4 = ss0073ss0073s0073;
        if (((i2 + i3) * i2) % i4 != s00730073ss0073s0073) {
            if (a.z(i2, i3, i2, i4) != 0) {
                sssss0073s0073 = s0073s0073s0073s0073();
                s00730073ss0073s0073 = s0073s0073s0073s0073();
            }
            sssss0073s0073 = s0073s0073s0073s0073();
            s00730073ss0073s0073 = 97;
        }
        return iS00730073s00730073ss + 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ssss00730073ss(int i) {
        int i2 = sssss0073s0073;
        if (((s0073sss0073s0073 + i2) * i2) % ss0073ss0073s0073 != s00730073ss0073s0073) {
            int iS0073s0073s0073s0073 = s0073s0073s0073s0073();
            if (((ss00730073s0073s0073() + sssss0073s0073) * sssss0073s0073) % s007300730073s0073s0073() != s00730073ss0073s0073) {
                sssss0073s0073 = s0073s0073s0073s0073();
                s00730073ss0073s0073 = 76;
            }
            sssss0073s0073 = iS0073s0073s0073s0073;
            s00730073ss0073s0073 = 98;
        }
        return i - 2048;
    }
}
