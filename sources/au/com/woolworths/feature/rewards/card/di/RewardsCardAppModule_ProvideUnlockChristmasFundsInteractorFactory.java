package au.com.woolworths.feature.rewards.card.di;

import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsInteractor;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsCardAppModule_ProvideUnlockChristmasFundsInteractorFactory implements Factory<UnlockChristmasFundsInteractor> {
    public static UnlockChristmasFundsInteractor a(RewardsCardAppModule rewardsCardAppModule, UnlockChristmasFundsRepository unlockChristmasFundsRepository) {
        rewardsCardAppModule.getClass();
        return new UnlockChristmasFundsInteractor(unlockChristmasFundsRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
