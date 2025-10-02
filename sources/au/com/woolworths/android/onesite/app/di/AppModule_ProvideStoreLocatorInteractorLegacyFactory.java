package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
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
public final class AppModule_ProvideStoreLocatorInteractorLegacyFactory implements Factory<LegacyStoreLocatorInteractor> {
    public static LegacyStoreLocatorInteractorImpl a(AppModule appModule, ShopAccountInteractor accountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor, LocationInteractor locationInteractor, StoreLocatorRepository storeLocatorRepository) {
        appModule.getClass();
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        return new LegacyStoreLocatorInteractorImpl(accountInteractor, guestLoginInteractorImpl, repositoryManager, collectionModeInteractor, locationInteractor, storeLocatorRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
