package me.oriient.internal.infra.locationManager;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: me.oriient.internal.infra.locationManager.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1196h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24950a;
    public final /* synthetic */ FusedLocationManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196h(FusedLocationManager fusedLocationManager, Continuation continuation) {
        super(2, continuation);
        this.b = fusedLocationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1196h(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1196h(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24950a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<Boolean> stateFlowIsLocationPermissionGranted = this.b.getPermissionManager().isLocationPermissionGranted();
            C1195g c1195g = new C1195g(this.b);
            this.f24950a = 1;
            if (stateFlowIsLocationPermissionGranted.collect(c1195g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
