package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinateInBuilding;
import me.oriient.ipssdk.common.utils.models.BuildingId;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/SdkCoordinateInBuilding;", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "", "x", "y", "z", "", "floorOrder", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "buildingId", "<init>", "(DDDILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getBuildingId", "()Ljava/lang/String;", "getFloorOrder", "()I", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SdkCoordinateInBuilding extends Coordinate implements IPSCoordinateInBuilding {
    private final int d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkCoordinateInBuilding(double d, double d2, double d3, int i, String buildingId, DefaultConstructorMarker defaultConstructorMarker) {
        super(d, d2, d3);
        Intrinsics.h(buildingId, "buildingId");
        this.d = i;
        this.e = buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    /* renamed from: getBuildingId, reason: from getter */
    public String getE() {
        return this.e;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    /* renamed from: getFloorOrder, reason: from getter */
    public int getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.Coordinate
    @NotNull
    public String toString() {
        return "SdkCoordinateInBuilding{floorOrder=" + this.d + ", buildingId='" + ((Object) BuildingId.m445toStringimpl(this.e)) + "', x=" + getX() + ", y=" + getY() + ", z=" + getZ() + '}';
    }
}
