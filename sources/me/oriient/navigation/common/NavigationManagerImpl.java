package me.oriient.navigation.common;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;
import me.oriient.internal.services.dataModel.navigation.NavigationMetrics;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.util.NavigationError;
import me.oriient.navigation.ondevice.navgraph.NavGraphRepository;
import me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:\u0002£\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J&\u0010\u0014\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ8\u0010%\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b(\u0010\u001bJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b*\u0010+J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0.2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b0\u00101J<\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020/0.2\u0006\u0010-\u001a\u00020,2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b7\u00101J\u0018\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b<\u00106J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AR \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010G\u001a\b\u0012\u0004\u0012\u00020/0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010K\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010K\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010K\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010K\u001a\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001f\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0081\u0001R \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010K\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010K\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R5\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t2\r\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0005\b\u0099\u0001\u0010\rR-\u0010\u009e\u0001\u001a\u0004\u0018\u00010\n2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0005\b\u009d\u0001\u0010\u0010R)\u0010\u009f\u0001\u001a\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0005\b¡\u0001\u0010\b¨\u0006¤\u0001"}, d2 = {"Lme/oriient/navigation/common/NavigationManagerImpl;", "Lme/oriient/navigation/common/NavigationManager;", "<init>", "()V", "", "enabled", "", "onLiveNavigationEnabledToggle", "(Z)V", "", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "newWaypoints", "onNewLiveNavigationWaypoints", "(Ljava/util/List;)V", "newFinalWaypoint", "onNewLiveNavigationFinalWaypoint", "(Lme/oriient/navigation/common/models/NavigationWaypoint;)V", "updateWaypointsCounter", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", MlModel.MODEL_FILE_SUFFIX, "tryToUpdateRouteLocally", "(Ljava/util/List;Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/navigation/common/models/Route;", "route", "Lme/oriient/navigation/common/models/NavigationPosition;", "userPosition", "setNewRoute", "(Lme/oriient/navigation/common/models/Route;Lme/oriient/navigation/common/models/NavigationPosition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "position", "updateRoute", "(Lme/oriient/navigation/common/models/NavigationPosition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recalculate", "Lme/oriient/navigation/common/y;", "core", "", "waypointsWithUser", "finalWaypoint", "calculateRouteImpl", "(Lme/oriient/navigation/common/y;Lme/oriient/navigation/common/models/NavigationPosition;Ljava/util/List;Lme/oriient/navigation/common/models/NavigationWaypoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recalculationPosition", "handleLoadedRoute", "cancelCurrentRequest", "onNewConfig", "(Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "buildingId", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/navigation/common/util/NavigationError;", "preloadNavigationData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waypoints", "findRouteInBuilding", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/navigation/common/models/NavigationWaypoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanCore", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBuildingCache", "", "exceptLastDays", "clearExpiredData", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllCaches", "getConfiguration", "()Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "Lme/oriient/internal/services/dataModel/navigation/NavigationMetrics;", "getMetrics", "()Lme/oriient/internal/services/dataModel/navigation/NavigationMetrics;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "liveNavigationRouteUpdates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getLiveNavigationRouteUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "liveNavigationErrors", "getLiveNavigationErrors", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/navigation/common/NavigationPositionProvider;", "positionProvider$delegate", "getPositionProvider", "()Lme/oriient/navigation/common/NavigationPositionProvider;", "positionProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/navigation/common/w;", "navigationConfigManager$delegate", "getNavigationConfigManager", "()Lme/oriient/navigation/common/w;", "navigationConfigManager", "Lme/oriient/navigation/common/z;", "navigationCoreFactory$delegate", "getNavigationCoreFactory", "()Lme/oriient/navigation/common/z;", "navigationCoreFactory", "Lme/oriient/navigation/common/u0;", "waypointValidator$delegate", "getWaypointValidator", "()Lme/oriient/navigation/common/u0;", "waypointValidator", "Lme/oriient/navigation/common/q0;", "tailTrimmer$delegate", "getTailTrimmer", "()Lme/oriient/navigation/common/q0;", "tailTrimmer", "Lme/oriient/navigation/ondevice/navgraph/NavGraphRepository;", "navGraphRepository$delegate", "getNavGraphRepository", "()Lme/oriient/navigation/ondevice/navgraph/NavGraphRepository;", "navGraphRepository", "Lme/oriient/navigation/turnByTurn/TurnByTurnNavigationManager;", "turnByTurnNavigationManager$delegate", "getTurnByTurnNavigationManager", "()Lme/oriient/navigation/turnByTurn/TurnByTurnNavigationManager;", "turnByTurnNavigationManager", "currentConfig", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "navigationCore", "Lme/oriient/navigation/common/y;", "_liveNavigationWaypoints", "Ljava/util/List;", "_liveFinalWaypoint", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "_isLiveNavigationEnabled", "Z", "lastRoute", "Lme/oriient/navigation/common/models/Route;", "Lkotlinx/coroutines/Job;", "currentNavigationRequest", "Lkotlinx/coroutines/Job;", "pendingPositions", "Lme/oriient/navigation/common/l0;", "metricsManager$delegate", "getMetricsManager", "()Lme/oriient/navigation/common/l0;", "metricsManager", "Lkotlinx/coroutines/CoroutineScope;", "navigationScope$delegate", "getNavigationScope", "()Lkotlinx/coroutines/CoroutineScope;", "navigationScope", "value", "getLiveNavigationWaypoints", "()Ljava/util/List;", "setLiveNavigationWaypoints", "liveNavigationWaypoints", "getLiveFinalWaypoint", "()Lme/oriient/navigation/common/models/NavigationWaypoint;", "setLiveFinalWaypoint", "liveFinalWaypoint", "isLiveNavigationEnabled", "()Z", "setLiveNavigationEnabled", "Companion", "me/oriient/navigation/common/H", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NavigationManagerImpl implements NavigationManager {

    @NotNull
    private static final H Companion = new H();

    @NotNull
    private static final String TAG = "NavigationManager";
    private boolean _isLiveNavigationEnabled;

    @Nullable
    private NavigationWaypoint _liveFinalWaypoint;

    @NotNull
    private List<NavigationWaypoint> _liveNavigationWaypoints;

    @Nullable
    private NavigationConfig currentConfig;

    @Nullable
    private Job currentNavigationRequest;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @Nullable
    private Route lastRoute;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: metricsManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metricsManager;

    /* renamed from: navGraphRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navGraphRepository;

    /* renamed from: navigationConfigManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationConfigManager;

    @Nullable
    private InterfaceC1783y navigationCore;

    /* renamed from: navigationCoreFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationCoreFactory;

    /* renamed from: navigationScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationScope;

    @NotNull
    private final List<NavigationPosition> pendingPositions;

    /* renamed from: positionProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy positionProvider;

    /* renamed from: tailTrimmer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tailTrimmer;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    /* renamed from: turnByTurnNavigationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy turnByTurnNavigationManager;

    /* renamed from: waypointValidator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy waypointValidator;

    @NotNull
    private final MutableSharedFlow<Route> liveNavigationRouteUpdates = UtilsKt.EventFlow();

    @NotNull
    private final MutableSharedFlow<NavigationError> liveNavigationErrors = UtilsKt.EventFlow();

    public NavigationManagerImpl() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.eLog = DiKt.a().inject(reflectionFactory.b(ELog.class));
        this.positionProvider = DiKt.a().inject(reflectionFactory.b(NavigationPositionProvider.class));
        this.timeProvider = DiKt.a().inject(reflectionFactory.b(TimeProvider.class));
        this.navigationConfigManager = DiKt.a().inject(reflectionFactory.b(InterfaceC1781w.class));
        this.navigationCoreFactory = DiKt.a().inject(reflectionFactory.b(InterfaceC1784z.class));
        this.waypointValidator = DiKt.a().inject(reflectionFactory.b(u0.class));
        this.tailTrimmer = DiKt.a().inject(reflectionFactory.b(q0.class));
        this.navGraphRepository = DiKt.a().inject(reflectionFactory.b(NavGraphRepository.class));
        this.turnByTurnNavigationManager = DiKt.a().inject(reflectionFactory.b(TurnByTurnNavigationManager.class));
        this._liveNavigationWaypoints = EmptyList.d;
        this._isLiveNavigationEnabled = true;
        this.pendingPositions = new ArrayList();
        this.metricsManager = DiKt.a().inject(reflectionFactory.b(l0.class));
        this.navigationScope = LazyKt.b(V.f26225a);
        BuildersKt.c(getNavigationScope(), null, null, new C(this, null), 3);
        BuildersKt.c(getNavigationScope(), null, null, new E(this, null), 3);
        BuildersKt.c(getNavigationScope(), null, null, new G(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object calculateRouteImpl(me.oriient.navigation.common.InterfaceC1783y r18, me.oriient.navigation.common.models.NavigationPosition r19, java.util.List<me.oriient.navigation.common.models.NavigationWaypoint> r20, me.oriient.navigation.common.models.NavigationWaypoint r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.calculateRouteImpl(me.oriient.navigation.common.y, me.oriient.navigation.common.models.NavigationPosition, java.util.List, me.oriient.navigation.common.models.NavigationWaypoint, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelCurrentRequest() {
        Job job = this.currentNavigationRequest;
        if (job != null) {
            getELog().d(TAG, "Cancel current live navigation request");
            job.cancel((CancellationException) null);
            this.currentNavigationRequest = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 getMetricsManager() {
        return (l0) this.metricsManager.getD();
    }

    private final NavGraphRepository getNavGraphRepository() {
        return (NavGraphRepository) this.navGraphRepository.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1781w getNavigationConfigManager() {
        return (InterfaceC1781w) this.navigationConfigManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1784z getNavigationCoreFactory() {
        return (InterfaceC1784z) this.navigationCoreFactory.getD();
    }

    private final CoroutineScope getNavigationScope() {
        return (CoroutineScope) this.navigationScope.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationPositionProvider getPositionProvider() {
        return (NavigationPositionProvider) this.positionProvider.getD();
    }

    private final q0 getTailTrimmer() {
        return (q0) this.tailTrimmer.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final TurnByTurnNavigationManager getTurnByTurnNavigationManager() {
        return (TurnByTurnNavigationManager) this.turnByTurnNavigationManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 getWaypointValidator() {
        return (u0) this.waypointValidator.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object handleLoadedRoute(Route route, NavigationPosition navigationPosition, Continuation<? super Unit> continuation) {
        NavigationPosition currentPosition = getPositionProvider().getCurrentPosition();
        Unit unit = Unit.f24250a;
        if (currentPosition == null || !Intrinsics.c(navigationPosition.getBuildingId(), currentPosition.getBuildingId())) {
            return unit;
        }
        this.pendingPositions.add(currentPosition);
        q0 tailTrimmer = getTailTrimmer();
        List<NavigationPosition> pendingPositions = this.pendingPositions;
        s0 s0Var = (s0) tailTrimmer;
        s0Var.getClass();
        Intrinsics.h(route, "route");
        Intrinsics.h(pendingPositions, "pendingPositions");
        Route routeDeepCopy = route.deepCopy();
        NavigationConfig navigationConfig = (NavigationConfig) ((C1782x) ((InterfaceC1781w) s0Var.c.getD())).f26270a.getValue();
        routeDeepCopy.removeTail$service_navigation_publishRelease(1);
        if (navigationConfig.getShouldUseTailTrimming()) {
            Iterator<T> it = pendingPositions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NavigationPosition navigationPosition2 = navigationPosition;
                Pair pairA = s0Var.a(navigationConfig, navigationPosition2, routeDeepCopy, pendingPositions, (NavigationPosition) it.next(), false);
                Object obj = pairA.d;
                if (!((Boolean) pairA.e).booleanValue()) {
                    routeDeepCopy = obj;
                    break;
                }
                routeDeepCopy = obj;
                navigationPosition = navigationPosition2;
            }
            routeDeepCopy = routeDeepCopy;
        }
        Object newRoute = setNewRoute(routeDeepCopy, currentPosition, continuation);
        return newRoute == CoroutineSingletons.d ? newRoute : unit;
    }

    private final void onLiveNavigationEnabledToggle(boolean enabled) {
        BuildersKt.c(getNavigationScope(), null, null, new X(this, enabled, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewLiveNavigationFinalWaypoint(NavigationWaypoint newFinalWaypoint) {
        BuildersKt.c(getNavigationScope(), null, null, new b0(newFinalWaypoint, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewLiveNavigationWaypoints(List<NavigationWaypoint> newWaypoints) {
        BuildersKt.c(getNavigationScope(), null, null, new e0(this, newWaypoints, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recalculate(NavigationPosition navigationPosition, Continuation<? super Unit> continuation) {
        InterfaceC1783y interfaceC1783y = this.navigationCore;
        Unit unit = Unit.f24250a;
        if (interfaceC1783y == null) {
            this.lastRoute = null;
            Object objEmit = getLiveNavigationErrors().emit(new NavigationError.InternalError("Navigation service is not ready"), continuation);
            if (objEmit == CoroutineSingletons.d) {
                return objEmit;
            }
        } else {
            Job job = this.currentNavigationRequest;
            if (job != null && job.isActive()) {
                this.pendingPositions.add(navigationPosition);
                return unit;
            }
            this.currentNavigationRequest = null;
            Outcome outcomeA = ((v0) getWaypointValidator()).a(this._liveNavigationWaypoints, navigationPosition.getBuildingId(), (NavigationBuilding) getPositionProvider().getCurrentBuilding().getValue());
            if (outcomeA instanceof Outcome.Success) {
                ArrayList arrayListJ0 = CollectionsKt.J0((List) ((Outcome.Success) outcomeA).getValue());
                arrayListJ0.add(0, new NavigationWaypoint(NavigationWaypoint.USER_ID, navigationPosition.getBuildingId(), navigationPosition.getFloorOrder(), navigationPosition.getCoordinate()));
                this.currentNavigationRequest = BuildersKt.c(getNavigationScope(), null, null, new g0(this, interfaceC1783y, navigationPosition, arrayListJ0, null), 3);
                return unit;
            }
            if (!(outcomeA instanceof Outcome.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            getELog().e(TAG, "Invalid live navigation waypoints", new h0(outcomeA));
            this.lastRoute = null;
            Object objEmit2 = getLiveNavigationErrors().emit(((Outcome.Failure) outcomeA).getValue(), continuation);
            if (objEmit2 == CoroutineSingletons.d) {
                return objEmit2;
            }
        }
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setNewRoute(me.oriient.navigation.common.models.Route r6, me.oriient.navigation.common.models.NavigationPosition r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.oriient.navigation.common.i0
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.navigation.common.i0 r0 = (me.oriient.navigation.common.i0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.navigation.common.i0 r0 = new me.oriient.navigation.common.i0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            me.oriient.navigation.common.models.NavigationPosition r7 = r0.c
            me.oriient.navigation.common.models.Route r6 = r0.b
            me.oriient.navigation.common.NavigationManagerImpl r0 = r0.f26246a
            kotlin.ResultKt.b(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.elog.ELog r8 = r5.getELog()
            java.lang.String r2 = "NavigationManager"
            java.lang.String r4 = "Set new route"
            r8.d(r2, r4)
            me.oriient.navigation.common.models.Route r8 = r6.deepCopy()
            r5.lastRoute = r8
            kotlinx.coroutines.flow.MutableSharedFlow r2 = r5.getLiveNavigationRouteUpdates()
            r0.f26246a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager r8 = r0.getTurnByTurnNavigationManager()
            r8.onRouteUpdate(r6, r7)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.setNewRoute(me.oriient.navigation.common.models.Route, me.oriient.navigation.common.models.NavigationPosition, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        if (updateRoute$default(r12, null, r0, 1, null) == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tryToUpdateRouteLocally(java.util.List<me.oriient.navigation.common.models.NavigationWaypoint> r12, me.oriient.internal.services.dataModel.navigation.NavigationConfig r13, kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.tryToUpdateRouteLocally(java.util.List, me.oriient.internal.services.dataModel.navigation.NavigationConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateRoute(me.oriient.navigation.common.models.NavigationPosition r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.updateRoute(me.oriient.navigation.common.models.NavigationPosition, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object updateRoute$default(NavigationManagerImpl navigationManagerImpl, NavigationPosition navigationPosition, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationPosition = null;
        }
        return navigationManagerImpl.updateRoute(navigationPosition, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWaypointsCounter() {
        l0 metricsManager = getMetricsManager();
        int size = this._liveNavigationWaypoints.size() + (this._liveFinalWaypoint != null ? 1 : 0);
        m0 m0Var = (m0) metricsManager;
        me.oriient.navigation.common.models.d dVar = m0Var.f26253a;
        dVar.f26255a = Math.max(size, dVar.f26255a);
        m0Var.f26253a.c++;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    public Object cleanCore(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getNavigationScope().getE(), new L(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.navigation.common.NavigationManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearAllCaches(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof me.oriient.navigation.common.M
            if (r0 == 0) goto L13
            r0 = r5
            me.oriient.navigation.common.M r0 = (me.oriient.navigation.common.M) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.navigation.common.M r0 = new me.oriient.navigation.common.M
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.navigation.common.NavigationManagerImpl r0 = r0.f26217a
            kotlin.ResultKt.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            me.oriient.navigation.ondevice.navgraph.NavGraphRepository r5 = r4.getNavGraphRepository()
            r0.f26217a = r4
            r0.d = r3
            java.lang.Object r5 = r5.cleanData(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            me.oriient.navigation.common.y r5 = r0.navigationCore
            if (r5 == 0) goto L4d
            me.oriient.navigation.ondevice.J r5 = (me.oriient.navigation.ondevice.J) r5
            r0 = 0
            r5.e = r0
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.clearAllCaches(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.navigation.common.NavigationManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object clearBuildingCache(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.navigation.common.N
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.navigation.common.N r0 = (me.oriient.navigation.common.N) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.navigation.common.N r0 = new me.oriient.navigation.common.N
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.navigation.common.NavigationManagerImpl r5 = r0.f26218a
            kotlin.ResultKt.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            me.oriient.navigation.ondevice.navgraph.NavGraphRepository r6 = r4.getNavGraphRepository()
            r0.f26218a = r4
            r0.d = r3
            java.lang.Object r5 = r6.cleanData(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            me.oriient.navigation.common.y r5 = r5.navigationCore
            if (r5 == 0) goto L4d
            me.oriient.navigation.ondevice.J r5 = (me.oriient.navigation.ondevice.J) r5
            r6 = 0
            r5.e = r6
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.NavigationManagerImpl.clearBuildingCache(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    public Object clearExpiredData(double d, @NotNull Continuation<? super Unit> continuation) {
        Object objCleanExpiredData = getNavGraphRepository().cleanExpiredData(d, continuation);
        return objCleanExpiredData == CoroutineSingletons.d ? objCleanExpiredData : Unit.f24250a;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    public Object findRouteInBuilding(@NotNull String str, @NotNull List<NavigationWaypoint> list, @Nullable NavigationWaypoint navigationWaypoint, @NotNull Continuation<? super Outcome<Route, NavigationError>> continuation) {
        return BuildersKt.f(getNavigationScope().getE(), new U(this, str, list, navigationWaypoint, null), continuation);
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetadataProvider
    @NotNull
    public NavigationConfig getConfiguration() {
        NavigationConfig navigationConfig = this.currentConfig;
        return navigationConfig == null ? (NavigationConfig) ((C1782x) getNavigationConfigManager()).f26270a.getValue() : navigationConfig;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    /* renamed from: getLiveFinalWaypoint, reason: from getter */
    public NavigationWaypoint get_liveFinalWaypoint() {
        return this._liveFinalWaypoint;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @NotNull
    public List<NavigationWaypoint> getLiveNavigationWaypoints() {
        return this._liveNavigationWaypoints;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetadataProvider
    @NotNull
    public NavigationMetrics getMetrics() {
        me.oriient.navigation.common.models.d dVar = ((m0) getMetricsManager()).f26253a;
        return new me.oriient.navigation.common.models.d(dVar.f26255a, dVar.b, dVar.c, dVar.d, dVar.e);
    }

    @Override // me.oriient.navigation.common.NavigationManager
    /* renamed from: isLiveNavigationEnabled, reason: from getter */
    public boolean get_isLiveNavigationEnabled() {
        return this._isLiveNavigationEnabled;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    public Object onNewConfig(@NotNull NavigationConfig navigationConfig, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getNavigationScope().getE(), new Z(this, navigationConfig, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @Nullable
    public Object preloadNavigationData(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, NavigationError>> continuation) {
        return BuildersKt.f(getNavigationScope().getE(), new f0(this, str, null), continuation);
    }

    @Override // me.oriient.navigation.common.NavigationManager
    public void setLiveFinalWaypoint(@Nullable NavigationWaypoint navigationWaypoint) {
        onNewLiveNavigationFinalWaypoint(navigationWaypoint);
    }

    @Override // me.oriient.navigation.common.NavigationManager
    public void setLiveNavigationEnabled(boolean z) {
        onLiveNavigationEnabledToggle(z);
    }

    @Override // me.oriient.navigation.common.NavigationManager
    public void setLiveNavigationWaypoints(@NotNull List<NavigationWaypoint> value) {
        Intrinsics.h(value, "value");
        onNewLiveNavigationWaypoints(value);
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @NotNull
    public MutableSharedFlow<NavigationError> getLiveNavigationErrors() {
        return this.liveNavigationErrors;
    }

    @Override // me.oriient.navigation.common.NavigationManager
    @NotNull
    public MutableSharedFlow<Route> getLiveNavigationRouteUpdates() {
        return this.liveNavigationRouteUpdates;
    }
}
