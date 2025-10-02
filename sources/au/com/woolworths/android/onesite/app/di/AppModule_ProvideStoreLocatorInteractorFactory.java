package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.storelocator.StoreLocatorInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppModule_ProvideStoreLocatorInteractorFactory implements Factory<StoreLocatorInteractor> {
    public static StoreLocatorInteractorImpl a(AppModule appModule, ShopAccountInteractor accountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor, LocationInteractor locationInteractor, StoreLocatorRepositoryImpl storeLocatorRepositoryImpl) {
        appModule.getClass();
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        return new StoreLocatorInteractorImpl(accountInteractor, guestLoginInteractorImpl, repositoryManager, collectionModeInteractor, locationInteractor, storeLocatorRepositoryImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
