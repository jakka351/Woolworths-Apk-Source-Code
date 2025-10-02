package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PlaceOrderButton;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.woolworths.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class WPayForOrderScreenKt$WPayForOrderScreen$3$2$1 extends FunctionReferenceImpl implements Function1<PlaceOrderButton, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((PlaceOrderButton) obj);
        return Unit.f24250a;
    }

    public final void m(PlaceOrderButton p0) {
        Object value;
        PaymentInstrumentsResponse.Success successB;
        List paymentMethods;
        Object value2;
        Intrinsics.h(p0, "p0");
        WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
        BufferedChannel bufferedChannel = wPayForOrderViewModel.s;
        WPayAnalyticsTracker wPayAnalyticsTracker = wPayForOrderViewModel.p;
        if (!wPayForOrderViewModel.o.isConnected()) {
            wPayAnalyticsTracker.f8369a.g(PaymentAnalytics.Payment.Action.r);
            bufferedChannel.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
            return;
        }
        if (!(p0 instanceof PlaceOrderButton.Default)) {
            if (!(p0 instanceof PlaceOrderButton.GooglePay)) {
                throw new NoWhenBranchMatchedException();
            }
            wPayAnalyticsTracker.c(((PlaceOrderButton.GooglePay) p0).f8313a);
            GooglePayUiState googlePayUiState = ((WPayForOrderContract.ViewState) mutableStateFlow.getValue()).k;
            GooglePayUiState.Available available = googlePayUiState instanceof GooglePayUiState.Available ? (GooglePayUiState.Available) googlePayUiState : null;
            if (available == null) {
                return;
            }
            BuildersKt.c(ViewModelKt.a(wPayForOrderViewModel), null, null, new WPayForOrderViewModel$placeOrderGooglePay$1(wPayForOrderViewModel, available, null), 3);
            return;
        }
        wPayAnalyticsTracker.c(((PlaceOrderButton.Default) p0).c);
        WPayForOrderContract.ViewState viewState = (WPayForOrderContract.ViewState) mutableStateFlow.getValue();
        if (viewState.i) {
            wPayForOrderViewModel.v6();
            bufferedChannel.k(WPayForOrderContract.Action.CvvFormReload.f8370a);
            return;
        }
        PaymentInstrumentsResponse paymentInstrumentsResponse = (PaymentInstrumentsResponse) viewState.c.c();
        if (paymentInstrumentsResponse != null && (successB = paymentInstrumentsResponse.b()) != null && (paymentMethods = successB.b.getPaymentMethods()) != null) {
            List<PaymentMethodItem> list = paymentMethods;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PaymentMethodItem paymentMethodItem : list) {
                    if ((paymentMethodItem instanceof PaymentMethodItem.CreditCard.Linked) && paymentMethodItem.isActive()) {
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.f, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                        bufferedChannel.k(WPayForOrderContract.Action.CvvFormSubmit.f8371a);
                        return;
                    }
                }
            }
        }
        try {
            wPayForOrderViewModel.x6(wPayForOrderViewModel.t6());
        } catch (IllegalStateException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e, null, 28);
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, new PageResult.Fail(e), null, null, null, null, null, false, null, null, null, null, 8187)));
        }
    }
}
