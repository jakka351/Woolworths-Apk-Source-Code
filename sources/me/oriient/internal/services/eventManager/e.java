package me.oriient.internal.services.eventManager;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f25454a = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25454a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f25454a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        w wVar = this.f25454a;
        wVar.h = false;
        wVar.r = 0;
        wVar.a(wVar.f, EventManagerState.DISCONNECTING);
        me.oriient.internal.services.websocket.e eVar = this.f25454a.g;
        if (eVar != null) {
            eVar.b();
        }
        Job job = this.f25454a.t;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        return Unit.f24250a;
    }
}
