package me.oriient.internal.services.eventManager;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.eventManager.model.EventError;

/* loaded from: classes7.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25471a;
    public final /* synthetic */ me.oriient.internal.services.eventManager.model.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, me.oriient.internal.services.eventManager.model.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f25471a = wVar;
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f25471a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.f25471a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        w wVar = this.f25471a;
        me.oriient.internal.services.eventManager.model.c cVar = this.b;
        ((Logger) wVar.p.getD()).d("EventManager", "On request timeout " + cVar.f25463a.getRequestId());
        Job job = (Job) wVar.n.get(cVar);
        if (job != null) {
            JobKt.f(job).cancel((CancellationException) null);
        }
        wVar.n.remove(cVar);
        BuildersKt.c(wVar.k, null, null, new k(cVar, cVar.f25463a, null), 3);
        int i = wVar.m + 1;
        wVar.m = i;
        if (i >= wVar.b.getTimeoutsToFail()) {
            ((Logger) wVar.p.getD()).e("EventManager", "Too many pending requests " + wVar.n.size());
            wVar.d.e("EventManager", "Too many requests timed out");
            wVar.m = 0;
            for (Map.Entry entry : wVar.n.entrySet()) {
                BuildersKt.c(wVar.k, null, null, new f(entry, ((me.oriient.internal.services.eventManager.model.c) entry.getKey()).f25463a, null), 3);
                ((Job) entry.getValue()).cancel((CancellationException) null);
            }
            wVar.n.clear();
            wVar.o.clear();
            wVar.a((EventError) new EventError.Timeout("Too many requests are pending"));
        }
        return Unit.f24250a;
    }
}
