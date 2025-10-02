package au.com.woolworths.analytics.rewards.everydayextra;

import au.com.woolworths.analytics.Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/rewards/everydayextra/EdxHomeAnalytics$LearnMore$Action$notificationImpression$1", "Lau/com/woolworths/analytics/Event;", "specs-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EdxHomeAnalytics$LearnMore$Action$notificationImpression$1 implements Event {
    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return Intrinsics.c(null, event.getD()) && Intrinsics.c(null, event.getData()) && Intrinsics.c(null, event.c());
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return null;
    }
}
