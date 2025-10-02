package androidx.constraintlayout.core.motion.utils;

import YU.a;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class SplineSet {

    /* renamed from: a, reason: collision with root package name */
    public CurveFit f2287a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public static class CoreSpline extends SplineSet {
        public String f;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(androidx.constraintlayout.core.motion.MotionWidget r4, float r5) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.SplineSet.CoreSpline.d(androidx.constraintlayout.core.motion.MotionWidget, float):void");
        }
    }

    public static class CustomSet extends SplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void c(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void e(int i) {
            throw null;
        }
    }

    public static class CustomSpline extends SplineSet {
        public KeyFrameArray.CustomVar f;
        public float[] g;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void c(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void d(MotionWidget motionWidget, float f) {
            this.f2287a.c(f, this.g);
            KeyFrameArray.CustomVar customVar = this.f;
            customVar.b[customVar.f2283a[0]].f(motionWidget, this.g);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void e(int i) {
            KeyFrameArray.CustomVar customVar = this.f;
            int i2 = customVar.c;
            CustomVariable[] customVariableArr = customVar.b;
            int[] iArr = customVar.f2283a;
            int iE = customVariableArr[iArr[0]].e();
            double[] dArr = new double[i2];
            this.g = new float[iE];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, iE);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = iArr[i3];
                CustomVariable customVariable = customVariableArr[i4];
                dArr[i3] = i4 * 0.01d;
                customVariable.d(this.g);
                int i5 = 0;
                while (true) {
                    if (i5 < this.g.length) {
                        dArr2[i3][i5] = r8[i5];
                        i5++;
                    }
                }
            }
            this.f2287a = CurveFit.a(i, dArr, dArr2);
        }
    }

    public static class Sort {
    }

    public static SplineSet b(String str) {
        CoreSpline coreSpline = new CoreSpline();
        coreSpline.f = str;
        return coreSpline;
    }

    public final float a(float f) {
        return (float) this.f2287a.b(f);
    }

    public void c(float f, int i) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f;
        this.d = i2 + 1;
    }

    public void d(MotionWidget motionWidget, float f) {
        motionWidget.c(a(f), TypedValues.AttributesType.a(this.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(int r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.SplineSet.e(int):void");
    }

    public final String toString() {
        String string = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            StringBuilder sbT = a.t(string, "[");
            sbT.append(this.b[i]);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(this.c[i]));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }
}
