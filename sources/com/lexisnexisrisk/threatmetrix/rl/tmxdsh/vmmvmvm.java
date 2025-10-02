package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public final class vmmvmvm extends vmvvmvm {
    private static final int p007000700070p0070p = 65536;
    private static final int p0070pp00700070p = 1048576;
    private static final int pppp00700070p = 1114112;
    public static int s00730073ss0073s = 0;
    public static int s0073s0073s0073s = 2;
    public static int ss0073ss0073s = 2;
    public static int sss0073s0073s = 1;

    public static int s007300730073s0073s() {
        return 0;
    }

    public static int ss00730073s0073s() {
        return 79;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int h0068h0068006800680068(int i) {
        int i2 = ss0073ss0073s;
        if (((sss0073s0073s + i2) * i2) % s0073s0073s0073s != 0) {
            ss0073ss0073s = 18;
            s00730073ss0073s = ss00730073s0073s();
        }
        int i3 = i % p0070pp00700070p;
        if (i3 < 0) {
            i3 += p0070pp00700070p;
            int i4 = ss0073ss0073s;
            if (((sss0073s0073s + i4) * i4) % s0073s0073s0073s != 0) {
                ss0073ss0073s = 3;
                s00730073ss0073s = ss00730073s0073s();
            }
        }
        return i3 + p007000700070p0070p;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int hh00680068006800680068() {
        int i = ss0073ss0073s;
        if (((sss0073s0073s + i) * i) % s0073s0073s0073s == s00730073ss0073s) {
            return p0070pp00700070p;
        }
        ss0073ss0073s = 90;
        s00730073ss0073s = ss00730073s0073s();
        return p0070pp00700070p;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int n006Ennnnn(int i) {
        int i2 = ss0073ss0073s;
        if (((sss0073s0073s + i2) * i2) % s0073s0073s0073s != s00730073ss0073s) {
            ss0073ss0073s = 47;
            s00730073ss0073s = ss00730073s0073s();
            int i3 = ss0073ss0073s;
            if (((sss0073s0073s + i3) * i3) % s0073s0073s0073s != 0) {
                ss0073ss0073s = ss00730073s0073s();
                s00730073ss0073s = ss00730073s0073s();
            }
        }
        return i - p007000700070p0070p;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public boolean nn006Ennnn(int i) {
        int i2 = ss0073ss0073s;
        if (((sss0073s0073s + i2) * i2) % s0073s0073s0073s != 0) {
            ss0073ss0073s = 68;
            s00730073ss0073s = ss00730073s0073s();
        }
        return i >= p007000700070p0070p && i < pppp00700070p;
    }
}
