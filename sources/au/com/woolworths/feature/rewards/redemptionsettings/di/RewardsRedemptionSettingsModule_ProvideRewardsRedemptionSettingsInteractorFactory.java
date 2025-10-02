package au.com.woolworths.feature.rewards.redemptionsettings.di;

import au.com.woolworths.base.rewards.account.RedemptionStateRepository;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsInteractor;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsInteractorFactory implements Factory<RewardsRedemptionSettingsInteractor> {
    public static RewardsRedemptionSettingsInteractor a(RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule, RewardsRedemptionSettingsRepository rewardsRedemptionSettingsRepository, RedemptionStateRepository redemptionStateRepository) {
        Intrinsics.h(redemptionStateRepository, "redemptionStateRepository");
        return new RewardsRedemptionSettingsInteractor(rewardsRedemptionSettingsRepository, redemptionStateRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
