package me.oriient.positioningengine.support.engineManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import me.oriient.positioningengine.support.device_data.model.DeviceData;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;

/* loaded from: classes8.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26540a;
    public final /* synthetic */ SupportPositioningEngineManagerImpl b;
    public final /* synthetic */ PositioningEngineCredentials c;
    public final /* synthetic */ EngineConfig d;
    public final /* synthetic */ DeviceData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, PositioningEngineCredentials positioningEngineCredentials, EngineConfig engineConfig, DeviceData deviceData, Continuation continuation) {
        super(2, continuation);
        this.b = supportPositioningEngineManagerImpl;
        this.c = positioningEngineCredentials;
        this.d = engineConfig;
        this.e = deviceData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26540a;
        if (i == 0) {
            ResultKt.b(obj);
            SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl = this.b;
            PositioningEngineCredentials positioningEngineCredentials = this.c;
            EngineConfig engineConfig = this.d;
            SpecificEngineConfig specificConfig = engineConfig.getSpecificConfig();
            PredefinedDataShift predefinedDataShift = this.e.getPredefinedDataShift();
            this.f26540a = 1;
            obj = supportPositioningEngineManagerImpl.createOnDeviceEngine(positioningEngineCredentials, engineConfig, specificConfig, predefinedDataShift, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return new Outcome.Success(obj);
    }
}
