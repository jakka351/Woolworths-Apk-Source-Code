package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.base.shopapp.modules.button.ButtonAction;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TermsBottomSheetKt$TermsBottomSheet$3$1 extends FunctionReferenceImpl implements Function1<TermsBottomSheetData.Terms, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((TermsBottomSheetData.Terms) obj);
        return Unit.f24250a;
    }

    public final void m(TermsBottomSheetData.Terms p0) {
        Object value;
        AnalyticsData analytics;
        Intrinsics.h(p0, "p0");
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        ButtonAction buttonAction = p0.f10894a.c.getButtonAction();
        if (buttonAction != null && (analytics = buttonAction.getAnalytics()) != null) {
            paymentViewModel.i.d(analytics);
        }
        String str = p0.b;
        if (str == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Error encountered when tried to submit terms: checkoutSessionId is null", null, 12);
            return;
        }
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.e, null, null, null, false, null, null, null, null, 510)));
        paymentViewModel.u6();
        BuildersKt.c(ViewModelKt.a(paymentViewModel), null, null, new PaymentViewModel$onTermsSubmitted$3(paymentViewModel, str, null), 3);
    }
}
