package au.com.woolworths.shop.receipts.ui;

import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SnackbarResult;
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
@DebugMetadata(c = "au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt$ReceiptListScreenContent$2$1", f = "ReceiptListScreen.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ReceiptListScreenKt$ReceiptListScreenContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyPagingItems q;
    public final /* synthetic */ ReceiptListContract.ReceiptListAnalyticsHandler r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptListScreenKt$ReceiptListScreenContent$2$1(LazyPagingItems lazyPagingItems, ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler, SnackbarHostState snackbarHostState, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = lazyPagingItems;
        this.r = receiptListAnalyticsHandler;
        this.s = snackbarHostState;
        this.t = str;
        this.u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReceiptListScreenKt$ReceiptListScreenContent$2$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReceiptListScreenKt$ReceiptListScreenContent$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ReceiptListContract.ReceiptListAnalyticsHandler receiptListAnalyticsHandler = this.r;
        LazyPagingItems lazyPagingItems = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if ((lazyPagingItems.d().f3529a instanceof LoadState.Error) && !lazyPagingItems.c().isEmpty()) {
                receiptListAnalyticsHandler.M1();
                SnackbarDuration snackbarDuration = SnackbarDuration.f;
                this.p = 1;
                obj = this.s.a(this.t, this.u, snackbarDuration, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (((SnackbarResult) obj) == SnackbarResult.e) {
            lazyPagingItems.e();
            receiptListAnalyticsHandler.k2();
        }
        return Unit.f24250a;
    }
}
