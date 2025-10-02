package me.oriient.positioningengine.support;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonableBoolean;
import me.oriient.internal.infra.serializerJson.JsonableMap;
import me.oriient.internal.infra.serializerJson.JsonableNumber;
import me.oriient.internal.infra.serializerJson.JsonableString;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfig;
import me.oriient.internal.services.dataModel.geofence.GeofenceMetadataProvider;
import me.oriient.internal.services.dataModel.navigation.NavigationMetadataProvider;
import me.oriient.internal.services.dataModel.navigation.NavigationMetrics;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider;
import me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider;
import me.oriient.internal.services.dataModel.sensors.SensorManagerConfig;
import me.oriient.internal.services.dataModel.sensors.SensorsConfig;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.internal.services.runtimeDataProvider.UniqueSession;
import me.oriient.internal.services.sensorsManager.SensorInformation;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import me.oriient.internal.services.sensorsManager.support.SensorsManagerMetadataProvider;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.InitiatedBy;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.IndoorCoordinate;
import me.oriient.positioningengine.ondevice.models.calibration.CalibrationData;
import me.oriient.positioningengine.ondevice.models.calibration.DataShift;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j0 implements X {

    @NotNull
    private static final Y Companion = new Y();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26558a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public j0() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26558a = di.inject(reflectionFactory.b(TimeProvider.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(EngineVersionProvider.class));
        this.c = DiKt.getDi().inject(reflectionFactory.b(RuntimeDataProvider.class));
        this.d = DiKt.getDi().inject(reflectionFactory.b(SensorsManagerMetadataProvider.class));
        this.e = DiKt.getDi().inject(reflectionFactory.b(NavigationMetadataProvider.class));
        this.f = DiKt.getDi().inject(reflectionFactory.b(PositioningMetadataProvider.class));
        this.g = DiKt.getDi().inject(reflectionFactory.b(GeofenceMetadataProvider.class));
        this.h = DiKt.getDi().inject(reflectionFactory.b(ProximityMetadataProvider.class));
        this.i = DiKt.getDi().inject(reflectionFactory.b(GlobalCoordinatesConverter.class));
        this.j = DiKt.getDi().inject(reflectionFactory.b(DeviceIdProvider.class));
        this.k = DiKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.l = DiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
    }

    public final void a(Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String id;
        boolean zIsInSilentMode = ((RuntimeDataProvider) this.c.getD()).isInSilentMode();
        boolean z6 = false;
        map.put(Z.didExitSilentMode.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z && !zIsInSilentMode)));
        if (zIsInSilentMode) {
            map.put(Z.deviceId.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString("ANONYMIZED")));
        } else {
            String value = Z.userId.getValue();
            String currentUserId = ((RuntimeDataProvider) this.c.getD()).getCurrentUserId();
            String str = "UNDEFINED";
            if (currentUserId == null) {
                currentUserId = "UNDEFINED";
            }
            map.put(value, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(currentUserId)));
            map.put(Z.deviceId.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(((DeviceIdProvider) this.j.getD()).getDeviceId())));
            map.put(Z.deviceType.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(((OsData) this.k.getD()).getModel())));
            String value2 = Z.loginSessionId.getValue();
            UniqueSession uniqueSession = (UniqueSession) ((RuntimeDataProvider) this.c.getD()).getLoginSession().getValue();
            if (uniqueSession != null && (id = uniqueSession.getId()) != null) {
                str = id;
            }
            map.put(value2, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(str)));
        }
        map.put(Z.sensorsDataUploadingEnabled.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z2 && !zIsInSilentMode)));
        map.put(Z.positionsUploadingEnabled.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z4 && !zIsInSilentMode)));
        String value3 = Z.eventsUploadingEnabled.getValue();
        if (z5 && !zIsInSilentMode) {
            z6 = true;
        }
        map.put(value3, JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z6)));
        map.put(Z.validationUploadingEnabled.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.common.PositioningEngine r21, me.oriient.internal.services.sensorsManager.sensors.SensorReading.LocationReading r22, me.oriient.positioningengine.common.models.WorldCoordinate r23, me.oriient.positioningengine.ondevice.mappingData.MappingData.Building.BuildingInfo.FloorMetadata r24, boolean r25, java.util.List r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 1961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.j0.a(me.oriient.positioningengine.common.PositioningEngine, me.oriient.internal.services.sensorsManager.sensors.SensorReading$LocationReading, me.oriient.positioningengine.common.models.WorldCoordinate, me.oriient.positioningengine.ondevice.mappingData.MappingData$Building$BuildingInfo$FloorMetadata, boolean, java.util.List, boolean, boolean, boolean, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(Map map, List list) {
        String value = Z.chargingStateUpdates.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1839a c1839a = (C1839a) it.next();
            HashMap map2 = new HashMap();
            map2.put(Z.isConnectedToCharger.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(c1839a.f26517a)));
            map2.put(Z.chargingStateTimestamp.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(me.oriient.positioningengine.common.util.a.a(c1839a.b, ((TimeProvider) this.f26558a.getD()).getTimeZoneGmt()))));
            Integer num = c1839a.c;
            if (num != null) {
                map2.put(Z.chargingStateFloorOrder.getValue(), JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(num.intValue())));
            }
            Double d = c1839a.e;
            if (d != null) {
                map2.put(Z.chargingStateAccuracy.getValue(), JsonHelpersKt.toJsonableNumber(d.doubleValue()));
            }
            Double d2 = c1839a.f;
            if (d2 != null) {
                map2.put(Z.chargingStateLockProgress.getValue(), JsonHelpersKt.toJsonableNumber(d2.doubleValue()));
            }
            IndoorCoordinate indoorCoordinate = c1839a.d;
            if (indoorCoordinate != null) {
                String value2 = Z.chargingStateLocation.getValue();
                HashMap map3 = new HashMap();
                map3.put(Z.chargingStateLocationX.getValue(), JsonHelpersKt.toJsonableNumber(indoorCoordinate.getX()));
                map3.put(Z.chargingStateLocationY.getValue(), JsonHelpersKt.toJsonableNumber(indoorCoordinate.getY()));
                map2.put(value2, JsonHelpersKt.toJsonableMap(map3));
            }
            arrayList.add(JsonHelpersKt.toJsonableMap(map2));
        }
        map.put(value, JsonHelpersKt.toJsonableArray(arrayList));
    }

    public static void a(Map map, ProximityMetadataProvider.ProximityMetadata proximityMetadata) {
        HashMap map2 = new HashMap();
        map2.put("triggersCreated", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersCreated())));
        map2.put("triggersTriggered", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggered())));
        map2.put("triggersTriggeredUnique", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggeredUnique())));
        map2.put("triggersTriggeredWalkingDistance", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggeredWalkingDistance())));
        map2.put("triggersTriggeredCircle", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggeredCircle())));
        map2.put("triggersTriggeredRect", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggeredRectangle())));
        map2.put("triggersTriggeredPoly", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(proximityMetadata.getTriggersTriggeredPolygon())));
        map.put(i.a.x, JsonHelpersKt.toJsonableMap(map2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.common.PositioningEngine r14, me.oriient.positioningengine.common.CalibrationContext r15, long r16, me.oriient.positioningengine.common.models.WorldCoordinate r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, java.util.List r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.j0.a(me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.common.CalibrationContext, long, me.oriient.positioningengine.common.models.WorldCoordinate, boolean, boolean, boolean, boolean, boolean, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.common.PositioningEngine r31, me.oriient.positioningengine.support.OnDeviceSessionsUploadManager.StartPositioningParams r32, boolean r33, boolean r34, boolean r35, boolean r36, java.util.List r37, boolean r38, java.util.List r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.j0.a(me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.support.OnDeviceSessionsUploadManager$StartPositioningParams, boolean, boolean, boolean, boolean, java.util.List, boolean, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final HashMap a(PositioningEngine positioningEngine, InitiatedBy initiatedBy, long j, boolean z) {
        String str;
        HashMap map = new HashMap();
        map.put(Z.userSessionId.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(((RuntimeDataProvider) this.c.getD()).getUserSession().getId())));
        String value = Z.initiatedBy.getValue();
        int i = a0.$EnumSwitchMapping$0[initiatedBy.ordinal()];
        if (i == 1) {
            str = "client";
        } else if (i == 2) {
            str = "autoStart";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        map.put(value, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(str)));
        map.put(Z.engineMode.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(Z.onDevice.getValue())));
        String value2 = Z.closestCalibId.getValue();
        String lastValidCalibrationSessionId = positioningEngine.getLastValidCalibrationSessionId();
        if (lastValidCalibrationSessionId == null) {
            lastValidCalibrationSessionId = "";
        }
        map.put(value2, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(lastValidCalibrationSessionId)));
        String value3 = Z.engineVersion.getValue();
        HashMap map2 = new HashMap();
        map2.put(Z.engineVersionTag.getValue(), JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(((EngineVersionProvider) this.b.getD()).getVersion())));
        PredefinedDataShift predefinedDataShift = positioningEngine.getPredefinedDataShift();
        if (predefinedDataShift != null) {
            String value4 = Z.predefinedDataShift.getValue();
            HashMap map3 = new HashMap();
            map3.put("estimatedDataShift", JsonHelpersKt.toJsonableNumber(predefinedDataShift.getEstimatedDataShift()));
            map3.put("didEstimatedLastEstimationTime", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(predefinedDataShift.getDidEstimatedLastEstimationTime())));
            map3.put("enforceNewEstimation", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(predefinedDataShift.getEnforceNewEstimation())));
            map3.put("updateDateDataShift", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(predefinedDataShift.getUpdateDateDataShiftIso())));
            map2.put(value4, JsonHelpersKt.toJsonableMap(map3));
        }
        map.put(value3, JsonHelpersKt.toJsonableMap(map2));
        map.put(Z.restrictedAreasValidationUploadingEnabled.getValue(), JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(z)));
        map.put("sensorStartTimeUTC", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(me.oriient.positioningengine.common.util.a.a(j, ((TimeProvider) this.f26558a.getD()).getTimeZoneGmt()))));
        return map;
    }

    public static void a(Map map, DataShift dataShift, String str) {
        HashMap map2 = new HashMap();
        map2.put("estShift", JsonHelpersKt.toJsonableNumber(dataShift.getEstShift()));
        map2.put("changeTime", JsonHelpersKt.toJsonableNumber(dataShift.getChangeTime()));
        map2.put("decsQual", dataShift.getDecsQual());
        map2.put("nrmlzdErr", JsonHelpersKt.toJsonableNumber(dataShift.getNrmlzdErr()));
        map2.put("currMinShift", JsonHelpersKt.toJsonableNumber(dataShift.getCurrMinShift()));
        map2.put("nrmlzdErrToEst", JsonHelpersKt.toJsonableNumber(dataShift.getNrmlzdErrToEst()));
        map2.put("numValid", JsonHelpersKt.toJsonableNumber(dataShift.getNumValid()));
        map2.put("outputLastVldTmShift", JsonHelpersKt.toJsonableNumber(dataShift.getOutputLastVldTmShift()));
        map.put(str, JsonHelpersKt.toJsonableMap(map2));
    }

    public static void a(Map map, CalibrationData calibrationData, String str) {
        HashMap map2 = new HashMap();
        map2.put("radius", JsonHelpersKt.toJsonableNumber(calibrationData.getRadius()));
        map2.put("calibStd", JsonHelpersKt.toJsonableNumber(calibrationData.getCalibStd()));
        map2.put("softIronScaleMatrix", calibrationData.getSoftIronScaleMatrix());
        map2.put("softIronScaleMatrixInvTNrmlzd", calibrationData.getSoftIronScaleMatrixInvTNrmlzd());
        map2.put("hardIronOffset", JsonHelpersKt.toJsonableArray(calibrationData.getHardIronOffset()));
        map2.put("covMat", calibrationData.getCovMat());
        map2.put("covDiag", calibrationData.getCovDiag());
        map2.put("innerState", calibrationData.getInnerState());
        map2.put("mgntCov", JsonHelpersKt.toJsonableArray(calibrationData.getMgntCov()));
        map2.put("hardIronCov", JsonHelpersKt.toJsonableArray(calibrationData.getHardIronCov()));
        map2.put("scaleMtxDiagCov", JsonHelpersKt.toJsonableArray(calibrationData.getScaleMtxDiagCov()));
        map2.put("scaleMtxOffDiagCov", JsonHelpersKt.toJsonableArray(calibrationData.getScaleMtxOffDiagCov()));
        map2.put("gesturesInnovation", JsonHelpersKt.toJsonableNumber(calibrationData.getGesturesInnovation()));
        map2.put("softIronLsErr", JsonHelpersKt.toJsonableNumber(calibrationData.getSoftIronLsErr()));
        map2.put("hardIronLsErr", JsonHelpersKt.toJsonableNumber(calibrationData.getHardIronLsErr()));
        map2.put("ttlErr", JsonHelpersKt.toJsonableNumber(calibrationData.getTtlErr()));
        map2.put("progress", JsonHelpersKt.toJsonableNumber(calibrationData.getProgress()));
        map2.put("maxProgress", JsonHelpersKt.toJsonableNumber(calibrationData.getMaxProgress()));
        HashMap map3 = new HashMap();
        map3.put("Method", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(calibrationData.getFullState().getMethod())));
        map3.put("estVec", calibrationData.getFullState().getEstVec());
        map3.put("estCov", calibrationData.getFullState().getEstCov());
        map2.put("fullState", JsonHelpersKt.toJsonableMap(map3));
        map2.put("type", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(calibrationData.getType())));
        map2.put("lastSuccessUtcTime", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(calibrationData.getLastSuccessfulTime())));
        map.put(str, JsonHelpersKt.toJsonableMap(map2));
    }

    public static void a(Map map, SensorManagerConfig sensorManagerConfig, PositioningConfig positioningConfig, GeofenceConfig geofenceConfig, OnDeviceEngineCoreConfig onDeviceEngineCoreConfig) {
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map3.put("useNewSensorsManager", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorManagerConfig.getUseNewSensorManager())));
        map3.put("monitorFreezes", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorManagerConfig.getMonitorFreezes())));
        map3.put("validateSamples", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorManagerConfig.getValidateSamples())));
        map3.put("stopSessionOnSensorError", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorManagerConfig.getStopSessionOnSensorError())));
        map3.put("stopSessionIfSensorDataOutdated", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorManagerConfig.getStopSessionIfSensorDataOutdated())));
        SensorsConfig sensorsConfig = sensorManagerConfig.getSensorsConfig();
        map3.put("useSensorBatching", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorsConfig.getGyroscope().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getGyroscopeUncalibrated().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getAccelerometer().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getGameRotation().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getMagneticField().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getMagneticFieldUncalibrated().getMaxReportLatencyMicroSec() > 0 || sensorsConfig.getPressure().getMaxReportLatencyMicroSec() > 0)));
        HashMap map4 = new HashMap();
        map4.put("gyroscope", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getGyroscope().getMaxReportLatencyMicroSec())));
        map4.put("accelerometer", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getAccelerometer().getMaxReportLatencyMicroSec())));
        map4.put("magneticField", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getMagneticField().getMaxReportLatencyMicroSec())));
        map4.put("gyroscopeUncalibrated", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getGyroscopeUncalibrated().getMaxReportLatencyMicroSec())));
        map4.put("magneticFieldUncalibrated", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getMagneticFieldUncalibrated().getMaxReportLatencyMicroSec())));
        map4.put("gameRotation", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getGameRotation().getMaxReportLatencyMicroSec())));
        map4.put("pressure", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorManagerConfig.getSensorsConfig().getPressure().getMaxReportLatencyMicroSec())));
        map3.put("sensorBatchingLatency", JsonHelpersKt.toJsonableMap(map4));
        map2.put("sensorsManager", JsonHelpersKt.toJsonableMap(map3));
        HashMap map5 = new HashMap();
        map5.put("isRouteOnDevice", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(true)));
        map2.put("navigation", JsonHelpersKt.toJsonableMap(map5));
        HashMap map6 = new HashMap();
        map6.put("enableAutoStartPositioning", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(positioningConfig.getEnableAutoStartPositioning())));
        map2.put("positioning", JsonHelpersKt.toJsonableMap(map6));
        HashMap map7 = new HashMap();
        map7.put("usePolygonalGeofence", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(geofenceConfig.getUsePolygonalGeofence())));
        map2.put("geofence", JsonHelpersKt.toJsonableMap(map7));
        HashMap map8 = new HashMap();
        map8.put("flipAxes", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(onDeviceEngineCoreConfig.getRtEngine().getFlipAxes())));
        map2.put("engine", JsonHelpersKt.toJsonableMap(map8));
        map.put("configuration", JsonHelpersKt.toJsonableMap(map2));
    }

    public static void a(Map map, SupportSensorsManager.SensorIssuesReport sensorIssuesReport) {
        Map<SystemSensor, SupportSensorsManager.SensorIssuesCounter> sensorIssues = sensorIssuesReport.getSensorIssues();
        int numClockCorrections = 0;
        int numStuck = 0;
        int numNan = 0;
        int numZeros = 0;
        int numFreezes = 0;
        for (SupportSensorsManager.SensorIssuesCounter sensorIssuesCounter : sensorIssues.values()) {
            numFreezes += sensorIssuesCounter.getNumFreezes();
            numZeros += sensorIssuesCounter.getNumZeros();
            numNan += sensorIssuesCounter.getNumNan();
            numStuck += sensorIssuesCounter.getNumStuck();
            numClockCorrections += sensorIssuesCounter.getNumClockCorrections();
        }
        HashMap map2 = new HashMap();
        map2.put("sensorRestarts", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorIssuesReport.getSensorsRestartCount())));
        map2.put("freezes", a(sensorIssues, numFreezes, b0.f26518a));
        map2.put("zeroes", a(sensorIssues, numZeros, c0.f26519a));
        map2.put("NaNs", a(sensorIssues, numNan, d0.f26521a));
        map2.put("stuck", a(sensorIssues, numStuck, e0.f26529a));
        map2.put("clockCorrection", a(sensorIssues, numClockCorrections, f0.f26552a));
        map.put("sensorIssues", JsonHelpersKt.toJsonableMap(map2));
    }

    public static void a(Map map, NavigationMetrics navigationMetrics) {
        HashMap map2 = new HashMap();
        map2.put("routeRecalculationCount", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(navigationMetrics.getRouteRecalculationCount())));
        map2.put("routeWaypointUpdateCount", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(navigationMetrics.getRouteWaypointUpdateCount())));
        map2.put("routeMaxNumWaypoints", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(navigationMetrics.getRouteMaxNumWaypoints())));
        map2.put("avgRouteCalcTime", JsonHelpersKt.toJsonableNumber(navigationMetrics.getAvgRouteCalcTimeMillis() / 1000.0d));
        map2.put("maxRouteCalcTime", JsonHelpersKt.toJsonableNumber(navigationMetrics.getMaxRouteCalcTimeMillis() / 1000.0d));
        map.put("navigation", JsonHelpersKt.toJsonableMap(map2));
    }

    public static JsonableMap a(Map map, int i, Function1 function1) {
        HashMap map2 = new HashMap();
        map2.put("gyroscope", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.GYROSCOPE))).intValue())));
        map2.put("accelerometer", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.ACCELEROMETER))).intValue())));
        map2.put("magneticField", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.MAGNETIC_FIELD))).intValue())));
        map2.put("gyroscopeUncalibrated", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.GYROSCOPE_UNCALIBRATED))).intValue())));
        map2.put("magneticFieldUncalibrated", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.MAGNETIC_FIELD_UNCALIBRATED))).intValue())));
        map2.put("gameRotation", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.GAME_ROTATION_VECTOR))).intValue())));
        map2.put("pressure", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.PRESSURE))).intValue())));
        map2.put("location", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(((Number) function1.invoke(map.get(SystemSensor.LOCATION))).intValue())));
        map2.put("total", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(i)));
        return JsonHelpersKt.toJsonableMap(map2);
    }

    public static double a(ArrayList arrayList, Long l) {
        if (((l0) CollectionsKt.P(arrayList)) != null) {
            IntProgressionIterator it = RangesKt.o(1, arrayList.size()).iterator();
            double dAbs = 0.0d;
            int i = 0;
            while (it.f) {
                int iNextInt = it.nextInt();
                dAbs += Math.abs(((l0) arrayList.get(iNextInt)).f26561a - ((l0) arrayList.get(iNextInt - 1)).b);
                i++;
            }
            if (l != null) {
                dAbs += Math.abs(r0.b - l.longValue());
                i++;
            }
            boolean z = i > 0;
            if (z) {
                return (dAbs / i) / TimeUnit.SECONDS.toMillis(1L);
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return 0.0d;
    }

    public static void a(HashMap map, Map map2) {
        HashMap map3 = new HashMap();
        map3.put("gyroscope", a((SensorInformation) map2.get(SystemSensor.GYROSCOPE)));
        map3.put("accelerometer", a((SensorInformation) map2.get(SystemSensor.ACCELEROMETER)));
        map3.put("magneticField", a((SensorInformation) map2.get(SystemSensor.MAGNETIC_FIELD)));
        map3.put("gyroscopeUncalibrated", a((SensorInformation) map2.get(SystemSensor.GYROSCOPE_UNCALIBRATED)));
        map3.put("magneticFieldUncalibrated", a((SensorInformation) map2.get(SystemSensor.MAGNETIC_FIELD_UNCALIBRATED)));
        map3.put("gameRotation", a((SensorInformation) map2.get(SystemSensor.GAME_ROTATION_VECTOR)));
        map3.put("pressure", a((SensorInformation) map2.get(SystemSensor.PRESSURE)));
        map3.put("location", a((SensorInformation) map2.get(SystemSensor.LOCATION)));
        map.put("sensorInformation", JsonHelpersKt.toJsonableMap(map3));
    }

    public static JsonableMap a(SensorInformation sensorInformation) {
        if (sensorInformation == null) {
            return new JsonableMap(new HashMap());
        }
        HashMap map = new HashMap();
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(sensorInformation.getName())));
        map.put("vendor", JsonableString.m385boximpl(JsonHelpersKt.toJsonableString(sensorInformation.getVendor())));
        map.put("version", JsonableNumber.m377boximpl(JsonHelpersKt.toJsonableNumber(sensorInformation.getVersion())));
        map.put("batchingSupported", JsonableBoolean.m369boximpl(JsonHelpersKt.toJsonableBoolean(sensorInformation.getBatchingSupported())));
        return JsonHelpersKt.toJsonableMap(map);
    }
}
