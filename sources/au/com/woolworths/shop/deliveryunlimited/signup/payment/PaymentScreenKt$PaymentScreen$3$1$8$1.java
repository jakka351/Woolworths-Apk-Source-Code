package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.feature.shop.wpay.domain.model.CreditCardFormWebEvent;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModelKt;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$8$1 extends FunctionReferenceImpl implements Function2<String, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Exception exc;
        Object value3;
        Object value4;
        CreditCardFormWebEvent.ValidationError validationError;
        Object obj3;
        String amountValue;
        PaymentMethodSection paymentMethodSection;
        List paymentMethods;
        Object next;
        Object value5;
        String p0 = (String) obj;
        ((Number) obj2).intValue();
        Intrinsics.h(p0, "p0");
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.d, null, null, null, false, null, null, null, null, 510)));
        CreditCardFormWebEvent creditCardFormWebEventA = paymentViewModel.h.a(p0);
        if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Success) {
            PageResult pageResult = ((PaymentContract.ViewState) paymentViewModel.l.getValue()).b;
            PageResult.Success success = pageResult instanceof PageResult.Success ? (PageResult.Success) pageResult : null;
            if (success != null) {
                do {
                    value5 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value5, PaymentContract.ViewState.a((PaymentContract.ViewState) value5, null, null, null, null, false, null, null, new TermsBottomSheetData.Terms(ConfirmSubscriptionTermsUiModelKt.a(((DeliveryUnlimitedPaymentResponse) success.f8285a).getTerms()), ((CreditCardFormWebEvent.Success) creditCardFormWebEventA).getCheckoutSessionId()), null, 383)));
            }
        } else if (!(creditCardFormWebEventA instanceof CreditCardFormWebEvent.Fail)) {
            if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.ValidationError) {
                do {
                    value4 = mutableStateFlow.getValue();
                    validationError = (CreditCardFormWebEvent.ValidationError) creditCardFormWebEventA;
                } while (!mutableStateFlow.d(value4, PaymentContract.ViewState.a((PaymentContract.ViewState) value4, null, null, null, null, false, validationError.getMessage(), null, null, null, 479)));
                String message = validationError.getMessage();
                if (message != null) {
                    DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse = (DeliveryUnlimitedPaymentResponse) ((PaymentContract.ViewState) mutableStateFlow.getValue()).b.c();
                    if (deliveryUnlimitedPaymentResponse == null || (paymentMethodSection = deliveryUnlimitedPaymentResponse.getPaymentMethodSection()) == null || (paymentMethods = paymentMethodSection.getPaymentMethods()) == null) {
                        obj3 = null;
                    } else {
                        Iterator it = paymentMethods.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            PaymentMethodItem paymentMethodItem = (PaymentMethodItem) next;
                            if ((paymentMethodItem instanceof PaymentMethodItem.CreditCard.Linked) && Intrinsics.c(((PaymentMethodItem.CreditCard.Linked) paymentMethodItem).getId(), paymentViewModel.o)) {
                                break;
                            }
                        }
                        obj3 = (PaymentMethodItem) next;
                    }
                    PaymentMethodItem.CreditCard.Linked linked = obj3 instanceof PaymentMethodItem.CreditCard.Linked ? (PaymentMethodItem.CreditCard.Linked) obj3 : null;
                    String strQ = (linked == null || (amountValue = linked.getAmountValue()) == null) ? "0.0" : StringsKt.Q(amountValue, "$", "", false);
                    WPayAnalyticsTracker wPayAnalyticsTracker = paymentViewModel.i;
                    PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.d;
                    wPayAnalyticsTracker.b(strQ, message);
                }
            } else if (creditCardFormWebEventA.equals(CreditCardFormWebEvent.FormChanged.f8280a)) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, PaymentContract.ViewState.a((PaymentContract.ViewState) value3, null, null, null, null, false, null, null, null, null, 479)));
            } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Invalid) {
                do {
                    value2 = mutableStateFlow.getValue();
                    exc = ((CreditCardFormWebEvent.Invalid) creditCardFormWebEventA).f8281a;
                } while (!mutableStateFlow.d(value2, PaymentContract.ViewState.a((PaymentContract.ViewState) value2, null, new PageResult.Fail(exc), null, null, false, null, null, null, null, 509)));
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), exc, null, 12);
            } else if (!creditCardFormWebEventA.equals(CreditCardFormWebEvent.Unknown.f8282a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f24250a;
    }
}
