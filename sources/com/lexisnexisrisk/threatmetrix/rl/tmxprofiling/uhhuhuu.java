package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public final class uhhuhuu extends jjjjjxx {
    public static int j006A006A006A006Ajj006A = 75;
    public static int j006A006Ajj006Aj006A = 0;
    public static int j006Ajjj006Aj006A = 2;
    public static int jjjjj006Aj006A = 1;
    private static final int o006Fo006Fooo = 128;
    private static final int oo006F006Fooo = 127;
    private static final int ooo006Fooo = 1;

    public static int jj006Ajj006Aj006A() {
        return 85;
    }

    public static int jjj006Aj006Aj006A() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int s007300730073s0073ss() {
        int i = j006A006A006A006Ajj006A;
        if (((jjjjj006Aj006A + i) * i) % j006Ajjj006Aj006A != 0) {
            j006A006A006A006Ajj006A = 68;
            jjjjj006Aj006A = jj006Ajj006Aj006A();
        }
        int i2 = j006A006A006A006Ajj006A;
        if (((jjjjj006Aj006A + i2) * i2) % j006Ajjj006Aj006A == 0) {
            return 127;
        }
        j006A006A006A006Ajj006A = 23;
        jjjjj006Aj006A = jj006Ajj006Aj006A();
        return 127;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public boolean s0073ss00730073ss(int i) {
        int iJj006Ajj006Aj006A = ((jj006Ajj006Aj006A() + jjjjj006Aj006A) * jj006Ajj006Aj006A()) % j006Ajjj006Aj006A;
        if ((jj006Ajj006Aj006A() * (jj006Ajj006Aj006A() + jjjjj006Aj006A)) % j006Ajjj006Aj006A != j006A006Ajj006Aj006A) {
            j006A006A006A006Ajj006A = jj006Ajj006Aj006A();
            j006A006Ajj006Aj006A = 4;
        }
        if (iJj006Ajj006Aj006A != j006A006Ajj006Aj006A) {
            j006A006A006A006Ajj006A = 41;
            j006A006Ajj006Aj006A = 1;
        }
        return i >= 1 && i < 128;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ss00730073s0073ss(int i) {
        int i2 = i % 127;
        int i3 = j006A006A006A006Ajj006A;
        if (((jjjjj006Aj006A + i3) * i3) % j006Ajjj006Aj006A != 0) {
            j006A006A006A006Ajj006A = 83;
            j006A006Ajj006Aj006A = jj006Ajj006Aj006A();
        }
        if (i2 < 0) {
            int i4 = j006A006A006A006Ajj006A;
            if (((jjjjj006Aj006A + i4) * i4) % j006Ajjj006Aj006A != 0) {
                j006A006A006A006Ajj006A = 48;
                j006A006Ajj006Aj006A = 65;
            }
            i2 += 127;
        }
        return i2 + 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjjjxx
    public int ssss00730073ss(int i) {
        return i - 1;
    }
}
