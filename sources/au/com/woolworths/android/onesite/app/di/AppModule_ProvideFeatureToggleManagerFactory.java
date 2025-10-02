package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManagerImpl;
import au.com.woolworths.android.onesite.featuretoggles.NewZealandFeatureToggleInterceptor;
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
public final class AppModule_ProvideFeatureToggleManagerFactory implements Factory<FeatureToggleManager> {
    public static NewZealandFeatureToggleInterceptor a(AppModule appModule, FeatureToggleManagerImpl baseFeatureToggleManager, ShopAppRegionInteractor shopRegionInteractor) {
        appModule.getClass();
        Intrinsics.h(baseFeatureToggleManager, "baseFeatureToggleManager");
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        return new NewZealandFeatureToggleInterceptor(baseFeatureToggleManager, shopRegionInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
