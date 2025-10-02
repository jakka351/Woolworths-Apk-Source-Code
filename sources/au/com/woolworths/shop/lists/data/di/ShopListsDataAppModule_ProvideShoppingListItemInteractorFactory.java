package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion;
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
public final class ShopListsDataAppModule_ProvideShoppingListItemInteractorFactory implements Factory<ShoppingListItemInteractor> {
    public static ShoppingListItemInteractor a(ShopListsDataAppModule shopListsDataAppModule, ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListItemsLocalRepositoryWithSoftDeletion listItemsLocalRepository) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        return new ShoppingListItemInteractor(shoppingListLocalRepository, listItemsLocalRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
