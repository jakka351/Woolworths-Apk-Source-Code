package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class oddoodd {
    public static int v0076vvvv0076v = 1;
    public static int vvvvvv0076v = 74;

    public static int v00760076vvv0076v() {
        return 48;
    }

    public static int vv0076vvv0076v() {
        return 2;
    }

    public double[] calc(double[] dArr, double[] dArr2, int i) {
        int length = dArr2.length;
        double[] dArr3 = new double[length];
        dArr3[0] = dArr2[0] * Math.sin(-dArr[0]);
        int i2 = 1;
        while (true) {
            int i3 = vvvvvv0076v;
            if (((v0076vvvv0076v + i3) * i3) % vv0076vvv0076v() != 0) {
                vvvvvv0076v = v00760076vvv0076v();
                v0076vvvv0076v = v00760076vvv0076v();
            }
            if (i2 >= length) {
                return dArr3;
            }
            int i4 = i2 * i;
            if (i4 % dArr.length == 0) {
                dArr3[i2] = dArr2[i2] * Math.sin(dArr[0]);
            } else {
                dArr3[i2] = dArr2[i2] * Math.sin(dArr[length - (i4 % dArr.length)]);
            }
            i2++;
        }
    }
}
