package me.oriient.internal.services.sensorsManager;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes7.dex */
public final class p0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25589a;
    public final /* synthetic */ SensorsManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(SensorsManagerImpl sensorsManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = sensorsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p0 p0Var = new p0(this.b, continuation);
        p0Var.f25589a = obj;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p0 p0Var = new p0(this.b, (Continuation) obj2);
        p0Var.f25589a = (CoroutineScope) obj;
        return p0Var.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferredA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f25589a;
        OriientSensorWrapper[] oriientSensorWrapperArr = this.b.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        SensorsManagerImpl sensorsManagerImpl = this.b;
        ArrayList arrayList = new ArrayList(oriientSensorWrapperArr.length);
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            sensorsManagerImpl.logger.d(sensorsManagerImpl.tag, "turnSensorsOnImpl: registering sensor listener " + oriientSensorWrapper.getType());
            if (oriientSensorWrapper.getType() == -1) {
                deferredA = BuildersKt.a(coroutineScope, sensorsManagerImpl.getTurnOnSensorsCoroutineContext(), new o0(oriientSensorWrapper, sensorsManagerImpl, null), 2);
            } else if (sensorsManagerImpl.isPressureOn && oriientSensorWrapper.getType() == 6) {
                sensorsManagerImpl.logger.d(sensorsManagerImpl.tag, "turnSensorsOnImpl: pressure already on");
                deferredA = BuildersKt.a(coroutineScope, sensorsManagerImpl.getTurnOnSensorsCoroutineContext(), new n0(oriientSensorWrapper, null), 2);
            } else {
                deferredA = BuildersKt.a(coroutineScope, sensorsManagerImpl.getTurnOnSensorsCoroutineContext(), new m0(oriientSensorWrapper, sensorsManagerImpl, sensorsManagerImpl.systemSensorManager.getDefaultSensor(oriientSensorWrapper.getType()), null), 2);
            }
            arrayList.add(deferredA);
        }
        return arrayList;
    }
}
