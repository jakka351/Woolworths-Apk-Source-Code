package au.com.woolworths.feature.shop.login.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.base.shopapp.guest.LogOutInteractor;
import au.com.woolworths.feature.shop.login.LogOutInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.ListsDataStoreImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopLoginAppModule_ProvideLogoutInteractorFactory implements Factory<LogOutInteractor> {
    public static LogOutInteractorImpl a(ShopLoginAppModule shopLoginAppModule, ShopAccountInteractor accountInteractor, RewardsAccountInteractor rewardsAccountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, CollectionModeInteractor collectionModeInteractor, CartUpdateInteractor cartUpdateInteractor, WxidClientImpl wxidClientImpl, FeatureToggleManager featureToggleManager, ShippingCalculatorDataStore shippingCalculatorDataStore, ListsDataStoreImpl listsDataStoreImpl, SharedPreferences sharedPreferences) {
        shopLoginAppModule.getClass();
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shippingCalculatorDataStore, "shippingCalculatorDataStore");
        return new LogOutInteractorImpl(accountInteractor, rewardsAccountInteractor, guestLoginInteractorImpl, collectionModeInteractor, cartUpdateInteractor, wxidClientImpl, sharedPreferences, featureToggleManager, shippingCalculatorDataStore, listsDataStoreImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
