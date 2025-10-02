package androidx.compose.foundation.shape;

import android.support.v4.media.session.a;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/shape/DpCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final /* data */ class DpCornerSize implements CornerSize, InspectableValue {
    public final float d;

    public DpCornerSize(float f) {
        this.d = f;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j, Density density) {
        return density.T1(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.a(this.d, ((DpCornerSize) obj).d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return a.j(this.d, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
