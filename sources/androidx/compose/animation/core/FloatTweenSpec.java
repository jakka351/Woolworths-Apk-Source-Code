package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {

    /* renamed from: a, reason: collision with root package name */
    public final int f759a;
    public final Easing b;
    public final long c;
    public final long d;

    public FloatTweenSpec(int i, int i2, Easing easing) {
        this.f759a = i;
        this.b = easing;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float d(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fA = this.b.a(this.f759a == 0 ? 1.0f : j2 / j3);
        return (f2 * fA) + ((1 - fA) * f);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float e(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (d(f, f2, f3, j4) - d(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }
}
