package au.com.woolworths.product.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/interactor/ProductsRepository;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProductsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f9321a;

    public ProductsRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f9321a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.product.interactor.ProductsRepository$productsByProductIds$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.product.interactor.ProductsRepository$productsByProductIds$1 r1 = (au.com.woolworths.product.interactor.ProductsRepository$productsByProductIds$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.product.interactor.ProductsRepository$productsByProductIds$1 r1 = new au.com.woolworths.product.interactor.ProductsRepository$productsByProductIds$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L65
        L29:
            r0 = move-exception
            r12 = r0
            goto L8e
        L2c:
            r0 = move-exception
            r12 = r0
            goto L93
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r11.f9321a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.product.ProductsByProductIdsQuery r5 = new au.com.woolworths.product.ProductsByProductIdsQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r6 = r12
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            com.apollographql.apollo.ApolloCall r12 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r12.<init>(r0, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            r1.r = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.lang.Object r0 = r12.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r0 != r2) goto L65
            return r2
        L65:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            boolean r12 = r0.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            java.util.List r13 = r0.d
            if (r12 != 0) goto L89
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.product.ProductsByProductIdsQuery$Data r12 = (au.com.woolworths.product.ProductsByProductIdsQuery.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            au.com.woolworths.product.ProductsByProductIdsQuery$ProductsByProductIds r12 = r12.getF9230a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            if (r12 == 0) goto L80
            au.com.woolworths.product.models.ProductListByProductIdsApiData r12 = au.com.woolworths.product.models.ProductsByProductIdsQueryProductsByProductIdsExtKt.toUiModel(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            goto L81
        L80:
            r12 = 0
        L81:
            if (r12 == 0) goto L84
            return r12
        L84:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            throw r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
        L89:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
            throw r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L29 com.apollographql.apollo.exception.ApolloException -> L2c
        L8e:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r12)
            throw r12
        L93:
            java.lang.Exception r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.interactor.ProductsRepository.a(java.util.List, java.lang.String, java.lang.String, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
