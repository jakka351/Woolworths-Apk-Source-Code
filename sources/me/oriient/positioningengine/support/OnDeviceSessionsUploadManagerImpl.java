package me.oriient.positioningengine.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.systemStateManager.SystemStateProvider;
import me.oriient.internal.services.uploadingManager.DataUploadManager;
import me.oriient.internal.services.uploadingManager.DataUploadManagerFactory;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.common.SystemEventUpdate;
import me.oriient.positioningengine.common.ValidationUpdate;
import me.oriient.positioningengine.common.models.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ±\u00012\u00020\u0001:\u0002²\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0016J \u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J2\u0010.\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204H\u0096@¢\u0006\u0004\b6\u00107J \u0010<\u001a\u00020\u00122\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010>H\u0096@¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0018\u0010H\u001a\u00020\u00122\u0006\u0010G\u001a\u00020FH\u0096@¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\"\u0010R\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010Q\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR*\u0010[\u001a\u00020\f2\u0006\u0010W\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010T\"\u0004\b]\u0010VR*\u0010^\u001a\u00020\f2\u0006\u0010W\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010T\"\u0004\b`\u0010VR\"\u0010a\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010Q\u001a\u0004\bb\u0010T\"\u0004\bc\u0010VR\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010f\u001a\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010f\u001a\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010f\u001a\u0004\b{\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010f\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010f\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008f\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R \u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010f\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u0098\u0001R!\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010PR\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010QR\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u009c\u0001R!\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u009c\u0001R\u0018\u0010¬\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010QR/\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u009a\u00012\t\u0010W\u001a\u0005\u0018\u00010\u009a\u00018\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001¨\u0006³\u0001"}, d2 = {"Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManagerImpl;", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager;", "", "apiKey", "spaceId", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "factory", "", "startReportingRetryCount", "", "startReportingRetryIntervalMillis", "updateMetadataIntervalMillis", "", "restrictedAreasValidationUploadingEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;IJJZ)V", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession;", "session", "", "reportSessionStart", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession;)V", "startMetadataUpdateTask", "()V", "updateMetadata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "floor", "updateFloorMetadata", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "mapUpdate", "updateMapMetadata", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopMetadataUpdateTask", "Lme/oriient/internal/services/systemStateManager/SystemState;", "state", "Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;", "cause", "onSystemStateChanged", "(Lme/oriient/internal/services/systemStateManager/SystemState;Lme/oriient/internal/services/systemStateManager/SystemStateUpdateCause;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/common/CalibrationContext;", "context", "sensorStartTimeMillis", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "currentLocation", "userId", "startCalibration", "(Lme/oriient/positioningengine/common/CalibrationContext;JLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;", "params", "startPositioning", "(Lme/oriient/positioningengine/support/OnDeviceSessionsUploadManager$StartPositioningParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "stop", "(Lme/oriient/positioningengine/common/EngineStopReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "trigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "scheduledWork", "onUploadTrigger", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/positioningengine/common/PositioningEngine;", "engine", "onNewEngine", "(Lme/oriient/positioningengine/common/PositioningEngine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "sample", "onNewSample", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;)V", "", "exceptLastDays", "clearAllCaches", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "getSpaceUsageStats", "()Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "Ljava/lang/String;", "Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "I", "J", "Z", "sensorsDataUploadingEnabled", "getSensorsDataUploadingEnabled", "()Z", "setSensorsDataUploadingEnabled", "(Z)V", "value", "positionsUploadingEnabled", "getPositionsUploadingEnabled", "setPositionsUploadingEnabled", "validationUploadingEnabled", "getValidationUploadingEnabled", "setValidationUploadingEnabled", "systemEventsUploadingEnabled", "getSystemEventsUploadingEnabled", "setSystemEventsUploadingEnabled", "canStartUploading", "getCanStartUploading", "setCanStartUploading", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider$delegate", "getOriientApiProvider", "()Lme/oriient/internal/infra/rest/OriientApiProvider;", "oriientApiProvider", "Lme/oriient/positioningengine/support/X;", "sessionMetaDataGenerator$delegate", "getSessionMetaDataGenerator", "()Lme/oriient/positioningengine/support/X;", "sessionMetaDataGenerator", "Lme/oriient/internal/services/systemStateManager/SystemStateProvider;", "systemStateProvider$delegate", "getSystemStateProvider", "()Lme/oriient/internal/services/systemStateManager/SystemStateProvider;", "systemStateProvider", "Lme/oriient/internal/infra/powerManager/PowerManager;", "powerManager$delegate", "getPowerManager", "()Lme/oriient/internal/infra/powerManager/PowerManager;", "powerManager", "Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "runtimeDataProvider$delegate", "getRuntimeDataProvider", "()Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "runtimeDataProvider", "Lme/oriient/internal/services/uploadingManager/DataUploadManager;", "sensorsDataUploader", "Lme/oriient/internal/services/uploadingManager/DataUploadManager;", "positionsDataUploader", "validationDataUploader", "systemEventsDataUploader", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope$delegate", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lme/oriient/positioningengine/common/PositioningEngine;", "", "Lkotlinx/coroutines/Job;", "uploadManagerJobs", "Ljava/util/List;", "lastEventsUpdateTimeMillis", "Lme/oriient/positioningengine/common/PositioningUpdate;", "lastPositionUpdate", "Lme/oriient/positioningengine/common/PositioningUpdate;", "buildingOrigin", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "buildingGeofenceOrigin", "gpsFusionEnabled", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "lastKnownLocation", "Lme/oriient/internal/services/sensorsManager/sensors/SensorReading$LocationReading;", "Lme/oriient/positioningengine/support/l0;", "sessions", "Lme/oriient/positioningengine/support/a;", "chargingStateUpdates", "didStartInSilentMode", "metadataUpdateJob", "Lkotlinx/coroutines/Job;", "setMetadataUpdateJob", "(Lkotlinx/coroutines/Job;)V", "Companion", "me/oriient/positioningengine/support/q", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OnDeviceSessionsUploadManagerImpl implements OnDeviceSessionsUploadManager {

    @NotNull
    public static final C1857q Companion = new C1857q();

    @NotNull
    private static final String TAG = "OnDeviceSessionsUploadM";

    @NotNull
    private final String apiKey;

    @Nullable
    private WorldCoordinate buildingGeofenceOrigin;

    @Nullable
    private WorldCoordinate buildingOrigin;
    private boolean canStartUploading;

    @NotNull
    private List<C1839a> chargingStateUpdates;

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineScope;
    private boolean didStartInSilentMode;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @Nullable
    private PositioningEngine engine;

    @NotNull
    private final DataUploadManagerFactory factory;
    private boolean gpsFusionEnabled;
    private long lastEventsUpdateTimeMillis;

    @Nullable
    private SensorReading.LocationReading lastKnownLocation;

    @Nullable
    private PositioningUpdate lastPositionUpdate;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @Nullable
    private Job metadataUpdateJob;

    /* renamed from: oriientApiProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oriientApiProvider;

    @Nullable
    private DataUploadManager positionsDataUploader;
    private boolean positionsUploadingEnabled;

    /* renamed from: powerManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy powerManager;
    private final boolean restrictedAreasValidationUploadingEnabled;

    /* renamed from: runtimeDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy runtimeDataProvider;

    @NotNull
    private final DataUploadManager sensorsDataUploader;
    private boolean sensorsDataUploadingEnabled;

    /* renamed from: sessionMetaDataGenerator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sessionMetaDataGenerator;

    @NotNull
    private final List<l0> sessions;

    @NotNull
    private final String spaceId;
    private final int startReportingRetryCount;
    private final long startReportingRetryIntervalMillis;

    @Nullable
    private DataUploadManager systemEventsDataUploader;
    private boolean systemEventsUploadingEnabled;

    /* renamed from: systemStateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy systemStateProvider;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;
    private final long updateMetadataIntervalMillis;

    @NotNull
    private List<Job> uploadManagerJobs;

    @Nullable
    private DataUploadManager validationDataUploader;
    private boolean validationUploadingEnabled;

    public OnDeviceSessionsUploadManagerImpl(@NotNull String apiKey, @NotNull String spaceId, @NotNull DataUploadManagerFactory factory, int i, long j, long j2, boolean z) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(factory, "factory");
        this.apiKey = apiKey;
        this.spaceId = spaceId;
        this.factory = factory;
        this.startReportingRetryCount = i;
        this.startReportingRetryIntervalMillis = j;
        this.updateMetadataIntervalMillis = j2;
        this.restrictedAreasValidationUploadingEnabled = z;
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.eLog = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.timeProvider = DiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.oriientApiProvider = DiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.sessionMetaDataGenerator = DiKt.getDi().inject(reflectionFactory.b(X.class));
        this.systemStateProvider = DiKt.getDi().inject(reflectionFactory.b(SystemStateProvider.class));
        this.powerManager = DiKt.getDi().inject(reflectionFactory.b(PowerManager.class));
        this.runtimeDataProvider = DiKt.getDi().inject(reflectionFactory.b(RuntimeDataProvider.class));
        this.sensorsDataUploader = factory.createUploadManager(null, DataUploaderDataType.SENSOR);
        this.coroutineScope = LazyKt.b(C1858s.f26570a);
        this.uploadManagerJobs = new ArrayList();
        this.sessions = new ArrayList();
        this.chargingStateUpdates = new ArrayList();
    }

    private final CoroutineScope getCoroutineScope() {
        return (CoroutineScope) this.coroutineScope.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final OriientApiProvider getOriientApiProvider() {
        return (OriientApiProvider) this.oriientApiProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PowerManager getPowerManager() {
        return (PowerManager) this.powerManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RuntimeDataProvider getRuntimeDataProvider() {
        return (RuntimeDataProvider) this.runtimeDataProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X getSessionMetaDataGenerator() {
        return (X) this.sessionMetaDataGenerator.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemStateProvider getSystemStateProvider() {
        return (SystemStateProvider) this.systemStateProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onSystemStateChanged(me.oriient.internal.services.systemStateManager.SystemState r28, me.oriient.internal.services.systemStateManager.SystemStateUpdateCause r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.onSystemStateChanged(me.oriient.internal.services.systemStateManager.SystemState, me.oriient.internal.services.systemStateManager.SystemStateUpdateCause, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void reportSessionStart(DataUploaderSession session) {
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new O(this, session, null), 3));
    }

    private final void setMetadataUpdateJob(Job job) {
        Job job2 = this.metadataUpdateJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.metadataUpdateJob = job;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startMetadataUpdateTask() {
        setMetadataUpdateJob(BuildersKt.c(getCoroutineScope(), null, null, new Q(this, null), 3));
    }

    private final void stopMetadataUpdateTask() {
        setMetadataUpdateJob(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateFloorMetadata(me.oriient.positioningengine.ondevice.mappingData.MappingData.Building.BuildingInfo.FloorMetadata r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof me.oriient.positioningengine.support.U
            if (r2 == 0) goto L18
            r2 = r1
            me.oriient.positioningengine.support.U r2 = (me.oriient.positioningengine.support.U) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.d = r3
        L16:
            r15 = r2
            goto L1e
        L18:
            me.oriient.positioningengine.support.U r2 = new me.oriient.positioningengine.support.U
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r15.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r15.d
            r4 = 1
            kotlin.Unit r16 = kotlin.Unit.f24250a
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r15.f26514a
            kotlin.ResultKt.b(r1)
            goto L70
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.ResultKt.b(r1)
            me.oriient.positioningengine.common.PositioningEngine r1 = r0.engine
            if (r1 != 0) goto L41
            return r16
        L41:
            me.oriient.positioningengine.support.X r3 = r0.getSessionMetaDataGenerator()
            me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading r5 = r0.lastKnownLocation
            me.oriient.positioningengine.common.models.WorldCoordinate r6 = r0.buildingGeofenceOrigin
            boolean r8 = r0.gpsFusionEnabled
            java.util.List<me.oriient.positioningengine.support.a> r9 = r0.chargingStateUpdates
            boolean r10 = r0.didStartInSilentMode
            boolean r11 = r0.getSensorsDataUploadingEnabled()
            boolean r12 = r0.getValidationUploadingEnabled()
            boolean r13 = r0.getPositionsUploadingEnabled()
            boolean r14 = r0.getSystemEventsUploadingEnabled()
            r15.f26514a = r0
            r15.d = r4
            me.oriient.positioningengine.support.j0 r3 = (me.oriient.positioningengine.support.j0) r3
            r7 = r18
            r4 = r1
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L6f
            return r2
        L6f:
            r2 = r0
        L70:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L75
            return r16
        L75:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.sensorsDataUploader
            r4 = 0
            r5 = 2
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.positionsDataUploader
            if (r3 == 0) goto L83
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
        L83:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.validationDataUploader
            if (r3 == 0) goto L8a
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
        L8a:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.systemEventsDataUploader
            if (r3 == 0) goto L9e
            me.oriient.internal.infra.utils.core.time.TimeProvider r2 = r2.getTimeProvider()
            long r4 = r2.getCurrentTimeMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r3.updateClientMetadata(r1, r2)
        L9e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.updateFloorMetadata(me.oriient.positioningengine.ondevice.mappingData.MappingData$Building$BuildingInfo$FloorMetadata, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateMapMetadata(me.oriient.positioningengine.ondevice.mappingData.MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.positioningengine.support.V
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.positioningengine.support.V r0 = (me.oriient.positioningengine.support.V) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.V r0 = new me.oriient.positioningengine.support.V
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r5 = r0.f26515a
            kotlin.ResultKt.b(r6)
            goto L7b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            me.oriient.positioningengine.support.X r6 = r4.getSessionMetaDataGenerator()
            r0.f26515a = r4
            r0.d = r3
            me.oriient.positioningengine.support.j0 r6 = (me.oriient.positioningengine.support.j0) r6
            r6.getClass()
            me.oriient.positioningengine.support.Z r6 = me.oriient.positioningengine.support.Z.mapId
            java.lang.String r6 = r6.getValue()
            java.lang.String r0 = r5.getMapId()
            java.lang.String r0 = me.oriient.internal.infra.serializerJson.JsonHelpersKt.toJsonableString(r0)
            me.oriient.internal.infra.serializerJson.JsonableString r0 = me.oriient.internal.infra.serializerJson.JsonableString.m385boximpl(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r0)
            me.oriient.positioningengine.support.Z r6 = me.oriient.positioningengine.support.Z.mapName
            java.lang.String r6 = r6.getValue()
            java.lang.String r5 = r5.getMapName()
            java.lang.String r5 = me.oriient.internal.infra.serializerJson.JsonHelpersKt.toJsonableString(r5)
            me.oriient.internal.infra.serializerJson.JsonableString r5 = me.oriient.internal.infra.serializerJson.JsonableString.m385boximpl(r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r5)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r2, r0}
            java.util.Map r6 = kotlin.collections.MapsKt.j(r5)
            if (r6 != r1) goto L7a
            return r1
        L7a:
            r5 = r4
        L7b:
            java.util.Map r6 = (java.util.Map) r6
            me.oriient.internal.services.uploadingManager.DataUploadManager r0 = r5.sensorsDataUploader
            r1 = 0
            r2 = 2
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r0, r6, r1, r2, r1)
            me.oriient.internal.services.uploadingManager.DataUploadManager r0 = r5.positionsDataUploader
            if (r0 == 0) goto L8b
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r0, r6, r1, r2, r1)
        L8b:
            me.oriient.internal.services.uploadingManager.DataUploadManager r0 = r5.validationDataUploader
            if (r0 == 0) goto L92
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r0, r6, r1, r2, r1)
        L92:
            me.oriient.internal.services.uploadingManager.DataUploadManager r5 = r5.systemEventsDataUploader
            if (r5 == 0) goto L99
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r5, r6, r1, r2, r1)
        L99:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.updateMapMetadata(me.oriient.positioningengine.ondevice.mappingData.MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateMetadata(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof me.oriient.positioningengine.support.W
            if (r2 == 0) goto L18
            r2 = r1
            me.oriient.positioningengine.support.W r2 = (me.oriient.positioningengine.support.W) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.d = r3
        L16:
            r15 = r2
            goto L1e
        L18:
            me.oriient.positioningengine.support.W r2 = new me.oriient.positioningengine.support.W
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r15.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r15.d
            r4 = 1
            kotlin.Unit r16 = kotlin.Unit.f24250a
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r15.f26516a
            kotlin.ResultKt.b(r1)
            goto L6f
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.ResultKt.b(r1)
            me.oriient.positioningengine.common.PositioningEngine r1 = r0.engine
            if (r1 != 0) goto L41
            return r16
        L41:
            me.oriient.positioningengine.support.X r3 = r0.getSessionMetaDataGenerator()
            me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading r5 = r0.lastKnownLocation
            me.oriient.positioningengine.common.models.WorldCoordinate r6 = r0.buildingGeofenceOrigin
            boolean r8 = r0.gpsFusionEnabled
            java.util.List<me.oriient.positioningengine.support.a> r9 = r0.chargingStateUpdates
            boolean r10 = r0.didStartInSilentMode
            boolean r11 = r0.getSensorsDataUploadingEnabled()
            boolean r12 = r0.getValidationUploadingEnabled()
            boolean r13 = r0.getPositionsUploadingEnabled()
            boolean r14 = r0.getSystemEventsUploadingEnabled()
            r15.f26516a = r0
            r15.d = r4
            me.oriient.positioningengine.support.j0 r3 = (me.oriient.positioningengine.support.j0) r3
            r7 = 0
            r4 = r1
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L6e
            return r2
        L6e:
            r2 = r0
        L6f:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L74
            return r16
        L74:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.sensorsDataUploader
            r4 = 0
            r5 = 2
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.positionsDataUploader
            if (r3 == 0) goto L82
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
        L82:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.validationDataUploader
            if (r3 == 0) goto L89
            me.oriient.internal.services.uploadingManager.DataUploadManager.DefaultImpls.updateClientMetadata$default(r3, r1, r4, r5, r4)
        L89:
            me.oriient.internal.services.uploadingManager.DataUploadManager r3 = r2.systemEventsDataUploader
            if (r3 == 0) goto L9d
            me.oriient.internal.infra.utils.core.time.TimeProvider r2 = r2.getTimeProvider()
            long r4 = r2.getCurrentTimeMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r3.updateClientMetadata(r1, r2)
        L9d:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.updateMetadata(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearAllCaches(double r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof me.oriient.positioningengine.support.r
            if (r0 == 0) goto L13
            r0 = r11
            me.oriient.positioningengine.support.r r0 = (me.oriient.positioningengine.support.r) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.r r0 = new me.oriient.positioningengine.support.r
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L52
            if (r2 == r7) goto L4a
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            kotlin.ResultKt.b(r11)
            goto L97
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            double r9 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26569a
            kotlin.ResultKt.b(r11)
            goto L87
        L42:
            double r9 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26569a
            kotlin.ResultKt.b(r11)
            goto L76
        L4a:
            double r9 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26569a
            kotlin.ResultKt.b(r11)
            goto L65
        L52:
            kotlin.ResultKt.b(r11)
            me.oriient.internal.services.uploadingManager.DataUploadManager r11 = r8.sensorsDataUploader
            r0.f26569a = r8
            r0.b = r9
            r0.e = r7
            java.lang.Object r11 = r11.clearAllCaches(r9, r0)
            if (r11 != r1) goto L64
            goto L96
        L64:
            r2 = r8
        L65:
            me.oriient.internal.services.uploadingManager.DataUploadManager r11 = r2.positionsDataUploader
            if (r11 == 0) goto L76
            r0.f26569a = r2
            r0.b = r9
            r0.e = r6
            java.lang.Object r11 = r11.clearAllCaches(r9, r0)
            if (r11 != r1) goto L76
            goto L96
        L76:
            me.oriient.internal.services.uploadingManager.DataUploadManager r11 = r2.validationDataUploader
            if (r11 == 0) goto L87
            r0.f26569a = r2
            r0.b = r9
            r0.e = r5
            java.lang.Object r11 = r11.clearAllCaches(r9, r0)
            if (r11 != r1) goto L87
            goto L96
        L87:
            me.oriient.internal.services.uploadingManager.DataUploadManager r11 = r2.systemEventsDataUploader
            if (r11 == 0) goto L97
            r2 = 0
            r0.f26569a = r2
            r0.e = r4
            java.lang.Object r9 = r11.clearAllCaches(r9, r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.clearAllCaches(double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public boolean getCanStartUploading() {
        return this.canStartUploading;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public boolean getPositionsUploadingEnabled() {
        return this.positionsUploadingEnabled;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public boolean getSensorsDataUploadingEnabled() {
        return this.sensorsDataUploadingEnabled;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @NotNull
    public DataUploaderFilesManager.FileManagerStats getSpaceUsageStats() {
        return this.sensorsDataUploader.getSpaceUsageStats();
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public boolean getSystemEventsUploadingEnabled() {
        return this.systemEventsUploadingEnabled;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public boolean getValidationUploadingEnabled() {
        return this.validationUploadingEnabled;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @Nullable
    public Object onNewEngine(@Nullable PositioningEngine positioningEngine, @NotNull Continuation<? super Unit> continuation) {
        Iterator<T> it = this.uploadManagerJobs.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
        }
        this.uploadManagerJobs.clear();
        this.engine = positioningEngine;
        Unit unit = Unit.f24250a;
        if (positioningEngine == null) {
            return unit;
        }
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new C1861v(positioningEngine, this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new C1864y(positioningEngine, this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new A(this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new C(this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new E(this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new G(positioningEngine, this, null), 3));
        this.uploadManagerJobs.add(BuildersKt.c(getCoroutineScope(), null, null, new I(positioningEngine, this, null), 3));
        return unit;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void onNewSample(@NotNull SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        BuildersKt.c(getCoroutineScope(), null, null, new K(this, sample, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r12.onUploadTrigger(r10, r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onUploadTrigger(@org.jetbrains.annotations.NotNull me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler.UploadTrigger r10, @org.jetbrains.annotations.NotNull me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof me.oriient.positioningengine.support.M
            if (r0 == 0) goto L13
            r0 = r12
            me.oriient.positioningengine.support.M r0 = (me.oriient.positioningengine.support.M) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.positioningengine.support.M r0 = new me.oriient.positioningengine.support.M
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L59
            if (r2 == r7) goto L4f
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlin.ResultKt.b(r12)
            goto Lab
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork r10 = r0.c
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler$UploadTrigger r11 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26507a
            kotlin.ResultKt.b(r12)
            goto L97
        L45:
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork r10 = r0.c
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler$UploadTrigger r11 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26507a
            kotlin.ResultKt.b(r12)
            goto L84
        L4f:
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork r11 = r0.c
            me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler$UploadTrigger r10 = r0.b
            me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl r2 = r0.f26507a
            kotlin.ResultKt.b(r12)
            goto L6e
        L59:
            kotlin.ResultKt.b(r12)
            me.oriient.internal.services.uploadingManager.DataUploadManager r12 = r9.sensorsDataUploader
            r0.f26507a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r7
            java.lang.Object r12 = r12.onUploadTrigger(r10, r11, r0)
            if (r12 != r1) goto L6d
            goto Laa
        L6d:
            r2 = r9
        L6e:
            me.oriient.internal.services.uploadingManager.DataUploadManager r12 = r2.positionsDataUploader
            if (r12 == 0) goto L81
            r0.f26507a = r2
            r0.b = r10
            r0.c = r11
            r0.f = r6
            java.lang.Object r12 = r12.onUploadTrigger(r10, r11, r0)
            if (r12 != r1) goto L81
            goto Laa
        L81:
            r8 = r11
            r11 = r10
            r10 = r8
        L84:
            me.oriient.internal.services.uploadingManager.DataUploadManager r12 = r2.validationDataUploader
            if (r12 == 0) goto L97
            r0.f26507a = r2
            r0.b = r11
            r0.c = r10
            r0.f = r5
            java.lang.Object r12 = r12.onUploadTrigger(r11, r10, r0)
            if (r12 != r1) goto L97
            goto Laa
        L97:
            me.oriient.internal.services.uploadingManager.DataUploadManager r12 = r2.systemEventsDataUploader
            if (r12 == 0) goto Lab
            r2 = 0
            r0.f26507a = r2
            r0.b = r2
            r0.c = r2
            r0.f = r4
            java.lang.Object r10 = r12.onUploadTrigger(r11, r10, r0)
            if (r10 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.onUploadTrigger(me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler$UploadTrigger, me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void setCanStartUploading(boolean z) {
        this.canStartUploading = z;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void setPositionsUploadingEnabled(boolean z) {
        this.positionsUploadingEnabled = z;
        if (z) {
            this.positionsDataUploader = this.factory.createUploadManager(PositioningUpdate.INSTANCE.getCHUNK_FILE_HEADER(), DataUploaderDataType.POSITION);
        } else {
            this.positionsDataUploader = null;
        }
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void setSensorsDataUploadingEnabled(boolean z) {
        this.sensorsDataUploadingEnabled = z;
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void setSystemEventsUploadingEnabled(boolean z) {
        this.systemEventsUploadingEnabled = z;
        if (!z) {
            this.systemEventsDataUploader = null;
            return;
        }
        DataUploadManagerFactory dataUploadManagerFactory = this.factory;
        SystemEventUpdate.Companion.getClass();
        this.systemEventsDataUploader = dataUploadManagerFactory.createUploadManager(SystemEventUpdate.CHUNK_FILE_HEADER, DataUploaderDataType.APP_EVENTS);
    }

    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    public void setValidationUploadingEnabled(boolean z) {
        this.validationUploadingEnabled = z;
        if (z) {
            this.validationDataUploader = this.factory.createUploadManager(ValidationUpdate.INSTANCE.getCHUNK_FILE_HEADER(), DataUploaderDataType.VALIDATION);
        } else {
            this.validationDataUploader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startCalibration(@org.jetbrains.annotations.NotNull me.oriient.positioningengine.common.CalibrationContext r31, long r32, @org.jetbrains.annotations.Nullable me.oriient.positioningengine.common.models.WorldCoordinate r34, @org.jetbrains.annotations.NotNull java.lang.String r35, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r36) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.startCalibration(me.oriient.positioningengine.common.CalibrationContext, long, me.oriient.positioningengine.common.models.WorldCoordinate, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x028c, code lost:
    
        if (r2.onSystemStateChanged(r1, r3, r11) == r12) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startPositioning(@org.jetbrains.annotations.NotNull me.oriient.positioningengine.support.OnDeviceSessionsUploadManager.StartPositioningParams r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.startPositioning(me.oriient.positioningengine.support.OnDeviceSessionsUploadManager$StartPositioningParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // me.oriient.positioningengine.support.OnDeviceSessionsUploadManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object stop(@org.jetbrains.annotations.NotNull me.oriient.positioningengine.common.EngineStopReason r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.OnDeviceSessionsUploadManagerImpl.stop(me.oriient.positioningengine.common.EngineStopReason, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
