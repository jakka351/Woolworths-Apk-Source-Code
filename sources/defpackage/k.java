package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import me.oriient.internal.services.remoteLog.e;
import me.oriient.internal.services.remoteLog.models.a;
import me.oriient.internal.services.remoteLog.models.c;

/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements Function2 {
    public Mutex p;
    public RemoteLogImpl q;
    public a r;
    public int s;
    public final /* synthetic */ RemoteLogImpl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RemoteLogImpl remoteLogImpl, Continuation continuation) {
        super(2, continuation);
        this.t = remoteLogImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.t, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        RemoteLogImpl remoteLogImpl;
        Mutex mutex2;
        a aVar;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RemoteLogImpl remoteLogImpl2 = this.t;
                Mutex mutex3 = remoteLogImpl2.getRemoteLogManager().e;
                this.p = mutex3;
                this.q = remoteLogImpl2;
                this.s = 1;
                if (mutex3.a(this) != coroutineSingletons) {
                    mutex = mutex3;
                    remoteLogImpl = remoteLogImpl2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.r;
                remoteLogImpl = this.q;
                mutex2 = this.p;
                try {
                    ResultKt.b(obj);
                    if (!((Collection) obj).isEmpty() && (job = (Job) remoteLogImpl.batchSendingJobs.remove(new c(aVar.f25539a))) != null) {
                        job.cancel((CancellationException) null);
                    }
                    Unit unit = Unit.f24250a;
                    mutex2.c(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    mutex2.c(null);
                    throw th;
                }
            }
            remoteLogImpl = this.q;
            mutex = this.p;
            ResultKt.b(obj);
            a aVarGenerateBatchConfig = remoteLogImpl.generateBatchConfig();
            remoteLogImpl.batchData = remoteLogImpl.generateNewBatchData();
            e remoteLogManager = remoteLogImpl.getRemoteLogManager();
            List listQ = CollectionsKt.Q(aVarGenerateBatchConfig);
            this.p = mutex;
            this.q = remoteLogImpl;
            this.r = aVarGenerateBatchConfig;
            this.s = 2;
            Object objA = remoteLogManager.a(listQ, this);
            if (objA != coroutineSingletons) {
                aVar = aVarGenerateBatchConfig;
                obj = objA;
                mutex2 = mutex;
                if (!((Collection) obj).isEmpty()) {
                    job.cancel((CancellationException) null);
                }
                Unit unit2 = Unit.f24250a;
                mutex2.c(null);
                return unit2;
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
