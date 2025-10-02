package com.behaviosec.rl;

import YU.a;

/* loaded from: classes4.dex */
public final class ylyllll extends uxuuxxu {
    public static int e0065006500650065eee = 2;
    public static int e0065e00650065eee = 61;
    public static int ee006500650065eee = 1;
    public static int ee0065ee0065ee = 0;
    private static final int j006A006Ajj006Aj = 1921;
    private static final int j006Ajjj006Aj = 127;
    private static final int jj006Ajj006Aj = 2048;

    public static int e00650065ee0065ee() {
        return 1;
    }

    public static int e0065eee0065ee() {
        return 81;
    }

    public static int eeeee0065ee() {
        return 0;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int r00720072r007200720072() {
        int i = e0065e00650065eee;
        int i2 = (ee006500650065eee + i) * i;
        int i3 = e0065006500650065eee;
        if (i2 % i3 == 0) {
            return j006A006Ajj006Aj;
        }
        e0065e00650065eee = 51;
        ee006500650065eee = 60;
        if (a.z(51, 60, 51, i3) == eeeee0065ee()) {
            return j006A006Ajj006Aj;
        }
        e0065e00650065eee = 69;
        ee006500650065eee = 93;
        return j006A006Ajj006Aj;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public boolean r0072r0072007200720072(int i) {
        if (i < 0 || ((i > 0 && i < 128) || i >= 2048)) {
            return false;
        }
        int i2 = e0065e00650065eee;
        if (((ee006500650065eee + i2) * i2) % e0065006500650065eee != 0) {
            e0065e00650065eee = e0065eee0065ee();
            ee0065ee0065ee = e0065eee0065ee();
            int i3 = e0065e00650065eee;
            if (((ee006500650065eee + i3) * i3) % e0065006500650065eee != 0) {
                e0065e00650065eee = e0065eee0065ee();
                ee0065ee0065ee = e0065eee0065ee();
            }
        }
        return true;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rr0072r007200720072(int i) {
        int i2 = i % j006A006Ajj006Aj;
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            if ((e0065eee0065ee() * (e0065eee0065ee() + ee006500650065eee)) % e0065006500650065eee != ee0065ee0065ee) {
                e0065e00650065eee = 27;
                ee0065ee0065ee = 50;
            }
            i2 += j006A006Ajj006Aj;
        }
        return i2 + 127;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rrr0072007200720072(int i) {
        int i2 = e0065e00650065eee;
        if (((ee006500650065eee + i2) * i2) % e0065006500650065eee != ee0065ee0065ee) {
            e0065e00650065eee = e0065eee0065ee();
            ee0065ee0065ee = 17;
        }
        int i3 = e0065e00650065eee;
        if (((ee006500650065eee + i3) * i3) % e0065006500650065eee != eeeee0065ee()) {
            e0065e00650065eee = e0065eee0065ee();
            ee006500650065eee = 40;
        }
        if (i == 0) {
            return 0;
        }
        return i - 127;
    }
}
