package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManagerAndroid f24956a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.f24956a = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f24956a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r(this.f24956a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        SystemLocation androidLastKnownLocation = this.f24956a.getAndroidLastKnownLocation();
        if (androidLastKnownLocation != null) {
            LocationManagerAndroid locationManagerAndroid = this.f24956a;
            locationManagerAndroid._lastKnownLocation = androidLastKnownLocation;
            locationManagerAndroid.getLocationUpdates().f(androidLastKnownLocation);
        }
        return Unit.f24250a;
    }
}
