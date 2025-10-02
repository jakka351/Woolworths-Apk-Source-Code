package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSWaypointModel;", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "id", "", "x", "", "y", "z", "floorOrder", "", "buildingId", "(Ljava/lang/String;DDDILjava/lang/String;)V", "getBuildingId", "getFloorOrder", "getId", "getX", "getY", "getZ", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSWaypointModel implements IPSWaypoint {

    @NotNull
    private final String buildingId;
    private final int floorOrder;

    @NotNull
    private final String id;
    private final double x;
    private final double y;
    private final double z;

    public IPSWaypointModel(@NotNull String id, double d, double d2, double d3, int i, @NotNull String buildingId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        this.id = id;
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

    @Override // me.oriient.ipssdk.api.models.IPSWaypoint
    @NotNull
    public String getId() {
        return this.id;
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

    public /* synthetic */ IPSWaypointModel(String str, double d, double d2, double d3, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, d2, (i2 & 8) != 0 ? 0.0d : d3, i, str2);
    }
}
