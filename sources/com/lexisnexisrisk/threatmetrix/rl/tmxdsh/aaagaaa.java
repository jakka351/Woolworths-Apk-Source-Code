package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public final class aaagaaa extends vmvvmvm {
    public static int k006B006Bk006Bkk = 2;
    public static int k006Bk006B006Bkk = 0;
    public static int k006Bkk006Bkk = 96;
    public static int kk006Bk006Bkk = 1;
    private static final int p007000700070pp0070 = 128;
    private static final int pp00700070pp0070 = 1;
    private static final int pppp0070p0070 = 127;

    public static int kk006B006B006Bkk() {
        return 2;
    }

    public static int kkk006B006Bkk() {
        return 28;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int h0068h0068006800680068(int i) {
        int i2 = k006Bkk006Bkk;
        if (((kk006Bk006Bkk + i2) * i2) % k006B006Bk006Bkk != 0) {
            k006Bkk006Bkk = kkk006B006Bkk();
            k006Bk006B006Bkk = 88;
        }
        int i3 = i % 127;
        if (i3 < 0) {
            i3 += 127;
        }
        return i3 + 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int hh00680068006800680068() {
        int i = k006Bkk006Bkk;
        int i2 = kk006Bk006Bkk;
        int i3 = (i + i2) * i;
        int i4 = (i2 + i) * i;
        int i5 = k006B006Bk006Bkk;
        if (i4 % i5 != 0) {
            k006Bkk006Bkk = 83;
            kk006Bk006Bkk = 93;
        }
        if (i3 % i5 != 0) {
            k006Bkk006Bkk = 44;
            kk006Bk006Bkk = kkk006B006Bkk();
        }
        return 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public int n006Ennnnn(int i) {
        int i2 = k006Bkk006Bkk;
        if (((kk006Bk006Bkk + i2) * i2) % k006B006Bk006Bkk != k006Bk006B006Bkk) {
            k006Bkk006Bkk = kkk006B006Bkk();
            k006Bk006B006Bkk = kkk006B006Bkk();
        }
        int i3 = i - 1;
        int i4 = k006Bkk006Bkk;
        if (((kk006Bk006Bkk + i4) * i4) % k006B006Bk006Bkk != 0) {
            k006Bkk006Bkk = 89;
            kk006Bk006Bkk = 2;
        }
        return i3;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvvmvm
    public boolean nn006Ennnn(int i) {
        if (i < 1 || i >= 128) {
            return false;
        }
        if ((kkk006B006Bkk() * (kkk006B006Bkk() + kk006Bk006Bkk)) % kk006B006B006Bkk() != k006Bk006B006Bkk) {
            k006Bkk006Bkk = 27;
            k006Bk006B006Bkk = kkk006B006Bkk();
        }
        return true;
    }
}
