package com.scandit.datacapture.core.imu;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18538a;

    public a(ImuDataCollector owner) {
        Intrinsics.h(owner, "owner");
        this.f18538a = new WeakReference(owner);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.h(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        Intrinsics.h(event, "event");
        ImuDataCollector imuDataCollector = (ImuDataCollector) this.f18538a.get();
        if (imuDataCollector != null) {
            ImuDataCollector.access$onSensorEvent(imuDataCollector, event);
        }
    }
}
