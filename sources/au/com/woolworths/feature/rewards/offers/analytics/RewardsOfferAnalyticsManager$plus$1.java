package au.com.woolworths.feature.rewards.offers.analytics;

import au.com.woolworths.analytics.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$plus$1", "Lau/com/woolworths/analytics/Event;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferAnalyticsManager$plus$1 implements Event {
    public final String d;
    public final LinkedHashMap e;

    public RewardsOfferAnalyticsManager$plus$1(Event event, Map map) {
        this.d = event.getD();
        this.e = MapsKt.m(event.getData(), map);
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.e;
    }
}
