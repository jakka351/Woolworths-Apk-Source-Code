package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.feature.app.AppIdentifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideAppIdentifierFactory implements Factory<AppIdentifier> {
    public static void a(AppModule appModule) {
        appModule.getClass();
        AppIdentifier appIdentifier = AppIdentifier.d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
