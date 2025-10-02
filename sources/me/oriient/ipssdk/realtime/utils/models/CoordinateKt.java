package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCoordinate", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoordinateKt {
    @NotNull
    public static final Coordinate toCoordinate(@NotNull IndoorCoordinate indoorCoordinate) {
        Intrinsics.h(indoorCoordinate, "<this>");
        return new Coordinate(indoorCoordinate.getX(), indoorCoordinate.getY(), indoorCoordinate.getZ());
    }
}
