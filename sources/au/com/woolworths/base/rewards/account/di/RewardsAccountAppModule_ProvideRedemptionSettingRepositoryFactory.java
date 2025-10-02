package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.base.rewards.account.RedemptionStateRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsAccountAppModule_ProvideRedemptionSettingRepositoryFactory implements Factory<RedemptionStateRepository> {
    private final RewardsAccountAppModule module;

    public static RedemptionStateRepository provideRedemptionSettingRepository(RewardsAccountAppModule rewardsAccountAppModule) {
        RedemptionStateRepository redemptionStateRepositoryProvideRedemptionSettingRepository = rewardsAccountAppModule.provideRedemptionSettingRepository();
        Preconditions.d(redemptionStateRepositoryProvideRedemptionSettingRepository);
        return redemptionStateRepositoryProvideRedemptionSettingRepository;
    }

    @Override // javax.inject.Provider
    public RedemptionStateRepository get() {
        return provideRedemptionSettingRepository(this.module);
    }
}
