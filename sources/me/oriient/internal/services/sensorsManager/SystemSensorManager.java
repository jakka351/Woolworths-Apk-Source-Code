package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Handler;
import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J0\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "isOk", "", "()Z", "getDefaultSensor", "Landroid/hardware/Sensor;", "type", "", "registerListener", "systemSensorListener", "Landroid/hardware/SensorEventListener;", "sensor", "samplingPeriodMicroSec", "maxReportLatencyMicroSec", "handler", "Landroid/os/Handler;", "unregisterListener", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SystemSensorManager extends DiProvidable {
    @Nullable
    Sensor getDefaultSensor(int type);

    boolean isOk();

    boolean registerListener(@NotNull SensorEventListener systemSensorListener, @NotNull Sensor sensor, int samplingPeriodMicroSec, int maxReportLatencyMicroSec, @NotNull Handler handler);

    void unregisterListener(@NotNull SensorEventListener systemSensorListener, @Nullable Sensor sensor);
}
