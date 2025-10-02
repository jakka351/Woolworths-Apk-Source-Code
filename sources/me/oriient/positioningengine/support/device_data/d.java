package me.oriient.positioningengine.support.device_data;

import kotlin.NoWhenBranchMatchedException;
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
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import me.oriient.positioningengine.support.device_data.model.DeviceData;

/* loaded from: classes8.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f26523a;
    public int b;
    public final /* synthetic */ DeviceDataRepositoryImpl c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeviceDataRepositoryImpl deviceDataRepositoryImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = deviceDataRepositoryImpl;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        if (i == 0) {
            ResultKt.b(obj);
            long currentTimeMillis = this.c.getTimeProvider().getCurrentTimeMillis();
            DeviceDataRest deviceDataRest = this.c.deviceDataRest;
            String str = this.d;
            String str2 = this.e;
            this.f26523a = currentTimeMillis;
            this.b = 1;
            obj = deviceDataRest.loadDeviceData(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f26523a;
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        if (!(outcome instanceof Outcome.Success)) {
            if (outcome instanceof Outcome.Failure) {
                return new Outcome.Failure(((Outcome.Failure) outcome).getValue());
            }
            throw new NoWhenBranchMatchedException();
        }
        DeviceData deviceData = (DeviceData) ((Outcome.Success) outcome).getValue();
        this.c.eLog.i("PredefinedDataShiftRepository", "Device data received", MapsKt.j(new Pair("deviceType", this.d), new Pair("userSessionId", this.e), new Pair("isPositioningBlocked", Boolean.valueOf(deviceData.getBlacklistedFeatures().contains(BlacklistedFeature.POSITIONING))), new Pair("isMultiFloorPositioningBlocked", Boolean.valueOf(deviceData.getBlacklistedFeatures().contains(BlacklistedFeature.MULTI_FLOOR_POSITIONING))), new Pair("hasPredefinedDataShift", Boolean.valueOf(deviceData.getPredefinedDataShift() != null))));
        this.c.getMetric().i("PredefinedDataShiftRepository", "loginTimeDeviceData", this.c.getTimeProvider().timeIntervalSinceNowInSeconds(j));
        return new Outcome.Success(deviceData);
    }
}
