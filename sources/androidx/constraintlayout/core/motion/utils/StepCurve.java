package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class StepCurve extends Easing {
    public MonotonicCurveFit d;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double a(double d) {
        return this.d.b(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double b(double d) {
        return this.d.e(d);
    }
}
