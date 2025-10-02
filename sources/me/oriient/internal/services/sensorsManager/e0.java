package me.oriient.internal.services.sensorsManager;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes7.dex */
public final class e0 implements InterfaceC1495i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25572a;

    public e0(SensorsManagerImpl sensorsManagerImpl) {
        this.f25572a = sensorsManagerImpl;
    }

    @Override // me.oriient.internal.services.sensorsManager.InterfaceC1495i
    public final void a(int i) {
        if (this.f25572a.didOverflow.getAndSet(true)) {
            return;
        }
        this.f25572a.overflowCount++;
        this.f25572a.eLog.c(this.f25572a.tag, "Buffer overflow in sensor", new c0(i, this.f25572a));
        OriientSensorWrapper[] oriientSensorWrapperArr = this.f25572a.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        SensorsManagerImpl sensorsManagerImpl = this.f25572a;
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            sensorsManagerImpl.eLog.c(sensorsManagerImpl.tag, sensorsManagerImpl.getBufferTimeStr(oriientSensorWrapper), MapsKt.i(new Pair("sensorType", Integer.valueOf(oriientSensorWrapper.getType()))));
        }
        this.f25572a.maxBatchDelay = 0L;
        this.f25572a.lastBatchProcessing = -1L;
        this.f25572a.turnSensorsOff(true, false);
        BuildersKt.c(CoroutineScopeKt.a(SensorsManagerImpl.SCHEDULED_POOL_EXECUTOR), null, null, new d0(this.f25572a, null), 3);
    }
}
