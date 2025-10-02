package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/shape/CornerSizeKt$ZeroCornerSize$1", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j, Density density) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final String toString() {
        return "ZeroCornerSize";
    }
}
