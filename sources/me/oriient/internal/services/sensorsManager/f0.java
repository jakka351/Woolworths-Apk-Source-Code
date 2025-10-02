package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;

/* loaded from: classes7.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25573a;

    public f0(SensorsManagerImpl sensorsManagerImpl) {
        this.f25573a = sensorsManagerImpl;
    }

    public final Long a(SystemSensor sensor) {
        Intrinsics.h(sensor, "sensor");
        OriientSensorWrapper[] oriientSensorWrapperArr = this.f25573a.sensors;
        if (oriientSensorWrapperArr != null) {
            return oriientSensorWrapperArr[this.f25573a.getSensorIndexByType(sensor.getOsSensorType())].getSameValueThresholdMillis();
        }
        Intrinsics.p("sensors");
        throw null;
    }

    public final boolean b(SystemSensor sensor) {
        Intrinsics.h(sensor, "sensor");
        SensorsManagerImpl sensorsManagerImpl = this.f25573a;
        OriientSensorWrapper[] oriientSensorWrapperArr = sensorsManagerImpl.sensors;
        if (oriientSensorWrapperArr != null) {
            return sensorsManagerImpl.isSensorCritical(oriientSensorWrapperArr[this.f25573a.getSensorIndexByType(sensor.getOsSensorType())]);
        }
        Intrinsics.p("sensors");
        throw null;
    }
}
