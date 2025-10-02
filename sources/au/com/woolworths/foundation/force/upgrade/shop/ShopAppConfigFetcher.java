package au.com.woolworths.foundation.force.upgrade.shop;

import au.com.woolworths.foundation.force.upgrade.common.AppConfigFetcher;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/ShopAppConfigFetcher;", "Lau/com/woolworths/foundation/force/upgrade/common/AppConfigFetcher;", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppConfigFetcher implements AppConfigFetcher {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8521a;

    public ShopAppConfigFetcher(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8521a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher$fetchLatestAppConfig$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher$fetchLatestAppConfig$1 r0 = (au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher$fetchLatestAppConfig$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher$fetchLatestAppConfig$1 r0 = new au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher$fetchLatestAppConfig$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.graphql.type.ConfigInput r7 = new au.com.woolworths.shop.graphql.type.ConfigInput
            au.com.woolworths.shop.graphql.type.AppOS$Companion r2 = au.com.woolworths.shop.graphql.type.AppOS.e
            r7.<init>(r5, r6)
            au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery r5 = new au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery
            r5.<init>(r7)
            com.apollographql.apollo.ApolloClient r6 = r4.f8521a
            r6.getClass()
            com.apollographql.apollo.ApolloCall r7 = new com.apollographql.apollo.ApolloCall
            r7.<init>(r6, r5)
            r0.r = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7
            com.apollographql.apollo.api.Operation$Data r5 = r7.a()
            au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery$Data r5 = (au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery.Data) r5
            au.com.woolworths.foundation.force.upgrade.shop.AppConfigQuery$Config r5 = r5.getF8518a()
            au.com.woolworths.foundation.force.upgrade.common.data.AppConfigData r5 = au.com.woolworths.foundation.force.upgrade.shop.AppConfigDataMapperKt.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.force.upgrade.shop.ShopAppConfigFetcher.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
