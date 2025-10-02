package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\tH&J\b\u0010\u0015\u001a\u00020\tH&J\b\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u0017\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSender;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "eLogIntervalMillis", "", "getELogIntervalMillis", "()J", "setELogIntervalMillis", "(J)V", "reset", "", "sendEmptySensorFrame", "sensors", "", "", "sendFreezeDetected", "sensorType", "isCritical", "", "sendNaNSensorFrame", "sendRecoverySuccessful", "sendRestartFailed", "sendRestartNeeded", "sendRestartSuccessful", "sendStuckSensorFrame", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorIssuesELogSender extends DiProvidable {
    long getELogIntervalMillis();

    void reset();

    void sendEmptySensorFrame(@NotNull List<Integer> sensors);

    void sendFreezeDetected(int sensorType, boolean isCritical);

    void sendNaNSensorFrame(@NotNull List<Integer> sensors);

    void sendRecoverySuccessful(boolean isCritical);

    void sendRestartFailed();

    void sendRestartNeeded();

    void sendRestartSuccessful();

    void sendStuckSensorFrame(@NotNull List<Integer> sensors);

    void setELogIntervalMillis(long j);
}
