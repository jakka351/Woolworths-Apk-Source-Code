package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.sensorsManager.SensorInformation;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorsManagerMetadataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getConfiguration", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "getSensorIssuesSnapshot", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "getSensorsInformation", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "Lme/oriient/internal/services/sensorsManager/SensorInformation;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorsManagerMetadataProvider extends DiProvidable {
    @NotNull
    SensorManagerConfig getConfiguration();

    @NotNull
    SupportSensorsManager.SensorIssuesReport getSensorIssuesSnapshot();

    @NotNull
    Map<SystemSensor, SensorInformation> getSensorsInformation();
}
