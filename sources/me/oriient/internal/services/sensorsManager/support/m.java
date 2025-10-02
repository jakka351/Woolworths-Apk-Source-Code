package me.oriient.internal.services.sensorsManager.support;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes7.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25600a;
    public final /* synthetic */ SupportSensorsManager.SupportSensorsManagerDelegate b;
    public final /* synthetic */ SupportSensorsManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SupportSensorsManager.SupportSensorsManagerDelegate supportSensorsManagerDelegate, SupportSensorsManagerImpl supportSensorsManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = supportSensorsManagerDelegate;
        this.c = supportSensorsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25600a;
        if (i == 0) {
            ResultKt.b(obj);
            SupportSensorsManager.SupportSensorsManagerDelegate supportSensorsManagerDelegate = this.b;
            SensorManagerError.SensorsFailedToRestart sensorsFailedToRestart = new SensorManagerError.SensorsFailedToRestart();
            this.f25600a = 1;
            obj = supportSensorsManagerDelegate.stopEngineOnError(sensorsFailedToRestart, this);
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
        SupportSensorsManagerImpl supportSensorsManagerImpl = this.c;
        if (outcome instanceof Outcome.Success) {
            supportSensorsManagerImpl.getELog().w("SupportSensorsManager", "stopped positioning after sensors failed to restart");
            supportSensorsManagerImpl.getLogger().i("SupportSensorsManager", "onCompleted: stopped positioning after sensors failed to restart");
        }
        SupportSensorsManagerImpl supportSensorsManagerImpl2 = this.c;
        if (outcome instanceof Outcome.Failure) {
            Exception value = ((Outcome.Failure) outcome).getValue();
            supportSensorsManagerImpl2.getELog().e("SupportSensorsManager", "failed to stop positioning after sensors failed to restart", MapsKt.i(new Pair("errorMessage", value.getMessage())));
            supportSensorsManagerImpl2.getLogger().e("SupportSensorsManager", "onError: failed to stop positioning - " + value.getMessage());
        }
        return Unit.f24250a;
    }
}
