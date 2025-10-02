package au.com.woolworths.shop.lists.di;

import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractor;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsInteractorImpl;
import au.com.woolworths.shop.lists.ui.details.interactor.ListDetailsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideListDetailsInteractor$shop_lists_releaseFactory implements Factory<ListDetailsInteractor> {
    public static ListDetailsInteractorImpl a(ShopListsAppModule shopListsAppModule, ListDetailsRepository listDetailsRepository) {
        shopListsAppModule.getClass();
        return new ListDetailsInteractorImpl(listDetailsRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
