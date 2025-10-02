package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "Landroidx/compose/foundation/interaction/Interaction;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectableChipElevation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        return Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31), 31);
    }
}
