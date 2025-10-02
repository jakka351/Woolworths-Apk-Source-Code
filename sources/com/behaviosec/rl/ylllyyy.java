package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class ylllyyy {
    public static int h006800680068h0068hh = 1;
    public static int h0068h0068h0068hh = 72;
    public static int hh00680068h0068hh = 0;
    public static int hhhh00680068hh = 2;

    private ylllyyy() {
    }

    public static double d00640064d00640064d(double d, double d2) {
        int i = h0068h0068h0068hh;
        if (((h006800680068h0068hh + i) * i) % hhhh00680068hh != 0) {
            h0068h0068h0068hh = 39;
            hh00680068h0068hh = 98;
        }
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d2 : d;
    }

    public static float[] d0064d006400640064d(float[] fArr) {
        float[] fArr2 = new float[4];
        float fSqrt = ((float) Math.sqrt(fArr[0] + 1.0f + fArr[4] + fArr[8])) * 0.5f;
        fArr2[3] = fSqrt;
        try {
            throw null;
        } catch (Exception unused) {
            h0068h0068h0068hh = 87;
            fArr2[0] = (fArr[7] - fArr[5]) * (0.25f / fSqrt);
            fArr2[1] = (fArr[2] - fArr[6]) * (0.25f / fSqrt);
            fArr2[2] = (fArr[3] - fArr[1]) * (0.25f / fSqrt);
            return fArr2;
        }
    }

    public static double d0064dd00640064d(float f, float f2, float f3, float f4) {
        double d = f2 - f4;
        if (((hh0068h00680068hh() + h0068h0068h0068hh) * h0068h0068h0068hh) % hhhh00680068hh != hh00680068h0068hh) {
            h0068h0068h0068hh = h0068hh00680068hh();
            hh00680068h0068hh = h0068hh00680068hh();
        }
        return Math.atan2(d, f3 - f);
    }

    public static float[] dd0064d00640064d(float[] fArr, float[] fArr2, float f, float f2) {
        int i = h0068h0068h0068hh;
        if (((h006800680068h0068hh + i) * i) % hhhh00680068hh != hh00680068h0068hh) {
            h0068h0068h0068hh = 79;
            hh00680068h0068hh = h0068hh00680068hh();
        }
        return new float[]{(fArr[0] * f) + (fArr2[0] * f2), (fArr[1] * f) + (fArr2[1] * f2), (f * fArr[2]) + (f2 * fArr2[2])};
    }

    public static float[] ddd006400640064d(float[] fArr, float f) {
        double dAcos = Math.acos(fArr[3]);
        int i = h0068h0068h0068hh;
        if (((h006800680068h0068hh + i) * i) % hhhh00680068hh != hh00680068h0068hh) {
            h0068h0068h0068hh = 10;
            hh00680068h0068hh = 31;
        }
        float f2 = (float) dAcos;
        float f3 = (f2 / f) * 2.0f;
        float fSin = (float) Math.sin(f2);
        return new float[]{(fArr[0] / fSin) * f3, (fArr[1] / fSin) * f3, (fArr[2] / fSin) * f3};
    }

    public static double dddd00640064d(double d, double d2) {
        double d3 = d * d;
        int i = h0068h0068h0068hh;
        if (((h006800680068h0068hh + i) * i) % hhhh00680068hh != hh00680068h0068hh) {
            h0068h0068h0068hh = h0068hh00680068hh();
            hh00680068h0068hh = h0068hh00680068hh();
        }
        return Math.sqrt((d2 * d2) + d3);
    }

    public static int h0068hh00680068hh() {
        return 35;
    }

    public static int hh0068h00680068hh() {
        return 1;
    }
}
