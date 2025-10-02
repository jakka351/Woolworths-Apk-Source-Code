package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.UnlinkPayPalResponse;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$onConfirmDeletePayPal$1", f = "WPayForOrderViewModel.kt", l = {785}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$onConfirmDeletePayPal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WPayForOrderViewModel q;
    public final /* synthetic */ AlertDialogData.DeletePayPal r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$onConfirmDeletePayPal$1(WPayForOrderViewModel wPayForOrderViewModel, AlertDialogData.DeletePayPal deletePayPal, Continuation continuation) {
        super(2, continuation);
        this.q = wPayForOrderViewModel;
        this.r = deletePayPal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$onConfirmDeletePayPal$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$onConfirmDeletePayPal$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        WPayForOrderViewModel wPayForOrderViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 6142)));
            UnlinkPayPalInteractor unlinkPayPalInteractor = wPayForOrderViewModel.i;
            String str = this.r.f8354a;
            this.p = 1;
            objA = unlinkPayPalInteractor.a(str, this);
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
        if (pageResult instanceof PageResult.Success) {
            UnlinkPayPalResponse unlinkPayPalResponse = (UnlinkPayPalResponse) ((PageResult.Success) pageResult).f8285a;
            if (unlinkPayPalResponse.f8319a) {
                LoadingState loadingState = LoadingState.d;
                WPayForOrderViewModel.s6(wPayForOrderViewModel, null, 14);
            } else {
                MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel.r;
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.d(value3, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value3, LoadingState.d, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
                BufferedChannel bufferedChannel = wPayForOrderViewModel.s;
                String str2 = unlinkPayPalResponse.b;
                bufferedChannel.k(new WPayForOrderContract.Action.LaunchSnackBar(str2 != null ? new PlainText(str2) : new ResText(R.string.checkout_payment_delete_paypal_fail_msg)));
            }
        } else if (pageResult instanceof PageResult.Fail) {
            MutableStateFlow mutableStateFlow3 = wPayForOrderViewModel.r;
            BufferedChannel bufferedChannel2 = wPayForOrderViewModel.s;
            WPayAnalyticsTracker wPayAnalyticsTracker = wPayForOrderViewModel.p;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.d(value2, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value2, LoadingState.d, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
            Throwable th = ((PageResult.Fail) pageResult).f8284a;
            if (th instanceof NoConnectivityException) {
                wPayAnalyticsTracker.f8369a.g(PaymentAnalytics.Payment.Action.n);
                bufferedChannel2.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
            } else if (th instanceof ServerErrorException) {
                wPayAnalyticsTracker.f8369a.g(PaymentAnalytics.Payment.Action.o);
                bufferedChannel2.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.checkout_payment_delete_paypal_fail_msg)));
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
