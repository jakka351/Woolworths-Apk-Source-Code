package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesRepository;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7819a;
    public final FeatureToggleManager b;

    public YourGroceriesRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7819a = apolloClient;
        this.b = featureToggleManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r9 instanceof au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository$fetchYourGroceries$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository$fetchYourGroceries$1 r0 = (au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository$fetchYourGroceries$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository$fetchYourGroceries$1 r0 = new au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository$fetchYourGroceries$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L5a
        L27:
            r7 = move-exception
            goto L63
        L29:
            r7 = move-exception
            goto L68
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r6.f7819a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.GetYourGroceriesQuery r2 = new com.woolworths.feature.shop.myorders.GetYourGroceriesQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r8 = com.apollographql.apollo.api.Optional.Companion.a(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r4 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r4 = r4.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r8, r7, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r7 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r9, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r9 = r7.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r9 != r1) goto L5a
            return r1
        L5a:
            com.apollographql.apollo.api.ApolloResponse r9 = (com.apollographql.apollo.api.ApolloResponse) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.GetYourGroceriesQuery$Data r7 = (com.woolworths.feature.shop.myorders.GetYourGroceriesQuery.Data) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r7
        L63:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r7)
            throw r7
        L68:
            java.lang.Exception r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
