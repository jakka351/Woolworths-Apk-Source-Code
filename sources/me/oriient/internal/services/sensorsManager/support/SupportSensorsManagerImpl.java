package me.oriient.internal.services.sensorsManager.support;

import android.hardware.Sensor;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.dataModel.sensors.SensorsConfig;
import me.oriient.internal.services.dataModel.sensors.SensorsConfigResponse;
import me.oriient.internal.services.dataModel.sensors.SensorsManagerConfigResponse;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor;
import me.oriient.internal.services.sensorsManager.K;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.SensorInformation;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorSettings;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.SensorsDataProviderDelegate;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u0081\u00012\u00020\u0001:\b\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J'\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0\bH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010B\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR$\u0010G\u001a\u0004\u0018\u00010F8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010MR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010?\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010?\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010?\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010?\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010?\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010AR\u0014\u0010v\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010w¨\u0006\u0086\u0001"}, d2 = {"Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManagerImpl;", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager;", "Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactory;", "sensorsDataProviderFactory", "<init>", "(Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactory;)V", "Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;", "sensorsConfig", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "Lme/oriient/internal/services/sensorsManager/SensorSettings;", "createSensorSetting", "(Lme/oriient/internal/services/dataModel/sensors/SensorsConfig;)Ljava/util/Map;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "sample", "", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "errors", "", "onNewSample", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;Ljava/util/List;)V", "", "handleError", "(Ljava/util/List;)Z", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "sensorManagerConfig", "onNewConfig", "(Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;)V", "", "index", "Landroid/hardware/Sensor;", "sensor", "turnOnSensor", "(ILandroid/hardware/Sensor;)V", "continueSession", "turnSensorsOff", "(Z)V", "isMultiFloorRequest", "", "sessionStartTimeUTC", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "turnSensorsOn", "(ZJLme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;)V", "retainState", "restartSensors", "(ZZLme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;)V", "Lme/oriient/internal/services/sensorsManager/SensorInformation;", "getSensorsInformation", "()Ljava/util/Map;", "getConfiguration", "()Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "getSensorIssuesSnapshot", "()Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SensorIssuesReport;", "Lme/oriient/internal/services/sensorsManager/support/SensorsDataProviderFactory;", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "currentSensorsDataProvider", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;", "sensorsDataProviderDelegate", "Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;", "oldSensorsDataProvider$delegate", "Lkotlin/Lazy;", "getOldSensorsDataProvider", "()Lme/oriient/internal/services/sensorsManager/SensorsDataProvider;", "oldSensorsDataProvider", "newSensorsDataProvider$delegate", "getNewSensorsDataProvider", "newSensorsDataProvider", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "delegate", "Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "getDelegate", "()Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/support/SupportSensorsManager$SupportSensorsManagerDelegate;)V", "Lme/oriient/internal/services/dataModel/sensors/SensorManagerConfig;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "foregroundServiceMonitor$delegate", "getForegroundServiceMonitor", "()Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "foregroundServiceMonitor", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "sensorIssuesMonitor$delegate", "getSensorIssuesMonitor", "()Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "sensorIssuesMonitor", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "freezeMonitor$delegate", "getFreezeMonitor", "()Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor;", "freezeMonitor", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getSensorsDataProvider", "sensorsDataProvider", "isOn", "()Z", "isValid", "getMissingSensors", "()Ljava/util/List;", "missingSensors", "getSessionStartTimeMilliUTC", "()J", "sessionStartTimeMilliUTC", "getHasBarometer", "hasBarometer", "Companion", "me/oriient/internal/services/sensorsManager/support/j", "a", "me/oriient/internal/services/sensorsManager/support/k", "me/oriient/internal/services/sensorsManager/support/n", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SupportSensorsManagerImpl implements SupportSensorsManager {

    @NotNull
    private static final j Companion = new j();

    @NotNull
    private static final String TAG = "SupportSensorsManager";

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @NotNull
    private final CoroutineScope coroutineScope;

    @Nullable
    private SensorsDataProvider currentSensorsDataProvider;

    @Nullable
    private SupportSensorsManager.SupportSensorsManagerDelegate delegate;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: foregroundServiceMonitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy foregroundServiceMonitor;

    /* renamed from: freezeMonitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy freezeMonitor;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: newSensorsDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy newSensorsDataProvider;

    /* renamed from: oldSensorsDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oldSensorsDataProvider;

    /* renamed from: sensorIssuesMonitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensorIssuesMonitor;

    @NotNull
    private SensorManagerConfig sensorManagerConfig;

    @NotNull
    private final SensorsDataProviderDelegate sensorsDataProviderDelegate;

    @NotNull
    private final SensorsDataProviderFactory sensorsDataProviderFactory;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a RECOVERY = new a("RECOVERY", 0, (byte) 1);
        public static final a RESTART = new a("RESTART", 1, (byte) 2);
        private final byte code;

        private static final /* synthetic */ a[] $values() {
            return new a[]{RECOVERY, RESTART};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i, byte b) {
            this.code = b;
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final byte getCode() {
            return this.code;
        }
    }

    public SupportSensorsManagerImpl(@NotNull SensorsDataProviderFactory sensorsDataProviderFactory) {
        Intrinsics.h(sensorsDataProviderFactory, "sensorsDataProviderFactory");
        this.sensorsDataProviderFactory = sensorsDataProviderFactory;
        this.sensorsDataProviderDelegate = new k(this);
        this.oldSensorsDataProvider = LazyKt.b(new q(this));
        this.newSensorsDataProvider = LazyKt.b(new p(this));
        this.sensorManagerConfig = new SensorsManagerConfigResponse((Double) null, (Integer) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Double) null, (SensorsConfigResponse) null, (Boolean) null, 131071, (DefaultConstructorMarker) null).toSensorsManagerConfig();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.foregroundServiceMonitor = InternalDiKt.getDi().inject(reflectionFactory.b(ForegroundServiceMonitor.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.sensorIssuesMonitor = InternalDiKt.getDi().inject(reflectionFactory.b(SensorIssuesMonitor.class));
        this.freezeMonitor = InternalDiKt.getDi().inject(reflectionFactory.b(SensorFreezeMonitor.class));
        this.coroutineScope = CoroutineScopeKt.a(getCoroutineContextProvider().getDefault());
    }

    private final Map<SystemSensor, SensorSettings> createSensorSetting(SensorsConfig sensorsConfig) {
        return MapsKt.l(new Pair(SystemSensor.GYROSCOPE, K.a(sensorsConfig.getGyroscope())), new Pair(SystemSensor.GYROSCOPE_UNCALIBRATED, K.a(sensorsConfig.getGyroscopeUncalibrated())), new Pair(SystemSensor.ACCELEROMETER, K.a(sensorsConfig.getAccelerometer())), new Pair(SystemSensor.GAME_ROTATION_VECTOR, K.a(sensorsConfig.getGameRotation())), new Pair(SystemSensor.MAGNETIC_FIELD, K.a(sensorsConfig.getMagneticField())), new Pair(SystemSensor.MAGNETIC_FIELD_UNCALIBRATED, K.a(sensorsConfig.getMagneticFieldUncalibrated())), new Pair(SystemSensor.PRESSURE, K.a(sensorsConfig.getPressure())));
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final ForegroundServiceMonitor getForegroundServiceMonitor() {
        return (ForegroundServiceMonitor) this.foregroundServiceMonitor.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorFreezeMonitor getFreezeMonitor() {
        return (SensorFreezeMonitor) this.freezeMonitor.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final SensorsDataProvider getNewSensorsDataProvider() {
        return (SensorsDataProvider) this.newSensorsDataProvider.getD();
    }

    private final SensorsDataProvider getOldSensorsDataProvider() {
        return (SensorsDataProvider) this.oldSensorsDataProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorIssuesMonitor getSensorIssuesMonitor() {
        return (SensorIssuesMonitor) this.sensorIssuesMonitor.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorsDataProvider getSensorsDataProvider() {
        SensorsDataProvider oldSensorsDataProvider;
        SensorsDataProvider sensorsDataProvider = this.currentSensorsDataProvider;
        if (sensorsDataProvider != null) {
            return sensorsDataProvider;
        }
        boolean useNewSensorManager = this.sensorManagerConfig.getUseNewSensorManager();
        if (useNewSensorManager) {
            getLogger().d(TAG, "using new sensors data provider");
            oldSensorsDataProvider = getNewSensorsDataProvider();
        } else {
            if (useNewSensorManager) {
                throw new NoWhenBranchMatchedException();
            }
            getLogger().d(TAG, "using old sensors data provider");
            oldSensorsDataProvider = getOldSensorsDataProvider();
        }
        this.currentSensorsDataProvider = oldSensorsDataProvider;
        return oldSensorsDataProvider;
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final boolean handleError(List<? extends SensorManagerError> errors) {
        if (errors.isEmpty()) {
            return true;
        }
        b bVarProcessSampleErrors = getSensorIssuesMonitor().processSampleErrors(errors);
        SensorManagerError sensorManagerError = bVarProcessSampleErrors.f25592a;
        boolean z = bVarProcessSampleErrors.b;
        SupportSensorsManager.SupportSensorsManagerDelegate delegate = getDelegate();
        if (sensorManagerError != null && delegate != null && delegate.getSensorManagerConfig().getStopSessionOnSensorError()) {
            BuildersKt.c(this.coroutineScope, null, null, new o(delegate, sensorManagerError, this, null), 3);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewSample(SensorsDataSample sample, List<? extends SensorManagerError> errors) {
        SupportSensorsManager.SupportSensorsManagerDelegate delegate;
        if (getSensorIssuesMonitor().getAreSensorsFrozen() || !handleError(errors) || (delegate = getDelegate()) == null) {
            return;
        }
        delegate.onNewSample(sample);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorsManagerMetadataProvider
    @NotNull
    /* renamed from: getConfiguration, reason: from getter */
    public SensorManagerConfig getSensorManagerConfig() {
        return this.sensorManagerConfig;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    @Nullable
    public SupportSensorsManager.SupportSensorsManagerDelegate getDelegate() {
        return this.delegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public boolean getHasBarometer() {
        return getSensorsDataProvider().getHasBarometer();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    @NotNull
    public List<SystemSensor> getMissingSensors() {
        return getSensorsDataProvider().getMissingSensors();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorsManagerMetadataProvider
    @NotNull
    public SupportSensorsManager.SensorIssuesReport getSensorIssuesSnapshot() {
        return getSensorIssuesMonitor().getIssuesSnapshot();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SensorsManagerMetadataProvider
    @NotNull
    public Map<SystemSensor, SensorInformation> getSensorsInformation() {
        return getSensorsDataProvider().getSensorsInformation();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public long getSessionStartTimeMilliUTC() {
        return getSensorsDataProvider().getSessionStartTimeUTC();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public boolean isOn() {
        return getSensorsDataProvider().getIsOn();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public boolean isValid() {
        return getSensorsDataProvider().isValid();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void onNewConfig(@NotNull SensorManagerConfig sensorManagerConfig) {
        double sensorSamplingRateHz;
        Intrinsics.h(sensorManagerConfig, "sensorManagerConfig");
        this.sensorManagerConfig = sensorManagerConfig;
        if (!getSensorsDataProvider().getIsOn()) {
            this.currentSensorsDataProvider = null;
        }
        boolean z = sensorManagerConfig.getSensorSamplingRateHz() <= 0.0d;
        if (z) {
            sensorSamplingRateHz = 100.0d;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            sensorSamplingRateHz = sensorManagerConfig.getSensorSamplingRateHz();
        }
        SensorsDataProvider sensorsDataProvider = getSensorsDataProvider();
        int sensorsDataBufferSize = sensorManagerConfig.getSensorsDataBufferSize();
        int maxSessionLengthMin = sensorManagerConfig.getMaxSessionLengthMin();
        double d = 1 / sensorSamplingRateHz;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sensorsDataProvider.configure(sensorsDataBufferSize, maxSessionLengthMin, timeUnit.toMillis(1L) * d, sensorManagerConfig.getValidateSamples(), createSensorSetting(sensorManagerConfig.getSensorsConfig()), sensorManagerConfig.getShouldNeverStopPressure());
        getSensorIssuesMonitor().onNewConfig(sensorManagerConfig);
        getForegroundServiceMonitor().setBackgroundCheckIntervalMillis((long) (sensorManagerConfig.getForegroundServiceMonitoringIntervalSec() * timeUnit.toMillis(1L)));
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void restartSensors(boolean isMultiFloorRequest, boolean retainState, @NotNull SensorsDataProvider.SessionStartListener listener) {
        Intrinsics.h(listener, "listener");
        long sessionStartTimeUTC = getSensorsDataProvider().getSessionStartTimeUTC();
        getSensorsDataProvider().turnSensorsOff(true, retainState);
        getSensorsDataProvider().turnSensorsOn(isMultiFloorRequest, sessionStartTimeUTC, listener);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void setDelegate(@Nullable SupportSensorsManager.SupportSensorsManagerDelegate supportSensorsManagerDelegate) {
        this.delegate = supportSensorsManagerDelegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void turnOnSensor(int index, @Nullable Sensor sensor) {
        getSensorsDataProvider().turnOnSensor(index, sensor);
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void turnSensorsOff(boolean continueSession) {
        getSensorsDataProvider().turnSensorsOff(continueSession, false);
        getSensorIssuesMonitor().stop();
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager
    public void turnSensorsOn(boolean isMultiFloorRequest, long sessionStartTimeUTC, @NotNull SensorsDataProvider.SessionStartListener listener) {
        Intrinsics.h(listener, "listener");
        getSensorsDataProvider().turnSensorsOn(isMultiFloorRequest, sessionStartTimeUTC, listener);
        getSensorIssuesMonitor().start();
    }
}
