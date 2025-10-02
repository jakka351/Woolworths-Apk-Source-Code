package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsPageRepository;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsPageRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12591a;
    public final FeatureToggleManager b;

    public ProductDetailsPageRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12591a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.shop.graphql.type.NodeInput r12, boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Exception {
        /*
            r11 = this;
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r11.b
            boolean r1 = r14 instanceof au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchNodeContent$1
            if (r1 == 0) goto L15
            r1 = r14
            au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchNodeContent$1 r1 = (au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchNodeContent$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchNodeContent$1 r1 = new au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchNodeContent$1
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L6e
        L29:
            r0 = move-exception
            r12 = r0
            goto L81
        L2c:
            r0 = move-exception
            r12 = r0
            goto L86
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.b(r14)
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r14 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r10 = r0.c(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloClient r14 = r11.f12591a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.O     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r8 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.base.shopapp.BaseShopAppFeature r3 = au.com.woolworths.base.shopapp.BaseShopAppFeature.y     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r0 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.product.details.FetchNodeContentQuery r5 = new com.woolworths.shop.product.details.FetchNodeContentQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r6 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r14.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r12 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r12.<init>(r14, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r14 = r12.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r14 != r2) goto L6e
            return r2
        L6e:
            com.apollographql.apollo.api.ApolloResponse r14 = (com.apollographql.apollo.api.ApolloResponse) r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.product.details.FetchNodeContentQuery$Data r12 = (com.woolworths.shop.product.details.FetchNodeContentQuery.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.woolworths.shop.product.details.FetchNodeContentQuery$FetchNodeContent r12 = r12.f23402a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r12 == 0) goto L7f
            au.com.woolworths.shop.product.details.data.NodeContent r12 = au.com.woolworths.shop.product.details.data.FetchNodeContentQueryFetchNodeContentExtKt.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            return r12
        L7f:
            r12 = 0
            return r12
        L81:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r12)
            throw r12
        L86:
            java.lang.Exception r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsPageRepository.a(au.com.woolworths.shop.graphql.type.NodeInput, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.shop.graphql.type.ProductDetailsPageInput r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r0 = r20
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.b
            boolean r4 = r0 instanceof au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchProductDetailsPage$1
            if (r4 == 0) goto L1c
            r4 = r0
            au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchProductDetailsPage$1 r4 = (au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchProductDetailsPage$1) r4
            int r5 = r4.r
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1c
            int r5 = r5 - r6
            r4.r = r5
        L1a:
            r0 = r4
            goto L22
        L1c:
            au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchProductDetailsPage$1 r4 = new au.com.woolworths.shop.product.details.ProductDetailsPageRepository$fetchProductDetailsPage$1
            r4.<init>(r1, r0)
            goto L1a
        L22:
            java.lang.Object r4 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r0.r
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            kotlin.ResultKt.b(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            goto Lc7
        L32:
            r0 = move-exception
            goto Ld6
        L35:
            r0 = move-exception
            goto Ldb
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L40:
            kotlin.ResultKt.b(r4)
            au.com.woolworths.base.shopapp.BaseShopAppFeature r4 = au.com.woolworths.base.shopapp.BaseShopAppFeature.N     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r4 = r2.c(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.q     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r10 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.ApolloClient r5 = r1.f12591a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsPreviewInput r7 = new au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsPreviewInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.api.Optional r8 = r3.f11730a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r9 = r8 instanceof com.apollographql.apollo.api.Optional.Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r11 = 0
            if (r9 == 0) goto L5d
            com.apollographql.apollo.api.Optional$Present r8 = (com.apollographql.apollo.api.Optional.Present) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            goto L5e
        L5d:
            r8 = r11
        L5e:
            if (r8 == 0) goto L62
            java.lang.Object r11 = r8.f13524a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
        L62:
            java.lang.String r11 = (java.lang.String) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            if (r11 != 0) goto L68
            java.lang.String r11 = ""
        L68:
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            java.util.List r9 = r3.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r8.<init>(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r7.<init>(r11, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.base.shopapp.BaseShopAppFeature r8 = au.com.woolworths.base.shopapp.BaseShopAppFeature.O     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r9 = r2.c(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.base.shopapp.BaseShopAppFeature r8 = au.com.woolworths.base.shopapp.BaseShopAppFeature.F     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r8 = r2.c(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.api.Optional$Present r11 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.base.shopapp.BaseShopAppFeature r12 = au.com.woolworths.base.shopapp.BaseShopAppFeature.E     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r12 = r2.c(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r11.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.base.shopapp.BaseShopAppFeature r12 = au.com.woolworths.base.shopapp.BaseShopAppFeature.y     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r12 = r2.c(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r13 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r13 = r2.c(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.product.ProductFeature r14 = au.com.woolworths.product.ProductFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            boolean r14 = r2.c(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.woolworths.shop.product.details.ProductDetailsPageQuery r2 = new com.woolworths.shop.product.details.ProductDetailsPageQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r16 = r5
            r5 = r4
            r1 = r6
            r20 = r16
            r6 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r20.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.ApolloCall r3 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r4 = r20
            r3.<init>(r4, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            r0.r = r1     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            java.lang.Object r4 = r3.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            if (r4 != r15) goto Lc7
            return r15
        Lc7:
            com.apollographql.apollo.api.ApolloResponse r4 = (com.apollographql.apollo.api.ApolloResponse) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.woolworths.shop.product.details.ProductDetailsPageQuery$Data r0 = (com.woolworths.shop.product.details.ProductDetailsPageQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            com.woolworths.shop.product.details.ProductDetailsPageQuery$ProductDetailsPage r0 = r0.f23424a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            au.com.woolworths.shop.product.details.data.ProductDetailsPage r0 = au.com.woolworths.shop.product.details.data.ProductDetailsPageQueryProductDetailsPageExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L32 com.apollographql.apollo.exception.ApolloException -> L35
            return r0
        Ld6:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Ldb:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsPageRepository.b(au.com.woolworths.shop.graphql.type.ProductDetailsPageInput, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
