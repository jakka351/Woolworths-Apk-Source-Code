package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class LinearCurveFit extends CurveFit {

    /* renamed from: a, reason: collision with root package name */
    public double[] f2284a;
    public double[][] b;
    public double[] c;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double b(double d) {
        double d2;
        double d3;
        double dE;
        double[][] dArr = this.b;
        double[] dArr2 = this.f2284a;
        int length = dArr2.length;
        double d4 = dArr2[0];
        if (d <= d4) {
            d2 = dArr[0][0];
            d3 = d - d4;
            dE = e(d4);
        } else {
            int i = length - 1;
            double d5 = dArr2[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr2[i2];
                    if (d == d6) {
                        return dArr[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr2[i3];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr[i3][0] * d8) + ((1.0d - d8) * dArr[i2][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr[i][0];
            d3 = d - d5;
            dE = e(d5);
        }
        return (dE * d3) + d2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void c(double d, float[] fArr) {
        double[] dArr = this.c;
        double[] dArr2 = this.f2284a;
        int length = dArr2.length;
        double[][] dArr3 = this.b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            f(dArr, d2);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            f(dArr, d3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void d(double[] dArr, double d) {
        double[] dArr2 = this.c;
        double[] dArr3 = this.f2284a;
        int length = dArr3.length;
        double[][] dArr4 = this.b;
        int i = 0;
        int length2 = dArr4[0].length;
        double d2 = dArr3[0];
        if (d <= d2) {
            f(dArr2, d2);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr3[i3];
        if (d >= d3) {
            f(dArr2, d3);
            while (i < length2) {
                dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr3[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr4[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
  0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double e(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f2284a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.b
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r9 = r9[r2]
            double r9 = r9 - r0
            double r9 = r9 / r5
            return r9
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.e(double):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r5
  0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(double[] r11, double r12) {
        /*
            r10 = this;
            double[] r0 = r10.f2284a
            int r1 = r0.length
            double[][] r2 = r10.b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r12 = r12[r3]
            r0 = r2[r6]
            r0 = r0[r3]
            double r0 = r0 - r12
            double r0 = r0 / r7
            r11[r3] = r0
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.f(double[], double):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] g() {
        return this.f2284a;
    }
}
