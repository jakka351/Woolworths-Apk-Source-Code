package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.app.ScanAndGoFirebaseConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.appdata.FirebaseConfigBuilder;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.NoWhenBranchMatchedException;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppConfigModule_ProvideSnGFirebaseConfigFactory implements Factory<FirebaseConfigBuilder> {
    public static FirebaseConfigBuilder a(AppConfigModule appConfigModule, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        appConfigModule.getClass();
        if (AppEnvironment.Production.INSTANCE != null) {
            return ScanAndGoFirebaseConfig.i.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
