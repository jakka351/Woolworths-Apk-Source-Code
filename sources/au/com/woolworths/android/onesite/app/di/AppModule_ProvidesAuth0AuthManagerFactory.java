package au.com.woolworths.android.onesite.app.di;

import android.content.Context;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.auth.api.AuthConfig;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AppModule_ProvidesAuth0AuthManagerFactory implements Factory<Auth0AuthManager> {
    public static Auth0AuthManager a(AppModule appModule, AuthConfig authConfig, AdobeAnalyticsInteractor adobeAnalyticsInteractor, Context context) {
        appModule.getClass();
        Intrinsics.h(authConfig, "authConfig");
        Intrinsics.h(adobeAnalyticsInteractor, "adobeAnalyticsInteractor");
        Intrinsics.h(context, "context");
        return new Auth0AuthManager(authConfig, adobeAnalyticsInteractor, context);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
