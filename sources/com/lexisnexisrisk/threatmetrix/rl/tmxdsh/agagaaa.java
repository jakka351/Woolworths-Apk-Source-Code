package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import YU.a;

/* loaded from: classes6.dex */
public final class agagaaa extends vmvvmvm {
    public static int k006B006B006B006Bkk = 58;
    public static int k006Bkkk006Bk = 1;
    public static int kk006Bkk006Bk = 2;
    public static int kkkkk006Bk = 0;
    private static final int p00700070p0070p0070 = 1921;
    private static final int p0070pp0070p0070 = 127;
    private static final int pp0070p0070p0070 = 2048;

    public static int k006B006Bkk006Bk() {
        return 27;
    }

    public static int kkk006Bk006Bk() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int h0068h0068006800680068(int i) {
        int i2 = i % p00700070p0070p0070;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            i2 += p00700070p0070p0070;
        }
        int i3 = k006B006B006B006Bkk;
        int i4 = k006Bkkk006Bk;
        int i5 = kk006Bkk006Bk;
        if (((i3 + i4) * i3) % i5 != kkkkk006Bk) {
            if (a.z(i3, i4, i3, i5) != 0) {
                k006B006B006B006Bkk = 74;
                kkkkk006Bk = k006B006Bkk006Bk();
            }
            k006B006B006B006Bkk = k006B006Bkk006Bk();
            kkkkk006Bk = 78;
        }
        return i2 + 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int hh00680068006800680068() {
        int i = k006B006B006B006Bkk;
        if (((k006Bkkk006Bk + i) * i) % kk006Bkk006Bk != kkkkk006Bk) {
            k006B006B006B006Bkk = k006B006Bkk006Bk();
            kkkkk006Bk = 65;
        }
        if (((kkk006Bk006Bk() + k006B006B006B006Bkk) * k006B006B006B006Bkk) % kk006Bkk006Bk == kkkkk006Bk) {
            return p00700070p0070p0070;
        }
        k006B006B006B006Bkk = k006B006Bkk006Bk();
        kkkkk006Bk = 32;
        return p00700070p0070p0070;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int n006Ennnnn(int i) {
        int i2 = k006B006B006B006Bkk;
        if (((k006Bkkk006Bk + i2) * i2) % kk006Bkk006Bk != 0) {
            k006B006B006B006Bkk = k006B006Bkk006Bk();
            int iK006B006Bkk006Bk = k006B006Bkk006Bk();
            kkkkk006Bk = iK006B006Bkk006Bk;
            int i3 = k006B006B006B006Bkk;
            if (((k006Bkkk006Bk + i3) * i3) % kk006Bkk006Bk != iK006B006Bkk006Bk) {
                k006B006B006B006Bkk = k006B006Bkk006Bk();
                kkkkk006Bk = 62;
            }
        }
        if (i == 0) {
            return 0;
        }
        return i - 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public boolean nn006Ennnn(int i) {
        if (i >= 0 && (i <= 0 || i >= 128)) {
            return i < 2048;
        }
        int i2 = k006B006B006B006Bkk;
        if (((k006Bkkk006Bk + i2) * i2) % kk006Bkk006Bk != kkkkk006Bk) {
            k006B006B006B006Bkk = k006B006Bkk006Bk();
            kkkkk006Bk = k006B006Bkk006Bk();
        }
        return false;
    }
}
