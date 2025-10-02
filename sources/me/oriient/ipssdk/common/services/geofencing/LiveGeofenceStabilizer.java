package me.oriient.ipssdk.common.services.geofencing;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0012R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizer;", "", "stabilityTimeLimitMillis", "", "getStabilityTimeLimitMillis", "()J", "setStabilityTimeLimitMillis", "(J)V", "stableGeofences", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "getStableGeofences", "()Lkotlinx/coroutines/flow/StateFlow;", "start", "", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LiveGeofenceStabilizer {
    long getStabilityTimeLimitMillis();

    @NotNull
    StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getStableGeofences();

    void setStabilityTimeLimitMillis(long j);

    void start();

    @Nullable
    Object stop(@NotNull Continuation<? super Unit> continuation);
}
