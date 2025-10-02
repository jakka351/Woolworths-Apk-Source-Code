package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.positioningengine.common.ValidationUpdate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/OnDeviceEngineAutoStopDetector;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "configure", "", "geofence", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "slidingWindowSize", "", "maxDistanceFromBuildingMeters", "", "requiredConsistentAttemptsToStop", "shouldStop", "", "validationUpdate", "Lme/oriient/positioningengine/common/ValidationUpdate;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnDeviceEngineAutoStopDetector extends DiProvidable {
    void configure(@NotNull List<IndoorCoordinate> geofence, int slidingWindowSize, double maxDistanceFromBuildingMeters, int requiredConsistentAttemptsToStop);

    boolean shouldStop(@NotNull ValidationUpdate validationUpdate);
}
