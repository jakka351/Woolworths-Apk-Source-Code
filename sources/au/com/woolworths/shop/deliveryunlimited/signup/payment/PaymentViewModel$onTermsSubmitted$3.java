package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.supers.deliveryunlimited.SubscriptionConfirmationAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedSubscriptionWpayResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel$onTermsSubmitted$3", f = "PaymentViewModel.kt", l = {368}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class PaymentViewModel$onTermsSubmitted$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PaymentViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentViewModel$onTermsSubmitted$3(PaymentViewModel paymentViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = paymentViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentViewModel$onTermsSubmitted$3(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentViewModel$onTermsSubmitted$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        PaymentViewModel paymentViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DeliveryUnlimitedPaymentInteractor deliveryUnlimitedPaymentInteractor = paymentViewModel.f;
            String str = paymentViewModel.e;
            this.p = 1;
            objB = deliveryUnlimitedPaymentInteractor.b(this.r, str, this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objB = obj;
        }
        PageResult pageResult = (PageResult) objB;
        if (pageResult instanceof PageResult.Success) {
            DeliveryUnlimitedSubscriptionWpayResponse deliveryUnlimitedSubscriptionWpayResponse = (DeliveryUnlimitedSubscriptionWpayResponse) ((PageResult.Success) pageResult).f8285a;
            if (deliveryUnlimitedSubscriptionWpayResponse.getSuccess()) {
                paymentViewModel.m.k(PaymentContract.Action.LaunchConfirmationPage.f10888a);
            } else {
                AnalyticsData errorAnalytics = deliveryUnlimitedSubscriptionWpayResponse.getErrorAnalytics();
                if (errorAnalytics != null) {
                    paymentViewModel.i.d(errorAnalytics);
                }
                MutableStateFlow mutableStateFlow = paymentViewModel.k;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value2, PaymentContract.ViewState.a((PaymentContract.ViewState) value2, null, null, null, null, false, null, null, null, deliveryUnlimitedSubscriptionWpayResponse.getMessage(), 255)));
            }
        } else if (pageResult instanceof PageResult.Fail) {
            if (((PageResult.Fail) pageResult).f8284a instanceof NoConnectivityException) {
                paymentViewModel.i.f8369a.g(SubscriptionConfirmationAnalytics.Payment.Action.f);
                paymentViewModel.m.k(new PaymentContract.Action.LaunchSnackBar(new ResText(R.string.delivery_unlimited_confirm_subscription_network_fail_msg)));
            } else {
                paymentViewModel.i.f8369a.g(SubscriptionConfirmationAnalytics.Payment.Action.g);
                paymentViewModel.m.k(new PaymentContract.Action.LaunchSnackBar(new ResText(R.string.delivery_unlimited_confirm_subscription_server_fail_msg)));
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow mutableStateFlow2 = paymentViewModel.k;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.d, null, null, null, false, null, null, null, null, 510)));
        return Unit.f24250a;
    }
}
