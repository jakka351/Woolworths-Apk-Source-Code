package me.oriient.positioningengine.ondevice.ndkBridge;

import java.util.List;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.ondevice.EngineSessionMetadata;
import me.oriient.positioningengine.ondevice.StartPosition;
import me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;

/* loaded from: classes8.dex */
public interface a extends DiProvidable {
    Outcome getAnalytics();

    EngineCalibrationInfoEngineResult getLastCalibrationInfo();

    void moveFromCalibrationToPositioning(boolean z, MappingData.Building building, List list, EngineSessionMetadata engineSessionMetadata, StartPosition startPosition, PredefinedDataShift predefinedDataShift);

    List processSample(SensorsDataSample sensorsDataSample);

    void setFloor(MappingData.FloorFullData floorFullData);

    void setMap(MappingData.Map map);

    EngineSessionConfig startCalibration(EngineSessionMetadata engineSessionMetadata, EngineCalibrationInfo engineCalibrationInfo, PredefinedDataShift predefinedDataShift, boolean z, OnDeviceEngineCoreConfig onDeviceEngineCoreConfig, String str);

    EngineSessionConfig startPositioning(EngineSessionMetadata engineSessionMetadata, MappingData.Building building, List list, EngineCalibrationInfo engineCalibrationInfo, StartPosition startPosition, PredefinedDataShift predefinedDataShift, OnDeviceEngineCoreConfig onDeviceEngineCoreConfig);

    void terminateEngine();
}
