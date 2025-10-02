package au.com.woolworths.shop.lists.di;

import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractor;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchInteractorImpl;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideMagicMatchInteractor$shop_lists_releaseFactory implements Factory<MagicMatchInteractor> {
    public static MagicMatchInteractorImpl a(ShopListsAppModule shopListsAppModule, MagicMatchRepository repository) {
        shopListsAppModule.getClass();
        Intrinsics.h(repository, "repository");
        return new MagicMatchInteractorImpl(repository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
