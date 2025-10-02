package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$1$1", f = "PaymentScreen.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PaymentScreenKt$PaymentScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PaymentViewModel q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentScreenKt$PaymentScreen$1$1(PaymentViewModel paymentViewModel, Context context, SnackbarHostState snackbarHostState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = paymentViewModel;
        this.r = context;
        this.s = snackbarHostState;
        this.t = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentScreenKt$PaymentScreen$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentScreenKt$PaymentScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final PaymentViewModel paymentViewModel = this.q;
            Flow flow = paymentViewModel.n;
            final SnackbarHostState snackbarHostState = this.s;
            final MutableState mutableState = this.t;
            final Context context = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PaymentContract.Action action = (PaymentContract.Action) obj2;
                    boolean zC = Intrinsics.c(action, PaymentContract.Action.Dismiss.f10887a);
                    Unit unit = Unit.f24250a;
                    Context context2 = context;
                    if (zC) {
                        ContextExtKt.b(context2).finish();
                        return unit;
                    }
                    if (action instanceof PaymentContract.Action.OpenUrl) {
                        ContextExtKt.j(context, ((PaymentContract.Action.OpenUrl) action).f10890a, null, null, null, 62);
                        return unit;
                    }
                    if (action instanceof PaymentContract.Action.LaunchSnackBar) {
                        Object objC = SnackbarHostState.c(snackbarHostState, ((PaymentContract.Action.LaunchSnackBar) action).f10889a.getText(context2).toString(), null, null, continuation, 14);
                        if (objC == CoroutineSingletons.d) {
                            return objC;
                        }
                    } else {
                        boolean zC2 = Intrinsics.c(action, PaymentContract.Action.CvvFormSubmit.f10886a);
                        MutableState mutableState2 = mutableState;
                        if (zC2) {
                            WebView webView = (WebView) mutableState2.getD();
                            if (webView != null) {
                                webView.evaluateJavascript("SecurityCode.submit();", null);
                                return unit;
                            }
                            paymentViewModel.s6(null, null, "Form submit fail due to WebView not available");
                            return unit;
                        }
                        if (!Intrinsics.c(action, PaymentContract.Action.CvvFormReload.f10885a)) {
                            if (!Intrinsics.c(action, PaymentContract.Action.LaunchConfirmationPage.f10888a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i2 = ConfirmationActivity.A;
                            AppCompatActivity activity = ContextExtKt.b(context2);
                            Intrinsics.h(activity, "activity");
                            activity.startActivity(new Intent(activity, (Class<?>) ConfirmationActivity.class));
                            return unit;
                        }
                        WebView webView2 = (WebView) mutableState2.getD();
                        if (webView2 != null) {
                            webView2.reload();
                        }
                    }
                    return unit;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
