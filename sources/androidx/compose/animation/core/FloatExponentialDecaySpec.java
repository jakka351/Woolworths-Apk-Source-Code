package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final float f757a = Math.max(1.0E-7f, Math.abs(0.1f));
    public final float b;

    public FloatExponentialDecaySpec(float f) {
        this.b = Math.max(1.0E-4f, f) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* renamed from: a, reason: from getter */
    public final float getF757a() {
        return this.f757a;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long b(float f) {
        return ((long) ((((float) Math.log(this.f757a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(float f, float f2) {
        if (Math.abs(f2) <= this.f757a) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((dLog / f3) * 1000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float e(long j, float f, float f2) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }
}
