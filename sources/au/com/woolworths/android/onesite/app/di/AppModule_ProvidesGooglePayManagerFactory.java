package au.com.woolworths.android.onesite.app.di;

import android.content.Context;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import au.com.woolworths.foundation.google.pay.GooglePayManagerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesGooglePayManagerFactory implements Factory<GooglePayManager> {
    public static GooglePayManagerImpl a(AppModule appModule, Context context, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        appModule.getClass();
        Intrinsics.h(context, "context");
        AppEnvironment.Production production = AppEnvironment.Production.INSTANCE;
        return new GooglePayManagerImpl(context, Intrinsics.c(production, production));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
