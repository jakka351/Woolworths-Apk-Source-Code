package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* renamed from: me.oriient.ipssdk.realtime.ofs.d3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1634d3 extends SuspendLambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f26061a;
    public /* synthetic */ RemoteConfig b;
    public /* synthetic */ int c;

    public C1634d3(Continuation continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        C1634d3 c1634d3 = new C1634d3((Continuation) obj4);
        c1634d3.f26061a = zBooleanValue;
        c1634d3.b = (RemoteConfig) obj2;
        c1634d3.c = iIntValue;
        return c1634d3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean z = this.f26061a;
        RemoteConfig remoteConfig = this.b;
        int i = this.c;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            Positioning.access$getAutomaticPositioningStarter(Positioning.INSTANCE).setFeatureEnabled(false);
            return unit;
        }
        if (!z) {
            Positioning.access$getAutomaticPositioningStarter(Positioning.INSTANCE).setFeatureEnabled(false);
            return unit;
        }
        if (remoteConfig.getRealTime().getPositioning().getEnableAutoStartPositioning()) {
            Positioning.access$getAutomaticPositioningStarter(Positioning.INSTANCE).setFeatureEnabled(true);
            return unit;
        }
        Positioning.access$getAutomaticPositioningStarter(Positioning.INSTANCE).setFeatureEnabled(false);
        return unit;
    }
}
