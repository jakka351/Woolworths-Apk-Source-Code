package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements Function2 {
    public int p;
    public final /* synthetic */ RemoteLogImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemoteLogImpl remoteLogImpl, Continuation continuation) {
        super(2, continuation);
        this.q = remoteLogImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        new c(this.q, (Continuation) obj2).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            RemoteLogImpl remoteLogImpl = this.q;
            StateFlow<Boolean> stateFlowIsConnected = remoteLogImpl.getNetworkManager().isConnected();
            b bVar = new b(remoteLogImpl);
            this.p = 1;
            if (stateFlowIsConnected.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
