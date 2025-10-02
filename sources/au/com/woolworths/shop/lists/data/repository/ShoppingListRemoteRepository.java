package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListRemoteRepository;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListRemoteRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12282a;
    public final ProductsInteractor b;
    public final ListsInMemoryRepository c;
    public final FeatureToggleManager d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListRemoteRepository$Companion;", "", "", "LISTS_PRODUCT_REQUEST_SOURCE_KEY", "Ljava/lang/String;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShoppingListRemoteRepository(ApolloClient apolloClient, ProductsInteractor productsInteractor, ListsInMemoryRepository listsInMemoryRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12282a = apolloClient;
        this.b = productsInteractor;
        this.c = listsInMemoryRepository;
        this.d = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.shop.graphql.type.SyncListItemsInput r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncListItems$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncListItems$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncListItems$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncListItems$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncListItems$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r5 = move-exception
            goto L68
        L29:
            r5 = move-exception
            goto L6d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.f12282a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation r2 = new au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation$Data r5 = (au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation$SyncListItems r5 = r5.getSyncListItems()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r6.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 != 0) goto L61
            return r5
        L61:
            java.util.List r5 = r6.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L68:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L6d:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository.a(au.com.woolworths.shop.graphql.type.SyncListItemsInput, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.shop.graphql.type.SyncListsInput r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            goto L69
        L2a:
            r6 = move-exception
            goto L87
        L2c:
            r6 = move-exception
            goto L8c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            return r8
        L3a:
            kotlin.ResultKt.b(r8)
            if (r7 != 0) goto L49
            r0.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r6 = r5.c(r6, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            if (r6 != r1) goto L48
            goto L68
        L48:
            return r6
        L49:
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r8 = r5.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r2 = au.com.woolworths.base.shopapp.BaseShopAppFeature.v     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r8 = r8.c(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloClient r2 = r5.f12282a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation r4 = new au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            r4.<init>(r6, r7, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            r2.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            r6.<init>(r2, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation$Data r6 = (au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.SyncListsWithGuestMutation$SyncLists r6 = r6.getSyncLists()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r7 = r8.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            if (r7 != 0) goto L80
            au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragment r6 = r6.getSyncListsResponseFragment()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            return r6
        L80:
            java.util.List r6 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2a com.apollographql.apollo.exception.ApolloException -> L2c
        L87:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L8c:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository.b(au.com.woolworths.shop.graphql.type.SyncListsInput, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(au.com.woolworths.shop.graphql.type.SyncListsInput r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$3
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$3 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$3) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$3 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository$syncLists$3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L56
        L27:
            r6 = move-exception
            goto L74
        L29:
            r6 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r7 = r5.d
            au.com.woolworths.base.shopapp.BaseShopAppFeature r2 = au.com.woolworths.base.shopapp.BaseShopAppFeature.v
            boolean r7 = r7.c(r2)
            com.apollographql.apollo.ApolloClient r2 = r5.f12282a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListsMutation r4 = new au.com.woolworths.shop.lists.data.remote.SyncListsMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r2, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L56
            return r1
        L56:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListsMutation$Data r6 = (au.com.woolworths.shop.lists.data.remote.SyncListsMutation.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.SyncListsMutation$SyncLists r6 = r6.getSyncLists()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r7.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 != 0) goto L6d
            au.com.woolworths.shop.lists.data.remote.fragment.SyncListsResponseFragment r6 = r6.getSyncListsResponseFragment()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L6d:
            java.util.List r6 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L74:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L79:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository.c(au.com.woolworths.shop.graphql.type.SyncListsInput, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
