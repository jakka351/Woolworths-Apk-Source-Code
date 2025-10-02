package au.com.woolworths.shop.cart.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.cart.domain.repository.ProductReviewRepository;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/ProductReviewDataRepository;", "Lau/com/woolworths/shop/cart/domain/repository/ProductReviewRepository;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewDataRepository implements ProductReviewRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10306a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductsReviewActivity.Source.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.ProductsReviewActivity.Source source = Activities.ProductsReviewActivity.Source.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ProductReviewDataRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f10306a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.android.onesite.navigation.Activities.ProductsReviewActivity.Source r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.cart.data.ProductReviewDataRepository$fetchPage$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.cart.data.ProductReviewDataRepository$fetchPage$1 r0 = (au.com.woolworths.shop.cart.data.ProductReviewDataRepository$fetchPage$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.ProductReviewDataRepository$fetchPage$1 r0 = new au.com.woolworths.shop.cart.data.ProductReviewDataRepository$fetchPage$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L66
        L27:
            r6 = move-exception
            goto L84
        L29:
            r6 = move-exception
            goto L89
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            com.apollographql.apollo.ApolloClient r7 = r5.f10306a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.ProductReviewQuery r2 = new com.woolworths.shop.cart.ProductReviewQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ProductReviewInput r4 = new au.com.woolworths.shop.graphql.type.ProductReviewInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            int r6 = r6.ordinal()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 == 0) goto L4d
            if (r6 != r3) goto L47
            au.com.woolworths.shop.graphql.type.ProductReviewSource r6 = au.com.woolworths.shop.graphql.type.ProductReviewSource.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4f
        L47:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L4d:
            au.com.woolworths.shop.graphql.type.ProductReviewSource r6 = au.com.woolworths.shop.graphql.type.ProductReviewSource.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L4f:
            r4.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r7, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r7 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 != r1) goto L66
            return r1
        L66:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.ProductReviewQuery$Data r6 = (com.woolworths.shop.cart.ProductReviewQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.cart.ProductReviewQuery$ProductReview r6 = r6.f21551a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r0 = r7.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 != 0) goto L7d
            au.com.woolworths.graphql.common.fragment.ProductReviewResponse r6 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.cart.domain.model.ProductReviewResult$Response r6 = au.com.woolworths.shop.cart.data.mapper.ProductReviewResponseExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L7d:
            java.util.List r6 = r7.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.GraphQlException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L84:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L89:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.ProductReviewDataRepository.a(au.com.woolworths.android.onesite.navigation.Activities$ProductsReviewActivity$Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.android.onesite.navigation.Activities.ProductsReviewActivity.Source r10, java.util.Set r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r12 instanceof au.com.woolworths.shop.cart.data.ProductReviewDataRepository$updateProductQuantity$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.shop.cart.data.ProductReviewDataRepository$updateProductQuantity$1 r0 = (au.com.woolworths.shop.cart.data.ProductReviewDataRepository$updateProductQuantity$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.cart.data.ProductReviewDataRepository$updateProductQuantity$1 r0 = new au.com.woolworths.shop.cart.data.ProductReviewDataRepository$updateProductQuantity$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L9b
        L28:
            r10 = move-exception
            goto Lbb
        L2b:
            r10 = move-exception
            goto Lc0
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.ResultKt.b(r12)
            com.apollographql.apollo.ApolloClient r12 = r9.f10306a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            int r10 = r10.ordinal()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r10 == 0) goto L4c
            if (r10 != r3) goto L46
            au.com.woolworths.shop.graphql.type.ProductReviewSource r10 = au.com.woolworths.shop.graphql.type.ProductReviewSource.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L4e
        L46:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r10.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
        L4c:
            au.com.woolworths.shop.graphql.type.ProductReviewSource r10 = au.com.woolworths.shop.graphql.type.ProductReviewSource.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
        L4e:
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.s(r11, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.Iterator r11 = r11.iterator()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
        L5f:
            boolean r4 = r11.hasNext()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r4 == 0) goto L80
            java.lang.Object r4 = r11.next()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.graphql.type.ProductReviewProductQuantityUpdate r5 = new au.com.woolworths.shop.graphql.type.ProductReviewProductQuantityUpdate     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r6 = r4.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r6 = (java.lang.String) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r4 = r4.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            double r7 = r4.doubleValue()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r2.add(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L5f
        L80:
            au.com.woolworths.shop.graphql.type.UpdateProductReviewProductQuantitiesInput r11 = new au.com.woolworths.shop.graphql.type.UpdateProductReviewProductQuantitiesInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r11.<init>(r10, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation r10 = new com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r10.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r11 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r11.<init>(r12, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r12 = r11.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r12 != r1) goto L9b
            return r1
        L9b:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Operation$Data r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation$Data r10 = (com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation.Data) r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation$UpdateProductReviewProductQuantities r10 = r10.f21575a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.cart.UpdateProductReviewProductQuantitiesMutation$OnProductReviewResult r10 = r10.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.shop.cart.domain.model.ProductReviewResult r10 = au.com.woolworths.shop.cart.data.mapper.ProductReviewResponseMapperKt.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r10 == 0) goto Lb4
            boolean r11 = r12.b()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r11 != 0) goto Lb4
            return r10
        Lb4:
            java.util.List r10 = r12.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.android.onesite.network.GraphQlException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.f(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
            throw r10     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L28 com.apollographql.apollo.exception.ApolloException -> L2b
        Lbb:
            au.com.woolworths.android.onesite.network.ServerErrorException r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r10)
            throw r10
        Lc0:
            java.lang.Exception r10 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.data.ProductReviewDataRepository.b(au.com.woolworths.android.onesite.navigation.Activities$ProductsReviewActivity$Source, java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
