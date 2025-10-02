package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001;J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH&JD\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'0\u00142\u0006\u0010(\u001a\u00020\u0003H&J\u0012\u0010)\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010+H&J\u0012\u0010,\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010.H&J\u001a\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H&J\u001a\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u0003H&J \u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006<"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "hasBarometer", "", "getHasBarometer", "()Z", "isOn", "isValid", "missingSensors", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "getMissingSensors", "()Ljava/util/List;", "sensorDataBatchSize", "", "getSensorDataBatchSize", "()I", "sensorDataBufferSize", "getSensorDataBufferSize", "sensorsInformation", "", "Lme/oriient/internal/services/sensorsManager/SensorInformation;", "getSensorsInformation", "()Ljava/util/Map;", "sessionStartTimeMilliUTC", "", "getSessionStartTimeMilliUTC", "()J", "addMarker", "", "marker", "", "configure", "sensorsDataBufferSize", "maxSessionLengthMin", "sensorDelayMillis", "", "validateSamples", "sensorSettings", "Lme/oriient/internal/services/sensorsManager/SensorSettings;", "shouldNeverStopPressure", "setDelegate", "delegate", "Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;", "setTimeJumpReporter", "timeJumpReporter", "Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;", "turnOnSensor", "index", "sensor", "Landroid/hardware/Sensor;", "turnSensorsOff", "continueSession", "retainState", "turnSensorsOn", "isMultiFloorRequest", "sessionStartTimeUTC", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;", "SessionStartListener", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorsDataProvider extends DiProvidable {

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;", "", "onError", "", "error", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "onSessionStart", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SessionStartListener {
        void onError(@NotNull SensorManagerError error);

        void onSessionStart();
    }

    void addMarker(byte marker);

    void configure(int sensorsDataBufferSize, int maxSessionLengthMin, double sensorDelayMillis, boolean validateSamples, @NotNull Map<SystemSensor, SensorSettings> sensorSettings, boolean shouldNeverStopPressure);

    boolean getHasBarometer();

    @NotNull
    List<SystemSensor> getMissingSensors();

    int getSensorDataBatchSize();

    int getSensorDataBufferSize();

    @NotNull
    Map<SystemSensor, SensorInformation> getSensorsInformation();

    /* renamed from: getSessionStartTimeMilliUTC */
    long getSessionStartTimeUTC();

    /* renamed from: isOn */
    boolean getIsOn();

    boolean isValid();

    void setDelegate(@Nullable SensorsDataProviderDelegate delegate);

    void setTimeJumpReporter(@Nullable TimeJumpReporter timeJumpReporter);

    void turnOnSensor(int index, @Nullable Sensor sensor);

    void turnSensorsOff(boolean continueSession, boolean retainState);

    void turnSensorsOn(boolean isMultiFloorRequest, long sessionStartTimeUTC, @NotNull SessionStartListener listener);
}
