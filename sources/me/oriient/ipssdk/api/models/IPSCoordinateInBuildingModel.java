package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSCoordinateInBuildingModel;", "Lme/oriient/ipssdk/api/models/IPSCoordinateInBuilding;", "x", "", "y", "z", "floorOrder", "", "buildingId", "", "(DDDILjava/lang/String;)V", "getBuildingId", "getFloorOrder", "getX", "getY", "getZ", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSCoordinateInBuildingModel implements IPSCoordinateInBuilding {

    @NotNull
    private final String buildingId;
    private final int floorOrder;
    private final double x;
    private final double y;
    private final double z;

    public IPSCoordinateInBuildingModel(double d, double d2, double d3, int i, @NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.floorOrder = i;
        this.buildingId = buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    public int getFloorOrder() {
        return this.floorOrder;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getX() {
        return this.x;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getY() {
        return this.y;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getZ() {
        return this.z;
    }

    public /* synthetic */ IPSCoordinateInBuildingModel(double d, double d2, double d3, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i2 & 4) != 0 ? 0.0d : d3, i, str);
    }
}
