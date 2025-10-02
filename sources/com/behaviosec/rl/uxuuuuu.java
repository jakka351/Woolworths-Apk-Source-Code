package com.behaviosec.rl;

import YU.a;

/* loaded from: classes4.dex */
public final class uxuuuuu {
    public static int e00650065e00650065ee = 91;
    public static int e0065e006500650065ee = 1;
    public static int ee0065006500650065ee = 2;
    public static int eee006500650065ee = 0;
    public static final int j006A006A006Aj006Aj = 55296;
    public static final int j006Ajj006A006Aj = 56320;
    public static final int jj006Aj006A006Aj = 57344;
    public static final int jjjj006A006Aj = 56320;
    private final String j006A006Aj006A006Aj;
    private int j006Aj006A006A006Aj;
    private final int jjj006A006A006Aj;

    public uxuuuuu(String str) {
        this.j006A006Aj006A006Aj = str;
        this.jjj006A006A006Aj = str.length();
    }

    public static int e00650065006500650065ee() {
        return 24;
    }

    public boolean p0070pppppp() {
        int i = e00650065e00650065ee;
        int i2 = e0065e006500650065ee;
        int i3 = ee0065006500650065ee;
        if (((i + i2) * i) % i3 != eee006500650065ee) {
            if (a.z(i, i2, i, i3) != 0) {
                e00650065e00650065ee = e00650065006500650065ee();
                eee006500650065ee = 77;
            }
            e00650065e00650065ee = 61;
            eee006500650065ee = e00650065006500650065ee();
        }
        return this.j006Aj006A006A006Aj < this.jjj006A006A006Aj;
    }

    public int rr00720072007200720072() {
        char cCharAt = this.j006A006Aj006A006Aj.charAt(this.j006Aj006A006A006Aj);
        this.j006Aj006A006A006Aj++;
        int i = e00650065e00650065ee;
        int i2 = e0065e006500650065ee;
        int i3 = ee0065006500650065ee;
        int i4 = ((i + i2) * i) % i3;
        int i5 = eee006500650065ee;
        if (i4 != i5) {
            if (a.z(i, i2, i, i3) != i5) {
                e00650065e00650065ee = e00650065006500650065ee();
                eee006500650065ee = e00650065006500650065ee();
            }
            e00650065e00650065ee = 12;
            eee006500650065ee = e00650065006500650065ee();
        }
        return cCharAt & 65535;
    }
}
