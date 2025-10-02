package au.com.woolworths.foundation.rewards.servicemessages.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractor;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class RewardsServiceMessageModule_ProvideRewardsServiceMessageInteractorFactory implements Factory<RewardsServiceMessageInteractor> {
    public static RewardsServiceMessageInteractorImpl a(RewardsServiceMessageModule rewardsServiceMessageModule, FeatureToggleManager featureToggleManager, RewardsAccountInteractor rewardsAccountInteractor) {
        rewardsServiceMessageModule.getClass();
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        return new RewardsServiceMessageInteractorImpl(featureToggleManager, rewardsAccountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
