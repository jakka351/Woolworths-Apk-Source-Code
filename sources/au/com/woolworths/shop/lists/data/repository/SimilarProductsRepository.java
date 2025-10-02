package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/SimilarProductsRepository;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SimilarProductsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12283a;
    public final FeatureToggleManager b;

    public SimilarProductsRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12283a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.product.models.ProductId r15, java.lang.String r16, au.com.woolworths.shop.graphql.type.AlternativeProductsMode r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Exception {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository$fetchSimilarProducts$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository$fetchSimilarProducts$1 r1 = (au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository$fetchSimilarProducts$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository$fetchSimilarProducts$1 r1 = new au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository$fetchSimilarProducts$1
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L79
        L29:
            r0 = move-exception
            r15 = r0
            goto L97
        L2c:
            r0 = move-exception
            r15 = r0
            goto L9c
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r14.f12283a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery r5 = new au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.graphql.type.GetAlternativeProductsInput r6 = new au.com.woolworths.shop.graphql.type.GetAlternativeProductsInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.String r15 = r15.getValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r3 = com.apollographql.apollo.api.Optional.Companion.a(r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r8.<init>(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r17)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r6.<init>(r15, r3, r8, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r15 = r14.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r3 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r11 = r15.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r12 = 24
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r15 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r15.<init>(r0, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r0 = r15.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r0 != r2) goto L79
            return r2
        L79:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery$Data r15 = (au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery.Data) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery$GetAlternativeProducts r15 = r15.getGetAlternativeProducts()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r15 == 0) goto L8c
            au.com.woolworths.shop.lists.data.model.AlternativeProducts r15 = au.com.woolworths.shop.lists.data.model.AlternativeProductsQueryGetAlternativeProductsExtKt.toUiModel(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L8d
        L8c:
            r15 = 0
        L8d:
            if (r15 == 0) goto L90
            return r15
        L90:
            java.util.List r15 = r0.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            throw r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
        L97:
            au.com.woolworths.android.onesite.network.ServerErrorException r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r15)
            throw r15
        L9c:
            java.lang.Exception r15 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r15)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.SimilarProductsRepository.a(au.com.woolworths.product.models.ProductId, java.lang.String, au.com.woolworths.shop.graphql.type.AlternativeProductsMode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
