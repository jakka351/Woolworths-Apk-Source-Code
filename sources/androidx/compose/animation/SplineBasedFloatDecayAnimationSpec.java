package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final FlingCalculator f736a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f736a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.f737a, density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* renamed from: a */
    public final float getF757a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f) {
        FlingCalculator flingCalculator = this.f736a;
        flingCalculator.getClass();
        float[] fArr = AndroidFlingSpline.f707a;
        return ((long) (Math.exp(AndroidFlingSpline.a(f, flingCalculator.f725a * flingCalculator.c) / (FlingCalculatorKt.f727a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f, float f2) {
        FlingCalculator flingCalculator = this.f736a;
        flingCalculator.getClass();
        float[] fArr = AndroidFlingSpline.f707a;
        double dA = AndroidFlingSpline.a(f2, flingCalculator.f725a * flingCalculator.c);
        double d = FlingCalculatorKt.f727a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dA) * r1 * r0))) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j, float f) {
        return this.f736a.a(f).b(j / 1000000);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j, float f, float f2) {
        return this.f736a.a(f2).a(j / 1000000) + f;
    }
}
