package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorInformation;", "", "batchingSupported", "", "getBatchingSupported", "()Z", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "type", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "getType", "()Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "vendor", "getVendor", "version", "", "getVersion", "()I", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorInformation {
    boolean getBatchingSupported();

    @NotNull
    String getName();

    @NotNull
    SystemSensor getType();

    @NotNull
    String getVendor();

    int getVersion();
}
