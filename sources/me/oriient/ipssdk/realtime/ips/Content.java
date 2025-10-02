package me.oriient.ipssdk.realtime.ips;

import au.com.woolworths.android.onesite.models.search.RecentSearch;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.plai.PlaiProductResult;
import me.oriient.internal.services.dataManager.plai.PlaiRecord;
import me.oriient.internal.services.dataManager.plai.PlaiRepository;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryRecord;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.internal.services.dataModel.plai.PlaiConfig;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCategoryLocationListener;
import me.oriient.ipssdk.api.listeners.IPSContentSearchListener;
import me.oriient.ipssdk.api.listeners.IPSGetByIdListener;
import me.oriient.ipssdk.api.listeners.IPSProductAndCategoriesLocationListener;
import me.oriient.ipssdk.api.listeners.IPSProductLocationResultListener;
import me.oriient.ipssdk.api.listeners.IPSRegionsListener;
import me.oriient.ipssdk.api.models.IPSBuildingLayout;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.api.models.IPSCategoryLocation;
import me.oriient.ipssdk.api.models.IPSCircularShape;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.api.models.IPSCoordinateModel;
import me.oriient.ipssdk.api.models.IPSFloorLayout;
import me.oriient.ipssdk.api.models.IPSFloorLayoutPartFindingResult;
import me.oriient.ipssdk.api.models.IPSLocationTag;
import me.oriient.ipssdk.api.models.IPSPolygonalShape;
import me.oriient.ipssdk.api.models.IPSProductLocation;
import me.oriient.ipssdk.api.models.IPSProductLocationSearchResult;
import me.oriient.ipssdk.api.models.IPSRectangularShape;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.api.models.IPSRegionPlacement;
import me.oriient.ipssdk.api.models.IPSShape;
import me.oriient.ipssdk.api.models.IPSSnapToRegionResult;
import me.oriient.ipssdk.api.models.IPSSnapToShapeResult;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.services.rest.CancellableRestRequest;
import me.oriient.ipssdk.common.utils.CancellableProcess;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import me.oriient.ipssdk.common.utils.runtimedata.CommonRuntimeDataProvider;
import me.oriient.ipssdk.ips.IPSContentSearchPage;
import me.oriient.ipssdk.realtime.ofs.E;
import me.oriient.ipssdk.realtime.ofs.F;
import me.oriient.ipssdk.realtime.ofs.G;
import me.oriient.ipssdk.realtime.ofs.H;
import me.oriient.ipssdk.realtime.ofs.I;
import me.oriient.ipssdk.realtime.services.rest.ContentRestService;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.SdkCoordinateInBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020&¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J%\u00104\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0010¢\u0006\u0004\b4\u00105J%\u00109\u001a\u0004\u0018\u0001082\u0006\u00100\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/Content;", "", "", "buildingId", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "pageSize", "Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/models/IPSCancelable;", "search", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/ipssdk/api/listeners/IPSContentSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/ips/IPSContentSearchPage;", "nextPage", "fetch", "(Lme/oriient/ipssdk/ips/IPSContentSearchPage;Lme/oriient/ipssdk/api/listeners/IPSContentSearchListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "", "ids", "Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;", "Lme/oriient/ipssdk/api/models/IPSLocationTag;", "getLocationTagsById", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/models/IPSRegion;", "getRegionsById", "categoryId", "Lme/oriient/ipssdk/api/listeners/IPSCategoryLocationListener;", "getPlaiCategoryLocation", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCategoryLocationListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "productId", "categoryIds", "Lme/oriient/ipssdk/api/listeners/IPSProductAndCategoriesLocationListener;", "getPlaiProductAndCategoriesLocation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/api/listeners/IPSProductAndCategoriesLocationListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/listeners/IPSProductLocationResultListener;", "getProductLocation", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSProductLocationResultListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "getRegions", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSGetByIdListener;)Lme/oriient/ipssdk/api/models/IPSCancelable;", "Lme/oriient/ipssdk/api/listeners/IPSRegionsListener;", "", "addBuildingRegionsListener", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSRegionsListener;)V", "removeBuildingRegionsListener", "Lme/oriient/ipssdk/base/auth/User;", "user", "onUserUpdated", "(Lme/oriient/ipssdk/base/auth/User;)V", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "coordinate", "Lme/oriient/ipssdk/api/models/IPSShape;", "shapes", "Lme/oriient/ipssdk/api/models/IPSSnapToShapeResult;", "snapToClosestShape", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Ljava/util/List;)Lme/oriient/ipssdk/api/models/IPSSnapToShapeResult;", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "regions", "Lme/oriient/ipssdk/api/models/IPSSnapToRegionResult;", "snapToClosestRegion", "(Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;Ljava/util/List;)Lme/oriient/ipssdk/api/models/IPSSnapToRegionResult;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Content {

    @NotNull
    public static final Content INSTANCE = new Content();

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f25813a;
    private static final Lazy b;
    private static final Lazy c;
    private static final Lazy d;
    private static HashMap e;
    private static final Lazy f;
    private static final Lazy g;
    private static final Lazy h;
    private static final Lazy i;

    static {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f25813a = di.inject(reflectionFactory.b(Logger.class));
        b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ContentRestService.class));
        d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RegionRepository.class));
        e = new HashMap();
        f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PlaiRepository.class));
        g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PlaiCategoriesRepository.class));
        h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        i = LazyKt.b(E.f25929a);
    }

    private Content() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [me.oriient.ipssdk.api.models.IPSCoordinate] */
    private static IPSProductLocation a(PlaiRecord plaiRecord, IPSBuildingLayout iPSBuildingLayout) {
        List<IPSFloorLayout> floors;
        Object next;
        Coordinate coordinate = new Coordinate(plaiRecord.getX(), plaiRecord.getY());
        if (iPSBuildingLayout != null && (floors = iPSBuildingLayout.getFloors()) != null) {
            Iterator it = floors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(((IPSFloorLayout) next).getFloorId(), plaiRecord.getFloorId())) {
                    break;
                }
            }
            IPSFloorLayout iPSFloorLayout = (IPSFloorLayout) next;
            if (iPSFloorLayout != null) {
                IPSFloorLayoutPartFindingResult iPSFloorLayoutPartFindingResultFindClosestPart = iPSFloorLayout.findClosestPart(coordinate);
                double distance = iPSFloorLayoutPartFindingResultFindClosestPart.getDistance();
                INSTANCE.getClass();
                Coordinate coordinate2 = distance > ((InternalConfig) ((InternalConfigManager) h.getD()).getConfig().getValue()).getPlaiConfig().getSnappingMaxDistance() ? coordinate : iPSFloorLayoutPartFindingResultFindClosestPart.getCoordinate();
                if (coordinate2 != null) {
                    coordinate = coordinate2;
                }
            }
        }
        return new IPSProductLocation(plaiRecord.getBuildingId(), plaiRecord.getFloorId(), plaiRecord.getCustomerTagId(), coordinate.getX(), coordinate.getY(), plaiRecord.getRegionIds(), plaiRecord.getRegionNames());
    }

    public static final IPSCategoryLocation access$categoryLocationFromRecord(Content content, PlaiCategoryRecord plaiCategoryRecord) {
        content.getClass();
        return new IPSCategoryLocation(plaiCategoryRecord.getBuildingId(), plaiCategoryRecord.getFloorId(), plaiCategoryRecord.getCategoryId(), plaiCategoryRecord.getCategoryName(), new IPSCoordinateModel(plaiCategoryRecord.getBottomLeftX(), plaiCategoryRecord.getBottomLeftY(), 0.0d, 4, null), new IPSCoordinateModel(plaiCategoryRecord.getTopRightX(), plaiCategoryRecord.getTopRightY(), 0.0d, 4, null));
    }

    public static final ELog access$getElog(Content content) {
        content.getClass();
        return (ELog) b.getD();
    }

    public static final PlaiCategoriesRepository access$getPlaiCategoriesRepository(Content content) {
        content.getClass();
        return (PlaiCategoriesRepository) g.getD();
    }

    public static final PlaiConfig access$getPlaiConfig(Content content) {
        content.getClass();
        return ((InternalConfig) ((InternalConfigManager) h.getD()).getConfig().getValue()).getPlaiConfig();
    }

    public static final PlaiRepository access$getPlaiRepository(Content content) {
        content.getClass();
        return (PlaiRepository) f.getD();
    }

    public static final RegionRepository access$getRegionRepository(Content content) {
        content.getClass();
        return (RegionRepository) d.getD();
    }

    public static final IPSProductLocationSearchResult access$publicPlaiResultInfo(Content content, PlaiProductResult plaiProductResult, IPSBuildingLayout iPSBuildingLayout) {
        content.getClass();
        if (plaiProductResult == null) {
            return null;
        }
        String buildingId = plaiProductResult.getBuildingId();
        String customerTagId = plaiProductResult.getCustomerTagId();
        Content content2 = INSTANCE;
        PlaiRecord primaryRecord = plaiProductResult.getPrimaryRecord();
        content2.getClass();
        IPSProductLocation iPSProductLocationA = a(primaryRecord, iPSBuildingLayout);
        List<PlaiRecord> allRecords = plaiProductResult.getAllRecords();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(allRecords, 10));
        for (PlaiRecord plaiRecord : allRecords) {
            INSTANCE.getClass();
            arrayList.add(a(plaiRecord, iPSBuildingLayout));
        }
        return new IPSProductLocationSearchResult(buildingId, customerTagId, iPSProductLocationA, arrayList);
    }

    public final void addBuildingRegionsListener(@NotNull String buildingId, @NotNull IPSRegionsListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        ((Logger) f25813a.getD()).d("Content", "addBuildingRegionsListener() called with: buildingId = [" + buildingId + "], listener = [" + listener + ']');
        Object obj = e.get(buildingId);
        Object obj2 = obj;
        if (obj == null) {
            RegionsManager regionsManager = new RegionsManager(buildingId);
            User f25787a = ((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a();
            if (f25787a != null) {
                regionsManager.setUser(f25787a);
            }
            e.put(buildingId, regionsManager);
            obj2 = regionsManager;
        }
        ((RegionsManager) obj2).addRegionsListener(listener);
    }

    @NotNull
    public final IPSCancelable fetch(@NotNull IPSContentSearchPage nextPage, @NotNull IPSContentSearchListener listener) {
        Intrinsics.h(nextPage, "nextPage");
        Intrinsics.h(listener, "listener");
        CancellableRestRequest cancellableRestRequest = new CancellableRestRequest(((ContentRestService) c.getD()).fetch(nextPage, listener));
        ((Logger) f25813a.getD()).d("Content", "fetch: returning cancellable " + cancellableRestRequest.getId() + " for searchInBuilding term " + nextPage.getSearchTerm());
        return cancellableRestRequest;
    }

    @Nullable
    public final IPSCancelable getLocationTagsById(@NotNull String buildingId, @NotNull List<String> ids, @NotNull IPSGetByIdListener<IPSLocationTag> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(ids, "ids");
        Intrinsics.h(listener, "listener");
        CommonRuntimeDataProvider commonRuntimeDataProvider = (CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class));
        User f25787a = commonRuntimeDataProvider.getF25787a();
        if (f25787a == null) {
            return null;
        }
        return new CancellableRestRequest(((ContentRestService) c.getD()).getLocationTagsById(buildingId, ids, f25787a, commonRuntimeDataProvider.getUserSessionIdJava(), listener));
    }

    @Nullable
    public final IPSCancelable getPlaiCategoryLocation(@NotNull String buildingId, @NotNull String categoryId, @NotNull IPSCategoryLocationListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(listener, "listener");
        if (((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a() == null) {
            return null;
        }
        return new CancellableProcess(BuildersKt.c((CoroutineScope) i.getD(), null, null, new F(buildingId, categoryId, listener, null), 3));
    }

    @Nullable
    public final IPSCancelable getPlaiProductAndCategoriesLocation(@NotNull String buildingId, @NotNull String productId, @NotNull List<String> categoryIds, @NotNull IPSProductAndCategoriesLocationListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(productId, "productId");
        Intrinsics.h(categoryIds, "categoryIds");
        Intrinsics.h(listener, "listener");
        if (((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a() == null) {
            return null;
        }
        return new CancellableProcess(BuildersKt.c((CoroutineScope) i.getD(), null, null, new G(buildingId, productId, listener, categoryIds, null), 3));
    }

    @Nullable
    public final IPSCancelable getProductLocation(@NotNull String buildingId, @NotNull String productId, @NotNull IPSProductLocationResultListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(productId, "productId");
        Intrinsics.h(listener, "listener");
        if (((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a() == null) {
            return null;
        }
        return new CancellableProcess(BuildersKt.c((CoroutineScope) i.getD(), null, null, new H(buildingId, productId, listener, null), 3));
    }

    @Nullable
    public final IPSCancelable getRegions(@NotNull String buildingId, @NotNull IPSGetByIdListener<IPSRegion> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        if (((CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class))).getF25787a() == null) {
            return null;
        }
        return new CancellableProcess(BuildersKt.c((CoroutineScope) i.getD(), null, null, new I(buildingId, listener, null), 3));
    }

    @Nullable
    public final IPSCancelable getRegionsById(@NotNull String buildingId, @NotNull List<String> ids, @NotNull IPSGetByIdListener<IPSRegion> listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(ids, "ids");
        Intrinsics.h(listener, "listener");
        CommonRuntimeDataProvider commonRuntimeDataProvider = (CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class));
        User f25787a = commonRuntimeDataProvider.getF25787a();
        if (f25787a == null) {
            return null;
        }
        return new CancellableRestRequest(((ContentRestService) c.getD()).getRegionsById(buildingId, ids, f25787a, commonRuntimeDataProvider.getUserSessionIdJava(), listener));
    }

    public final void onUserUpdated(@Nullable User user) {
        ((Logger) f25813a.getD()).d("Content", "onUserUpdated() called");
        HashMap map = new HashMap();
        for (String str : e.keySet()) {
            RegionsManager regionsManager = (RegionsManager) e.get(str);
            if (regionsManager != null) {
                regionsManager.teardown();
                if (user != null) {
                    RegionsManager regionsManager2 = new RegionsManager(regionsManager);
                    regionsManager2.setUser(user);
                    map.put(str, regionsManager2);
                }
            }
        }
        e = map;
    }

    public final void removeBuildingRegionsListener(@NotNull String buildingId, @NotNull IPSRegionsListener listener) {
        Unit unit;
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        Lazy lazy = f25813a;
        ((Logger) lazy.getD()).d("Content", "removeBuildingRegionsListener() called with: buildingId = [" + buildingId + "], listener = [" + listener + ']');
        RegionsManager regionsManager = (RegionsManager) e.get(buildingId);
        if (regionsManager != null) {
            regionsManager.removeRegionsListener(listener);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ((Logger) lazy.getD()).w("Content", "removeBuildingRegionsListener: no manager for map id");
        }
    }

    @Nullable
    public final IPSCancelable search(@NotNull String buildingId, @NotNull String searchTerm, int pageSize, @NotNull IPSContentSearchListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(listener, "listener");
        CommonRuntimeDataProvider commonRuntimeDataProvider = (CommonRuntimeDataProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(CommonRuntimeDataProvider.class));
        User f25787a = commonRuntimeDataProvider.getF25787a();
        if (f25787a == null) {
            return null;
        }
        CancellableRestRequest cancellableRestRequest = new CancellableRestRequest(((ContentRestService) c.getD()).search(buildingId, pageSize, searchTerm, f25787a, commonRuntimeDataProvider.getUserSessionIdJava(), listener));
        ((Logger) f25813a.getD()).d("Content", "search: returning cancellable " + cancellableRestRequest.getId() + " for searchInBuilding term " + searchTerm);
        return cancellableRestRequest;
    }

    @Nullable
    public final IPSSnapToRegionResult snapToClosestRegion(@NotNull IPSCoordinateInBuilding coordinate, @NotNull List<? extends IPSRegion> regions) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(regions, "regions");
        if (regions.isEmpty()) {
            return null;
        }
        IndoorCoordinate indoorCoordinate = new IndoorCoordinate(coordinate.getX(), coordinate.getY(), 0.0d, 4, (DefaultConstructorMarker) null);
        String buildingId = coordinate.getBuildingId();
        Intrinsics.g(buildingId, "getBuildingId(...)");
        String strM441constructorimpl = BuildingId.m441constructorimpl(buildingId);
        int i2 = 0;
        IPSSnapToRegionResult iPSSnapToRegionResult = null;
        for (Object obj : regions) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            IPSRegion iPSRegion = (IPSRegion) obj;
            List<? extends IPSRegionPlacement> placements = iPSRegion.getPlacements();
            Intrinsics.g(placements, "getPlacements(...)");
            IPSRegionPlacement iPSRegionPlacement = (IPSRegionPlacement) CollectionsKt.F(placements);
            if (iPSRegionPlacement != null && Intrinsics.c(iPSRegionPlacement.getBuildingId(), coordinate.getBuildingId()) && iPSRegionPlacement.getFloorOrder() == coordinate.getFloorOrder()) {
                Content content = INSTANCE;
                IPSShape shape = iPSRegionPlacement.getShape();
                Intrinsics.g(shape, "getShape(...)");
                content.getClass();
                Pair pairA = a(shape, indoorCoordinate);
                if (pairA != null) {
                    IndoorCoordinate indoorCoordinate2 = (IndoorCoordinate) pairA.d;
                    double dDoubleValue = ((Number) pairA.e).doubleValue();
                    if (iPSSnapToRegionResult == null || iPSSnapToRegionResult.getDistance() > dDoubleValue) {
                        iPSSnapToRegionResult = new IPSSnapToRegionResult(new SdkCoordinateInBuilding(indoorCoordinate2.getX(), indoorCoordinate2.getY(), coordinate.getZ(), iPSRegionPlacement.getFloorOrder(), strM441constructorimpl, null), iPSRegion, iPSRegionPlacement, i2, dDoubleValue);
                    }
                }
            }
            i2 = i3;
        }
        return iPSSnapToRegionResult;
    }

    @Nullable
    public final IPSSnapToShapeResult snapToClosestShape(@NotNull IPSCoordinate coordinate, @NotNull List<? extends IPSShape> shapes) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(shapes, "shapes");
        if (shapes.isEmpty()) {
            return null;
        }
        IndoorCoordinate indoorCoordinate = new IndoorCoordinate(coordinate.getX(), coordinate.getY(), 0.0d, 4, (DefaultConstructorMarker) null);
        int i2 = 0;
        IPSSnapToShapeResult iPSSnapToShapeResult = null;
        for (Object obj : shapes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            IPSShape iPSShape = (IPSShape) obj;
            INSTANCE.getClass();
            Pair pairA = a(iPSShape, indoorCoordinate);
            if (pairA != null) {
                IndoorCoordinate indoorCoordinate2 = (IndoorCoordinate) pairA.d;
                double dDoubleValue = ((Number) pairA.e).doubleValue();
                if (iPSSnapToShapeResult == null || iPSSnapToShapeResult.getDistance() > dDoubleValue) {
                    iPSSnapToShapeResult = new IPSSnapToShapeResult(new Coordinate(indoorCoordinate2.getX(), indoorCoordinate2.getY(), coordinate.getZ()), iPSShape, i2, dDoubleValue);
                }
            }
            i2 = i3;
        }
        return iPSSnapToShapeResult;
    }

    private static Pair a(IPSShape iPSShape, IndoorCoordinate indoorCoordinate) {
        int type = iPSShape.getType();
        if (type == 0) {
            IPSRectangularShape iPSRectangularShape = (IPSRectangularShape) iPSShape;
            return indoorCoordinate.findClosestPoint(CollectionsKt.R(new IndoorCoordinate(iPSRectangularShape.getB().getX(), iPSRectangularShape.getB().getY(), 0.0d, 4, (DefaultConstructorMarker) null), new IndoorCoordinate(iPSRectangularShape.getB().getX(), iPSRectangularShape.getF26201a().getY(), 0.0d, 4, (DefaultConstructorMarker) null), new IndoorCoordinate(iPSRectangularShape.getF26201a().getX(), iPSRectangularShape.getF26201a().getY(), 0.0d, 4, (DefaultConstructorMarker) null), new IndoorCoordinate(iPSRectangularShape.getF26201a().getX(), iPSRectangularShape.getB().getY(), 0.0d, 4, (DefaultConstructorMarker) null)));
        }
        if (type == 1) {
            IPSCircularShape iPSCircularShape = (IPSCircularShape) iPSShape;
            return indoorCoordinate.findClosestPointOnCircle(new IndoorCoordinate(iPSCircularShape.getX(), iPSCircularShape.getY(), 0.0d, 4, (DefaultConstructorMarker) null), iPSCircularShape.getRadiusMeters());
        }
        if (type != 2) {
            return null;
        }
        List<IPSCoordinate> points = ((IPSPolygonalShape) iPSShape).getPoints();
        Intrinsics.g(points, "getPoints(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(points, 10));
        for (IPSCoordinate iPSCoordinate : points) {
            arrayList.add(new IndoorCoordinate(iPSCoordinate.getX(), iPSCoordinate.getY(), 0.0d, 4, (DefaultConstructorMarker) null));
        }
        return indoorCoordinate.findClosestPoint(arrayList);
    }
}
