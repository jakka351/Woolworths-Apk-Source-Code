package au.com.woolworths.foundation.shop.olive.voice.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepository;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class OliveVoiceModule_ProvidesOliveVoiceRepositoryFactory implements Factory<OliveVoiceRepository> {
    public static OliveVoiceRepositoryImpl a(OliveVoiceModule oliveVoiceModule, ApolloClient apolloClient, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new OliveVoiceRepositoryImpl(sharedPreferences, featureToggleManager, apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
