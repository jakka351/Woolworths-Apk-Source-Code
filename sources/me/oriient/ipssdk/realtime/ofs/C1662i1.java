package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1662i1 extends SuspendLambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Credentials f26087a;
    public /* synthetic */ RemoteConfig b;
    public /* synthetic */ boolean c;

    public C1662i1(Continuation continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C1662i1 c1662i1 = new C1662i1((Continuation) obj4);
        c1662i1.f26087a = (Credentials) obj;
        c1662i1.b = (RemoteConfig) obj2;
        c1662i1.c = zBooleanValue;
        return c1662i1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Credentials credentials = this.f26087a;
        RemoteConfig remoteConfig = this.b;
        boolean z = this.c;
        if (credentials != null && remoteConfig.getRealTime().getMisc().getEnableAutomaticPositioningDataPreloading() && z) {
            DataManager.access$getBuildingGeofenceManager(DataManager.INSTANCE).enableCircularStrategy(true, "data-preloading");
        } else {
            DataManager.access$getBuildingGeofenceManager(DataManager.INSTANCE).enableCircularStrategy(false, "data-preloading");
        }
        return Unit.f24250a;
    }
}
