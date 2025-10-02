package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public final class uuhuhuu {
    public static int j006Aj006A006Ajj006A = 1;
    public static int j006Ajj006Ajj006A = 41;
    public static int jjj006A006Ajj006A = 2;
    public static final int l006C006Cl006C006C006C = 55296;
    public static final int l006Cl006C006C006C006C = 56320;
    public static final int ll006C006C006C006C006C = 57344;
    public static final int lll006C006C006C006C = 56320;
    private int o006F006Foooo;
    private final String o006Fooooo;
    private final int oo006Foooo;

    public uuhuhuu(String str) {
        this.o006Fooooo = str;
        this.oo006Foooo = str.length();
    }

    public static int j006A006Aj006Ajj006A() {
        return 1;
    }

    public static int jj006A006A006Ajj006A() {
        return 21;
    }

    public static int jj006Aj006Ajj006A() {
        return 0;
    }

    public int s0073s0073ss0073s() {
        char cCharAt = this.o006Fooooo.charAt(this.o006F006Foooo);
        this.o006F006Foooo++;
        int i = cCharAt & 65535;
        if (((j006Ajj006Ajj006A + j006A006Aj006Ajj006A()) * j006Ajj006Ajj006A) % jjj006A006Ajj006A != jj006Aj006Ajj006A()) {
            int i2 = j006Ajj006Ajj006A;
            if (((j006Aj006A006Ajj006A + i2) * i2) % jjj006A006Ajj006A != 0) {
                j006Ajj006Ajj006A = jj006A006A006Ajj006A();
                j006Aj006A006Ajj006A = jj006A006A006Ajj006A();
            }
            j006Ajj006Ajj006A = 34;
            jjj006A006Ajj006A = 37;
        }
        return i;
    }

    public boolean ss00730073ss0073s() {
        int i = this.o006F006Foooo;
        int i2 = this.oo006Foooo;
        int iJj006A006A006Ajj006A = jj006A006A006Ajj006A();
        if (((j006Aj006A006Ajj006A + iJj006A006A006Ajj006A) * iJj006A006A006Ajj006A) % jjj006A006Ajj006A != 0) {
            j006Ajj006Ajj006A = jj006A006A006Ajj006A();
            j006Aj006A006Ajj006A = jj006A006A006Ajj006A();
        }
        if (i >= i2) {
            return false;
        }
        int i3 = j006Ajj006Ajj006A;
        if (((j006Aj006A006Ajj006A + i3) * i3) % jjj006A006Ajj006A != jj006Aj006Ajj006A()) {
            j006Ajj006Ajj006A = 76;
            j006Aj006A006Ajj006A = jj006A006A006Ajj006A();
        }
        return true;
    }
}
