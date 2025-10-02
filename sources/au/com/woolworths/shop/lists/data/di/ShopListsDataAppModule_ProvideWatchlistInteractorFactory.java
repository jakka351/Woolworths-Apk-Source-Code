package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsDataAppModule_ProvideWatchlistInteractorFactory implements Factory<WatchlistInteractor> {
    public static WatchlistInteractor a(ShopListsDataAppModule shopListsDataAppModule, ShoppingListItemInteractor shoppingListItemInteractor, ShopAccountInteractor shopAccountInteractor, ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListItemsLocalRepository shoppingListItemsLocalRepository, DispatcherProvider dispatcherProvider) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(shoppingListItemInteractor, "shoppingListItemInteractor");
        Intrinsics.h(shopAccountInteractor, "shopAccountInteractor");
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        Intrinsics.h(shoppingListItemsLocalRepository, "shoppingListItemsLocalRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        return new WatchlistInteractor(shoppingListItemInteractor, shopAccountInteractor, shoppingListLocalRepository, shoppingListItemsLocalRepository, dispatcherProvider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
