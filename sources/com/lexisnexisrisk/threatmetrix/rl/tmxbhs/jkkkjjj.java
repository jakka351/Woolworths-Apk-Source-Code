package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

/* loaded from: classes6.dex */
public class jkkkjjj {
    public static long b0062006200620062b0062 = 0;
    public static long b006200620062b00620062 = 0;
    public static long b00620062b006200620062 = 0;
    public static long b00620062bb00620062 = 0;
    public static boolean b0062b0062006200620062 = false;
    public static long b0062b00620062b0062 = 0;
    public static long b0062b0062b00620062 = 0;
    public static long b0062bb006200620062 = 0;
    public static long b0062bbb00620062 = 0;
    public static long bb00620062006200620062 = 0;
    public static long bb006200620062b0062 = 1;
    public static long bb00620062b00620062 = 0;
    public static long bb0062b006200620062 = 0;
    public static long bb0062bb00620062 = 0;
    public static long bbb0062006200620062 = 0;
    public static long bbb0062b00620062 = 0;
    public static long bbbb006200620062 = 0;
    public static long bbbbb00620062 = 0;
    public static int g00670067g006700670067 = 70;
    public static int g0067g0067006700670067 = 1;
    public static int gg00670067006700670067 = 2;
    public static int o006Fooooo;
    public static Object oo006Foooo;

    static {
        int i = g00670067g006700670067;
        if (((g0067g0067006700670067 + i) * i) % gg00670067006700670067 != 0) {
            g00670067g006700670067 = 0;
            g0067g0067006700670067 = 91;
        }
        b0062b0062006200620062 = false;
        bb00620062006200620062 = 16L;
        o006Fooooo = 0;
        oo006Foooo = new Object();
        b0062b00620062b0062 = 4062357641135159696L;
        bb006200620062b0062 = -6433931547690676719L;
        b0062006200620062b0062 = -4990424210075647553L;
        bbbbb00620062 = 1750485882947579617L;
        b0062bbb00620062 = -4402606793327605587L;
        bb0062bb00620062 = 7311486415849943663L;
        b00620062bb00620062 = -6824392338328273679L;
        bbb0062b00620062 = 2031973575107222396L;
        b0062b0062b00620062 = -6092494671975958786L;
        bb00620062b00620062 = -66133679568274170L;
        b006200620062b00620062 = -3025123546740608582L;
        bbbb006200620062 = 2398158643614349053L;
        b0062bb006200620062 = 858795897030260817L;
        bb0062b006200620062 = -3002362357363439044L;
        b00620062b006200620062 = -7729179239797564091L;
        bbb0062006200620062 = 8913050557678860214L;
    }

    public static int ggg0067006700670067() {
        return 0;
    }

    public static int l006Clllll() {
        return 31;
    }

    public static long r00720072r00720072r(int i) {
        switch (i) {
            case 0:
                return b0062b00620062b0062;
            case 1:
                return bb006200620062b0062;
            case 2:
                return b0062006200620062b0062;
            case 3:
                return bbbbb00620062;
            case 4:
                return b0062bbb00620062;
            case 5:
                long j = bb0062bb00620062;
                int i2 = g00670067g006700670067;
                if (((g0067g0067006700670067 + i2) * i2) % gg00670067006700670067 != ggg0067006700670067()) {
                    g00670067g006700670067 = 13;
                    g0067g0067006700670067 = 27;
                }
                return j;
            case 6:
                return b00620062bb00620062;
            case 7:
                return bbb0062b00620062;
            case 8:
                return b0062b0062b00620062;
            case 9:
                return bb00620062b00620062;
            case 10:
                return b006200620062b00620062;
            case 11:
                return bbbb006200620062;
            case 12:
                return b0062bb006200620062;
            case 13:
                return bb0062b006200620062;
            case 14:
                return b00620062b006200620062;
            case 15:
                return bbb0062006200620062;
            default:
                return 0L;
        }
    }

    public static long r0072r007200720072r() {
        long jR00720072r00720072r = r00720072r00720072r(o006Fooooo);
        int i = (o006Fooooo + 1) & 15;
        o006Fooooo = i;
        long jR00720072r00720072r2 = r00720072r00720072r(i);
        try {
            throw null;
        } catch (Exception unused) {
            g00670067g006700670067 = 50;
            long j = jR00720072r00720072r2 ^ (jR00720072r00720072r2 << 31);
            long j2 = j ^ jR00720072r00720072r;
            rr0072r00720072r(o006Fooooo, (jR00720072r00720072r >> 30) ^ ((j >> 11) ^ j2));
            return r00720072r00720072r(o006Fooooo) * 1181783497276652981L;
        }
    }

    public static void rr0072r00720072r(int i, long j) {
        switch (i) {
            case 0:
                b0062b00620062b0062 = j;
                break;
            case 1:
                bb006200620062b0062 = j;
                break;
            case 2:
                b0062006200620062b0062 = j;
                break;
            case 3:
                bbbbb00620062 = j;
                break;
            case 4:
                b0062bbb00620062 = j;
                break;
            case 5:
                bb0062bb00620062 = j;
                break;
            case 6:
                b00620062bb00620062 = j;
                break;
            case 7:
                bbb0062b00620062 = j;
                break;
            case 8:
                b0062b0062b00620062 = j;
                break;
            case 9:
                bb00620062b00620062 = j;
                break;
            case 10:
                b006200620062b00620062 = j;
                break;
            case 11:
                bbbb006200620062 = j;
                break;
            case 12:
                b0062bb006200620062 = j;
                break;
            case 13:
                bb0062b006200620062 = j;
                break;
            case 14:
                b00620062b006200620062 = j;
                break;
            case 15:
                bbb0062006200620062 = j;
                break;
        }
    }

    public static int rrr007200720072r() {
        if (!b0062b0062006200620062) {
            synchronized (oo006Foooo) {
                try {
                    if (!b0062b0062006200620062) {
                        for (long j = 0; j < 10; j++) {
                            bb00620062006200620062 = r0072r007200720072r();
                        }
                        b0062b0062006200620062 = true;
                    }
                } finally {
                }
            }
        }
        return (int) bb00620062006200620062;
    }
}
