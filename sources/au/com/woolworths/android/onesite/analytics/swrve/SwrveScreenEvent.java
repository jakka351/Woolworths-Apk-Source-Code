package au.com.woolworths.android.onesite.analytics.swrve;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/swrve/SwrveScreenEvent;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEvent;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwrveScreenEvent implements SwrveEvent {
    public final String d;

    public SwrveScreenEvent(String event) {
        Intrinsics.h(event, "event");
        this.d = event;
    }

    @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
