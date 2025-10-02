package au.com.woolworths.feature.shop.brandedshop;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/BrandedShopRepository;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BrandedShopRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6655a;
    public final FeatureToggleManager b;

    public BrandedShopRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6655a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, au.com.woolworths.shop.graphql.type.ShoppingModeType r13, java.util.List r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r15 instanceof au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository$fetchBrandedShopDetails$1
            if (r0 == 0) goto L13
            r0 = r15
            au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository$fetchBrandedShopDetails$1 r0 = (au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository$fetchBrandedShopDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository$fetchBrandedShopDetails$1 r0 = new au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository$fetchBrandedShopDetails$1
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            goto L94
        L27:
            r0 = move-exception
            r11 = r0
            goto La3
        L2b:
            r0 = move-exception
            r11 = r0
            goto La8
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r15 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r10.b
            boolean r15 = r2.c(r15)
            au.com.woolworths.base.shopapp.BaseShopAppFeature r4 = au.com.woolworths.base.shopapp.BaseShopAppFeature.y
            boolean r2 = r2.c(r4)
            com.apollographql.apollo.api.Optional$Present r5 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r5.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional$Present r6 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r6.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.brandedshop.data.LocalAction[] r11 = au.com.woolworths.feature.shop.brandedshop.data.LocalAction.values()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            int r12 = r11.length     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r9.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            int r12 = r11.length     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r4 = 0
        L5e:
            if (r4 >= r12) goto L6d
            r7 = r11[r4]     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.String r7 = "openbottomsheet"
            r9.add(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            int r4 = r4 + 1
            goto L5e
        L6d:
            au.com.woolworths.shop.graphql.type.BrandedShopInput r4 = new au.com.woolworths.shop.graphql.type.BrandedShopInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloClient r11 = r10.f6655a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Optional r12 = com.apollographql.apollo.api.Optional.Companion.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.brandedshop.BrandedShopQuery r13 = new com.woolworths.shop.brandedshop.BrandedShopQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r13.<init>(r4, r12, r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r11.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.ApolloCall r12 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r12.<init>(r11, r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            java.lang.Object r15 = r12.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            if (r15 != r1) goto L94
            return r1
        L94:
            com.apollographql.apollo.api.ApolloResponse r15 = (com.apollographql.apollo.api.ApolloResponse) r15     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.apollographql.apollo.api.Operation$Data r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.brandedshop.BrandedShopQuery$Data r11 = (com.woolworths.shop.brandedshop.BrandedShopQuery.Data) r11     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            com.woolworths.shop.brandedshop.BrandedShopQuery$BrandedShop r11 = r11.f21397a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            au.com.woolworths.feature.shop.brandedshop.data.BrandedShopData r11 = au.com.woolworths.feature.shop.brandedshop.data.BrandedShopQueryBrandedShopExtKt.a(r11)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L2b
            return r11
        La3:
            au.com.woolworths.android.onesite.network.ServerErrorException r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r11)
            throw r11
        La8:
            java.lang.Exception r11 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository.a(java.lang.String, java.lang.String, au.com.woolworths.shop.graphql.type.ShoppingModeType, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
