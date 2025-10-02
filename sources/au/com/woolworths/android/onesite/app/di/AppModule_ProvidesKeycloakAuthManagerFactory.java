package au.com.woolworths.android.onesite.app.di;

import android.app.Application;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AppModule_ProvidesKeycloakAuthManagerFactory implements Factory<KeycloakAuthManager> {
    public static KeycloakAuthManager a(AppModule appModule, Application application, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, FeatureToggleManager featureToggleManager) {
        appModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new KeycloakAuthManager(application, releaseSettingsInteractorImpl, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
