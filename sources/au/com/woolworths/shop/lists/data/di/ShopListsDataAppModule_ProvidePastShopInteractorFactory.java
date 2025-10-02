package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.shop.lists.data.PastShopInteractor;
import au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsDataAppModule_ProvidePastShopInteractorFactory implements Factory<PastShopInteractor> {
    public static PastShopInteractor a(ShopListsDataAppModule shopListsDataAppModule, PurchaseHistoryRepository repository) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(repository, "repository");
        return new PastShopInteractor(repository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
