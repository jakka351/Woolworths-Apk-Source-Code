package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.app.ShopAuthConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.auth.api.AuthConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.NoWhenBranchMatchedException;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AppConfigModule_ProvideAuthConfigFactory implements Factory<AuthConfig> {
    public static ShopAuthConfig a(AppConfigModule appConfigModule, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        appConfigModule.getClass();
        if (AppEnvironment.Production.INSTANCE != null) {
            return ShopAuthConfig.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
