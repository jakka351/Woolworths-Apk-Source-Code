package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;

/* renamed from: me.oriient.ipssdk.realtime.ofs.f3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1646f3 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f26072a;
    public /* synthetic */ RemoteConfig b;

    public C1646f3(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        C1646f3 c1646f3 = new C1646f3((Continuation) obj3);
        c1646f3.f26072a = iIntValue;
        c1646f3.b = (RemoteConfig) obj2;
        return c1646f3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int i = this.f26072a;
        RemoteConfig remoteConfig = this.b;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (!remoteConfig.getRealTime().getPositioning().getEnableChargingBasedAutoStartPositioning() && !remoteConfig.getRealTime().getPositioning().getAutoStop().getUseCharging()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
