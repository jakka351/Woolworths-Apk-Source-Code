package me.oriient.ipssdk.realtime.ips;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.ReadOnlySystemLocationManager;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.android.SystemPermissionChecker;
import me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.listeners.IPSCurrentRestrictedAreaListener;
import me.oriient.ipssdk.api.listeners.IPSPositioningListener;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.api.models.IPSPosition;
import me.oriient.ipssdk.api.models.IPSRestrictedArea;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.api.utils.IPSUnavailableFeature;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.utils.SdkExecutors;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.ips.ICalibrationListener;
import me.oriient.ipssdk.ips.IPSCore;
import me.oriient.ipssdk.ips.IPSPositioning;
import me.oriient.ipssdk.realtime.ips.FloorSelectionStrategy;
import me.oriient.ipssdk.realtime.ips.PendingCalibrationState;
import me.oriient.ipssdk.realtime.ips.PendingPositioningState;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController;
import me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter;
import me.oriient.ipssdk.realtime.ips.calibration.AutomaticCalibrator;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;
import me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceChecker;
import me.oriient.ipssdk.realtime.ofs.AbstractC1685m0;
import me.oriient.ipssdk.realtime.ofs.AbstractC1691n0;
import me.oriient.ipssdk.realtime.ofs.C1628c3;
import me.oriient.ipssdk.realtime.ofs.C1640e3;
import me.oriient.ipssdk.realtime.ofs.C1658h3;
import me.oriient.ipssdk.realtime.ofs.C1676k3;
import me.oriient.ipssdk.realtime.ofs.C1682l3;
import me.oriient.ipssdk.realtime.ofs.C1694n3;
import me.oriient.ipssdk.realtime.ofs.C1700o3;
import me.oriient.ipssdk.realtime.ofs.C1706p3;
import me.oriient.ipssdk.realtime.ofs.C1712q3;
import me.oriient.ipssdk.realtime.ofs.C1723s3;
import me.oriient.ipssdk.realtime.ofs.C1729t3;
import me.oriient.ipssdk.realtime.ofs.C1734u3;
import me.oriient.ipssdk.realtime.ofs.C1739v3;
import me.oriient.ipssdk.realtime.ofs.C1744w3;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManager;
import me.oriient.ipssdk.realtime.services.tag.model.EventTag;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagPosition;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagType;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagTypeKt;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.ipssdk.realtime.utils.MathUtils;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.CoordinateKt;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.common.models.IndoorCoordinate;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u000e¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010\u001fJ-\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J%\u0010,\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001f\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b,\u0010.J%\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b/\u00100J\u001f\u0010/\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u00101J\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u000105¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020?¢\u0006\u0004\bB\u0010AJ1\u0010G\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u000b2\u0006\u0010E\u001a\u00020\u000b2\b\u0010F\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u000b2\u0006\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ#\u0010Q\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010[\u001a\u00020\b2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\b2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010d\u001a\u00020\b2\u0006\u0010a\u001a\u00020\u000bH\u0000¢\u0006\u0004\bb\u0010cJ\r\u0010e\u001a\u00020\b¢\u0006\u0004\be\u0010\u0005J\r\u0010f\u001a\u00020\b¢\u0006\u0004\bf\u0010\u0005J\r\u0010g\u001a\u00020\b¢\u0006\u0004\bg\u0010\u0005J\u0017\u0010l\u001a\u00020\b2\u0006\u0010i\u001a\u00020hH\u0000¢\u0006\u0004\bj\u0010kJ\u000f\u0010n\u001a\u00020\bH\u0001¢\u0006\u0004\bm\u0010\u0005J\u000f\u0010p\u001a\u00020\bH\u0001¢\u0006\u0004\bo\u0010\u0005J\u000f\u0010q\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bq\u0010rJ\u000f\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bt\u0010uJ\u0015\u0010x\u001a\u00020\b2\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bx\u0010yJ\u0015\u0010{\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020z¢\u0006\u0004\b{\u0010|J\u0015\u0010}\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020z¢\u0006\u0004\b}\u0010|R7\u0010\u0086\u0001\u001a\u00020\r2\u0006\u0010~\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u001e\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0085\u0001\u0010\u0005\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020\r2\u0007\u0010\u0087\u0001\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0080\u0001\u0012\u0005\b\u008a\u0001\u0010\u0005\u001a\u0006\b\u0089\u0001\u0010\u0082\u0001R1\u0010\u008f\u0001\u001a\u00020\r2\u0007\u0010\u0087\u0001\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u0080\u0001\u0012\u0005\b\u008e\u0001\u0010\u0005\u001a\u0006\b\u008d\u0001\u0010\u0082\u0001R1\u0010\u0096\u0001\u001a\u00020*2\u0006\u0010~\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009b\u0001\u001a\u00020S2\u0007\u0010\u0087\u0001\u001a\u00020S8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R0\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R0\u0010§\u0001\u001a\u0005\u0018\u00010¢\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010¢\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0014\u0010ª\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010\u00ad\u0001\u001a\u00020\r8F¢\u0006\u000f\u0012\u0005\b¬\u0001\u0010\u0005\u001a\u0006\b«\u0001\u0010\u0082\u0001R\u0014\u0010®\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b®\u0001\u0010©\u0001R\u0014\u0010¯\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b¯\u0001\u0010©\u0001R\u0016\u0010²\u0001\u001a\u0004\u0018\u00010\u000b8F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u001d\u0010¶\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u000f\u0012\u0005\bµ\u0001\u0010\u0005\u001a\u0006\b³\u0001\u0010´\u0001R\u0016\u0010¹\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010»\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\b\u001a\u0006\bº\u0001\u0010¸\u0001R\u001b\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110¼\u00018F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001¨\u0006Æ\u0001"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Positioning;", "Lme/oriient/ipssdk/realtime/ips/ISessionStateListener;", "Lme/oriient/ipssdk/realtime/ips/ISessionDataListener;", "Landroidx/lifecycle/LifecycleObserver;", "<init>", "()V", "Lme/oriient/ipssdk/api/models/IPSBuilding;", "building", "", "defineCurrentBuilding", "(Lme/oriient/ipssdk/api/models/IPSBuilding;)V", "", "buildingId", "", "floorOrder", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "startingPosition", "", "allowPositioningOutsideOfBuilding", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startPositioning", "(Ljava/lang/String;Ljava/lang/Integer;Lme/oriient/ipssdk/api/models/IPSStartingPosition;Ljava/lang/Boolean;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "userAllowPositioningOutsideOfBuilding", "(Lme/oriient/ipssdk/api/models/IPSBuilding;Ljava/lang/Integer;Lme/oriient/ipssdk/api/models/IPSStartingPosition;Ljava/lang/Boolean;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "stopPositioning", "(Lme/oriient/positioningengine/common/EngineStopReason;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/ipssdk/ips/ICalibrationListener;", "addCalibrationListener", "(Lme/oriient/ipssdk/ips/ICalibrationListener;)V", "removeCalibrationListener", "initiatedByUser", "startCalibration", "(ZLjava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "stopCalibration", "(Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "buildingOrigin", "", "buildingRotation", "convertCoordinateToGlobalCoordinate", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;D)Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSBuilding;)Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "convertGlobalCoordinateToBuildingCoordinate", "(Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;D)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "(Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;Lme/oriient/ipssdk/api/models/IPSBuilding;)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "enabled", "setPreheatingEnabled", "(Z)V", "Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;", "addPositioningListener", "(Lme/oriient/ipssdk/api/listeners/IPSPositioningListener;)V", "removePositioningListener", "Lme/oriient/ipssdk/api/models/IPSPosition;", "position", "setLastKnownPosition", "(Lme/oriient/ipssdk/api/models/IPSPosition;)V", "isPositionLocked", "(Lme/oriient/ipssdk/api/models/IPSPosition;)Z", "", "getCurrentTime", "()J", "getTimeFromStartOfSession", "tag", "metadata", "eventType", "completionListener", "sendCustomEventTag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "sendEventTag", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/positioningengine/common/PositioningEngineState;", "newState", "onSessionStateChanged", "(Lme/oriient/positioningengine/common/PositioningEngineState;)V", "Lme/oriient/ipssdk/realtime/ips/CalibrationReason;", "info", "onCalibrationNeeded", "(Lme/oriient/ipssdk/realtime/ips/CalibrationReason;Ljava/lang/String;)V", "", "percent", "onCalibrationUpdate", "(F)V", "Lme/oriient/ipssdk/realtime/utils/models/Position;", "newPosition", "Lme/oriient/positioningengine/common/PositioningUpdate;", "rawUpdate", "onPositioningUpdate", "(Lme/oriient/ipssdk/realtime/utils/models/Position;Lme/oriient/positioningengine/common/PositioningUpdate;)V", "Lme/oriient/ipssdk/api/models/IPSError;", "error", "onSessionError", "(Lme/oriient/ipssdk/api/models/IPSError;)V", "floorId", "onActiveFloorChanged$me_oriient_sdk_realtime", "(Ljava/lang/String;)V", "onActiveFloorChanged", "onUserLogout", "onChangeActiveFloorStarted", "onChangeActiveFloorEnded", "Lme/oriient/internal/services/dataManager/building/Floor;", "floor", "notifyFloorChanged$me_oriient_sdk_realtime", "(Lme/oriient/internal/services/dataManager/building/Floor;)V", "notifyFloorChanged", "onEnterForeground$me_oriient_sdk_realtime", "onEnterForeground", "onEnterBackground$me_oriient_sdk_realtime", "onEnterBackground", "getCurrentIPSBuilding", "()Lme/oriient/ipssdk/api/models/IPSBuilding;", "Lme/oriient/ipssdk/api/models/IPSFloor;", "getCurrentIPSFloor", "()Lme/oriient/ipssdk/api/models/IPSFloor;", "Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;", "positioningConfig", "onNewConfig", "(Lme/oriient/internal/services/dataModel/positioning/PositioningConfig;)V", "Lme/oriient/ipssdk/api/listeners/IPSCurrentRestrictedAreaListener;", "addCurrentRestrictedAreaListener", "(Lme/oriient/ipssdk/api/listeners/IPSCurrentRestrictedAreaListener;)V", "removeCurrentRestrictedAreaListener", "value", "i", "I", "getPositioningState", "()I", "setPositioningState", "(I)V", "getPositioningState$annotations", "positioningState", "<set-?>", "j", "getCalibrationState", "getCalibrationState$annotations", "calibrationState", "k", "getPositioningEngineState", "getPositioningEngineState$annotations", "positioningEngineState", "l", "D", "getLockThreshold", "()D", "setLockThreshold", "(D)V", "lockThreshold", "m", "F", "getCalibrationProgress", "()F", "calibrationProgress", "Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "n", "Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "getAutoStartData", "()Lme/oriient/internal/services/dataModel/positioning/PositioningMetadataProvider$AutoStartData;", "autoStartData", "Lme/oriient/ipssdk/api/models/IPSRestrictedArea;", "o", "Lme/oriient/ipssdk/api/models/IPSRestrictedArea;", "getCurrentRestrictedArea", "()Lme/oriient/ipssdk/api/models/IPSRestrictedArea;", "currentRestrictedArea", "getShouldBeCalibrating", "()Z", "shouldBeCalibrating", "getPublicPositioningEngineState", "getPublicPositioningEngineState$annotations", "publicPositioningEngineState", "isCalibrationGestureNeeded", "isLimitedConnectionSupported", "getCurrentSessionId", "()Ljava/lang/String;", "currentSessionId", "getCalibrationNeededReason", "()Ljava/lang/Integer;", "getCalibrationNeededReason$annotations", "calibrationNeededReason", "getLastKnownPosition", "()Lme/oriient/ipssdk/realtime/utils/models/Position;", "lastKnownPosition", "getLastKnownLockedPosition", "lastKnownLockedPosition", "Lkotlinx/coroutines/flow/StateFlow;", "isPreheatingEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "me/oriient/ipssdk/realtime/ofs/i3", "me/oriient/ipssdk/realtime/ips/i", "me/oriient/ipssdk/realtime/ips/j", "me/oriient/ipssdk/realtime/ips/k", "me/oriient/ipssdk/realtime/ips/l", "a", "me/oriient/ipssdk/realtime/ips/m", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Positioning implements ISessionStateListener, ISessionDataListener, LifecycleObserver {
    private static final ArrayList A;
    private static final ArrayList B;
    private static PendingPositioningState C;
    private static PendingCalibrationState D;
    private static final ArrayList E;
    private static final ArrayList F;
    private static final m G;
    private static final l H;
    private static boolean I;

    @NotNull
    public static final Positioning INSTANCE;
    private static final Lazy J;
    private static final PositioningKotlinHelper K;
    private static final j L;
    private static final Lazy M;
    private static final Lazy N;
    private static final Lazy O;
    private static final k P;
    private static final i Q;
    private static final Lazy R;
    private static final Lazy S;
    private static final Lazy T;
    private static final CurrentBuildingAndFloor U;
    private static final Lazy V;
    private static final Lazy W;
    private static final Lazy X;
    private static final Lazy Y;
    private static final CoroutineScope Z;

    /* renamed from: a, reason: collision with root package name */
    private static final String f25840a;
    private static boolean a0;
    private static final Lazy b;
    private static boolean b0;
    private static final Lazy c;
    private static List c0;
    private static final Lazy d;
    private static final Lazy e;
    private static final Lazy f;
    private static final Lazy g;
    private static final Lazy h;

    /* renamed from: i, reason: from kotlin metadata */
    private static int positioningState;

    /* renamed from: j, reason: from kotlin metadata */
    private static int calibrationState;

    /* renamed from: k, reason: from kotlin metadata */
    private static int positioningEngineState;

    /* renamed from: l, reason: from kotlin metadata */
    private static double lockThreshold;

    /* renamed from: m, reason: from kotlin metadata */
    private static float calibrationProgress;

    /* renamed from: n, reason: from kotlin metadata */
    private static PositioningMetadataProvider.AutoStartData autoStartData;

    /* renamed from: o, reason: from kotlin metadata */
    private static IPSRestrictedArea currentRestrictedArea;
    private static Position p;
    private static PositioningUpdate q;
    private static Position r;
    private static final MutableStateFlow s;
    private static final ArrayList t;
    private static final ArrayList u;
    private static final ArrayList v;
    private static boolean w;
    private static boolean x;
    private static ScheduledFuture y;
    private static ScheduledFuture z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        private final String value;
        public static final a REASON = new a("REASON", 0, "Reason");
        public static final a LAT = new a("LAT", 1, "Lat");
        public static final a LONG = new a("LONG", 2, "Long");
        public static final a DISTANCE = new a("DISTANCE", 3, "Distance");
        public static final a ACCURACY = new a("ACCURACY", 4, "Accuracy");
        public static final a MISSING_SENSORS = new a("MISSING_SENSORS", 5, "MissingSensors");
        public static final a BUILDING_ID = new a("BUILDING_ID", 6, "buildingId");

        private static final /* synthetic */ a[] $values() {
            return new a[]{REASON, LAT, LONG, DISTANCE, ACCURACY, MISSING_SENSORS, BUILDING_ID};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i, String str2) {
            this.value = str2;
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

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    static {
        Positioning positioning = new Positioning();
        INSTANCE = positioning;
        f25840a = "Positioning";
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        b = di.inject(reflectionFactory.b(Logger.class));
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ReadOnlySystemLocationManager.class));
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(GlobalCoordinatesConverter.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SystemPermissionChecker.class));
        h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        lockThreshold = 1.0d;
        s = StateFlowKt.a(Boolean.TRUE);
        t = new ArrayList();
        ArrayList arrayList = new ArrayList();
        u = arrayList;
        v = new ArrayList();
        A = new ArrayList();
        B = new ArrayList();
        E = new ArrayList();
        F = new ArrayList();
        G = new m();
        H = new l();
        Lazy lazyB = LazyKt.b(C1712q3.f26134a);
        J = lazyB;
        K = new PositioningKotlinHelper();
        L = new j();
        M = LazyKt.b(C1723s3.f26145a);
        N = LazyKt.b(C1694n3.f26116a);
        O = LazyKt.b(C1706p3.f26128a);
        P = new k();
        Q = new i();
        R = LazyKt.b(C1700o3.f26122a);
        S = LazyKt.b(C1682l3.f26106a);
        T = LazyKt.b(C1676k3.f26100a);
        U = new CurrentBuildingAndFloor(arrayList, (CoroutineScope) lazyB.getD());
        V = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SdkNavigationPositioningProvider.class));
        W = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ManualPositioningGeofenceChecker.class));
        X = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        Y = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        Z = CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class))).getDefault());
        c0 = EmptyList.d;
        SdkExecutors.postToMainThread(new au.com.woolworths.base.wallet.digipay.framesview.b(4));
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        coreLogic.addSessionStateListener$me_oriient_sdk_realtime(positioning);
        coreLogic.addSessionDataListener$me_oriient_sdk_realtime(positioning);
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1628c3(null), 3);
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1640e3(null), 3);
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1658h3(null), 3);
    }

    private Positioning() {
    }

    private static void a(IPSError iPSError) {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "notifyPositioningEngineError() called with: error = [" + iPSError + ']');
        if (positioningEngineState == 2 && b()) {
            return;
        }
        Iterator it = CollectionsKt.G0(u).iterator();
        while (it.hasNext()) {
            ValidationService.safeFailListener((IPSPositioningListener) it.next(), iPSError);
        }
    }

    public static final String access$describeCalibrationState(Positioning positioning, int i) {
        positioning.getClass();
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Waiting for calibration stop" : "Calibrating" : "Waiting for calibration start" : "Idle";
    }

    public static final String access$describePositioningState(Positioning positioning, int i) {
        positioning.getClass();
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Changing active floor" : "Waiting for positioning stop" : "Positioning" : "Waiting for positioning start" : "Idle";
    }

    public static final GeofencePositioningAutoStarter access$getAutomaticPositioningStarter(Positioning positioning) {
        positioning.getClass();
        return (GeofencePositioningAutoStarter) N.getD();
    }

    public static final BuildingRepository access$getBuildingRepository(Positioning positioning) {
        positioning.getClass();
        return (BuildingRepository) h.getD();
    }

    public static final ChargingBasedPositioningController access$getChargingBasedSessionController(Positioning positioning) {
        positioning.getClass();
        return (ChargingBasedPositioningController) O.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(Positioning positioning) {
        positioning.getClass();
        return (RemoteConfigManager) d.getD();
    }

    public static final CoroutineScope access$getCoroutineScope(Positioning positioning) {
        positioning.getClass();
        return (CoroutineScope) J.getD();
    }

    public static final ELog access$getELog(Positioning positioning) {
        positioning.getClass();
        return (ELog) c.getD();
    }

    public static final SupportPositioningEngineManager access$getEngineManager(Positioning positioning) {
        positioning.getClass();
        return (SupportPositioningEngineManager) Y.getD();
    }

    public static final FloorSelectionStrategy access$getFloorSelectionStrategy(Positioning positioning, Integer num, IPSStartingPosition iPSStartingPosition, Building building) {
        Object next;
        positioning.getClass();
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "getFloorSelectionStrategy() called with: floorOrder = " + num + ", startingPosition = " + iPSStartingPosition + ", building = " + building);
        if (iPSStartingPosition != null) {
            if (num != null) {
                if (num.intValue() != iPSStartingPosition.getFloorOrder()) {
                    return new FloorSelectionStrategy.ManualInvalidFloorOrder();
                }
            }
            Iterator<T> it = building.getFloors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Floor) next).getOrder() == iPSStartingPosition.getFloorOrder()) {
                    break;
                }
            }
            Floor floor = (Floor) next;
            if (floor == null) {
                new FloorSelectionStrategy.ManualInvalidFloorOrder();
            } else {
                new FloorSelectionStrategy.Manual(floor);
            }
        }
        if (building.getFloors().size() == 1) {
            return new FloorSelectionStrategy.Manual(building.getPrimaryFloor());
        }
        if (num != null) {
            Floor floor2 = building.getFloor(num.intValue());
            return floor2 == null ? new FloorSelectionStrategy.ManualInvalidFloorOrder() : new FloorSelectionStrategy.Manual(floor2);
        }
        boolean zIsFloorDetectionSupported = building.isFloorDetectionSupported();
        if (zIsFloorDetectionSupported) {
            return new FloorSelectionStrategy.AutoFloorDetection(building.getFloors());
        }
        if (zIsFloorDetectionSupported) {
            throw new NoWhenBranchMatchedException();
        }
        return new FloorSelectionStrategy.FloorDetectionNotSupported();
    }

    public static final ReadOnlySystemLocationManager access$getLocationManager(Positioning positioning) {
        positioning.getClass();
        return (ReadOnlySystemLocationManager) e.getD();
    }

    public static final Logger access$getLogger(Positioning positioning) {
        positioning.getClass();
        return (Logger) b.getD();
    }

    public static final AutomaticCalibrator access$getPeriodicAutomaticCalibrator(Positioning positioning) {
        positioning.getClass();
        return (AutomaticCalibrator) M.getD();
    }

    public static final ManualPositioningGeofenceChecker access$getPositioningGeofenceChecker(Positioning positioning) {
        positioning.getClass();
        return (ManualPositioningGeofenceChecker) W.getD();
    }

    public static final void access$logStartPositionOutside(Positioning positioning, Building building, SystemLocation systemLocation) {
        positioning.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(a.BUILDING_ID.getValue(), building.getId());
        if (systemLocation != null) {
            linkedHashMap.put(a.LAT.getValue(), Double.valueOf(systemLocation.getLatitude()));
            linkedHashMap.put(a.LONG.getValue(), Double.valueOf(systemLocation.getLongitude()));
            linkedHashMap.put(a.ACCURACY.getValue(), Double.valueOf(systemLocation.getHorizontalAccuracy()));
            linkedHashMap.put(a.DISTANCE.getValue(), Double.valueOf(systemLocation.distanceTo(building.getGeofenceOrigin().getLatitude(), building.getGeofenceOrigin().getLongitude())));
        }
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.w(TAG, "Starting positioning outOfGeofence.", linkedHashMap);
    }

    public static final /* synthetic */ void access$notifyCalibrationStateChanged(Positioning positioning) {
        positioning.getClass();
        c();
    }

    public static final /* synthetic */ void access$notifyPositioningEngineError(Positioning positioning, IPSError iPSError) {
        positioning.getClass();
        a(iPSError);
    }

    public static final void access$onCalibrationStarted(Positioning positioning, boolean z2) {
        positioning.getClass();
        if (z2) {
            b0 = true;
        }
        int i = calibrationState;
        if (i != 2 && i != 3) {
            calibrationState = 2;
            c();
            if (positioningEngineState != 2) {
                positioningEngineState = 1;
                d();
            }
        }
        for (IPSCompletionListener iPSCompletionListener : CollectionsKt.G0(A)) {
            ValidationService.safeCompleteListener(iPSCompletionListener);
            A.remove(iPSCompletionListener);
        }
        PendingCalibrationState pendingCalibrationState = D;
        if (pendingCalibrationState == null || !(pendingCalibrationState instanceof PendingCalibrationState.Idle)) {
            D = null;
            for (IPSCompletionListener iPSCompletionListener2 : CollectionsKt.G0(B)) {
                ValidationService.safeCompleteListener(iPSCompletionListener2);
                B.remove(iPSCompletionListener2);
            }
            return;
        }
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.w(TAG, "onCompleted: calibration started but should be stopped. stopping.");
        ((Logger) lazy.getD()).d(TAG, "stopCalibration() called");
        positioning.stopCalibration(null);
    }

    public static final void access$onPositioningStarted(Positioning positioning, Building building, boolean z2, IPSStartingPosition iPSStartingPosition) {
        Object next;
        positioning.getClass();
        if (z2) {
            autoStartData = null;
            a0 = true;
            ((GeofencePositioningAutoStarter) N.getD()).onPositioningStartedByClient();
            ((ChargingBasedPositioningController) O.getD()).pauseTillNextCharging();
        }
        int i = positioningState;
        if (i != 2 && i != 3) {
            ((SdkNavigationPositioningProvider) V.getD()).getCurrentSessionId().setValue(positioning.getCurrentSessionId());
            if (iPSStartingPosition != null) {
                String id = building.getId();
                Iterator<T> it = building.getFloors().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((Floor) next).getOrder() == iPSStartingPosition.getFloorOrder()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Floor floor = (Floor) next;
                Position position = new Position(iPSStartingPosition, id, floor != null ? floor.getId() : null);
                INSTANCE.getClass();
                ((SdkNavigationPositioningProvider) V.getD()).onNewPosition(position);
            }
            positioning.setPositioningState(2);
            positioningEngineState = 2;
            d();
        }
        Lazy lazy = d;
        if (((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getPositioning().getAutoStop().getUseBuildingGeofence()) {
            ((AutomaticSessionStopper) R.getD()).start(building);
        }
        if (((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getPositioning().getAutoStop().getUseExternalRegion()) {
            ((AutomaticSessionStopper) S.getD()).start(building);
        }
        if (((RemoteConfigManager) lazy.getD()).getRealTimeConfig().getPositioning().getAutoStop().getUseExitRegions()) {
            ((AutomaticSessionStopper) T.getD()).start(building);
        }
        for (IPSCompletionListener iPSCompletionListener : CollectionsKt.G0(E)) {
            ValidationService.safeCompleteListener(iPSCompletionListener);
            E.remove(iPSCompletionListener);
        }
        PendingPositioningState pendingPositioningState = C;
        PendingPositioningState.Idle idle = pendingPositioningState instanceof PendingPositioningState.Idle ? (PendingPositioningState.Idle) pendingPositioningState : null;
        if (idle != null) {
            INSTANCE.getClass();
            Logger logger = (Logger) b.getD();
            String TAG = f25840a;
            Intrinsics.g(TAG, "TAG");
            logger.w(TAG, "startPositioning onCompleted: positioning started but should be stopped. stopping.");
            b(idle.getReason(), null);
            return;
        }
        C = null;
        for (IPSCompletionListener iPSCompletionListener2 : CollectionsKt.G0(F)) {
            ValidationService.safeCompleteListener(iPSCompletionListener2);
            F.remove(iPSCompletionListener2);
        }
        H.getClass();
        Positioning positioning2 = INSTANCE;
        Logger loggerAccess$getLogger = access$getLogger(positioning2);
        String str = f25840a;
        StringBuilder sbA = AbstractC1685m0.a(str, "access$getTAG$p(...)", "onPositioningStarted() called, ");
        sbA.append(access$describePositioningState(positioning2, positioning2.getPositioningState()));
        sbA.append(", ");
        sbA.append(access$describeCalibrationState(positioning2, positioning2.getCalibrationState()));
        sbA.append(", ");
        sbA.append(IPSPositioning.describePositioningEngineState(positioning2.getPositioningEngineState()));
        loggerAccess$getLogger.d(str, sbA.toString());
        int calibrationState2 = positioning2.getCalibrationState();
        if (calibrationState2 == 1) {
            access$onCalibrationStarted(positioning2, z2);
        } else {
            if (calibrationState2 != 3) {
                return;
            }
            positioning2.b((IPSError) null);
        }
    }

    public static final void access$stopCalibration(Positioning positioning) {
        positioning.getClass();
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "stopCalibration() called");
        positioning.stopCalibration(null);
    }

    public static final /* synthetic */ void access$stopCalibrationImpl(Positioning positioning, EngineStopReason engineStopReason, IPSCompletionListener iPSCompletionListener) {
        positioning.getClass();
        a(engineStopReason, iPSCompletionListener);
    }

    public static final /* synthetic */ void access$stopPositioningImpl(Positioning positioning, EngineStopReason engineStopReason, IPSCompletionListener iPSCompletionListener) {
        positioning.getClass();
        b(engineStopReason, iPSCompletionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(IPSError iPSError) {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onCalibrationStopped() called");
        if (calibrationState == 0) {
            return;
        }
        calibrationState = 0;
        c();
        if (positioningState == 0) {
            positioningEngineState = 0;
            d();
        }
        ((AutomaticSessionStopper) R.getD()).stop();
        for (IPSCompletionListener iPSCompletionListener : CollectionsKt.G0(B)) {
            ValidationService.safeCompleteListener(iPSCompletionListener);
            B.remove(iPSCompletionListener);
        }
        calibrationProgress = BitmapDescriptorFactory.HUE_RED;
        PendingCalibrationState pendingCalibrationState = D;
        if (pendingCalibrationState != null && (pendingCalibrationState instanceof PendingCalibrationState.Calibrating) && iPSError == null) {
            startCalibration$default(this, ((PendingCalibrationState.Calibrating) pendingCalibrationState).getInitiatedByUser(), null, null, 6, null);
        } else {
            D = null;
        }
    }

    private static void d() {
        Logger logger = (Logger) b.getD();
        String str = f25840a;
        StringBuilder sbA = AbstractC1685m0.a(str, "TAG", "positioning engine state changed to ");
        sbA.append(IPSPositioning.describePositioningEngineState(positioningEngineState));
        logger.d(str, sbA.toString());
        for (IPSPositioningListener iPSPositioningListener : CollectionsKt.G0(u)) {
            try {
                iPSPositioningListener.onPositioningEngineStateChanged(INSTANCE.getPublicPositioningEngineState());
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException(iPSPositioningListener.getClass().getSimpleName(), e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iPSPositioningListener.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iPSPositioningListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
    }

    private static void e() {
        if (z != null) {
            return;
        }
        long stopBackgroundMillis = ((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().getStopBackgroundMillis();
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "startBackgroundTimer() called for " + stopBackgroundMillis + " millis");
        z = SdkExecutors.schedule(new r(stopBackgroundMillis, 0), stopBackgroundMillis, TimeUnit.MILLISECONDS);
    }

    private static void f() {
        if (y != null) {
            return;
        }
        long stopNoMovementMillis = ((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().getStopNoMovementMillis();
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "startNoMovementTimer() called for " + stopNoMovementMillis + " millis");
        y = SdkExecutors.schedule(new r(stopNoMovementMillis, 1), stopNoMovementMillis, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void getCalibrationNeededReason$annotations() {
    }

    public static /* synthetic */ void getCalibrationState$annotations() {
    }

    public static /* synthetic */ void getPositioningEngineState$annotations() {
    }

    public static /* synthetic */ void getPositioningState$annotations() {
    }

    public static /* synthetic */ void getPublicPositioningEngineState$annotations() {
    }

    public static /* synthetic */ void startCalibration$default(Positioning positioning, boolean z2, String str, IPSCompletionListener iPSCompletionListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            iPSCompletionListener = null;
        }
        positioning.startCalibration(z2, str, iPSCompletionListener);
    }

    public final void addCalibrationListener(@Nullable ICalibrationListener listener) {
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "addCalibrationListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e(TAG, "addCalibrationListener: trying to add null listener!");
            return;
        }
        ArrayList arrayList = t;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final void addCurrentRestrictedAreaListener(@NotNull IPSCurrentRestrictedAreaListener listener) {
        Intrinsics.h(listener, "listener");
        ArrayList arrayList = v;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
        listener.onCurrentRestrictedAreaChange(currentRestrictedArea);
    }

    public final void addPositioningListener(@Nullable IPSPositioningListener listener) {
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "addPositioningListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e(TAG, "addPositioningListener: trying to add null listener!");
            return;
        }
        ArrayList arrayList = u;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
        if (isCalibrationGestureNeeded()) {
            listener.onCalibrationGestureNeeded(true);
            listener.onCalibrationGestureNeeded(true, getCalibrationNeededReason());
        }
        U.newListenerAdded(listener);
    }

    @NotNull
    public final IPSGlobalCoordinate convertCoordinateToGlobalCoordinate(@NotNull IPSCoordinate coordinate, @NotNull IPSGlobalCoordinate buildingOrigin, double buildingRotation) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        return ExtensionsKt.toSdkWorldCoordinate(((GlobalCoordinatesConverter) f.getD()).convertBuildingCoordinateToGlobal(BuildingExtKt.toIndoorCoordinate(coordinate), BuildingExtKt.toWorldCoordinate(buildingOrigin), buildingRotation));
    }

    @NotNull
    public final IPSCoordinate convertGlobalCoordinateToBuildingCoordinate(@NotNull IPSGlobalCoordinate coordinate, @NotNull IPSGlobalCoordinate buildingOrigin, double buildingRotation) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        return CoordinateKt.toCoordinate(((GlobalCoordinatesConverter) f.getD()).convertGlobalCoordinateToBuilding(BuildingExtKt.toWorldCoordinate(coordinate), BuildingExtKt.toWorldCoordinate(buildingOrigin), buildingRotation));
    }

    public final void defineCurrentBuilding(@NotNull IPSBuilding building) {
        Intrinsics.h(building, "building");
        ChargingBasedPositioningController chargingBasedPositioningController = (ChargingBasedPositioningController) O.getD();
        String id = building.getId();
        Intrinsics.g(id, "getId(...)");
        chargingBasedPositioningController.manuallyDefineBuilding(new GeofenceBuilding(id, new WorldCoordinate(building.getLatitude(), building.getLongitude(), 0.0d), building.getGeofenceRadius(), EmptyList.d));
    }

    @Nullable
    public final PositioningMetadataProvider.AutoStartData getAutoStartData() {
        return autoStartData;
    }

    @Nullable
    public final Integer getCalibrationNeededReason() {
        CalibrationReason calibrationGestureReason = CoreLogic.INSTANCE.getCalibrationGestureReason();
        if (calibrationGestureReason != null) {
            return Integer.valueOf(calibrationGestureReason.toIpsCalibrationNeededReason());
        }
        return null;
    }

    public final float getCalibrationProgress() {
        return calibrationProgress;
    }

    public final int getCalibrationState() {
        return calibrationState;
    }

    @Nullable
    public final IPSBuilding getCurrentIPSBuilding() {
        return (IPSBuilding) U.getCurrentBuilding().getValue();
    }

    @Nullable
    public final IPSFloor getCurrentIPSFloor() {
        return (IPSFloor) U.getCurrentFloor().getValue();
    }

    @Nullable
    public final IPSRestrictedArea getCurrentRestrictedArea() {
        return currentRestrictedArea;
    }

    @Nullable
    public final String getCurrentSessionId() {
        return CoreLogic.INSTANCE.getEngineSessionId();
    }

    public final long getCurrentTime() {
        return ((TimeProvider) X.getD()).getCurrentTimeGmt();
    }

    @Nullable
    public final Position getLastKnownLockedPosition() {
        Position position = r;
        if (position != null) {
            return new Position(position);
        }
        return null;
    }

    @Nullable
    public final Position getLastKnownPosition() {
        Position position = p;
        if (position != null) {
            return new Position(position);
        }
        return null;
    }

    public final double getLockThreshold() {
        return lockThreshold;
    }

    public final int getPositioningEngineState() {
        return positioningEngineState;
    }

    public final int getPositioningState() {
        return positioningState;
    }

    public final int getPublicPositioningEngineState() {
        if (positioningEngineState == 2 && b()) {
            return 1;
        }
        return positioningEngineState;
    }

    public final boolean getShouldBeCalibrating() {
        PendingCalibrationState pendingCalibrationState = D;
        if (pendingCalibrationState != null) {
            return pendingCalibrationState.getShouldBeCalibrating();
        }
        return false;
    }

    public final long getTimeFromStartOfSession() {
        long sessionStartTimeMilliUTC = CoreLogic.INSTANCE.getSessionStartTimeMilliUTC();
        if (sessionStartTimeMilliUTC != -1) {
            return ((TimeProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(TimeProvider.class))).getCurrentTimeGmt() - sessionStartTimeMilliUTC;
        }
        return -1L;
    }

    public final boolean isCalibrationGestureNeeded() {
        return CoreLogic.INSTANCE.isCalibrationGestureNeeded();
    }

    public final boolean isLimitedConnectionSupported() {
        return CoreLogic.INSTANCE.isLimitedConnectionSupported();
    }

    public final boolean isPositionLocked(@Nullable IPSPosition position) {
        return position != null && position.getL() >= lockThreshold;
    }

    @NotNull
    public final StateFlow<Boolean> isPreheatingEnabled() {
        return s;
    }

    public final void notifyFloorChanged$me_oriient_sdk_realtime(@NotNull Floor floor) {
        Intrinsics.h(floor, "floor");
        if (b()) {
            return;
        }
        me.oriient.ipssdk.common.utils.models.Floor sdkFloor = BuildingExtKt.toSdkFloor(floor);
        for (IPSPositioningListener iPSPositioningListener : CollectionsKt.G0(u)) {
            try {
                iPSPositioningListener.onFloorChanged(sdkFloor);
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException(iPSPositioningListener.getClass().getSimpleName(), e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iPSPositioningListener.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iPSPositioningListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
    }

    public final void onActiveFloorChanged$me_oriient_sdk_realtime(@NotNull String floorId) {
        Intrinsics.h(floorId, "floorId");
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.d(TAG, "onActiveFloorChanged() called", MapsKt.i(new Pair("floorId", floorId)));
        q = null;
        a((Position) null, (IPSRestrictedArea) null);
        onChangeActiveFloorEnded();
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionDataListener
    public void onCalibrationNeeded(@Nullable CalibrationReason reason, @Nullable String info) {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onCalibrationNeeded() called");
        for (IPSPositioningListener iPSPositioningListener : CollectionsKt.G0(u)) {
            try {
                iPSPositioningListener.onCalibrationGestureNeeded(true);
                iPSPositioningListener.onCalibrationGestureNeeded(true, reason != null ? Integer.valueOf(reason.toIpsCalibrationNeededReason()) : null);
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException(iPSPositioningListener.getClass().getSimpleName(), e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iPSPositioningListener.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iPSPositioningListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionDataListener
    public void onCalibrationUpdate(float percent) {
        if (percent > 100.0f) {
            percent = 100.0f;
        } else if (percent < BitmapDescriptorFactory.HUE_RED) {
            percent = 0.0f;
        }
        float f2 = calibrationProgress;
        calibrationProgress = percent;
        if (calibrationState == 2) {
            for (ICalibrationListener iCalibrationListener : CollectionsKt.G0(t)) {
                try {
                    iCalibrationListener.onCalibrationProgress(percent);
                } catch (Exception e2) {
                    ListenerException listenerException = new ListenerException(iCalibrationListener.getClass().getSimpleName(), e2);
                    INSTANCE.getClass();
                    AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iCalibrationListener.getClass().getSimpleName(), "Exception in application");
                    INSTANCE.getClass();
                    ((Logger) b.getD()).e(iCalibrationListener.getClass().getSimpleName(), "Exception in application", listenerException);
                }
            }
        }
        if (calibrationState == 2 || positioningState == 2) {
            for (IPSPositioningListener iPSPositioningListener : CollectionsKt.G0(u)) {
                try {
                    iPSPositioningListener.onCalibrationProgress(percent);
                } catch (Exception e3) {
                    ListenerException listenerException2 = new ListenerException(iPSPositioningListener.getClass().getSimpleName(), e3);
                    INSTANCE.getClass();
                    AbstractC1691n0.a(listenerException2, "errorMessage", (ELog) c.getD(), iPSPositioningListener.getClass().getSimpleName(), "Exception in application");
                    INSTANCE.getClass();
                    ((Logger) b.getD()).e(iPSPositioningListener.getClass().getSimpleName(), "Exception in application", listenerException2);
                }
            }
        }
        if (f2 >= 100.0f || percent < 100.0f) {
            return;
        }
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onCalibrationUpdate: device is calibrated");
        if (calibrationState == 2) {
            ((Logger) lazy.getD()).d(TAG, "stopCalibration() called");
            stopCalibration(null);
        }
        for (IPSPositioningListener iPSPositioningListener2 : CollectionsKt.G0(u)) {
            try {
                iPSPositioningListener2.onCalibrationGestureNeeded(false);
                iPSPositioningListener2.onCalibrationGestureNeeded(false, null);
            } catch (Exception e4) {
                ListenerException listenerException3 = new ListenerException(iPSPositioningListener2.getClass().getSimpleName(), e4);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException3, "errorMessage", (ELog) c.getD(), iPSPositioningListener2.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iPSPositioningListener2.getClass().getSimpleName(), "Exception in application", listenerException3);
            }
        }
    }

    public final void onChangeActiveFloorEnded() {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onChangeActiveFloorEnded() called");
        if (positioningState == 4) {
            setPositioningState(2);
            positioningEngineState = 2;
            d();
        }
    }

    public final void onChangeActiveFloorStarted() {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onChangeActiveFloorStarted() called");
        if (positioningState != 4) {
            setPositioningState(4);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onEnterBackground$me_oriient_sdk_realtime() {
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.d(TAG, "Lifecycle onEnterBackground() called");
        x = true;
        if (w || Core.INSTANCE.getConnectionState() == 0) {
            f();
        } else {
            ScheduledFuture scheduledFuture = y;
            if (scheduledFuture != null) {
                INSTANCE.getClass();
                ((Logger) b.getD()).d(TAG, "cancelNoMovementTimer() called");
                scheduledFuture.cancel(true);
                y = null;
            }
        }
        e();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onEnterForeground$me_oriient_sdk_realtime() {
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.d(TAG, "Lifecycle onEnterForeground() called");
        x = false;
        Core core = Core.INSTANCE;
        core.evaluateConnectionState$me_oriient_sdk_realtime();
        if (x && (w || core.getConnectionState() == 0)) {
            f();
        } else {
            ScheduledFuture scheduledFuture = y;
            if (scheduledFuture != null) {
                INSTANCE.getClass();
                ((Logger) b.getD()).d(TAG, "cancelNoMovementTimer() called");
                scheduledFuture.cancel(true);
                y = null;
            }
        }
        ScheduledFuture scheduledFuture2 = z;
        if (scheduledFuture2 != null) {
            INSTANCE.getClass();
            ((Logger) b.getD()).d(TAG, "cancelBackgroundTimer() called");
            scheduledFuture2.cancel(true);
            z = null;
        }
    }

    public final void onNewConfig(@NotNull PositioningConfig positioningConfig) {
        Intrinsics.h(positioningConfig, "positioningConfig");
        s.setValue(Boolean.valueOf(positioningConfig.isPreheatingEnabledByDefault()));
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionDataListener
    public void onPositioningUpdate(@NotNull Position newPosition, @NotNull PositioningUpdate rawUpdate) {
        Intrinsics.h(newPosition, "newPosition");
        Intrinsics.h(rawUpdate, "rawUpdate");
        PendingPositioningState pendingPositioningState = C;
        IPSRestrictedArea iPSRestrictedArea = null;
        if (positioningState != 2 || (pendingPositioningState != null && !pendingPositioningState.getShouldBePositioning())) {
            Lazy lazy = b;
            Logger logger = (Logger) lazy.getD();
            String TAG = f25840a;
            Intrinsics.g(TAG, "TAG");
            logger.w(TAG, "onPositioningUpdate: got positioning update but not positioning or wrong map");
            Logger logger2 = (Logger) lazy.getD();
            StringBuilder sbA = AbstractC1685m0.a(TAG, "TAG", "onPositioningUpdate: state - ");
            sbA.append(positioningState);
            sbA.append(", should - ");
            sbA.append(pendingPositioningState != null ? Boolean.valueOf(pendingPositioningState.getShouldBePositioning()) : null);
            logger2.w(TAG, sbA.toString());
            return;
        }
        Position position = p;
        boolean z2 = position != null && MathUtils.plainDistance(newPosition, position) <= ((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().getNoMovementDeltaMeters();
        if (z2 != w) {
            w = z2;
            if (x && (z2 || Core.INSTANCE.getConnectionState() == 0)) {
                f();
            } else {
                ScheduledFuture scheduledFuture = y;
                if (scheduledFuture != null) {
                    INSTANCE.getClass();
                    Logger logger3 = (Logger) b.getD();
                    String TAG2 = f25840a;
                    Intrinsics.g(TAG2, "TAG");
                    logger3.d(TAG2, "cancelNoMovementTimer() called");
                    scheduledFuture.cancel(true);
                    y = null;
                }
            }
        }
        q = rawUpdate;
        MappingData.FloorFullData.RestrictedArea restrictedArea = rawUpdate.getRestrictedArea();
        if (restrictedArea != null) {
            String buildingId = newPosition.getBuildingId();
            String floorId = newPosition.getF();
            String id = restrictedArea.getId();
            String name = restrictedArea.getName();
            List<IndoorCoordinate> vertices = restrictedArea.getVertices();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(vertices, 10));
            for (IndoorCoordinate indoorCoordinate : vertices) {
                arrayList.add(new Coordinate(indoorCoordinate.getX(), indoorCoordinate.getY()));
            }
            iPSRestrictedArea = new IPSRestrictedArea(id, name, arrayList, buildingId, floorId);
        }
        a(newPosition, iPSRestrictedArea);
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionDataListener
    public void onSessionError(@NotNull IPSError error) {
        Intrinsics.h(error, "error");
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.e(TAG, "onSessionError() called with: error = [" + error + ']');
        if (calibrationState == 2) {
            for (ICalibrationListener iCalibrationListener : CollectionsKt.G0(t)) {
                try {
                    iCalibrationListener.onCalibrationError(error);
                } catch (Exception e2) {
                    ListenerException listenerException = new ListenerException(iCalibrationListener.getClass().getSimpleName(), e2);
                    INSTANCE.getClass();
                    AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iCalibrationListener.getClass().getSimpleName(), "Exception in application");
                    INSTANCE.getClass();
                    ((Logger) b.getD()).e(iCalibrationListener.getClass().getSimpleName(), "Exception in application", listenerException);
                }
            }
        }
        if (positioningState == 2) {
            ((GeofencePositioningAutoStarter) N.getD()).onPositioningSessionError();
            ((ChargingBasedPositioningController) O.getD()).pauseTillNextCharging();
            a(error);
        }
    }

    @Override // me.oriient.ipssdk.realtime.ips.ISessionStateListener
    public void onSessionStateChanged(@NotNull PositioningEngineState newState) {
        int i;
        Intrinsics.h(newState, "newState");
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onSessionStateChanged() called with: newState = [" + newState + ']');
        boolean z2 = newState instanceof PositioningEngineState.Positioning;
        if (z2 || positioningState != 2) {
            int i2 = positioningState;
            if ((i2 == 1 || i2 == 3) && (newState instanceof PositioningEngineState.Idle)) {
                a(new EngineStopReason.EngineStateChanged("Engine was closed while waiting for start/stop"));
            }
        } else {
            a(new EngineStopReason.EngineStateChanged("Engine is not positioning anymore"));
        }
        if (((newState instanceof PositioningEngineState.Calibrating) || z2 || calibrationState != 2) && !(((i = calibrationState) == 1 || i == 3) && (newState instanceof PositioningEngineState.Idle))) {
            return;
        }
        b((IPSError) null);
    }

    public final void onUserLogout() {
        G.getClass();
        EngineStopReason.Logout logout = EngineStopReason.Logout.INSTANCE;
        C = new PendingPositioningState.Idle(logout);
        H.getClass();
        D = PendingCalibrationState.Idle.INSTANCE;
        q = null;
        a((Position) null, (IPSRestrictedArea) null);
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "clearPosition: position cleared");
        ((AutomaticCalibrator) M.getD()).stop(logout);
        ((ChargingBasedPositioningController) O.getD()).deactivate();
        s.setValue(Boolean.FALSE);
    }

    public final void removeCalibrationListener(@Nullable ICalibrationListener listener) {
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "removeCalibrationListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e(TAG, "removeCalibrationListener: trying to remove null listener!");
            return;
        }
        ArrayList arrayList = t;
        int iIndexOf = arrayList.indexOf(listener);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
            return;
        }
        ((Logger) lazy.getD()).w(TAG, "removeCalibrationListener: listener " + listener + " was not set");
        Logger logger2 = (Logger) lazy.getD();
        StringBuilder sbA = AbstractC1685m0.a(TAG, "TAG", "removeCalibrationListener: listeners: ");
        sbA.append(ArraysKt.o(arrayList.toArray(new ICalibrationListener[0])));
        logger2.d(TAG, sbA.toString());
    }

    public final void removeCurrentRestrictedAreaListener(@NotNull IPSCurrentRestrictedAreaListener listener) {
        Intrinsics.h(listener, "listener");
        v.remove(listener);
    }

    public final void removePositioningListener(@Nullable IPSPositioningListener listener) {
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "removePositioningListener() called with: listener = [" + listener + ']');
        if (listener == null) {
            ((Logger) lazy.getD()).e(TAG, "removePositioningListener: trying to remove null listener!");
        } else {
            u.remove(listener);
        }
    }

    public final void sendCustomEventTag(@NotNull String tag, @Nullable String metadata, @NotNull String eventType, @Nullable IPSCompletionListener completionListener) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(eventType, "eventType");
        if (((RemoteConfig) ((RemoteConfigManager) d.getD()).getConfig().getValue()).getRealTime().getPositioning().getSupportedCustomEventTagTypes().contains(eventType)) {
            a(tag, metadata, new EventTagType.Custom(eventType), completionListener);
            return;
        }
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.w(TAG, "Send event tag with not supported type", new C1729t3(eventType));
        if (completionListener != null) {
            completionListener.onError(new Error("Event tag is not supported, coordinate the addition of a new value with Oriient Customer Support team.", 3, 2));
        }
    }

    public final void sendEventTag(@NotNull String tag, @Nullable String metadata, int eventType, @Nullable IPSCompletionListener completionListener) {
        Intrinsics.h(tag, "tag");
        EventTagType eventTagType = EventTagTypeKt.toEventTagType(eventType);
        if (eventTagType != null) {
            a(tag, metadata, eventTagType, completionListener);
            return;
        }
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.w(TAG, "Couldn't parse IPSEventTagType", new C1734u3(eventType));
        if (completionListener != null) {
            completionListener.onError(new Error("Couldn't parse IPSEventTagType", 3, 2));
        }
    }

    public final void setLastKnownPosition(@Nullable IPSPosition position) {
        int i = positioningState;
        if (i != 2 && i != 1) {
            a(position != null ? new Position(position) : null, (IPSRestrictedArea) null);
            return;
        }
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.e(TAG, "setLastKnownPosition: can't set last known position while navigating");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v2 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLockThreshold(double r4) {
        /*
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
        L6:
            r4 = r0
            goto Lf
        L8:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lf
            goto L6
        Lf:
            me.oriient.ipssdk.realtime.ips.Positioning.lockThreshold = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Positioning.setLockThreshold(double):void");
    }

    public final void setPositioningState(int i) {
        positioningState = i;
        ((GeofencePositioningAutoStarter) N.getD()).setPositioningState(i);
    }

    public final void setPreheatingEnabled(boolean enabled) {
        if (((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().getIgnorePublicAPIIsAutomaticCalibrationEnabled()) {
            return;
        }
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "setAutomaticCalibrationEnabled() called with: enabled = [" + enabled + ']');
        MutableStateFlow mutableStateFlow = s;
        if (!((Boolean) mutableStateFlow.getValue()).booleanValue() && enabled) {
            ((AutomaticCalibrator) M.getD()).reset();
        }
        mutableStateFlow.setValue(Boolean.valueOf(enabled));
    }

    public final void startCalibration(final boolean initiatedByUser, @Nullable String buildingId, @Nullable IPSCompletionListener listener) {
        Object next;
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "startCalibration() called with: listener = [" + listener + ']');
        if (!((SystemPermissionChecker) g.getD()).isLocationPermissionGranted()) {
            ValidationService.safeFailListener(listener, new Error("No location permission", 11, 2));
            return;
        }
        Iterator<T> it = Core.INSTANCE.unavailableFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((IPSUnavailableFeature) next).getFeature() == 0) {
                    break;
                }
            }
        }
        IPSUnavailableFeature iPSUnavailableFeature = (IPSUnavailableFeature) next;
        if (iPSUnavailableFeature != null) {
            INSTANCE.getClass();
            ELog eLog = (ELog) c.getD();
            String TAG2 = f25840a;
            Intrinsics.g(TAG2, "TAG");
            eLog.i(TAG2, "Denied start calibration", MapsKt.i(new Pair("reason", iPSUnavailableFeature.getUnavailabilityCause())));
            ValidationService.safeFailListener(listener, new Error(iPSUnavailableFeature.getUnavailabilityCause(), 9, 2));
            return;
        }
        if (ValidationService.validateConnected(listener)) {
            H.getClass();
            Positioning positioning = INSTANCE;
            Logger loggerAccess$getLogger = access$getLogger(positioning);
            String str = f25840a;
            Intrinsics.g(str, "access$getTAG$p(...)");
            loggerAccess$getLogger.d(str, "onCalibrationStartCalled() called with: listener = [" + listener + "], " + access$describePositioningState(positioning, positioning.getPositioningState()) + ", " + access$describeCalibrationState(positioning, positioning.getCalibrationState()) + ", " + IPSPositioning.describePositioningEngineState(positioning.getPositioningEngineState()));
            CoreLogic coreLogic = CoreLogic.INSTANCE;
            if (!coreLogic.sensorsValid()) {
                ValidationService.safeFailListener(listener, new Error("Unable to use sensors", 9, 2));
                return;
            }
            int calibrationState2 = positioning.getCalibrationState();
            if (calibrationState2 != 0) {
                if (calibrationState2 != 1) {
                    if (calibrationState2 == 2) {
                        if (initiatedByUser) {
                            b0 = true;
                        }
                        ValidationService.safeCompleteListener(listener);
                        return;
                    } else if (calibrationState2 != 3) {
                        Logger loggerAccess$getLogger2 = access$getLogger(positioning);
                        String str2 = f25840a;
                        StringBuilder sbA = AbstractC1685m0.a(str2, "access$getTAG$p(...)", "onCalibrationStartCalled: Unknown calibration state ");
                        sbA.append(access$describeCalibrationState(positioning, positioning.getCalibrationState()));
                        loggerAccess$getLogger2.e(str2, sbA.toString());
                        return;
                    }
                }
                if (listener != null) {
                    A.add(listener);
                }
                D = new PendingCalibrationState.Calibrating(initiatedByUser);
                return;
            }
            D = new PendingCalibrationState.Calibrating(initiatedByUser);
            if (listener != null) {
                A.add(listener);
            }
            if (positioning.getPositioningState() == 2 || positioning.getPositioningState() == 4) {
                Logger loggerAccess$getLogger3 = access$getLogger(positioning);
                String str3 = f25840a;
                Intrinsics.g(str3, "access$getTAG$p(...)");
                loggerAccess$getLogger3.d(str3, "onCalibrationStartCalled: positioning on already");
                access$onCalibrationStarted(positioning, initiatedByUser);
                return;
            }
            if (positioning.getPositioningState() == 3) {
                Logger loggerAccess$getLogger4 = access$getLogger(positioning);
                String str4 = f25840a;
                Intrinsics.g(str4, "access$getTAG$p(...)");
                loggerAccess$getLogger4.d(str4, "onCalibrationStartCalled: waiting for positioning to stop");
                if (listener != null) {
                    A.add(listener);
                    return;
                }
                return;
            }
            calibrationState = 1;
            Logger loggerAccess$getLogger5 = access$getLogger(positioning);
            String str5 = f25840a;
            StringBuilder sbA2 = AbstractC1685m0.a(str5, "access$getTAG$p(...)", "calibration state ");
            sbA2.append(access$describeCalibrationState(positioning, positioning.getCalibrationState()));
            loggerAccess$getLogger5.d(str5, sbA2.toString());
            access$notifyCalibrationStateChanged(positioning);
            if (positioning.getPositioningState() == 1) {
                return;
            }
            coreLogic.startCalibration(initiatedByUser, buildingId, new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.Positioning$CalibrationStateMachine$onCalibrationStartCalled$1
                @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
                public void onCompleted() {
                    Positioning positioning2 = Positioning.INSTANCE;
                    Logger loggerAccess$getLogger6 = Positioning.access$getLogger(positioning2);
                    String str6 = Positioning.f25840a;
                    Intrinsics.g(str6, "access$getTAG$p(...)");
                    loggerAccess$getLogger6.d(str6, "onCompleted() called");
                    Positioning.access$onCalibrationStarted(positioning2, initiatedByUser);
                }

                @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                public void onError(@NotNull IPSError error) {
                    Intrinsics.h(error, "error");
                    Logger loggerAccess$getLogger6 = Positioning.access$getLogger(Positioning.INSTANCE);
                    String str6 = Positioning.f25840a;
                    Intrinsics.g(str6, "access$getTAG$p(...)");
                    loggerAccess$getLogger6.e(str6, "onError() called with: error = [" + error + ']');
                    for (IPSCompletionListener iPSCompletionListener : CollectionsKt.G0(Positioning.A)) {
                        ValidationService.safeFailListener(iPSCompletionListener, error);
                        Positioning.A.remove(iPSCompletionListener);
                    }
                    Positioning.INSTANCE.b(error);
                }
            });
        }
    }

    public final void startPositioning(@NotNull String buildingId, @Nullable Integer floorOrder, @Nullable IPSStartingPosition startingPosition, @Nullable Boolean allowPositioningOutsideOfBuilding, @Nullable IPSCompletionListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        if (a(buildingId, listener)) {
            return;
        }
        a(buildingId, floorOrder, startingPosition, allowPositioningOutsideOfBuilding, true, listener);
    }

    public final void stopCalibration(@Nullable IPSCompletionListener listener) {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "stopCalibration() called with: listener = [" + listener + ']');
        a(EngineStopReason.CalibrationStopped.INSTANCE, listener);
    }

    public final void stopPositioning(@NotNull EngineStopReason reason, @Nullable IPSCompletionListener listener) {
        Intrinsics.h(reason, "reason");
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "stopPositioning() called with: reason = [" + reason + "], listener = [" + listener + ']');
        if (b()) {
            ((Logger) lazy.getD()).d(TAG, "stopPositioning: called without calling startPositioning. doing nothing...");
            ValidationService.safeCompleteListener(listener);
        } else {
            ((GeofencePositioningAutoStarter) N.getD()).onPositioningStoppedByClient();
            b(reason, listener);
        }
    }

    private static void c() {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        int i = calibrationState;
        logger.d(TAG, "calibration state changed to ".concat(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown" : "Waiting for calibration stop" : "Calibrating" : "Waiting for calibration start" : "Idle"));
        for (ICalibrationListener iCalibrationListener : CollectionsKt.G0(t)) {
            try {
                iCalibrationListener.onCalibrationStateChanged(calibrationState);
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException(iCalibrationListener.getClass().getSimpleName(), e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iCalibrationListener.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iCalibrationListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
    }

    public final void startPositioning(@NotNull IPSBuilding building, @Nullable Integer floorOrder, @Nullable IPSStartingPosition startingPosition, @Nullable Boolean userAllowPositioningOutsideOfBuilding, @Nullable IPSCompletionListener listener) {
        Intrinsics.h(building, "building");
        String id = building.getId();
        Intrinsics.g(id, "getId(...)");
        if (a(id, listener)) {
            return;
        }
        String id2 = building.getId();
        Intrinsics.g(id2, "getId(...)");
        a(id2, floorOrder, startingPosition, userAllowPositioningOutsideOfBuilding, true, listener);
    }

    @Nullable
    public final IPSGlobalCoordinate convertCoordinateToGlobalCoordinate(@NotNull IPSCoordinate coordinate, @NotNull IPSBuilding building) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(building, "building");
        IPSGlobalCoordinate origin = building.getOrigin();
        if (origin == null) {
            return null;
        }
        INSTANCE.getClass();
        WorldCoordinate worldCoordinateConvertBuildingCoordinateToGlobal = ((GlobalCoordinatesConverter) f.getD()).convertBuildingCoordinateToGlobal(BuildingExtKt.toIndoorCoordinate(coordinate), BuildingExtKt.toWorldCoordinate(origin), building.getRotationToENU());
        if (worldCoordinateConvertBuildingCoordinateToGlobal != null) {
            return ExtensionsKt.toSdkWorldCoordinate(worldCoordinateConvertBuildingCoordinateToGlobal);
        }
        return null;
    }

    @Nullable
    public final IPSCoordinate convertGlobalCoordinateToBuildingCoordinate(@NotNull IPSGlobalCoordinate coordinate, @NotNull IPSBuilding building) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(building, "building");
        IPSGlobalCoordinate origin = building.getOrigin();
        if (origin == null) {
            return null;
        }
        INSTANCE.getClass();
        me.oriient.internal.services.dataManager.common.IndoorCoordinate indoorCoordinateConvertGlobalCoordinateToBuilding = ((GlobalCoordinatesConverter) f.getD()).convertGlobalCoordinateToBuilding(BuildingExtKt.toWorldCoordinate(coordinate), BuildingExtKt.toWorldCoordinate(origin), building.getRotationToENU());
        if (indoorCoordinateConvertGlobalCoordinateToBuilding != null) {
            return CoordinateKt.toCoordinate(indoorCoordinateConvertGlobalCoordinateToBuilding);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        ProcessLifecycleOwner.l.i.a(INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(EngineStopReason engineStopReason) {
        Logger logger = (Logger) b.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "onPositioningStopped() called with: reason = [" + engineStopReason + ']');
        Proximity.INSTANCE.onPositioningStopped();
        ((AutomaticSessionStopper) R.getD()).stop();
        ((AutomaticSessionStopper) S.getD()).stop();
        ((AutomaticSessionStopper) T.getD()).stop();
        if (positioningState == 0) {
            return;
        }
        autoStartData = null;
        setPositioningState(0);
        positioningEngineState = 0;
        d();
        for (IPSCompletionListener iPSCompletionListener : CollectionsKt.G0(F)) {
            ValidationService.safeCompleteListener(iPSCompletionListener);
            F.remove(iPSCompletionListener);
        }
        currentRestrictedArea = null;
        Iterator it = CollectionsKt.G0(v).iterator();
        while (it.hasNext()) {
            ((IPSCurrentRestrictedAreaListener) it.next()).onCurrentRestrictedAreaChange(null);
        }
        Position position = p;
        PendingPositioningState pendingPositioningState = C;
        if ((pendingPositioningState instanceof PendingPositioningState.Positioning) && position != null) {
            PendingPositioningState.Positioning positioning = (PendingPositioningState.Positioning) pendingPositioningState;
            a(position.getBuildingId(), Integer.valueOf(position.getFloorOrder()), position, Boolean.valueOf(positioning.getAllowOutside()), positioning.getInitiatedByUser(), (IPSCompletionListener) null);
            return;
        }
        C = null;
        H.getClass();
        Positioning positioning2 = INSTANCE;
        Logger loggerAccess$getLogger = access$getLogger(positioning2);
        String str = f25840a;
        StringBuilder sbA = AbstractC1685m0.a(str, "access$getTAG$p(...)", "onPositioningStopped() called, ");
        sbA.append(access$describePositioningState(positioning2, positioning2.getPositioningState()));
        sbA.append(", ");
        sbA.append(access$describeCalibrationState(positioning2, positioning2.getCalibrationState()));
        sbA.append(", ");
        sbA.append(IPSPositioning.describePositioningEngineState(positioning2.getPositioningEngineState()));
        loggerAccess$getLogger.d(str, sbA.toString());
        calibrationProgress = BitmapDescriptorFactory.HUE_RED;
        boolean zIsCalibrationGestureNeeded = positioning2.isCalibrationGestureNeeded();
        int calibrationState2 = positioning2.getCalibrationState();
        if (calibrationState2 != 0) {
            if (calibrationState2 != 1) {
                if (calibrationState2 == 2) {
                    access$stopCalibration(positioning2);
                    return;
                } else if (calibrationState2 != 3) {
                    return;
                }
            }
            positioning2.b((IPSError) null);
            return;
        }
        Logger loggerAccess$getLogger2 = access$getLogger(positioning2);
        String str2 = f25840a;
        StringBuilder sbA2 = AbstractC1685m0.a(str2, "access$getTAG$p(...)", "onPositioningStopped: (");
        PendingCalibrationState pendingCalibrationState = D;
        sbA2.append(pendingCalibrationState != null ? Boolean.valueOf(pendingCalibrationState.getShouldBeCalibrating()) : null);
        sbA2.append(" || (");
        sbA2.append(((Boolean) s.getValue()).booleanValue());
        sbA2.append(" && ");
        sbA2.append(zIsCalibrationGestureNeeded);
        sbA2.append("))");
        loggerAccess$getLogger2.d(str2, sbA2.toString());
    }

    private static void b(EngineStopReason engineStopReason) {
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("reason", engineStopReason.getValue(), eLog, TAG, "onTimeToStop() called");
        ((GeofencePositioningAutoStarter) N.getD()).onPositioningAutoStopped();
        ((ChargingBasedPositioningController) O.getD()).pauseTillNextCharging();
        b(engineStopReason, null);
        ScheduledFuture scheduledFuture = y;
        if (scheduledFuture != null) {
            INSTANCE.getClass();
            ((Logger) b.getD()).d(TAG, "cancelNoMovementTimer() called");
            scheduledFuture.cancel(true);
            y = null;
        }
        ScheduledFuture scheduledFuture2 = z;
        if (scheduledFuture2 != null) {
            INSTANCE.getClass();
            ((Logger) b.getD()).d(TAG, "cancelBackgroundTimer() called");
            scheduledFuture2.cancel(true);
            z = null;
        }
    }

    private static boolean b() {
        return ((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().isAutomaticPositioningPartOfCalibration() && !a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(final me.oriient.positioningengine.common.EngineStopReason r7, me.oriient.ipssdk.api.listeners.IPSCompletionListener r8) {
        /*
            boolean r0 = me.oriient.ipssdk.realtime.ips.ValidationService.validateConnected(r8)
            if (r0 == 0) goto Lfd
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.O
            java.lang.Object r0 = r0.getD()
            me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController r0 = (me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController) r0
            r0.pauseTillNextCharging()
            me.oriient.ipssdk.realtime.ips.m r0 = me.oriient.ipssdk.realtime.ips.Positioning.G
            r0.getClass()
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            me.oriient.ipssdk.realtime.ips.Positioning r0 = me.oriient.ipssdk.realtime.ips.Positioning.INSTANCE
            me.oriient.internal.infra.utils.core.Logger r1 = access$getLogger(r0)
            java.lang.String r2 = access$getTAG$p()
            java.lang.String r3 = "access$getTAG$p(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onStopPositioningCalled() called with: reason = "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = "], listener = ["
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = "], "
            r4.append(r5)
            int r5 = r0.getPositioningState()
            java.lang.String r5 = access$describePositioningState(r0, r5)
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            int r6 = r0.getCalibrationState()
            java.lang.String r6 = access$describeCalibrationState(r0, r6)
            r4.append(r6)
            r4.append(r5)
            int r5 = r0.getPositioningEngineState()
            java.lang.String r5 = me.oriient.ipssdk.ips.IPSPositioning.describePositioningEngineState(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.d(r2, r4)
            int r1 = r0.getPositioningState()
            if (r1 == 0) goto Lf7
            r2 = 1
            if (r1 == r2) goto Le5
            r2 = 2
            r4 = 3
            if (r1 == r2) goto La4
            if (r1 == r4) goto Le5
            r2 = 4
            if (r1 == r2) goto La4
            me.oriient.internal.infra.utils.core.Logger r7 = access$getLogger(r0)
            java.lang.String r8 = access$getTAG$p()
            java.lang.String r1 = "onStopPositioningCalled: Unknown positioning state "
            java.lang.StringBuilder r1 = me.oriient.ipssdk.realtime.ofs.AbstractC1685m0.a(r8, r3, r1)
            int r2 = r0.getPositioningState()
            java.lang.String r0 = access$describePositioningState(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.e(r8, r0)
            goto Lfa
        La4:
            me.oriient.ipssdk.realtime.ips.PendingPositioningState$Idle r1 = new me.oriient.ipssdk.realtime.ips.PendingPositioningState$Idle
            r1.<init>(r7)
            access$setPendingPositioningState$p(r1)
            r0.setPositioningState(r4)
            me.oriient.internal.infra.utils.core.Logger r1 = access$getLogger(r0)
            java.lang.String r2 = access$getTAG$p()
            java.lang.String r4 = "positioning state "
            java.lang.StringBuilder r3 = me.oriient.ipssdk.realtime.ofs.AbstractC1685m0.a(r2, r3, r4)
            int r4 = r0.getPositioningState()
            java.lang.String r0 = access$describePositioningState(r0, r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.d(r2, r0)
            if (r8 == 0) goto Ld8
            java.util.List r0 = access$getPositioningStopListeners$p()
            r0.add(r8)
        Ld8:
            me.oriient.ipssdk.realtime.ips.PositioningKotlinHelper r8 = access$getPositioningKotlinHelper$p()
            me.oriient.ipssdk.realtime.ips.Positioning$PositioningStateMachine$onStopPositioningCalled$1 r0 = new me.oriient.ipssdk.realtime.ips.Positioning$PositioningStateMachine$onStopPositioningCalled$1
            r0.<init>()
            r8.stopPositioning(r7, r0)
            goto Lfa
        Le5:
            if (r8 == 0) goto Lee
            java.util.List r0 = access$getPositioningStopListeners$p()
            r0.add(r8)
        Lee:
            me.oriient.ipssdk.realtime.ips.PendingPositioningState$Idle r8 = new me.oriient.ipssdk.realtime.ips.PendingPositioningState$Idle
            r8.<init>(r7)
            access$setPendingPositioningState$p(r8)
            goto Lfa
        Lf7:
            me.oriient.ipssdk.realtime.ips.ValidationService.safeCompleteListener(r8)
        Lfa:
            r7 = 0
            me.oriient.ipssdk.realtime.ips.Positioning.a0 = r7
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Positioning.b(me.oriient.positioningengine.common.EngineStopReason, me.oriient.ipssdk.api.listeners.IPSCompletionListener):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Integer num, IPSStartingPosition iPSStartingPosition, Boolean bool, boolean z2, IPSCompletionListener iPSCompletionListener) {
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "startPositioning() called with: buildingId = [" + str + "], floorOrder = [" + num + "], startingPosition = [" + iPSStartingPosition + "], listener = [" + iPSCompletionListener + ']');
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        Building activeBuilding = coreLogic.getActiveBuilding();
        Logger logger2 = (Logger) lazy.getD();
        StringBuilder sbA = AbstractC1685m0.a(TAG, "TAG", "startPositioning: active building is ");
        sbA.append(activeBuilding != null ? activeBuilding.getId() : null);
        logger2.d(TAG, sbA.toString());
        if (positioningState != 0 && activeBuilding != null && !Intrinsics.c(activeBuilding.getId(), str)) {
            ValidationService.safeFailListener(iPSCompletionListener, new Error("A session is already active.", 3, 2));
            return;
        }
        if (!((SystemPermissionChecker) g.getD()).isLocationPermissionGranted()) {
            a(this, activeBuilding, (SystemLocation) null, "No permission");
            ValidationService.safeFailListener(iPSCompletionListener, new Error("No location permission", 11, 2));
            return;
        }
        if (activeBuilding != null && Intrinsics.c(activeBuilding.getId(), str)) {
            ((Logger) lazy.getD()).d(TAG, "startPositioning: existing building");
            a(activeBuilding, num, iPSStartingPosition, bool, z2, iPSCompletionListener);
            return;
        }
        ((Logger) lazy.getD()).d(TAG, "startPositioning: new building");
        if (coreLogic.getUser() == null) {
            ((Logger) lazy.getD()).e(TAG, "startPositioning: not logged in!");
            ValidationService.safeFailListener(iPSCompletionListener, new Error("not logged in", 4, 0));
        } else {
            BuildersKt.c((CoroutineScope) J.getD(), null, null, new C1744w3(str, num, iPSStartingPosition, bool, z2, iPSCompletionListener, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(long j) {
        Positioning positioning = INSTANCE;
        EngineStopReason.NoMovementTimeout noMovementTimeout = new EngineStopReason.NoMovementTimeout(j);
        positioning.getClass();
        b(noMovementTimeout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Building building, Integer num, IPSStartingPosition iPSStartingPosition, Boolean bool, boolean z2, IPSCompletionListener iPSCompletionListener) {
        Object next;
        Object next2;
        Lazy lazy = b;
        Logger logger = (Logger) lazy.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        logger.d(TAG, "startPositioning() called with: startingPosition = [" + iPSStartingPosition + "], floorOrder = [" + num + "], building = [" + building.getId() + "], listener = [" + iPSCompletionListener + ']');
        Building activeBuilding = CoreLogic.INSTANCE.getActiveBuilding();
        Logger logger2 = (Logger) lazy.getD();
        StringBuilder sbA = AbstractC1685m0.a(TAG, "TAG", "startPositioning: active building is ");
        sbA.append(activeBuilding != null ? activeBuilding.getId() : null);
        logger2.d(TAG, sbA.toString());
        if (positioningState != 0 && activeBuilding != null && !Intrinsics.c(activeBuilding.getId(), building.getId())) {
            ValidationService.safeFailListener(iPSCompletionListener, new Error("Can't change building while positioning", 3, 2));
            return;
        }
        if (!((SystemPermissionChecker) g.getD()).isLocationPermissionGranted()) {
            a(this, activeBuilding, (SystemLocation) null, "No permission");
            ValidationService.safeFailListener(iPSCompletionListener, new Error("No location permission", 11, 2));
            return;
        }
        Iterator<T> it = Core.INSTANCE.unavailableFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((IPSUnavailableFeature) next).getFeature() == 0) {
                    break;
                }
            }
        }
        IPSUnavailableFeature iPSUnavailableFeature = (IPSUnavailableFeature) next;
        if (iPSUnavailableFeature != null) {
            a(INSTANCE, building, (SystemLocation) null, "Missing Sensors");
            ValidationService.safeFailListener(iPSCompletionListener, new Error(iPSUnavailableFeature.getUnavailabilityCause(), 9, 2));
            return;
        }
        if (!((RemoteConfigManager) d.getD()).getRealTimeConfig().getMisc().getAllowNoBarometerPositioningInMultifloor() && building.getFloors().size() > 1) {
            Iterator<T> it2 = Core.INSTANCE.unavailableFeatures().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (((IPSUnavailableFeature) next2).getFeature() == 1) {
                        break;
                    }
                }
            }
            IPSUnavailableFeature iPSUnavailableFeature2 = (IPSUnavailableFeature) next2;
            if (iPSUnavailableFeature2 != null) {
                a(INSTANCE, building, (SystemLocation) null, "No barometer on multi-floor");
                ValidationService.safeFailListener(iPSCompletionListener, new Error(iPSUnavailableFeature2.getUnavailabilityCause(), 13, 2));
                return;
            }
        }
        BuildersKt.c(Z, null, null, new n(bool, building, iPSCompletionListener, num, iPSStartingPosition, activeBuilding, z2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(me.oriient.positioningengine.common.EngineStopReason r7, me.oriient.ipssdk.api.listeners.IPSCompletionListener r8) {
        /*
            boolean r0 = me.oriient.ipssdk.realtime.ips.ValidationService.validateConnected(r8)
            if (r0 == 0) goto Le9
            me.oriient.ipssdk.realtime.ips.l r0 = me.oriient.ipssdk.realtime.ips.Positioning.H
            r0.getClass()
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            me.oriient.ipssdk.realtime.ips.Positioning r0 = me.oriient.ipssdk.realtime.ips.Positioning.INSTANCE
            me.oriient.internal.infra.utils.core.Logger r1 = access$getLogger(r0)
            java.lang.String r2 = access$getTAG$p()
            java.lang.String r3 = "access$getTAG$p(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onCalibrationStopCalled() called with: listener = ["
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r5 = "], "
            r4.append(r5)
            int r5 = r0.getPositioningState()
            java.lang.String r5 = access$describePositioningState(r0, r5)
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            int r6 = r0.getCalibrationState()
            java.lang.String r6 = access$describeCalibrationState(r0, r6)
            r4.append(r6)
            r4.append(r5)
            int r5 = r0.getPositioningEngineState()
            java.lang.String r5 = me.oriient.ipssdk.ips.IPSPositioning.describePositioningEngineState(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.d(r2, r4)
            int r1 = r0.getCalibrationState()
            if (r1 == 0) goto Lde
            r2 = 1
            if (r1 == r2) goto Lcf
            r4 = 2
            r5 = 3
            if (r1 == r4) goto L8e
            if (r1 == r5) goto Lcf
            me.oriient.internal.infra.utils.core.Logger r7 = access$getLogger(r0)
            java.lang.String r8 = access$getTAG$p()
            java.lang.String r1 = "onCalibrationStopCalled: Unknown calibration state "
            java.lang.StringBuilder r1 = me.oriient.ipssdk.realtime.ofs.AbstractC1685m0.a(r8, r3, r1)
            int r2 = r0.getCalibrationState()
            java.lang.String r0 = access$describeCalibrationState(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.e(r8, r0)
            goto Le6
        L8e:
            me.oriient.ipssdk.realtime.ips.PendingCalibrationState$Idle r1 = me.oriient.ipssdk.realtime.ips.PendingCalibrationState.Idle.INSTANCE
            access$setPendingCalibrationState$p(r1)
            if (r8 == 0) goto L9c
            java.util.List r1 = access$getCalibrationStopListeners$p()
            r1.add(r8)
        L9c:
            int r1 = r0.getPositioningState()
            if (r1 == r4) goto Lca
            int r1 = r0.getPositioningState()
            if (r1 != r2) goto La9
            goto Lca
        La9:
            access$setCalibrationState$p(r5)
            access$notifyCalibrationStateChanged(r0)
            int r0 = r0.getPositioningState()
            if (r0 != r5) goto Lbf
            if (r8 == 0) goto Le6
            java.util.List r7 = access$getCalibrationStopListeners$p()
            r7.add(r8)
            goto Le6
        Lbf:
            me.oriient.ipssdk.realtime.ips.CoreLogic r8 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.ipssdk.realtime.ips.Positioning$CalibrationStateMachine$onCalibrationStopCalled$1 r0 = new me.oriient.ipssdk.realtime.ips.Positioning$CalibrationStateMachine$onCalibrationStopCalled$1
            r0.<init>()
            r8.stopCalibration(r7, r0)
            goto Le6
        Lca:
            r7 = 0
            access$onCalibrationStopped(r0, r7)
            goto Le6
        Lcf:
            if (r8 == 0) goto Ld8
            java.util.List r7 = access$getCalibrationStopListeners$p()
            r7.add(r8)
        Ld8:
            me.oriient.ipssdk.realtime.ips.PendingCalibrationState$Idle r7 = me.oriient.ipssdk.realtime.ips.PendingCalibrationState.Idle.INSTANCE
            access$setPendingCalibrationState$p(r7)
            goto Le6
        Lde:
            me.oriient.ipssdk.realtime.ips.PendingCalibrationState$Idle r7 = me.oriient.ipssdk.realtime.ips.PendingCalibrationState.Idle.INSTANCE
            access$setPendingCalibrationState$p(r7)
            me.oriient.ipssdk.realtime.ips.ValidationService.safeCompleteListener(r8)
        Le6:
            r7 = 0
            me.oriient.ipssdk.realtime.ips.Positioning.b0 = r7
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Positioning.a(me.oriient.positioningengine.common.EngineStopReason, me.oriient.ipssdk.api.listeners.IPSCompletionListener):void");
    }

    private final void a(Position position, IPSRestrictedArea iPSRestrictedArea) {
        p = position;
        if (position == null) {
            r = null;
            if (b() && positioningState == 2) {
                return;
            }
            ((SdkNavigationPositioningProvider) V.getD()).onNewPosition(null);
            return;
        }
        if (isPositionLocked(position)) {
            r = position;
            if (!b() || positioningState != 2) {
                ((SdkNavigationPositioningProvider) V.getD()).onNewPosition(position);
            }
        }
        if (b() && positioningState == 2) {
            return;
        }
        for (IPSPositioningListener iPSPositioningListener : CollectionsKt.G0(u)) {
            try {
                iPSPositioningListener.onPositionUpdate(position);
            } catch (Exception e2) {
                ListenerException listenerException = new ListenerException(iPSPositioningListener.getClass().getSimpleName(), e2);
                INSTANCE.getClass();
                AbstractC1691n0.a(listenerException, "errorMessage", (ELog) c.getD(), iPSPositioningListener.getClass().getSimpleName(), "Exception in application");
                ((Logger) b.getD()).e(iPSPositioningListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
        Proximity.INSTANCE.onPositionUpdate(position);
        if (!isPositionLocked(position)) {
            iPSRestrictedArea = null;
        }
        currentRestrictedArea = iPSRestrictedArea;
        Iterator it = CollectionsKt.G0(v).iterator();
        while (it.hasNext()) {
            ((IPSCurrentRestrictedAreaListener) it.next()).onCurrentRestrictedAreaChange(iPSRestrictedArea);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j) {
        Positioning positioning = INSTANCE;
        EngineStopReason.InBackgroundTimeout inBackgroundTimeout = new EngineStopReason.InBackgroundTimeout(j);
        positioning.getClass();
        b(inBackgroundTimeout);
    }

    public static void a(Positioning positioning, Building building, SystemLocation systemLocation, String str) {
        String id;
        WorldCoordinate geofenceOrigin;
        positioning.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(a.REASON.getValue(), str);
        String value = a.BUILDING_ID.getValue();
        if (building == null || (id = building.getId()) == null) {
            id = "";
        }
        linkedHashMap.put(value, id);
        if (systemLocation != null) {
            linkedHashMap.put(a.LAT.getValue(), Double.valueOf(systemLocation.getLatitude()));
            linkedHashMap.put(a.LONG.getValue(), Double.valueOf(systemLocation.getLongitude()));
            linkedHashMap.put(a.ACCURACY.getValue(), Double.valueOf(systemLocation.getHorizontalAccuracy()));
            if (building != null && (geofenceOrigin = building.getGeofenceOrigin()) != null) {
                linkedHashMap.put(a.DISTANCE.getValue(), Double.valueOf(systemLocation.distanceTo(geofenceOrigin.getLatitude(), geofenceOrigin.getLongitude())));
            }
        }
        ELog eLog = (ELog) c.getD();
        String TAG = f25840a;
        Intrinsics.g(TAG, "TAG");
        eLog.i(TAG, "Denied start positioning", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(java.lang.String r14, me.oriient.ipssdk.api.listeners.IPSCompletionListener r15) {
        /*
            r13 = this;
            boolean r0 = me.oriient.ipssdk.realtime.ips.Positioning.a0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L21
            int r0 = me.oriient.ipssdk.realtime.ips.Positioning.positioningEngineState
            r3 = 2
            if (r0 != r3) goto L21
            me.oriient.ipssdk.realtime.ips.CoreLogic r0 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.services.dataManager.building.Building r0 = r0.getActiveBuilding()
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.getId()
            goto L19
        L18:
            r0 = 0
        L19:
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r14)
            if (r0 == 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            boolean r3 = me.oriient.ipssdk.realtime.ips.Positioning.I
            if (r3 == 0) goto L3f
            me.oriient.ipssdk.realtime.ips.Positioning.a0 = r2
            kotlin.Lazy r14 = me.oriient.ipssdk.realtime.ips.Positioning.N
            java.lang.Object r14 = r14.getD()
            me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter r14 = (me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter) r14
            r14.onPositioningStartedByClient()
            kotlin.Lazy r14 = me.oriient.ipssdk.realtime.ips.Positioning.O
            java.lang.Object r14 = r14.getD()
            me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController r14 = (me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController) r14
            r14.pauseTillNextCharging()
            return r1
        L3f:
            if (r0 != 0) goto L42
            return r1
        L42:
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.b
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.infra.utils.core.Logger r0 = (me.oriient.internal.infra.utils.core.Logger) r0
            java.lang.String r1 = me.oriient.ipssdk.realtime.ips.Positioning.f25840a
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)
            java.lang.String r3 = "automatic positioning in this building is already active"
            r0.d(r1, r3)
            me.oriient.ipssdk.realtime.ips.Positioning.a0 = r2
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.N
            java.lang.Object r0 = r0.getD()
            me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter r0 = (me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter) r0
            r0.onPositioningStartedByClient()
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.O
            java.lang.Object r0 = r0.getD()
            me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController r0 = (me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController) r0
            r0.pauseTillNextCharging()
            me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider$AutoStartData r3 = new me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider$AutoStartData
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.X
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.infra.utils.core.time.TimeProvider r0 = (me.oriient.internal.infra.utils.core.time.TimeProvider) r0
            long r4 = r0.getCurrentTimeMillis()
            me.oriient.ipssdk.realtime.utils.models.Position r0 = me.oriient.ipssdk.realtime.ips.Positioning.p
            r6 = 0
            if (r0 == 0) goto L87
            double r8 = r0.getL()
            goto L88
        L87:
            r8 = r6
        L88:
            boolean r0 = r13.isCalibrationGestureNeeded()
            me.oriient.ipssdk.realtime.utils.models.Position r10 = me.oriient.ipssdk.realtime.ips.Positioning.p
            if (r10 == 0) goto L94
            double r6 = r10.getM()
        L94:
            r11 = r8
            r9 = r6
            r6 = r11
            r8 = r0
            r3.<init>(r4, r6, r8, r9)
            me.oriient.ipssdk.realtime.ips.Positioning.autoStartData = r3
            kotlin.Lazy r0 = me.oriient.ipssdk.realtime.ips.Positioning.c
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            me.oriient.ipssdk.realtime.ofs.r3 r3 = new me.oriient.ipssdk.realtime.ofs.r3
            r3.<init>(r14)
            java.lang.String r14 = "Automatic positioning - manual start"
            r0.i(r1, r14, r3)
            d()
            me.oriient.ipssdk.realtime.ips.ValidationService.safeCompleteListener(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.Positioning.a(java.lang.String, me.oriient.ipssdk.api.listeners.IPSCompletionListener):boolean");
    }

    private final void a(final String str, String str2, final EventTagType eventTagType, final IPSCompletionListener iPSCompletionListener) {
        PositioningUpdate positioningUpdate;
        String str3;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        if (((CommonRuntimeDataProvider) di.get(reflectionFactory.b(CommonRuntimeDataProvider.class))).getF25787a() == null) {
            ELog eLog = (ELog) c.getD();
            String TAG = f25840a;
            Intrinsics.g(TAG, "TAG");
            eLog.api(TAG, "Send event tag before login");
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("Not logged in", 3, 0));
                return;
            }
            return;
        }
        if (positioningEngineState != 2) {
            ELog eLog2 = (ELog) c.getD();
            String TAG2 = f25840a;
            Intrinsics.g(TAG2, "TAG");
            eLog2.api(TAG2, "Send event tag while not positioning");
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("Not positioning", 3, 2));
                return;
            }
            return;
        }
        PositioningUpdate positioningUpdate2 = q;
        Double z2 = positioningUpdate2 != null ? positioningUpdate2.getZ() : null;
        if (positioningUpdate2 == null || z2 == null) {
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("No position has been obtained yet", 3, 2));
                return;
            }
            return;
        }
        final long currentTime = getCurrentTime();
        final long serverTimeMillis = positioningUpdate2.getServerTimeMillis() - currentTime;
        if (Math.abs(serverTimeMillis) > ((RemoteConfigManager) d.getD()).getRealTimeConfig().getPositioning().getMaxPositionAgeToEventTagMillis()) {
            ELog eLog3 = (ELog) c.getD();
            String TAG3 = f25840a;
            Intrinsics.g(TAG3, "TAG");
            eLog3.api(TAG3, "Send event tag old position", MapsKt.i(new Pair("delta", Long.valueOf(serverTimeMillis))));
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("Last known position is too old", 3, 2));
                return;
            }
            return;
        }
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        Building activeBuilding = coreLogic.getActiveBuilding();
        if (activeBuilding == null) {
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("No active building", 3, 2));
                return;
            }
            return;
        }
        String engineSessionId = coreLogic.getEngineSessionId();
        if (engineSessionId == null) {
            if (iPSCompletionListener != null) {
                iPSCompletionListener.onError(new Error("No positioning session id", 3, 2));
                return;
            }
            return;
        }
        String mapId = positioningUpdate2.getMapId();
        if (mapId == null) {
            ELog eLog4 = (ELog) c.getD();
            String TAG4 = f25840a;
            Intrinsics.g(TAG4, "TAG");
            positioningUpdate = positioningUpdate2;
            eLog4.w(TAG4, "sendEventTag: mapId is null because floor %d wasn't found in building %s", MapsKt.j(new Pair("floorOrder", positioningUpdate2.getFloorOrder()), new Pair("buildingId", activeBuilding.getId())));
            mapId = null;
        } else {
            positioningUpdate = positioningUpdate2;
        }
        String floorId = positioningUpdate.getFloorId();
        if (floorId == null) {
            ELog eLog5 = (ELog) c.getD();
            String TAG5 = f25840a;
            Intrinsics.g(TAG5, "TAG");
            eLog5.w(TAG5, "sendEventTag: floorId is null in last position", MapsKt.j(new Pair("floorOrder", positioningUpdate.getFloorOrder()), new Pair("buildingId", activeBuilding.getId())));
            str3 = null;
        } else {
            str3 = floorId;
        }
        long currentTime2 = getCurrentTime();
        String iPSClientId = IPSCore.getIPSClientId();
        Intrinsics.g(iPSClientId, "getIPSClientId(...)");
        ((EventTaggingManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(EventTaggingManager.class))).sendTag(new EventTag(currentTime2, str, iPSClientId, engineSessionId, mapId, str3, activeBuilding.getId(), str2 == null ? "" : str2, new EventTagPosition(positioningUpdate.getX(), positioningUpdate.getY(), z2.doubleValue(), positioningUpdate.getUncertainty(), positioningUpdate.getLockProgress(), positioningUpdate.getTraveledDistance()), ((OsData) DependencyInjectionKt.getDi().get(reflectionFactory.b(OsData.class))).getOsType(), eventTagType), new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.Positioning$sendEventTagImpl$1
            @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
            public void onCompleted() {
                ELog eLogAccess$getELog = Positioning.access$getELog(Positioning.INSTANCE);
                String str4 = Positioning.f25840a;
                Intrinsics.g(str4, "access$getTAG$p(...)");
                eLogAccess$getELog.api(str4, "Send event tag", new C1739v3(str, currentTime, serverTimeMillis, eventTagType));
                IPSCompletionListener iPSCompletionListener2 = iPSCompletionListener;
                if (iPSCompletionListener2 != null) {
                    iPSCompletionListener2.onCompleted();
                }
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                IPSCompletionListener iPSCompletionListener2 = iPSCompletionListener;
                if (iPSCompletionListener2 != null) {
                    iPSCompletionListener2.onError(error);
                }
            }
        });
    }
}
