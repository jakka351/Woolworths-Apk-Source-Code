package me.oriient.internal.services.geofence.strategy;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.core.coroutines.FlowExtKt;

/* loaded from: classes7.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25505a;
    public final /* synthetic */ p b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, String str, Continuation continuation) {
        super(2, continuation);
        this.b = pVar;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25505a;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowSampleWithFirst = FlowExtKt.sampleWithFirst(((SystemLocationManager) this.b.j.getD()).getLocationUpdates(), (long) (this.b.d().getLocationThrottlingDurationSeconds() * TimeUnit.SECONDS.toMillis(1L)));
            i iVar = new i(this.b, this.c);
            this.f25505a = 1;
            if (flowSampleWithFirst.collect(iVar, this) == coroutineSingletons) {
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
