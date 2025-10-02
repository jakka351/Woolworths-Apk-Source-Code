package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* loaded from: classes7.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsManagerImpl f25577a;
    public final /* synthetic */ Sensor b;
    public final /* synthetic */ OriientSensorWrapper c;

    public i0(SensorsManagerImpl sensorsManagerImpl, Sensor sensor, OriientSensorWrapper oriientSensorWrapper) {
        this.f25577a = sensorsManagerImpl;
        this.b = sensor;
        this.c = oriientSensorWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = this.f25577a.sensorDelayMicro;
            int minDelay = this.b.getMinDelay();
            int i2 = i < minDelay ? minDelay : i;
            this.c.setSensorDelay(i2);
            if (!this.f25577a.systemSensorManager.registerListener(this.f25577a.systemSensorListener, this.b, i2, this.c.getMaxReportLatencyMicroSec(), this.f25577a.sensorsDataReceiver)) {
                this.f25577a.eLog.e("SensorsManager" + System.identityHashCode(this), "failed to start sensor", MapsKt.i(new Pair("sensorType", Integer.valueOf(this.b.getType()))));
                return;
            }
            this.f25577a.eLog.d("SensorsManager" + System.identityHashCode(this), "started sensor", MapsKt.i(new Pair("sensorType", Integer.valueOf(this.b.getType()))));
            if (this.c.getType() == 6) {
                this.f25577a.isPressureOn = true;
            }
        } catch (Exception e) {
            this.f25577a.eLog.c(this.f25577a.tag, "error starting sensor", MapsKt.j(new Pair("sensorType", Integer.valueOf(this.b.getType())), new Pair("errorMessage", e.getMessage())));
        }
    }
}
