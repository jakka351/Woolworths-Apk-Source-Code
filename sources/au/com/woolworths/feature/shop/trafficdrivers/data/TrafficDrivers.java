package au.com.woolworths.feature.shop.trafficdrivers.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/trafficdrivers/data/TrafficDrivers;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrafficDrivers {

    /* renamed from: a, reason: collision with root package name */
    public final int f8213a;
    public final int b;
    public final ArrayList c;
    public final AnalyticsData d;

    public TrafficDrivers(int i, int i2, ArrayList arrayList, AnalyticsData analyticsData) {
        this.f8213a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficDrivers)) {
            return false;
        }
        TrafficDrivers trafficDrivers = (TrafficDrivers) obj;
        return this.f8213a == trafficDrivers.f8213a && this.b == trafficDrivers.b && this.c.equals(trafficDrivers.c) && Intrinsics.c(this.d, trafficDrivers.d);
    }

    public final int hashCode() {
        int iB = a.b(b.a(this.b, Integer.hashCode(this.f8213a) * 31, 31), 31, this.c);
        AnalyticsData analyticsData = this.d;
        return iB + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = YU.a.q(this.f8213a, this.b, "TrafficDrivers(numberOfItemsToDisplay=", ", startingIndex=", ", items=");
        sbQ.append(this.c);
        sbQ.append(", analytics=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
