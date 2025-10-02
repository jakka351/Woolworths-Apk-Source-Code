package au.com.woolworths.foundation.shop.instore.navigation;

import au.com.woolworths.analytics.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/navigation/FeatureHighlightImpressionEvent;", "Lau/com/woolworths/analytics/Event;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FeatureHighlightImpressionEvent implements Event {
    public final LinkedHashMap d;

    public FeatureHighlightImpressionEvent(LinkedHashMap linkedHashMap) {
        this.d = linkedHashMap;
    }

    @Override // au.com.woolworths.analytics.Event
    public final String d() {
        return "productfinder_feature_impression";
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
