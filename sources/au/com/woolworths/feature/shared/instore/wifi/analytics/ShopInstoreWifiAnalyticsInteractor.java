package au.com.woolworths.feature.shared.instore.wifi.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/ShopInstoreWifiAnalyticsInteractor;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAnalyticsInteractor;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShopInstoreWifiAnalyticsInteractor implements InstoreWifiAnalyticsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f6517a;

    public ShopInstoreWifiAnalyticsInteractor(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f6517a = analyticsManager;
    }
}
