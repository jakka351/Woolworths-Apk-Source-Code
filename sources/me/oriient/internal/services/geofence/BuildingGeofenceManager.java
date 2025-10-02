package me.oriient.internal.services.geofence;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.dataModel.geofence.GeofenceMetadataProvider;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u001fJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u001fJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u001fR$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR$\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006 "}, d2 = {"Lme/oriient/internal/services/geofence/BuildingGeofenceManager;", "Lme/oriient/internal/services/dataModel/geofence/GeofenceMetadataProvider;", "circularStatus", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "getCircularStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "isCircularStrategyEnabled", "", "isLiveCircularStrategyEnabled", "isPolygonalStrategyEnabled", "polygonalStatus", "getPolygonalStatus", "clean", "", "enableCircularLiveGeofence", "enable", "requestId", "", "enableCircularStrategy", "enablePolygonalStrategy", "building", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentCircularStatus", "location", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;Lme/oriient/internal/infra/locationManager/SystemLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentPolygonalStatus", "isCircularLiveGeofenceEnabled", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BuildingGeofenceManager extends GeofenceMetadataProvider {
    void clean();

    void enableCircularLiveGeofence(boolean enable, @NotNull String requestId);

    void enableCircularStrategy(boolean enable, @NotNull String requestId);

    void enablePolygonalStrategy(boolean enable, @NotNull String requestId);

    @Nullable
    Object getCircularStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull Continuation<? super BuildingGeofenceStatus> continuation);

    @NotNull
    StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getCircularStatus();

    @Nullable
    Object getCurrentCircularStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull SystemLocation systemLocation, @NotNull Continuation<? super BuildingGeofenceStatus> continuation);

    @Nullable
    Object getCurrentPolygonalStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull SystemLocation systemLocation, @NotNull Continuation<? super BuildingGeofenceStatus> continuation);

    @Nullable
    Object getPolygonalStatus(@NotNull GeofenceBuilding geofenceBuilding, @NotNull Continuation<? super BuildingGeofenceStatus> continuation);

    @NotNull
    StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getPolygonalStatus();

    @Nullable
    Object isCircularLiveGeofenceEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isCircularStrategyEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    StateFlow<Boolean> isCircularStrategyEnabled();

    @NotNull
    StateFlow<Boolean> isLiveCircularStrategyEnabled();

    @Nullable
    Object isPolygonalStrategyEnabled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @NotNull
    StateFlow<Boolean> isPolygonalStrategyEnabled();
}
