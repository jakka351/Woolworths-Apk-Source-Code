package me.oriient.positioningengine.support.engineManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.uploadingManager.DataUploadManagerFactory;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.positioningengine.common.CalibrationContext;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.WorldCoordinate;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.OnDeviceSessionsUploadManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H¦@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH¦@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&J \u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H&J0\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020'H¦@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u000206H¦@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020:H¦@¢\u0006\u0002\u0010;R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006<"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "canStartUploading", "", "getCanStartUploading", "()Z", "setCanStartUploading", "(Z)V", "uploadManagerFactory", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "getUploadManagerFactory", "()Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "setUploadManagerFactory", "(Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;)V", "clearAllCaches", "", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewEngine", "engine", "Lme/oriient/positioningengine/common/PositioningEngine;", "(Lme/oriient/positioningengine/common/PositioningEngine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewSample", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "onUploadTrigger", "trigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastUsed", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "user", "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "setupUploadManager", "apiKey", "", "spaceId", "onDeviceConfig", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "startCalibrationUploading", "context", "Lme/oriient/positioningengine/common/CalibrationContext;", "sensorStartTimeMillis", "", "currentLocation", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "userId", "(Lme/oriient/positioningengine/common/CalibrationContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPositioningUploading", "startPositioningParams", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "(Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopUploading", "stopReason", "Lme/oriient/positioningengine/common/EngineStopReason;", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SupportEngineUploadManager extends DiProvidable {
    @Nullable
    Object clearAllCaches(double d, @NotNull Continuation<? super Unit> continuation);

    boolean getCanStartUploading();

    @Nullable
    DataUploadManagerFactory getUploadManagerFactory();

    @Nullable
    Object onNewEngine(@Nullable PositioningEngine positioningEngine, @NotNull Continuation<? super Unit> continuation);

    void onNewSample(@NotNull SensorsDataSample sample);

    @Nullable
    Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull Continuation<? super Unit> continuation);

    void saveLastUsed(@NotNull EngineConfig config, @NotNull PositioningEngineCredentials user);

    void setCanStartUploading(boolean z);

    void setUploadManagerFactory(@Nullable DataUploadManagerFactory dataUploadManagerFactory);

    void setupUploadManager(@NotNull String apiKey, @NotNull String spaceId, @NotNull SpecificEngineConfig onDeviceConfig);

    @Nullable
    Object startCalibrationUploading(@NotNull CalibrationContext calibrationContext, long j, @Nullable WorldCoordinate worldCoordinate, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startPositioningUploading(@NotNull OnDeviceSessionsUploadManager.StartPositioningParams startPositioningParams, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stopUploading(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Unit> continuation);
}
