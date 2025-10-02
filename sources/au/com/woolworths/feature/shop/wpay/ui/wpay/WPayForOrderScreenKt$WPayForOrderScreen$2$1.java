package au.com.woolworths.feature.shop.wpay.ui.wpay;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt$WPayForOrderScreen$2$1", f = "WPayForOrderScreen.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WPayForOrderScreenKt$WPayForOrderScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WPayForOrderViewModel q;
    public final /* synthetic */ SnackbarHostState r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ MutableState v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderScreenKt$WPayForOrderScreen$2$1(WPayForOrderViewModel wPayForOrderViewModel, SnackbarHostState snackbarHostState, Context context, Function0 function0, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = wPayForOrderViewModel;
        this.r = snackbarHostState;
        this.s = context;
        this.t = function0;
        this.u = function1;
        this.v = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderScreenKt$WPayForOrderScreen$2$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderScreenKt$WPayForOrderScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final WPayForOrderViewModel wPayForOrderViewModel = this.q;
            Flow flow = wPayForOrderViewModel.u;
            final Function1 function1 = this.u;
            final MutableState mutableState = this.v;
            final SnackbarHostState snackbarHostState = this.r;
            final Context context = this.s;
            final Function0 function0 = this.t;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderScreenKt$WPayForOrderScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WPayForOrderContract.Action action = (WPayForOrderContract.Action) obj2;
                    boolean z = action instanceof WPayForOrderContract.Action.LaunchSnackBar;
                    Unit unit = Unit.f24250a;
                    Context context2 = context;
                    if (z) {
                        Object objC = SnackbarHostState.c(snackbarHostState, ((WPayForOrderContract.Action.LaunchSnackBar) action).f8376a.getText(context2).toString(), null, null, continuation, 14);
                        if (objC == CoroutineSingletons.d) {
                            return objC;
                        }
                    } else {
                        if (action instanceof WPayForOrderContract.Action.LaunchCustomTabs) {
                            WPayForOrderContract.Action.LaunchCustomTabs launchCustomTabs = (WPayForOrderContract.Action.LaunchCustomTabs) action;
                            ContextExtKt.j(context2, launchCustomTabs.f8373a, launchCustomTabs.b, new Pair(new Integer(R.anim.slide_up), new Integer(R.anim.none)), new Pair(new Integer(R.anim.none), new Integer(R.anim.slide_down)), 16);
                            return unit;
                        }
                        boolean zC = Intrinsics.c(action, WPayForOrderContract.Action.CvvFormSubmit.f8371a);
                        MutableState mutableState2 = mutableState;
                        if (zC) {
                            WebView webView = (WebView) mutableState2.getD();
                            if (webView != null) {
                                webView.evaluateJavascript("SecurityCode.submit();", null);
                                return unit;
                            }
                            wPayForOrderViewModel.u6(null, null, "Form submit fail due to WebView not available");
                            return unit;
                        }
                        if (!Intrinsics.c(action, WPayForOrderContract.Action.CvvFormReload.f8370a)) {
                            if (action instanceof WPayForOrderContract.Action.LaunchOrderConfirmation) {
                                Intent intentPutExtra = ActivityNavigatorKt.a(Activities.OrderConfirmation.f4495a, ApplicationType.e).putExtra("orderId", ((WPayForOrderContract.Action.LaunchOrderConfirmation) action).f8375a);
                                Intrinsics.g(intentPutExtra, "putExtra(...)");
                                context2.startActivity(intentPutExtra);
                                return unit;
                            }
                            if (Intrinsics.c(action, WPayForOrderContract.Action.LaunchCheckoutDetails.f8372a)) {
                                function0.invoke();
                                return unit;
                            }
                            if (!(action instanceof WPayForOrderContract.Action.LaunchGooglePay)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            function1.invoke(((WPayForOrderContract.Action.LaunchGooglePay) action).f8374a);
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
