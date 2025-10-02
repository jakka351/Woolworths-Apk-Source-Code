package au.com.woolworths.foundation.shop.collectionmode.di;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.modules.collectionmode.AddressInteractor;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.base.shopapp.modules.collectionmode.ShoppingModeApi;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.LegacyShoppingModeRepositoryImpl;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class CollectionModeModule_ProvideLegacyShoppingModeRepositoryFactory implements Factory<LegacyShoppingModeRepository> {
    public static LegacyShoppingModeRepositoryImpl a(CollectionModeModule collectionModeModule, SharedPreferences sharedPreferences, Gson gson, ShoppingModeApi shoppingModeApi, AccountInteractor accountInteractor, CollectionModeInteractor collectionModeInteractor, SchedulersProvider schedulersProvider, AddressInteractor addressInteractor, FeatureToggleManager featureToggleManager) {
        collectionModeModule.getClass();
        Intrinsics.h(gson, "gson");
        Intrinsics.h(shoppingModeApi, "shoppingModeApi");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new LegacyShoppingModeRepositoryImpl(sharedPreferences, shoppingModeApi, accountInteractor, collectionModeInteractor, gson, schedulersProvider, addressInteractor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
