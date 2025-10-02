package me.oriient.positioningengine.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;

/* renamed from: me.oriient.positioningengine.ondevice.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1827n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26473a;
    public final /* synthetic */ I b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827n(I i, Continuation continuation) {
        super(2, continuation);
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1827n(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1827n(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26473a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        me.oriient.positioningengine.ondevice.calibration.e eVar = this.b.b;
        this.f26473a = 1;
        me.oriient.positioningengine.ondevice.models.calibration.b bVar = eVar.f;
        EngineCalibrationInfo engineCalibrationInfo = bVar != null ? bVar.c : null;
        return engineCalibrationInfo == coroutineSingletons ? coroutineSingletons : engineCalibrationInfo;
    }
}
