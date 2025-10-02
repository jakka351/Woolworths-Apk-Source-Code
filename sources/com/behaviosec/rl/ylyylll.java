package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class ylyylll {
    public static int c006300630063c006300630063 = 2;
    public static int c0063c0063c006300630063 = 62;
    public static int c0063cc0063006300630063 = 0;
    public static int cc00630063c006300630063 = 1;
    public static int j006Ajjjjj = 0;
    public static Object jj006Ajjjj = null;
    public static long q0071007100710071q0071 = 2;
    public static long q007100710071q00710071 = 10;
    public static long q00710071q007100710071 = 0;
    public static long q00710071qq00710071 = 6;
    public static boolean q0071q0071007100710071 = false;
    public static long q0071q00710071q0071 = 0;
    public static long q0071q0071q00710071 = 8;
    public static long q0071qq007100710071 = 12;
    public static long q0071qqq00710071 = 4;
    public static long qq00710071007100710071 = 0;
    public static long qq007100710071q0071 = 1;
    public static long qq00710071q00710071 = 9;
    public static long qq0071q007100710071 = 13;
    public static long qq0071qq00710071 = 5;
    public static long qqq0071007100710071 = 0;
    public static long qqq0071q00710071 = 7;
    public static long qqqq007100710071 = 11;
    public static long qqqqq00710071 = 3;

    static {
        int i = c0063c0063c006300630063;
        if (((cc00630063c006300630063 + i) * i) % c006300630063c006300630063 != c0063cc0063006300630063) {
            c0063c0063c006300630063 = cccc0063006300630063();
            c0063cc0063006300630063 = cccc0063006300630063();
        }
        q0071q0071007100710071 = false;
        qq00710071007100710071 = 16L;
        j006Ajjjjj = 0;
        jj006Ajjjj = new Object();
        q0071q00710071q0071 = 3129806795737832986L;
        qq007100710071q0071 = -1303521926698675980L;
        q0071007100710071q0071 = 2076582462818546637L;
        qqqqq00710071 = 2708381183357774874L;
        q0071qqq00710071 = -3851672193426844135L;
        qq0071qq00710071 = 7400821816367539839L;
        q00710071qq00710071 = 3184141788727735117L;
        qqq0071q00710071 = 2082395671328559141L;
        q0071q0071q00710071 = -339843395192752243L;
        qq00710071q00710071 = 7571462304270985734L;
        q007100710071q00710071 = 120232297863974117L;
        qqqq007100710071 = 4606644582327465544L;
        q0071qq007100710071 = -7848037085889034079L;
        qq0071q007100710071 = 306453572976154542L;
        q00710071q007100710071 = -7948378634731251237L;
        qqq0071007100710071 = 7328051220240610385L;
    }

    public static int cccc0063006300630063() {
        return 80;
    }

    public static void r0072007200720072r0072(int i, long j) {
        int i2 = c0063c0063c006300630063;
        if (((cc00630063c006300630063 + i2) * i2) % c006300630063c006300630063 != 0) {
            c0063c0063c006300630063 = 5;
            cc00630063c006300630063 = cccc0063006300630063();
        }
        switch (i) {
            case 0:
                q0071q00710071q0071 = j;
                break;
            case 1:
                qq007100710071q0071 = j;
                break;
            case 2:
                q0071007100710071q0071 = j;
                break;
            case 3:
                qqqqq00710071 = j;
                break;
            case 4:
                q0071qqq00710071 = j;
                break;
            case 5:
                qq0071qq00710071 = j;
                break;
            case 6:
                q00710071qq00710071 = j;
                break;
            case 7:
                qqq0071q00710071 = j;
                break;
            case 8:
                q0071q0071q00710071 = j;
                break;
            case 9:
                qq00710071q00710071 = j;
                break;
            case 10:
                q007100710071q00710071 = j;
                break;
            case 11:
                qqqq007100710071 = j;
                break;
            case 12:
                q0071qq007100710071 = j;
                break;
            case 13:
                qq0071q007100710071 = j;
                break;
            case 14:
                q00710071q007100710071 = j;
                break;
            case 15:
                qqq0071007100710071 = j;
                break;
        }
    }

    public static int r0072rrr00720072() {
        if (!q0071q0071007100710071) {
            synchronized (jj006Ajjjj) {
                try {
                    if (!q0071q0071007100710071) {
                        for (long j = 0; j < 10; j++) {
                            qq00710071007100710071 = rr0072rr00720072();
                        }
                        q0071q0071007100710071 = true;
                    }
                } finally {
                }
            }
        }
        return (int) qq00710071007100710071;
    }

    public static long rr0072rr00720072() {
        long jRrrrr00720072 = rrrrr00720072(j006Ajjjjj);
        int i = (j006Ajjjjj + 1) & 15;
        j006Ajjjjj = i;
        long jRrrrr007200722 = rrrrr00720072(i);
        long j = jRrrrr007200722 ^ (jRrrrr007200722 << 31);
        long j2 = j ^ jRrrrr00720072;
        r0072007200720072r0072(j006Ajjjjj, (jRrrrr00720072 >> 30) ^ ((j >> 11) ^ j2));
        return rrrrr00720072(j006Ajjjjj) * 1181783497276652981L;
    }

    public static long rrrrr00720072(int i) {
        switch (i) {
            case 0:
                return q0071q00710071q0071;
            case 1:
                return qq007100710071q0071;
            case 2:
                return q0071007100710071q0071;
            case 3:
                return qqqqq00710071;
            case 4:
                return q0071qqq00710071;
            case 5:
                return qq0071qq00710071;
            case 6:
                return q00710071qq00710071;
            case 7:
                return qqq0071q00710071;
            case 8:
                return q0071q0071q00710071;
            case 9:
                return qq00710071q00710071;
            case 10:
                return q007100710071q00710071;
            case 11:
                return qqqq007100710071;
            case 12:
                return q0071qq007100710071;
            case 13:
                return qq0071q007100710071;
            case 14:
                return q00710071q007100710071;
            case 15:
                return qqq0071007100710071;
            default:
                return 0L;
        }
    }
}
