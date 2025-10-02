package au.com.woolworths.feature.rewards.offers.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsHomeOfferRepository;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.rewards.base.ShopAppInstallationInteractor;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsOffersAppModule_ProvideRewardsHomeOfferRepositoryFactory implements Factory<RewardsHomeOfferRepository> {
    public static RewardsHomeOfferRepository a(RewardsOffersAppModule rewardsOffersAppModule, ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, ShopAppInstallationInteractor shopAppInstallationInteractor, AppIdentifier appIdentifier, RewardsAccountInteractor rewardsAccountInteractor) {
        rewardsOffersAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(appIdentifier, "appIdentifier");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        return new RewardsHomeOfferRepository(apolloClient, dispatcherProvider, featureToggleManager, shopAppInstallationInteractor, appIdentifier, rewardsAccountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
