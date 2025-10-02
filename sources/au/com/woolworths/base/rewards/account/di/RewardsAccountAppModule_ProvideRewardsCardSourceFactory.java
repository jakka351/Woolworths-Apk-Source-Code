package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsCardSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAccountAppModule_ProvideRewardsCardSourceFactory implements Factory<RewardsCardSource> {
    private final RewardsAccountAppModule module;
    private final Provider<RewardsAccountInteractor> rewardsAccountInteractorProvider;

    public static RewardsCardSource provideRewardsCardSource(RewardsAccountAppModule rewardsAccountAppModule, RewardsAccountInteractor rewardsAccountInteractor) {
        RewardsCardSource rewardsCardSourceProvideRewardsCardSource = rewardsAccountAppModule.provideRewardsCardSource(rewardsAccountInteractor);
        Preconditions.d(rewardsCardSourceProvideRewardsCardSource);
        return rewardsCardSourceProvideRewardsCardSource;
    }

    @Override // javax.inject.Provider
    public RewardsCardSource get() {
        return provideRewardsCardSource(this.module, (RewardsAccountInteractor) this.rewardsAccountInteractorProvider.get());
    }
}
