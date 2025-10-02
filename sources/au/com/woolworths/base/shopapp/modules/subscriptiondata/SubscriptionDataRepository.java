package au.com.woolworths.base.shopapp.modules.subscriptiondata;

import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/subscriptiondata/SubscriptionDataRepository;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SubscriptionDataRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f4628a;

    public SubscriptionDataRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f4628a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository$getSubscriptionDataAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository$getSubscriptionDataAnalyticsData$1 r0 = (au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository$getSubscriptionDataAnalyticsData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository$getSubscriptionDataAnalyticsData$1 r0 = new au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository$getSubscriptionDataAnalyticsData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77
            goto L4e
        L27:
            r6 = move-exception
            goto L6d
        L29:
            r6 = move-exception
            goto L72
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r5.f4628a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery r2 = new au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            r2.<init>()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            com.apollographql.apollo.ApolloCall r4 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            r4.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            java.lang.Object r6 = r4.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            if (r6 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery$Data r6 = (au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery$Subscriptions r6 = r6.getF9165a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            if (r6 == 0) goto L77
            au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery$AnalyticsData r6 = r6.getF9167a()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            if (r6 == 0) goto L77
            au.com.woolworths.modules.subscriptioninfo.SubscriptionAnalyticsDataQuery$OnSubscriptionAnalyticsData r6 = r6.getB()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            if (r6 == 0) goto L77
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsData r6 = au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataQueryOnSubscriptionAnalyticsDataExtKt.a(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29 java.lang.Throwable -> L77 java.lang.Throwable -> L77
            return r6
        L6d:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L77
            throw r6     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L77
        L72:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L77
            throw r6     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L77
        L77:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
