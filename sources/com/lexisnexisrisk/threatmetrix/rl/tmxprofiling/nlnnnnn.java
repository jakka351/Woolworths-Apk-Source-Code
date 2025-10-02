package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;

/* loaded from: classes6.dex */
public class nlnnnnn {
    public static int s007300730073ss0073s = 81;
    public static int s0073ss0073s0073s = 2;
    public static int sss00730073s0073s = 0;
    public static int ssss0073s0073s = 1;
    private static final nllnnnn x007800780078xx0078;

    static {
        nllnnnn nllnnnnVar = new nllnnnn();
        int i = s007300730073ss0073s;
        if (((ssss0073s0073s + i) * i) % s0073ss0073s0073s != 0) {
            s007300730073ss0073s = 23;
            ssss0073s0073s = 43;
        }
        x007800780078xx0078 = nllnnnnVar;
    }

    public static String o006F006Fo006Foo(String str, int i, int i2, int i3) {
        int i4 = s007300730073ss0073s;
        if (((ssss0073s0073s + i4) * i4) % s0073ss0073s0073s != 0) {
            s007300730073ss0073s = 29;
            ssss0073s0073s = ss0073s0073s0073s();
        }
        char c = (char) i;
        if (i2 != -1) {
            return jxxjjxx.sss0073ss0073s(str, c, (char) i2, (char) i3);
        }
        String strSs0073sss0073s = jxxjjxx.ss0073sss0073s(str, c, (char) i3);
        int i5 = s007300730073ss0073s;
        if (((ssss0073s0073s + i5) * i5) % s0073ss0073s0073s != 0) {
            s007300730073ss0073s = ss0073s0073s0073s();
            ssss0073s0073s = 22;
        }
        return strSs0073sss0073s;
    }

    private static void oo006Fo006Foo(String str, String str2, String str3) {
        x007800780078xx0078.o006Fooo006Fo(str, str2, str3);
        int i = s007300730073ss0073s;
        int i2 = ssss0073s0073s;
        int i3 = (i + i2) * i;
        int i4 = s0073ss0073s0073s;
        if (a.z(i, i2, i, i4) != 0) {
            s007300730073ss0073s = ss0073s0073s0073s();
            ssss0073s0073s = ss0073s0073s0073s();
        }
        if (i3 % i4 != 0) {
            s007300730073ss0073s = 71;
            ssss0073s0073s = ss0073s0073s0073s();
        }
    }

    public static <T extends Enum<T>> T ooo006F006Foo(Class<T> cls, String str) {
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException e) {
            int iSs0073s0073s0073s = ss0073s0073s0073s();
            if (((ssss0073s0073s + iSs0073s0073s0073s) * iSs0073s0073s0073s) % s0073ss0073s0073s != 0) {
                int iSs0073s0073s0073s2 = ss0073s0073s0073s();
                int iSs0073s0073s0073s3 = ss0073s0073s0073s();
                if (((s00730073s0073s0073s() + iSs0073s0073s0073s3) * iSs0073s0073s0073s3) % s0073ss0073s0073s != 0) {
                    s007300730073ss0073s = ss0073s0073s0073s();
                    ssss0073s0073s = ss0073s0073s0073s();
                }
                s007300730073ss0073s = iSs0073s0073s0073s2;
                ssss0073s0073s = ss0073s0073s0073s();
            }
            String str2 = x007800780078xx0078.o006F006F006F006Foo(cls.getName()).oo006F006F006Foo().get(str);
            if (str2 != null) {
                return (T) Enum.valueOf(cls, str2);
            }
            throw e;
        }
    }

    public static int s00730073s0073s0073s() {
        return 1;
    }

    public static int ss0073s0073s0073s() {
        return 92;
    }
}
