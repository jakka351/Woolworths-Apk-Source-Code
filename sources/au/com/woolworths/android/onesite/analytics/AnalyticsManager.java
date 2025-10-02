package au.com.woolworths.android.onesite.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AnalyticsManager {
    void a(Screen screen);

    void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata);

    void c(Action action);

    void d(NotificationAction notificationAction);

    void e(Screen screen, TrackingMetadata trackingMetadata);

    void f(au.com.woolworths.analytics.Screen screen);

    void g(Event event);

    void h(NotificationAction notificationAction, TrackingMetadata trackingMetadata);

    void i(Event event, TrackingMetadata trackingMetadata);

    void j(Action action, TrackingMetadata trackingMetadata);
}
