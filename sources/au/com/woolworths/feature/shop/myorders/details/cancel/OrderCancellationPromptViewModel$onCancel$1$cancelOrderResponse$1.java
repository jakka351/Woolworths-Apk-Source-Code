package au.com.woolworths.feature.shop.myorders.details.cancel;

import au.com.woolworths.feature.shop.myorders.details.models.CancelOrderResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/myorders/details/models/CancelOrderResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1", f = "OrderCancellationPromptViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CancelOrderResponse>, Object> {
    public int p;
    public final /* synthetic */ OrderCancellationPromptViewModel q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1(OrderCancellationPromptViewModel orderCancellationPromptViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.q = orderCancellationPromptViewModel;
        this.r = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancellationPromptViewModel$onCancel$1$cancelOrderResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        OrderCancellationInteractor orderCancellationInteractor = this.q.e;
        this.p = 1;
        Object objA = orderCancellationInteractor.f7692a.a(this.r, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
