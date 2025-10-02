package au.com.woolworths.feature.shop.myorders.details;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.models.PickupOrderMessage;
import au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/details/models/PickupOrderMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$collectPickupOrderMessage$2", f = "OrderDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$collectPickupOrderMessage$2 extends SuspendLambda implements Function2<PickupOrderMessage, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrderDetailsViewModel q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$collectPickupOrderMessage$2$1", f = "OrderDetailsViewModel.kt", l = {868, 869}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$collectPickupOrderMessage$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ OrderDetailsViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderDetailsViewModel orderDetailsViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = orderDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r1.z(r3, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r5.p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r6)
                goto L3e
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                kotlin.ResultKt.b(r6)
                goto L2a
            L1c:
                kotlin.ResultKt.b(r6)
                r5.p = r3
                r3 = 1800(0x708, double:8.893E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
                if (r6 != r0) goto L2a
                goto L3d
            L2a:
                au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel r6 = r5.q
                kotlinx.coroutines.channels.BufferedChannel r1 = r6.v
                au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract$ChannelActions$OpenPastOrderDetails r3 = new au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract$ChannelActions$OpenPastOrderDetails
                int r6 = r6.A
                r3.<init>(r6)
                r5.p = r2
                java.lang.Object r6 = r1.z(r3, r5)
                if (r6 != r0) goto L3e
            L3d:
                return r0
            L3e:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$collectPickupOrderMessage$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$collectPickupOrderMessage$2(OrderDetailsViewModel orderDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = orderDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderDetailsViewModel$collectPickupOrderMessage$2 orderDetailsViewModel$collectPickupOrderMessage$2 = new OrderDetailsViewModel$collectPickupOrderMessage$2(this.q, continuation);
        orderDetailsViewModel$collectPickupOrderMessage$2.p = obj;
        return orderDetailsViewModel$collectPickupOrderMessage$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OrderDetailsViewModel$collectPickupOrderMessage$2 orderDetailsViewModel$collectPickupOrderMessage$2 = (OrderDetailsViewModel$collectPickupOrderMessage$2) create((PickupOrderMessage) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        orderDetailsViewModel$collectPickupOrderMessage$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (((PickupOrderMessage) this.p).b == PickupOrderStatus.d) {
            OrderDetailsViewModel orderDetailsViewModel = this.q;
            orderDetailsViewModel.u.f(OrderDetailsContract.Actions.ShowPickOrderCollectedState.f7664a);
            BuildersKt.c(ViewModelKt.a(orderDetailsViewModel), null, null, new AnonymousClass1(orderDetailsViewModel, null), 3);
        }
        return Unit.f24250a;
    }
}
