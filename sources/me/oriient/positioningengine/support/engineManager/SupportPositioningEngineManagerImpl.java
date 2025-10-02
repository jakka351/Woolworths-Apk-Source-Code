package me.oriient.positioningengine.support.engineManager;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRepository;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.OnDeviceEngineFactory;
import me.oriient.positioningengine.ondevice.OnDeviceEngineFactoryImpl;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter;
import me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporterFactory;
import me.oriient.positioningengine.support.InterfaceC1840b;
import me.oriient.positioningengine.support.device_data.DeviceDataRepository;
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  \u00012\u00020\u0001:\u0003¡\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J4\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\"\u0010#J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b%\u0010&J,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\bH\u0082@¢\u0006\u0004\b(\u0010)J2\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u00100J,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b1\u0010)J.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000f\u00102J.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u001e2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\bB\u0010AJ\u0010\u0010C\u001a\u00020\u001eH\u0096@¢\u0006\u0004\bC\u00105J!\u0010F\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010J\u001a\u0004\bK\u0010LR(\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010W\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010W\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010W\u001a\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010W\u001a\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010W\u001a\u0004\b{\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010W\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010W\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010W\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0091\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010W\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010D\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bD\u0010\u009e\u0001R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u009f\u0001¨\u0006¢\u0001"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManagerImpl;", "Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManager;", "Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManager;", "supportEngineUploadManager", "<init>", "(Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManager;)V", "Lme/oriient/positioningengine/common/PositioningEngine;", "currentEngine", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "latestConfig", "", "isCalibration", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/support/engineManager/SupportPositioningEngineManager$ResolveEngineData;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "provideRelevantEngine", "(Lme/oriient/positioningengine/common/PositioningEngine;Lme/oriient/internal/services/dataModel/engine/EngineConfig;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/support/engineManager/h;", "currentData", "newConfig", "recreateEngine", "(Lme/oriient/positioningengine/common/PositioningEngine;Lme/oriient/positioningengine/support/engineManager/h;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "credentials", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "newOnDeviceConfig", "reCreateOnDeviceEngine", "(Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engineConfig", "engine", "", "setupPositionReporting", "(Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/positioningengine/common/PositioningEngine;)V", "newEngineConfig", "resetSupportObjects", "(Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/positioningengine/support/engineManager/h;Lme/oriient/positioningengine/common/PositioningEngine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "getEngineData", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", MlModel.MODEL_FILE_SUFFIX, "createEngine", "(Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDeviceConfig", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "predefinedDataShift", "createOnDeviceEngine", "(Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearLocationReporter", "()V", "prepareEngine", "(Lme/oriient/positioningengine/common/PositioningEngine;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideRelevantEngineInCalibration", "cleanEngine", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "sample", "onNewSample", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;)V", "", "buildingId", "clearBuildingCache", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exceptLastDays", "clearExpiredData", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllCaches", "cleanInMemoryData", "deviceDataFetchTimeoutSeconds", "enableLocationReporting", "configure", "(DLjava/lang/Boolean;)V", "Lme/oriient/positioningengine/support/engineManager/SupportEngineUploadManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getEngine", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lme/oriient/positioningengine/support/device_data/model/BlacklistedFeature;", "blacklistedFeatures", "Ljava/util/List;", "getBlacklistedFeatures", "()Ljava/util/List;", "setBlacklistedFeatures", "(Ljava/util/List;)V", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/OsData;", "osData$delegate", "getOsData", "()Lme/oriient/internal/infra/utils/core/OsData;", "osData", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider$delegate", "getOriientApiProvider", "()Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/positioningengine/common/config/c;", "configManager$delegate", "getConfigManager", "()Lme/oriient/positioningengine/common/config/c;", "configManager", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterFactory;", "locationReporterFactory$delegate", "getLocationReporterFactory", "()Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterFactory;", "locationReporterFactory", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridRepository;", "mapGridRepository$delegate", "getMapGridRepository", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridRepository;", "mapGridRepository", "Lme/oriient/internal/services/dataManager/obstacles/ObstaclesRepository;", "obstaclesRepository$delegate", "getObstaclesRepository", "()Lme/oriient/internal/services/dataManager/obstacles/ObstaclesRepository;", "obstaclesRepository", "Lme/oriient/positioningengine/ondevice/ml/i;", "mlModelRepository$delegate", "getMlModelRepository", "()Lme/oriient/positioningengine/ondevice/ml/i;", "mlModelRepository", "Lme/oriient/positioningengine/support/device_data/a;", "deviceDataRepositoryFactory$delegate", "getDeviceDataRepositoryFactory", "()Lme/oriient/positioningengine/support/device_data/a;", "deviceDataRepositoryFactory", "Lme/oriient/positioningengine/support/b;", "engineSessionRepository$delegate", "getEngineSessionRepository", "()Lme/oriient/positioningengine/support/b;", "engineSessionRepository", "Lme/oriient/positioningengine/ondevice/OnDeviceEngineFactory;", "onDeviceEngineFactory", "Lme/oriient/positioningengine/ondevice/OnDeviceEngineFactory;", "Lme/oriient/positioningengine/support/engineManager/b;", "engineDependencyValidator", "Lme/oriient/positioningengine/support/engineManager/b;", "Lme/oriient/positioningengine/support/device_data/DeviceDataRepository;", "deviceDataRepository", "Lme/oriient/positioningengine/support/device_data/DeviceDataRepository;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporter;", "locationReporter", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporter;", "D", "Lme/oriient/positioningengine/support/engineManager/h;", "Companion", "me/oriient/positioningengine/support/engineManager/g", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SupportPositioningEngineManagerImpl implements SupportPositioningEngineManager {

    @NotNull
    private static final g Companion = new g();

    @NotNull
    private static final String TAG = "PositioningEngineManage";

    @NotNull
    private List<? extends BlacklistedFeature> blacklistedFeatures;

    /* renamed from: configManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @Nullable
    private h currentData;
    private double deviceDataFetchTimeoutSeconds;

    @Nullable
    private DeviceDataRepository deviceDataRepository;

    /* renamed from: deviceDataRepositoryFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDataRepositoryFactory;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @NotNull
    private final MutableStateFlow<PositioningEngine> engine;

    @NotNull
    private final InterfaceC1845b engineDependencyValidator;

    /* renamed from: engineSessionRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy engineSessionRepository;

    @Nullable
    private LocationReporter locationReporter;

    /* renamed from: locationReporterFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationReporterFactory;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: mapGridRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapGridRepository;

    /* renamed from: mlModelRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mlModelRepository;

    /* renamed from: obstaclesRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy obstaclesRepository;

    @NotNull
    private final OnDeviceEngineFactory onDeviceEngineFactory;

    /* renamed from: oriientApiProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oriientApiProvider;

    /* renamed from: osData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy osData;

    @NotNull
    private final SupportEngineUploadManager supportEngineUploadManager;

    public SupportPositioningEngineManagerImpl(@NotNull SupportEngineUploadManager supportEngineUploadManager) {
        Intrinsics.h(supportEngineUploadManager, "supportEngineUploadManager");
        this.supportEngineUploadManager = supportEngineUploadManager;
        this.engine = StateFlowKt.a(null);
        this.blacklistedFeatures = EmptyList.d;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.osData = DiKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.eLog = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.oriientApiProvider = DiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.coroutineContextProvider = DiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.configManager = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class));
        this.locationReporterFactory = DiKt.getDi().inject(reflectionFactory.b(LocationReporterFactory.class));
        this.mapGridRepository = DiKt.getDi().inject(reflectionFactory.b(MapGridRepository.class));
        this.obstaclesRepository = DiKt.getDi().inject(reflectionFactory.b(ObstaclesRepository.class));
        this.mlModelRepository = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.ondevice.ml.i.class));
        this.deviceDataRepositoryFactory = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.support.device_data.a.class));
        this.engineSessionRepository = DiKt.getDi().inject(reflectionFactory.b(InterfaceC1840b.class));
        this.onDeviceEngineFactory = new OnDeviceEngineFactoryImpl();
        this.engineDependencyValidator = new e();
        this.deviceDataFetchTimeoutSeconds = 15.0d;
    }

    private final void clearLocationReporter() {
        LocationReporter locationReporter = this.locationReporter;
        if (locationReporter != null) {
            locationReporter.setEnabled(false);
        }
        this.locationReporter = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r11, me.oriient.internal.services.dataModel.engine.EngineConfig r12, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.util.PositioningEngineError>> r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.createEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials, me.oriient.internal.services.dataModel.engine.EngineConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createOnDeviceEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r17, me.oriient.internal.services.dataModel.engine.EngineConfig r18, me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r19, me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r20, kotlin.coroutines.Continuation<? super me.oriient.positioningengine.common.PositioningEngine> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof me.oriient.positioningengine.support.engineManager.q
            if (r2 == 0) goto L17
            r2 = r1
            me.oriient.positioningengine.support.engineManager.q r2 = (me.oriient.positioningengine.support.engineManager.q) r2
            int r3 = r2.h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.h = r3
            goto L1c
        L17:
            me.oriient.positioningengine.support.engineManager.q r2 = new me.oriient.positioningengine.support.engineManager.q
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            me.oriient.internal.infra.utils.core.DiProvidable r2 = r2.f26541a
            me.oriient.positioningengine.common.PositioningEngine r2 = (me.oriient.positioningengine.common.PositioningEngine) r2
            kotlin.ResultKt.b(r1)
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r4 = r2.e
            me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r7 = r2.d
            me.oriient.internal.services.dataModel.engine.EngineConfig r8 = r2.c
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r9 = r2.b
            me.oriient.internal.infra.utils.core.DiProvidable r10 = r2.f26541a
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r10 = (me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl) r10
            kotlin.ResultKt.b(r1)
            r12 = r4
            r4 = r8
            r1 = r9
            r14 = r10
            goto L6e
        L4e:
            kotlin.ResultKt.b(r1)
            r2.f26541a = r0
            r1 = r17
            r2.b = r1
            r4 = r18
            r2.c = r4
            r7 = r19
            r2.d = r7
            r8 = r20
            r2.e = r8
            r2.h = r6
            java.lang.Object r9 = r0.cleanEngine(r2)
            if (r9 != r3) goto L6c
            goto Lc6
        L6c:
            r14 = r0
            r12 = r8
        L6e:
            me.oriient.positioningengine.ondevice.J r8 = me.oriient.positioningengine.ondevice.OnDeviceEngineConfig.Companion
            r8.getClass()
            me.oriient.positioningengine.ondevice.OnDeviceEngineConfig r10 = me.oriient.positioningengine.ondevice.J.a(r4, r7)
            me.oriient.positioningengine.ondevice.OnDeviceEngineFactory r8 = r14.onDeviceEngineFactory
            java.lang.String r9 = r1.getSpaceId()
            java.lang.String r11 = r1.getUserSessionId()
            boolean r13 = r7.getEnableEnginePerformanceMonitor()
            if (r13 != r6) goto L92
            me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitorImpl r13 = new me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitorImpl
            me.oriient.internal.infra.utils.core.Logger r15 = r14.getLogger()
            r5 = 0
            r13.<init>(r15, r5)
            goto L97
        L92:
            me.oriient.positioningengine.ondevice.DummyOnDeviceEnginePerformanceMonitor r13 = new me.oriient.positioningengine.ondevice.DummyOnDeviceEnginePerformanceMonitor
            r13.<init>()
        L97:
            me.oriient.positioningengine.common.PositioningEngine r5 = r8.createOnDeviceEngine(r9, r10, r11, r12, r13)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r8 = r14.supportEngineUploadManager
            java.lang.String r9 = r1.getApiKey()
            java.lang.String r10 = r1.getSpaceId()
            r8.setupUploadManager(r9, r10, r7)
            r14.setupPositionReporting(r1, r4, r5)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r1 = r14.supportEngineUploadManager
            r1.setCanStartUploading(r6)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r1 = r14.supportEngineUploadManager
            r2.f26541a = r5
            r4 = 0
            r2.b = r4
            r2.c = r4
            r2.d = r4
            r2.e = r4
            r4 = 2
            r2.h = r4
            java.lang.Object r1 = r1.onNewEngine(r5, r2)
            if (r1 != r3) goto Lc7
        Lc6:
            return r3
        Lc7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.createOnDeviceEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials, me.oriient.internal.services.dataModel.engine.EngineConfig, me.oriient.internal.services.dataModel.engine.SpecificEngineConfig, me.oriient.positioningengine.support.device_data.model.PredefinedDataShift, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final me.oriient.positioningengine.common.config.c getConfigManager() {
        return (me.oriient.positioningengine.common.config.c) this.configManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    private final me.oriient.positioningengine.support.device_data.a getDeviceDataRepositoryFactory() {
        return (me.oriient.positioningengine.support.device_data.a) this.deviceDataRepositoryFactory.getD();
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getEngineData(boolean z, Continuation<? super Outcome<OnDeviceEngineSession, PositioningEngineError>> continuation) {
        return CoroutineScopeKt.c(new u(z, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1840b getEngineSessionRepository() {
        return (InterfaceC1840b) this.engineSessionRepository.getD();
    }

    private final LocationReporterFactory getLocationReporterFactory() {
        return (LocationReporterFactory) this.locationReporterFactory.getD();
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final MapGridRepository getMapGridRepository() {
        return (MapGridRepository) this.mapGridRepository.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me.oriient.positioningengine.ondevice.ml.i getMlModelRepository() {
        return (me.oriient.positioningengine.ondevice.ml.i) this.mlModelRepository.getD();
    }

    private final ObstaclesRepository getObstaclesRepository() {
        return (ObstaclesRepository) this.obstaclesRepository.getD();
    }

    private final OriientApiProvider getOriientApiProvider() {
        return (OriientApiProvider) this.oriientApiProvider.getD();
    }

    private final OsData getOsData() {
        return (OsData) this.osData.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r11 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object reCreateOnDeviceEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r8, me.oriient.internal.services.dataModel.engine.EngineConfig r9, me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r10, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.util.PositioningEngineError>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof me.oriient.positioningengine.support.engineManager.z
            if (r0 == 0) goto L14
            r0 = r11
            me.oriient.positioningengine.support.engineManager.z r0 = (me.oriient.positioningengine.support.engineManager.z) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.positioningengine.support.engineManager.z r0 = new me.oriient.positioningengine.support.engineManager.z
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.ResultKt.b(r11)
            goto Lb3
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r10 = r6.d
            me.oriient.internal.services.dataModel.engine.EngineConfig r9 = r6.c
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r8 = r6.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r1 = r6.f26550a
            kotlin.ResultKt.b(r11)
        L40:
            r3 = r9
            r4 = r10
            goto L77
        L43:
            kotlin.ResultKt.b(r11)
            me.oriient.positioningengine.support.device_data.a r11 = r7.getDeviceDataRepositoryFactory()
            me.oriient.internal.infra.rest.OriientApiProvider r1 = r7.getOriientApiProvider()
            double r4 = r7.deviceDataFetchTimeoutSeconds
            me.oriient.positioningengine.support.device_data.b r11 = (me.oriient.positioningengine.support.device_data.b) r11
            me.oriient.positioningengine.support.device_data.DeviceDataRepositoryImpl r11 = r11.a(r8, r1, r4)
            r7.deviceDataRepository = r11
            me.oriient.internal.infra.utils.core.OsData r1 = r7.getOsData()
            java.lang.String r1 = r1.getDeviceDescription()
            java.lang.String r4 = r8.getUserSessionId()
            r6.f26550a = r7
            r6.b = r8
            r6.c = r9
            r6.d = r10
            r6.g = r3
            java.lang.Object r11 = r11.loadDeviceData(r1, r4, r6)
            if (r11 != r0) goto L75
            goto Lb2
        L75:
            r1 = r7
            goto L40
        L77:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            boolean r9 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r9 == 0) goto L89
            me.oriient.internal.infra.utils.core.Outcome$Failure r8 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.Outcome$Failure r11 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r11
            java.lang.Exception r9 = r11.getValue()
            r8.<init>(r9)
            return r8
        L89:
            boolean r9 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r9 == 0) goto Lb9
            me.oriient.internal.infra.utils.core.Outcome$Success r11 = (me.oriient.internal.infra.utils.core.Outcome.Success) r11
            java.lang.Object r9 = r11.getValue()
            me.oriient.positioningengine.support.device_data.model.DeviceData r9 = (me.oriient.positioningengine.support.device_data.model.DeviceData) r9
            java.util.List r10 = r9.getBlacklistedFeatures()
            r1.setBlacklistedFeatures(r10)
            me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r5 = r9.getPredefinedDataShift()
            r9 = 0
            r6.f26550a = r9
            r6.b = r9
            r6.c = r9
            r6.d = r9
            r6.g = r2
            r2 = r8
            java.lang.Object r11 = r1.createOnDeviceEngine(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lb3
        Lb2:
            return r0
        Lb3:
            me.oriient.internal.infra.utils.core.Outcome$Success r8 = new me.oriient.internal.infra.utils.core.Outcome$Success
            r8.<init>(r11)
            return r8
        Lb9:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.reCreateOnDeviceEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials, me.oriient.internal.services.dataModel.engine.EngineConfig, me.oriient.internal.services.dataModel.engine.SpecificEngineConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object recreateEngine(me.oriient.positioningengine.common.PositioningEngine r8, me.oriient.positioningengine.support.engineManager.h r9, me.oriient.internal.services.dataModel.engine.EngineConfig r10, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.util.PositioningEngineError>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof me.oriient.positioningengine.support.engineManager.A
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.positioningengine.support.engineManager.A r0 = (me.oriient.positioningengine.support.engineManager.A) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.A r0 = new me.oriient.positioningengine.support.engineManager.A
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            me.oriient.internal.services.dataModel.engine.EngineConfig r8 = r0.c
            me.oriient.positioningengine.support.engineManager.h r9 = r0.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r10 = r0.f26530a
            kotlin.ResultKt.b(r11)
            goto La4
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            me.oriient.internal.services.dataModel.engine.EngineConfig r8 = r0.c
            me.oriient.positioningengine.support.engineManager.h r9 = r0.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r10 = r0.f26530a
            kotlin.ResultKt.b(r11)
            goto L85
        L46:
            me.oriient.internal.services.dataModel.engine.EngineConfig r10 = r0.c
            me.oriient.positioningengine.support.engineManager.h r9 = r0.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r8 = r0.f26530a
            kotlin.ResultKt.b(r11)
            goto L6a
        L50:
            kotlin.ResultKt.b(r11)
            me.oriient.positioningengine.common.EngineStopReason$Custom r11 = new me.oriient.positioningengine.common.EngineStopReason$Custom
            java.lang.String r2 = "Switch engine type"
            r11.<init>(r2)
            r0.f26530a = r7
            r0.b = r9
            r0.c = r10
            r0.f = r5
            java.lang.Object r8 = r8.stop(r11, r0)
            if (r8 != r1) goto L69
            goto La3
        L69:
            r8 = r7
        L6a:
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r11 = r8.supportEngineUploadManager
            me.oriient.positioningengine.common.EngineStopReason$Custom r2 = new me.oriient.positioningengine.common.EngineStopReason$Custom
            java.lang.String r5 = "Change engine type"
            r2.<init>(r5)
            r0.f26530a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r4
            java.lang.Object r11 = r11.stopUploading(r2, r0)
            if (r11 != r1) goto L82
            goto La3
        L82:
            r6 = r10
            r10 = r8
            r8 = r6
        L85:
            r10.clearLocationReporter()
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r11 = r10.supportEngineUploadManager
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r2 = r9.f26533a
            r11.saveLastUsed(r8, r2)
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r11 = r9.f26533a
            me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r2 = r8.getSpecificConfig()
            r0.f26530a = r10
            r0.b = r9
            r0.c = r8
            r0.f = r3
            java.lang.Object r11 = r10.reCreateOnDeviceEngine(r11, r8, r2, r0)
            if (r11 != r1) goto La4
        La3:
            return r1
        La4:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            boolean r0 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r0 == 0) goto Lc6
            r0 = r11
            me.oriient.internal.infra.utils.core.Outcome$Success r0 = (me.oriient.internal.infra.utils.core.Outcome.Success) r0
            java.lang.Object r0 = r0.getValue()
            me.oriient.positioningengine.common.PositioningEngine r0 = (me.oriient.positioningengine.common.PositioningEngine) r0
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r1 = r9.f26533a
            r10.setupPositionReporting(r1, r8, r0)
            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.getEngine()
            r10.setValue(r0)
            java.lang.String r10 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.h(r8, r10)
            r9.b = r8
        Lc6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.recreateEngine(me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.support.engineManager.h, me.oriient.internal.services.dataModel.engine.EngineConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object resetSupportObjects(me.oriient.internal.services.dataModel.engine.EngineConfig r10, me.oriient.positioningengine.support.engineManager.h r11, me.oriient.positioningengine.common.PositioningEngine r12, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.util.PositioningEngineError>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof me.oriient.positioningengine.support.engineManager.B
            if (r0 == 0) goto L13
            r0 = r13
            me.oriient.positioningengine.support.engineManager.B r0 = (me.oriient.positioningengine.support.engineManager.B) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.B r0 = new me.oriient.positioningengine.support.engineManager.B
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r0.c
            me.oriient.positioningengine.common.PositioningEngine r10 = (me.oriient.positioningengine.common.PositioningEngine) r10
            java.lang.Object r11 = r0.b
            me.oriient.positioningengine.support.engineManager.h r11 = (me.oriient.positioningengine.support.engineManager.h) r11
            java.lang.Object r12 = r0.f26531a
            me.oriient.internal.services.dataModel.engine.EngineConfig r12 = (me.oriient.internal.services.dataModel.engine.EngineConfig) r12
            kotlin.ResultKt.b(r13)
            goto La3
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            me.oriient.positioningengine.common.PositioningEngine r12 = r0.d
            java.lang.Object r10 = r0.c
            r11 = r10
            me.oriient.positioningengine.support.engineManager.h r11 = (me.oriient.positioningengine.support.engineManager.h) r11
            java.lang.Object r10 = r0.b
            me.oriient.internal.services.dataModel.engine.EngineConfig r10 = (me.oriient.internal.services.dataModel.engine.EngineConfig) r10
            java.lang.Object r2 = r0.f26531a
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r2 = (me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl) r2
            kotlin.ResultKt.b(r13)
            goto L72
        L51:
            kotlin.ResultKt.b(r13)
            r9.clearLocationReporter()
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r13 = r9.supportEngineUploadManager
            me.oriient.positioningengine.common.EngineStopReason$Custom r2 = new me.oriient.positioningengine.common.EngineStopReason$Custom
            java.lang.String r5 = "Reset settings"
            r2.<init>(r5)
            r0.f26531a = r9
            r0.b = r10
            r0.c = r11
            r0.d = r12
            r0.g = r4
            java.lang.Object r13 = r13.stopUploading(r2, r0)
            if (r13 != r1) goto L71
            goto L9f
        L71:
            r2 = r9
        L72:
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r13 = r2.supportEngineUploadManager
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r5 = r11.f26533a
            java.lang.String r5 = r5.getApiKey()
            me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r6 = r11.f26533a
            java.lang.String r6 = r6.getSpaceId()
            me.oriient.internal.services.dataModel.engine.SpecificEngineConfig r7 = r10.getSpecificConfig()
            r13.setupUploadManager(r5, r6, r7)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r13 = r2.supportEngineUploadManager
            r13.setCanStartUploading(r4)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r13 = r2.supportEngineUploadManager
            r0.f26531a = r10
            r0.b = r11
            r0.c = r12
            r2 = 0
            r0.d = r2
            r0.g = r3
            java.lang.Object r13 = r13.onNewEngine(r12, r0)
            if (r13 != r1) goto La0
        L9f:
            return r1
        La0:
            r8 = r12
            r12 = r10
            r10 = r8
        La3:
            r11.getClass()
            java.lang.String r13 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.h(r12, r13)
            r11.b = r12
            me.oriient.internal.infra.utils.core.Outcome$Success r11 = new me.oriient.internal.infra.utils.core.Outcome$Success
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.resetSupportObjects(me.oriient.internal.services.dataModel.engine.EngineConfig, me.oriient.positioningengine.support.engineManager.h, me.oriient.positioningengine.common.PositioningEngine, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void setupPositionReporting(PositioningEngineCredentials credentials, EngineConfig engineConfig, PositioningEngine engine) {
        if (engineConfig.getEnableLocationReporting()) {
            this.locationReporter = getLocationReporterFactory().create(getOriientApiProvider(), engine, credentials, engineConfig);
        } else {
            clearLocationReporter();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r6.stop(r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object cleanEngine(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof me.oriient.positioningengine.support.engineManager.j
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.positioningengine.support.engineManager.j r0 = (me.oriient.positioningengine.support.engineManager.j) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.j r0 = new me.oriient.positioningengine.support.engineManager.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r0 = r0.f26534a
            kotlin.ResultKt.b(r6)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r2 = r0.f26534a
            kotlin.ResultKt.b(r6)
            goto L57
        L3a:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.getEngine()
            java.lang.Object r6 = r6.getValue()
            me.oriient.positioningengine.common.PositioningEngine r6 = (me.oriient.positioningengine.common.PositioningEngine) r6
            if (r6 == 0) goto L56
            me.oriient.positioningengine.common.EngineStopReason$Logout r2 = me.oriient.positioningengine.common.EngineStopReason.Logout.INSTANCE
            r0.f26534a = r5
            r0.d = r4
            java.lang.Object r6 = r6.stop(r2, r0)
            if (r6 != r1) goto L56
            goto L6d
        L56:
            r2 = r5
        L57:
            kotlinx.coroutines.flow.MutableStateFlow r6 = r2.getEngine()
            r4 = 0
            r6.setValue(r4)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r6 = r2.supportEngineUploadManager
            me.oriient.positioningengine.common.EngineStopReason$SwitchUser r4 = me.oriient.positioningengine.common.EngineStopReason.SwitchUser.INSTANCE
            r0.f26534a = r2
            r0.d = r3
            java.lang.Object r6 = r6.stopUploading(r4, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r0 = r2
        L6f:
            r0.clearLocationReporter()
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.cleanEngine(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @Nullable
    public Object cleanInMemoryData(@NotNull Continuation<? super Unit> continuation) {
        Object objCleanInMemoryData = getMapGridRepository().cleanInMemoryData(continuation);
        return objCleanInMemoryData == CoroutineSingletons.d ? objCleanInMemoryData : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r7.cleanData(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearAllCaches(double r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.positioningengine.support.engineManager.k
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.positioningengine.support.engineManager.k r0 = (me.oriient.positioningengine.support.engineManager.k) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.k r0 = new me.oriient.positioningengine.support.engineManager.k
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r9)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r7 = r0.f26535a
            kotlin.ResultKt.b(r9)
            goto L61
        L3b:
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r7 = r0.f26535a
            kotlin.ResultKt.b(r9)
            goto L52
        L41:
            kotlin.ResultKt.b(r9)
            me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager r9 = r6.supportEngineUploadManager
            r0.f26535a = r6
            r0.d = r5
            java.lang.Object r7 = r9.clearAllCaches(r7, r0)
            if (r7 != r1) goto L51
            goto L70
        L51:
            r7 = r6
        L52:
            me.oriient.internal.services.dataManager.mapGrid.MapGridRepository r8 = r7.getMapGridRepository()
            r0.f26535a = r7
            r0.d = r4
            java.lang.Object r8 = r8.cleanData(r0)
            if (r8 != r1) goto L61
            goto L70
        L61:
            me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository r7 = r7.getObstaclesRepository()
            r8 = 0
            r0.f26535a = r8
            r0.d = r3
            java.lang.Object r7 = r7.cleanData(r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.clearAllCaches(double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7.cleanData(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearBuildingCache(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.positioningengine.support.engineManager.l
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.positioningengine.support.engineManager.l r0 = (me.oriient.positioningengine.support.engineManager.l) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.l r0 = new me.oriient.positioningengine.support.engineManager.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r2 = r0.f26536a
            kotlin.ResultKt.b(r7)
            goto L4f
        L3a:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.mapGrid.MapGridRepository r7 = r5.getMapGridRepository()
            r0.f26536a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r7 = r7.cleanData(r6, r0)
            if (r7 != r1) goto L4e
            goto L60
        L4e:
            r2 = r5
        L4f:
            me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository r7 = r2.getObstaclesRepository()
            r2 = 0
            r0.f26536a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r7.cleanData(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.clearBuildingCache(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8.cleanExpiredData(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearExpiredData(double r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.oriient.positioningengine.support.engineManager.m
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.positioningengine.support.engineManager.m r0 = (me.oriient.positioningengine.support.engineManager.m) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.engineManager.m r0 = new me.oriient.positioningengine.support.engineManager.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            double r6 = r0.b
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl r2 = r0.f26537a
            kotlin.ResultKt.b(r8)
            goto L4f
        L3a:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.dataManager.mapGrid.MapGridRepository r8 = r5.getMapGridRepository()
            r0.f26537a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r8 = r8.cleanExpiredData(r6, r0)
            if (r8 != r1) goto L4e
            goto L5e
        L4e:
            r2 = r5
        L4f:
            me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository r8 = r2.getObstaclesRepository()
            r2 = 0
            r0.f26537a = r2
            r0.e = r3
            java.lang.Object r6 = r8.cleanExpiredData(r6, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.clearExpiredData(double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    public void configure(double deviceDataFetchTimeoutSeconds, @Nullable Boolean enableLocationReporting) {
        BuildersKt.c(CoroutineScopeKt.a(getCoroutineContextProvider().getDefault()), null, null, new n(this, deviceDataFetchTimeoutSeconds, enableLocationReporting, null), 3);
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @NotNull
    public List<BlacklistedFeature> getBlacklistedFeatures() {
        return this.blacklistedFeatures;
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    public void onNewSample(@NotNull SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        PositioningEngine positioningEngine = (PositioningEngine) getEngine().getValue();
        if (positioningEngine != null) {
            positioningEngine.onNewSample(sample);
        }
        this.supportEngineUploadManager.onNewSample(sample);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r14 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object prepareEngine(@org.jetbrains.annotations.NotNull me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials r12, @org.jetbrains.annotations.NotNull me.oriient.internal.services.dataModel.engine.EngineConfig r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.util.PositioningEngineError>> r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.prepareEngine(me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials, me.oriient.internal.services.dataModel.engine.EngineConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @Nullable
    public Object provideRelevantEngine(@NotNull PositioningEngine positioningEngine, @Nullable EngineConfig engineConfig, @NotNull Continuation<? super Outcome<SupportPositioningEngineManager.ResolveEngineData, PositioningEngineError>> continuation) {
        return provideRelevantEngine(positioningEngine, engineConfig, false, continuation);
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @Nullable
    public Object provideRelevantEngineInCalibration(@NotNull PositioningEngine positioningEngine, @Nullable EngineConfig engineConfig, @NotNull Continuation<? super Outcome<SupportPositioningEngineManager.ResolveEngineData, PositioningEngineError>> continuation) {
        return provideRelevantEngine(positioningEngine, engineConfig, true, continuation);
    }

    public void setBlacklistedFeatures(@NotNull List<? extends BlacklistedFeature> list) {
        Intrinsics.h(list, "<set-?>");
        this.blacklistedFeatures = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object provideRelevantEngine(me.oriient.positioningengine.common.PositioningEngine r17, me.oriient.internal.services.dataModel.engine.EngineConfig r18, boolean r19, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager.ResolveEngineData, me.oriient.positioningengine.common.util.PositioningEngineError>> r20) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl.provideRelevantEngine(me.oriient.positioningengine.common.PositioningEngine, me.oriient.internal.services.dataModel.engine.EngineConfig, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager
    @NotNull
    public MutableStateFlow<PositioningEngine> getEngine() {
        return this.engine;
    }
}
