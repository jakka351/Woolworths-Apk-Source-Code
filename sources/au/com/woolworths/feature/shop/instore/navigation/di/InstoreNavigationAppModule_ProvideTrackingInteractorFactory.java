package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientTrackingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientTrackingInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvideTrackingInteractorFactory implements Factory<OriientTrackingInteractor> {
    public static OriientTrackingInteractorImpl a(InstoreNavigationAppModule instoreNavigationAppModule) {
        instoreNavigationAppModule.getClass();
        return new OriientTrackingInteractorImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
