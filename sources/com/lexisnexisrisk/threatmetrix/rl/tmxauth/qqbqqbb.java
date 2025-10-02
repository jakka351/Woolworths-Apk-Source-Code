package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public class qqbqqbb {
    public static int s007300730073s00730073 = 41;
    public static int ss0073s007300730073 = 2;
    public static int sss0073007300730073 = 1;
    public static int ssss007300730073;
    public static Object w00770077w007700770077;
    public static boolean w0077ww007700770077;
    public static long ww0077w007700770077;
    public static long wwww007700770077;

    static {
        int i = s007300730073s00730073;
        if (((sss0073007300730073 + i) * i) % ss0073s007300730073 != ssss007300730073) {
            s007300730073s00730073 = s00730073s007300730073();
            ssss007300730073 = s00730073s007300730073();
        }
        w0077ww007700770077 = false;
        ww0077w007700770077 = 1L;
        w00770077w007700770077 = new Object();
        wwww007700770077 = -8514232204930900037L;
    }

    public static int q0071qq00710071q() {
        if (!w0077ww007700770077) {
            synchronized (w00770077w007700770077) {
                try {
                    if (!w0077ww007700770077) {
                        for (long j = 0; j < 10; j++) {
                            ww0077w007700770077 = qqqq00710071q();
                        }
                        w0077ww007700770077 = true;
                    }
                } finally {
                }
            }
        }
        return (int) ww0077w007700770077;
    }

    public static long qqqq00710071q() {
        long j = wwww007700770077 - 7046029254386353131L;
        wwww007700770077 = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        if (((s0073ss007300730073() + s007300730073s00730073) * s007300730073s00730073) % ss0073s007300730073 != ssss007300730073) {
            s007300730073s00730073 = s00730073s007300730073();
            ssss007300730073 = s00730073s007300730073();
        }
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }

    public static int s00730073s007300730073() {
        return 20;
    }

    public static int s0073ss007300730073() {
        return 1;
    }
}
