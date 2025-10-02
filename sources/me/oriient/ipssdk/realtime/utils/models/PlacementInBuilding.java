package me.oriient.ipssdk.realtime.utils.models;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSPlacement;
import me.oriient.ipssdk.realtime.ofs.Z2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/PlacementInBuilding;", "Lme/oriient/ipssdk/api/models/IPSPlacement;", "", "id", "", "floorOrder", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "coordinate", "clientCategory", "<init>", "(Ljava/lang/String;ILme/oriient/ipssdk/realtime/utils/models/Coordinate;I)V", "getBuildingId", "()Ljava/lang/String;", "getFloorOrder", "()I", "getId", "", "getX", "()D", "getY", "getZ", "getClientCategory", "toString", "c", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "getCoordinate", "()Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "buildingId", "Ljava/lang/String;", "Companion", "me/oriient/ipssdk/realtime/ofs/Z2", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PlacementInBuilding implements IPSPlacement {

    @NotNull
    private static final Z2 Companion = new Z2();

    /* renamed from: a, reason: collision with root package name */
    private final String f26197a;
    private final int b;

    @JvmField
    @NotNull
    public String buildingId;

    /* renamed from: c, reason: from kotlin metadata */
    private final Coordinate coordinate;
    private final int d;

    public PlacementInBuilding(@NotNull String id, int i, @NotNull Coordinate coordinate, int i2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinate, "coordinate");
        this.f26197a = id;
        this.b = i;
        this.coordinate = coordinate;
        this.d = i2;
        this.buildingId = "";
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPlacement
    /* renamed from: getClientCategory, reason: from getter */
    public int getD() {
        return this.d;
    }

    @NotNull
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    /* renamed from: getFloorOrder, reason: from getter */
    public int getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPlacement
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF26197a() {
        return this.f26197a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getX() {
        return this.coordinate.getX();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getY() {
        return this.coordinate.getY();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getZ() {
        return this.coordinate.getZ();
    }

    @NotNull
    public String toString() {
        return "PlacementInBuilding{id='" + this.f26197a + "', buildingId='" + this.buildingId + "', floorOrder=" + this.b + ", coordinate=" + this.coordinate + '}';
    }
}
