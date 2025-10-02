package me.oriient.positioningengine.support.engineManager;

import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.uploadingManager.DataUploadManagerFactory;
import me.oriient.internal.services.uploadingManager.DataUploadManagerFactoryImpl;
import me.oriient.internal.services.uploadingManager.models.DataUploadManagerConfig;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadingSchedulingConfig;
import me.oriient.positioningengine.common.CalibrationContext;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.WorldCoordinate;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.C1853m;
import me.oriient.positioningengine.support.C1854n;
import me.oriient.positioningengine.support.C1855o;
import me.oriient.positioningengine.support.C1856p;
import me.oriient.positioningengine.support.OnDeviceSessionsUploadManager;
import me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001VB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J'\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010T\u001a\u00020N2\u0006\u0010O\u001a\u00020N8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManagerImpl;", "Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManager;", "", "sdkType", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "dataUploadScheduledWork", "<init>", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;)V", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "trigger", "scheduledWork", "", "onUploadTrigger", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/common/CalibrationContext;", "context", "", "sensorStartTimeMillis", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "currentLocation", "userId", "startCalibrationUploading", "(Lme/oriient/positioningengine/common/CalibrationContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "startPositioningParams", "startPositioningUploading", "(Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/common/EngineStopReason;", "stopReason", "stopUploading", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "sample", "onNewSample", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;)V", "Lme/oriient/positioningengine/common/PositioningEngine;", "engine", "onNewEngine", "(Lme/oriient/positioningengine/common/PositioningEngine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exceptLastDays", "clearAllCaches", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiKey", "spaceId", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "onDeviceConfig", "setupUploadManager", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;)V", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "user", "saveLastUsed", "(Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;)V", "Ljava/lang/String;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "storage$delegate", "getStorage", "()Lme/oriient/internal/infra/persistentStorage/PersistentStorage;", "storage", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager;", "uploadManager", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager;", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "uploadManagerFactory", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "getUploadManagerFactory", "()Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "setUploadManagerFactory", "(Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;)V", "", "value", "getCanStartUploading", "()Z", "setCanStartUploading", "(Z)V", "canStartUploading", "Companion", "me/oriient/positioningengine/support/engineManager/f", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SupportEngineUploadManagerImpl implements SupportEngineUploadManager {

    @NotNull
    private static final f Companion = new f();

    @NotNull
    private static final String PREF_KEY_API_KEY = "pref_key_api_key";

    @NotNull
    private static final String PREF_KEY_ENGINE_CONFIG = "pref_key_engine_config";

    @NotNull
    private static final String PREF_KEY_SPACE_ID = "pref_key_space_id";

    @NotNull
    private static final String TAG = "SupportEngineUploadMana";

    @NotNull
    private final DataUploadScheduledWork dataUploadScheduledWork;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final String sdkType;

    /* renamed from: storage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storage;

    @Nullable
    private OnDeviceSessionsUploadManager uploadManager;

    @Nullable
    private DataUploadManagerFactory uploadManagerFactory;

    public SupportEngineUploadManagerImpl(@NotNull String sdkType, @NotNull DataUploadScheduledWork dataUploadScheduledWork) {
        Object asJson;
        EngineConfig engineConfig;
        Intrinsics.h(sdkType, "sdkType");
        Intrinsics.h(dataUploadScheduledWork, "dataUploadScheduledWork");
        this.sdkType = sdkType;
        this.dataUploadScheduledWork = dataUploadScheduledWork;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.storage = DiKt.getDi().inject(reflectionFactory.b(PersistentStorage.class));
        String string = getStorage().getString(PREF_KEY_API_KEY, null);
        String string2 = getStorage().getString(PREF_KEY_SPACE_ID, null);
        String string3 = getStorage().getString(PREF_KEY_ENGINE_CONFIG, null);
        if (string3 != null) {
            try {
                asJson = JsonSerializationKt.parseAsJson(string3, Reflection.b(EngineConfig.class));
            } catch (Throwable unused) {
                asJson = null;
            }
            engineConfig = (EngineConfig) asJson;
        } else {
            engineConfig = null;
        }
        SpecificEngineConfig specificConfig = engineConfig != null ? engineConfig.getSpecificConfig() : null;
        if (string == null || string2 == null || engineConfig == null || specificConfig == null) {
            getLogger().d(TAG, "Can't recover last on device engine config");
        } else {
            getLogger().d(TAG, "Recovered last on device engine config");
            setupUploadManager(string, string2, specificConfig);
        }
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final PersistentStorage getStorage() {
        return (PersistentStorage) this.storage.getD();
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object clearAllCaches(double d, @NotNull Continuation<? super Unit> continuation) {
        Object objClearAllCaches;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objClearAllCaches = onDeviceSessionsUploadManager.clearAllCaches(d, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objClearAllCaches;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public boolean getCanStartUploading() {
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return onDeviceSessionsUploadManager != null && onDeviceSessionsUploadManager.getCanStartUploading();
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public DataUploadManagerFactory getUploadManagerFactory() {
        return this.uploadManagerFactory;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object onNewEngine(@Nullable PositioningEngine positioningEngine, @NotNull Continuation<? super Unit> continuation) {
        Object objOnNewEngine;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objOnNewEngine = onDeviceSessionsUploadManager.onNewEngine(positioningEngine, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objOnNewEngine;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public void onNewSample(@NotNull SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        if (onDeviceSessionsUploadManager != null) {
            onDeviceSessionsUploadManager.onNewSample(sample);
        }
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull Continuation<? super Unit> continuation) {
        Object objOnUploadTrigger;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objOnUploadTrigger = onDeviceSessionsUploadManager.onUploadTrigger(uploadTrigger, dataUploadScheduledWork, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objOnUploadTrigger;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public void saveLastUsed(@NotNull EngineConfig config, @NotNull PositioningEngineCredentials user) {
        Intrinsics.h(config, "config");
        Intrinsics.h(user, "user");
        getStorage().putString(PREF_KEY_API_KEY, user.getApiKey());
        getStorage().putString(PREF_KEY_SPACE_ID, user.getSpaceId());
        getStorage().putString(PREF_KEY_ENGINE_CONFIG, JsonSerializationKt.serializeToJsonString(config));
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public void setCanStartUploading(boolean z) {
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        if (onDeviceSessionsUploadManager == null) {
            return;
        }
        onDeviceSessionsUploadManager.setCanStartUploading(z);
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public void setUploadManagerFactory(@Nullable DataUploadManagerFactory dataUploadManagerFactory) {
        this.uploadManagerFactory = dataUploadManagerFactory;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    public void setupUploadManager(@NotNull String apiKey, @NotNull String spaceId, @NotNull SpecificEngineConfig onDeviceConfig) {
        DataUploadMode scheduled;
        boolean enablePositionsUploading;
        boolean enableSensorsDataUploading;
        boolean enableValidationUploading;
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(onDeviceConfig, "onDeviceConfig");
        String str = this.sdkType;
        SpecificEngineConfig.Uploading uploading = onDeviceConfig.getUploading();
        Intrinsics.h(uploading, "<this>");
        int uploadWriteToFileRecords = uploading.getUploadWriteToFileRecords();
        double writeToFileIntervalSec = uploading.getWriteToFileIntervalSec();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        DataUploadManagerConfig dataUploadManagerConfig = new DataUploadManagerConfig(uploadWriteToFileRecords, (long) (writeToFileIntervalSec * timeUnit.toMillis(1L)), (long) uploading.getUploadChunkLengthSeconds(), (long) uploading.getUploadMaxSessionLengthMin(), uploading.getUploadingExpirationTimeDays(), new DataUploadingSchedulingConfig(uploading.getChargerTaskIntervalMin(), uploading.getControlTaskIntervalMin(), uploading.getControlTaskMaxTimeMin(), uploading.getUploadTaskMaxDelayMin()));
        SpecificEngineConfig.Uploading uploading2 = onDeviceConfig.getUploading();
        Intrinsics.h(uploading2, "<this>");
        boolean aggressiveMode = uploading2.getAggressiveMode();
        if (aggressiveMode) {
            scheduled = new DataUploadMode.Immediate();
        } else {
            if (aggressiveMode) {
                throw new NoWhenBranchMatchedException();
            }
            scheduled = new DataUploadMode.Scheduled(uploading2.getUploadingWifiRequired(), uploading2.getUploadingChargerRequired());
        }
        DataUploadManagerFactoryImpl dataUploadManagerFactoryImpl = new DataUploadManagerFactoryImpl(str, dataUploadManagerConfig, scheduled, this.dataUploadScheduledWork);
        OnDeviceSessionsUploadManagerImpl.Companion.getClass();
        OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl = new OnDeviceSessionsUploadManagerImpl(apiKey, spaceId, dataUploadManagerFactoryImpl, onDeviceConfig.getStartReportingRetryCount(), (long) (onDeviceConfig.getStartReportingRetryIntervalSeconds() * timeUnit.toMillis(1L)), (long) (onDeviceConfig.getUploading().getMetadataUpdateIntervalSec() * timeUnit.toMillis(1L)), onDeviceConfig.getUploading().getEnableRestrictedAreasValidationUploading());
        ELog eLog = (ELog) DiKt.getDi().get(Reflection.f24268a.b(ELog.class), null);
        double freeSizeBytes = onDeviceSessionsUploadManagerImpl.getSpaceUsageStats().getFreeSizeBytes() / 1048576;
        boolean enableEventsUploading = false;
        if (!onDeviceConfig.getUploading().getEnablePositionsUploading() || freeSizeBytes >= onDeviceConfig.getUploading().getMinimumStorageLeftToUploadPositionsMb()) {
            enablePositionsUploading = onDeviceConfig.getUploading().getEnablePositionsUploading();
        } else {
            eLog.i("OnDeviceSessionsUploadM", "Disabled positions uploading due to low memory", new C1854n(freeSizeBytes, onDeviceConfig));
            enablePositionsUploading = false;
        }
        if (!onDeviceConfig.getUploading().getEnableSensorsDataUploading() || freeSizeBytes >= onDeviceConfig.getUploading().getMinimumStorageLeftToUploadSensorsMb()) {
            enableSensorsDataUploading = onDeviceConfig.getUploading().getEnableSensorsDataUploading();
        } else {
            eLog.i("OnDeviceSessionsUploadM", "Disabled sensorsData uploading due to low memory", new C1855o(freeSizeBytes, onDeviceConfig));
            enableSensorsDataUploading = false;
        }
        if (!onDeviceConfig.getUploading().getEnableValidationUploading() || freeSizeBytes >= onDeviceConfig.getUploading().getMinimumStorageLeftToUploadValidationsMb()) {
            enableValidationUploading = onDeviceConfig.getUploading().getEnableValidationUploading();
        } else {
            eLog.i("OnDeviceSessionsUploadM", "Disabled validation uploading due to low memory", new C1856p(freeSizeBytes, onDeviceConfig));
            enableValidationUploading = false;
        }
        if (!onDeviceConfig.getUploading().getEnableEventsUploading() || freeSizeBytes >= onDeviceConfig.getUploading().getMinimumStorageLeftToUploadEventsMb()) {
            enableEventsUploading = onDeviceConfig.getUploading().getEnableEventsUploading();
        } else {
            eLog.i("OnDeviceSessionsUploadM", "Disabled events uploading due to low memory", new C1853m(freeSizeBytes, onDeviceConfig));
        }
        onDeviceSessionsUploadManagerImpl.setSensorsDataUploadingEnabled(enableSensorsDataUploading);
        onDeviceSessionsUploadManagerImpl.setPositionsUploadingEnabled(enablePositionsUploading);
        onDeviceSessionsUploadManagerImpl.setValidationUploadingEnabled(enableValidationUploading);
        onDeviceSessionsUploadManagerImpl.setSystemEventsUploadingEnabled(enableEventsUploading);
        this.uploadManager = onDeviceSessionsUploadManagerImpl;
        setUploadManagerFactory(dataUploadManagerFactoryImpl);
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object startCalibrationUploading(@NotNull CalibrationContext calibrationContext, long j, @Nullable WorldCoordinate worldCoordinate, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objStartCalibration;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objStartCalibration = onDeviceSessionsUploadManager.startCalibration(calibrationContext, j, worldCoordinate, str, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objStartCalibration;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object startPositioningUploading(@NotNull OnDeviceSessionsUploadManager.StartPositioningParams startPositioningParams, @NotNull Continuation<? super Unit> continuation) {
        Object objStartPositioning;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objStartPositioning = onDeviceSessionsUploadManager.startPositioning(startPositioningParams, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objStartPositioning;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager
    @Nullable
    public Object stopUploading(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Unit> continuation) {
        Object objStop;
        OnDeviceSessionsUploadManager onDeviceSessionsUploadManager = this.uploadManager;
        return (onDeviceSessionsUploadManager == null || (objStop = onDeviceSessionsUploadManager.stop(engineStopReason, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objStop;
    }
}
