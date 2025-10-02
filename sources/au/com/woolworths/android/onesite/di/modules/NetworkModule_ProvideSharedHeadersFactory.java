package au.com.woolworths.android.onesite.di.modules;

import android.app.Application;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.network.ShopSharedHeaders;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.tealium.core.Tealium;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class NetworkModule_ProvideSharedHeadersFactory implements Factory<SharedHeaders> {
    public static ShopSharedHeaders a(NetworkModule networkModule, Application application, ShopAccountInteractor shopAccountInteractor, AdobeAnalyticsInteractor adobeAnalyticsInteractor, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, Tealium tealium, AppEnvironment appEnvironment, ShopAppRegionInteractor shopAppRegionInteractor, FeatureToggleManager featureToggleManager) {
        networkModule.getClass();
        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
        Intrinsics.h(adobeAnalyticsInteractor, "adobeAnalyticsInteractor");
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(appEnvironment, "appEnvironment");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new ShopSharedHeaders(application, shopAccountInteractor, adobeAnalyticsInteractor, tealium, releaseSettingsInteractorImpl, shopAppRegionInteractor, featureToggleManager, appEnvironment);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
