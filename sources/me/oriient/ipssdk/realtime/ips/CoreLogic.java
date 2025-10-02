package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Space;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithSvgImage;
import me.oriient.internal.services.dataManager.floorMetadata.SignMark;
import me.oriient.internal.services.dataManager.floorMetadata.SignMarkVisibleRange;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderRepository;
import me.oriient.internal.services.dataManager.plai.PlaiRepository;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;
import me.oriient.internal.services.systemStateManager.SystemStateManager;
import me.oriient.internal.services.systemStateManager.UiEvent;
import me.oriient.ipssdk.api.IPSGeofencing;
import me.oriient.ipssdk.api.listeners.IPSBuildingsSearchListener;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.api.listeners.IPSLogoutListener;
import me.oriient.ipssdk.api.listeners.IPSMapListener;
import me.oriient.ipssdk.api.models.IPSBuildingLayout;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloorImage;
import me.oriient.ipssdk.api.models.IPSFloorImageData;
import me.oriient.ipssdk.api.models.IPSSignMark;
import me.oriient.ipssdk.api.models.IPSSignMarkMetadata;
import me.oriient.ipssdk.api.models.IPSSignMarkVisibleRange;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.api.models.IPSSvgImage;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.utils.CancellableProcess;
import me.oriient.ipssdk.common.utils.Utils;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.models.Offset;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ofs.A0;
import me.oriient.ipssdk.realtime.ofs.AbstractC1685m0;
import me.oriient.ipssdk.realtime.ofs.AbstractC1691n0;
import me.oriient.ipssdk.realtime.ofs.C0;
import me.oriient.ipssdk.realtime.ofs.C1649g0;
import me.oriient.ipssdk.realtime.ofs.C1661i0;
import me.oriient.ipssdk.realtime.ofs.C1673k0;
import me.oriient.ipssdk.realtime.ofs.C1679l0;
import me.oriient.ipssdk.realtime.ofs.C1703p0;
import me.oriient.ipssdk.realtime.ofs.C1731u0;
import me.oriient.ipssdk.realtime.ofs.C1736v0;
import me.oriient.ipssdk.realtime.ofs.C1751y0;
import me.oriient.ipssdk.realtime.ofs.E0;
import me.oriient.ipssdk.realtime.ofs.H0;
import me.oriient.ipssdk.realtime.ofs.I0;
import me.oriient.ipssdk.realtime.ofs.K0;
import me.oriient.ipssdk.realtime.ofs.N0;
import me.oriient.ipssdk.realtime.ofs.O2;
import me.oriient.ipssdk.realtime.ofs.P0;
import me.oriient.ipssdk.realtime.ofs.Q0;
import me.oriient.ipssdk.realtime.ofs.R0;
import me.oriient.ipssdk.realtime.ofs.S0;
import me.oriient.ipssdk.realtime.ofs.T0;
import me.oriient.ipssdk.realtime.ofs.U0;
import me.oriient.ipssdk.realtime.ofs.V0;
import me.oriient.ipssdk.realtime.ofs.W0;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import me.oriient.positioningengine.ondevice.StartPosition;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import me.oriient.positioningengine.support.device_data.model.BlacklistedFeature;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0081\u0001\u0082\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b#\u0010$J%\u0010#\u001a\u0004\u0018\u00010&2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020!0%¢\u0006\u0004\b#\u0010'J9\u0010.\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(2\b\u0010\u0003\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u0004\u0018\u00010&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002010%¢\u0006\u0004\b2\u00103J/\u00106\u001a\u0004\u0018\u00010&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u000205¢\u0006\u0004\b6\u00107J)\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J?\u0010G\u001a\u00020\u00042\u0006\u00109\u001a\u0002082\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\bG\u0010HJ\u001d\u0010I\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\bI\u0010?J\u000f\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u000208¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJ\u0015\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ(\u0010Z\u001a\u00020\u00042\u0006\u0010W\u001a\u00020J2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020\u001bH\u0086@¢\u0006\u0004\bZ\u0010[R\u001a\u0010^\u001a\u0002088\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010NR.\u0010e\u001a\u0004\u0018\u00010O2\b\u0010_\u001a\u0004\u0018\u00010O8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010RR$\u0010l\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bm\u0010nR\u0011\u0010o\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bo\u0010NR\u0013\u0010s\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010v\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010w\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bw\u0010NR\u0011\u0010x\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bx\u0010NR\u0011\u0010|\u001a\u00020y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0018\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020}0@8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/CoreLogic;", "", "Lme/oriient/ipssdk/realtime/ofs/O2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addNetworkStateListener", "(Lme/oriient/ipssdk/realtime/ofs/O2;)V", "removeNetworkStateListener", "Lme/oriient/ipssdk/realtime/ips/ISessionStateListener;", "sessionStateListener", "addSessionStateListener$me_oriient_sdk_realtime", "(Lme/oriient/ipssdk/realtime/ips/ISessionStateListener;)V", "addSessionStateListener", "Lme/oriient/ipssdk/realtime/ips/ISessionDataListener;", "sessionDataListener", "addSessionDataListener$me_oriient_sdk_realtime", "(Lme/oriient/ipssdk/realtime/ips/ISessionDataListener;)V", "addSessionDataListener", "Lme/oriient/ipssdk/realtime/ips/Core$LoginCandidate;", "loginCandidate", "Lme/oriient/ipssdk/api/listeners/IPSLoginListener;", "login$me_oriient_sdk_realtime", "(Lme/oriient/ipssdk/realtime/ips/Core$LoginCandidate;Lme/oriient/ipssdk/api/listeners/IPSLoginListener;)V", "login", "Lme/oriient/ipssdk/api/listeners/IPSLogoutListener;", "logout", "(Lme/oriient/ipssdk/api/listeners/IPSLogoutListener;)V", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "clearAllCaches", "(Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "", "buildingId", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/ipssdk/api/models/IPSBuildingLayout;", "Lme/oriient/internal/infra/utils/core/OriientError;", "getBuildingLayout", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/ipssdk/api/listeners/IPSListener;", "Lme/oriient/ipssdk/api/models/IPSCancelable;", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "", h.a.b, h.a.c, "searchRadiusMeters", "fetchRadiusMeters", "Lme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;", "searchBuildingsByLocation", "(FFFFLme/oriient/ipssdk/api/listeners/IPSBuildingsSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "floorId", "Lme/oriient/ipssdk/api/models/IPSFloorImageData;", "getFloorMapById", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "mapId", "Lme/oriient/ipssdk/api/listeners/IPSMapListener;", "getMapById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSMapListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "", "initiatedByUser", "startCalibration", "(ZLjava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "stopCalibration", "(Lme/oriient/positioningengine/common/EngineStopReason;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "", "Lme/oriient/internal/services/dataManager/building/Floor;", "floors", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "startingPosition", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "startLocation", "startPositioning", "(ZLjava/util/List;Lme/oriient/ipssdk/api/models/IPSStartingPosition;Lme/oriient/internal/infra/locationManager/SystemLocation;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "stopPositioning", "Lme/oriient/ipssdk/base/auth/User;", "getUser", "()Lme/oriient/ipssdk/base/auth/User;", "sensorsValid", "()Z", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "setNewActiveBuilding", "(Lme/oriient/internal/services/dataManager/building/Building;)V", "Lme/oriient/internal/services/systemStateManager/UiEvent;", "uiEvent", "registerSystemEvent", "(Lme/oriient/internal/services/systemStateManager/UiEvent;)V", "user", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", MlModel.MODEL_FILE_SUFFIX, "handleSpaceChange", "(Lme/oriient/ipssdk/base/auth/User;Lme/oriient/internal/services/dataModel/engine/EngineConfig;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "B", "Z", "isLimitedConnectionSupported", "value", "D", "Lme/oriient/internal/services/dataManager/building/Building;", "getActiveBuilding", "()Lme/oriient/internal/services/dataManager/building/Building;", "setActiveBuilding", "activeBuilding", "E", "Lme/oriient/internal/services/dataManager/building/Floor;", "getActiveFloor", "()Lme/oriient/internal/services/dataManager/building/Floor;", "setActiveFloor", "(Lme/oriient/internal/services/dataManager/building/Floor;)V", "activeFloor", "SEARCH_BUILDING_REQUEST_ID", "Ljava/lang/String;", "isCalibrationGestureNeeded", "Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "getCalibrationGestureReason", "()Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "calibrationGestureReason", "getEngineSessionId", "()Ljava/lang/String;", "engineSessionId", "isEngineNull", "isEngineIdle", "", "getSessionStartTimeMilliUTC", "()J", "sessionStartTimeMilliUTC", "Lme/oriient/positioningengine/support/device_data/model/BlacklistedFeature;", "getBlacklistedFeatures", "()Ljava/util/List;", "blacklistedFeatures", "OperationListener", "me/oriient/ipssdk/realtime/ips/b", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CoreLogic {
    private static Job A = null;

    /* renamed from: B, reason: from kotlin metadata */
    private static final boolean isLimitedConnectionSupported;
    private static User C = null;

    /* renamed from: D, reason: from kotlin metadata */
    private static Building activeBuilding = null;

    /* renamed from: E, reason: from kotlin metadata */
    private static Floor activeFloor = null;
    private static boolean F = false;
    private static final ArrayList G;
    private static final ArrayList H;
    private static final ArrayList I;

    @NotNull
    public static final CoreLogic INSTANCE = new CoreLogic();
    private static final ArrayList J;
    private static final CoroutineScope K;
    private static final Lazy L;
    private static final EnumMap M;
    private static Job N = null;
    private static final b O;

    @NotNull
    public static final String SEARCH_BUILDING_REQUEST_ID = "publicApi";

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25820a;
    private static final Lazy b;
    private static final Lazy c;
    private static final Lazy d;
    private static final Lazy e;
    private static final Lazy f;
    private static final Lazy g;
    private static final Lazy h;
    private static final Lazy i;
    private static final Lazy j;
    private static final Lazy k;
    private static final Lazy l;
    private static final Lazy m;
    private static final Lazy n;
    private static final Lazy o;
    private static final Lazy p;
    private static final Lazy q;
    private static final Lazy r;
    private static final Lazy s;
    private static final Lazy t;
    private static final Lazy u;
    private static final Lazy v;
    private static final Lazy w;
    private static final Lazy x;
    private static final Lazy y;
    private static final Lazy z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/CoreLogic$OperationListener;", "", "(Ljava/lang/String;I)V", "StartCalibration", "StartPositioning", "StopCalibration", "StopPositioning", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationListener {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OperationListener[] $VALUES;
        public static final OperationListener StartCalibration = new OperationListener("StartCalibration", 0);
        public static final OperationListener StartPositioning = new OperationListener("StartPositioning", 1);
        public static final OperationListener StopCalibration = new OperationListener("StopCalibration", 2);
        public static final OperationListener StopPositioning = new OperationListener("StopPositioning", 3);

        private static final /* synthetic */ OperationListener[] $values() {
            return new OperationListener[]{StartCalibration, StartPositioning, StopCalibration, StopPositioning};
        }

        static {
            OperationListener[] operationListenerArr$values = $values();
            $VALUES = operationListenerArr$values;
            $ENTRIES = EnumEntriesKt.a(operationListenerArr$values);
        }

        private OperationListener(String str, int i) {
        }

        @NotNull
        public static EnumEntries<OperationListener> getEntries() {
            return $ENTRIES;
        }

        public static OperationListener valueOf(String str) {
            return (OperationListener) Enum.valueOf(OperationListener.class, str);
        }

        public static OperationListener[] values() {
            return (OperationListener[]) $VALUES.clone();
        }
    }

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25820a = di.inject(reflectionFactory.b(Logger.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NetworkManager.class));
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RestService.class));
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildData.class));
        e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportEngineUploadManager.class));
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NavigationManager.class));
        h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(FloorImagesProvider.class));
        i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Metric.class));
        j = lazyInject;
        Lazy lazyInject2 = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportSensorsManager.class));
        k = lazyInject2;
        l = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Utils.class));
        m = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        n = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        o = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SensorIssuesELogSender.class));
        p = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SystemStateManager.class));
        q = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SensorIssuesMonitor.class));
        r = DependencyInjectionKt.getDi().inject(reflectionFactory.b(FloorMetadataRepository.class));
        s = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        t = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ObstaclesPolygonsFinderRepository.class));
        u = DependencyInjectionKt.getDi().inject(reflectionFactory.b(FloorTransitionsRepository.class));
        v = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RegionRepository.class));
        w = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        x = DependencyInjectionKt.getDi().inject(reflectionFactory.b(DataPreloadingManager.class));
        y = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingCoordinateConverterRepository.class));
        z = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PlaiRepository.class));
        isLimitedConnectionSupported = true;
        G = new ArrayList();
        H = new ArrayList();
        I = new ArrayList();
        J = new ArrayList();
        ContextScope contextScopeA = CoroutineScopeKt.a(Dispatchers.f24691a);
        K = contextScopeA;
        L = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SdkNavigationPositioningProvider.class));
        M = new EnumMap(OperationListener.class);
        b bVar = new b();
        O = bVar;
        BuildersKt.c(contextScopeA, null, null, new C1649g0(null), 3);
        ((SupportSensorsManager) lazyInject2.getD()).setDelegate(bVar);
        BuildersKt.c(contextScopeA, null, null, new C1661i0(null), 3);
        BuildersKt.c(contextScopeA, null, null, new C1673k0(null), 3);
    }

    private CoreLogic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Core.LoginCandidate loginCandidate, IPSLoginListener iPSLoginListener) {
        ((Logger) f25820a.getD()).d("CoreLogic", "doLogin() called with: listener = [" + iPSLoginListener + "], loginCandidate = [" + loginCandidate + ']');
        BuildersKt.c(K, null, null, new d(loginCandidate, this, iPSLoginListener, null), 3);
    }

    public static final void access$addOperationListener(CoreLogic coreLogic, IPSCompletionListener iPSCompletionListener, OperationListener operationListener) {
        coreLogic.getClass();
        M.put((EnumMap) operationListener, (OperationListener) iPSCompletionListener);
    }

    public static final IPSFloorImageData access$createFloorMapFromBitmap(CoreLogic coreLogic, FloorMetadataWithImage floorMetadataWithImage) {
        coreLogic.getClass();
        double pixelToMeter = floorMetadataWithImage.getMetadata().getPixelToMeter() == 0.0d ? 1.0d : floorMetadataWithImage.getMetadata().getPixelToMeter();
        return new IPSFloorImageData(floorMetadataWithImage.getMetadata().getId(), floorMetadataWithImage.getMetadata().getName(), new IPSFloorImage.IPSFloorBitmapImage(floorMetadataWithImage.getImage()), floorMetadataWithImage.getMetadata().getPixelToMeter(), floorMetadataWithImage.getImage().getWidth() / pixelToMeter, floorMetadataWithImage.getImage().getHeight() / pixelToMeter, new Offset(floorMetadataWithImage.getMetadata().getOffset().getX(), floorMetadataWithImage.getMetadata().getOffset().getY()), floorMetadataWithImage.getMetadata().getPreferredInitialRotationDegrees(), a(floorMetadataWithImage.getMetadata().getSignMarks()));
    }

    public static final IPSFloorImageData access$createFloorMapFromSVG(CoreLogic coreLogic, FloorMetadataWithSvgImage floorMetadataWithSvgImage) {
        coreLogic.getClass();
        double pixelToMeter = floorMetadataWithSvgImage.getMetadata().getPixelToMeter() == 0.0d ? 1.0d : floorMetadataWithSvgImage.getMetadata().getPixelToMeter();
        return new IPSFloorImageData(floorMetadataWithSvgImage.getMetadata().getId(), floorMetadataWithSvgImage.getMetadata().getName(), new IPSFloorImage.IPSFloorSvgImage(new IPSSvgImage(floorMetadataWithSvgImage.getImage())), floorMetadataWithSvgImage.getMetadata().getPixelToMeter(), floorMetadataWithSvgImage.getImage().c() / pixelToMeter, floorMetadataWithSvgImage.getImage().b() / pixelToMeter, new Offset(floorMetadataWithSvgImage.getMetadata().getOffset().getX(), floorMetadataWithSvgImage.getMetadata().getOffset().getY()), floorMetadataWithSvgImage.getMetadata().getPreferredInitialRotationDegrees(), a(floorMetadataWithSvgImage.getMetadata().getSignMarks()));
    }

    public static final AuthManager access$getAuthManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (AuthManager) w.getD();
    }

    public static final BuildData access$getBuildData(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (BuildData) d.getD();
    }

    public static final BuildingRepository access$getBuildingRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (BuildingRepository) s.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (RemoteConfigManager) n.getD();
    }

    public static final BuildingCoordinateConverterRepository access$getCoordinateConverterRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (BuildingCoordinateConverterRepository) y.getD();
    }

    public static final DataPreloadingManager access$getDataPreloaderManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (DataPreloadingManager) x.getD();
    }

    public static final ELog access$getELog(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (ELog) i.getD();
    }

    public static final SupportPositioningEngineManager access$getEngineManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (SupportPositioningEngineManager) f.getD();
    }

    public static final FloorImagesProvider access$getFloorImagesProvider(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (FloorImagesProvider) h.getD();
    }

    public static final FloorMetadataRepository access$getFloorMetadataRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (FloorMetadataRepository) r.getD();
    }

    public static final FloorTransitionsRepository access$getFloorTransitionsRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (FloorTransitionsRepository) u.getD();
    }

    public static final Logger access$getLogger(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (Logger) f25820a.getD();
    }

    public static final Metric access$getMetric(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (Metric) j.getD();
    }

    public static final NavigationManager access$getNavigationManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (NavigationManager) g.getD();
    }

    public static final NetworkManager access$getNetworkManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (NetworkManager) b.getD();
    }

    public static final ObstaclesPolygonsFinderRepository access$getObstaclesPolygonsFinderRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (ObstaclesPolygonsFinderRepository) t.getD();
    }

    public static final PlaiRepository access$getPlaiRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (PlaiRepository) z.getD();
    }

    public static final RegionRepository access$getRegionRepository(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (RegionRepository) v.getD();
    }

    public static final RestService access$getRestService(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (RestService) c.getD();
    }

    public static final SensorIssuesELogSender access$getSensorIssuesELogSender(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (SensorIssuesELogSender) o.getD();
    }

    public static final SupportSensorsManager access$getSensorsDataProvider(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (SupportSensorsManager) k.getD();
    }

    public static final SupportEngineUploadManager access$getSupportEngineUploadManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (SupportEngineUploadManager) e.getD();
    }

    public static final SystemStateManager access$getSystemStateManager(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (SystemStateManager) p.getD();
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "CoreLogic";
    }

    public static final TimeProvider access$getTimeProvider(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (TimeProvider) m.getD();
    }

    public static final Utils access$getUtils(CoreLogic coreLogic) {
        coreLogic.getClass();
        return (Utils) l.getD();
    }

    public static final void access$observerEngine(CoreLogic coreLogic, PositioningEngine positioningEngine) {
        coreLogic.getClass();
        ArrayList arrayList = J;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel((CancellationException) null);
            arrayList2.add(Unit.f24250a);
        }
        ArrayList arrayList3 = J;
        arrayList3.clear();
        if (positioningEngine == null) {
            return;
        }
        CoroutineScope coroutineScope = K;
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new A0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new C0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new E0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new H0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new I0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new K0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new N0(positioningEngine, null), 3));
        arrayList3.add(BuildersKt.c(coroutineScope, null, null, new T0(positioningEngine, (RemoteConfigManager) n.getD(), null), 3));
    }

    public static final void access$onActiveFloorChanged(CoreLogic coreLogic, String str) {
        StateFlow<PositioningEngineState> state;
        coreLogic.getClass();
        Lazy lazy = f25820a;
        ((Logger) lazy.getD()).d("CoreLogic", "onActiveFloorChanged() called with: floorId = [" + str + ']');
        Positioning positioning = Positioning.INSTANCE;
        if (positioning.getPositioningState() == 4) {
            ((Logger) lazy.getD()).e("CoreLogic", "onActiveFloorChanged: active map change already in progress");
            ((ELog) i.getD()).e("CoreLogic", "onActiveFloorChanged: active map change already in progress");
            return;
        }
        positioning.onChangeActiveFloorStarted();
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        PositioningEngineState positioningEngineState = (positioningEngine == null || (state = positioningEngine.getState()) == null) ? null : (PositioningEngineState) state.getValue();
        if (positioningEngineState == null || !(positioningEngineState instanceof PositioningEngineState.Positioning)) {
            ((Logger) lazy.getD()).e("CoreLogic", "setActiveMap: unable to complete operation. no open session");
            ((ELog) i.getD()).e("CoreLogic", "setActiveMap: unable to complete operation. no open session");
            positioning.onChangeActiveFloorEnded();
            return;
        }
        Floor floor = activeFloor;
        if (Intrinsics.c(floor != null ? floor.getId() : null, str)) {
            positioning.onChangeActiveFloorEnded();
        } else {
            positioning.onActiveFloorChanged$me_oriient_sdk_realtime(str);
        }
        Building building = activeBuilding;
        if (building != null) {
            for (Floor floor2 : building.getFloors()) {
                if (Intrinsics.c(floor2.getId(), str)) {
                    Positioning.INSTANCE.notifyFloorChanged$me_oriient_sdk_realtime(floor2);
                    activeFloor = floor2;
                    Proximity.INSTANCE.onNewBuilding(building, floor2.getOrder());
                    return;
                }
            }
        }
        ELog eLog = (ELog) i.getD();
        Building building2 = activeBuilding;
        eLog.w("CoreLogic", "new map received - not in the current building", MapsKt.j(new Pair("buildingId", building2 != null ? building2.getId() : null), new Pair("floorId", str)));
    }

    public static final void access$onCalibrationNeeded(CoreLogic coreLogic, CalibrationReason calibrationReason, String str) {
        coreLogic.getClass();
        Iterator it = CollectionsKt.G0(H).iterator();
        while (it.hasNext()) {
            ((ISessionDataListener) it.next()).onCalibrationNeeded(calibrationReason, str);
        }
    }

    public static final void access$onCalibrationUpdate(CoreLogic coreLogic, float f2) {
        coreLogic.getClass();
        Iterator it = CollectionsKt.G0(H).iterator();
        while (it.hasNext()) {
            ((ISessionDataListener) it.next()).onCalibrationUpdate(f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$onLoginProcessFailed(me.oriient.ipssdk.realtime.ips.CoreLogic r4, me.oriient.ipssdk.common.utils.models.Error r5, me.oriient.ipssdk.api.listeners.IPSLoginListener r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof me.oriient.ipssdk.realtime.ofs.O0
            if (r0 == 0) goto L16
            r0 = r7
            me.oriient.ipssdk.realtime.ofs.O0 r0 = (me.oriient.ipssdk.realtime.ofs.O0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.O0 r0 = new me.oriient.ipssdk.realtime.ofs.O0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            me.oriient.ipssdk.api.listeners.IPSLoginListener r6 = r0.c
            me.oriient.ipssdk.common.utils.models.Error r5 = r0.b
            me.oriient.ipssdk.realtime.ips.CoreLogic r4 = r0.f25985a
            kotlin.ResultKt.b(r7)
            goto L55
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.b(r7)
            r7 = 0
            me.oriient.ipssdk.realtime.ips.CoreLogic.C = r7
            kotlin.Lazy r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.w
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.auth.AuthManager r7 = (me.oriient.internal.services.auth.AuthManager) r7
            r0.f25985a = r4
            r0.b = r5
            r0.c = r6
            r0.f = r3
            java.lang.Object r7 = r7.logout(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = 0
            me.oriient.ipssdk.realtime.ips.CoreLogic.F = r7
            r6.onError(r5)     // Catch: java.lang.Exception -> L5c
            goto La9
        L5c:
            r5 = move-exception
            me.oriient.ipssdk.common.ips.ListenerException r7 = new me.oriient.ipssdk.common.ips.ListenerException
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.<init>(r0, r5)
            r4.getClass()
            kotlin.Lazy r4 = me.oriient.ipssdk.realtime.ips.CoreLogic.i
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.services.elog.ELog r4 = (me.oriient.internal.services.elog.ELog) r4
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = "errorMessage"
            java.lang.String r1 = "Exception in application"
            me.oriient.ipssdk.realtime.ofs.AbstractC1691n0.a(r7, r0, r4, r5, r1)
            kotlin.Lazy r4 = me.oriient.ipssdk.realtime.ips.CoreLogic.f25820a
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.infra.utils.core.Logger r4 = (me.oriient.internal.infra.utils.core.Logger) r4
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in application: "
            r6.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.e(r5, r6)
        La9:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.CoreLogic.access$onLoginProcessFailed(me.oriient.ipssdk.realtime.ips.CoreLogic, me.oriient.ipssdk.common.utils.models.Error, me.oriient.ipssdk.api.listeners.IPSLoginListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void access$onPositioningUpdate(CoreLogic coreLogic, Position position, PositioningUpdate positioningUpdate) {
        coreLogic.getClass();
        System.currentTimeMillis();
        Iterator it = CollectionsKt.G0(H).iterator();
        while (it.hasNext()) {
            ((ISessionDataListener) it.next()).onPositioningUpdate(position, positioningUpdate);
        }
    }

    public static final void access$onSessionError(CoreLogic coreLogic, IPSError iPSError) {
        coreLogic.getClass();
        ((ELog) i.getD()).e("CoreLogic", "session error", MapsKt.j(new Pair("errorCode", Integer.valueOf(iPSError.getCode())), new Pair("errorMessage", iPSError.getMessage())));
        Iterator it = CollectionsKt.G0(H).iterator();
        while (it.hasNext()) {
            ((ISessionDataListener) it.next()).onSessionError(iPSError);
        }
        a(iPSError, OperationListener.StartCalibration);
        a(iPSError, OperationListener.StartPositioning);
        a(iPSError, OperationListener.StopCalibration);
        a(iPSError, OperationListener.StopPositioning);
    }

    public static final void access$onSessionStateChanged(CoreLogic coreLogic, PositioningEngineState positioningEngineState) {
        long startTimeMillis;
        Building building;
        List<Floor> floors;
        coreLogic.getClass();
        ((Logger) f25820a.getD()).d("CoreLogic", "onSessionStateChanged() called with: newState = [" + positioningEngineState + ']');
        RuntimeDataManager runtimeDataManager = (RuntimeDataManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(RuntimeDataManager.class));
        if (positioningEngineState instanceof PositioningEngineState.Idle) {
            runtimeDataManager.setPositioningActive(false);
            runtimeDataManager.setCalibrationActive(false);
            a(OperationListener.StopCalibration);
            a(OperationListener.StopPositioning);
        } else if (positioningEngineState instanceof PositioningEngineState.Calibrating) {
            runtimeDataManager.setPositioningActive(false);
            runtimeDataManager.setCalibrationActive(true);
            a(OperationListener.StartCalibration);
        } else if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            runtimeDataManager.setPositioningActive(true);
            runtimeDataManager.setCalibrationActive(false);
            a(OperationListener.StartPositioning);
            a(OperationListener.StartCalibration);
        }
        boolean z2 = positioningEngineState instanceof PositioningEngineState.Positioning;
        if (!z2) {
            ((SdkNavigationPositioningProvider) L.getD()).onNewBuilding(null);
        }
        if (positioningEngineState == null ? true : positioningEngineState instanceof PositioningEngineState.Idle) {
            startTimeMillis = -1;
        } else if (z2) {
            startTimeMillis = ((PositioningEngineState.Positioning) positioningEngineState).getContext().getStartTimeMillis();
        } else {
            if (!(positioningEngineState instanceof PositioningEngineState.Calibrating)) {
                throw new NoWhenBranchMatchedException();
            }
            startTimeMillis = ((PositioningEngineState.Calibrating) positioningEngineState).getContext().getStartTimeMillis();
        }
        if (startTimeMillis == -1) {
            ((SupportSensorsManager) k.getD()).turnSensorsOff(false);
        } else {
            Lazy lazy = k;
            if (!((SupportSensorsManager) lazy.getD()).isOn()) {
                ((SupportSensorsManager) lazy.getD()).setDelegate(O);
                boolean z3 = (((RemoteConfigManager) n.getD()).getRealTimeConfig().getMisc().getAllowNoBarometerPositioningInMultifloor() || (building = activeBuilding) == null || (floors = building.getFloors()) == null || floors.size() <= 1) ? false : true;
                ((SensorIssuesMonitor) q.getD()).reset();
                ((SupportSensorsManager) lazy.getD()).turnSensorsOn(z3, startTimeMillis, new SensorsDataProvider.SessionStartListener() { // from class: me.oriient.ipssdk.realtime.ips.CoreLogic$onSessionStateChanged$1
                    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
                    public void onError(@NotNull SensorManagerError error) {
                        Intrinsics.h(error, "error");
                        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
                        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                        loggerAccess$getLogger.e(strAccess$getTAG$p, "onError() called with: error = [" + error + ']');
                        BuildersKt.c(CoreLogic.K, null, null, new P0(error, null), 3);
                    }

                    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
                    public void onSessionStart() {
                        Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
                        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                        loggerAccess$getLogger.d(strAccess$getTAG$p, "onSessionStart() called");
                    }
                });
            }
        }
        Iterator it = CollectionsKt.G0(G).iterator();
        while (it.hasNext()) {
            ((ISessionStateListener) it.next()).onSessionStateChanged(positioningEngineState);
        }
    }

    public static final void access$refreshCaches(CoreLogic coreLogic) {
        coreLogic.getClass();
        BuildersKt.c(K, null, null, new Q0(null), 3);
    }

    public static final void access$setupAutomaticCacheRefreshment(CoreLogic coreLogic) {
        coreLogic.getClass();
        Logger logger = (Logger) f25820a.getD();
        StringBuilder sbA = AbstractC1685m0.a("CoreLogic", "TAG", "setupAutomaticCacheRefreshment ");
        Lazy lazy = n;
        sbA.append(((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getMisc().getEnablePeriodicCacheRefreshing());
        sbA.append(' ');
        sbA.append(((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getMisc().getPeriodicCacheRefreshingTimeHours() * 60.0d);
        logger.d("CoreLogic", sbA.toString());
        if (((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getMisc().getEnablePeriodicCacheRefreshing()) {
            Job job = A;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            A = BuildersKt.c(K, null, null, new S0(null), 3);
            return;
        }
        Job job2 = A;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        A = null;
    }

    public static final void access$startCalibration(CoreLogic coreLogic, final PositioningEngine positioningEngine, final OnDeviceEngineSession onDeviceEngineSession, final boolean z2, final String str, final IPSCompletionListener iPSCompletionListener) {
        coreLogic.getClass();
        ((Logger) f25820a.getD()).d("CoreLogic", "startCalibration() called with: engine = " + positioningEngine + ", listener = " + iPSCompletionListener);
        Lazy lazy = k;
        ((SupportSensorsManager) lazy.getD()).setDelegate(O);
        ((SensorIssuesMonitor) q.getD()).reset();
        final long currentTimeGmt = ((TimeProvider) m.getD()).getCurrentTimeGmt();
        ((SupportSensorsManager) lazy.getD()).turnSensorsOn(false, currentTimeGmt, new SensorsDataProvider.SessionStartListener() { // from class: me.oriient.ipssdk.realtime.ips.CoreLogic.startCalibration.2
            @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
            public void onError(@NotNull SensorManagerError error) {
                Intrinsics.h(error, "error");
                Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
                String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                loggerAccess$getLogger.e(strAccess$getTAG$p, "onError() called with: error = [" + error + ']');
                iPSCompletionListener.onError(ExtensionsKt.toIpsError(error));
            }

            @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
            public void onSessionStart() {
                CoreLogic coreLogic2 = CoreLogic.INSTANCE;
                Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic2);
                String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                loggerAccess$getLogger.d(strAccess$getTAG$p, androidx.camera.core.impl.b.q(AbstractC1685m0.a(strAccess$getTAG$p, "access$getTAG$p(...)", "onSessionStart() called with: sessionStartTimeUTC = ["), currentTimeGmt, ']'));
                CoreLogic.access$addOperationListener(coreLogic2, iPSCompletionListener, OperationListener.StartCalibration);
                BuildersKt.c(CoreLogic.K, null, null, new V0(z2, onDeviceEngineSession, currentTimeGmt, str, positioningEngine, null), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$startPositioning(me.oriient.ipssdk.realtime.ips.CoreLogic r12, final me.oriient.positioningengine.common.PositioningEngine r13, final me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession r14, final me.oriient.internal.services.dataManager.building.Building r15, final java.util.List r16, final boolean r17, final me.oriient.ipssdk.api.models.IPSStartingPosition r18, final me.oriient.internal.infra.locationManager.SystemLocation r19, final me.oriient.ipssdk.api.listeners.IPSCompletionListener r20) {
        /*
            r12.getClass()
            kotlin.Lazy r12 = me.oriient.ipssdk.realtime.ips.CoreLogic.k
            java.lang.Object r0 = r12.getD()
            me.oriient.internal.services.sensorsManager.support.SupportSensorsManager r0 = (me.oriient.internal.services.sensorsManager.support.SupportSensorsManager) r0
            me.oriient.ipssdk.realtime.ips.b r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.O
            r0.setDelegate(r1)
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.CoreLogic.q
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor r0 = (me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor) r0
            r0.reset()
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.CoreLogic.m
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.infra.utils.core.time.TimeProvider r0 = (me.oriient.internal.infra.utils.core.time.TimeProvider) r0
            long r2 = r0.getCurrentTimeGmt()
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.CoreLogic.n
            java.lang.Object r0 = r0.getD()
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager r0 = (me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager) r0
            me.oriient.ipssdk.base.remoteconfig.RealTimeConfig r0 = r0.getRealTimeConfig()
            me.oriient.ipssdk.base.remoteconfig.MiscRealtimeConfig r0 = r0.getMisc()
            boolean r0 = r0.getAllowNoBarometerPositioningInMultifloor()
            if (r0 != 0) goto L4a
            java.util.List r0 = r15.getFloors()
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L4a
        L48:
            r0 = r1
            goto L4c
        L4a:
            r1 = 0
            goto L48
        L4c:
            java.lang.Object r12 = r12.getD()
            me.oriient.internal.services.sensorsManager.support.SupportSensorsManager r12 = (me.oriient.internal.services.sensorsManager.support.SupportSensorsManager) r12
            me.oriient.ipssdk.realtime.ips.CoreLogic$startPositioning$2 r1 = new me.oriient.ipssdk.realtime.ips.CoreLogic$startPositioning$2
            r11 = r13
            r10 = r14
            r6 = r15
            r9 = r16
            r8 = r17
            r7 = r18
            r5 = r19
            r4 = r20
            r1.<init>()
            r12.turnSensorsOn(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.CoreLogic.access$startPositioning(me.oriient.ipssdk.realtime.ips.CoreLogic, me.oriient.positioningengine.common.PositioningEngine, me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession, me.oriient.internal.services.dataManager.building.Building, java.util.List, boolean, me.oriient.ipssdk.api.models.IPSStartingPosition, me.oriient.internal.infra.locationManager.SystemLocation, me.oriient.ipssdk.api.listeners.IPSCompletionListener):void");
    }

    public static final StartPosition access$toStartPosition(CoreLogic coreLogic, IPSStartingPosition iPSStartingPosition) {
        coreLogic.getClass();
        return new StartPosition(iPSStartingPosition.getX(), iPSStartingPosition.getY(), iPSStartingPosition.getC(), null, true);
    }

    public static final void access$turnOffSensors(CoreLogic coreLogic) {
        coreLogic.getClass();
        ((SupportSensorsManager) k.getD()).turnSensorsOff(false);
    }

    public static /* synthetic */ void startCalibration$default(CoreLogic coreLogic, boolean z2, String str, IPSCompletionListener iPSCompletionListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        coreLogic.startCalibration(z2, str, iPSCompletionListener);
    }

    public final void addNetworkStateListener(@NotNull O2 listener) {
        Intrinsics.h(listener, "listener");
        I.add(listener);
    }

    public final void addSessionDataListener$me_oriient_sdk_realtime(@NotNull ISessionDataListener sessionDataListener) {
        Intrinsics.h(sessionDataListener, "sessionDataListener");
        H.add(sessionDataListener);
    }

    public final void addSessionStateListener$me_oriient_sdk_realtime(@NotNull ISessionStateListener sessionStateListener) {
        Intrinsics.h(sessionStateListener, "sessionStateListener");
        G.add(sessionStateListener);
    }

    public final void clearAllCaches(@NotNull IPSCompletionListener listener) {
        Intrinsics.h(listener, "listener");
        BuildersKt.c(K, null, null, new C1679l0(listener, null), 3);
    }

    @Nullable
    public final Building getActiveBuilding() {
        return activeBuilding;
    }

    @Nullable
    public final Floor getActiveFloor() {
        return activeFloor;
    }

    @NotNull
    public final List<BlacklistedFeature> getBlacklistedFeatures() {
        return ((SupportPositioningEngineManager) f.getD()).getBlacklistedFeatures();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ac -> B:31:0x00af). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getBuildingLayout(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<me.oriient.ipssdk.api.models.IPSBuildingLayout, me.oriient.internal.infra.utils.core.OriientError>> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.CoreLogic.getBuildingLayout(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final CalibrationReason getCalibrationGestureReason() {
        StateFlow<CalibrationNeeded> calibrationNeededUpdates;
        CalibrationNeeded calibrationNeeded;
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        return CalibrationReason.INSTANCE.from((positioningEngine == null || (calibrationNeededUpdates = positioningEngine.getCalibrationNeededUpdates()) == null || (calibrationNeeded = (CalibrationNeeded) calibrationNeededUpdates.getValue()) == null) ? null : calibrationNeeded.getReason());
    }

    @Nullable
    public final String getEngineSessionId() {
        StateFlow<PositioningEngineState> state;
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        PositioningEngineState positioningEngineState = (positioningEngine == null || (state = positioningEngine.getState()) == null) ? null : (PositioningEngineState) state.getValue();
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            return ((PositioningEngineState.Positioning) positioningEngineState).getContext().getSessionId();
        }
        if (positioningEngineState instanceof PositioningEngineState.Calibrating) {
            return ((PositioningEngineState.Calibrating) positioningEngineState).getContext().getSessionId();
        }
        return null;
    }

    @Nullable
    public final IPSCancelable getFloorMapById(@NotNull String buildingId, @NotNull String floorId, @NotNull IPSListener<IPSFloorImageData> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25820a;
        Logger logger = (Logger) lazy.getD();
        StringBuilder sbV = YU.a.v("getFloorMapById() called with: buildingId = ", buildingId, ", floorId = ", floorId, ", listener = ");
        sbV.append(listener);
        logger.d("CoreLogic", sbV.toString());
        if (getUser() != null) {
            return new CancellableProcess(BuildersKt.c(K, null, null, new C1731u0(buildingId, floorId, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("CoreLogic", "getMapById: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    @Nullable
    public final IPSCancelable getMapById(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull IPSMapListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25820a;
        Logger logger = (Logger) lazy.getD();
        StringBuilder sbV = YU.a.v("getMapById() called with: buildingId = ", buildingId, ", floorId = ", floorId, ", mapId = ");
        sbV.append(mapId);
        sbV.append(", listener = ");
        sbV.append(listener);
        logger.d("CoreLogic", sbV.toString());
        if (getUser() != null) {
            return new CancellableProcess(BuildersKt.c(K, null, null, new C1736v0(buildingId, floorId, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("CoreLogic", "getMapById: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    public final long getSessionStartTimeMilliUTC() {
        StateFlow<PositioningEngineState> state;
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        PositioningEngineState positioningEngineState = (positioningEngine == null || (state = positioningEngine.getState()) == null) ? null : (PositioningEngineState) state.getValue();
        if (positioningEngineState == null ? true : positioningEngineState instanceof PositioningEngineState.Idle) {
            return -1L;
        }
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            return ((PositioningEngineState.Positioning) positioningEngineState).getContext().getStartTimeMillis();
        }
        if (positioningEngineState instanceof PositioningEngineState.Calibrating) {
            return ((PositioningEngineState.Calibrating) positioningEngineState).getContext().getStartTimeMillis();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final User getUser() {
        return ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleSpaceChange(@org.jetbrains.annotations.NotNull me.oriient.ipssdk.base.auth.User r6, @org.jetbrains.annotations.NotNull me.oriient.internal.services.dataModel.engine.EngineConfig r7, @org.jetbrains.annotations.NotNull me.oriient.ipssdk.api.listeners.IPSCompletionListener r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof me.oriient.ipssdk.realtime.ofs.C1741w0
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.ipssdk.realtime.ofs.w0 r0 = (me.oriient.ipssdk.realtime.ofs.C1741w0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.ipssdk.realtime.ofs.w0 r0 = new me.oriient.ipssdk.realtime.ofs.w0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            me.oriient.ipssdk.api.listeners.IPSCompletionListener r8 = r0.c
            me.oriient.internal.services.dataModel.engine.EngineConfig r7 = r0.b
            me.oriient.ipssdk.base.auth.User r6 = r0.f26165a
            kotlin.ResultKt.b(r9)
            goto L72
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r9)
            me.oriient.ipssdk.realtime.ips.Positioning r9 = me.oriient.ipssdk.realtime.ips.Positioning.INSTANCE
            kotlin.Lazy r2 = me.oriient.ipssdk.realtime.ips.CoreLogic.n
            java.lang.Object r4 = r2.getD()
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager r4 = (me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager) r4
            me.oriient.ipssdk.base.remoteconfig.RealTimeConfig r4 = r4.getRealTimeConfig()
            me.oriient.internal.services.dataModel.positioning.PositioningConfig r4 = r4.getPositioning()
            r9.onNewConfig(r4)
            kotlin.Lazy r9 = me.oriient.ipssdk.realtime.ips.CoreLogic.g
            java.lang.Object r9 = r9.getD()
            me.oriient.navigation.common.NavigationManager r9 = (me.oriient.navigation.common.NavigationManager) r9
            java.lang.Object r2 = r2.getD()
            me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager r2 = (me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager) r2
            me.oriient.ipssdk.base.remoteconfig.RealTimeConfig r2 = r2.getRealTimeConfig()
            me.oriient.internal.services.dataModel.navigation.NavigationConfig r2 = r2.getNavigationConfig()
            r0.f26165a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r9.onNewConfig(r2, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            me.oriient.internal.infra.di.DependencyInjection r9 = me.oriient.ipssdk.base.di.DependencyInjectionKt.getDi()
            java.lang.Class<me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager> r0 = me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager.class
            kotlin.jvm.internal.ReflectionFactory r1 = kotlin.jvm.internal.Reflection.f24268a
            kotlin.reflect.KClass r0 = r1.b(r0)
            me.oriient.internal.infra.utils.core.DiProvidable r9 = r9.get(r0)
            me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager r9 = (me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager) r9
            me.oriient.internal.services.auth.Space r0 = r6.getSpace()
            java.lang.String r0 = r0.getId()
            r9.setCurrentSpaceId(r0)
            kotlinx.coroutines.Job r9 = me.oriient.ipssdk.realtime.ips.CoreLogic.N
            r0 = 0
            if (r9 == 0) goto L97
            r9.cancel(r0)
        L97:
            kotlinx.coroutines.CoroutineScope r9 = me.oriient.ipssdk.realtime.ips.CoreLogic.K
            me.oriient.ipssdk.realtime.ofs.x0 r1 = new me.oriient.ipssdk.realtime.ofs.x0
            r1.<init>(r6, r7, r8, r0)
            r6 = 3
            kotlinx.coroutines.Job r6 = kotlinx.coroutines.BuildersKt.c(r9, r0, r0, r1, r6)
            me.oriient.ipssdk.realtime.ips.CoreLogic.N = r6
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.CoreLogic.handleSpaceChange(me.oriient.ipssdk.base.auth.User, me.oriient.internal.services.dataModel.engine.EngineConfig, me.oriient.ipssdk.api.listeners.IPSCompletionListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean isCalibrationGestureNeeded() {
        StateFlow<CalibrationNeeded> calibrationNeededUpdates;
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        return ((positioningEngine == null || (calibrationNeededUpdates = positioningEngine.getCalibrationNeededUpdates()) == null) ? null : (CalibrationNeeded) calibrationNeededUpdates.getValue()) != null;
    }

    public final boolean isEngineIdle() {
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) f.getD()).getEngine().getValue();
        if (positioningEngine != null) {
            return positioningEngine.getState().getValue() instanceof PositioningEngineState.Idle;
        }
        return true;
    }

    public final boolean isEngineNull() {
        return ((SupportPositioningEngineManager) f.getD()).getEngine().getValue() == null;
    }

    public final boolean isLimitedConnectionSupported() {
        return isLimitedConnectionSupported;
    }

    public final void login$me_oriient_sdk_realtime(@NotNull final Core.LoginCandidate loginCandidate, @NotNull final IPSLoginListener listener) {
        Intrinsics.h(loginCandidate, "loginCandidate");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25820a;
        ((Logger) lazy.getD()).d("CoreLogic", "login() called with: loginCandidate = [" + loginCandidate + "], listener = [" + listener + ']');
        Logger logger = (Logger) lazy.getD();
        StringBuilder sb = new StringBuilder("login: loginCandidate user is ");
        sb.append(loginCandidate);
        logger.d("CoreLogic", sb.toString());
        Logger logger2 = (Logger) lazy.getD();
        StringBuilder sbA = AbstractC1685m0.a("CoreLogic", "TAG", "login: existing user is ");
        sbA.append(C);
        logger2.d("CoreLogic", sbA.toString());
        if (F) {
            ((Logger) lazy.getD()).e("CoreLogic", "login: already in progress");
            ValidationService.safeFailListener(listener, new Error("login already in progress", 3, 1));
            return;
        }
        F = true;
        User user = C;
        if (user == null) {
            a(loginCandidate, listener);
            return;
        }
        if (!loginCandidate.isSameAs(user)) {
            ((Logger) lazy.getD()).d("CoreLogic", "login: new user detected");
            logout(new IPSLogoutListener() { // from class: me.oriient.ipssdk.realtime.ips.CoreLogic$login$1
                @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                public void onError(@NotNull IPSError error) {
                    Intrinsics.h(error, "error");
                    CoreLogic coreLogic = CoreLogic.INSTANCE;
                    Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic);
                    String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                    Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                    loggerAccess$getLogger.d(strAccess$getTAG$p, "login: for new user after failed logout for the old one");
                    coreLogic.a(loginCandidate, listener);
                }

                @Override // me.oriient.ipssdk.api.listeners.IPSLogoutListener
                public void onLogout() {
                    CoreLogic coreLogic = CoreLogic.INSTANCE;
                    Logger loggerAccess$getLogger = CoreLogic.access$getLogger(coreLogic);
                    String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
                    Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
                    loggerAccess$getLogger.d(strAccess$getTAG$p, "login: for new user after logout for the old one");
                    coreLogic.a(loginCandidate, listener);
                }
            });
            return;
        }
        F = false;
        try {
            List<Space> availableSpacesList = user.getAvailableSpacesList();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(availableSpacesList, 10));
            Iterator<T> it = availableSpacesList.iterator();
            while (it.hasNext()) {
                arrayList.add(OriientSpaceKt.toOriientSpace((Space) it.next()));
            }
            listener.onLogin(arrayList);
        } catch (Exception e2) {
            ListenerException listenerException = new ListenerException(listener.getClass().getSimpleName(), e2);
            AbstractC1691n0.a(listenerException, "errorMessage", (ELog) i.getD(), listener.getClass().getSimpleName(), "Exception in application");
            ((Logger) f25820a.getD()).e(listener.getClass().getSimpleName(), "Exception in application: " + listenerException.getMessage());
        }
    }

    public final void logout(@NotNull IPSLogoutListener listener) {
        Intrinsics.h(listener, "listener");
        ((Logger) f25820a.getD()).d("CoreLogic", "logout() called with: listener = [" + listener + ']');
        Positioning.INSTANCE.onUserLogout();
        Navigation.INSTANCE.onUserLogout();
        Proximity.INSTANCE.onUserLogout();
        Content.INSTANCE.onUserUpdated(null);
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        ((BuildingGeofenceManager) di.get(reflectionFactory.b(BuildingGeofenceManager.class))).clean();
        IPSGeofencing.clearLiveGeofenceListeners();
        RuntimeDataManager runtimeDataManager = (RuntimeDataManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(RuntimeDataManager.class));
        runtimeDataManager.setLoginSession(null);
        runtimeDataManager.setCurrentUserId(null);
        ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CommonRuntimeDataProvider.class))).setUser(null);
        ((SupportSensorsManager) k.getD()).turnSensorsOff(false);
        Job job = N;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        N = null;
        setNewActiveBuilding(null);
        Job job2 = A;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        A = null;
        a(new Error("Logged out", 1, 0), OperationListener.StartCalibration);
        a(new Error("Logged out", 1, 0), OperationListener.StartPositioning);
        a(OperationListener.StopCalibration);
        a(OperationListener.StopPositioning);
        F = false;
        C = null;
        BuildersKt.c(K, null, null, new C1751y0(listener, null), 3);
    }

    public final void registerSystemEvent(@NotNull UiEvent uiEvent) {
        Intrinsics.h(uiEvent, "uiEvent");
        if (uiEvent instanceof UiEvent.MapVisibilityChanged) {
            ELog eLog = (ELog) i.getD();
            Pair pair = new Pair("isVisible", Boolean.valueOf(uiEvent.getIsVisible()));
            Building building = activeBuilding;
            eLog.i("CoreLogic", "MapVisibilityChanged", MapsKt.j(pair, new Pair("activeBuildingId", building != null ? building.getId() : null)));
        }
        ((SystemStateManager) p.getD()).onUiEvent(uiEvent);
    }

    public final void removeNetworkStateListener(@NotNull O2 listener) {
        Intrinsics.h(listener, "listener");
        I.remove(listener);
    }

    @Nullable
    public final IPSCancelable searchBuildingsByLocation(float latitude, float longitude, float searchRadiusMeters, float fetchRadiusMeters, @Nullable IPSBuildingsSearchListener listener) {
        Lazy lazy = f25820a;
        ((Logger) lazy.getD()).d("CoreLogic", "searchBuildingsByLocation() called with: latitude = [" + latitude + "], longitude = [" + longitude + "], radiusMeters = [" + searchRadiusMeters + ']');
        User user = getUser();
        if (user != null) {
            return new CancellableProcess(BuildersKt.c(K, null, null, new R0(user, latitude, longitude, searchRadiusMeters, fetchRadiusMeters, listener, null), 3));
        }
        ((Logger) lazy.getD()).e("CoreLogic", "searchBuildingsByLocation: not logged in!");
        ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
        return null;
    }

    public final boolean sensorsValid() {
        return ((SupportSensorsManager) k.getD()).isValid();
    }

    public final void setActiveFloor(@Nullable Floor floor) {
        activeFloor = floor;
    }

    public final void setNewActiveBuilding(@Nullable Building building) {
        Floor floor;
        ((Logger) f25820a.getD()).d("CoreLogic", "setNewActiveBuilding() called with: building = [" + building + ']');
        activeBuilding = building;
        ((SdkNavigationPositioningProvider) L.getD()).onNewBuilding(building);
        if (building == null || (floor = activeFloor) == null) {
            return;
        }
        Proximity.INSTANCE.onNewBuilding(building, floor.getOrder());
    }

    public final void startCalibration(boolean initiatedByUser, @Nullable String buildingId, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(listener, "listener");
        N = BuildersKt.c(K, null, null, new U0(listener, buildingId, initiatedByUser, null), 3);
    }

    public final void startPositioning(boolean initiatedByUser, @NotNull List<Floor> floors, @Nullable IPSStartingPosition startingPosition, @Nullable SystemLocation startLocation, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(floors, "floors");
        Intrinsics.h(listener, "listener");
        N = BuildersKt.c(K, null, null, new W0(startingPosition, listener, floors, initiatedByUser, startLocation, null), 3);
    }

    public final void stopCalibration(@NotNull EngineStopReason reason, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(reason, "reason");
        Intrinsics.h(listener, "listener");
        BuildersKt.c(K, null, null, new g(listener, reason, null), 3);
    }

    public final void stopPositioning(@NotNull EngineStopReason reason, @NotNull IPSCompletionListener listener) {
        Intrinsics.h(reason, "reason");
        Intrinsics.h(listener, "listener");
        BuildersKt.c(K, null, null, new h(listener, reason, null), 3);
    }

    private static void a(IPSError iPSError, OperationListener operationListener) {
        EnumMap enumMap = M;
        if (enumMap.containsKey(operationListener)) {
            Object obj = enumMap.get(operationListener);
            Intrinsics.e(obj);
            ((IPSCompletionListener) obj).onError(iPSError);
            enumMap.remove(operationListener);
        }
    }

    private static void a(OperationListener operationListener) {
        EnumMap enumMap = M;
        if (enumMap.containsKey(operationListener)) {
            Object obj = enumMap.get(operationListener);
            Intrinsics.e(obj);
            ((IPSCompletionListener) obj).onCompleted();
            enumMap.remove(operationListener);
        }
    }

    private static ArrayList a(List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SignMark signMark = (SignMark) it.next();
            String id = signMark.getId();
            String text = signMark.getText();
            Coordinate coordinate = new Coordinate(signMark.getCoordinates().getX(), signMark.getCoordinates().getY());
            List<SignMarkVisibleRange> visibleRanges = signMark.getMetadata().getVisibleRanges();
            if (visibleRanges != null) {
                arrayList = new ArrayList(CollectionsKt.s(visibleRanges, 10));
                for (SignMarkVisibleRange signMarkVisibleRange : visibleRanges) {
                    arrayList.add(new IPSSignMarkVisibleRange(signMarkVisibleRange.getBelowMeters(), signMarkVisibleRange.getAboveMeters()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new IPSSignMark(id, text, coordinate, new IPSSignMarkMetadata(arrayList), signMark.getRawMetadata()));
        }
        return arrayList2;
    }

    @Nullable
    public final IPSCancelable getBuildingLayout(@NotNull String buildingId, @NotNull IPSListener<IPSBuildingLayout> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        if (getUser() == null) {
            ((Logger) f25820a.getD()).e("CoreLogic", "getBuildingLayout: not logged in!");
            ValidationService.safeFailListener(listener, new Error("not logged in", 4, 0));
            return null;
        }
        return new CancellableProcess(BuildersKt.c(K, null, null, new C1703p0(buildingId, listener, null), 3));
    }
}
