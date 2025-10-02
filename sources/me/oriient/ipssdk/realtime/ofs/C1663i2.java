package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1663i2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofencePositioningAutoStarterImpl f26088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1663i2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(2, continuation);
        this.f26088a = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1663i2(this.f26088a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1663i2(this.f26088a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        long autoStartPositioningPauseAfterClientStartMillis = GeofencePositioningAutoStarterImpl.access$getConfigManager(this.f26088a).getRealTimeConfig().getPositioning().getAutoStartPositioningPauseAfterClientStartMillis() + GeofencePositioningAutoStarterImpl.access$getTimeProvider(this.f26088a).getCurrentTimeMillis();
        MutableStateFlow mutableStateFlow = this.f26088a.j;
        Long l = (Long) this.f26088a.j.getValue();
        mutableStateFlow.setValue(new Long(Math.max(l != null ? l.longValue() : 0L, autoStartPositioningPauseAfterClientStartMillis)));
        return Unit.f24250a;
    }
}
