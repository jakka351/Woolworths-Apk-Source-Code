package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f2275a;
    public final Arc[] b;

    public static class Arc {
        public static final double[] s = new double[91];

        /* renamed from: a, reason: collision with root package name */
        public double[] f2276a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public boolean q;
        public boolean r;

        public final double a() {
            double d = this.j * this.p;
            double dHypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * dHypot : d * dHypot;
        }

        public final double b() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double dHypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return ((this.f - d3) * d2) + d3;
        }

        public final double d(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return ((this.h - d3) * d2) + d3;
        }

        public final double e() {
            return (this.j * this.o) + this.l;
        }

        public final double f() {
            return (this.k * this.p) + this.m;
        }

        public final void g(double d) {
            double d2 = (this.q ? this.d - d : d - this.c) * this.i;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f2276a;
                    double length = d2 * (dArr.length - 1);
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - i)) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.o = Math.sin(d5);
            this.p = Math.cos(d5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.core.motion.utils.ArcCurveFit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcCurveFit(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double b(double d) {
        Arc[] arcArr = this.b;
        Arc arc = arcArr[0];
        double d2 = arc.c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.r) {
                return (d3 * arcArr[0].l) + arc.c(d2);
            }
            arc.g(d2);
            return (d3 * arcArr[0].a()) + arcArr[0].e();
        }
        if (d > arcArr[arcArr.length - 1].d) {
            double d4 = arcArr[arcArr.length - 1].d;
            double d5 = d - d4;
            int length = arcArr.length - 1;
            return (d5 * arcArr[length].l) + arcArr[length].c(d4);
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc2 = arcArr[i];
            if (d <= arc2.d) {
                if (arc2.r) {
                    return arc2.c(d);
                }
                arc2.g(d);
                return arcArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void c(double d, float[] fArr) {
        Arc[] arcArr = this.b;
        Arc arc = arcArr[0];
        double d2 = arc.c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.r) {
                double dC = arc.c(d2);
                Arc arc2 = arcArr[0];
                fArr[0] = (float) ((arc2.l * d3) + dC);
                fArr[1] = (float) ((d3 * arcArr[0].m) + arc2.d(d2));
                return;
            }
            arc.g(d2);
            fArr[0] = (float) ((arcArr[0].a() * d3) + arcArr[0].e());
            fArr[1] = (float) ((d3 * arcArr[0].b()) + arcArr[0].f());
            return;
        }
        if (d <= arcArr[arcArr.length - 1].d) {
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc3 = arcArr[i];
                if (d <= arc3.d) {
                    if (arc3.r) {
                        fArr[0] = (float) arc3.c(d);
                        fArr[1] = (float) arcArr[i].d(d);
                        return;
                    } else {
                        arc3.g(d);
                        fArr[0] = (float) arcArr[i].e();
                        fArr[1] = (float) arcArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = arcArr[arcArr.length - 1].d;
        double d5 = d - d4;
        int length = arcArr.length - 1;
        Arc arc4 = arcArr[length];
        if (!arc4.r) {
            arc4.g(d);
            fArr[0] = (float) arcArr[length].e();
            fArr[1] = (float) arcArr[length].f();
        } else {
            double dC2 = arc4.c(d4);
            Arc arc5 = arcArr[length];
            fArr[0] = (float) ((arc5.l * d5) + dC2);
            fArr[1] = (float) ((d5 * arcArr[length].m) + arc5.d(d4));
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void d(double[] dArr, double d) {
        Arc[] arcArr = this.b;
        Arc arc = arcArr[0];
        double d2 = arc.c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.r) {
                double dC = arc.c(d2);
                Arc arc2 = arcArr[0];
                dArr[0] = (arc2.l * d3) + dC;
                dArr[1] = (d3 * arcArr[0].m) + arc2.d(d2);
                return;
            }
            arc.g(d2);
            dArr[0] = (arcArr[0].a() * d3) + arcArr[0].e();
            dArr[1] = (d3 * arcArr[0].b()) + arcArr[0].f();
            return;
        }
        if (d <= arcArr[arcArr.length - 1].d) {
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc3 = arcArr[i];
                if (d <= arc3.d) {
                    if (arc3.r) {
                        dArr[0] = arc3.c(d);
                        dArr[1] = arcArr[i].d(d);
                        return;
                    } else {
                        arc3.g(d);
                        dArr[0] = arcArr[i].e();
                        dArr[1] = arcArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = arcArr[arcArr.length - 1].d;
        double d5 = d - d4;
        int length = arcArr.length - 1;
        Arc arc4 = arcArr[length];
        if (arc4.r) {
            double dC2 = arc4.c(d4);
            Arc arc5 = arcArr[length];
            dArr[0] = (arc5.l * d5) + dC2;
            dArr[1] = (d5 * arcArr[length].m) + arc5.d(d4);
            return;
        }
        arc4.g(d);
        dArr[0] = (arcArr[length].a() * d5) + arcArr[length].e();
        dArr[1] = (d5 * arcArr[length].b()) + arcArr[length].f();
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double e(double d) {
        Arc[] arcArr = this.b;
        double d2 = arcArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > arcArr[arcArr.length - 1].d) {
            d = arcArr[arcArr.length - 1].d;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc = arcArr[i];
            if (d <= arc.d) {
                if (arc.r) {
                    return arc.l;
                }
                arc.g(d);
                return arcArr[i].a();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void f(double[] dArr, double d) {
        Arc[] arcArr = this.b;
        double d2 = arcArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].d) {
            d = arcArr[arcArr.length - 1].d;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc = arcArr[i];
            if (d <= arc.d) {
                if (arc.r) {
                    dArr[0] = arc.l;
                    dArr[1] = arc.m;
                    return;
                } else {
                    arc.g(d);
                    dArr[0] = arcArr[i].a();
                    dArr[1] = arcArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] g() {
        return this.f2275a;
    }
}
