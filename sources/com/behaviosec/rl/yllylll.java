package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class yllylll {
    public static int e00650065eeeee = 1;
    public static int e0065eeeeee = 50;
    public static int ee0065eeeee = 0;
    public static Object j006A006Aj006Ajj = new Object();
    public static boolean j006Ajj006Ajj = false;
    public static long jj006Aj006Ajj = 1;
    public static long jjjj006Ajj;

    static {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                e0065eeeeee = e0065e0065eeee();
                jjjj006Ajj = -7121122422119481321L;
                return;
            }
        }
    }

    public static int e0065e0065eeee() {
        return 65;
    }

    public static int eee0065eeee() {
        return 2;
    }

    public static int r007200720072r00720072() {
        if (!j006Ajj006Ajj) {
            synchronized (j006A006Aj006Ajj) {
                try {
                    if (!j006Ajj006Ajj) {
                        for (long j = 0; j < 10; j++) {
                            jj006Aj006Ajj = rr00720072r00720072();
                        }
                        j006Ajj006Ajj = true;
                    }
                } finally {
                }
            }
        }
        return (int) jj006Aj006Ajj;
    }

    public static long rr00720072r00720072() {
        long j = jjjj006Ajj - 7046029254386353131L;
        jjjj006Ajj = j;
        long j2 = (j ^ (j >> 30)) * (-4658895280553007687L);
        int i = e0065eeeeee;
        if (((e00650065eeeee + i) * i) % eee0065eeee() != ee0065eeeee) {
            e0065eeeeee = e0065e0065eeee();
            ee0065eeeee = 39;
        }
        long j3 = (j2 ^ (j2 >> 27)) * (-7723592293110705685L);
        return j3 ^ (j3 >> 31);
    }
}
