package au.com.woolworths.shop.checkout.ui.confirmation;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$observeData$1", f = "OrderConfirmationActivity.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OrderConfirmationActivity$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OrderConfirmationActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$observeData$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<OrderConfirmationContract.ViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            OrderConfirmationContract.ViewState viewState = (OrderConfirmationContract.ViewState) obj;
            OrderConfirmationActivity orderConfirmationActivity = (OrderConfirmationActivity) this.d;
            int i = OrderConfirmationActivity.D;
            ((OrderConfirmationEpoxyController) orderConfirmationActivity.C.getD()).setData(viewState.b);
            ActivityOrderConfirmationBinding activityOrderConfirmationBinding = orderConfirmationActivity.x;
            if (activityOrderConfirmationBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            activityOrderConfirmationBinding.N(Boolean.valueOf(viewState.f10720a));
            ActivityOrderConfirmationBinding activityOrderConfirmationBinding2 = orderConfirmationActivity.x;
            if (activityOrderConfirmationBinding2 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            activityOrderConfirmationBinding2.L(viewState.c.getText(orderConfirmationActivity).toString());
            ActivityOrderConfirmationBinding activityOrderConfirmationBinding3 = orderConfirmationActivity.x;
            if (activityOrderConfirmationBinding3 != null) {
                activityOrderConfirmationBinding3.M(viewState.d);
                return Unit.f24250a;
            }
            Intrinsics.p("binding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationActivity$observeData$1(OrderConfirmationActivity orderConfirmationActivity, Continuation continuation) {
        super(2, continuation);
        this.q = orderConfirmationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderConfirmationActivity$observeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderConfirmationActivity$observeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = OrderConfirmationActivity.D;
            OrderConfirmationActivity orderConfirmationActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, orderConfirmationActivity, OrderConfirmationActivity.class, "updateView", "updateView(Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationContract$ViewState;)V", 4), FlowExtKt.a(orderConfirmationActivity.O4().n, orderConfirmationActivity.getD(), Lifecycle.State.g));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
