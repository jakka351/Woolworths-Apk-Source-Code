package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdLoadingTimeoutConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvidesGoogleAdLoadingTimeoutConfigFactory implements Factory<GoogleAdLoadingTimeoutConfig> {
    public static GoogleAdLoadingTimeoutConfig a(AppModule appModule, FeatureToggleManager featureToggleManager) {
        GoogleAdLoadingTimeoutConfig googleAdLoadingTimeoutConfig;
        appModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        try {
            Json.Default r2 = Json.d;
            String strE = featureToggleManager.e(ShopRemoteConfig.n, false);
            r2.getClass();
            googleAdLoadingTimeoutConfig = (GoogleAdLoadingTimeoutConfig) r2.b(GoogleAdLoadingTimeoutConfig.INSTANCE.serializer(), strE);
        } catch (SerializationException unused) {
            googleAdLoadingTimeoutConfig = new GoogleAdLoadingTimeoutConfig();
        }
        Preconditions.d(googleAdLoadingTimeoutConfig);
        return googleAdLoadingTimeoutConfig;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
