package au.com.woolworths.feature.rewards.redemptionsettings.di;

import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsRepository;
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
public final class RewardsRedemptionSettingsModule_ProvideRewardsRedemptionSettingsRepositoryFactory implements Factory<RewardsRedemptionSettingsRepository> {
    public static RewardsRedemptionSettingsRepository a(RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        return new RewardsRedemptionSettingsRepository(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
