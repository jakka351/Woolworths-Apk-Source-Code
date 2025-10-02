package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
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
public final class ShopListsDataAppModule_ProvideShoppingListInteractorFactory implements Factory<ShoppingListInteractor> {
    public static ShoppingListInteractor a(ShopListsDataAppModule shopListsDataAppModule, ShoppingListLocalRepository shoppingListLocalRepository) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        return new ShoppingListInteractor(shoppingListLocalRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
