package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.remoteLog.GlobalOptions;

/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements Function2 {
    public Mutex p;
    public RemoteLogImpl q;
    public Function1 r;
    public int s;
    public final /* synthetic */ RemoteLogImpl t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RemoteLogImpl remoteLogImpl, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.t = remoteLogImpl;
        this.u = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.t, this.u, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RemoteLogImpl remoteLogImpl;
        Mutex mutex;
        Function1 function1;
        Mutex mutex2;
        RemoteLogImpl remoteLogImpl2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                remoteLogImpl = this.t;
                mutex = remoteLogImpl.getRemoteLogManager().d;
                this.p = mutex;
                this.q = remoteLogImpl;
                function1 = this.u;
                this.r = function1;
                this.s = 1;
                if (mutex.a(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                remoteLogImpl2 = this.q;
                mutex2 = this.p;
                try {
                    ResultKt.b(obj);
                    remoteLogImpl = remoteLogImpl2;
                    remoteLogImpl._options.getSendingSchedule();
                    Unit unit = Unit.f24250a;
                    mutex2.c(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    mutex2.c(null);
                    throw th;
                }
            }
            Function1 function12 = this.r;
            RemoteLogImpl remoteLogImpl3 = this.q;
            Mutex mutex3 = this.p;
            ResultKt.b(obj);
            function1 = function12;
            mutex = mutex3;
            remoteLogImpl = remoteLogImpl3;
            GlobalOptions globalOptionsA = remoteLogImpl._options.a();
            function1.invoke(remoteLogImpl.localOptions);
            Logger logger = remoteLogImpl.getLogger();
            if (logger != null) {
                logger.d("RemoteLog", "configure() new options - " + remoteLogImpl._options);
            }
            if (globalOptionsA.getMaxBatchSize() == remoteLogImpl._options.getMaxBatchSize() && Intrinsics.c(globalOptionsA.getSendingSchedule(), remoteLogImpl._options.getSendingSchedule())) {
                mutex2 = mutex;
                remoteLogImpl._options.getSendingSchedule();
                Unit unit2 = Unit.f24250a;
                mutex2.c(null);
                return unit2;
            }
            this.p = mutex;
            this.q = remoteLogImpl;
            this.r = null;
            this.s = 2;
            if (remoteLogImpl.trySendingBatchInternal(this) != coroutineSingletons) {
                remoteLogImpl2 = remoteLogImpl;
                mutex2 = mutex;
                remoteLogImpl = remoteLogImpl2;
                remoteLogImpl._options.getSendingSchedule();
                Unit unit22 = Unit.f24250a;
                mutex2.c(null);
                return unit22;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.c(null);
            throw th;
        }
    }
}
