package androidx.constraintlayout.compose.carousel;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/carousel/FractionalThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FractionalThreshold implements ThresholdConfig {
    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        return MathHelpersKt.b(f, f2, 0.3f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(0.3f, 0.3f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.3f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.3)";
    }
}
