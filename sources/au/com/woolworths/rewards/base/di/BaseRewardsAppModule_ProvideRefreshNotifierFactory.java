package au.com.woolworths.rewards.base.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.rewards.base.optimizedrefresh.RefreshNotifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BaseRewardsAppModule_ProvideRefreshNotifierFactory implements Factory<RefreshNotifier> {
    public static RefreshNotifier a(BaseRewardsAppModule baseRewardsAppModule, DispatcherProvider dispatcherProvider) {
        baseRewardsAppModule.getClass();
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new RefreshNotifier(dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
