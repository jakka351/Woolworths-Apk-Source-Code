package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public final class kuukkku extends kkkukku {
    public static int i0069006900690069ii = 90;
    public static int i0069iii0069i = 1;
    public static int ii0069ii0069i = 2;
    public static int iiiii0069i = 0;
    private static final int r00720072007200720072r = 65536;
    private static final int rr0072007200720072r = 2048;
    private static final int rrrrrr0072 = 63488;

    public static int i00690069ii0069i() {
        return 55;
    }

    public static int i0069i0069i0069i() {
        return 0;
    }

    public static int ii00690069i0069i() {
        return 2;
    }

    public static int iii0069i0069i() {
        return 1;
    }

    private static int k006Bk006B006B006Bk(int i, int i2) {
        int i3 = i0069006900690069ii;
        if (((i0069iii0069i + i3) * i3) % ii0069ii0069i != iiiii0069i) {
            i0069006900690069ii = 97;
            iiiii0069i = 34;
        }
        int i4 = i % i2;
        return i4 < 0 ? i4 + i2 : i4;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int k006B006B006B006Bkk() {
        int iI00690069ii0069i = i00690069ii0069i() + i0069iii0069i;
        int iI00690069ii0069i2 = i00690069ii0069i();
        int i = i0069006900690069ii;
        if (((iii0069i0069i() + i) * i) % ii0069ii0069i != 0) {
            i0069006900690069ii = 25;
            iiiii0069i = i00690069ii0069i();
        }
        if ((iI00690069ii0069i * iI00690069ii0069i2) % ii0069ii0069i == iiiii0069i) {
            return rrrrrr0072;
        }
        i0069006900690069ii = 66;
        iiiii0069i = 19;
        return rrrrrr0072;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public boolean k006Bkkk006Bk(int i) {
        if (i >= 2048) {
            return i < r00720072007200720072r;
        }
        int i2 = i0069006900690069ii;
        if (((i0069iii0069i + i2) * i2) % ii0069ii0069i != iiiii0069i) {
            i0069006900690069ii = 13;
            iiiii0069i = 11;
        }
        return false;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kk006B006B006Bkk(int i) {
        int i2 = i0069006900690069ii;
        if (((i0069iii0069i + i2) * i2) % ii00690069i0069i() != i0069i0069i0069i()) {
            i0069006900690069ii = 3;
            iiiii0069i = i00690069ii0069i();
            int i3 = i0069006900690069ii;
            if (((i0069iii0069i + i3) * i3) % ii0069ii0069i != 0) {
                i0069006900690069ii = i00690069ii0069i();
                iiiii0069i = 51;
            }
        }
        return k006Bk006B006B006Bk(i, rrrrrr0072) + 2048;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kkkukku
    public int kkkkk006Bk(int i) {
        int i2 = i0069006900690069ii;
        if (((i0069iii0069i + i2) * i2) % ii0069ii0069i != iiiii0069i) {
            if (((iii0069i0069i() + i2) * i0069006900690069ii) % ii0069ii0069i != iiiii0069i) {
                i0069006900690069ii = i00690069ii0069i();
                iiiii0069i = 38;
            }
            i0069006900690069ii = i00690069ii0069i();
            iiiii0069i = 50;
        }
        return i - 2048;
    }
}
