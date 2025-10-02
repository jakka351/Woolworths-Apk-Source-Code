package au.com.woolworths.rewards.base.di;

import android.app.Application;
import au.com.woolworths.rewards.base.homepage.RewardsBannerInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BaseRewardsAppModule_ProvideRewardsBannerInteractorFactory implements Factory<RewardsBannerInteractor> {
    public static RewardsBannerInteractor a(BaseRewardsAppModule baseRewardsAppModule, Application application) {
        baseRewardsAppModule.getClass();
        return new RewardsBannerInteractor(application);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
