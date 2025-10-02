package me.oriient.navigation.common;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;
import me.oriient.internal.services.dataModel.navigation.NavigationMetadataProvider;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.util.NavigationError;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H¦@¢\u0006\u0002\u0010&J:\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0(2\u0006\u0010 \u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\u0010*\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H¦@¢\u0006\u0002\u0010/J\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0(2\u0006\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lme/oriient/navigation/common/NavigationManager;", "Lme/oriient/internal/services/dataModel/navigation/NavigationMetadataProvider;", "isLiveNavigationEnabled", "", "()Z", "setLiveNavigationEnabled", "(Z)V", "liveFinalWaypoint", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "getLiveFinalWaypoint", "()Lme/oriient/navigation/common/models/NavigationWaypoint;", "setLiveFinalWaypoint", "(Lme/oriient/navigation/common/models/NavigationWaypoint;)V", "liveNavigationErrors", "Lkotlinx/coroutines/flow/SharedFlow;", "Lme/oriient/navigation/common/util/NavigationError;", "getLiveNavigationErrors", "()Lkotlinx/coroutines/flow/SharedFlow;", "liveNavigationRouteUpdates", "Lme/oriient/navigation/common/models/Route;", "getLiveNavigationRouteUpdates", "liveNavigationWaypoints", "", "getLiveNavigationWaypoints", "()Ljava/util/List;", "setLiveNavigationWaypoints", "(Ljava/util/List;)V", "cleanCore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllCaches", "clearBuildingCache", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearExpiredData", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findRouteInBuilding", "Lme/oriient/internal/infra/utils/core/Outcome;", "waypoints", "finalWaypoint", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/navigation/common/models/NavigationWaypoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewConfig", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "(Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadNavigationData", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface NavigationManager extends NavigationMetadataProvider {
    @Nullable
    Object cleanCore(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearAllCaches(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearBuildingCache(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object clearExpiredData(double d, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object findRouteInBuilding(@NotNull String str, @NotNull List<NavigationWaypoint> list, @Nullable NavigationWaypoint navigationWaypoint, @NotNull Continuation<? super Outcome<Route, NavigationError>> continuation);

    @Nullable
    NavigationWaypoint getLiveFinalWaypoint();

    @NotNull
    SharedFlow<NavigationError> getLiveNavigationErrors();

    @NotNull
    SharedFlow<Route> getLiveNavigationRouteUpdates();

    @NotNull
    List<NavigationWaypoint> getLiveNavigationWaypoints();

    boolean isLiveNavigationEnabled();

    @Nullable
    Object onNewConfig(@NotNull NavigationConfig navigationConfig, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object preloadNavigationData(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, NavigationError>> continuation);

    void setLiveFinalWaypoint(@Nullable NavigationWaypoint navigationWaypoint);

    void setLiveNavigationEnabled(boolean z);

    void setLiveNavigationWaypoints(@NotNull List<NavigationWaypoint> list);
}
