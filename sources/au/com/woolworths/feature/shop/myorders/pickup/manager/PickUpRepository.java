package au.com.woolworths.feature.shop.myorders.pickup.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickUpRepository;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickUpRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7884a;

    public PickUpRepository(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f7884a = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r9, java.lang.String r10, android.location.Location r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOnMyWay$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOnMyWay$1 r0 = (au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOnMyWay$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOnMyWay$1 r0 = new au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOnMyWay$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L72
        L27:
            r9 = move-exception
            goto L88
        L29:
            r9 = move-exception
            goto L8d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.b(r12)
            com.apollographql.apollo.ApolloClient r12 = r8.f7884a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional r10 = com.apollographql.apollo.api.Optional.Companion.a(r10)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r11 == 0) goto L55
            au.com.woolworths.shop.graphql.type.GeoLocation r2 = new au.com.woolworths.shop.graphql.type.GeoLocation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            double r4 = r11.getLatitude()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            double r6 = r11.getLongitude()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4, r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Optional$Present r11 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r11.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L57
        L55:
            com.apollographql.apollo.api.Optional$Absent r11 = com.apollographql.apollo.api.Optional.Absent.f13523a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L57:
            au.com.woolworths.shop.graphql.type.OrderCheckInOnMyWayInput r2 = new au.com.woolworths.shop.graphql.type.OrderCheckInOnMyWayInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r10, r11, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation r9 = new com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r9.<init>(r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r12.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r10 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r10.<init>(r12, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r12 = r10.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r12 != r1) goto L72
            return r1
        L72:
            com.apollographql.apollo.api.ApolloResponse r12 = (com.apollographql.apollo.api.ApolloResponse) r12     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r12)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation$Data r9 = (com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation.Data) r9     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.OrderCheckInOnMyWayMutation$OrderCheckInOnMyWay r9 = r9.f20016a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.myorders.details.models.PickupCheckInResponse r10 = new au.com.woolworths.feature.shop.myorders.details.models.PickupCheckInResponse     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r11 = r9.f20017a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r12 = r9.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r9 = r9.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r10.<init>(r11, r12, r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r10
        L88:
            au.com.woolworths.android.onesite.network.ServerErrorException r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r9)
            throw r9
        L8d:
            java.lang.Exception r9 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository.a(int, java.lang.String, android.location.Location, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, au.com.woolworths.shop.graphql.type.CheckInType r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOrder$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOrder$1 r0 = (au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOrder$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOrder$1 r0 = new au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository$checkInOrder$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r8)
            com.woolworths.feature.shop.myorders.OrderCheckInMutation r8 = new com.woolworths.feature.shop.myorders.OrderCheckInMutation
            com.apollographql.apollo.api.Optional r7 = com.apollographql.apollo.api.Optional.Companion.a(r7)
            r8.<init>(r5, r6, r7)
            com.apollographql.apollo.ApolloClient r5 = r4.f7884a
            r5.getClass()
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall
            r6.<init>(r5, r8)
            r0.r = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8
            boolean r5 = r8.b()
            if (r5 != 0) goto L65
            com.apollographql.apollo.api.Operation$Data r5 = r8.c
            com.woolworths.feature.shop.myorders.OrderCheckInMutation$Data r5 = (com.woolworths.feature.shop.myorders.OrderCheckInMutation.Data) r5
            if (r5 == 0) goto L65
            com.woolworths.feature.shop.myorders.OrderCheckInMutation$OrderCheckIn r5 = r5.f20013a
            boolean r5 = r5.f20014a
            if (r5 != r3) goto L65
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L65:
            java.util.List r5 = r8.d
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.pickup.manager.PickUpRepository.b(java.lang.String, au.com.woolworths.shop.graphql.type.CheckInType, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
