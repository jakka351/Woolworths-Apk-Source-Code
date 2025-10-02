package me.oriient.internal.services.geofence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25486a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25486a = buildingGeofenceManagerImpl;
        this.b = str;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f25486a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zIsPolygonalStrategyEnabledImpl = this.f25486a.isPolygonalStrategyEnabledImpl();
        this.f25486a.polygonalStrategyRequesters.put(this.b, Boolean.valueOf(this.c));
        boolean zIsPolygonalStrategyEnabledImpl2 = this.f25486a.isPolygonalStrategyEnabledImpl();
        Unit unit = Unit.f24250a;
        if (zIsPolygonalStrategyEnabledImpl2 == zIsPolygonalStrategyEnabledImpl) {
            return unit;
        }
        this.f25486a.isPolygonalStrategyEnabled().setValue(Boolean.valueOf(zIsPolygonalStrategyEnabledImpl2));
        if (zIsPolygonalStrategyEnabledImpl2) {
            this.f25486a.enablePolygonalStrategyImpl();
        } else if (!zIsPolygonalStrategyEnabledImpl2) {
            this.f25486a.disablePolygonalStrategy();
        }
        return unit;
    }
}
