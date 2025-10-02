package au.com.woolworths.feature.rewards.offers.di;

import au.com.woolworths.feature.rewards.offers.BranchInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferRepository;
import au.com.woolworths.rewards.base.optimizedrefresh.RefreshNotifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsOffersAppModule_ProvideRewardsOfferActivationInteractorFactory implements Factory<RewardsOfferActivationInteractor> {
    public static RewardsOfferActivationInteractor a(RewardsOffersAppModule rewardsOffersAppModule, RewardsOfferRepository rewardsOfferRepository, BranchInteractor branchInteractor, RefreshNotifier refreshNotifier) {
        rewardsOffersAppModule.getClass();
        Intrinsics.h(rewardsOfferRepository, "rewardsOfferRepository");
        Intrinsics.h(refreshNotifier, "refreshNotifier");
        return new RewardsOfferActivationInteractor(rewardsOfferRepository, branchInteractor, refreshNotifier);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
