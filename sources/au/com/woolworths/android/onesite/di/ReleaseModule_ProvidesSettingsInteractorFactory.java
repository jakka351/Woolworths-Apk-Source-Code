package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.repository.SettingsInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ReleaseModule_ProvidesSettingsInteractorFactory implements Factory<SettingsInteractor> {
    public static ReleaseSettingsInteractorImpl a(ReleaseModule releaseModule) {
        releaseModule.getClass();
        return new ReleaseSettingsInteractorImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
