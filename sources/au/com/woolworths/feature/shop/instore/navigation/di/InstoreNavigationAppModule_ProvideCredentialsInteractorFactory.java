package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvideCredentialsInteractorFactory implements Factory<CredentialsInteractor> {
    public static CredentialsInteractorImpl a(InstoreNavigationAppModule instoreNavigationAppModule, AppConfig appConfig) {
        instoreNavigationAppModule.getClass();
        Intrinsics.h(appConfig, "appConfig");
        return new CredentialsInteractorImpl(appConfig.getV());
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
