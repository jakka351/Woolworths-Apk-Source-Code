package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$1$1", f = "InstoreWifiScreen.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreWifiScreenKt$InstoreWifiScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreWifiViewModel q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreWifiScreenKt$InstoreWifiScreen$1$1(InstoreWifiViewModel instoreWifiViewModel, MutableState mutableState, Function1 function1, Function1 function12, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = instoreWifiViewModel;
        this.r = mutableState;
        this.s = function1;
        this.t = function12;
        this.u = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreWifiScreenKt$InstoreWifiScreen$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreWifiScreenKt$InstoreWifiScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.k;
            final Function1 function1 = this.t;
            final Function0 function0 = this.u;
            final MutableState mutableState = this.r;
            final Function1 function12 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt$InstoreWifiScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    InstoreWifiContract.Actions actions = (InstoreWifiContract.Actions) obj2;
                    if (Intrinsics.c(actions, InstoreWifiContract.Actions.LaunchLogin.f6529a)) {
                        mutableState.setValue(Boolean.TRUE);
                    } else if (actions instanceof InstoreWifiContract.Actions.OpenUrl) {
                        function12.invoke(null);
                    } else if (actions instanceof InstoreWifiContract.Actions.ShowFeedbackForm) {
                        function1.invoke(null);
                    } else {
                        if (!Intrinsics.c(actions, InstoreWifiContract.Actions.ShowJoinScreen.f6530a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function0.invoke();
                    }
                    return Unit.f24250a;
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
