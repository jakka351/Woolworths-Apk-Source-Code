package au.com.woolworths.feature.rewards.card.customviews;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/card/customviews/CustomDeviceRotationSensor$sensorEventListener$1", "Landroid/hardware/SensorEventListener;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomDeviceRotationSensor$sensorEventListener$1 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.h(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        Intrinsics.h(event, "event");
        if (event.sensor.getType() == 11) {
            throw null;
        }
    }
}
