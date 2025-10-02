package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.supers.deliveryunlimited.SubscriptionConfirmationAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
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
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel$fetchDeliveryUnlimitedPayment$2", f = "PaymentViewModel.kt", l = {85}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class PaymentViewModel$fetchDeliveryUnlimitedPayment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PaymentViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ ErrorState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentViewModel$fetchDeliveryUnlimitedPayment$2(PaymentViewModel paymentViewModel, String str, ErrorState errorState, Continuation continuation) {
        super(2, continuation);
        this.q = paymentViewModel;
        this.r = str;
        this.s = errorState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentViewModel$fetchDeliveryUnlimitedPayment$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentViewModel$fetchDeliveryUnlimitedPayment$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        PaymentContract.ViewState viewState;
        Integer numB;
        List analytics;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        String str = this.r;
        PaymentViewModel paymentViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DeliveryUnlimitedPaymentInteractor deliveryUnlimitedPaymentInteractor = paymentViewModel.f;
            String str2 = paymentViewModel.e;
            this.p = 1;
            objA = deliveryUnlimitedPaymentInteractor.a(str2, str, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objA = obj;
        }
        PageResult pageResult = (PageResult) objA;
        WPayAnalyticsTracker wPayAnalyticsTracker = paymentViewModel.i;
        DeliveryUnlimitedPaymentResponse deliveryUnlimitedPaymentResponse = (DeliveryUnlimitedPaymentResponse) pageResult.c();
        if (deliveryUnlimitedPaymentResponse != null && (analytics = deliveryUnlimitedPaymentResponse.getAnalytics()) != null) {
            Iterator it = analytics.iterator();
            while (it.hasNext()) {
                wPayAnalyticsTracker.d((AnalyticsData) it.next());
            }
        }
        Throwable thB = pageResult.b();
        if (thB != null) {
            if (thB instanceof NoConnectivityException) {
                wPayAnalyticsTracker.f8369a.g(SubscriptionConfirmationAnalytics.Payment.Action.d);
            } else if (thB instanceof ServerErrorException) {
                wPayAnalyticsTracker.f8369a.g(SubscriptionConfirmationAnalytics.Payment.Action.e);
            }
        }
        Throwable thB2 = pageResult.b();
        ErrorState errorState = this.s;
        if (thB2 != null && (numB = errorState.b()) != null) {
            int iIntValue = numB.intValue();
            if (!(thB2 instanceof ServerErrorException)) {
                iIntValue = R.string.connection_error_msg;
            }
            paymentViewModel.m.k(new PaymentContract.Action.LaunchSnackBar(new ResText(iIntValue)));
        }
        if (pageResult.a()) {
            paymentViewModel.o = str;
        }
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        do {
            value = mutableStateFlow.getValue();
            viewState = (PaymentContract.ViewState) value;
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a(viewState, LoadingState.d, (pageResult.a() || errorState.a()) ? pageResult : viewState.b, pageResult.a() ? str : paymentViewModel.o, null, false, null, null, null, null, 456)));
        return Unit.f24250a;
    }
}
