package me.oriient.internal.services.geofence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25485a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25485a = buildingGeofenceManagerImpl;
        this.b = str;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25485a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zIsCircularStrategyEnabledImpl = this.f25485a.isCircularStrategyEnabledImpl();
        this.f25485a.circularStrategyRequesters.put(this.b, Boolean.valueOf(this.c));
        boolean zIsCircularStrategyEnabledImpl2 = this.f25485a.isCircularStrategyEnabledImpl();
        Unit unit = Unit.f24250a;
        if (zIsCircularStrategyEnabledImpl2 == zIsCircularStrategyEnabledImpl) {
            return unit;
        }
        this.f25485a.isCircularStrategyEnabled().setValue(Boolean.valueOf(zIsCircularStrategyEnabledImpl2));
        if (zIsCircularStrategyEnabledImpl2) {
            this.f25485a.enableCircleStrategyImpl();
        } else if (!zIsCircularStrategyEnabledImpl2) {
            this.f25485a.disableCircleStrategy();
        }
        return unit;
    }
}
