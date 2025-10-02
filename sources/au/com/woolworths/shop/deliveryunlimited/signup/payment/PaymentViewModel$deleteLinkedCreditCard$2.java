package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
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
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel$deleteLinkedCreditCard$2", f = "PaymentViewModel.kt", l = {438}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class PaymentViewModel$deleteLinkedCreditCard$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PaymentViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentViewModel$deleteLinkedCreditCard$2(PaymentViewModel paymentViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = paymentViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentViewModel$deleteLinkedCreditCard$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentViewModel$deleteLinkedCreditCard$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        PaymentViewModel paymentViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            UnlinkCreditCardInteractor unlinkCreditCardInteractor = paymentViewModel.g;
            this.p = 1;
            objA = unlinkCreditCardInteractor.a(this.r, this);
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
        MutableStateFlow mutableStateFlow = paymentViewModel.k;
        BufferedChannel bufferedChannel = paymentViewModel.m;
        WPayAnalyticsTracker wPayAnalyticsTracker = paymentViewModel.i;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.d, null, null, null, false, null, null, null, null, 510)));
        if (pageResult instanceof PageResult.Success) {
            UnlinkCreditCardResponse unlinkCreditCardResponse = (UnlinkCreditCardResponse) ((PageResult.Success) pageResult).f8285a;
            if (unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.Success) {
                PaymentViewModel.q6(paymentViewModel, 6);
            } else if (unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.ValidationFailure) {
                UnlinkCreditCardResponse.ValidationFailure validationFailure = (UnlinkCreditCardResponse.ValidationFailure) unlinkCreditCardResponse;
                String str = validationFailure.b;
                String str2 = validationFailure.f8317a;
                wPayAnalyticsTracker.d(validationFailure.d);
                MutableStateFlow mutableStateFlow2 = paymentViewModel.k;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.d(value2, PaymentContract.ViewState.a((PaymentContract.ViewState) value2, null, null, null, null, false, null, new AlertDialogData.ValidationFailure(str, str2), null, null, 447)));
            } else {
                if (!(unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                UnlinkCreditCardResponse.Failure failure = (UnlinkCreditCardResponse.Failure) unlinkCreditCardResponse;
                wPayAnalyticsTracker.d(failure.b);
                bufferedChannel.k(new PaymentContract.Action.LaunchSnackBar(new PlainText(failure.f8315a)));
            }
        } else if (pageResult instanceof PageResult.Fail) {
            Throwable th = ((PageResult.Fail) pageResult).f8284a;
            if (th instanceof NoConnectivityException) {
                wPayAnalyticsTracker.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.e).e.getD());
                bufferedChannel.k(new PaymentContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
            } else if (th instanceof ServerErrorException) {
                wPayAnalyticsTracker.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.e).f.getD());
                bufferedChannel.k(new PaymentContract.Action.LaunchSnackBar(new ResText(R.string.checkout_payment_delete_credit_card_fail_msg)));
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
