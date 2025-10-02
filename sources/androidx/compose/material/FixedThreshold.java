package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* renamed from: a, reason: collision with root package name */
    public final float f1286a;

    public FixedThreshold(float f) {
        this.f1286a = f;
    }

    @Override // androidx.compose.material.ThresholdConfig
    public final float a(Density density, float f, float f2) {
        return (Math.signum(f2 - f) * density.T1(this.f1286a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.a(this.f1286a, ((FixedThreshold) obj).f1286a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1286a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.b(this.f1286a)) + ')';
    }
}
