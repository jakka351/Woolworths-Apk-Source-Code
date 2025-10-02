package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

/* loaded from: classes6.dex */
public class qbbqqbb {
    public static long k006Bkkkkk = 2;
    public static Object kk006Bkkkk = null;
    public static int l006Clllll = 2;
    public static int lll006Clll = 0;
    public static int s0073s0073007300730073 = 75;
    public static int ss00730073007300730073 = 1;
    public static long w0077w0077007700770077 = 1;
    public static boolean ww00770077007700770077 = false;
    public static long www0077007700770077;

    static {
        Object obj = new Object();
        int i = s0073s0073007300730073;
        if (((ss00730073007300730073 + i) * i) % l006Clllll != lll006Clll) {
            s0073s0073007300730073 = ll006Cllll();
            lll006Clll = 40;
        }
        kk006Bkkkk = obj;
        www0077007700770077 = 2956946141781155184L;
        w0077w0077007700770077 = -2415875725978705927L;
    }

    public static int l006C006Cllll() {
        return 0;
    }

    public static int ll006Cllll() {
        return 69;
    }

    public static long q00710071q00710071q() {
        long j = www0077007700770077;
        long j2 = w0077w0077007700770077;
        long j3 = j + j2;
        long j4 = j2 ^ j;
        www0077007700770077 = (qq0071q00710071q(j, 55) ^ j4) ^ (j4 << 14);
        int i = s0073s0073007300730073;
        if (((ss00730073007300730073 + i) * i) % l006Clllll != l006C006Cllll()) {
            s0073s0073007300730073 = 11;
            ss00730073007300730073 = ll006Cllll();
        }
        w0077w0077007700770077 = qq0071q00710071q(j4, 36);
        return j3;
    }

    public static long qq0071q00710071q(long j, int i) {
        long j2 = j << i;
        int i2 = s0073s0073007300730073;
        if (((ss00730073007300730073 + i2) * i2) % l006Clllll != 0) {
            s0073s0073007300730073 = 86;
            ss00730073007300730073 = ll006Cllll();
        }
        return (j >> (64 - i)) | j2;
    }

    public static int qqq007100710071q() {
        if (!ww00770077007700770077) {
            synchronized (kk006Bkkkk) {
                try {
                    if (!ww00770077007700770077) {
                        for (long j = 0; j < 10; j++) {
                            k006Bkkkkk = q00710071q00710071q();
                        }
                        ww00770077007700770077 = true;
                    }
                } finally {
                }
            }
        }
        return (int) k006Bkkkkk;
    }
}
