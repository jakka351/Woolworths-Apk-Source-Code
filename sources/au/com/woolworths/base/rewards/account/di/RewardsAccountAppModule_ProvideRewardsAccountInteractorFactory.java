package au.com.woolworths.base.rewards.account.di;

import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.base.rewards.account.ActivePaymentClearer;
import au.com.woolworths.base.rewards.account.RewardsAccountRepository;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor;
import au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager;
import au.com.woolworths.foundation.wxid.WxidClient;
import com.tealium.core.Tealium;
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
public final class RewardsAccountAppModule_ProvideRewardsAccountInteractorFactory implements Factory<RewardsAccountInteractor> {
    private final Provider<ActivePaymentClearer> activePaymentClearerProvider;
    private final Provider<AppConfigurationInteractor> appConfigurationInteractorProvider;
    private final Provider<CartInfoInteractor> cartInfoInteractorProvider;
    private final Provider<CartUpdateManager> cartUpdateManagerProvider;
    private final Provider<FeatureAccessListManager> featureAccessListManagerProvider;
    private final Provider<FeatureToggleManager> featureToggleManagerProvider;
    private final RewardsAccountAppModule module;
    private final Provider<RewardsAccountRepository> rewardsAccountRepositoryProvider;
    private final Provider<Tealium> tealiumProvider;
    private final Provider<WxidClient> wxidClientProvider;

    public static RewardsAccountInteractor provideRewardsAccountInteractor(RewardsAccountAppModule rewardsAccountAppModule, AppConfigurationInteractor appConfigurationInteractor, RewardsAccountRepository rewardsAccountRepository, FeatureAccessListManager featureAccessListManager, ActivePaymentClearer activePaymentClearer, CartInfoInteractor cartInfoInteractor, CartUpdateManager cartUpdateManager, Tealium tealium, WxidClient wxidClient, FeatureToggleManager featureToggleManager) {
        RewardsAccountInteractor rewardsAccountInteractorProvideRewardsAccountInteractor = rewardsAccountAppModule.provideRewardsAccountInteractor(appConfigurationInteractor, rewardsAccountRepository, featureAccessListManager, activePaymentClearer, cartInfoInteractor, cartUpdateManager, tealium, wxidClient, featureToggleManager);
        Preconditions.d(rewardsAccountInteractorProvideRewardsAccountInteractor);
        return rewardsAccountInteractorProvideRewardsAccountInteractor;
    }

    @Override // javax.inject.Provider
    public RewardsAccountInteractor get() {
        return provideRewardsAccountInteractor(this.module, (AppConfigurationInteractor) this.appConfigurationInteractorProvider.get(), (RewardsAccountRepository) this.rewardsAccountRepositoryProvider.get(), (FeatureAccessListManager) this.featureAccessListManagerProvider.get(), (ActivePaymentClearer) this.activePaymentClearerProvider.get(), (CartInfoInteractor) this.cartInfoInteractorProvider.get(), (CartUpdateManager) this.cartUpdateManagerProvider.get(), (Tealium) this.tealiumProvider.get(), (WxidClient) this.wxidClientProvider.get(), (FeatureToggleManager) this.featureToggleManagerProvider.get());
    }
}
