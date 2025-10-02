package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import me.oriient.internal.services.dataManager.plai.PlaiRepository;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.ips.IPSDataStatusListener;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import me.oriient.ipssdk.realtime.ofs.C1668j1;
import me.oriient.ipssdk.realtime.ofs.C1680l1;
import me.oriient.ipssdk.realtime.ofs.C1692n1;
import me.oriient.ipssdk.realtime.ofs.C1704p1;
import me.oriient.ipssdk.realtime.ofs.C1710q1;
import me.oriient.ipssdk.realtime.ofs.C1715r1;
import me.oriient.ipssdk.realtime.ofs.C1721s1;
import me.oriient.ipssdk.realtime.ofs.C1727t1;
import me.oriient.ipssdk.realtime.ofs.C1732u1;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/DataManager;", "", "", "buildingId", "Lme/oriient/ipssdk/ips/IPSDataStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "getDataStatus", "(Ljava/lang/String;Lme/oriient/ipssdk/ips/IPSDataStatusListener;)V", "prepareData", "(Ljava/lang/String;)V", "cancelDataPreparation", "cancelAllBuildingsDataPreparation", "()V", "clearData", "Lme/oriient/ipssdk/ips/IPSDataStatusObserver;", "observer", "addDataStatusObserver", "(Lme/oriient/ipssdk/ips/IPSDataStatusObserver;)V", "removeDataStatusObserver", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DataManager {

    @NotNull
    public static final DataManager INSTANCE = new DataManager();

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f25825a = new ArrayList();
    private static final CoroutineScope b;
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataPreloadingManager.PreloadingStatus.values().length];
            try {
                iArr[DataPreloadingManager.PreloadingStatus.NOT_PRELOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataPreloadingManager.PreloadingStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataPreloadingManager.PreloadingStatus.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        ContextScope contextScopeA = CoroutineScopeKt.a(((CoroutineContextProvider) di.get(reflectionFactory.b(CoroutineContextProvider.class))).newSingleThreadCoroutineContext());
        b = contextScopeA;
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Logger.class));
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(DataPreloadingManager.class));
        e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(FloorTransitionsRepository.class));
        h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(NavigationManager.class));
        i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RegionRepository.class));
        j = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        k = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        l = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        m = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PlaiRepository.class));
        BuildersKt.c(contextScopeA, null, null, new C1668j1(null), 3);
        BuildersKt.c(contextScopeA, null, null, new C1680l1(null), 3);
        BuildersKt.c(contextScopeA, null, null, new C1692n1(null), 3);
        BuildersKt.c(contextScopeA, null, null, new C1704p1(null), 3);
    }

    private DataManager() {
    }

    public static final AuthManager access$getAuthManager(DataManager dataManager) {
        dataManager.getClass();
        return (AuthManager) k.getD();
    }

    public static final BuildingGeofenceManager access$getBuildingGeofenceManager(DataManager dataManager) {
        dataManager.getClass();
        return (BuildingGeofenceManager) l.getD();
    }

    public static final BuildingRepository access$getBuildingRepository(DataManager dataManager) {
        dataManager.getClass();
        return (BuildingRepository) e.getD();
    }

    public static final DataPreloadingManager access$getDataPreloadingManager(DataManager dataManager) {
        dataManager.getClass();
        return (DataPreloadingManager) d.getD();
    }

    public static final SupportPositioningEngineManager access$getEngineManager(DataManager dataManager) {
        dataManager.getClass();
        return (SupportPositioningEngineManager) f.getD();
    }

    public static final FloorTransitionsRepository access$getFloorTransitionsRepository(DataManager dataManager) {
        dataManager.getClass();
        return (FloorTransitionsRepository) g.getD();
    }

    public static final Logger access$getLogger(DataManager dataManager) {
        dataManager.getClass();
        return (Logger) c.getD();
    }

    public static final NavigationManager access$getNavigationManager(DataManager dataManager) {
        dataManager.getClass();
        return (NavigationManager) h.getD();
    }

    public static final PlaiRepository access$getPlaiRepository(DataManager dataManager) {
        dataManager.getClass();
        return (PlaiRepository) m.getD();
    }

    public static final RegionRepository access$getRegionRepository(DataManager dataManager) {
        dataManager.getClass();
        return (RegionRepository) i.getD();
    }

    public static final RemoteConfigManager access$getRemoteConfigManager(DataManager dataManager) {
        dataManager.getClass();
        return (RemoteConfigManager) j.getD();
    }

    public static final int access$toDataStatus(DataManager dataManager, DataPreloadingManager.PreloadingStatus preloadingStatus) {
        dataManager.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[preloadingStatus.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void addDataStatusObserver(@NotNull IPSDataStatusObserver observer) {
        Intrinsics.h(observer, "observer");
        ((Logger) c.getD()).d("DataManager", "addDataStatusObserver() called with: observer = " + observer);
        BuildersKt.c(b, null, null, new C1710q1(observer, null), 3);
    }

    public final void cancelAllBuildingsDataPreparation() {
        ((Logger) c.getD()).d("DataManager", "cancelAllBuildingsDataPreparation() called");
        if (CoreLogic.INSTANCE.getUser() == null) {
            return;
        }
        ((DataPreloadingManager) d.getD()).cancelAllPreloadingProcesses();
    }

    public final void cancelDataPreparation(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        ((Logger) c.getD()).d("DataManager", "cancelDataPreparation() called with: buildingId = ".concat(buildingId));
        if (CoreLogic.INSTANCE.getUser() == null) {
            return;
        }
        ((DataPreloadingManager) d.getD()).cancelPreloading(buildingId);
    }

    public final void clearData(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        ((Logger) c.getD()).d("DataManager", "clearData() called with: buildingId = ".concat(buildingId));
        if (CoreLogic.INSTANCE.getUser() == null) {
            return;
        }
        BuildersKt.c(b, null, null, new C1715r1(buildingId, null), 3);
    }

    public final void getDataStatus(@NotNull String buildingId, @NotNull IPSDataStatusListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        ((Logger) c.getD()).d("DataManager", "getDataStatus() called with: buildingId = " + buildingId + ", listener = " + listener);
        BuildersKt.c(b, null, null, new C1721s1(listener, buildingId, null), 3);
    }

    public final void prepareData(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        ((Logger) c.getD()).d("DataManager", "prepareData() called with: buildingId = ".concat(buildingId));
        BuildersKt.c(b, null, null, new C1727t1(buildingId, null), 3);
    }

    public final void removeDataStatusObserver(@NotNull IPSDataStatusObserver observer) {
        Intrinsics.h(observer, "observer");
        ((Logger) c.getD()).d("DataManager", "removeDataStatusObserver() called with: observer = " + observer);
        BuildersKt.c(b, null, null, new C1732u1(observer, null), 3);
    }
}
