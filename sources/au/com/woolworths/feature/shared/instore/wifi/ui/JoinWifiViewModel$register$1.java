package au.com.woolworths.feature.shared.instore.wifi.ui;

import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel$register$1", f = "JoinWifiViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class JoinWifiViewModel$register$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ JoinWifiViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinWifiViewModel$register$1(JoinWifiViewModel joinWifiViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = joinWifiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JoinWifiViewModel$register$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JoinWifiViewModel$register$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JoinWifiViewModel joinWifiViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = joinWifiViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, true, false, 2);
                InStoreWifiInteractor inStoreWifiInteractor = joinWifiViewModel.e;
                this.p = 1;
                if (inStoreWifiInteractor.e(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            sharedFlowImpl.f(new JoinWifiContract.Actions.CloseScreen(true));
        } finally {
            try {
                JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, false, false, 2);
                return Unit.f24250a;
            } catch (Throwable th) {
            }
        }
        JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, false, false, 2);
        return Unit.f24250a;
    }
}
