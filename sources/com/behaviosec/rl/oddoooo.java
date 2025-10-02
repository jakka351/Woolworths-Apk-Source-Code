package com.behaviosec.rl;

import java.util.HashMap;

/* loaded from: classes4.dex */
public class oddoooo {
    public static int p00700070p0070p0070p = 0;
    public static int p0070p00700070p0070p = 2;
    public static int pp0070p0070p0070p = 60;
    public static int ppp00700070p0070p = 1;
    private final HashMap<String, oodoooo> p0070pp0070p0070 = new HashMap<>();

    public static int pp007000700070p0070p() {
        return 39;
    }

    public HashMap<String, oodoooo> j006Aj006Aj006A006A() {
        int i = pp0070p0070p0070p;
        if (((ppp00700070p0070p + i) * i) % p0070p00700070p0070p != p00700070p0070p0070p) {
            pp0070p0070p0070p = pp007000700070p0070p();
            p00700070p0070p0070p = 48;
        }
        int i2 = pp0070p0070p0070p;
        if (((ppp00700070p0070p + i2) * i2) % p0070p00700070p0070p != p00700070p0070p0070p) {
            pp0070p0070p0070p = pp007000700070p0070p();
            p00700070p0070p0070p = 79;
        }
        return this.p0070pp0070p0070;
    }

    public void jj006A006Aj006A006A(String str, String str2, String str3) {
        if (!this.p0070pp0070p0070.containsKey(str)) {
            oodoooo oodooooVar = new oodoooo();
            oodooooVar.jj006Ajj006A006A(str2, str3);
            this.p0070pp0070p0070.put(str, oodooooVar);
            return;
        }
        oodoooo oodooooVar2 = this.p0070pp0070p0070.get(str);
        int i = pp0070p0070p0070p;
        if (((ppp00700070p0070p + i) * i) % p0070p00700070p0070p != p00700070p0070p0070p) {
            pp0070p0070p0070p = pp007000700070p0070p();
            p00700070p0070p0070p = 3;
            if ((pp007000700070p0070p() * (pp007000700070p0070p() + ppp00700070p0070p)) % p0070p00700070p0070p != p00700070p0070p0070p) {
                pp0070p0070p0070p = 68;
                p00700070p0070p0070p = pp007000700070p0070p();
            }
        }
        oodooooVar2.jj006Ajj006A006A(str2, str3);
    }

    public oodoooo jjj006Aj006A006A(String str) {
        HashMap<String, oodoooo> map = this.p0070pp0070p0070;
        int i = pp0070p0070p0070p;
        int i2 = ppp00700070p0070p;
        int i3 = i + i2;
        int i4 = (i2 + i) * i;
        int i5 = p0070p00700070p0070p;
        if (i4 % i5 != 0) {
            pp0070p0070p0070p = 91;
            p00700070p0070p0070p = 44;
        }
        if ((i3 * pp0070p0070p0070p) % i5 != p00700070p0070p0070p) {
            pp0070p0070p0070p = 57;
            p00700070p0070p0070p = 98;
        }
        return map.get(str);
    }
}
