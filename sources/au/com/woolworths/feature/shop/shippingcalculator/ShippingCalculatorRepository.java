package au.com.woolworths.feature.shop.shippingcalculator;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorRepository;", "", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShippingCalculatorRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8100a;

    public ShippingCalculatorRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8100a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository$fetchSuburbsList$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository$fetchSuburbsList$1 r0 = (au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository$fetchSuburbsList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository$fetchSuburbsList$1 r0 = new au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository$fetchSuburbsList$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L4e
        L27:
            r5 = move-exception
            goto L91
        L29:
            r5 = move-exception
            goto L96
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.f8100a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery r2 = new com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery$Data r5 = (com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.List r5 = r5.f20318a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r5 == 0) goto L8a
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt.B(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.s(r5, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.util.Iterator r5 = r5.iterator()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L6f:
            boolean r0 = r5.hasNext()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r5.next()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery$SearchSuburbsByTerm r0 = (com.woolworths.feature.shop.shippingcalculator.SearchSuburbsByTermQuery.SearchSuburbsByTerm) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.shippingcalculator.data.SearchSuburbItem r1 = new au.com.woolworths.feature.shop.shippingcalculator.data.SearchSuburbItem     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r2 = r0.f20319a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r3 = r0.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r0 = r0.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r1.<init>(r2, r3, r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.add(r1)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L6f
        L8a:
            r6 = 0
        L8b:
            if (r6 != 0) goto L90
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r5
        L90:
            return r6
        L91:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L96:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
