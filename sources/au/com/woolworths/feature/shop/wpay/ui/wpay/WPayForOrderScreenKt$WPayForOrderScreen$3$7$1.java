package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.domain.model.CreditCardFormWebEvent;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class WPayForOrderScreenKt$WPayForOrderScreen$3$7$1 extends FunctionReferenceImpl implements Function2<String, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        LoadingState loadingState;
        Exception exc;
        Object value2;
        Object value3;
        CreditCardFormWebEvent.ValidationError validationError;
        PaymentInstrumentsResponse.Success successB;
        String str;
        Object value4;
        String p0 = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.h(p0, "p0");
        WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
        CreditCardFormWebEvent creditCardFormWebEventA = wPayForOrderViewModel.m.a(p0);
        if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Success) {
            wPayForOrderViewModel.x6(new InputPayment.CreditCard(((CreditCardFormWebEvent.Success) creditCardFormWebEventA).getCheckoutSessionId(), iIntValue));
        } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Fail) {
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value4, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value4, LoadingState.d, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
        } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.ValidationError) {
            do {
                value3 = mutableStateFlow.getValue();
                validationError = (CreditCardFormWebEvent.ValidationError) creditCardFormWebEventA;
            } while (!mutableStateFlow.d(value3, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value3, LoadingState.d, null, null, null, null, null, null, null, false, validationError.getMessage(), null, null, null, 7678)));
            PaymentInstrumentsResponse paymentInstrumentsResponse = (PaymentInstrumentsResponse) ((WPayForOrderContract.ViewState) mutableStateFlow.getValue()).c.c();
            String strQ = (paymentInstrumentsResponse == null || (successB = paymentInstrumentsResponse.b()) == null || (str = successB.c.b) == null) ? "0.0" : StringsKt.Q(str, "$", "", false);
            WPayAnalyticsTracker wPayAnalyticsTracker = wPayForOrderViewModel.p;
            PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.d;
            String message = validationError.getMessage();
            wPayAnalyticsTracker.b(strQ, message != null ? message : "");
        } else if (creditCardFormWebEventA.equals(CreditCardFormWebEvent.FormChanged.f8280a)) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, null, null, null, null, null, null, null, null, false, null, null, null, null, 7679)));
        } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Invalid) {
            do {
                value = mutableStateFlow.getValue();
                loadingState = LoadingState.d;
                exc = ((CreditCardFormWebEvent.Invalid) creditCardFormWebEventA).f8281a;
            } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, loadingState, null, new PageResult.Fail(exc), null, null, null, null, null, false, null, null, null, null, 8186)));
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), exc, null, 12);
        } else if (!creditCardFormWebEventA.equals(CreditCardFormWebEvent.Unknown.f8282a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
