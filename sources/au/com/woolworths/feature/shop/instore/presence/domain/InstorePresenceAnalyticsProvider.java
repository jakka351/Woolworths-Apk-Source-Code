package au.com.woolworths.feature.shop.instore.presence.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.foundation.shared.instore.wifi.WiFiStoreDetailsAnalyticsProvider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/presence/domain/InstorePresenceAnalyticsProvider;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstorePresenceAnalyticsProvider implements PersistentMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final WiFiStoreDetailsAnalyticsProvider f7441a;
    public String b;

    public InstorePresenceAnalyticsProvider(WiFiStoreDetailsAnalyticsProvider wifiAnalyticsProvider) {
        Intrinsics.h(wifiAnalyticsProvider, "wifiAnalyticsProvider");
        this.f7441a = wifiAnalyticsProvider;
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        String str = this.f7441a.f8657a;
        String str2 = this.b;
        return TrackingMetadata.Companion.a(TrackableValue.D0, (str == null || !InstorePresenceAnalyticsProviderKt.b(str)) ? str2 != null ? InstorePresenceAnalyticsProviderKt.a(str2) : str != null ? InstorePresenceAnalyticsProviderKt.c(str) : "" : InstorePresenceAnalyticsProviderKt.c(str));
    }
}
