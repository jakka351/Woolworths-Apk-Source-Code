package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class m0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OriientSensorWrapper f25583a;
    public final /* synthetic */ SensorsManagerImpl b;
    public final /* synthetic */ Sensor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(OriientSensorWrapper oriientSensorWrapper, SensorsManagerImpl sensorsManagerImpl, Sensor sensor, Continuation continuation) {
        super(2, continuation);
        this.f25583a = oriientSensorWrapper;
        this.b = sensorsManagerImpl;
        this.c = sensor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m0(this.f25583a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        OriientSensorWrapper oriientSensorWrapper = this.f25583a;
        return new Pair(oriientSensorWrapper, Boolean.valueOf(this.b.turnOnSensor(oriientSensorWrapper, this.c)));
    }
}
