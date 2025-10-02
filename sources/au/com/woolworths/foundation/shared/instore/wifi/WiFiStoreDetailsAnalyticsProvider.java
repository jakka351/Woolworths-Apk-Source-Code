package au.com.woolworths.foundation.shared.instore.wifi;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shared/instore/wifi/WiFiStoreDetailsAnalyticsProvider;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WiFiStoreDetailsAnalyticsProvider implements PersistentMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public String f8657a;

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        TrackableValue trackableValue = TrackableValue.E0;
        String str = this.f8657a;
        if (str == null) {
            str = "";
        }
        return TrackingMetadata.Companion.a(trackableValue, str);
    }
}
