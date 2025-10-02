package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public class qbqqqbb {
    public static int s00730073ss00730073 = 1;
    public static int s0073sss00730073 = 42;
    public static int ss0073ss00730073 = 0;
    public static int sss0073s00730073 = 2;
    public static Object w007700770077w00770077 = null;
    public static long w00770077ww00770077 = 0;
    public static boolean w0077w0077w00770077 = false;
    public static long ww00770077w00770077 = 0;
    public static long www0077w00770077 = 1;

    static {
        int i = s0073sss00730073;
        if (((s00730073ss00730073 + i) * i) % sss0073s00730073 != s0073s0073s00730073()) {
            s0073sss00730073 = ss00730073s00730073();
            ss0073ss00730073 = 63;
        }
        w0077w0077w00770077 = false;
        ww00770077w00770077 = 2L;
        w007700770077w00770077 = new Object();
        w00770077ww00770077 = 6057401513514261074L;
        www0077w00770077 = 8908944370354508047L;
    }

    public static long q007100710071q0071q() {
        long j = w00770077ww00770077;
        long j2 = www0077w00770077;
        long j3 = j2 + j;
        w00770077ww00770077 = j2;
        long j4 = j ^ (j << 23);
        long j5 = (j4 >> 18) ^ (j4 ^ j2);
        long j6 = j2 >> 5;
        int i = s0073sss00730073;
        if (((s00730073ss00730073 + i) * i) % sss0073s00730073 != ss0073ss00730073) {
            s0073sss00730073 = 79;
            ss0073ss00730073 = 35;
        }
        www0077w00770077 = j5 ^ j6;
        return j3;
    }

    public static int qq00710071q0071q() {
        if (!w0077w0077w00770077) {
            synchronized (w007700770077w00770077) {
                try {
                    if (!w0077w0077w00770077) {
                        for (long j = 0; j < 10; j++) {
                            ww00770077w00770077 = q007100710071q0071q();
                        }
                        w0077w0077w00770077 = true;
                    }
                } finally {
                }
            }
        }
        return (int) ww00770077w00770077;
    }

    public static int s0073s0073s00730073() {
        return 0;
    }

    public static int ss00730073s00730073() {
        return 46;
    }
}
