package au.com.woolworths.shop.receipts.ui;

import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreenContent$1$1", f = "ReceiptListScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReceiptListScreenKt$ReceiptListScreenContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyPagingItems p;
    public final /* synthetic */ ReceiptListContract.ReceiptListAnalyticsHandler q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptListScreenKt$ReceiptListScreenContent$1$1(LazyPagingItems lazyPagingItems, ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler, Continuation continuation) {
        super(2, continuation);
        this.p = lazyPagingItems;
        this.q = receiptListAnalyticsHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptListScreenKt$ReceiptListScreenContent$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ReceiptListScreenKt$ReceiptListScreenContent$1$1 receiptListScreenKt$ReceiptListScreenContent$1$1 = (ReceiptListScreenKt$ReceiptListScreenContent$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        receiptListScreenKt$ReceiptListScreenContent$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (this.p.d().c instanceof LoadState.Error) {
            this.q.O5();
        }
        return Unit.f24250a;
    }
}
