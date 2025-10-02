package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesRepository;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6710a;
    public final FeatureToggleManager b;
    public final LinkedHashMap c;

    public BundlesRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f6710a = apolloClient;
        this.b = featureToggleManager;
        this.c = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r12, boolean r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.bundles.BundlesRepository$fetchBundlesPage$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.bundles.BundlesRepository$fetchBundlesPage$1 r1 = (au.com.woolworths.feature.shop.bundles.BundlesRepository$fetchBundlesPage$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.bundles.BundlesRepository$fetchBundlesPage$1 r1 = new au.com.woolworths.feature.shop.bundles.BundlesRepository$fetchBundlesPage$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            java.lang.String r14 = r1.p
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            goto L7b
        L2b:
            r0 = move-exception
            r12 = r0
            goto L8f
        L2e:
            r0 = move-exception
            r12 = r0
            goto L94
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r6 = com.apollographql.apollo.api.Optional.Companion.a(r14)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r15)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r16)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.shop.graphql.type.BundlesInput r5 = new au.com.woolworths.shop.graphql.type.BundlesInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloClient r12 = r11.f6710a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.bundles.BundlesQuery r13 = new com.woolworths.feature.shop.bundles.BundlesQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r11.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r3 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            boolean r0 = r0.c(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r13.<init>(r5, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r0.<init>(r12, r13)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r1.p = r14     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            r1.s = r4     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.lang.Object r0 = r0.b(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            if (r0 != r2) goto L7b
            return r2
        L7b:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            com.woolworths.feature.shop.bundles.BundlesQuery$Data r12 = (com.woolworths.feature.shop.bundles.BundlesQuery.Data) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.shop.bundles.data.mapper.BundlesPageData r12 = au.com.woolworths.feature.shop.bundles.data.mapper.BundlesQueryDataExtKt.a(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            au.com.woolworths.feature.shop.bundles.data.BundlesData r12 = r12.f6771a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2b com.apollographql.apollo.exception.ApolloException -> L2e
            java.util.LinkedHashMap r13 = r11.c
            r13.put(r14, r12)
            return r12
        L8f:
            au.com.woolworths.android.onesite.network.ServerErrorException r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r12)
            throw r12
        L94:
            java.lang.Exception r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.BundlesRepository.a(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r19, java.util.List r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Exception {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            boolean r2 = r0 instanceof au.com.woolworths.feature.shop.bundles.BundlesRepository$updateCartBundleQuantities$1
            if (r2 == 0) goto L17
            r2 = r0
            au.com.woolworths.feature.shop.bundles.BundlesRepository$updateCartBundleQuantities$1 r2 = (au.com.woolworths.feature.shop.bundles.BundlesRepository$updateCartBundleQuantities$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.feature.shop.bundles.BundlesRepository$updateCartBundleQuantities$1 r2 = new au.com.woolworths.feature.shop.bundles.BundlesRepository$updateCartBundleQuantities$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            goto La1
        L2c:
            r0 = move-exception
            goto Lb0
        L2f:
            r0 = move-exception
            goto Lb5
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            kotlin.ResultKt.b(r0)
            r0 = r20
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.s(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r0.next()
            au.com.woolworths.feature.shop.bundles.data.BundleCartQuantityUpdate r6 = (au.com.woolworths.feature.shop.bundles.data.BundleCartQuantityUpdate) r6
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r6, r7)
            au.com.woolworths.shop.graphql.type.CartBundleQuantityUpdate r8 = new au.com.woolworths.shop.graphql.type.CartBundleQuantityUpdate
            java.lang.String r9 = r6.f6754a
            double r10 = r6.b
            java.lang.String r7 = r6.c
            com.apollographql.apollo.api.Optional$Present r12 = new com.apollographql.apollo.api.Optional$Present
            r12.<init>(r7)
            java.lang.String r7 = r6.d
            com.apollographql.apollo.api.Optional$Present r13 = new com.apollographql.apollo.api.Optional$Present
            r13.<init>(r7)
            double r14 = r6.e
            double r6 = r6.f
            r16 = r6
            r8.<init>(r9, r10, r12, r13, r14, r16)
            r4.add(r8)
            goto L50
        L82:
            au.com.woolworths.shop.graphql.type.UpdateCartBundleQuantitiesInput r0 = new au.com.woolworths.shop.graphql.type.UpdateCartBundleQuantitiesInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r6 = r19
            r0.<init>(r6, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloClient r4 = r1.f6710a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation r6 = new com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r6.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r4.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.ApolloCall r0 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r0.<init>(r4, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            r2.r = r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            java.lang.Object r0 = r0.b(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            if (r0 != r3) goto La1
            return r3
        La1:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation$Data r0 = (com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            com.woolworths.feature.shop.bundles.UpdateCartBundleQuantitiesMutation$UpdateCartBundleQuantities r0 = r0.f19442a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity r0 = au.com.woolworths.feature.shop.bundles.data.mapper.UpdateCartBundleQuantitiesMutationUpdateCartBundleQuantitiesExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2c com.apollographql.apollo.exception.ApolloException -> L2f
            return r0
        Lb0:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lb5:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.BundlesRepository.b(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
