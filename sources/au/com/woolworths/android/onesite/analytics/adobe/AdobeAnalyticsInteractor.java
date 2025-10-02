package au.com.woolworths.android.onesite.analytics.adobe;

import android.app.Application;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/AdobeAnalyticsInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdobeAnalyticsInteractor implements PersistentMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfig f4066a;
    public final Application b;
    public final AdobeAnalyticsRepository c;
    public final FirebasePerfMonitor d;

    public AdobeAnalyticsInteractor(AppConfig appConfig, Application application, AdobeAnalyticsRepository repository, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(repository, "repository");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        this.f4066a = appConfig;
        this.b = application;
        this.c = repository;
        this.d = firebasePerfMonitor;
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        return TrackingMetadata.Companion.a(TrackableValue.e, this.c.a());
    }
}
