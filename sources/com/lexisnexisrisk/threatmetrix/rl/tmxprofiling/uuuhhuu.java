package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;

/* loaded from: classes6.dex */
public final class uuuhhuu extends jjjjjxx {
    public static int j006A006A006Aj006Aj006A = 1;
    public static int j006Ajj006A006Aj006A = 47;
    public static int jj006A006Aj006Aj006A = 0;
    public static int jjjj006A006Aj006A = 2;
    private static final int o006F006F006Fooo = 127;
    private static final int o006Foo006Foo = 1921;
    private static final int oooo006Foo = 2048;

    public static int j006A006Aj006A006Aj006A() {
        return 1;
    }

    public static int j006Aj006Aj006Aj006A() {
        return 58;
    }

    public static int jj006Aj006A006Aj006A() {
        return 2;
    }

    public static int jjj006A006A006Aj006A() {
        return 0;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int s007300730073s0073ss() {
        int iJ006Aj006Aj006Aj006A = j006Aj006Aj006Aj006A() * (j006Aj006Aj006Aj006A() + j006A006A006Aj006Aj006A);
        int i = jjjj006A006Aj006A;
        if (iJ006Aj006Aj006Aj006A % i == jj006A006Aj006Aj006A) {
            return o006Foo006Foo;
        }
        jj006A006Aj006Aj006A = 9;
        int i2 = j006Ajj006A006Aj006A;
        if (a.z(i2, j006A006A006Aj006Aj006A, i2, i) == 0) {
            return o006Foo006Foo;
        }
        j006Ajj006A006Aj006A = 21;
        jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
        return o006Foo006Foo;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public boolean s0073ss00730073ss(int i) {
        if (i < 0 || (i > 0 && i < 128)) {
            int i2 = j006Ajj006A006Aj006A;
            if (((j006A006A006Aj006Aj006A + i2) * i2) % jj006Aj006A006Aj006A() != jjj006A006A006Aj006A()) {
                j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
                jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
            }
            return false;
        }
        if (i >= 2048) {
            return false;
        }
        int i3 = j006Ajj006A006Aj006A;
        if (((j006A006A006Aj006Aj006A + i3) * i3) % jjjj006A006Aj006A != 0) {
            j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
            jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
        }
        return true;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ss00730073s0073ss(int i) {
        int i2 = i % o006Foo006Foo;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            int i3 = j006Ajj006A006Aj006A;
            if (((j006A006A006Aj006Aj006A + i3) * i3) % jjjj006A006Aj006A != jj006A006Aj006Aj006A) {
                j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
                jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
                int i4 = j006Ajj006A006Aj006A;
                if (((j006A006A006Aj006Aj006A + i4) * i4) % jjjj006A006Aj006A != 0) {
                    j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
                    jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
                }
            }
            i2 += o006Foo006Foo;
        }
        return i2 + 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ssss00730073ss(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = j006Ajj006A006Aj006A;
        if (((j006A006A006Aj006Aj006A + i2) * i2) % jj006Aj006A006Aj006A() != jj006A006Aj006Aj006A) {
            if (((j006A006Aj006A006Aj006A() + j006Ajj006A006Aj006A) * j006Ajj006A006Aj006A) % jjjj006A006Aj006A != jj006A006Aj006Aj006A) {
                j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
                jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
            }
            j006Ajj006A006Aj006A = j006Aj006Aj006Aj006A();
            jj006A006Aj006Aj006A = j006Aj006Aj006Aj006A();
        }
        return i - 127;
    }
}
