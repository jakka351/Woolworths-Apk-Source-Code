package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RewardsAccountAppModule_ProvideBaseRewardsAccountPersistentMetadataProvidersFactory implements Factory<Set<PersistentMetadataProvider>> {
    private final RewardsAccountAppModule module;
    private final Provider<RewardsAccountInteractor> rewardsAccountInteractorProvider;

    public static Set<PersistentMetadataProvider> provideBaseRewardsAccountPersistentMetadataProviders(RewardsAccountAppModule rewardsAccountAppModule, RewardsAccountInteractor rewardsAccountInteractor) {
        Set<PersistentMetadataProvider> setProvideBaseRewardsAccountPersistentMetadataProviders = rewardsAccountAppModule.provideBaseRewardsAccountPersistentMetadataProviders(rewardsAccountInteractor);
        Preconditions.d(setProvideBaseRewardsAccountPersistentMetadataProviders);
        return setProvideBaseRewardsAccountPersistentMetadataProviders;
    }

    @Override // javax.inject.Provider
    public Set<PersistentMetadataProvider> get() {
        return provideBaseRewardsAccountPersistentMetadataProviders(this.module, (RewardsAccountInteractor) this.rewardsAccountInteractorProvider.get());
    }
}
