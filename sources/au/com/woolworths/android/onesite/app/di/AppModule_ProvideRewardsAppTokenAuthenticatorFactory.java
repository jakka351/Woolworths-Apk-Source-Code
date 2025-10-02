package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideRewardsAppTokenAuthenticatorFactory implements Factory<RewardsAppTokenAuthenticator> {
    public static RewardsAppTokenAuthenticator a(AppModule appModule, Lazy okHttpClientLazy, Lazy rewardsAccountInteractorLazy, AppConfig appConfig, FirebasePerfMonitor firebasePerfMonitor, Gson gson, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, Auth0AuthManager auth0AuthManager, NetworkExceptions networkExceptions) {
        appModule.getClass();
        Intrinsics.h(okHttpClientLazy, "okHttpClientLazy");
        Intrinsics.h(rewardsAccountInteractorLazy, "rewardsAccountInteractorLazy");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(auth0AuthManager, "auth0AuthManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        return new RewardsAppTokenAuthenticator(okHttpClientLazy, rewardsAccountInteractorLazy, appConfig, gson, firebasePerfMonitor, dispatcherProvider, featureToggleManager, auth0AuthManager, networkExceptions);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        throw null;
    }
}
