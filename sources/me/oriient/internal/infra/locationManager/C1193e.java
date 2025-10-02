package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.infra.locationManager.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1193e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FusedLocationManager f24947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193e(FusedLocationManager fusedLocationManager, Continuation continuation) {
        super(2, continuation);
        this.f24947a = fusedLocationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1193e(this.f24947a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1193e(this.f24947a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f24947a.getLogger().d("FusedLocationManager", "onModeChanged() called");
        boolean zBooleanValue = ((Boolean) this.f24947a.isActive().getValue()).booleanValue();
        Unit unit = Unit.f24250a;
        if (!zBooleanValue) {
            return unit;
        }
        this.f24947a.stopLocationUpdates();
        this.f24947a.startLocationUpdatesImpl();
        return unit;
    }
}
