package au.com.woolworths.rewards.base.di;

import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BaseRewardsAppModule_ProvideRewardsPageScrollInteractorFactory implements Factory<RewardsPageScrollManager> {
    public static RewardsPageScrollManager a(BaseRewardsAppModule baseRewardsAppModule) {
        baseRewardsAppModule.getClass();
        return new RewardsPageScrollManager();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
