package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/FractionalThreshold;", "Landroidx/compose/material/ThresholdConfig;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
public final /* data */ class FractionalThreshold implements ThresholdConfig {
    @Override // androidx.compose.material.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        return MathHelpersKt.b(f, f2, 0.5f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(0.5f, 0.5f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.5f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.5)";
    }
}
