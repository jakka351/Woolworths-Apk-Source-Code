package au.com.woolworths.feature.rewards.redemptionsettings.di;

import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsInteractor;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsModule_ProvideSecureDollarsInteractorFactory implements Factory<SecureDollarsInteractor> {
    public static SecureDollarsInteractor a(RewardsRedemptionSettingsModule rewardsRedemptionSettingsModule, SecureDollarsRepository secureDollarsRepository) {
        return new SecureDollarsInteractor(secureDollarsRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
