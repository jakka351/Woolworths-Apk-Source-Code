package au.com.woolworths.base.rewards.account;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class RedemptionStateInteractor_Factory implements Factory<RedemptionStateInteractor> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RedemptionStateRepository> settingRepositoryProvider;

    public static RedemptionStateInteractor newInstance(RedemptionStateRepository redemptionStateRepository, DispatcherProvider dispatcherProvider) {
        return new RedemptionStateInteractor(redemptionStateRepository, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public RedemptionStateInteractor get() {
        return newInstance((RedemptionStateRepository) this.settingRepositoryProvider.get(), (DispatcherProvider) this.dispatcherProvider.get());
    }
}
