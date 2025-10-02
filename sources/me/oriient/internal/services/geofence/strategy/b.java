package me.oriient.internal.services.geofence.strategy;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.infra.locationManager.SystemLocationManager;

/* loaded from: classes7.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25497a;
    public final /* synthetic */ p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, Continuation continuation) {
        super(2, continuation);
        this.b = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25497a;
        if (i == 0) {
            ResultKt.b(obj);
            p pVar = this.b;
            Job job = pVar.n;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            pVar.n = null;
            p pVar2 = this.b;
            Job job2 = pVar2.l;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            pVar2.l = null;
            p pVar3 = this.b;
            Job job3 = pVar3.o;
            if (job3 != null) {
                job3.cancel((CancellationException) null);
            }
            pVar3.o = null;
            MutableSharedFlow mutableSharedFlow = this.b.b;
            Map map = EmptyMap.d;
            this.f25497a = 1;
            if (mutableSharedFlow.emit(map, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.b.k = EmptyMap.d;
        p pVar4 = this.b;
        ((SystemLocationManager) pVar4.j.getD()).stopLocationUpdates();
        Job job4 = pVar4.m;
        if (job4 != null) {
            job4.cancel((CancellationException) null);
        }
        pVar4.m = null;
        return Unit.f24250a;
    }
}
