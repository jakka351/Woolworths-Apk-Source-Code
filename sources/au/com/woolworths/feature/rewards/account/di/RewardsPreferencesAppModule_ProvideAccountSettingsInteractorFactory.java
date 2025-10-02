package au.com.woolworths.feature.rewards.account.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsInteractorOld;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsRepositoryOld;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import au.com.woolworths.rewards.base.homepage.AccountNotificationBadgeInteractor;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsPreferencesAppModule_ProvideAccountSettingsInteractorFactory implements Factory<AccountSettingsInteractorOld> {
    public static AccountSettingsInteractorOld a(RewardsPreferencesAppModule rewardsPreferencesAppModule, AccountSettingsRepositoryOld accountSettingsRepositoryOld, AccountNotificationBadgeInteractor accountNotificationBadgeInteractor, RewardsBannerInteractor rewardsBannerInteractor, MedalliaInteractor medalliaInteractor, FeatureToggleManager featureToggleManager) {
        rewardsPreferencesAppModule.getClass();
        Intrinsics.h(accountNotificationBadgeInteractor, "accountNotificationBadgeInteractor");
        Intrinsics.h(rewardsBannerInteractor, "rewardsBannerInteractor");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new AccountSettingsInteractorOld(accountSettingsRepositoryOld, accountNotificationBadgeInteractor, rewardsBannerInteractor, medalliaInteractor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
