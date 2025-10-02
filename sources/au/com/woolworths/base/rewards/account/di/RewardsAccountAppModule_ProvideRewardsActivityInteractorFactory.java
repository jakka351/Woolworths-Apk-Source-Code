package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAccountAppModule_ProvideRewardsActivityInteractorFactory implements Factory<RewardsActivityInteractor> {
    private final RewardsAccountAppModule module;

    public static RewardsActivityInteractor provideRewardsActivityInteractor(RewardsAccountAppModule rewardsAccountAppModule) {
        RewardsActivityInteractor rewardsActivityInteractorProvideRewardsActivityInteractor = rewardsAccountAppModule.provideRewardsActivityInteractor();
        Preconditions.d(rewardsActivityInteractorProvideRewardsActivityInteractor);
        return rewardsActivityInteractorProvideRewardsActivityInteractor;
    }

    @Override // javax.inject.Provider
    public RewardsActivityInteractor get() {
        return provideRewardsActivityInteractor(this.module);
    }
}
