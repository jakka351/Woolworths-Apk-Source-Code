package au.com.woolworths.feature.shop.wpay.ui.wpay;

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
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$deleteLinkedCreditCard$2", f = "WPayForOrderViewModel.kt", l = {512}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$deleteLinkedCreditCard$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WPayForOrderViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$deleteLinkedCreditCard$2(WPayForOrderViewModel wPayForOrderViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = wPayForOrderViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$deleteLinkedCreditCard$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$deleteLinkedCreditCard$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        String str;
        String str2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        WPayForOrderViewModel wPayForOrderViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            UnlinkCreditCardInteractor unlinkCreditCardInteractor = wPayForOrderViewModel.f;
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
        MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
        BufferedChannel bufferedChannel = wPayForOrderViewModel.s;
        WPayAnalyticsTracker wPayAnalyticsTracker = wPayForOrderViewModel.p;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.d, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
        if (pageResult instanceof PageResult.Success) {
            Object obj2 = ((PageResult.Success) pageResult).f8285a;
            UnlinkCreditCardResponse unlinkCreditCardResponse = (UnlinkCreditCardResponse) obj2;
            if (unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.Success) {
                WPayForOrderViewModel.s6(wPayForOrderViewModel, null, 14);
            } else if (unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.ValidationFailure) {
                MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel.r;
                do {
                    value2 = mutableStateFlow2.getValue();
                    UnlinkCreditCardResponse.ValidationFailure validationFailure = (UnlinkCreditCardResponse.ValidationFailure) obj2;
                    str = validationFailure.b;
                    str2 = validationFailure.f8317a;
                    str3 = validationFailure.c;
                    wPayAnalyticsTracker.c(validationFailure.d);
                } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.d, null, null, null, null, null, null, null, false, null, null, new AlertDialogData.UnlinkCardFailure(str, str2, str3), null, 6142)));
            } else {
                if (!(unlinkCreditCardResponse instanceof UnlinkCreditCardResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                UnlinkCreditCardResponse.Failure failure = (UnlinkCreditCardResponse.Failure) obj2;
                wPayAnalyticsTracker.c(failure.b);
                bufferedChannel.k(new WPayForOrderContract.Action.LaunchSnackBar(new PlainText(failure.f8315a)));
            }
        } else if (pageResult instanceof PageResult.Fail) {
            Throwable th = ((PageResult.Fail) pageResult).f8284a;
            if (th instanceof NoConnectivityException) {
                wPayAnalyticsTracker.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).e.getD());
                bufferedChannel.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
            } else if (th instanceof ServerErrorException) {
                wPayAnalyticsTracker.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).f.getD());
                bufferedChannel.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.checkout_payment_delete_credit_card_fail_msg)));
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
