package au.com.woolworths.feature.rewards.account.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsPreferencesAppModule_ProvideGsonFactory implements Factory<Gson> {
    public static Gson a(RewardsPreferencesAppModule rewardsPreferencesAppModule) {
        rewardsPreferencesAppModule.getClass();
        return new GsonBuilder().a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
