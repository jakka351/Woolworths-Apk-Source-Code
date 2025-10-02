package me.oriient.internal.services.sensorsManager.support;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\f\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\"\u0010!J\u001d\u0010#\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\"\u0010'\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010(R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010(¨\u00069"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSenderImpl;", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesELogSender;", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "<init>", "(Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "", "relevantSensors", "", "", "", "createSensorsELogParamsMap", "(Ljava/util/List;)Ljava/util/Map;", "", "lastSendTimestampMillis", "canSendELog", "(J)Z", "sensorType", "isCritical", "", "sendFreezeDetected", "(IZ)V", "sendRecoverySuccessful", "(Z)V", "sendRestartNeeded", "()V", "sendRestartSuccessful", "sendRestartFailed", "sensors", "sendEmptySensorFrame", "(Ljava/util/List;)V", "sendNaNSensorFrame", "sendStuckSensorFrame", "reset", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "eLogIntervalMillis", "J", "getELogIntervalMillis", "()J", "setELogIntervalMillis", "(J)V", "", "lastFreezeDetectedTimestamps", "Ljava/util/Map;", "lastRecoverySuccessTimestampMillis", "lastRestartSuccessTimestampMillis", "lastRestartFailureTimestampMillis", "lastRestartNeededTimestampMillis", "lastEmptyFrameTimestampMillis", "lastNaNTimestampMillis", "lastStuckTimestampMillis", "Companion", "me/oriient/internal/services/sensorsManager/support/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SensorIssuesELogSenderImpl implements SensorIssuesELogSender {

    @NotNull
    private static final a Companion = new a();

    @NotNull
    private static final String TAG = "SensorIssuesELogSender";

    @NotNull
    private final ELog eLog;
    private long eLogIntervalMillis;
    private long lastEmptyFrameTimestampMillis;

    @NotNull
    private final Map<Integer, Long> lastFreezeDetectedTimestamps;
    private long lastNaNTimestampMillis;
    private long lastRecoverySuccessTimestampMillis;
    private long lastRestartFailureTimestampMillis;
    private long lastRestartNeededTimestampMillis;
    private long lastRestartSuccessTimestampMillis;
    private long lastStuckTimestampMillis;

    @NotNull
    private final TimeProvider timeProvider;

    public SensorIssuesELogSenderImpl(@NotNull ELog eLog, @NotNull TimeProvider timeProvider) {
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(timeProvider, "timeProvider");
        this.eLog = eLog;
        this.timeProvider = timeProvider;
        this.eLogIntervalMillis = 5000L;
        this.lastFreezeDetectedTimestamps = new LinkedHashMap();
    }

    private final boolean canSendELog(long lastSendTimestampMillis) {
        return this.timeProvider.timeIntervalSinceNow(lastSendTimestampMillis) > getELogIntervalMillis();
    }

    private final Map<String, Boolean> createSensorsELogParamsMap(List<Integer> relevantSensors) {
        int iH = MapsKt.h(CollectionsKt.s(relevantSensors, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator<T> it = relevantSensors.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(YU.a.d(((Number) it.next()).intValue(), "sensor_type_"), Boolean.TRUE);
        }
        return linkedHashMap;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public long getELogIntervalMillis() {
        return this.eLogIntervalMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void reset() {
        this.lastFreezeDetectedTimestamps.clear();
        this.lastRecoverySuccessTimestampMillis = 0L;
        this.lastRestartSuccessTimestampMillis = 0L;
        this.lastRestartFailureTimestampMillis = 0L;
        this.lastRestartNeededTimestampMillis = 0L;
        this.lastEmptyFrameTimestampMillis = 0L;
        this.lastNaNTimestampMillis = 0L;
        this.lastStuckTimestampMillis = 0L;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendEmptySensorFrame(@NotNull List<Integer> sensors) {
        Intrinsics.h(sensors, "sensors");
        if (canSendELog(this.lastEmptyFrameTimestampMillis)) {
            this.lastEmptyFrameTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.e(TAG, "Empty sensor frame", createSensorsELogParamsMap(sensors));
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendFreezeDetected(int sensorType, boolean isCritical) {
        Long l = this.lastFreezeDetectedTimestamps.get(Integer.valueOf(sensorType));
        if (canSendELog(l != null ? l.longValue() : 0L)) {
            this.lastFreezeDetectedTimestamps.put(Integer.valueOf(sensorType), Long.valueOf(this.timeProvider.getCurrentTimeMillis()));
            this.eLog.d(TAG, "Sensor is frozen", MapsKt.j(new Pair("sensorType", Integer.valueOf(sensorType)), new Pair("isCritical", Boolean.valueOf(isCritical))));
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendNaNSensorFrame(@NotNull List<Integer> sensors) {
        Intrinsics.h(sensors, "sensors");
        if (canSendELog(this.lastNaNTimestampMillis)) {
            this.lastNaNTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.e(TAG, "Sensor frame with NaNs", createSensorsELogParamsMap(sensors));
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendRecoverySuccessful(boolean isCritical) {
        if (canSendELog(this.lastRecoverySuccessTimestampMillis)) {
            this.lastRecoverySuccessTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.d(TAG, "Sensor recovered successfully", MapsKt.i(new Pair("isCritical", Boolean.valueOf(isCritical))));
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendRestartFailed() {
        if (canSendELog(this.lastRestartFailureTimestampMillis)) {
            this.lastRestartFailureTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.e(TAG, "Sensors restart failed");
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendRestartNeeded() {
        if (canSendELog(this.lastRestartNeededTimestampMillis)) {
            this.lastRestartNeededTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.w(TAG, "Sensors restart needed");
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendRestartSuccessful() {
        if (canSendELog(this.lastRestartSuccessTimestampMillis)) {
            this.lastRestartSuccessTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.d(TAG, "Sensors restarted successfully");
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void sendStuckSensorFrame(@NotNull List<Integer> sensors) {
        Intrinsics.h(sensors, "sensors");
        if (canSendELog(this.lastStuckTimestampMillis)) {
            this.lastStuckTimestampMillis = this.timeProvider.getCurrentTimeMillis();
            this.eLog.e(TAG, "Sensors Stuck", createSensorsELogParamsMap(sensors));
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender
    public void setELogIntervalMillis(long j) {
        this.eLogIntervalMillis = j;
    }
}
