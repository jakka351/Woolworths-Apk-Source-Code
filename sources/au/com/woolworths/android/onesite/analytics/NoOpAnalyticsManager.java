package au.com.woolworths.android.onesite.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/NoOpAnalyticsManager;", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpAnalyticsManager implements AnalyticsManager {
    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void a(Screen screen) {
        Intrinsics.h(screen, "screen");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void c(Action action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void d(NotificationAction action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void e(Screen screen, TrackingMetadata trackingMetadata) {
        Intrinsics.h(screen, "screen");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void f(au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(screen, "screen");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void g(Event action) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void h(NotificationAction action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void i(Event action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void j(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
    }
}
