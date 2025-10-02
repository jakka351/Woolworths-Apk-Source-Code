package au.com.woolworths.shop.product.navigation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ProductCategoryNavigationRepository;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCategoryNavigationRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12638a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductSubCategory.ProductCategoryType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType2 = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProductCategoryNavigationRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f12638a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchMarketplaceProductCategory$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchMarketplaceProductCategory$1 r0 = (au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchMarketplaceProductCategory$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchMarketplaceProductCategory$1 r0 = new au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchMarketplaceProductCategory$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L5e
        L27:
            r6 = move-exception
            goto L7a
        L29:
            r6 = move-exception
            goto L7f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r8 = au.com.woolworths.android.onesite.navigation.Activities.ProductSubCategory.ProductCategoryType.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.CategoriesType r8 = au.com.woolworths.shop.graphql.type.CategoriesType.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloClient r2 = r5.f12638a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.MarketplaceCategoryQuery r4 = new com.woolworths.shop.product.navigation.MarketplaceCategoryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r7, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r2, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L5e
            return r1
        L5e:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.MarketplaceCategoryQuery$Data r6 = (com.woolworths.shop.product.navigation.MarketplaceCategoryQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.MarketplaceCategoryQuery$ProductCategories r6 = r6.f23605a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 == 0) goto L6f
            au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceProductCategoryList r6 = com.woolworths.shop.product.navigation.MarketplaceCategoryQueryProductCategories1769328528ExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 == 0) goto L73
            return r6
        L73:
            java.util.List r6 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L7a:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L7f:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, au.com.woolworths.android.onesite.navigation.Activities.ProductSubCategory.ProductCategoryType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchProductCategory$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchProductCategory$1 r0 = (au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchProductCategory$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchProductCategory$1 r0 = new au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository$fetchProductCategory$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L73
        L27:
            r6 = move-exception
            goto L8f
        L29:
            r6 = move-exception
            goto L94
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r5.f12638a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.ProductCategoryQuery r2 = new com.woolworths.shop.product.navigation.ProductCategoryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            int r8 = r8.ordinal()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 == 0) goto L59
            if (r8 == r3) goto L56
            r4 = 2
            if (r8 != r4) goto L50
            au.com.woolworths.shop.graphql.type.CategoriesType r8 = au.com.woolworths.shop.graphql.type.CategoriesType.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L5b
        L50:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L56:
            au.com.woolworths.shop.graphql.type.CategoriesType r8 = au.com.woolworths.shop.graphql.type.CategoriesType.f     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L5b
        L59:
            au.com.woolworths.shop.graphql.type.CategoriesType r8 = au.com.woolworths.shop.graphql.type.CategoriesType.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L5b:
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r6, r7, r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L73
            return r1
        L73:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.ProductCategoryQuery$Data r6 = (com.woolworths.shop.product.navigation.ProductCategoryQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.shop.product.navigation.ProductCategoryQuery$ProductCategories r6 = r6.f23610a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 == 0) goto L84
            au.com.woolworths.shop.product.navigation.data.ProductCategoryList r6 = com.woolworths.shop.product.navigation.ProductCategoryQueryProductCategories1769328528ExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L85
        L84:
            r6 = 0
        L85:
            if (r6 == 0) goto L88
            return r6
        L88:
            java.util.List r6 = r9.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L8f:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L94:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository.b(java.lang.String, java.lang.String, au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
