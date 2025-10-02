package me.oriient.internal.services.sensorsManager;

import android.hardware.SensorEvent;

/* loaded from: classes7.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25561a;
    public final /* synthetic */ SensorsDataProviderImpl b;

    public S(SensorsDataProviderImpl sensorsDataProviderImpl, int i) {
        this.b = sensorsDataProviderImpl;
        this.f25561a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SensorsDataProviderImpl sensorsDataProviderImpl = this.b;
            int i = this.f25561a;
            SensorEvent sensorEventCreateSensorEventByReflection = sensorsDataProviderImpl.createSensorEventByReflection(i, sensorsDataProviderImpl.getNextTimestamp(i));
            if (sensorEventCreateSensorEventByReflection != null) {
                this.b.onSensorChanged(sensorEventCreateSensorEventByReflection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
