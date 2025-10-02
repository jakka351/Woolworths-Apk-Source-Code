package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.analytics.supers.payments.PaymentAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.LinkPayPalResponse;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$onConfirmLinkPayPal$1", f = "WPayForOrderViewModel.kt", l = {840}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$onConfirmLinkPayPal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WPayForOrderViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$onConfirmLinkPayPal$1(WPayForOrderViewModel wPayForOrderViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = wPayForOrderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$onConfirmLinkPayPal$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$onConfirmLinkPayPal$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        WPayForOrderContract.ViewState viewState;
        LoadingState loadingState;
        String str;
        LinkPayPalResponse linkPayPalResponse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        WPayForOrderViewModel wPayForOrderViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 6142)));
            GetLinkPayPalInteractor getLinkPayPalInteractor = wPayForOrderViewModel.g;
            this.p = 1;
            objA = getLinkPayPalInteractor.a(this);
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
        boolean z = pageResult instanceof PageResult.Success;
        if (z) {
            BufferedChannel bufferedChannel = wPayForOrderViewModel.s;
            LinkPayPalResponse linkPayPalResponse2 = (LinkPayPalResponse) ((PageResult.Success) pageResult).f8285a;
            bufferedChannel.k(new WPayForOrderContract.Action.LaunchCustomTabs(linkPayPalResponse2.b, linkPayPalResponse2.d));
        } else if (pageResult instanceof PageResult.Fail) {
            if (((PageResult.Fail) pageResult).f8284a instanceof NoConnectivityException) {
                wPayForOrderViewModel.p.f8369a.g(PaymentAnalytics.Payment.Action.j);
                wPayForOrderViewModel.s.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.connection_error_msg)));
            } else {
                wPayForOrderViewModel.p.f8369a.g(PaymentAnalytics.Payment.Action.k);
                wPayForOrderViewModel.s.k(new WPayForOrderContract.Action.LaunchSnackBar(new ResText(R.string.link_paypal_server_error_message)));
            }
        } else if (!Intrinsics.c(pageResult, PageResult.Uninitialized.f8286a)) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow mutableStateFlow2 = wPayForOrderViewModel.r;
        do {
            value2 = mutableStateFlow2.getValue();
            viewState = (WPayForOrderContract.ViewState) value2;
            loadingState = LoadingState.d;
            str = null;
            PageResult.Success success = z ? (PageResult.Success) pageResult : null;
            if (success != null && (linkPayPalResponse = (LinkPayPalResponse) success.f8285a) != null) {
                str = linkPayPalResponse.f8299a;
            }
        } while (!mutableStateFlow2.d(value2, WPayForOrderContract.ViewState.a(viewState, loadingState, null, null, null, null, null, null, null, false, null, null, null, str, 4094)));
        return Unit.f24250a;
    }
}
