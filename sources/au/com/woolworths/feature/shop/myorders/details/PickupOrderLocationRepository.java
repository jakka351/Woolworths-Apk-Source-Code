package au.com.woolworths.feature.shop.myorders.details;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/PickupOrderLocationRepository;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickupOrderLocationRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7680a;

    public PickupOrderLocationRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f7680a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r12, double r13, double r15, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository$updatePickupOrderLocation$1
            if (r1 == 0) goto L15
            r1 = r0
            au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository$updatePickupOrderLocation$1 r1 = (au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository$updatePickupOrderLocation$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository$updatePickupOrderLocation$1 r1 = new au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository$updatePickupOrderLocation$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            kotlin.ResultKt.b(r0)
            goto L57
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.ResultKt.b(r0)
            com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation r0 = new com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation
            au.com.woolworths.shop.graphql.type.PickupOrderLocationUpdateInput r5 = new au.com.woolworths.shop.graphql.type.PickupOrderLocationUpdateInput
            java.lang.String r6 = java.lang.String.valueOf(r12)
            r7 = r13
            r9 = r15
            r5.<init>(r6, r7, r9)
            r0.<init>(r5)
            com.apollographql.apollo.ApolloClient r12 = r11.f7680a
            r12.getClass()
            com.apollographql.apollo.ApolloCall r13 = new com.apollographql.apollo.ApolloCall
            r13.<init>(r12, r0)
            r1.r = r4
            java.lang.Object r0 = r13.b(r1)
            if (r0 != r2) goto L57
            return r2
        L57:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0
            com.apollographql.apollo.api.Operation$Data r12 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)
            com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation$Data r12 = (com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation.Data) r12
            com.woolworths.feature.shop.myorders.UpdatePickupOrderLocationMutation$UpdatePickupOrderLocation r12 = r12.f20026a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.PickupOrderLocationRepository.a(int, double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
