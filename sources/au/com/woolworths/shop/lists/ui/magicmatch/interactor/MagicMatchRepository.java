package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/interactor/MagicMatchRepository;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12360a;
    public final RepositoryManager b;
    public final CollectionModeInteractor c;

    public MagicMatchRepository(ApolloClient apolloClient, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f12360a = apolloClient;
        this.b = repositoryManager;
        this.c = collectionModeInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository$magicMatchProductList$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository$magicMatchProductList$1 r0 = (au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository$magicMatchProductList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository$magicMatchProductList$1 r0 = new au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository$magicMatchProductList$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L67
        L27:
            r8 = move-exception
            goto L81
        L29:
            r8 = move-exception
            goto L86
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r7.f12360a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.MagicMatchProductListQuery r2 = new au.com.woolworths.shop.lists.MagicMatchProductListQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.MagicMatchInput r4 = new au.com.woolworths.shop.graphql.type.MagicMatchInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r5 = r7.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r5 = r5.f()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r5 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r6 = r7.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r6 = r6.w()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ShoppingModeType r6 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r5, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r8 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r8.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L67
            return r1
        L67:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.MagicMatchProductListQuery$Data r8 = (au.com.woolworths.shop.lists.MagicMatchProductListQuery.Data) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r9.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 != 0) goto L7a
            java.util.ArrayList r8 = au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepositoryKt.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r8
        L7a:
            java.util.List r8 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L81:
            au.com.woolworths.android.onesite.network.ServerErrorException r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r8)
            throw r8
        L86:
            java.lang.Exception r8 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.magicmatch.interactor.MagicMatchRepository.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
