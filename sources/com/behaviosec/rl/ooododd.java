package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class ooododd {
    public static int v007600760076vv0076v = 2;
    public static int v0076v0076vv0076v = 0;
    public static int vv00760076vv0076v = 1;
    public static int vvv0076vv0076v = 3;

    public static int vvvv0076v0076v() {
        return 70;
    }

    public double[] ss0073ss0073s(double[] dArr, double[] dArr2, int i) {
        int length = dArr2.length;
        double[] dArr3 = new double[length];
        dArr3[0] = dArr2[0] * Math.cos(dArr[0]);
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = i2 * i;
            if (i3 % dArr.length == 0) {
                dArr3[i2] = dArr2[i2] * Math.cos(dArr[0]);
            } else {
                double d = dArr2[i2];
                int length2 = length - (i3 % dArr.length);
                int i4 = vvv0076vv0076v;
                if (((vv00760076vv0076v + i4) * i4) % v007600760076vv0076v != v0076v0076vv0076v) {
                    vvv0076vv0076v = vvvv0076v0076v();
                    v0076v0076vv0076v = vvvv0076v0076v();
                }
                dArr3[i2] = d * Math.cos(dArr[length2]);
            }
        }
        return dArr3;
    }
}
