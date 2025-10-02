package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.d) {
            case 0:
                PaymentViewModel paymentViewModel = (PaymentViewModel) this.e;
                AlertDialogData.DeleteCreditCard deleteCreditCard = (AlertDialogData.DeleteCreditCard) ((AlertDialogData) this.f);
                paymentViewModel.getClass();
                Intrinsics.h(deleteCreditCard, "deleteCreditCard");
                paymentViewModel.i.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.e).d.getD());
                MutableStateFlow mutableStateFlow = paymentViewModel.k;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, null, false, null, null, null, null, 447)));
                String str = deleteCreditCard.f8352a;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, PaymentContract.ViewState.a((PaymentContract.ViewState) value2, LoadingState.e, null, null, null, false, null, null, null, null, 510)));
                BuildersKt.c(ViewModelKt.a(paymentViewModel), null, null, new PaymentViewModel$deleteLinkedCreditCard$2(paymentViewModel, str, null), 3);
                break;
            default:
                ((Function1) this.e).invoke((TermsBottomSheetData.Terms) this.f);
                break;
        }
        return Unit.f24250a;
    }
}
