package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import YU.a;

/* loaded from: classes6.dex */
public final class vvmvmvm extends vmvvmvm {
    private static final int p0070p0070p0070p = 65536;
    private static final int pp00700070p0070p = 63488;
    private static final int ppp0070p0070p = 2048;
    public static int s00730073s0073ss = 5;
    public static int s0073s00730073ss = 2;
    public static int sss00730073ss = 1;
    public static int sssss0073s;

    private static int nnn006Ennn(int i, int i2) {
        int i3 = i % i2;
        if (i3 < 0) {
            int i4 = s00730073s0073ss;
            if (((sss00730073ss + i4) * i4) % s0073s00730073ss != 0) {
                s00730073s0073ss = 84;
                sss00730073ss = 21;
            }
            i3 += i2;
            int i5 = s00730073s0073ss;
            if (((sss00730073ss + i5) * i5) % ss007300730073ss() != 0) {
                s00730073s0073ss = s0073007300730073ss();
                sss00730073ss = 13;
            }
        }
        return i3;
    }

    public static int s0073007300730073ss() {
        return 31;
    }

    public static int s0073sss0073s() {
        return 1;
    }

    public static int ss007300730073ss() {
        return 2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int h0068h0068006800680068(int i) {
        int iNnn006Ennn = nnn006Ennn(i, pp00700070p0070p);
        int i2 = s00730073s0073ss;
        int i3 = sss00730073ss;
        int i4 = (i2 + i3) * i2;
        int i5 = s0073s00730073ss;
        if (i4 % i5 != 0) {
            s00730073s0073ss = 88;
            sssss0073s = 24;
        }
        int i6 = s00730073s0073ss;
        if (a.z(i6, i3, i6, i5) != sssss0073s) {
            s00730073s0073ss = s0073007300730073ss();
            sssss0073s = 81;
        }
        return iNnn006Ennn + 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int hh00680068006800680068() {
        if ((s0073007300730073ss() * (s0073007300730073ss() + sss00730073ss)) % ss007300730073ss() == sssss0073s) {
            return pp00700070p0070p;
        }
        s00730073s0073ss = 70;
        sssss0073s = s0073007300730073ss();
        return pp00700070p0070p;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int n006Ennnnn(int i) {
        int i2 = s00730073s0073ss;
        int iS0073sss0073s = (s0073sss0073s() + i2) * i2;
        int i3 = s0073s00730073ss;
        int i4 = s00730073s0073ss;
        if (a.z(i4, sss00730073ss, i4, i3) != 0) {
            s00730073s0073ss = 51;
            sssss0073s = s0073007300730073ss();
        }
        if (iS0073sss0073s % i3 != 0) {
            s00730073s0073ss = s0073007300730073ss();
            sssss0073s = 50;
        }
        return i - 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public boolean nn006Ennnn(int i) {
        if (i < 2048 || i >= p0070p0070p0070p) {
            return false;
        }
        int i2 = s00730073s0073ss;
        int i3 = sss00730073ss;
        int i4 = s0073s00730073ss;
        if (((i2 + i3) * i2) % i4 != 0) {
            if (a.z(i2, i3, i2, i4) != 0) {
                s00730073s0073ss = 61;
                sssss0073s = 89;
            }
            s00730073s0073ss = s0073007300730073ss();
            sssss0073s = 3;
        }
        return true;
    }
}
