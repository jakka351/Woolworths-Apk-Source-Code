package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f979a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f979a = density.getD() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* renamed from: a */
    public final float getF757a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f) {
        float[] fArr = AndroidFlingSpline.f932a;
        return (long) (Math.exp(Math.log((Math.abs(f) * 0.35f) / (WindowInsetsConnection_androidKt.f982a * this.f979a)) / WindowInsetsConnection_androidKt.c) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f, float f2) {
        return f + f(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j, float f) {
        long jB = b(f);
        return ((Float.intBitsToFloat((int) (AndroidFlingSpline.a(jB > 0 ? j / jB : 1.0f) & 4294967295L)) * f(f)) / jB) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j, float f, float f2) {
        long jB = b(f2);
        return (Float.intBitsToFloat((int) (AndroidFlingSpline.a(jB > 0 ? j / jB : 1.0f) >> 32)) * f(f2)) + f;
    }

    public final float f(float f) {
        float[] fArr = AndroidFlingSpline.f932a;
        float f2 = WindowInsetsConnection_androidKt.f982a;
        float f3 = this.f979a;
        return Math.signum(f) * ((float) (Math.exp((WindowInsetsConnection_androidKt.b / WindowInsetsConnection_androidKt.c) * Math.log((Math.abs(f) * 0.35f) / (f2 * f3))) * f2 * f3));
    }
}
