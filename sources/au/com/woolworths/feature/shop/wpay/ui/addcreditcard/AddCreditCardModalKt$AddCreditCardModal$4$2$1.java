package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$2$1", f = "AddCreditCardModal.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddCreditCardModalKt$AddCreditCardModal$4$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AddCreditCardViewModel q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ SnackbarHostState s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ MutableState v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCreditCardModalKt$AddCreditCardModal$4$2$1(AddCreditCardViewModel addCreditCardViewModel, Function1 function1, SnackbarHostState snackbarHostState, String str, String str2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = addCreditCardViewModel;
        this.r = function1;
        this.s = snackbarHostState;
        this.t = str;
        this.u = str2;
        this.v = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddCreditCardModalKt$AddCreditCardModal$4$2$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddCreditCardModalKt$AddCreditCardModal$4$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.o;
            final String str = this.u;
            final MutableState mutableState = this.v;
            final Function1 function1 = this.r;
            final SnackbarHostState snackbarHostState = this.s;
            final String str2 = this.t;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    AddCreditCardContract.Action action = (AddCreditCardContract.Action) obj2;
                    boolean z = action instanceof AddCreditCardContract.Action.Success;
                    Function1 function12 = function1;
                    Unit unit = Unit.f24250a;
                    if (z) {
                        function12.invoke(((AddCreditCardContract.Action.Success) action).f8327a);
                        return unit;
                    }
                    if (action instanceof AddCreditCardContract.Action.SubmitForm) {
                        WebView webView = (WebView) mutableState.getD();
                        if (webView != null) {
                            webView.evaluateJavascript("CreditCardForm.submit();", null);
                            return unit;
                        }
                    } else {
                        if (Intrinsics.c(action, AddCreditCardContract.Action.Dismiss.f8323a)) {
                            function12.invoke(AddCreditCardResult.None.f8331a);
                            return unit;
                        }
                        if (Intrinsics.c(action, AddCreditCardContract.Action.SnackBarConnectionError.f8324a)) {
                            Object objC = SnackbarHostState.c(snackbarHostState, str2, null, null, continuation, 14);
                            if (objC == CoroutineSingletons.d) {
                                return objC;
                            }
                        } else {
                            if (!Intrinsics.c(action, AddCreditCardContract.Action.SnackBarServerError.f8325a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object objC2 = SnackbarHostState.c(snackbarHostState, str, null, null, continuation, 14);
                            if (objC2 == CoroutineSingletons.d) {
                                return objC2;
                            }
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
