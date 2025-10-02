package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\u0005\u001cJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "errors", "Lme/oriient/internal/services/sensorsManager/support/b;", "processSampleErrors", "(Ljava/util/List;)Lme/oriient/internal/services/sensorsManager/support/b;", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "getIssuesSnapshot", "()Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "", "reset", "()V", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "sensorManagerConfig", "onNewConfig", "(Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;)V", "start", "stop", "", "sensorType", "onSensorClockCorrection", "(I)V", "", "getAreSensorsFrozen", "()Z", "areSensorsFrozen", "Lme/oriient/internal/services/sensorsManager/support/c;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/support/c;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/support/c;)V", "delegate", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorIssuesMonitor extends DiProvidable {
    boolean getAreSensorsFrozen();

    @Nullable
    c getDelegate();

    @NotNull
    SupportSensorsManager.SensorIssuesReport getIssuesSnapshot();

    void onNewConfig(@NotNull SensorManagerConfig sensorManagerConfig);

    void onSensorClockCorrection(int sensorType);

    @NotNull
    b processSampleErrors(@NotNull List<? extends SensorManagerError> errors);

    void reset();

    void setDelegate(@Nullable c cVar);

    void start();

    void stop();
}
