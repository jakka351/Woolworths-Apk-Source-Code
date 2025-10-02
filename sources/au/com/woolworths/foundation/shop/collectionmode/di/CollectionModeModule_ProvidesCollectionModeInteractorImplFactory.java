package au.com.woolworths.foundation.shop.collectionmode.di;

import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class CollectionModeModule_ProvidesCollectionModeInteractorImplFactory implements Factory<CollectionModeInteractorImpl> {
    public static CollectionModeInteractorImpl a(CollectionModeModule collectionModeModule, Lazy repositoryManagerLazy, Lazy legacyShoppingModeRepository, CollectionModeRepository collectionModeRepository, PickUpLocatorRepository pickUpLocatorRepository, AccountInteractor accountInteractor) {
        collectionModeModule.getClass();
        Intrinsics.h(repositoryManagerLazy, "repositoryManagerLazy");
        Intrinsics.h(legacyShoppingModeRepository, "legacyShoppingModeRepository");
        Intrinsics.h(collectionModeRepository, "collectionModeRepository");
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        Intrinsics.h(accountInteractor, "accountInteractor");
        return new CollectionModeInteractorImpl(repositoryManagerLazy, legacyShoppingModeRepository, collectionModeRepository, pickUpLocatorRepository, accountInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DoubleCheck.a(null);
        DoubleCheck.a(null);
        throw null;
    }
}
