package au.com.woolworths.foundation.rewards.common.ui.dountchart;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/dountchart/ChartAngleData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class ChartAngleData {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChartAngleData) && Color.c(0L, 0L) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        int i = Color.l;
        return Boolean.hashCode(false) + a.b(BitmapDescriptorFactory.HUE_RED, Long.hashCode(0L) * 31, 31);
    }

    public final String toString() {
        String strI = Color.i(0L);
        StringBuilder sb = new StringBuilder("ChartAngleData(color=");
        sb.append(strI);
        sb.append(", angle=");
        sb.append(BitmapDescriptorFactory.HUE_RED);
        sb.append(", isNeedRoundCorner=");
        return YU.a.k(")", sb, false);
    }
}
