package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1755z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChargingBasedPositioningControllerImpl f26181a;
    public final /* synthetic */ GeofenceBuilding b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755z(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, GeofenceBuilding geofenceBuilding, Continuation continuation) {
        super(2, continuation);
        this.f26181a = chargingBasedPositioningControllerImpl;
        this.b = geofenceBuilding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1755z(this.f26181a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1755z(this.f26181a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f26181a.j.setValue(this.b);
        return Unit.f24250a;
    }
}
