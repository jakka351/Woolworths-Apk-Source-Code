package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.positioningengine.common.EngineStopReason;

/* renamed from: me.oriient.ipssdk.realtime.ofs.b3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1622b3 extends SuspendLambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f26049a;
    public /* synthetic */ int b;
    public /* synthetic */ RemoteConfig c;

    public C1622b3(Continuation continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        C1622b3 c1622b3 = new C1622b3((Continuation) obj4);
        c1622b3.f26049a = zBooleanValue;
        c1622b3.b = iIntValue;
        c1622b3.c = (RemoteConfig) obj3;
        return c1622b3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean z = this.f26049a;
        int i = this.b;
        RemoteConfig remoteConfig = this.c;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            Positioning.access$getPeriodicAutomaticCalibrator(Positioning.INSTANCE).stop(EngineStopReason.Logout.INSTANCE);
            return unit;
        }
        if (!remoteConfig.getRealTime().getPositioning().getEnableAutoCalib()) {
            Positioning.access$getPeriodicAutomaticCalibrator(Positioning.INSTANCE).stop(new EngineStopReason.Custom("Config disabled"));
            return unit;
        }
        if (z) {
            Positioning.access$getPeriodicAutomaticCalibrator(Positioning.INSTANCE).start();
            return unit;
        }
        Positioning.access$getPeriodicAutomaticCalibrator(Positioning.INSTANCE).stop(new EngineStopReason.Custom("Preheating Disabled"));
        return unit;
    }
}
