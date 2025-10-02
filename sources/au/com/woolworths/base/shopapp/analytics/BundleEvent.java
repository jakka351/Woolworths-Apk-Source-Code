package au.com.woolworths.base.shopapp.analytics;

import au.com.woolworths.analytics.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/analytics/BundleEvent;", "Lau/com/woolworths/analytics/Event;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleEvent implements Event {
    public final LinkedHashMap d;

    public BundleEvent(LinkedHashMap linkedHashMap) {
        this.d = linkedHashMap;
    }

    @Override // au.com.woolworths.analytics.Event
    public final String d() {
        return "combined_events_impression";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BundleEvent) && this.d.equals(((BundleEvent) obj).d);
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + 1211038827;
    }

    public final String toString() {
        return "BundleEvent(tealiumKey=combined_events_impression, data=" + this.d + ")";
    }
}
