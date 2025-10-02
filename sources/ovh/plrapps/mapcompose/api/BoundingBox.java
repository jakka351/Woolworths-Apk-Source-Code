package ovh.plrapps.mapcompose.api;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/api/BoundingBox;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BoundingBox {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BoundingBox) && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + a.a(0.0d, a.a(0.0d, Double.hashCode(0.0d) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(0.0d, "BoundingBox(xLeft=", ", yTop=");
        sbN.append(0.0d);
        au.com.woolworths.android.onesite.a.z(sbN, ", xRight=", 0.0d, ", yBottom=");
        sbN.append(0.0d);
        sbN.append(")");
        return sbN.toString();
    }
}
