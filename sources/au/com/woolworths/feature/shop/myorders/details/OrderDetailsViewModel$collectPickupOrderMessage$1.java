package au.com.woolworths.feature.shop.myorders.details;

import au.com.woolworths.feature.shop.myorders.details.models.PickupOrderMessage;
import au.com.woolworths.feature.shop.myorders.details.models.PickupOrderStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/feature/shop/myorders/details/models/PickupOrderMessage;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$collectPickupOrderMessage$1", f = "OrderDetailsViewModel.kt", l = {857}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$collectPickupOrderMessage$1 extends SuspendLambda implements Function3<FlowCollector<? super PickupOrderMessage>, Throwable, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public final /* synthetic */ OrderDetailsViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$collectPickupOrderMessage$1(OrderDetailsViewModel orderDetailsViewModel, Continuation continuation) {
        super(3, continuation);
        this.r = orderDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderDetailsViewModel$collectPickupOrderMessage$1 orderDetailsViewModel$collectPickupOrderMessage$1 = new OrderDetailsViewModel$collectPickupOrderMessage$1(this.r, (Continuation) obj3);
        orderDetailsViewModel$collectPickupOrderMessage$1.q = (FlowCollector) obj;
        return orderDetailsViewModel$collectPickupOrderMessage$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            PickupOrderMessage pickupOrderMessage = new PickupOrderMessage(String.valueOf(this.r.A), PickupOrderStatus.e);
            this.p = 1;
            if (flowCollector.emit(pickupOrderMessage, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
