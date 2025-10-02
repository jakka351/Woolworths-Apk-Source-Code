package me.oriient.positioningengine.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.EngineSessionAnalytics;
import me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.EnginePerformanceReport;
import me.oriient.positioningengine.ondevice.models.EngineSessionInfo;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u00108\u001a\u0004\u0018\u000109H¦@¢\u0006\u0002\u0010:J\u0010\u0010;\u001a\u0004\u0018\u00010<H¦@¢\u0006\u0002\u0010:J\u000e\u0010=\u001a\u00020>H¦@¢\u0006\u0002\u0010:J\u0010\u0010?\u001a\u0004\u0018\u00010@H¦@¢\u0006\u0002\u0010:J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH&J\u0016\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020GH¦@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020B2\u0006\u0010F\u001a\u00020JH¦@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020NH¦@¢\u0006\u0002\u0010OR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u0004\u0018\u00010+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002030\bX¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000bR\u0018\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0006¨\u0006P"}, d2 = {"Lme/oriient/positioningengine/common/PositioningEngine;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "activeFloorUpdates", "Lkotlinx/coroutines/flow/SharedFlow;", "Lme/oriient/positioningengine/common/ActiveFloorUpdate;", "getActiveFloorUpdates", "()Lkotlinx/coroutines/flow/SharedFlow;", "calibrationNeededUpdates", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/positioningengine/common/models/CalibrationNeeded;", "getCalibrationNeededUpdates", "()Lkotlinx/coroutines/flow/StateFlow;", "calibrationUpdates", "Lme/oriient/positioningengine/common/CalibrationUpdate;", "getCalibrationUpdates", "currentCoreConfig", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "getCurrentCoreConfig", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "currentFloor", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "getCurrentFloor", "currentMap", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "getCurrentMap", "currentSessionConfig", "Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "getCurrentSessionConfig", "()Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "errors", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "getErrors", "isSmartCartMode", "", "()Z", "lastValidCalibrationSessionId", "", "getLastValidCalibrationSessionId", "()Ljava/lang/String;", "positioningUpdates", "Lme/oriient/positioningengine/common/PositioningUpdate;", "getPositioningUpdates", "predefinedDataShift", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "getPredefinedDataShift", "()Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "sessionInfo", "Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo;", "getSessionInfo", "()Lme/oriient/positioningengine/ondevice/models/EngineSessionInfo;", "state", "Lme/oriient/positioningengine/common/PositioningEngineState;", "getState", "validationUpdates", "Lme/oriient/positioningengine/common/ValidationUpdate;", "getValidationUpdates", "getCurrentCalibrationInfo", "Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfoEngineResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentEngineAnalytics", "Lme/oriient/positioningengine/ondevice/EngineSessionAnalytics;", "getCurrentPerformanceReport", "Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "getLastSuccessfulCalibrationInfo", "Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "onNewSample", "", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "startCalibration", "context", "Lme/oriient/positioningengine/common/CalibrationContext;", "(Lme/oriient/positioningengine/common/CalibrationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPositioning", "Lme/oriient/positioningengine/common/PositioningContext;", "(Lme/oriient/positioningengine/common/PositioningContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "reason", "Lme/oriient/positioningengine/common/EngineStopReason;", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface PositioningEngine extends DiProvidable {
    @NotNull
    SharedFlow<ActiveFloorUpdate> getActiveFloorUpdates();

    @NotNull
    StateFlow<CalibrationNeeded> getCalibrationNeededUpdates();

    @NotNull
    SharedFlow<CalibrationUpdate> getCalibrationUpdates();

    @Nullable
    Object getCurrentCalibrationInfo(@NotNull Continuation<? super EngineCalibrationInfoEngineResult> continuation);

    @NotNull
    OnDeviceEngineCoreConfig getCurrentCoreConfig();

    @Nullable
    Object getCurrentEngineAnalytics(@NotNull Continuation<? super EngineSessionAnalytics> continuation);

    @NotNull
    StateFlow<MappingData.Building.BuildingInfo.FloorMetadata> getCurrentFloor();

    @NotNull
    StateFlow<MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata> getCurrentMap();

    @Nullable
    Object getCurrentPerformanceReport(@NotNull Continuation<? super EnginePerformanceReport> continuation);

    @Nullable
    EngineSessionConfig getCurrentSessionConfig();

    @NotNull
    SharedFlow<PositioningEngineError> getErrors();

    @Nullable
    Object getLastSuccessfulCalibrationInfo(@NotNull Continuation<? super EngineCalibrationInfo> continuation);

    @Nullable
    String getLastValidCalibrationSessionId();

    @NotNull
    SharedFlow<PositioningUpdate> getPositioningUpdates();

    @Nullable
    PredefinedDataShift getPredefinedDataShift();

    @NotNull
    EngineSessionInfo getSessionInfo();

    @NotNull
    StateFlow<PositioningEngineState> getState();

    @NotNull
    SharedFlow<ValidationUpdate> getValidationUpdates();

    boolean isSmartCartMode();

    void onNewSample(@NotNull SensorsDataSample sample);

    @Nullable
    Object startCalibration(@NotNull CalibrationContext calibrationContext, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startPositioning(@NotNull PositioningContext positioningContext, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stop(@NotNull EngineStopReason engineStopReason, @NotNull Continuation<? super Unit> continuation);
}
