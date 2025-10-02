package me.oriient.internal.infra.locationManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: me.oriient.internal.infra.locationManager.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1206s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24957a;
    public final /* synthetic */ N b;
    public final /* synthetic */ LocationManagerAndroid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206s(N n, LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.b = n;
        this.c = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1206s(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1206s(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24957a;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        N n = this.b;
        if (n != null) {
            this.c.setActivityMode(n);
        }
        if (((Boolean) this.c.isActive().getValue()).booleanValue()) {
            return unit;
        }
        if (this.c.getHasPermission()) {
            LocationManagerAndroid locationManagerAndroid = this.c;
            this.f24957a = 2;
            if (locationManagerAndroid.startLocationUpdatesImpl(this) != coroutineSingletons) {
                return unit;
            }
        } else {
            this.c.startPermissionMonitoring();
            MutableSharedFlow<Error> errors = this.c.getErrors();
            Error error = new Error("Can not start location updates. No permission granted");
            this.f24957a = 1;
            if (errors.emit(error, this) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
