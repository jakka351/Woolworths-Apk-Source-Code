package me.oriient.positioningengine.ondevice.ndkBridge;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.AbstractC1812a;
import me.oriient.positioningengine.ondevice.EngineSample;
import me.oriient.positioningengine.ondevice.EngineSessionAnalytics;
import me.oriient.positioningengine.ondevice.EngineSessionMetadata;
import me.oriient.positioningengine.ondevice.StartPosition;
import me.oriient.positioningengine.ondevice.Z;
import me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.ml.MlModelFactory;
import me.oriient.positioningengine.ondevice.models.EngineProcessingResult;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult;
import me.oriient.positioningengine.ondevice.util.EngineErrorHandler;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003JH\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014JV\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\u001e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0082 ¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010#H\u0082 ¢\u0006\u0004\b$\u0010%J \u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b)\u0010*J.\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00172\u0006\u0010.\u001a\u00020-H\u0082 ¢\u0006\u0004\b/\u00100J \u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u00172\u0006\u00102\u001a\u000201H\u0082 ¢\u0006\u0004\b4\u00105JG\u00106\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b6\u0010\u0014JU\u00107\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u001cJI\u00108\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b8\u0010\u001fJ\u0011\u00109\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b9\u0010\"J\u001d\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020;0:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\u0003J\u001f\u0010@\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u00172\u0006\u00102\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020&H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lme/oriient/positioningengine/ondevice/ndkBridge/NdkBridgeImpl;", "Lme/oriient/positioningengine/ondevice/ndkBridge/a;", "<init>", "()V", "", "terminateEngineNative", "Lme/oriient/positioningengine/ondevice/EngineSessionMetadata;", "sessionMetadata", "Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;", "calibInfo", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "predefinedDataShift", "", "isPreCalibration", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "engineCoreConfig", "", "buildingId", "Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "startCalibrationNative", "(Lme/oriient/positioningengine/ondevice/EngineSessionMetadata;Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;ZLme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;Ljava/lang/String;)Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;", "building", "", "mapIds", "Lme/oriient/positioningengine/ondevice/StartPosition;", "startPosition", "startPositioningNative", "(Lme/oriient/positioningengine/ondevice/EngineSessionMetadata;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;Ljava/util/List;Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfo;Lme/oriient/positioningengine/ondevice/StartPosition;Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;)Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "floorIds", "moveFromCalibrationToPositioningNative", "(ZLme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;Ljava/util/List;Lme/oriient/positioningengine/ondevice/EngineSessionMetadata;Lme/oriient/positioningengine/ondevice/StartPosition;Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;)V", "Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfoEngineResult;", "getLastCalibrationInfoNative", "()Lme/oriient/positioningengine/ondevice/models/calibration/EngineCalibrationInfoEngineResult;", "Lme/oriient/positioningengine/ondevice/EngineSessionAnalytics;", "getAnalyticsNative", "()Lme/oriient/positioningengine/ondevice/EngineSessionAnalytics;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map;", "mapGrid", "floorId", "setMapNative", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map;Ljava/lang/String;)V", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;", "restrictedAreas", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;", "obstacles", "setFloorNative", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;)V", "Lme/oriient/positioningengine/ondevice/EngineSample;", "sample", "Lme/oriient/positioningengine/ondevice/models/EngineProcessingResult;", "processSampleNative", "(Lme/oriient/positioningengine/ondevice/EngineSample;)Ljava/util/List;", "startCalibration", "startPositioning", "moveFromCalibrationToPositioning", "getLastCalibrationInfo", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "getAnalytics", "()Lme/oriient/internal/infra/utils/core/Outcome;", "terminateEngine", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "processSample", "(Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;)Ljava/util/List;", "map", "setMap", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map;)V", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData;", "floor", "setFloor", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData;)V", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NdkBridgeImpl implements a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String TAG = "NdkBridge";
    private static boolean isNativeEngineInitialized;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0082 J!\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lme/oriient/positioningengine/ondevice/ndkBridge/NdkBridgeImpl$Companion;", "", "()V", "TAG", "", "isNativeEngineInitialized", "", "enableMocksNative", "", "enable", "nativeInit", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "mlModelFactory", "Lme/oriient/positioningengine/ondevice/ml/MlModelFactory;", "engineErrorHandler", "Lme/oriient/positioningengine/ondevice/util/EngineErrorHandler;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native void enableMocksNative(boolean enable);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void nativeInit(Logger logger, MlModelFactory mlModelFactory, EngineErrorHandler engineErrorHandler);

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        System.loadLibrary("positioning-engine");
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        companion.nativeInit((Logger) di.get(reflectionFactory.b(Logger.class), null), (MlModelFactory) DiKt.getDi().get(reflectionFactory.b(MlModelFactory.class), null), (EngineErrorHandler) DiKt.getDi().get(reflectionFactory.b(EngineErrorHandler.class), null));
        companion.enableMocksNative(false);
    }

    public NdkBridgeImpl() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.eLog = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
    }

    private final native EngineSessionAnalytics getAnalyticsNative();

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final native EngineCalibrationInfoEngineResult getLastCalibrationInfoNative();

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final native void moveFromCalibrationToPositioningNative(boolean isPreCalibration, MappingData.Building building, List<String> floorIds, EngineSessionMetadata sessionMetadata, StartPosition startPosition, PredefinedDataShift predefinedDataShift);

    private final native List<EngineProcessingResult> processSampleNative(EngineSample sample);

    private final native void setFloorNative(String floorId, List<MappingData.FloorFullData.RestrictedArea> restrictedAreas, MappingData.FloorFullData.Obstacles obstacles);

    private final native void setMapNative(MappingData.Map mapGrid, String floorId);

    private final native EngineSessionConfig startCalibrationNative(EngineSessionMetadata sessionMetadata, EngineCalibrationInfo calibInfo, PredefinedDataShift predefinedDataShift, boolean isPreCalibration, OnDeviceEngineCoreConfig engineCoreConfig, String buildingId);

    private final native EngineSessionConfig startPositioningNative(EngineSessionMetadata sessionMetadata, MappingData.Building building, List<String> mapIds, EngineCalibrationInfo calibInfo, StartPosition startPosition, PredefinedDataShift predefinedDataShift, OnDeviceEngineCoreConfig engineCoreConfig);

    private final native void terminateEngineNative();

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    @NotNull
    public Outcome<EngineSessionAnalytics, PositioningEngineError> getAnalytics() {
        return !isNativeEngineInitialized ? new Outcome.Failure(new PositioningEngineError.NoEngine()) : new Outcome.Success(getAnalyticsNative());
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    @Nullable
    public EngineCalibrationInfoEngineResult getLastCalibrationInfo() {
        if (isNativeEngineInitialized) {
            return getLastCalibrationInfoNative();
        }
        return null;
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    public void moveFromCalibrationToPositioning(boolean isPreCalibration, @NotNull MappingData.Building building, @NotNull List<String> floorIds, @NotNull EngineSessionMetadata sessionMetadata, @Nullable StartPosition startPosition, @Nullable PredefinedDataShift predefinedDataShift) throws PositioningEngineError.NoEngine {
        Intrinsics.h(building, "building");
        Intrinsics.h(floorIds, "floorIds");
        Intrinsics.h(sessionMetadata, "sessionMetadata");
        getELog().d(TAG, "moveFromCalibrationToPositioning called");
        if (!isNativeEngineInitialized) {
            throw new PositioningEngineError.NoEngine();
        }
        moveFromCalibrationToPositioningNative(isPreCalibration, building, floorIds, sessionMetadata, startPosition, predefinedDataShift);
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    @Nullable
    public List<EngineProcessingResult> processSample(@NotNull SensorsDataSample sample) {
        double[] dArr;
        SensorsDataSample sample2 = sample;
        Intrinsics.h(sample2, "sample");
        double[] dArr2 = new double[60];
        for (int i = 0; i < 60; i++) {
            dArr2[i] = 0.0d;
        }
        double[] dArr3 = new double[60];
        for (int i2 = 0; i2 < 60; i2++) {
            dArr3[i2] = 0.0d;
        }
        double[] dArr4 = new double[80];
        for (int i3 = 0; i3 < 80; i3++) {
            dArr4[i3] = 0.0d;
        }
        double[] dArr5 = new double[60];
        for (int i4 = 0; i4 < 60; i4++) {
            dArr5[i4] = 0.0d;
        }
        double[] dArr6 = new double[60];
        for (int i5 = 0; i5 < 60; i5++) {
            dArr6[i5] = 0.0d;
        }
        double[] dArr7 = new double[40];
        for (int i6 = 0; i6 < 40; i6++) {
            dArr7[i6] = 0.0d;
        }
        double[] dArr8 = new double[100];
        for (int i7 = 0; i7 < 100; i7++) {
            dArr8[i7] = 0.0d;
        }
        double[] dArr9 = new double[160];
        for (int i8 = 0; i8 < 160; i8++) {
            dArr9[i8] = 0.0d;
        }
        double[] dArr10 = new double[20];
        for (int i9 = 0; i9 < 20; i9++) {
            dArr10[i9] = 0.0d;
        }
        double[] dArr11 = new double[60];
        for (int i10 = 0; i10 < 60; i10++) {
            dArr11[i10] = 0.0d;
        }
        double[] dArr12 = new double[60];
        for (int i11 = 0; i11 < 60; i11++) {
            dArr12[i11] = 0.0d;
        }
        double[] dArr13 = new double[20];
        for (int i12 = 0; i12 < 20; i12++) {
            dArr13[i12] = 0.0d;
        }
        int size = sample2.getReadings().size();
        int i13 = 0;
        for (Object obj : sample2.getReadings()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            SensorsDataReading sensorsDataReading = (SensorsDataReading) obj;
            double[] dArr14 = dArr13;
            dArr9[(Z.GYRO.getValue() * size) + i13] = (sensorsDataReading.getGyroReading().getTimestampNanos() - sample2.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr3, size, i13, sensorsDataReading.getGyroReading().getX(), sensorsDataReading.getGyroReading().getY(), sensorsDataReading.getGyroReading().getZ());
            dArr14[i13] = sensorsDataReading.getGyroReading().getAppState().getCode();
            dArr9[(Z.GYRO_UNCALIBRATED.getValue() * size) + i13] = (sensorsDataReading.getGyroscopeUncalibratedReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr11, size, i13, sensorsDataReading.getGyroscopeUncalibratedReading().getXSpeed(), sensorsDataReading.getGyroscopeUncalibratedReading().getYSpeed(), sensorsDataReading.getGyroscopeUncalibratedReading().getZSpeed());
            AbstractC1812a.a(dArr12, size, i13, sensorsDataReading.getGyroscopeUncalibratedReading().getXDrift(), sensorsDataReading.getGyroscopeUncalibratedReading().getYDrift(), sensorsDataReading.getGyroscopeUncalibratedReading().getZDrift());
            dArr9[(Z.ACCELEROMETER.getValue() * size) + i13] = (sensorsDataReading.getAccelerometerReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr2, size, i13, sensorsDataReading.getAccelerometerReading().getX(), sensorsDataReading.getAccelerometerReading().getY(), sensorsDataReading.getAccelerometerReading().getZ());
            dArr9[(Z.GAME_ROTATION.getValue() * size) + i13] = (sensorsDataReading.getGameRotationVectorReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr4, size, i13, sensorsDataReading.getGameRotationVectorReading().getW(), sensorsDataReading.getGameRotationVectorReading().getX(), sensorsDataReading.getGameRotationVectorReading().getY(), sensorsDataReading.getGameRotationVectorReading().getZ());
            dArr9[(Z.MAGNETIC_FIELD.getValue() * size) + i13] = (sensorsDataReading.getMagneticFieldReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr6, size, i13, sensorsDataReading.getMagneticFieldReading().getXUt(), sensorsDataReading.getMagneticFieldReading().getYUt(), sensorsDataReading.getMagneticFieldReading().getZUt());
            dArr9[(Z.MAGNETIC_FIELD_UNCALIBRATED.getValue() * size) + i13] = (sensorsDataReading.getMagneticFieldUncalibratedReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr5, size, i13, sensorsDataReading.getMagneticFieldUncalibratedReading().getX(), sensorsDataReading.getMagneticFieldUncalibratedReading().getY(), sensorsDataReading.getMagneticFieldUncalibratedReading().getZ());
            dArr9[(Z.LOCATION.getValue() * size) + i13] = (sensorsDataReading.getLocationReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr8, size, i13, sensorsDataReading.getLocationReading().getLatitude(), sensorsDataReading.getLocationReading().getLongitude(), sensorsDataReading.getLocationReading().getAltitude(), sensorsDataReading.getLocationReading().getHorizontalAccuracy(), sensorsDataReading.getLocationReading().getVerticalAccuracy());
            dArr9[(Z.PRESSURE.getValue() * size) + i13] = (sensorsDataReading.getPressureReading().getTimestampNanos() - sample.getFirstGyroTimestampNanos()) / 1.0E9d;
            AbstractC1812a.a(dArr7, size, i13, sensorsDataReading.getPressureReading().getPressureKpa());
            if (sensorsDataReading.getMarker() != null) {
                dArr = dArr2;
                AbstractC1812a.a(dArr10, size, i13, r1.byteValue());
            } else {
                dArr = dArr2;
            }
            sample2 = sample;
            dArr2 = dArr;
            i13 = i14;
            dArr13 = dArr14;
        }
        return processSampleNative(new EngineSample(dArr2, dArr3, dArr4, dArr5, dArr6, dArr7, dArr8, dArr11, dArr12, dArr9, dArr10, dArr13));
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    public void setFloor(@NotNull MappingData.FloorFullData floor) {
        Intrinsics.h(floor, "floor");
        getELog().d(TAG, "setFloor called", MapsKt.j(new Pair("floorName", floor.getMetadata().getFloorName()), new Pair("floorId", floor.getMetadata().getFloorId())));
        setFloorNative(floor.getMetadata().getFloorId(), floor.getRestrictedAreas(), floor.getObstacles());
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    public void setMap(@NotNull MappingData.Map map) {
        Intrinsics.h(map, "map");
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("mapId", map.getMapGrid().getMapGridData().getMapId(), getELog(), TAG, "setMap called");
        setMapNative(map, map.getMapGrid().getRecord().getFloorId());
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    @Nullable
    public EngineSessionConfig startCalibration(@NotNull EngineSessionMetadata sessionMetadata, @Nullable EngineCalibrationInfo calibInfo, @Nullable PredefinedDataShift predefinedDataShift, boolean isPreCalibration, @NotNull OnDeviceEngineCoreConfig engineCoreConfig, @Nullable String buildingId) {
        Intrinsics.h(sessionMetadata, "sessionMetadata");
        Intrinsics.h(engineCoreConfig, "engineCoreConfig");
        getELog().d(TAG, "startCalibration called");
        EngineSessionConfig engineSessionConfigStartCalibrationNative = startCalibrationNative(sessionMetadata, calibInfo, predefinedDataShift, isPreCalibration, engineCoreConfig, buildingId);
        isNativeEngineInitialized = true;
        return engineSessionConfigStartCalibrationNative;
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    @Nullable
    public EngineSessionConfig startPositioning(@NotNull EngineSessionMetadata sessionMetadata, @NotNull MappingData.Building building, @NotNull List<String> floorIds, @Nullable EngineCalibrationInfo calibInfo, @Nullable StartPosition startPosition, @Nullable PredefinedDataShift predefinedDataShift, @NotNull OnDeviceEngineCoreConfig engineCoreConfig) {
        Intrinsics.h(sessionMetadata, "sessionMetadata");
        Intrinsics.h(building, "building");
        Intrinsics.h(floorIds, "floorIds");
        Intrinsics.h(engineCoreConfig, "engineCoreConfig");
        getELog().d(TAG, "startPositioning called");
        EngineSessionConfig engineSessionConfigStartPositioningNative = startPositioningNative(sessionMetadata, building, floorIds, calibInfo, startPosition, predefinedDataShift, engineCoreConfig);
        isNativeEngineInitialized = true;
        return engineSessionConfigStartPositioningNative;
    }

    @Override // me.oriient.positioningengine.ondevice.ndkBridge.a
    public void terminateEngine() {
        getELog().d(TAG, "terminateEngine called", MapsKt.i(new Pair("hasEngine", Boolean.valueOf(isNativeEngineInitialized))));
        if (isNativeEngineInitialized) {
            isNativeEngineInitialized = false;
            try {
                terminateEngineNative();
            } catch (Exception e) {
                getLogger().e(TAG, "terminateEngine: native failed", e);
            }
        }
    }
}
