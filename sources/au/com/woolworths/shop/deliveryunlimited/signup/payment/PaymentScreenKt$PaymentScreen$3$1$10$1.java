package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.supers.deliveryunlimited.SubscriptionConfirmationAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        WPayAnalyticsTracker wPayAnalyticsTracker = paymentViewModel.i;
        BufferedChannel bufferedChannel = paymentViewModel.m;
        if (paymentViewModel.j.isConnected()) {
            PaymentContract.ViewState viewState = (PaymentContract.ViewState) mutableStateFlow.getValue();
            PageResult pageResult = viewState.b;
            PageResult.Success success = pageResult instanceof PageResult.Success ? (PageResult.Success) pageResult : null;
            if (success != null) {
                AnalyticsData impressionAnalytics = ((DeliveryUnlimitedPaymentResponse) success.f8285a).getTerms().getImpressionAnalytics();
                if (impressionAnalytics != null) {
                    wPayAnalyticsTracker.d(impressionAnalytics);
                }
                if (viewState.e) {
                    paymentViewModel.t6();
                    bufferedChannel.k(PaymentContract.Action.CvvFormReload.f10885a);
                } else {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.f, null, null, null, false, null, null, null, null, 510)));
                    bufferedChannel.k(PaymentContract.Action.CvvFormSubmit.f10886a);
                }
            }
        } else {
            wPayAnalyticsTracker.f8369a.g(SubscriptionConfirmationAnalytics.Payment.Action.f);
            bufferedChannel.k(new PaymentContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
        }
        return Unit.f24250a;
    }
}
