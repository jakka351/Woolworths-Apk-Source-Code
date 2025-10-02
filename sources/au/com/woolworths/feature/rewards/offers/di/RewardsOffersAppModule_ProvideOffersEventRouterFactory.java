package au.com.woolworths.feature.rewards.offers.di;

import au.com.woolworths.foundation.rewards.offers.event.routing.RewardsOffersEventRouter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsOffersAppModule_ProvideOffersEventRouterFactory implements Factory<RewardsOffersEventRouter> {
    public static RewardsOffersEventRouter a(RewardsOffersAppModule rewardsOffersAppModule) {
        rewardsOffersAppModule.getClass();
        return new RewardsOffersEventRouter();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
