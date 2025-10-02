package androidx.constraintlayout.core.motion.utils;

import YU.a;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class TimeCycleSplineSet {

    /* renamed from: a, reason: collision with root package name */
    public CurveFit f2291a;
    public int b;
    public int[] c;
    public float[][] d;
    public int e;
    public String f;
    public float[] g;
    public boolean h;
    public long i;
    public float j;

    public static class CustomSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void c(int i) {
            throw null;
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void c(int i) {
            throw null;
        }
    }

    public static class Sort {
    }

    public final float a(float f) {
        float fAbs;
        switch (this.b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void b(float f, float f2, float f3, int i, int i2) {
        int[] iArr = this.c;
        int i3 = this.e;
        iArr[i3] = i;
        float[] fArr = this.d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.b = Math.max(this.b, i2);
        this.e++;
    }

    public void c(int i) {
        float[][] fArr = this.d;
        int[] iArr = this.c;
        int i2 = this.e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.e; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = iArr[i18] * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f2291a = CurveFit.a(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            StringBuilder sbT = a.t(string, "[");
            sbT.append(this.c[i]);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(this.d[i]));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }
}
