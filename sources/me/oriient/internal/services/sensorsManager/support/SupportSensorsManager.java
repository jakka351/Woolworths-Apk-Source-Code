package me.oriient.internal.services.sensorsManager.support;

import android.hardware.Sensor;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0003*+,J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H&J\u001a\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\nH&J \u0010(\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "Lme/oriient/internal/services/sensorsManager/support/SensorsManagerMetadataProvider;", "delegate", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;)V", "hasBarometer", "", "getHasBarometer", "()Z", "isOn", "isValid", "missingSensors", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "getMissingSensors", "()Ljava/util/List;", "sessionStartTimeMilliUTC", "", "getSessionStartTimeMilliUTC", "()J", "onNewConfig", "", "sensorManagerConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "restartSensors", "isMultiFloorRequest", "retainState", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;", "turnOnSensor", "index", "", "sensor", "Landroid/hardware/Sensor;", "turnSensorsOff", "continueSession", "turnSensorsOn", "sessionStartTimeUTC", "SensorIssuesCounter", "SensorIssuesReport", "SupportSensorsManagerDelegate", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SupportSensorsManager extends DiProvidable, SensorsManagerMetadataProvider {

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesCounter;", "", "numClockCorrections", "", "getNumClockCorrections", "()I", "numFreezes", "getNumFreezes", "numNan", "getNumNan", "numStuck", "getNumStuck", "numZeros", "getNumZeros", "sensor", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "getSensor", "()Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SensorIssuesCounter {
        int getNumClockCorrections();

        int getNumFreezes();

        int getNumNan();

        int getNumStuck();

        int getNumZeros();

        @NotNull
        SystemSensor getSensor();
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "", "sensorIssues", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesCounter;", "getSensorIssues", "()Ljava/util/Map;", "sensorsRestartCount", "", "getSensorsRestartCount", "()I", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SensorIssuesReport {
        @NotNull
        Map<SystemSensor, SensorIssuesCounter> getSensorIssues();

        int getSensorsRestartCount();
    }

    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J&\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\u000ej\u0002`\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "", "sensorManagerConfig", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "getSensorManagerConfig", "()Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "calcIsMultiFloorRequest", "", "onNewSample", "", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "stopEngineOnError", "Lme/oriient/internal/infra/utils/core/Outcome;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "(Lme/oriient/internal/services/sensorsManager/SensorManagerError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SupportSensorsManagerDelegate {
        boolean calcIsMultiFloorRequest();

        @NotNull
        SensorManagerConfig getSensorManagerConfig();

        void onNewSample(@NotNull SensorsDataSample sample);

        @Nullable
        Object stopEngineOnError(@NotNull SensorManagerError sensorManagerError, @NotNull Continuation<? super Outcome<Unit, Exception>> continuation);
    }

    @Nullable
    SupportSensorsManagerDelegate getDelegate();

    boolean getHasBarometer();

    @NotNull
    List<SystemSensor> getMissingSensors();

    long getSessionStartTimeMilliUTC();

    boolean isOn();

    boolean isValid();

    void onNewConfig(@NotNull SensorManagerConfig sensorManagerConfig);

    void restartSensors(boolean isMultiFloorRequest, boolean retainState, @NotNull SensorsDataProvider.SessionStartListener listener);

    void setDelegate(@Nullable SupportSensorsManagerDelegate supportSensorsManagerDelegate);

    void turnOnSensor(int index, @Nullable Sensor sensor);

    void turnSensorsOff(boolean continueSession);

    void turnSensorsOn(boolean isMultiFloorRequest, long sessionStartTimeUTC, @NotNull SensorsDataProvider.SessionStartListener listener);
}
