package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0019JB\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingRepository;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanInMemoryCache", "fetchBuilding", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/dataManager/building/Building;", "Lme/oriient/internal/infra/utils/core/OriientError;", "fetchBuildingByClientId", "buildingClientId", "fetchBuildingSearchResults", "Lme/oriient/internal/services/dataManager/building/BuildingsSearchResult;", "page", "Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;", "(Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchClientBuildingId", "searchBuildings", "spaceId", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "searchRadiusMeters", "", "fetchRadiusMeters", "requestId", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;FFLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BuildingRepository extends DiProvidable {
    @Nullable
    Object cleanCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    void cleanInMemoryCache();

    @Nullable
    Object fetchBuilding(@NotNull String str, @NotNull Continuation<? super Outcome<Building, OriientError>> continuation);

    @Nullable
    Object fetchBuildingByClientId(@NotNull String str, @NotNull Continuation<? super Outcome<Building, OriientError>> continuation);

    @Nullable
    Object fetchBuildingSearchResults(@NotNull BuildingSearchPage buildingSearchPage, @NotNull Continuation<? super Outcome<BuildingsSearchResult, OriientError>> continuation);

    @Nullable
    Object fetchClientBuildingId(@NotNull String str, @NotNull Continuation<? super Outcome<String, OriientError>> continuation);

    @Nullable
    Object searchBuildings(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Outcome<BuildingsSearchResult, OriientError>> continuation);

    @Nullable
    Object searchBuildings(@NotNull String str, @NotNull WorldCoordinate worldCoordinate, float f, float f2, @NotNull String str2, @NotNull Continuation<? super Outcome<BuildingsSearchResult, OriientError>> continuation);
}
