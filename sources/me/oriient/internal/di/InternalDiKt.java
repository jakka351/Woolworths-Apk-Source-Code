package me.oriient.internal.di;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.locationManager.ReadOnlySystemLocationManager;
import me.oriient.internal.infra.utils.android.AndroidPermissionManager;
import me.oriient.internal.infra.utils.android.SystemPermissionChecker;
import me.oriient.internal.infra.utils.c;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter;
import me.oriient.internal.infra.utils.d;
import me.oriient.internal.infra.utils.e;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.C1209a;
import me.oriient.internal.services.auth.C1210b;
import me.oriient.internal.services.auth.C1211c;
import me.oriient.internal.services.auth.U;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.A;
import me.oriient.internal.services.dataManager.B;
import me.oriient.internal.services.dataManager.C;
import me.oriient.internal.services.dataManager.C1243c;
import me.oriient.internal.services.dataManager.C1244d;
import me.oriient.internal.services.dataManager.C1269e;
import me.oriient.internal.services.dataManager.C1270f;
import me.oriient.internal.services.dataManager.C1296g;
import me.oriient.internal.services.dataManager.C1297h;
import me.oriient.internal.services.dataManager.C1298i;
import me.oriient.internal.services.dataManager.C1299j;
import me.oriient.internal.services.dataManager.C1300k;
import me.oriient.internal.services.dataManager.C1301l;
import me.oriient.internal.services.dataManager.C1302m;
import me.oriient.internal.services.dataManager.C1328n;
import me.oriient.internal.services.dataManager.C1329o;
import me.oriient.internal.services.dataManager.C1350p;
import me.oriient.internal.services.dataManager.C1409q;
import me.oriient.internal.services.dataManager.C1410s;
import me.oriient.internal.services.dataManager.C1411t;
import me.oriient.internal.services.dataManager.C1412u;
import me.oriient.internal.services.dataManager.C1413v;
import me.oriient.internal.services.dataManager.C1414w;
import me.oriient.internal.services.dataManager.C1415x;
import me.oriient.internal.services.dataManager.C1416y;
import me.oriient.internal.services.dataManager.C1417z;
import me.oriient.internal.services.dataManager.D;
import me.oriient.internal.services.dataManager.E;
import me.oriient.internal.services.dataManager.F;
import me.oriient.internal.services.dataManager.J;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.building.w;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.f;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImagesProvider;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.dataManager.floorMetadata.InterfaceC1288s;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import me.oriient.internal.services.dataManager.linesOfInterest.LinesOfInterestRepository;
import me.oriient.internal.services.dataManager.mapGrid.C1305c;
import me.oriient.internal.services.dataManager.mapGrid.InterfaceC1306d;
import me.oriient.internal.services.dataManager.mapGrid.MapGridPriorityLoader;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRepository;
import me.oriient.internal.services.dataManager.mapGrid.W;
import me.oriient.internal.services.dataManager.obstacles.C1332c;
import me.oriient.internal.services.dataManager.obstacles.InterfaceC1333d;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesPriorityLoader;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;
import me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderRepository;
import me.oriient.internal.services.dataManager.plai.InterfaceC1351a;
import me.oriient.internal.services.dataManager.plai.PlaiRepository;
import me.oriient.internal.services.dataManager.plai.T;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository;
import me.oriient.internal.services.dataManager.r;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.internal.services.dataManager.region.RegionRest;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.internal.services.geofence.GeofenceIntersectionCalculator;
import me.oriient.internal.services.geofence.x;
import me.oriient.internal.services.geofence.y;
import me.oriient.internal.services.sensorsManager.G;
import me.oriient.internal.services.sensorsManager.H;
import me.oriient.internal.services.sensorsManager.I;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor;
import me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0006\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0080\b¢\u0006\u0002\u0010\t\u001a&\u0010\u0006\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0080\b¢\u0006\u0002\u0010\f\u001a!\u0010\r\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0002\b\u0011H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0016\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0080\b\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0016\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0016\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0080\b\u001a4\u0010\u0018\u001a\u00020\u000e\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\b\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00070\u001aH\u0080\bø\u0001\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"di", "Lme/oriient/internal/infra/di/DependencyInjection;", "getDi", "()Lme/oriient/internal/infra/di/DependencyInjection;", "setDi", "(Lme/oriient/internal/infra/di/DependencyInjection;)V", "get", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/utils/core/DiProvidable;", "()Lme/oriient/internal/infra/utils/core/DiProvidable;", "named", "", "(Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "initializeDiTest", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "initializeInternalDi", "diBase", "restServiceName", "inject", "Lkotlin/Lazy;", "injectOrNull", "registerSingleton", "creator", "Lkotlin/Function0;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InternalDiKt {
    public static DependencyInjection di;

    public static final <T extends DiProvidable> T get(String str) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static DiProvidable get$default(String str, int i, Object obj) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @NotNull
    public static final DependencyInjection getDi() {
        DependencyInjection dependencyInjection = di;
        if (dependencyInjection != null) {
            return dependencyInjection;
        }
        Intrinsics.p("di");
        throw null;
    }

    public static final void initializeDiTest(@NotNull Function1<? super DependencyInjection, Unit> block) {
        Intrinsics.h(block, "block");
        setDi(new DependencyInjectionImpl(null, false, 3, 0 == true ? 1 : 0));
        block.invoke(getDi());
    }

    @Keep
    public static final void initializeInternalDi(@NotNull DependencyInjection diBase, @Nullable String str) {
        Intrinsics.h(diBase, "diBase");
        if (di != null) {
            return;
        }
        setDi(diBase);
        a aVar = a.f24919a;
        DependencyInjection di2 = getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        di2.registerSingleton(reflectionFactory.b(DataUploaderItemsStorage.class), null, aVar);
        getDi().registerSingleton(reflectionFactory.b(DataUploadScheduler.class), null, b.f24920a);
        getDi().registerSingleton(reflectionFactory.b(FileManager.class), FileManager.FileManagerFolders.FILES.getDiKey(), me.oriient.internal.infra.utils.a.f24986a);
        getDi().registerSingleton(reflectionFactory.b(AndroidPermissionManager.class), null, me.oriient.internal.infra.utils.b.f24995a);
        getDi().registerSingleton(reflectionFactory.b(SystemPermissionChecker.class), null, c.f24996a);
        getDi().registerSingleton(reflectionFactory.b(ReadOnlySystemLocationManager.class), null, d.f25009a);
        getDi().registerSingleton(reflectionFactory.b(GlobalCoordinatesConverter.class), null, e.f25010a);
        getDi().registerSingleton(reflectionFactory.b(U.class), null, C1209a.f25023a);
        getDi().registerSingleton(reflectionFactory.b(AuthManager.class), null, C1210b.f25024a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.auth.rest.a.class), null, C1211c.f25025a);
        getDi().registerSingleton(reflectionFactory.b(InternalConfigManager.class), null, me.oriient.internal.services.config.b.f25064a);
        getDi().registerSingleton(reflectionFactory.b(SensorFreezeMonitor.class), null, G.f25554a);
        getDi().registerSingleton(reflectionFactory.b(SensorIssuesELogSender.class), null, H.f25555a);
        getDi().registerSingleton(reflectionFactory.b(SensorIssuesMonitor.class), null, I.f25556a);
        Lazy lazy = J.f25075a;
        getDi().registerSingleton(reflectionFactory.b(RestHelper.class), null, C1302m.f25191a);
        getDi().registerSingleton(reflectionFactory.b(w.class), null, C1415x.f25420a);
        getDi().registerSingleton(reflectionFactory.b(BuildingRepository.class), null, C1417z.f25422a);
        getDi().registerSingleton(reflectionFactory.b(ObstaclesPolygonsFinderRepository.class), null, A.f25066a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.floorTransitions.e.class), null, B.f25067a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1288s.class), null, C.f25068a);
        getDi().registerSingleton(reflectionFactory.b(FloorTransitionsRepository.class), null, D.f25069a);
        getDi().registerSingleton(reflectionFactory.b(FloorMetadataRepository.class), null, E.f25070a);
        getDi().registerSingleton(reflectionFactory.b(FloorImagesProvider.class), null, F.f25071a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1333d.class), null, C1243c.f25128a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.obstacles.I.class), null, C1244d.f25129a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1306d.class), null, C1269e.f25131a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.mapGrid.H.class), null, C1270f.f25132a);
        C1305c c1305c = new C1305c();
        getDi().registerSingleton(reflectionFactory.b(MapGridPriorityLoader.class), null, new C1296g(c1305c));
        getDi().registerSingleton(reflectionFactory.b(MapGridRepository.class), null, new C1297h(c1305c));
        C1332c c1332c = new C1332c();
        getDi().registerSingleton(reflectionFactory.b(ObstaclesPriorityLoader.class), null, new C1298i(c1332c));
        getDi().registerSingleton(reflectionFactory.b(ObstaclesRepository.class), null, new C1299j(c1332c));
        getDi().registerSingleton(reflectionFactory.b(W.class), null, C1300k.f25183a);
        getDi().registerSingleton(reflectionFactory.b(RegionRepository.class), null, C1301l.f25184a);
        getDi().registerSingleton(reflectionFactory.b(RegionRest.class), null, C1328n.f25229a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.linesOfInterest.e.class), null, C1329o.f25230a);
        getDi().registerSingleton(reflectionFactory.b(LinesOfInterestRepository.class), null, C1350p.f25273a);
        getDi().registerSingleton(reflectionFactory.b(f.class), null, C1409q.f25390a);
        getDi().registerSingleton(reflectionFactory.b(BuildingCoordinateConverterRepository.class), null, r.f25391a);
        getDi().registerSingleton(reflectionFactory.b(T.class), null, C1410s.f25412a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.plaiCategories.T.class), null, C1411t.f25413a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.internal.services.dataManager.plaiCategories.E.class), null, C1412u.f25414a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1351a.class), null, C1413v.f25418a);
        getDi().registerSingleton(reflectionFactory.b(PlaiCategoriesRepository.class), null, C1414w.f25419a);
        getDi().registerSingleton(reflectionFactory.b(PlaiRepository.class), null, C1416y.f25421a);
        getDi().registerSingleton(reflectionFactory.b(x.class), null, me.oriient.internal.services.geofence.di.a.f25480a);
        getDi().registerSingleton(reflectionFactory.b(y.class), null, me.oriient.internal.services.geofence.di.b.f25481a);
        getDi().registerSingleton(reflectionFactory.b(GeofenceIntersectionCalculator.class), null, me.oriient.internal.services.geofence.di.c.f25482a);
    }

    public static /* synthetic */ void initializeInternalDi$default(DependencyInjection dependencyInjection, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        initializeInternalDi(dependencyInjection, str);
    }

    public static final <T extends DiProvidable> Lazy<T> inject() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static final <T extends DiProvidable> Lazy<T> injectOrNull() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static final <T extends DiProvidable> void registerSingleton(String str, Function0<? extends T> creator) {
        Intrinsics.h(creator, "creator");
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static void registerSingleton$default(String str, Function0 creator, int i, Object obj) {
        Intrinsics.h(creator, "creator");
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static final void setDi(@NotNull DependencyInjection dependencyInjection) {
        Intrinsics.h(dependencyInjection, "<set-?>");
        di = dependencyInjection;
    }

    public static final <T extends DiProvidable> T get() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static final <T extends DiProvidable> Lazy<T> inject(String named) {
        Intrinsics.h(named, "named");
        getDi();
        Intrinsics.o();
        throw null;
    }
}
