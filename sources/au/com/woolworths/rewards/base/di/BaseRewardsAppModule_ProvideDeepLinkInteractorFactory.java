package au.com.woolworths.rewards.base.di;

import au.com.woolworths.rewards.base.DeepLinkInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BaseRewardsAppModule_ProvideDeepLinkInteractorFactory implements Factory<DeepLinkInteractor> {
    public static DeepLinkInteractor a(BaseRewardsAppModule baseRewardsAppModule) {
        baseRewardsAppModule.getClass();
        return new DeepLinkInteractor();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
