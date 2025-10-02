package androidx.constraintlayout.compose.carousel;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* renamed from: a, reason: collision with root package name */
    public final float f2257a;

    public FixedThreshold(float f) {
        this.f2257a = f;
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        return (Math.signum(f2 - f) * density.T1(this.f2257a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.a(this.f2257a, ((FixedThreshold) obj).f2257a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2257a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.b(this.f2257a)) + ')';
    }
}
