package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Oscillator {

    /* renamed from: a, reason: collision with root package name */
    public float[] f2286a;
    public double[] b;
    public double[] c;
    public MonotonicCurveFit d;
    public int e;

    public final void a(double d, float f) {
        int length = this.f2286a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.f2286a = Arrays.copyOf(this.f2286a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.b[iBinarySearch] = d;
        this.f2286a[iBinarySearch] = f;
    }

    public final double b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f2286a;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.b;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (f2 - (d5 * d4))) + this.c[i];
    }

    public final double c(double d, double d2) {
        double dAbs;
        double dB = b(d) + d2;
        switch (this.e) {
            case 1:
                return Math.signum(0.5d - (dB % 1.0d));
            case 2:
                dAbs = Math.abs((((dB * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dB * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dB * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d2 + dB) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dB * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.d.b(dB % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dB);
        }
        return 1.0d - dAbs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.f2286a);
    }
}
