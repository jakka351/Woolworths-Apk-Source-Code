package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AnalyticsDeferredProxy {

    /* renamed from: a, reason: collision with root package name */
    public final Deferred f15247a;
    public volatile AnalyticsEventLogger b;
    public volatile BreadcrumbSource c;
    public final ArrayList d;

    public AnalyticsDeferredProxy(Deferred deferred) {
        DisabledBreadcrumbSource disabledBreadcrumbSource = new DisabledBreadcrumbSource();
        UnavailableAnalyticsEventLogger unavailableAnalyticsEventLogger = new UnavailableAnalyticsEventLogger();
        this.f15247a = deferred;
        this.c = disabledBreadcrumbSource;
        this.d = new ArrayList();
        this.b = unavailableAnalyticsEventLogger;
        deferred.a(new a(this));
    }
}
