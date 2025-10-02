package me.oriient.ipssdk.realtime.services.rest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.base.rest.RestException;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.SdkCoordinateInBuilding;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0000\u001a$\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"isInt", "", "", "toCoordinate", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "", "toCoordinateInBuilding", "Lme/oriient/ipssdk/realtime/utils/models/SdkCoordinateInBuilding;", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "toCoordinateInBuilding-IDVNPgs", "(Ljava/util/List;Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/SdkCoordinateInBuilding;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtensionsKt {
    public static final boolean isInt(double d) {
        return d % 1.0d == 0.0d;
    }

    @NotNull
    public static final Coordinate toCoordinate(@NotNull List<Double> list) throws RestException {
        Intrinsics.h(list, "<this>");
        if (list.size() >= 2) {
            return new Coordinate(list.get(0).doubleValue(), list.get(1).doubleValue(), list.size() >= 3 ? list.get(2).doubleValue() : 0.0d);
        }
        throw new RestException("Not enough values in coordinate");
    }

    @NotNull
    /* renamed from: toCoordinateInBuilding-IDVNPgs, reason: not valid java name */
    public static final SdkCoordinateInBuilding m461toCoordinateInBuildingIDVNPgs(@NotNull List<Double> toCoordinateInBuilding, @NotNull String buildingId) throws RestException {
        Intrinsics.h(toCoordinateInBuilding, "$this$toCoordinateInBuilding");
        Intrinsics.h(buildingId, "buildingId");
        Coordinate coordinate = toCoordinate(toCoordinateInBuilding);
        return new SdkCoordinateInBuilding(coordinate.getX(), coordinate.getY(), coordinate.getZ(), toCoordinateInBuilding.size() >= 4 ? (int) toCoordinateInBuilding.get(3).doubleValue() : 0, buildingId, null);
    }
}
