package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public abstract class CurveFit {

    public static class Constant extends CurveFit {

        /* renamed from: a, reason: collision with root package name */
        public double f2277a;
        public double[] b;

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double b(double d) {
            return this.b[0];
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void c(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void d(double[] dArr, double d) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double e(double d) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final void f(double[] dArr, double d) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public final double[] g() {
            return new double[]{this.f2277a};
        }
    }

    public static CurveFit a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new MonotonicCurveFit(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            Constant constant = new Constant();
            constant.f2277a = d;
            constant.b = dArr3;
            return constant;
        }
        LinearCurveFit linearCurveFit = new LinearCurveFit();
        int length = dArr2[0].length;
        linearCurveFit.c = new double[length];
        linearCurveFit.f2284a = dArr;
        linearCurveFit.b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return linearCurveFit;
    }

    public abstract double b(double d);

    public abstract void c(double d, float[] fArr);

    public abstract void d(double[] dArr, double d);

    public abstract double e(double d);

    public abstract void f(double[] dArr, double d);

    public abstract double[] g();
}
