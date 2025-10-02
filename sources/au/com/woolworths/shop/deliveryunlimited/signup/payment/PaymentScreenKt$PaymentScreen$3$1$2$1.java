package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$2$1 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        String p0 = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.h(p0, "p0");
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        paymentViewModel.i.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.e).c.getD());
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, null, false, null, new AlertDialogData.DeleteCreditCard(p0, zBooleanValue), null, null, 447)));
        return Unit.f24250a;
    }
}
