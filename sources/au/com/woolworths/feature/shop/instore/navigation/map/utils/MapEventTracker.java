package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/MapEventTracker;", "", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapEventTracker {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f7409a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/MapEventTracker$Companion;", "", "", "LABEL_GO_TO_SETTINGS", "Ljava/lang/String;", "LABEL_NO_THANKS", "LABEL_NOT_IN_STORE_BUILDING", "LABEL_GENERIC_NAVIGATION_ERROR", "LABEL_DEVICE_NOT_SUPPORTED", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MapEventTracker(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f7409a = analyticsManager;
    }

    public final void a(Event event, TrackingMetadata trackingMetadata) {
        AnalyticsManager analyticsManager = this.f7409a;
        if (trackingMetadata != null) {
            analyticsManager.i(event, trackingMetadata);
        } else {
            analyticsManager.g(event);
        }
    }
}
