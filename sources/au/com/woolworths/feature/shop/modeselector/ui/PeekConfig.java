package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ui/PeekConfig;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class PeekConfig {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeekConfig) && Double.compare(0.0d, 0.0d) == 0 && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return YU.a.h("PeekConfig(data=null, peekItemShownRatio=0.0, itemWidth=", Dp.b(BitmapDescriptorFactory.HUE_RED), ")");
    }
}
