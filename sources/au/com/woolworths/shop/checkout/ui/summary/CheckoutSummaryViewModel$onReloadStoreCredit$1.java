package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$onReloadStoreCredit$1", f = "CheckoutSummaryViewModel.kt", l = {89}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$onReloadStoreCredit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutSummaryViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$onReloadStoreCredit$1(CheckoutSummaryViewModel checkoutSummaryViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutSummaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$onReloadStoreCredit$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$onReloadStoreCredit$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CheckoutSummaryViewModel checkoutSummaryViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                this.p = 1;
                obj = checkoutSummaryInteractor.f10823a.n(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            checkoutSummaryViewModel.y6((Checkout) obj, true);
        } catch (Exception e) {
            MutableStateFlow mutableStateFlow = checkoutSummaryViewModel.j;
            do {
                value = mutableStateFlow.getValue();
                viewState = (CheckoutContentContract.ViewState) value;
                modalBottomSheetDataA = viewState.g;
                if (modalBottomSheetDataA == null) {
                    modalBottomSheetDataA = null;
                } else if (modalBottomSheetDataA instanceof ModalBottomSheetData.StoreCredit) {
                    modalBottomSheetDataA = ModalBottomSheetData.StoreCredit.a((ModalBottomSheetData.StoreCredit) modalBottomSheetDataA, e instanceof NoConnectivityException ? StoreCreditContent.ConnectionError.f10764a : StoreCreditContent.ServerError.f10766a, 2);
                }
            } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataA, 191)));
        }
        return Unit.f24250a;
    }
}
