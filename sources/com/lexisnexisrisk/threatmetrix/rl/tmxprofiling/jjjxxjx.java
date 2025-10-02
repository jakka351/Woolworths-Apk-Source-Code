package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

/* loaded from: classes6.dex */
public class jjjxxjx {
    public static long l006C006C006C006Cll = 6679555027706783292L;
    public static long l006C006C006Cl006Cl = -3263308525856062831L;
    public static boolean l006C006Cl006C006Cl = false;
    public static long l006C006Cl006Cll = 6587823418555089822L;
    public static long l006C006Cll006Cl = 4630637461447550213L;
    public static int l006Cl006C006C006Cl = 0;
    public static long l006Cl006C006Cll = -8112336432018216687L;
    public static long l006Cl006Cl006Cl = 2782025085704161583L;
    public static long l006Cll006C006Cl = 7736194929156833902L;
    public static long l006Clll006Cl = 7314722333016761910L;
    public static Object ll006C006C006C006Cl = new Object();
    public static long ll006C006C006Cll = -5214735202691593395L;
    public static long ll006C006Cl006Cl = -4054072857262821060L;
    public static long ll006Cl006C006Cl = -694276805381334985L;
    public static long ll006Cll006Cl = -4385808284234152137L;
    public static long lll006C006C006Cl = 16;
    public static long lll006C006Cll = -7471540799943793289L;
    public static long lll006Cl006Cl = 2051202128432303721L;
    public static long llll006C006Cl = 2058613317650917154L;
    public static long lllll006Cl = 2463109832749927595L;

    public static void s00730073s0073sss(int i, long j) {
        switch (i) {
            case 0:
                l006C006Cl006Cll = j;
                break;
            case 1:
                lll006C006Cll = j;
                break;
            case 2:
                l006Cl006C006Cll = j;
                break;
            case 3:
                ll006C006C006Cll = j;
                break;
            case 4:
                l006C006C006C006Cll = j;
                break;
            case 5:
                lllll006Cl = j;
                break;
            case 6:
                l006Clll006Cl = j;
                break;
            case 7:
                ll006Cll006Cl = j;
                break;
            case 8:
                l006C006Cll006Cl = j;
                break;
            case 9:
                lll006Cl006Cl = j;
                break;
            case 10:
                l006Cl006Cl006Cl = j;
                break;
            case 11:
                ll006C006Cl006Cl = j;
                break;
            case 12:
                l006C006C006Cl006Cl = j;
                break;
            case 13:
                llll006C006Cl = j;
                break;
            case 14:
                l006Cll006C006Cl = j;
                break;
            case 15:
                ll006Cl006C006Cl = j;
                break;
        }
    }

    public static int s0073s00730073sss() {
        if (!l006C006Cl006C006Cl) {
            synchronized (ll006C006C006C006Cl) {
                try {
                    if (!l006C006Cl006C006Cl) {
                        for (long j = 0; j < 10; j++) {
                            lll006C006C006Cl = ss007300730073sss();
                        }
                        l006C006Cl006C006Cl = true;
                    }
                } finally {
                }
            }
        }
        return (int) lll006C006C006Cl;
    }

    public static long ss007300730073sss() {
        long jSss00730073sss = sss00730073sss(l006Cl006C006C006Cl);
        int i = (l006Cl006C006C006Cl + 1) & 15;
        l006Cl006C006C006Cl = i;
        long jSss00730073sss2 = sss00730073sss(i);
        long j = jSss00730073sss2 ^ (jSss00730073sss2 << 31);
        long j2 = j ^ jSss00730073sss;
        s00730073s0073sss(l006Cl006C006C006Cl, (jSss00730073sss >> 30) ^ ((j >> 11) ^ j2));
        return sss00730073sss(l006Cl006C006C006Cl) * 1181783497276652981L;
    }

    public static long sss00730073sss(int i) {
        switch (i) {
            case 0:
                return l006C006Cl006Cll;
            case 1:
                return lll006C006Cll;
            case 2:
                return l006Cl006C006Cll;
            case 3:
                return ll006C006C006Cll;
            case 4:
                return l006C006C006C006Cll;
            case 5:
                return lllll006Cl;
            case 6:
                return l006Clll006Cl;
            case 7:
                return ll006Cll006Cl;
            case 8:
                return l006C006Cll006Cl;
            case 9:
                return lll006Cl006Cl;
            case 10:
                return l006Cl006Cl006Cl;
            case 11:
                return ll006C006Cl006Cl;
            case 12:
                return l006C006C006Cl006Cl;
            case 13:
                return llll006C006Cl;
            case 14:
                return l006Cll006C006Cl;
            case 15:
                return ll006Cl006C006Cl;
            default:
                return 0L;
        }
    }
}
