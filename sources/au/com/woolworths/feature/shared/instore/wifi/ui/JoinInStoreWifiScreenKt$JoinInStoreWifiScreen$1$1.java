package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1", f = "JoinInStoreWifiScreen.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ JoinWifiViewModel q;
    public final /* synthetic */ JoinWifiActionHandler r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1(JoinWifiViewModel joinWifiViewModel, JoinWifiActionHandler joinWifiActionHandler, Continuation continuation) {
        super(2, continuation);
        this.q = joinWifiViewModel;
        this.r = joinWifiActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.l;
            final JoinWifiActionHandler joinWifiActionHandler = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.JoinInStoreWifiScreenKt$JoinInStoreWifiScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    JoinWifiContract.Actions actions = (JoinWifiContract.Actions) obj2;
                    boolean z = actions instanceof JoinWifiContract.Actions.CloseScreen;
                    JoinWifiActionHandler joinWifiActionHandler2 = joinWifiActionHandler;
                    if (z) {
                        joinWifiActionHandler2.b2(((JoinWifiContract.Actions.CloseScreen) actions).f6534a);
                    } else if (Intrinsics.c(actions, JoinWifiContract.Actions.ShowJoinConfirmation.f6535a)) {
                        joinWifiActionHandler2.w4();
                    } else if (Intrinsics.c(actions, JoinWifiContract.Actions.ShowJoinError.f6536a)) {
                        joinWifiActionHandler2.b1();
                    } else {
                        if (!Intrinsics.c(actions, JoinWifiContract.Actions.ShowUserLoginRequiredDialog.f6537a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        joinWifiActionHandler2.t4();
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
