package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManagerAndroid f24962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.f24962a = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f24962a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x(this.f24962a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f24962a.stopPermissionMonitoring();
        boolean hasPermission = this.f24962a.getHasPermission();
        Unit unit = Unit.f24250a;
        if (!hasPermission || !((Boolean) this.f24962a.isActive().getValue()).booleanValue()) {
            return unit;
        }
        this.f24962a.isActive().setValue(Boolean.FALSE);
        this.f24962a.stopLocationUpdatesImpl();
        return unit;
    }
}
