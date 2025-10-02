package au.com.woolworths.shop.receipts.ui;

import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$1$1", f = "ReceiptListScreen.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReceiptListScreenKt$ReceiptListScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopReceiptListViewModel q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptListScreenKt$ReceiptListScreen$1$1(ShopReceiptListViewModel shopReceiptListViewModel, Function1 function1, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.q = shopReceiptListViewModel;
        this.r = function1;
        this.s = function0;
        this.t = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptListScreenKt$ReceiptListScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiptListScreenKt$ReceiptListScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.h;
            final Function0 function0 = this.s;
            final Function0 function02 = this.t;
            final Function1 function1 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ReceiptListContract.Action action = (ReceiptListContract.Action) obj2;
                    if (action instanceof ReceiptListContract.Action.OpenReceiptDetails) {
                        function1.invoke(((ReceiptListContract.Action.OpenReceiptDetails) action).f12824a);
                    } else if (action instanceof ReceiptListContract.Action.OpenMyOrders) {
                        function0.invoke();
                    } else {
                        if (!(action instanceof ReceiptListContract.Action.OpenChatToUs)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function02.invoke();
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
