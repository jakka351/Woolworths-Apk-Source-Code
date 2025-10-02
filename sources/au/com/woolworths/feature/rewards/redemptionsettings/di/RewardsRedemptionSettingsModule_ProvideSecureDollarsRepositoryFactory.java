package au.com.woolworths.feature.rewards.redemptionsettings.di;

import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsRepository;
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
public final class RewardsRedemptionSettingsModule_ProvideSecureDollarsRepositoryFactory implements Factory<SecureDollarsRepository> {
    public static SecureDollarsRepository a(RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        return new SecureDollarsRepository(apolloClient);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
