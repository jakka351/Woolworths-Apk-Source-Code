package au.com.woolworths.shop.lists.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ProductItemState;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideProductItemStateFactory implements Factory<ProductItemState> {
    public static ProductItemState a(ShopListsAppModule shopListsAppModule, TrolleyInteractor trolleyInteractor, ListsInMemoryRepository listsInMemoryRepository, FeatureToggleManager featureToggleManager) {
        shopListsAppModule.getClass();
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new ProductItemState(trolleyInteractor, listsInMemoryRepository, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
