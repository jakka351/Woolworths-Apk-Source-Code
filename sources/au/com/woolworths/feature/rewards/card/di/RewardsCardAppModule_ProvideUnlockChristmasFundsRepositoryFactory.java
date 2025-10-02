package au.com.woolworths.feature.rewards.card.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsRepository;
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
public final class RewardsCardAppModule_ProvideUnlockChristmasFundsRepositoryFactory implements Factory<UnlockChristmasFundsRepository> {
    public static UnlockChristmasFundsRepository a(RewardsCardAppModule rewardsCardAppModule, ApolloClient apolloClient, DispatcherProvider dispatcherProvider) {
        rewardsCardAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new UnlockChristmasFundsRepository(dispatcherProvider, apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
