package androidx.compose.ui.unit;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class DpRect {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpRect$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpRect) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + a.b(BitmapDescriptorFactory.HUE_RED, a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31), 31);
    }

    public final String toString() {
        return "DpRect(left=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", top=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", right=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ", bottom=" + ((Object) Dp.b(BitmapDescriptorFactory.HUE_RED)) + ')';
    }
}
