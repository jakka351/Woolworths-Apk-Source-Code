package au.com.woolworths.base.rewards.account.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RewardsAccountAppModule_ProvideGsonFactory implements Factory<Gson> {
    private final RewardsAccountAppModule module;

    public static Gson provideGson(RewardsAccountAppModule rewardsAccountAppModule) {
        Gson gsonProvideGson = rewardsAccountAppModule.provideGson();
        Preconditions.d(gsonProvideGson);
        return gsonProvideGson;
    }

    @Override // javax.inject.Provider
    public Gson get() {
        return provideGson(this.module);
    }
}
