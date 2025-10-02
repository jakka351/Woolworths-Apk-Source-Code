package au.com.woolworths.base.rewards.account.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.rewards.account.ActivePaymentClearer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RewardsAccountAppModule_ProvideActivePaymentHandlerFactory implements Factory<ActivePaymentClearer> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final RewardsAccountAppModule module;
    private final Provider<SharedPreferences> rewardsWalletPrefsProvider;

    public static ActivePaymentClearer provideActivePaymentHandler(RewardsAccountAppModule rewardsAccountAppModule, DispatcherProvider dispatcherProvider, SharedPreferences sharedPreferences) {
        ActivePaymentClearer activePaymentClearerProvideActivePaymentHandler = rewardsAccountAppModule.provideActivePaymentHandler(dispatcherProvider, sharedPreferences);
        Preconditions.d(activePaymentClearerProvideActivePaymentHandler);
        return activePaymentClearerProvideActivePaymentHandler;
    }

    @Override // javax.inject.Provider
    public ActivePaymentClearer get() {
        return provideActivePaymentHandler(this.module, (DispatcherProvider) this.dispatcherProvider.get(), (SharedPreferences) this.rewardsWalletPrefsProvider.get());
    }
}
