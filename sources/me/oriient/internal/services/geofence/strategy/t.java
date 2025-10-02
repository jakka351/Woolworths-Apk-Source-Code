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
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25512a;
    public final /* synthetic */ z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, Continuation continuation) {
        super(2, continuation);
        this.b = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25512a;
        if (i == 0) {
            ResultKt.b(obj);
            z zVar = this.b;
            Job job = zVar.l;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            zVar.l = null;
            MutableSharedFlow mutableSharedFlow = this.b.b;
            Map map = EmptyMap.d;
            this.f25512a = 1;
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
        ((SystemLocationManager) this.b.j.getD()).stopLocationUpdates();
        return Unit.f24250a;
    }
}
