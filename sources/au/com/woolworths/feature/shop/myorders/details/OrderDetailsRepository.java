package au.com.woolworths.feature.shop.myorders.details;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsRepository;", "", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7674a;
    public final FeatureToggleManager b;
    public final SharedPreferences c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsRepository$Companion;", "", "", "API_FEATURES", "Ljava/lang/String;", "HEADER_FEATURE_MARKETPLACE", "CURRENT_ORDER_ID_TRACKED_KEY", "LOCATION_PERMISSION_NOT_SET_PRIMING_SHOWN", "LOCATION_PERMISSION_DENIED_PRIMING_SHOWN", "COACH_MARK_SHOWN", "", "EMPTY_ORDER_ID", "I", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OrderDetailsRepository(SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7674a = apolloClient;
        this.b = featureToggleManager;
        this.c = sharedPreferences;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$cancelOrder$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$cancelOrder$1 r0 = (au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$cancelOrder$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$cancelOrder$1 r0 = new au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$cancelOrder$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L52
        L27:
            r5 = move-exception
            goto L61
        L29:
            r5 = move-exception
            goto L66
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.f7674a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.CancelOrderMutation r2 = new com.woolworths.feature.shop.myorders.CancelOrderMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r5 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r5.<init>(r6, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r6 = r5.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r6 != r1) goto L52
            return r1
        L52:
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.CancelOrderMutation$Data r5 = (com.woolworths.feature.shop.myorders.CancelOrderMutation.Data) r5     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.CancelOrderMutation$CancelOrder r5 = r5.f19854a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.feature.shop.myorders.details.models.CancelOrderResponse r5 = au.com.woolworths.feature.shop.myorders.details.models.CancelOrderMutationCancelOrderExtKt.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r5
        L61:
            au.com.woolworths.android.onesite.network.ServerErrorException r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r5)
            throw r5
        L66:
            java.lang.Exception r5 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$changeLeaveUnattendedToggle$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$changeLeaveUnattendedToggle$1 r0 = (au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$changeLeaveUnattendedToggle$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$changeLeaveUnattendedToggle$1 r0 = new au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$changeLeaveUnattendedToggle$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L57
        L27:
            r6 = move-exception
            goto L60
        L29:
            r6 = move-exception
            goto L65
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r5.f7674a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation r2 = new com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedInput r4 = new au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedInput     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r4.<init>(r6, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r6 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r6.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r6.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L57
            return r1
        L57:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation$Data r6 = (com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation.Data) r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            return r6
        L60:
            au.com.woolworths.android.onesite.network.ServerErrorException r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r6)
            throw r6
        L65:
            java.lang.Exception r6 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository.b(int, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(int r22, au.com.woolworths.feature.shop.myorders.details.models.PickupLocationComponent r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Exception {
        /*
            r21 = this;
            r1 = r21
            r0 = r24
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r1.b
            boolean r3 = r0 instanceof au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$fetchOrderDetails$1
            if (r3 == 0) goto L19
            r3 = r0
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$fetchOrderDetails$1 r3 = (au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$fetchOrderDetails$1) r3
            int r4 = r3.r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.r = r4
            goto L1e
        L19:
            au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$fetchOrderDetails$1 r3 = new au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository$fetchOrderDetails$1
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r3.r
            r6 = 1
            if (r5 == 0) goto L3c
            if (r5 != r6) goto L34
            kotlin.ResultKt.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            goto Lb9
        L2e:
            r0 = move-exception
            goto Lc8
        L31:
            r0 = move-exception
            goto Lcd
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            kotlin.ResultKt.b(r0)
            com.apollographql.apollo.ApolloClient r0 = r1.f7674a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.woolworths.feature.shop.myorders.GetOrderSummaryQuery r7 = new com.woolworths.feature.shop.myorders.GetOrderSummaryQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            java.lang.String r8 = java.lang.String.valueOf(r22)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.shop.graphql.type.CallerState r5 = new au.com.woolworths.shop.graphql.type.CallerState     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            if (r23 == 0) goto L50
            au.com.woolworths.shop.graphql.type.PickupLocationComponent r9 = au.com.woolworths.feature.shop.myorders.details.models.CallerStateKt.a(r23)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            goto L51
        L50:
            r9 = 0
        L51:
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            r5.<init>(r9)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.api.Optional r9 = com.apollographql.apollo.api.Optional.Companion.a(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.g     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r10 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.h     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r11 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.l     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r12 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.i     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r13 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.k     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r14 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.j     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r15 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.p     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r16 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.m     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r17 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.n     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r18 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.e     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r19 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.MyOrdersFeature r5 = au.com.woolworths.feature.shop.myorders.MyOrdersFeature.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            boolean r20 = r2.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            r0.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.ApolloCall r2 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            r2.<init>(r0, r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            java.lang.String r0 = "x-enable-feature"
            java.lang.String r5 = "ORDER_SUMMARY_MARKET"
            r2.a(r0, r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            r3.r = r6     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            java.lang.Object r0 = r2.b(r3)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            if (r0 != r4) goto Lb9
            return r4
        Lb9:
            com.apollographql.apollo.api.ApolloResponse r0 = (com.apollographql.apollo.api.ApolloResponse) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.apollographql.apollo.api.Operation$Data r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.woolworths.feature.shop.myorders.GetOrderSummaryQuery$Data r0 = (com.woolworths.feature.shop.myorders.GetOrderSummaryQuery.Data) r0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            com.woolworths.feature.shop.myorders.GetOrderSummaryQuery$OrderSummary r0 = r0.f19893a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData r0 = au.com.woolworths.feature.shop.myorders.details.models.GetOrderSummaryQueryOrderSummaryExtKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L2e com.apollographql.apollo.exception.ApolloException -> L31
            return r0
        Lc8:
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r0)
            throw r0
        Lcd:
            java.lang.Exception r0 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsRepository.c(int, au.com.woolworths.feature.shop.myorders.details.models.PickupLocationComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
