package me.oriient.internal.services.geofence;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataModel.geofence.GeofenceConfig;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ \u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R,\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001c\u0010,R,\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b\u001e\u0010,R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b\u0010\u0010,R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b\u0015\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b.\u0010,R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\bN\u0010OR(\u0010S\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010W\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010T\"\u0004\bX\u0010V¨\u0006["}, d2 = {"Lme/oriient/internal/services/geofence/BuildingGeofenceManagerImpl;", "Lme/oriient/internal/services/geofence/BuildingGeofenceManager;", "<init>", "()V", "", "isCircularStrategyEnabledImpl", "()Z", "isPolygonalStrategyEnabledImpl", "isCircularGeofenceLiveUpdatesEnabledImpl", "", "enableCircleStrategyImpl", "disableCircleStrategy", "enablePolygonalStrategyImpl", "disablePolygonalStrategy", "", "requestId", "isCircularStrategyEnabled", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "enableCircularStrategy", "(ZLjava/lang/String;)V", "isPolygonalStrategyEnabled", "enablePolygonalStrategy", "isCircularLiveGeofenceEnabled", "enableCircularLiveGeofence", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "building", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "getCircularStatus", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPolygonalStatus", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "location", "getCurrentCircularStatus", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;Lme/oriient/internal/infra/locationManager/SystemLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentPolygonalStatus", "clean", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "getConfiguration", "()Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "circularStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "polygonalStatus", "isLiveCircularStrategyEnabled", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "Lkotlin/Lazy;", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/services/geofence/x;", "geofenceStrategyFactory$delegate", "getGeofenceStrategyFactory", "()Lme/oriient/internal/services/geofence/x;", "geofenceStrategyFactory", "Lme/oriient/internal/services/config/InternalConfigManager;", "configManager$delegate", "getConfigManager", "()Lme/oriient/internal/services/config/InternalConfigManager;", "configManager", "Lkotlinx/coroutines/CoroutineScope;", "geofenceCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "", "circularStrategyRequesters", "Ljava/util/Map;", "polygonalStrategyRequesters", "circularLiveUpdateRequesters", "Lme/oriient/internal/services/geofence/strategy/r;", "circleGeofenceStrategy$delegate", "getCircleGeofenceStrategy", "()Lme/oriient/internal/services/geofence/strategy/r;", "circleGeofenceStrategy", "Lme/oriient/internal/services/geofence/strategy/q;", "polygonalGeofenceStrategy$delegate", "getPolygonalGeofenceStrategy", "()Lme/oriient/internal/services/geofence/strategy/q;", "polygonalGeofenceStrategy", "Lkotlinx/coroutines/Job;", "value", "circleGeofenceUpdatesJob", "Lkotlinx/coroutines/Job;", "setCircleGeofenceUpdatesJob", "(Lkotlinx/coroutines/Job;)V", "polygonalGeofenceUpdatesJob", "setPolygonalGeofenceUpdatesJob", "Companion", "me/oriient/internal/services/geofence/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BuildingGeofenceManagerImpl implements BuildingGeofenceManager {

    @NotNull
    private static final C1418a Companion = new C1418a();

    @Deprecated
    @NotNull
    public static final String TAG = "BuildingGeofenceManager";

    /* renamed from: circleGeofenceStrategy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy circleGeofenceStrategy;

    @Nullable
    private Job circleGeofenceUpdatesJob;

    @NotNull
    private final Map<String, Boolean> circularLiveUpdateRequesters;

    @NotNull
    private final Map<String, Boolean> circularStrategyRequesters;

    /* renamed from: configManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @NotNull
    private final CoroutineScope geofenceCoroutineScope;

    /* renamed from: geofenceStrategyFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy geofenceStrategyFactory;

    @NotNull
    private final MutableStateFlow<Boolean> isCircularStrategyEnabled;

    @NotNull
    private final MutableStateFlow<Boolean> isLiveCircularStrategyEnabled;

    @NotNull
    private final MutableStateFlow<Boolean> isPolygonalStrategyEnabled;

    /* renamed from: polygonalGeofenceStrategy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy polygonalGeofenceStrategy;

    @Nullable
    private Job polygonalGeofenceUpdatesJob;

    @NotNull
    private final Map<String, Boolean> polygonalStrategyRequesters;

    @NotNull
    private final MutableStateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> circularStatus = StateFlowKt.a(EmptyMap.d);

    @NotNull
    private final MutableStateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> polygonalStatus = StateFlowKt.a(EmptyMap.d);

    public BuildingGeofenceManagerImpl() {
        Boolean bool = Boolean.FALSE;
        this.isCircularStrategyEnabled = StateFlowKt.a(bool);
        this.isPolygonalStrategyEnabled = StateFlowKt.a(bool);
        this.isLiveCircularStrategyEnabled = StateFlowKt.a(bool);
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.coroutineContextProvider = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.geofenceStrategyFactory = InternalDiKt.getDi().inject(reflectionFactory.b(x.class));
        this.configManager = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.geofenceCoroutineScope = CoroutineScopeKt.a(getCoroutineContextProvider().newSingleThreadCoroutineContext());
        this.circularStrategyRequesters = new LinkedHashMap();
        this.polygonalStrategyRequesters = new LinkedHashMap();
        this.circularLiveUpdateRequesters = new LinkedHashMap();
        this.circleGeofenceStrategy = LazyKt.b(new C1419b(this));
        this.polygonalGeofenceStrategy = LazyKt.b(new r(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableCircleStrategy() {
        getCircularStatus().setValue(EmptyMap.d);
        ((me.oriient.internal.services.geofence.strategy.p) getCircleGeofenceStrategy()).b();
        setCircleGeofenceUpdatesJob(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disablePolygonalStrategy() {
        getPolygonalStatus().setValue(EmptyMap.d);
        getPolygonalGeofenceStrategy().b();
        setPolygonalGeofenceUpdatesJob(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableCircleStrategyImpl() {
        setCircleGeofenceUpdatesJob(BuildersKt.c(this.geofenceCoroutineScope, null, null, new e(this, null), 3));
        ((me.oriient.internal.services.geofence.strategy.p) getCircleGeofenceStrategy()).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enablePolygonalStrategyImpl() {
        setPolygonalGeofenceUpdatesJob(BuildersKt.c(this.geofenceCoroutineScope, null, null, new j(this, null), 3));
        getPolygonalGeofenceStrategy().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me.oriient.internal.services.geofence.strategy.r getCircleGeofenceStrategy() {
        return (me.oriient.internal.services.geofence.strategy.r) this.circleGeofenceStrategy.getD();
    }

    private final InternalConfigManager getConfigManager() {
        return (InternalConfigManager) this.configManager.getD();
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x getGeofenceStrategyFactory() {
        return (x) this.geofenceStrategyFactory.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me.oriient.internal.services.geofence.strategy.q getPolygonalGeofenceStrategy() {
        return (me.oriient.internal.services.geofence.strategy.q) this.polygonalGeofenceStrategy.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCircularGeofenceLiveUpdatesEnabledImpl() {
        Map<String, Boolean> map = this.circularLiveUpdateRequesters;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCircularStrategyEnabledImpl() {
        Map<String, Boolean> map = this.circularStrategyRequesters;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPolygonalStrategyEnabledImpl() {
        Map<String, Boolean> map = this.polygonalStrategyRequesters;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void setCircleGeofenceUpdatesJob(Job job) {
        Job job2 = this.circleGeofenceUpdatesJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.circleGeofenceUpdatesJob = job;
    }

    private final void setPolygonalGeofenceUpdatesJob(Job job) {
        Job job2 = this.polygonalGeofenceUpdatesJob;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.polygonalGeofenceUpdatesJob = job;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    public void clean() {
        BuildersKt.c(this.geofenceCoroutineScope, null, null, new C1420c(this, null), 3);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    public void enableCircularLiveGeofence(boolean enable, @NotNull String requestId) {
        Intrinsics.h(requestId, "requestId");
        BuildersKt.c(this.geofenceCoroutineScope, null, null, new f(this, requestId, enable, null), 3);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    public void enableCircularStrategy(boolean enable, @NotNull String requestId) {
        Intrinsics.h(requestId, "requestId");
        BuildersKt.c(this.geofenceCoroutineScope, null, null, new g(this, requestId, enable, null), 3);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    public void enablePolygonalStrategy(boolean enable, @NotNull String requestId) {
        Intrinsics.h(requestId, "requestId");
        BuildersKt.c(this.geofenceCoroutineScope, null, null, new h(this, requestId, enable, null), 3);
    }

    @Override // me.oriient.internal.services.dataModel.geofence.GeofenceMetadataProvider
    @NotNull
    public GeofenceConfig getConfiguration() {
        return ((InternalConfig) getConfigManager().getConfig().getValue()).getGeofenceConfig();
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object getCurrentCircularStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull SystemLocation systemLocation, @NotNull Continuation<? super BuildingGeofenceStatus> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new l(this, geofenceBuilding, systemLocation, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object getCurrentPolygonalStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull SystemLocation systemLocation, @NotNull Continuation<? super BuildingGeofenceStatus> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new m(this, geofenceBuilding, systemLocation, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object isCircularLiveGeofenceEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new o(this, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @NotNull
    public MutableStateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getCircularStatus() {
        return this.circularStatus;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @NotNull
    public MutableStateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getPolygonalStatus() {
        return this.polygonalStatus;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @NotNull
    public MutableStateFlow<Boolean> isCircularStrategyEnabled() {
        return this.isCircularStrategyEnabled;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @NotNull
    public MutableStateFlow<Boolean> isLiveCircularStrategyEnabled() {
        return this.isLiveCircularStrategyEnabled;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @NotNull
    public MutableStateFlow<Boolean> isPolygonalStrategyEnabled() {
        return this.isPolygonalStrategyEnabled;
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object getCircularStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull Continuation<? super BuildingGeofenceStatus> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new k(this, geofenceBuilding, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object getPolygonalStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull Continuation<? super BuildingGeofenceStatus> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new n(this, geofenceBuilding, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object isCircularStrategyEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new p(this, str, null), continuation);
    }

    @Override // me.oriient.internal.services.geofence.BuildingGeofenceManager
    @Nullable
    public Object isPolygonalStrategyEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.f(this.geofenceCoroutineScope.getE(), new q(this, str, null), continuation);
    }
}
