package me.oriient.internal.services.sensorsManager.support;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes7.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25602a;
    public final /* synthetic */ SupportSensorsManager.SupportSensorsManagerDelegate b;
    public final /* synthetic */ SensorManagerError c;
    public final /* synthetic */ SupportSensorsManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SupportSensorsManager.SupportSensorsManagerDelegate supportSensorsManagerDelegate, SensorManagerError sensorManagerError, SupportSensorsManagerImpl supportSensorsManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = supportSensorsManagerDelegate;
        this.c = sensorManagerError;
        this.d = supportSensorsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25602a;
        if (i == 0) {
            ResultKt.b(obj);
            SupportSensorsManager.SupportSensorsManagerDelegate supportSensorsManagerDelegate = this.b;
            SensorManagerError sensorManagerError = this.c;
            this.f25602a = 1;
            obj = supportSensorsManagerDelegate.stopEngineOnError(sensorManagerError, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        SupportSensorsManagerImpl supportSensorsManagerImpl = this.d;
        if (outcome instanceof Outcome.Success) {
            supportSensorsManagerImpl.getELog().w("SupportSensorsManager", "stopped positioning after sensors failed mid-session");
            supportSensorsManagerImpl.getLogger().i("SupportSensorsManager", "onCompleted: stopped positioning after sensors failed mid-session");
        }
        SupportSensorsManagerImpl supportSensorsManagerImpl2 = this.d;
        if (outcome instanceof Outcome.Failure) {
            Exception value = ((Outcome.Failure) outcome).getValue();
            supportSensorsManagerImpl2.getELog().e("SupportSensorsManager", "failed to stop positioning after sensors failed mid-session", MapsKt.i(new Pair("errorMessage", value.getMessage())));
            supportSensorsManagerImpl2.getLogger().e("SupportSensorsManager", "onError: failed to stop positioning - " + value.getMessage());
        }
        return Unit.f24250a;
    }
}
