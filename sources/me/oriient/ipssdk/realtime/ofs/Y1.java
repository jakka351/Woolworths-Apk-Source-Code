package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* loaded from: classes8.dex */
public final class Y1 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Long f26034a;
    public final /* synthetic */ GeofencePositioningAutoStarterImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(3, continuation);
        this.b = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Y1 y1 = new Y1(this.b, (Continuation) obj3);
        y1.f26034a = (Long) obj;
        return y1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Long l = this.f26034a;
        this.b.k.setValue(Boolean.valueOf(!(GeofencePositioningAutoStarterImpl.access$getTimeProvider(this.b).timeIntervalSinceNow(l != null ? l.longValue() : 0L) <= 0)));
        return Unit.f24250a;
    }
}
