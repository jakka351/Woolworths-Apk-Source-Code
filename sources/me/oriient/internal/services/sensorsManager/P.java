package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sensor f25559a;
    public final /* synthetic */ SensorWrapper b;
    public final /* synthetic */ SensorsDataProviderImpl c;
    public final /* synthetic */ SensorsDataProviderImpl d;

    public P(SensorsDataProviderImpl sensorsDataProviderImpl, Sensor sensor, SensorWrapper sensorWrapper, SensorsDataProviderImpl sensorsDataProviderImpl2) {
        this.d = sensorsDataProviderImpl;
        this.f25559a = sensor;
        this.b = sensorWrapper;
        this.c = sensorsDataProviderImpl2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int iMax = Math.max(this.f25559a.getMinDelay(), this.d.sensorDelayMicro);
            this.b.setSensorDelay(iMax);
            SensorsDataProviderImpl sensorsDataProviderImpl = this.d;
            if (!sensorsDataProviderImpl.sensorManager.registerListener(this.c, this.f25559a, iMax, sensorsDataProviderImpl.sensorsDataReceiver)) {
                this.d.eLog.e(SensorsDataProviderImpl.TAG + System.identityHashCode(this), "failed to start sensor", kotlin.reflect.jvm.internal.impl.types.checker.a.k(Integer.valueOf(this.f25559a.getType())));
                return;
            }
            this.d.eLog.d(SensorsDataProviderImpl.TAG + System.identityHashCode(this), "started sensor", kotlin.reflect.jvm.internal.impl.types.checker.a.k(Integer.valueOf(this.f25559a.getType())));
            if (this.b.getType() == 6) {
                this.d.isPressureOn = true;
            }
        } catch (Exception e) {
            ELog eLog = this.d.eLog;
            String str = SensorsDataProviderImpl.TAG + System.identityHashCode(this);
            Integer numValueOf = Integer.valueOf(this.f25559a.getType());
            String message = e.getMessage();
            if (message == null) {
                message = "null";
            }
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", numValueOf), new AbstractMap.SimpleEntry("errorMessage", message)};
            HashMap map = new HashMap(2);
            for (int i = 0; i < 2; i++) {
                Map.Entry entry = entryArr[i];
                Object key = entry.getKey();
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                }
            }
            eLog.c(str, "error starting sensor", Collections.unmodifiableMap(map));
        }
    }
}
