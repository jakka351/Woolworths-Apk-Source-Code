package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public final class kkukkku extends kkkukku {
    public static int i0069ii0069ii = 1;
    public static int ii0069i0069ii = 2;
    public static int iii00690069ii = 0;
    public static int iiii0069ii = 91;
    private static final int r00720072r00720072r = 65536;
    private static final int r0072r007200720072r = 1048576;
    private static final int rrr007200720072r = 1114112;

    public static int i00690069i0069ii() {
        return 80;
    }

    public static int i0069i00690069ii() {
        return 0;
    }

    public static int ii006900690069ii() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int k006B006B006B006Bkk() {
        int i = iiii0069ii;
        if (((i0069ii0069ii + i) * i) % ii0069i0069ii != 0) {
            iiii0069ii = 1;
            i0069ii0069ii = i00690069i0069ii();
        }
        int i2 = iiii0069ii;
        if (((i0069ii0069ii + i2) * i2) % ii0069i0069ii != iii00690069ii) {
            iiii0069ii = 16;
            iii00690069ii = i00690069i0069ii();
        }
        return r0072r007200720072r;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public boolean k006Bkkk006Bk(int i) {
        if (i < r00720072r00720072r) {
            return false;
        }
        boolean z = i < rrr007200720072r;
        int i2 = iiii0069ii;
        if (((i0069ii0069ii + i2) * i2) % ii0069i0069ii != 0) {
            iiii0069ii = i00690069i0069ii();
            iii00690069ii = i00690069i0069ii();
        }
        return z;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kk006B006B006Bkk(int i) {
        int i2 = i % r0072r007200720072r;
        if (i2 < 0) {
            i2 += r0072r007200720072r;
            int i3 = iiii0069ii;
            if (((i0069ii0069ii + i3) * i3) % ii0069i0069ii != iii00690069ii) {
                iiii0069ii = 10;
                iii00690069ii = 2;
            }
        }
        return i2 + r00720072r00720072r;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kkkkk006Bk(int i) {
        int i2 = i - r00720072r00720072r;
        int i3 = iiii0069ii;
        if (((ii006900690069ii() + i3) * i3) % ii0069i0069ii != 0) {
            iiii0069ii = 35;
            iii00690069ii = i00690069i0069ii();
        }
        return i2;
    }
}
