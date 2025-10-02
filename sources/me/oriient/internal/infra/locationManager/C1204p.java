package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.infra.locationManager.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1204p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24954a;
    public final /* synthetic */ LocationManagerAndroid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204p(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.b = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1204p(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1204p(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24954a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            this.b.getLogger().d("LocationManagerAndroid", "onModeChanged() called");
            if (!((Boolean) this.b.isActive().getValue()).booleanValue()) {
                return unit;
            }
            this.b.stopLocationUpdatesImpl();
            LocationManagerAndroid locationManagerAndroid = this.b;
            this.f24954a = 1;
            if (locationManagerAndroid.startLocationUpdatesImpl(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
