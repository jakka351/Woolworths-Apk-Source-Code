package au.com.woolworths.feature.rewards.account.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsRepository;
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
public final class RewardsPreferencesAppModule_ProvideRewardsPreferenceDetailsRepositoryFactory implements Factory<RewardsPreferenceDetailsRepository> {
    public static RewardsPreferenceDetailsRepository a(RewardsPreferencesAppModule rewardsPreferencesAppModule, ApolloClient apolloClient, DispatcherProvider dispatcherProvider) {
        rewardsPreferencesAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new RewardsPreferenceDetailsRepository(dispatcherProvider, apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
