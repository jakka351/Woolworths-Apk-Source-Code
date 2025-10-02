package androidx.compose.ui.unit;

import android.support.v4.media.session.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DensityImpl implements Density {
    public final float d;
    public final float e;

    public DensityImpl(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1, reason: from getter */
    public final float getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.d, densityImpl.d) == 0 && Float.compare(this.e, densityImpl.e) == 0;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity, reason: from getter */
    public final float getD() {
        return this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.d);
        sb.append(", fontScale=");
        return a.r(sb, this.e, ')');
    }
}
