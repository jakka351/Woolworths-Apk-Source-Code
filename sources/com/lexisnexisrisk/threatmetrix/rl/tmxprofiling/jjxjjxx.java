package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public final class jjxjjxx extends jjjjjxx {
    private static final int l006C006Cll006C006C = 65536;
    private static final int l006Cl006Cl006C006C = 1048576;
    private static final int lll006Cl006C006C = 1114112;
    public static int s00730073s00730073s0073 = 0;
    public static int s0073ss00730073s0073 = 1;
    public static int ss0073s00730073s0073 = 2;
    public static int ssss00730073s0073 = 30;

    public static int s0073s007300730073s0073() {
        return 68;
    }

    public static int ss0073007300730073s0073() {
        return 0;
    }

    public static int sss007300730073s0073() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int s007300730073s0073ss() {
        int i = ssss00730073s0073;
        if (((s0073ss00730073s0073 + i) * i) % ss0073s00730073s0073 != 0) {
            ssss00730073s0073 = 36;
            s0073ss00730073s0073 = 92;
            if (((sss007300730073s0073() + 36) * ssss00730073s0073) % ss0073s00730073s0073 != s00730073s00730073s0073) {
                ssss00730073s0073 = s0073s007300730073s0073();
                s00730073s00730073s0073 = s0073s007300730073s0073();
            }
        }
        return l006Cl006Cl006C006C;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public boolean s0073ss00730073ss(int i) {
        if (i < l006C006Cll006C006C || i >= lll006Cl006C006C) {
            return false;
        }
        int i2 = ssss00730073s0073;
        int i3 = s0073ss00730073s0073;
        int i4 = (i2 + i3) * i2;
        if (((i3 + i2) * i2) % ss0073s00730073s0073 != 0) {
            ssss00730073s0073 = s0073s007300730073s0073();
            s00730073s00730073s0073 = s0073s007300730073s0073();
        }
        if (i4 % ss0073s00730073s0073 != 0) {
            ssss00730073s0073 = s0073s007300730073s0073();
            s00730073s00730073s0073 = 73;
        }
        return true;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ss00730073s0073ss(int i) {
        int iS0073s007300730073s0073 = s0073s007300730073s0073();
        if (((s0073ss00730073s0073 + iS0073s007300730073s0073) * iS0073s007300730073s0073) % ss0073s00730073s0073 != 0) {
            ssss00730073s0073 = 21;
            s00730073s00730073s0073 = s0073s007300730073s0073();
        }
        int i2 = i % l006Cl006Cl006C006C;
        if (i2 < 0) {
            i2 += l006Cl006Cl006C006C;
            int i3 = ssss00730073s0073;
            if (((s0073ss00730073s0073 + i3) * i3) % ss0073s00730073s0073 != 0) {
                ssss00730073s0073 = s0073s007300730073s0073();
                s00730073s00730073s0073 = s0073s007300730073s0073();
            }
        }
        return i2 + l006C006Cll006C006C;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ssss00730073ss(int i) {
        int i2 = ssss00730073s0073;
        int i3 = s0073ss00730073s0073;
        int i4 = i2 + i3;
        if (((i3 + i2) * i2) % ss0073s00730073s0073 != ss0073007300730073s0073()) {
            ssss00730073s0073 = 12;
            s00730073s00730073s0073 = s0073s007300730073s0073();
        }
        if ((i4 * i2) % ss0073s00730073s0073 != s00730073s00730073s0073) {
            ssss00730073s0073 = s0073s007300730073s0073();
            s00730073s00730073s0073 = 69;
        }
        return i - l006C006Cll006C006C;
    }
}
