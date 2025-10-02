package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u000445*6J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0007\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u001c\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010)\u001a\u0004\u0018\u00010$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010/\u001a\u0004\u0018\u00010*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "", "start", "()V", "stop", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "", "getMonitoringIntervalMillis", "()J", "setMonitoringIntervalMillis", "(J)V", "monitoringIntervalMillis", "getSensorsDataRelevanceLimitMillis", "setSensorsDataRelevanceLimitMillis", "sensorsDataRelevanceLimitMillis", "getSensorsDataRelevanceLimitPressureMillis", "setSensorsDataRelevanceLimitPressureMillis", "sensorsDataRelevanceLimitPressureMillis", "getRecoveryWaitingDurationMillis", "setRecoveryWaitingDurationMillis", "recoveryWaitingDurationMillis", "getRestartWaitingDurationMillis", "setRestartWaitingDurationMillis", "restartWaitingDurationMillis", "", "", "getCriticalSensorTypes", "()Ljava/util/List;", "setCriticalSensorTypes", "(Ljava/util/List;)V", "criticalSensorTypes", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;)V", "delegate", "Lme/oriient/internal/services/sensorsManager/B;", "getSensorTimestampsProvider", "()Lme/oriient/internal/services/sensorsManager/B;", "setSensorTimestampsProvider", "(Lme/oriient/internal/services/sensorsManager/B;)V", "sensorTimestampsProvider", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "getState", "()Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "state", "Delegate", "SensorData", "State", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SensorFreezeMonitor extends DiProvidable {

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "", "onFreezeDetected", "", "sensorType", "", "isCritical", "", "onRestartFailed", "onRestartNeeded", "onSuccessfulRecovery", "onSuccessfulRestart", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Delegate {
        void onFreezeDetected(int sensorType, boolean isCritical);

        void onRestartFailed();

        void onRestartNeeded();

        void onSuccessfulRecovery(boolean isCritical);

        void onSuccessfulRestart();
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$SensorData;", "", "isEmpty", "", "lastTimestampNanos", "", "(ZLjava/lang/Long;)V", "()Z", "getLastTimestampNanos", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(ZLjava/lang/Long;)Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$SensorData;", "equals", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SensorData {
        private final boolean isEmpty;

        @Nullable
        private final Long lastTimestampNanos;

        public SensorData(boolean z, @Nullable Long l) {
            this.isEmpty = z;
            this.lastTimestampNanos = l;
        }

        public static /* synthetic */ SensorData copy$default(SensorData sensorData, boolean z, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sensorData.isEmpty;
            }
            if ((i & 2) != 0) {
                l = sensorData.lastTimestampNanos;
            }
            return sensorData.copy(z, l);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEmpty() {
            return this.isEmpty;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Long getLastTimestampNanos() {
            return this.lastTimestampNanos;
        }

        @NotNull
        public final SensorData copy(boolean isEmpty, @Nullable Long lastTimestampNanos) {
            return new SensorData(isEmpty, lastTimestampNanos);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SensorData)) {
                return false;
            }
            SensorData sensorData = (SensorData) other;
            return this.isEmpty == sensorData.isEmpty && Intrinsics.c(this.lastTimestampNanos, sensorData.lastTimestampNanos);
        }

        @Nullable
        public final Long getLastTimestampNanos() {
            return this.lastTimestampNanos;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isEmpty) * 31;
            Long l = this.lastTimestampNanos;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public String toString() {
            return "SensorData(isEmpty=" + this.isEmpty + ", lastTimestampNanos=" + this.lastTimestampNanos + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "", "(Ljava/lang/String;I)V", "NORMAL", "NON_CRITICAL_RECOVERY", "RECOVERY", "RESTART", "ERROR", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NORMAL = new State("NORMAL", 0);
        public static final State NON_CRITICAL_RECOVERY = new State("NON_CRITICAL_RECOVERY", 1);
        public static final State RECOVERY = new State("RECOVERY", 2);
        public static final State RESTART = new State("RESTART", 3);
        public static final State ERROR = new State("ERROR", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NORMAL, NON_CRITICAL_RECOVERY, RECOVERY, RESTART, ERROR};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.a(stateArr$values);
        }

        private State(String str, int i) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @NotNull
    List<Integer> getCriticalSensorTypes();

    @Nullable
    Delegate getDelegate();

    long getMonitoringIntervalMillis();

    long getRecoveryWaitingDurationMillis();

    long getRestartWaitingDurationMillis();

    @Nullable
    B getSensorTimestampsProvider();

    long getSensorsDataRelevanceLimitMillis();

    long getSensorsDataRelevanceLimitPressureMillis();

    @NotNull
    State getState();

    boolean isEnabled();

    void setCriticalSensorTypes(@NotNull List<Integer> list);

    void setDelegate(@Nullable Delegate delegate);

    void setEnabled(boolean z);

    void setMonitoringIntervalMillis(long j);

    void setRecoveryWaitingDurationMillis(long j);

    void setRestartWaitingDurationMillis(long j);

    void setSensorTimestampsProvider(@Nullable B b);

    void setSensorsDataRelevanceLimitMillis(long j);

    void setSensorsDataRelevanceLimitPressureMillis(long j);

    void start();

    void stop();
}
