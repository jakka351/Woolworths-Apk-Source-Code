package androidx.compose.foundation.shape;

import android.support.v4.media.session.a;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/shape/PercentCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PercentCornerSize implements CornerSize, InspectableValue {
    public final float d;

    public PercentCornerSize(float f) {
        this.d = f;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 100.0f) {
            InlineClassHelperKt.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j, Density density) {
        return (this.d / 100.0f) * Size.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.d, ((PercentCornerSize) obj).d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return a.j(this.d, "%)", new StringBuilder("CornerSize(size = "));
    }
}
