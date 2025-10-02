package au.com.woolworths.android.onesite.di;

import android.app.Application;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideAdobeAnalyticsInteractor$base_impl_releaseFactory implements Factory<AdobeAnalyticsInteractor> {
    public static AdobeAnalyticsInteractor a(AppConfig appConfig, Application application, AdobeAnalyticsRepository adobeAnalyticsRepository, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(adobeAnalyticsRepository, "adobeAnalyticsRepository");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        return new AdobeAnalyticsInteractor(appConfig, application, adobeAnalyticsRepository, firebasePerfMonitor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
