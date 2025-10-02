package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$applyPromoCodeError$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCode;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import com.woolworths.R;
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
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$applyPromoCode$1", f = "CheckoutSummaryViewModel.kt", l = {130}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$applyPromoCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutSummaryViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$applyPromoCode$1(CheckoutSummaryViewModel checkoutSummaryViewModel, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutSummaryViewModel;
        this.r = str;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$applyPromoCode$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$applyPromoCode$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataA;
        Object value2;
        CheckoutContentContract.ViewState viewState2;
        Checkout checkoutA;
        ModalBottomSheetData modalBottomSheetDataA2;
        Object objC;
        CheckoutSummaryViewModel checkoutSummaryViewModel = this.q;
        MutableStateFlow mutableStateFlow = checkoutSummaryViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value2 = mutableStateFlow.getValue();
                    viewState2 = (CheckoutContentContract.ViewState) value2;
                    Checkout checkout = viewState2.d;
                    checkoutA = checkout != null ? Checkout.a(checkout, null, 1015) : null;
                    modalBottomSheetDataA2 = viewState2.g;
                    if (modalBottomSheetDataA2 == null) {
                        modalBottomSheetDataA2 = null;
                    } else if (modalBottomSheetDataA2 instanceof ModalBottomSheetData.PromoCode) {
                        modalBottomSheetDataA2 = ModalBottomSheetData.PromoCode.a((ModalBottomSheetData.PromoCode) modalBottomSheetDataA2, null, null, null, null, null, null, 35);
                    }
                } while (!mutableStateFlow.d(value2, CheckoutContentContract.ViewState.a(viewState2, true, checkoutA, modalBottomSheetDataA2, 166)));
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                boolean z = this.s;
                this.p = 1;
                objC = checkoutSummaryInteractor.f10823a.c(z, str, this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objC = obj;
            }
            ApplyCheckoutPromoCode applyCheckoutPromoCode = (ApplyCheckoutPromoCode) objC;
            Checkout checkout2 = applyCheckoutPromoCode.b;
            if (checkout2 != null) {
                checkoutSummaryViewModel.y6(checkout2, true);
            }
            CheckoutSummaryViewModel.I6(checkoutSummaryViewModel, applyCheckoutPromoCode);
        } catch (Exception e) {
            AnalyticsManager analyticsManager = checkoutSummaryViewModel.p;
            CheckoutAnalytics.Summary.Action.d.getClass();
            analyticsManager.g(new CheckoutAnalytics$Summary$Action$Companion$applyPromoCodeError$1(str));
            do {
                value = mutableStateFlow.getValue();
                viewState = (CheckoutContentContract.ViewState) value;
                modalBottomSheetDataA = viewState.g;
                if (modalBottomSheetDataA == null) {
                    modalBottomSheetDataA = null;
                } else if (modalBottomSheetDataA instanceof ModalBottomSheetData.PromoCode) {
                    modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a((ModalBottomSheetData.PromoCode) modalBottomSheetDataA, null, null, new ResText(e instanceof NoConnectivityException ? R.string.error_no_network : R.string.checkout_promo_code_apply_error_server), null, null, null, 59);
                }
            } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataA, 190)));
        }
        return Unit.f24250a;
    }
}
