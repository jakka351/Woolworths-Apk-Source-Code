package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.core.UtilsKt;

/* loaded from: classes7.dex */
public final class g0 implements SensorEventListener2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25575a;

    public g0(SensorsManagerImpl sensorsManagerImpl) {
        this.f25575a = sensorsManagerImpl;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener2
    public final void onFlushCompleted(Sensor sensor) {
        Intrinsics.h(sensor, "sensor");
        this.f25575a.eLog.d(this.f25575a.tag, "onFlushCompleted() called", MapsKt.i(new Pair("sensorType", Integer.valueOf(sensor.getType()))));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        long jLongValue;
        Intrinsics.h(event, "event");
        try {
            int type = event.sensor.getType();
            if (this.f25575a.extraPrints) {
                this.f25575a.logger.d(this.f25575a.tag, "onSensorChanged() called with: event = [" + type + ": " + event.timestamp + ']');
            }
            if (this.f25575a.isAtLeastOneEventFromEachSensorAndSetFirstValue(event) && this.f25575a.getIsOn()) {
                Long l = this.f25575a.firstGyroTimestamp;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    SensorsManagerImpl sensorsManagerImpl = this.f25575a;
                    if (type != 4) {
                        return;
                    }
                    if (sensorsManagerImpl.extraPrints) {
                        sensorsManagerImpl.logger.d(sensorsManagerImpl.tag, "recordFirstGyroTimestamp: first gyro timestamp is " + event.timestamp);
                    }
                    long currentTimeGmt = event.timestamp - (sensorsManagerImpl.timeProvider.getCurrentTimeGmt() - sensorsManagerImpl.sessionStartTimeUTC);
                    sensorsManagerImpl.firstGyroTimestamp = Long.valueOf(currentTimeGmt);
                    jLongValue = currentTimeGmt;
                }
                int sensorIndexByType = this.f25575a.getSensorIndexByType(type);
                OriientSensorWrapper[] oriientSensorWrapperArr = this.f25575a.sensors;
                if (oriientSensorWrapperArr == null) {
                    Intrinsics.p("sensors");
                    throw null;
                }
                oriientSensorWrapperArr[sensorIndexByType].insertEvent(event, jLongValue, (AppState) this.f25575a.appStateProvider.getAppState().getValue());
                if (type == 4) {
                    SensorsManagerImpl sensorsManagerImpl2 = this.f25575a;
                    OriientSensorWrapper[] oriientSensorWrapperArr2 = sensorsManagerImpl2.sensors;
                    if (oriientSensorWrapperArr2 == null) {
                        Intrinsics.p("sensors");
                        throw null;
                    }
                    if (sensorsManagerImpl2.isBatchReady(oriientSensorWrapperArr2[sensorIndexByType])) {
                        this.f25575a.sensorDataProcessor.sendEmptyMessage(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f25575a.extraPrints) {
                this.f25575a.logger.w(this.f25575a.tag, "onSensorChanged: ignoring event [" + type + ": " + event.timestamp + ']');
            }
        } catch (Exception e) {
            this.f25575a.eLog.c(this.f25575a.tag, e.getClass().getName().concat(" in onSensorChanged"), MapsKt.j(new Pair("sensorType", Integer.valueOf(event.sensor.getType())), new Pair("message", e.getMessage())));
            this.f25575a.eLog.c(this.f25575a.tag, UtilsKt.stackTraceToStringOneLine(e));
        }
    }
}
