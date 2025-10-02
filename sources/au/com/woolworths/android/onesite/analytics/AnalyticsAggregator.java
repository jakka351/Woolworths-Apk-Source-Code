package au.com.woolworths.android.onesite.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/AnalyticsAggregator;", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnalyticsAggregator implements AnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4054a;
    public Map b;

    public AnalyticsAggregator(Set analyticsManagerList) {
        Intrinsics.h(analyticsManagerList, "analyticsManagerList");
        this.f4054a = analyticsManagerList;
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void a(Screen screen) {
        Intrinsics.h(screen, "screen");
        screen.l();
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).a(screen);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void b(au.com.woolworths.analytics.Screen screen, TrackingMetadata trackingMetadata) {
        this.b = screen.getData();
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).b(screen, trackingMetadata);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void c(Action action) {
        Intrinsics.h(action, "action");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).c(action);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void d(NotificationAction action) {
        Intrinsics.h(action, "action");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).d(action);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void e(Screen screen, TrackingMetadata trackingMetadata) {
        Intrinsics.h(screen, "screen");
        screen.l();
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).e(screen, trackingMetadata);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void f(au.com.woolworths.analytics.Screen screen) {
        Intrinsics.h(screen, "screen");
        this.b = screen.getData();
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).f(screen);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void g(Event action) {
        Intrinsics.h(action, "action");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).g(action);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void h(NotificationAction action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).h(action, trackingMetadata);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void i(Event action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).i(action, trackingMetadata);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.AnalyticsManager
    public final void j(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        Iterator it = this.f4054a.iterator();
        while (it.hasNext()) {
            ((AnalyticsManager) it.next()).j(action, trackingMetadata);
        }
    }
}
