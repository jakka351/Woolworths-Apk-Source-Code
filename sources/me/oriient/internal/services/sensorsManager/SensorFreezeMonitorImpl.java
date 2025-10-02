package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R*\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010H\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010K\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\"\u0010N\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010@R\u0016\u0010[\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010$\u001a\u0004\u0018\u00010\\8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitorImpl;", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "<init>", "(Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "", "runMonitorTask", "()V", "monitorTask", "onSensorsNotFrozen", "", "currentTimeMillis", "", "", "", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$SensorData;", "frozenSensors", "onSensorFrozen", "(JLjava/util/List;)V", "type", "", "isSensorCritical", "(I)Z", "lastEventTimestampNano", "thresholdMillis", "isSensorFrozen", "(ILjava/lang/Long;JJ)Z", "start", "stop", "Lme/oriient/internal/infra/utils/core/Logger;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "value", "isEnabled", "Z", "()Z", "setEnabled", "(Z)V", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "delegate", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$Delegate;)V", "Lme/oriient/internal/services/sensorsManager/B;", "sensorTimestampsProvider", "Lme/oriient/internal/services/sensorsManager/B;", "getSensorTimestampsProvider", "()Lme/oriient/internal/services/sensorsManager/B;", "setSensorTimestampsProvider", "(Lme/oriient/internal/services/sensorsManager/B;)V", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "state", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "getState", "()Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;", "setState", "(Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$State;)V", "monitoringIntervalMillis", "J", "getMonitoringIntervalMillis", "()J", "setMonitoringIntervalMillis", "(J)V", "sensorsDataRelevanceLimitMillis", "getSensorsDataRelevanceLimitMillis", "setSensorsDataRelevanceLimitMillis", "sensorsDataRelevanceLimitPressureMillis", "getSensorsDataRelevanceLimitPressureMillis", "setSensorsDataRelevanceLimitPressureMillis", "recoveryWaitingDurationMillis", "getRecoveryWaitingDurationMillis", "setRecoveryWaitingDurationMillis", "restartWaitingDurationMillis", "getRestartWaitingDurationMillis", "setRestartWaitingDurationMillis", "criticalSensorTypes", "Ljava/util/List;", "getCriticalSensorTypes", "()Ljava/util/List;", "setCriticalSensorTypes", "(Ljava/util/List;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "recoveryStartTimestampMillis", "restartStartTimestampMillis", "Lkotlinx/coroutines/Job;", "monitorJob", "Lkotlinx/coroutines/Job;", "setMonitorJob", "(Lkotlinx/coroutines/Job;)V", "Companion", "me/oriient/internal/services/sensorsManager/C", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SensorFreezeMonitorImpl implements SensorFreezeMonitor {

    @NotNull
    private static final C Companion = new C();

    @NotNull
    private static final String TAG = "SensorFreezeMonitor";

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private List<Integer> criticalSensorTypes;

    @Nullable
    private SensorFreezeMonitor.Delegate delegate;
    private boolean isEnabled;

    @NotNull
    private final Logger logger;

    @Nullable
    private Job monitorJob;
    private long monitoringIntervalMillis;
    private long recoveryStartTimestampMillis;
    private long recoveryWaitingDurationMillis;
    private long restartStartTimestampMillis;
    private long restartWaitingDurationMillis;

    @Nullable
    private B sensorTimestampsProvider;
    private long sensorsDataRelevanceLimitMillis;
    private long sensorsDataRelevanceLimitPressureMillis;

    @NotNull
    private SensorFreezeMonitor.State state;

    @NotNull
    private final TimeProvider timeProvider;

    public SensorFreezeMonitorImpl(@NotNull CoroutineContextProvider coroutineContextProvider, @NotNull Logger logger, @NotNull TimeProvider timeProvider) {
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
        this.logger = logger;
        this.timeProvider = timeProvider;
        this.isEnabled = true;
        this.state = SensorFreezeMonitor.State.NORMAL;
        this.monitoringIntervalMillis = 500L;
        this.sensorsDataRelevanceLimitMillis = 100L;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.sensorsDataRelevanceLimitPressureMillis = timeUnit.toMillis(10L);
        this.recoveryWaitingDurationMillis = timeUnit.toMillis(3L);
        this.restartWaitingDurationMillis = timeUnit.toMillis(5L);
        this.criticalSensorTypes = CollectionsKt.R(Integer.valueOf(SystemSensor.GYROSCOPE.getOsSensorType()), Integer.valueOf(SystemSensor.ACCELEROMETER.getOsSensorType()), Integer.valueOf(SystemSensor.MAGNETIC_FIELD.getOsSensorType()), Integer.valueOf(SystemSensor.GAME_ROTATION_VECTOR.getOsSensorType()));
        this.coroutineScope = CoroutineScopeKt.a(coroutineContextProvider.newSingleThreadCoroutineContext());
        this.recoveryStartTimestampMillis = -1L;
        this.restartStartTimestampMillis = -1L;
    }

    private final boolean isSensorCritical(int type) {
        return getCriticalSensorTypes().contains(Integer.valueOf(type));
    }

    private final boolean isSensorFrozen(int type, Long lastEventTimestampNano, long currentTimeMillis, long thresholdMillis) {
        return (lastEventTimestampNano != null ? currentTimeMillis - TimeUnit.NANOSECONDS.toMillis(lastEventTimestampNano.longValue()) : 0L) > thresholdMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void monitorTask() {
        Map sensorsTimestamps;
        long sensorsDataRelevanceLimitMillis;
        B sensorTimestampsProvider = getSensorTimestampsProvider();
        if (sensorTimestampsProvider == null || (sensorsTimestamps = sensorTimestampsProvider.getSensorsTimestamps()) == null) {
            return;
        }
        if (!sensorsTimestamps.isEmpty()) {
            for (Map.Entry entry : sensorsTimestamps.entrySet()) {
                if (isSensorCritical(((Number) entry.getKey()).intValue()) && ((SensorFreezeMonitor.SensorData) entry.getValue()).isEmpty()) {
                    this.logger.d(TAG, "monitorTask: not all buffers have at least one sample");
                    return;
                }
            }
        }
        long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
        Set setEntrySet = sensorsTimestamps.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry2 = (Map.Entry) obj;
            int iIntValue = ((Number) entry2.getKey()).intValue();
            Long lastTimestampNanos = ((SensorFreezeMonitor.SensorData) entry2.getValue()).getLastTimestampNanos();
            boolean z = ((Number) entry2.getKey()).intValue() == SystemSensor.PRESSURE.getOsSensorType();
            if (z) {
                sensorsDataRelevanceLimitMillis = getSensorsDataRelevanceLimitPressureMillis();
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                sensorsDataRelevanceLimitMillis = getSensorsDataRelevanceLimitMillis();
            }
            if (isSensorFrozen(iIntValue, lastTimestampNanos, currentTimeMillis, sensorsDataRelevanceLimitMillis)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (!zIsEmpty) {
            onSensorFrozen(currentTimeMillis, arrayList);
        } else if (zIsEmpty) {
            onSensorsNotFrozen();
        }
    }

    private final void onSensorFrozen(long currentTimeMillis, List<? extends Map.Entry<Integer, SensorFreezeMonitor.SensorData>> frozenSensors) {
        Object next;
        Iterator<T> it = frozenSensors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (isSensorCritical(((Number) ((Map.Entry) next).getKey()).intValue())) {
                    break;
                }
            }
        }
        Map.Entry<Integer, SensorFreezeMonitor.SensorData> entry = (Map.Entry) next;
        int i = D.$EnumSwitchMapping$0[getState().ordinal()];
        if (i == 1) {
            if (entry != null) {
                this.logger.d(TAG, "onSensorFrozen: state is normal - moving to recovery (critical)");
                setState(SensorFreezeMonitor.State.RECOVERY);
                this.recoveryStartTimestampMillis = currentTimeMillis;
            } else {
                this.logger.d(TAG, "onSensorFrozen: state is normal - moving to recovery (not-critical)");
                setState(SensorFreezeMonitor.State.NON_CRITICAL_RECOVERY);
            }
            SensorFreezeMonitor.Delegate delegate = getDelegate();
            if (delegate != null) {
                delegate.onFreezeDetected((entry == null ? frozenSensors.get(0) : entry).getKey().intValue(), entry != null);
                return;
            }
            return;
        }
        if (i == 2) {
            if (entry != null) {
                this.logger.d(TAG, "onSensorFrozen: state is non-critical-recovery - moving to recovery (critical)");
                setState(SensorFreezeMonitor.State.RECOVERY);
                this.recoveryStartTimestampMillis = currentTimeMillis;
                SensorFreezeMonitor.Delegate delegate2 = getDelegate();
                if (delegate2 != null) {
                    delegate2.onFreezeDetected(entry.getKey().intValue(), true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            long j = this.recoveryStartTimestampMillis;
            if (j > 0 && currentTimeMillis - j < getRecoveryWaitingDurationMillis()) {
                this.logger.d(TAG, "onSensorFrozen: recovery duration not passed. waiting.");
                return;
            }
            this.logger.d(TAG, "onSensorFrozen: recovery duration passed. moving to restart");
            setState(SensorFreezeMonitor.State.RESTART);
            this.restartStartTimestampMillis = currentTimeMillis;
            this.recoveryStartTimestampMillis = -1L;
            SensorFreezeMonitor.Delegate delegate3 = getDelegate();
            if (delegate3 != null) {
                delegate3.onRestartNeeded();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            this.logger.e(TAG, "onSensorFrozen: monitor is in error. should restart monitor");
            return;
        }
        long j2 = this.restartStartTimestampMillis;
        if (j2 > 0 && currentTimeMillis - j2 < getRestartWaitingDurationMillis()) {
            this.logger.d(TAG, "onSensorFrozen: restart duration not passed. waiting.");
            return;
        }
        this.logger.d(TAG, "onSensorFrozen: restart duration passed. failing");
        setState(SensorFreezeMonitor.State.ERROR);
        SensorFreezeMonitor.Delegate delegate4 = getDelegate();
        if (delegate4 != null) {
            delegate4.onRestartFailed();
        }
    }

    private final void onSensorsNotFrozen() {
        int i = D.$EnumSwitchMapping$0[getState().ordinal()];
        if (i == 2) {
            this.logger.d(TAG, "onSensorsNotFrozen: non critical recovery successful");
            setState(SensorFreezeMonitor.State.NORMAL);
            SensorFreezeMonitor.Delegate delegate = getDelegate();
            if (delegate != null) {
                delegate.onSuccessfulRecovery(false);
                return;
            }
            return;
        }
        if (i == 3) {
            this.logger.d(TAG, "onSensorsNotFrozen: recovery successful");
            setState(SensorFreezeMonitor.State.NORMAL);
            this.recoveryStartTimestampMillis = -1L;
            SensorFreezeMonitor.Delegate delegate2 = getDelegate();
            if (delegate2 != null) {
                delegate2.onSuccessfulRecovery(true);
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            this.logger.e(TAG, "onSensorsNotFrozen: monitor is in error. should restart monitor");
            return;
        }
        this.logger.d(TAG, "onSensorsNotFrozen: restart successful");
        setState(SensorFreezeMonitor.State.NORMAL);
        this.restartStartTimestampMillis = -1L;
        SensorFreezeMonitor.Delegate delegate3 = getDelegate();
        if (delegate3 != null) {
            delegate3.onSuccessfulRestart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runMonitorTask() {
        setMonitorJob(BuildersKt.c(this.coroutineScope, null, null, new E(this, null), 3));
    }

    private final void setMonitorJob(Job job) {
        Job job2 = this.monitorJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.monitorJob = job;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    @NotNull
    public List<Integer> getCriticalSensorTypes() {
        return this.criticalSensorTypes;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    @Nullable
    public SensorFreezeMonitor.Delegate getDelegate() {
        return this.delegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public long getMonitoringIntervalMillis() {
        return this.monitoringIntervalMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public long getRecoveryWaitingDurationMillis() {
        return this.recoveryWaitingDurationMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public long getRestartWaitingDurationMillis() {
        return this.restartWaitingDurationMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    @Nullable
    public B getSensorTimestampsProvider() {
        return this.sensorTimestampsProvider;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public long getSensorsDataRelevanceLimitMillis() {
        return this.sensorsDataRelevanceLimitMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public long getSensorsDataRelevanceLimitPressureMillis() {
        return this.sensorsDataRelevanceLimitPressureMillis;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    @NotNull
    public SensorFreezeMonitor.State getState() {
        return this.state;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    /* renamed from: isEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setCriticalSensorTypes(@NotNull List<Integer> list) {
        Intrinsics.h(list, "<set-?>");
        this.criticalSensorTypes = list;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setDelegate(@Nullable SensorFreezeMonitor.Delegate delegate) {
        this.delegate = delegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setEnabled(boolean z) {
        this.isEnabled = z;
        if (z || this.monitorJob == null) {
            return;
        }
        stop();
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setMonitoringIntervalMillis(long j) {
        this.monitoringIntervalMillis = j;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setRecoveryWaitingDurationMillis(long j) {
        this.recoveryWaitingDurationMillis = j;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setRestartWaitingDurationMillis(long j) {
        this.restartWaitingDurationMillis = j;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setSensorTimestampsProvider(@Nullable B b) {
        this.sensorTimestampsProvider = b;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setSensorsDataRelevanceLimitMillis(long j) {
        this.sensorsDataRelevanceLimitMillis = j;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void setSensorsDataRelevanceLimitPressureMillis(long j) {
        this.sensorsDataRelevanceLimitPressureMillis = j;
    }

    public void setState(@NotNull SensorFreezeMonitor.State state) {
        Intrinsics.h(state, "<set-?>");
        this.state = state;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void start() {
        this.logger.d(TAG, "start() called");
        if (getIsEnabled()) {
            runMonitorTask();
        } else {
            this.logger.d(TAG, "start: monitor disabled - not starting...");
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorFreezeMonitor
    public void stop() {
        this.logger.d(TAG, "stop() called");
        setState(SensorFreezeMonitor.State.NORMAL);
        this.recoveryStartTimestampMillis = -1L;
        this.restartStartTimestampMillis = -1L;
        setMonitorJob(null);
    }
}
