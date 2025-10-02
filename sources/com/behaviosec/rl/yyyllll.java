package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class yyyllll {
    public static int e0065ee0065eee = 1;
    public static int ee0065e0065eee = 2;
    public static int eeee0065eee = 55;
    public static long j006A006A006A006Ajj;
    public static long j006Aj006A006Ajj;
    public static boolean jj006A006A006Ajj;
    public static long jjj006A006Ajj;
    public static Object jjjjj006Aj;

    static {
        int i = eeee0065eee;
        if (((eee00650065eee() + i) * i) % ee0065e0065eee != 0) {
            eeee0065eee = 99;
            e0065ee0065eee = 35;
        }
        jj006A006A006Ajj = false;
        j006A006A006A006Ajj = 2L;
        jjjjj006Aj = new Object();
        jjj006A006Ajj = 8455433161065545139L;
        j006Aj006A006Ajj = 1043846628638179597L;
    }

    public static int e00650065e0065eee() {
        return 79;
    }

    public static int eee00650065eee() {
        return 1;
    }

    public static long r0072rr007200720072() {
        long j = jjj006A006Ajj;
        int i = eeee0065eee;
        if (((e0065ee0065eee + i) * i) % ee0065e0065eee != 0) {
            eeee0065eee = e00650065e0065eee();
            e0065ee0065eee = e00650065e0065eee();
        }
        long j2 = j006Aj006A006Ajj;
        long j3 = j2 + j;
        jjj006A006Ajj = j2;
        long j4 = j ^ (j << 23);
        j006Aj006A006Ajj = ((j4 >> 18) ^ (j4 ^ j2)) ^ (j2 >> 5);
        return j3;
    }

    public static int rrrr007200720072() {
        if (!jj006A006A006Ajj) {
            synchronized (jjjjj006Aj) {
                try {
                    if (!jj006A006A006Ajj) {
                        for (long j = 0; j < 10; j++) {
                            j006A006A006A006Ajj = r0072rr007200720072();
                        }
                        jj006A006A006Ajj = true;
                    }
                } finally {
                }
            }
        }
        return (int) j006A006A006A006Ajj;
    }
}
