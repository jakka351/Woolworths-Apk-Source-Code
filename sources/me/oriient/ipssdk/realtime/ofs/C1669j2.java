package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarterImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1669j2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeofencePositioningAutoStarterImpl f26093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669j2(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, Continuation continuation) {
        super(2, continuation);
        this.f26093a = geofencePositioningAutoStarterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1669j2(this.f26093a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1669j2(this.f26093a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        long autoStartPositioningPauseAfterClientStopMillis = GeofencePositioningAutoStarterImpl.access$getConfigManager(this.f26093a).getRealTimeConfig().getPositioning().getAutoStartPositioningPauseAfterClientStopMillis() + GeofencePositioningAutoStarterImpl.access$getTimeProvider(this.f26093a).getCurrentTimeMillis();
        MutableStateFlow mutableStateFlow = this.f26093a.j;
        Long l = (Long) this.f26093a.j.getValue();
        mutableStateFlow.setValue(new Long(Math.max(l != null ? l.longValue() : 0L, autoStartPositioningPauseAfterClientStopMillis)));
        return Unit.f24250a;
    }
}
