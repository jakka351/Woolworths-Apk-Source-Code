package au.com.woolworths.shop.lists.data.di;

import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.lists.data.SimilarProductsInteractor;
import au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsDataAppModule_ProvideSimilarProductsInteractorFactory implements Factory<SimilarProductsInteractor> {
    public static SimilarProductsInteractor a(ShopListsDataAppModule shopListsDataAppModule, CollectionModeInteractor collectionModeInteractor, SimilarProductsRepository repository) {
        shopListsDataAppModule.getClass();
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(repository, "repository");
        return new SimilarProductsInteractor(collectionModeInteractor, repository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
