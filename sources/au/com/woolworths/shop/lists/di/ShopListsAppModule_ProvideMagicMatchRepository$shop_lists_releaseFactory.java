package au.com.woolworths.shop.lists.di;

import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository;
import com.apollographql.apollo.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvideMagicMatchRepository$shop_lists_releaseFactory implements Factory<MagicMatchRepository> {
    public static MagicMatchRepository a(ShopListsAppModule shopListsAppModule, ApolloClient apolloClient, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor) {
        shopListsAppModule.getClass();
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        return new MagicMatchRepository(apolloClient, repositoryManager, collectionModeInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
