package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.mapGrid.MapGridPriorityLoader;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u001dR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/MapGridPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "()V", "buildingRepository", "Lme/oriient/internal/services/dataManager/building/BuildingRepository;", "getBuildingRepository", "()Lme/oriient/internal/services/dataManager/building/BuildingRepository;", "buildingRepository$delegate", "Lkotlin/Lazy;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/config/InternalConfigManager;", "getConfig", "()Lme/oriient/internal/services/config/InternalConfigManager;", "config$delegate", "dataTypeDescription", "", "getDataTypeDescription", "()Ljava/lang/String;", "mapGridPriorityLoader", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridPriorityLoader;", "getMapGridPriorityLoader", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridPriorityLoader;", "mapGridPriorityLoader$delegate", "preloadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "dataId", "(Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapGridPreloader implements DataPreloader<FloorDataPreloaderId> {

    /* renamed from: buildingRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buildingRepository;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy config;

    @NotNull
    private final String dataTypeDescription = "MapGrid";

    /* renamed from: mapGridPriorityLoader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mapGridPriorityLoader;

    public MapGridPreloader() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.buildingRepository = di.inject(reflectionFactory.b(BuildingRepository.class));
        this.mapGridPriorityLoader = InternalDiKt.getDi().inject(reflectionFactory.b(MapGridPriorityLoader.class));
        this.config = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
    }

    private final BuildingRepository getBuildingRepository() {
        return (BuildingRepository) this.buildingRepository.getD();
    }

    private final InternalConfigManager getConfig() {
        return (InternalConfigManager) this.config.getD();
    }

    private final MapGridPriorityLoader getMapGridPriorityLoader() {
        return (MapGridPriorityLoader) this.mapGridPriorityLoader.getD();
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(FloorDataPreloaderId floorDataPreloaderId, Continuation continuation) {
        return preloadData2(floorDataPreloaderId, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[EDGE_INSN: B:43:0x00f1->B:40:0x00f1 BREAK  A[LOOP:0: B:32:0x0091->B:44:?], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.MapGridPreloader.preloadData2(me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
