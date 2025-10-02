package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/RelativePosition;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RelativePosition {

    /* renamed from: a, reason: collision with root package name */
    public final double f7412a;
    public final double b;

    public RelativePosition(double d, double d2) {
        this.f7412a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativePosition)) {
            return false;
        }
        RelativePosition relativePosition = (RelativePosition) obj;
        return Double.compare(this.f7412a, relativePosition.f7412a) == 0 && Double.compare(this.b, relativePosition.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f7412a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f7412a, "RelativePosition(x=", ", y=");
        sbN.append(this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
