package au.com.woolworths.foundation.rewards.onboarding.di;

import android.app.Application;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class RewardsOnboardingAppModule_ProvideOnboardingManagerFactory implements Factory<ProgressiveCoachMarkManager> {
    public static ProgressiveCoachMarkManager a(RewardsOnboardingAppModule rewardsOnboardingAppModule, Application application, DispatcherProvider dispatcherProvider) {
        rewardsOnboardingAppModule.getClass();
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new ProgressiveCoachMarkManager(application, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
