package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

/* loaded from: classes6.dex */
public class kkkkuku {
    public static Object c006300630063ccc = null;
    public static long c00630063cccc = 0;
    public static long c0063c0063ccc = 0;
    public static long c0063ccccc = 0;
    public static int cc00630063ccc = 0;
    public static long cc0063cccc = 0;
    public static boolean ccc0063ccc = false;
    public static int i006900690069i00690069 = 81;
    public static int i0069ii006900690069 = 1;
    public static int ii0069i006900690069 = 2;
    public static long r007200720072r00720072;
    public static long r00720072r007200720072;
    public static long r00720072rr00720072;
    public static long r0072r0072007200720072;
    public static long r0072r0072r00720072;
    public static long r0072rr007200720072;
    public static long rr00720072007200720072;
    public static long rr00720072r00720072;
    public static long rr0072r007200720072;
    public static long rr0072rr00720072;
    public static long rrr0072007200720072;
    public static long rrr0072r00720072;
    public static long rrrr007200720072;

    static {
        int i = i006900690069i00690069;
        if (((i0069ii006900690069 + i) * i) % ii0069i006900690069 != iiii006900690069()) {
            i006900690069i00690069 = 17;
            i0069ii006900690069 = 14;
        }
        ccc0063ccc = false;
        c0063c0063ccc = 16L;
        cc00630063ccc = 0;
        c006300630063ccc = new Object();
        rr0072rr00720072 = 1813014143045420503L;
        r00720072rr00720072 = 195255307112449467L;
        rrr0072r00720072 = 7440268397916008314L;
        r0072r0072r00720072 = -2265253250849518384L;
        rr00720072r00720072 = -1406659380209726727L;
        r007200720072r00720072 = 8967583266924500573L;
        rrrr007200720072 = 7339345059395099165L;
        r0072rr007200720072 = -1882674668582847015L;
        rr0072r007200720072 = 6050282214038534454L;
        r00720072r007200720072 = -5050382496599542815L;
        rrr0072007200720072 = 5143864278020733483L;
        r0072r0072007200720072 = 2679064315910234476L;
        rr00720072007200720072 = -3312119438346134319L;
        c0063ccccc = -6341431742550848957L;
        cc0063cccc = -155628620450940800L;
        c00630063cccc = -212477762311609681L;
    }

    public static int iiii006900690069() {
        return 0;
    }

    public static long k006B006B006Bkk006B(int i) {
        switch (i) {
            case 0:
                return rr0072rr00720072;
            case 1:
                return r00720072rr00720072;
            case 2:
                return rrr0072r00720072;
            case 3:
                return r0072r0072r00720072;
            case 4:
                return rr00720072r00720072;
            case 5:
                return r007200720072r00720072;
            case 6:
                return rrrr007200720072;
            case 7:
                return r0072rr007200720072;
            case 8:
                return rr0072r007200720072;
            case 9:
                return r00720072r007200720072;
            case 10:
                return rrr0072007200720072;
            case 11:
                return r0072r0072007200720072;
            case 12:
                return rr00720072007200720072;
            case 13:
                return c0063ccccc;
            case 14:
                return cc0063cccc;
            case 15:
                return c00630063cccc;
            default:
                return 0L;
        }
    }

    public static long k006Bkk006Bk006B() {
        long jK006B006B006Bkk006B = k006B006B006Bkk006B(cc00630063ccc);
        int i = (cc00630063ccc + 1) & 15;
        cc00630063ccc = i;
        long jK006B006B006Bkk006B2 = k006B006B006Bkk006B(i);
        long j = jK006B006B006Bkk006B2 ^ (jK006B006B006Bkk006B2 << 31);
        int i2 = cc00630063ccc;
        long j2 = (j >> 11) ^ (j ^ jK006B006B006Bkk006B);
        int i3 = i006900690069i00690069;
        if (((i0069ii006900690069 + i3) * i3) % ii0069i006900690069 != iiii006900690069()) {
            i006900690069i00690069 = 50;
            i0069ii006900690069 = 67;
        }
        kk006B006Bkk006B(i2, (jK006B006B006Bkk006B >> 30) ^ j2);
        return k006B006B006Bkk006B(cc00630063ccc) * 1181783497276652981L;
    }

    public static void kk006B006Bkk006B(int i, long j) {
        switch (i) {
            case 0:
                rr0072rr00720072 = j;
                break;
            case 1:
                r00720072rr00720072 = j;
                break;
            case 2:
                rrr0072r00720072 = j;
                break;
            case 3:
                r0072r0072r00720072 = j;
                break;
            case 4:
                rr00720072r00720072 = j;
                break;
            case 5:
                r007200720072r00720072 = j;
                break;
            case 6:
                rrrr007200720072 = j;
                break;
            case 7:
                r0072rr007200720072 = j;
                break;
            case 8:
                rr0072r007200720072 = j;
                break;
            case 9:
                r00720072r007200720072 = j;
                break;
            case 10:
                rrr0072007200720072 = j;
                break;
            case 11:
                r0072r0072007200720072 = j;
                break;
            case 12:
                rr00720072007200720072 = j;
                break;
            case 13:
                c0063ccccc = j;
                break;
            case 14:
                cc0063cccc = j;
                break;
            case 15:
                c00630063cccc = j;
                break;
        }
    }

    public static int kkkk006Bk006B() {
        if (!ccc0063ccc) {
            synchronized (c006300630063ccc) {
                try {
                    if (!ccc0063ccc) {
                        for (long j = 0; j < 10; j++) {
                            c0063c0063ccc = k006Bkk006Bk006B();
                        }
                        ccc0063ccc = true;
                    }
                } finally {
                }
            }
        }
        return (int) c0063c0063ccc;
    }
}
