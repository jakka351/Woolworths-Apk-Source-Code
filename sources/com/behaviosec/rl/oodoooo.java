package com.behaviosec.rl;

import java.util.HashMap;

/* loaded from: classes4.dex */
public class oodoooo {
    public static int p007000700070pp0070p = 2;
    public static int p0070p0070pp0070p = 68;
    public static int p0070pp0070p0070p = 0;
    public static int pp00700070pp0070p = 1;
    private final HashMap<String, String> pppp0070p0070 = new HashMap<>();

    public static int pppp0070p0070p() {
        return 78;
    }

    public HashMap<String, String> j006A006Ajj006A006A() {
        int i = p0070p0070pp0070p;
        if (((pp00700070pp0070p + i) * i) % p007000700070pp0070p != 0) {
            int iPppp0070p0070p = pppp0070p0070p();
            int i2 = p0070p0070pp0070p;
            if (((pp00700070pp0070p + i2) * i2) % p007000700070pp0070p != 0) {
                p0070p0070pp0070p = pppp0070p0070p();
                pp00700070pp0070p = pppp0070p0070p();
            }
            p0070p0070pp0070p = iPppp0070p0070p;
            pp00700070pp0070p = pppp0070p0070p();
        }
        return this.pppp0070p0070;
    }

    public void jj006Ajj006A006A(String str, String str2) {
        this.pppp0070p0070.put(str, str2);
        int i = p0070p0070pp0070p;
        int i2 = pp00700070pp0070p;
        int i3 = i + i2;
        if (((i2 + i) * i) % p007000700070pp0070p != 0) {
            p0070p0070pp0070p = 14;
            p0070pp0070p0070p = pppp0070p0070p();
        }
        if ((i3 * i) % p007000700070pp0070p != p0070pp0070p0070p) {
            p0070p0070pp0070p = pppp0070p0070p();
            p0070pp0070p0070p = 75;
        }
    }
}
