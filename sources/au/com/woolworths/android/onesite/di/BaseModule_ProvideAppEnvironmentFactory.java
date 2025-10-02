package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideAppEnvironmentFactory implements Factory<AppEnvironment> {
    public static AppEnvironment a(ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
        Preconditions.d(production);
        return production;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
