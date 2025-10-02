package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class FloatingActionButtonElevation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        if (Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)) {
            return Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31);
    }
}
