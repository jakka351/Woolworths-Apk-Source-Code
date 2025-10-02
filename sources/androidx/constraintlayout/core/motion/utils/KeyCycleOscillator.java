package androidx.constraintlayout.core.motion.utils;

import YU.a;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class KeyCycleOscillator {

    /* renamed from: a, reason: collision with root package name */
    public CycleOscillator f2280a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<WavePoint> {
        @Override // java.util.Comparator
        public final int compare(WavePoint wavePoint, WavePoint wavePoint2) {
            return Integer.compare(wavePoint.f2282a, wavePoint2.f2282a);
        }
    }

    public static class CoreSpline extends KeyCycleOscillator {
        public int g;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void g(MotionWidget motionWidget, float f) {
            motionWidget.c(a(f), this.g);
        }
    }

    public static class CycleOscillator {

        /* renamed from: a, reason: collision with root package name */
        public Oscillator f2281a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public CurveFit g;
        public double[] h;
        public double[] i;
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        public int g;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void g(MotionWidget motionWidget, float f) {
            motionWidget.c(a(f), this.g);
        }
    }

    public static class WavePoint {

        /* renamed from: a, reason: collision with root package name */
        public final int f2282a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public WavePoint(float f, float f2, float f3, float f4, int i) {
            this.f2282a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public static KeyCycleOscillator c(String str) {
        if (str.equals("pathRotate")) {
            PathRotateSet pathRotateSet = new PathRotateSet();
            pathRotateSet.g = TypedValues.CycleType.a(str);
            return pathRotateSet;
        }
        CoreSpline coreSpline = new CoreSpline();
        coreSpline.g = TypedValues.CycleType.a(str);
        return coreSpline;
    }

    public final float a(float f) {
        CycleOscillator cycleOscillator = this.f2280a;
        CurveFit curveFit = cycleOscillator.g;
        if (curveFit != null) {
            curveFit.d(cycleOscillator.h, f);
        } else {
            double[] dArr = cycleOscillator.h;
            dArr[0] = cycleOscillator.e[0];
            dArr[1] = cycleOscillator.f[0];
            dArr[2] = cycleOscillator.b[0];
        }
        double[] dArr2 = cycleOscillator.h;
        return (float) ((cycleOscillator.f2281a.c(f, dArr2[1]) * cycleOscillator.h[2]) + dArr2[0]);
    }

    public final float b(float f) {
        char c;
        char c2;
        double dE;
        double d;
        double dSignum;
        double dSin;
        CycleOscillator cycleOscillator = this.f2280a;
        Oscillator oscillator = cycleOscillator.f2281a;
        CurveFit curveFit = cycleOscillator.g;
        double d2 = 0.0d;
        if (curveFit != null) {
            double d3 = f;
            curveFit.f(cycleOscillator.i, d3);
            cycleOscillator.g.d(cycleOscillator.h, d3);
        } else {
            double[] dArr = cycleOscillator.i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double dC = oscillator.c(d4, cycleOscillator.h[1]);
        double d5 = cycleOscillator.h[1];
        double d6 = cycleOscillator.i[1];
        double dB = oscillator.b(d4) + d5;
        if (d4 <= 0.0d) {
            c = 2;
            c2 = 0;
        } else if (d4 >= 1.0d) {
            c = 2;
            c2 = 0;
            d2 = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch(oscillator.b, d4);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = oscillator.f2286a;
            float f2 = fArr[iBinarySearch];
            int i = iBinarySearch - 1;
            float f3 = fArr[i];
            c = 2;
            c2 = 0;
            double d7 = f2 - f3;
            double[] dArr2 = oscillator.b;
            double d8 = dArr2[iBinarySearch];
            double d9 = dArr2[i];
            double d10 = d7 / (d8 - d9);
            d2 = (f3 - (d10 * d9)) + (d4 * d10);
        }
        double d11 = d2 + d6;
        double d12 = 2.0d;
        switch (oscillator.e) {
            case 1:
                dE = 0.0d;
                break;
            case 2:
                d = d11 * 4.0d;
                dSignum = Math.signum((((dB * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dE = d * dSignum;
                break;
            case 3:
                dE = d11 * 2.0d;
                break;
            case 4:
                dSin = -d11;
                dE = dSin * d12;
                break;
            case 5:
                d12 = (-6.283185307179586d) * d11;
                dSin = Math.sin(6.283185307179586d * dB);
                dE = dSin * d12;
                break;
            case 6:
                dE = d11 * 4.0d * ((((dB * 4.0d) + 2.0d) % 4.0d) - 2.0d);
                break;
            case 7:
                dE = oscillator.d.e(dB % 1.0d);
                break;
            default:
                d = d11 * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dB);
                dE = d * dSignum;
                break;
        }
        double[] dArr3 = cycleOscillator.i;
        return (float) ((dE * cycleOscillator.h[c]) + (dC * dArr3[c]) + dArr3[c2]);
    }

    public void d(Object obj) {
    }

    public final void e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f.add(new WavePoint(f, f2, f3, f4, i));
        if (i3 != -1) {
            this.e = i3;
        }
        this.c = i2;
        this.d = str;
    }

    public final void f(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f.add(new WavePoint(f, f2, f3, f4, i));
        if (i3 != -1) {
            this.e = i3;
        }
        this.c = i2;
        d(obj);
        this.d = str;
    }

    public void g(MotionWidget motionWidget, float f) {
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new AnonymousClass1());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.c;
        String str = this.d;
        CycleOscillator cycleOscillator = new CycleOscillator();
        Oscillator oscillator = new Oscillator();
        oscillator.f2286a = new float[0];
        oscillator.b = new double[0];
        cycleOscillator.f2281a = oscillator;
        oscillator.e = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int iIndexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i7 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = i8 * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            oscillator.d = new MonotonicCurveFit(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        cycleOscillator.b = new float[size];
        cycleOscillator.c = new double[size];
        cycleOscillator.d = new float[size];
        cycleOscillator.e = new float[size];
        cycleOscillator.f = new float[size];
        float[] fArr = new float[size];
        this.f2280a = cycleOscillator;
        Iterator it = arrayList.iterator();
        int i12 = i4;
        while (it.hasNext()) {
            WavePoint wavePoint = (WavePoint) it.next();
            float f = wavePoint.d;
            dArr[i12] = f * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = wavePoint.b;
            dArr6[i4] = f2;
            float f3 = wavePoint.c;
            dArr6[i2] = f3;
            float f4 = wavePoint.e;
            dArr6[i] = f4;
            CycleOscillator cycleOscillator2 = this.f2280a;
            cycleOscillator2.c[i12] = wavePoint.f2282a / 100.0d;
            cycleOscillator2.d[i12] = f;
            cycleOscillator2.e[i12] = f3;
            cycleOscillator2.f[i12] = f4;
            cycleOscillator2.b[i12] = f2;
            i12++;
        }
        CycleOscillator cycleOscillator3 = this.f2280a;
        float[] fArr2 = cycleOscillator3.d;
        Oscillator oscillator2 = cycleOscillator3.f2281a;
        double[] dArr7 = cycleOscillator3.c;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = cycleOscillator3.b;
        cycleOscillator3.h = new double[fArr3.length + i13];
        cycleOscillator3.i = new double[fArr3.length + i13];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            oscillator2.a(0.0d, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            oscillator2.a(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr9 = dArr8[i14];
            dArr9[i4] = cycleOscillator3.e[i14];
            dArr9[i2] = cycleOscillator3.f[i14];
            dArr9[2] = fArr3[i14];
            oscillator2.a(dArr7[i14], fArr2[i14]);
        }
        double d7 = 0.0d;
        int i15 = i4;
        while (true) {
            if (i15 >= oscillator2.f2286a.length) {
                break;
            }
            d7 += r10[i15];
            i15++;
        }
        double d8 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr4 = oscillator2.f2286a;
            if (i16 >= fArr4.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr4[i17] + fArr4[i16]) / 2.0f;
            double d9 = d6;
            double[] dArr10 = oscillator2.b;
            d8 = ((dArr10[i16] - dArr10[i17]) * f5) + d8;
            i16++;
            d6 = d9;
        }
        double d10 = d6;
        int i18 = i4;
        while (true) {
            float[] fArr5 = oscillator2.f2286a;
            if (i18 >= fArr5.length) {
                break;
            }
            fArr5[i18] = fArr5[i18] * ((float) (d7 / d8));
            i18++;
        }
        oscillator2.c[i4] = d10;
        int i19 = i2;
        while (true) {
            float[] fArr6 = oscillator2.f2286a;
            if (i19 >= fArr6.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr6[i20] + fArr6[i19]) / 2.0f;
            double[] dArr11 = oscillator2.b;
            double d11 = dArr11[i19] - dArr11[i20];
            double[] dArr12 = oscillator2.c;
            dArr12[i19] = (d11 * f6) + dArr12[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            cycleOscillator3.g = CurveFit.a(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            cycleOscillator3.g = null;
        }
        CurveFit.a(i5, dArr, dArr2);
    }

    public final String toString() {
        String string = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            WavePoint wavePoint = (WavePoint) it.next();
            StringBuilder sbT = a.t(string, "[");
            sbT.append(wavePoint.f2282a);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(wavePoint.b));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }
}
