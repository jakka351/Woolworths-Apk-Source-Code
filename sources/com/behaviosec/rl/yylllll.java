package com.behaviosec.rl;

/* loaded from: classes4.dex */
public final class yylllll extends uxuuxxu {
    public static int e0065ee00650065ee = 0;
    public static int ee00650065e0065ee = 1;
    public static int ee0065e00650065ee = 2;
    public static int eee0065e0065ee = 7;
    private static final int j006Aj006Aj006Aj = 128;
    private static final int jj006A006Aj006Aj = 127;
    private static final int jjj006Aj006Aj = 1;

    public static int e006500650065e0065ee() {
        return 2;
    }

    public static int e0065e0065e0065ee() {
        return 0;
    }

    public static int eeee00650065ee() {
        return 79;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int r00720072r007200720072() {
        int i = eee0065e0065ee;
        int i2 = (ee00650065e0065ee + i) * i;
        int iE006500650065e0065ee = e006500650065e0065ee();
        int i3 = eee0065e0065ee;
        if (((ee00650065e0065ee + i3) * i3) % ee0065e00650065ee != e0065ee00650065ee) {
            eee0065e0065ee = 59;
            e0065ee00650065ee = 2;
        }
        if (i2 % iE006500650065e0065ee != e0065e0065e0065ee()) {
            eee0065e0065ee = eeee00650065ee();
            ee00650065e0065ee = eeee00650065ee();
        }
        return 127;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public boolean r0072r0072007200720072(int i) {
        if (i < 1 || i >= 128) {
            return false;
        }
        int i2 = eee0065e0065ee;
        if (((ee00650065e0065ee + i2) * i2) % e006500650065e0065ee() != e0065e0065e0065ee()) {
            eee0065e0065ee = 55;
            e0065ee00650065ee = 71;
        }
        return true;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rr0072r007200720072(int i) {
        int i2 = i % 127;
        if (i2 < 0) {
            i2 += 127;
        }
        return i2 + 1;
    }

    @Override // com.behaviosec.rl.uxuuxxu
    public int rrr0072007200720072(int i) {
        return i - 1;
    }
}
