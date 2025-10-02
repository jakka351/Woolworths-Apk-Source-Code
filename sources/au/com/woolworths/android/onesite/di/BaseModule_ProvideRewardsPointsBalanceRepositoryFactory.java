package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalanceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseModule_ProvideRewardsPointsBalanceRepositoryFactory implements Factory<RewardsPointsBalanceRepository> {

    public static final class InstanceHolder {
    }

    public static RewardsPointsBalanceRepository a() {
        return new RewardsPointsBalanceRepository();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RewardsPointsBalanceRepository();
    }
}
