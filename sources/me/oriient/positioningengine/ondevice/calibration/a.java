package me.oriient.positioningengine.ondevice.calibration;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public e f26412a;
    public int b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(2, continuation);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        if (i == 0) {
            ResultKt.b(obj);
            e eVar2 = this.c;
            CalibrationInfoDatabase calibrationInfoDatabase = (CalibrationInfoDatabase) eVar2.h.getD();
            me.oriient.positioningengine.ondevice.models.calibration.c cVar = this.c.f26415a;
            this.f26412a = eVar2;
            this.b = 1;
            Object calibrationRecord = calibrationInfoDatabase.getCalibrationRecord(cVar, this);
            if (calibrationRecord == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
            obj = calibrationRecord;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.f26412a;
            ResultKt.b(obj);
        }
        eVar.f = (me.oriient.positioningengine.ondevice.models.calibration.b) obj;
        return Unit.f24250a;
    }
}
