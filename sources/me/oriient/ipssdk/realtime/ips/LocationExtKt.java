package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toInternalWorldCoordinate", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LocationExtKt {
    @NotNull
    public static final WorldCoordinate toInternalWorldCoordinate(@NotNull me.oriient.ipssdk.common.utils.models.WorldCoordinate worldCoordinate) {
        Intrinsics.h(worldCoordinate, "<this>");
        return new WorldCoordinate(worldCoordinate.getLatitude(), worldCoordinate.getLongitude(), worldCoordinate.getAltitude());
    }
}
