package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.app.ShopAppConfigManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AppConfigModule_ProvideAppConfigFactory implements Factory<AppConfig> {
    public static ShopAppConfigManager a(AppConfigModule appConfigModule, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, ShopAppRegionInteractor shopRegionInteractor, FeatureToggleManager featureToggleManager) {
        appConfigModule.getClass();
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new ShopAppConfigManager(releaseSettingsInteractorImpl, shopRegionInteractor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
