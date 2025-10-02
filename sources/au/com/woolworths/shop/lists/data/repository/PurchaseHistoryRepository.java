package au.com.woolworths.shop.lists.data.repository;

import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/PurchaseHistoryRepository;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PurchaseHistoryRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12278a;

    public PurchaseHistoryRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f12278a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Integer r5, java.lang.Integer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository$fetchPurchaseHistory$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository$fetchPurchaseHistory$1 r0 = (au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository$fetchPurchaseHistory$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository$fetchPurchaseHistory$1 r0 = new au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository$fetchPurchaseHistory$1
            r0.<init>(r4, r7)
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
            r5 = move-exception
            goto L74
        L29:
            r5 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r4.f12278a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery r2 = new au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r5 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L56
            return r1
        L56:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery$Data r5 = (au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.lists.data.remote.PurchaseHistoryQuery$PurchaseHistoryEvent r5 = r5.getPurchaseHistoryEvent()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 == 0) goto L69
            au.com.woolworths.shop.lists.data.model.PurchaseHistoryList r5 = au.com.woolworths.shop.lists.data.model.PurchaseHistoryQueryPurchaseHistoryEventExtKt.toUiModel(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L6a
        L69:
            r5 = 0
        L6a:
            if (r5 == 0) goto L6d
            return r5
        L6d:
            java.util.List r5 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L74:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L79:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.PurchaseHistoryRepository.a(java.lang.Integer, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
