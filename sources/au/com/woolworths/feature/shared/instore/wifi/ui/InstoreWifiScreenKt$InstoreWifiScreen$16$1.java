package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$16$1", f = "InstoreWifiScreen.kt", l = {276}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiScreenKt$InstoreWifiScreen$16$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreWifiContract.ViewState q;
    public final /* synthetic */ ScaffoldState r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiScreenKt$InstoreWifiScreen$16$1(InstoreWifiContract.ViewState viewState, ScaffoldState scaffoldState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = viewState;
        this.r = scaffoldState;
        this.s = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreWifiScreenKt$InstoreWifiScreen$16$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreWifiScreenKt$InstoreWifiScreen$16$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InstoreWifiScreenKt$InstoreWifiScreen$16$1 instoreWifiScreenKt$InstoreWifiScreen$16$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            String str = this.q.e;
            if (str == null) {
                return Unit.f24250a;
            }
            SnackbarHostState snackbarHostState = this.r.f1319a;
            SnackbarDuration snackbarDuration = SnackbarDuration.d;
            this.p = 1;
            instoreWifiScreenKt$InstoreWifiScreen$16$1 = this;
            if (SnackbarHostState.b(snackbarHostState, str, null, snackbarDuration, instoreWifiScreenKt$InstoreWifiScreen$16$1, 2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            instoreWifiScreenKt$InstoreWifiScreen$16$1 = this;
        }
        instoreWifiScreenKt$InstoreWifiScreen$16$1.s.invoke();
        return Unit.f24250a;
    }
}
