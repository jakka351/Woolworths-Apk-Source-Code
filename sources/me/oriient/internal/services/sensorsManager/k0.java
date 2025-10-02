package me.oriient.internal.services.sensorsManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;

/* loaded from: classes7.dex */
public final class k0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25579a;
    public final /* synthetic */ SensorsManagerImpl b;
    public final /* synthetic */ SensorsDataProvider.SessionStartListener c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(SensorsManagerImpl sensorsManagerImpl, SensorsDataProvider.SessionStartListener sessionStartListener, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.b = sensorsManagerImpl;
        this.c = sessionStartListener;
        this.d = z;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25579a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            this.b.logger.d(this.b.tag, "turnSensorsOn() called");
            if (!this.b.isValid()) {
                String missingSensorsString = this.b.getMissingSensorsString();
                this.b.logger.e(this.b.tag, "turnSensorsOn: " + missingSensorsString);
                this.c.onError(new SensorManagerError.InsufficientHardware(missingSensorsString));
                return unit;
            }
            SensorsManagerImpl sensorsManagerImpl = this.b;
            boolean z = this.d;
            this.f25579a = 1;
            obj = sensorsManagerImpl.turnSensorsOnImpl(z, this);
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
        if (outcome instanceof Outcome.Success) {
            if (((Boolean) ((Outcome.Success) outcome).getValue()).booleanValue()) {
                this.b.sessionStartTimeUTC = this.e;
            }
            this.c.onSessionStart();
        } else if (outcome instanceof Outcome.Failure) {
            this.c.onError((SensorManagerError) ((Outcome.Failure) outcome).getValue());
        }
        this.b.overflowCount = 0;
        return unit;
    }
}
