package me.oriient.ipssdk.common.services.geofencing;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinateKt;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.GeofenceIntersectionCalculator;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ofs.e0;
import me.oriient.ipssdk.common.ofs.f0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R,\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProviderImpl;", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProvider;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "d", "Lkotlinx/coroutines/flow/StateFlow;", "getGeofenceStatuses", "()Lkotlinx/coroutines/flow/StateFlow;", "geofenceStatuses", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LiveGeofenceStatusesProviderImpl implements LiveGeofenceStatusesProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25779a;
    private final Lazy b;
    private final Lazy c;

    /* renamed from: d, reason: from kotlin metadata */
    private final StateFlow geofenceStatuses;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProviderImpl$Companion;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProvider;", "newInstance", "(Lkotlinx/coroutines/CoroutineScope;)Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStatusesProvider;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final LiveGeofenceStatusesProvider newInstance(@NotNull CoroutineScope coroutineScope) {
            Intrinsics.h(coroutineScope, "coroutineScope");
            return new LiveGeofenceStatusesProviderImpl(coroutineScope);
        }
    }

    public LiveGeofenceStatusesProviderImpl(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(coroutineScope, "coroutineScope");
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25779a = di.inject(reflectionFactory.b(RemoteConfigManager.class));
        Lazy lazyInject = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(GeofenceIntersectionCalculator.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(((BuildingGeofenceManager) lazyInject.getD()).getPolygonalStatus(), ((BuildingGeofenceManager) lazyInject.getD()).getCircularStatus(), new e0(this, null));
        final f0 f0Var = new f0(this, null);
        this.geofenceStatuses = FlowKt.O(new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.d = NullSurrogateKt.f24716a;
                Object objCollect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1L.collect(new FlowKt__TransformKt$runningReduce$1$1(objectRef, f0Var, flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, coroutineScope, SharingStarted.Companion.a(1), EmptyMap.d);
    }

    public static final Map access$combineGeofences(LiveGeofenceStatusesProviderImpl liveGeofenceStatusesProviderImpl, Map map, Map map2) {
        liveGeofenceStatusesProviderImpl.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((GeofenceBuilding) entry.getKey()).hasPositioningFeature()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (!linkedHashMap.isEmpty()) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c(((Map.Entry) it.next()).getKey(), entry2.getKey())) {
                        break;
                    }
                }
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.h(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            GeofenceBuilding geofenceBuilding = (GeofenceBuilding) entry3.getKey();
            BuildingGeofenceStatus outside = (BuildingGeofenceStatus) entry3.getValue();
            WorldCoordinate geofenceOrigin = geofenceBuilding.getGeofenceOrigin();
            double geofenceRadiusMeters = geofenceBuilding.getGeofenceRadiusMeters();
            if (outside instanceof BuildingGeofenceStatus.Inside) {
                SystemLocation location = ((BuildingGeofenceStatus.Inside) outside).getLocation();
                if (((GeofenceIntersectionCalculator) liveGeofenceStatusesProviderImpl.b.getD()).calculateIntersectionPercentage(geofenceOrigin, WorldCoordinateKt.toWorldCoordinate(location), geofenceRadiusMeters, location.getHorizontalAccuracy()) <= ((RemoteConfig) ((RemoteConfigManager) liveGeofenceStatusesProviderImpl.f25779a.getD()).getConfig().getValue()).getRealTime().getGeofence().getAdditionalPercentageToEnterGeofence()) {
                    outside = new BuildingGeofenceStatus.Outside(outside.getSinceTimestampMillis(), location);
                }
            }
            linkedHashMap3.put(key, outside);
        }
        return MapsKt.m(linkedHashMap, linkedHashMap3);
    }

    public static final BuildingGeofenceStatus access$correctStatusTimestamp(LiveGeofenceStatusesProviderImpl liveGeofenceStatusesProviderImpl, Map map, Map.Entry entry) {
        liveGeofenceStatusesProviderImpl.getClass();
        GeofenceBuilding geofenceBuilding = (GeofenceBuilding) entry.getKey();
        BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) entry.getValue();
        BuildingGeofenceStatus buildingGeofenceStatus2 = (BuildingGeofenceStatus) map.get(geofenceBuilding);
        return (buildingGeofenceStatus2 == null || !buildingGeofenceStatus2.isSameStatus(buildingGeofenceStatus)) ? buildingGeofenceStatus.withNewTimestamp(((TimeProvider) liveGeofenceStatusesProviderImpl.c.getD()).getCurrentTimeMillis()) : buildingGeofenceStatus.withNewTimestamp(buildingGeofenceStatus2.getSinceTimestampMillis());
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStatusesProvider
    @NotNull
    public StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getGeofenceStatuses() {
        return this.geofenceStatuses;
    }
}
