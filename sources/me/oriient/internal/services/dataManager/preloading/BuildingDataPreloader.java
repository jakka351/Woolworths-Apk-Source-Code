package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/BuildingDataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "", "floorTransitionsDataPreloader", "", "Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "floorDataPreloaders", "plaiDataPreloader", "<init>", "(Lme/oriient/internal/services/dataManager/preloading/DataPreloader;Ljava/util/List;Lme/oriient/internal/services/dataManager/preloading/DataPreloader;)V", "dataId", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "preloadBuilding", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadData", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Ljava/util/List;", "dataTypeDescription", "Ljava/lang/String;", "getDataTypeDescription", "()Ljava/lang/String;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/dataManager/building/BuildingRepository;", "buildingRepository$delegate", "getBuildingRepository", "()Lme/oriient/internal/services/dataManager/building/BuildingRepository;", "buildingRepository", "Companion", "me/oriient/internal/services/dataManager/preloading/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BuildingDataPreloader implements DataPreloader<String> {

    @NotNull
    private static final C1401a Companion = new C1401a();

    @NotNull
    private static final String TAG = "BuildingDataPreloader";

    /* renamed from: buildingRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buildingRepository;

    @NotNull
    private final String dataTypeDescription;

    @NotNull
    private final List<DataPreloader<FloorDataPreloaderId>> floorDataPreloaders;

    @NotNull
    private final DataPreloader<String> floorTransitionsDataPreloader;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final DataPreloader<String> plaiDataPreloader;

    /* JADX WARN: Multi-variable type inference failed */
    public BuildingDataPreloader(@NotNull DataPreloader<String> floorTransitionsDataPreloader, @NotNull List<? extends DataPreloader<FloorDataPreloaderId>> floorDataPreloaders, @NotNull DataPreloader<String> plaiDataPreloader) {
        Intrinsics.h(floorTransitionsDataPreloader, "floorTransitionsDataPreloader");
        Intrinsics.h(floorDataPreloaders, "floorDataPreloaders");
        Intrinsics.h(plaiDataPreloader, "plaiDataPreloader");
        this.floorTransitionsDataPreloader = floorTransitionsDataPreloader;
        this.floorDataPreloaders = floorDataPreloaders;
        this.plaiDataPreloader = plaiDataPreloader;
        this.dataTypeDescription = "BuildingData";
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.buildingRepository = InternalDiKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BuildingRepository getBuildingRepository() {
        return (BuildingRepository) this.buildingRepository.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preloadBuilding(String str, Continuation<? super Outcome<Unit, OriientError>> continuation) {
        return CoroutineScopeKt.c(new C1405e(this, str, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(String str, Continuation continuation) {
        return preloadData2(str, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    @Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    public Object preloadData2(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation) {
        return CoroutineScopeKt.c(new j(this, str, null), continuation);
    }
}
