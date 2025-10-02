package me.oriient.ipssdk.realtime.utils.models;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSRouteFloorTransition;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b+\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u001aR\u001a\u0010\r\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010$\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/RouteFloorTransition;", "Lme/oriient/ipssdk/api/models/IPSRouteFloorTransition;", "", "id", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "buildingId", "", "type", "floorOrder", "destinationFloorOrder", "", "x", "y", "z", "indexInRoute", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getType", "()I", "getDestinationFloorOrder", "getIndexOnRoute", "getBuildingId", "getFloorOrder", "getX", "()D", "getY", "getZ", "toString", "a", "Ljava/lang/String;", "getId$me_oriient_sdk_realtime", "b", "getBuildingId-wMWW5LA$me_oriient_sdk_realtime", "c", "I", "getType$me_oriient_sdk_realtime", "d", "getFloorOrder$me_oriient_sdk_realtime", "e", "getDestinationFloorOrder$me_oriient_sdk_realtime", "f", "D", "getX$me_oriient_sdk_realtime", "g", "getY$me_oriient_sdk_realtime", "h", "getZ$me_oriient_sdk_realtime", "i", "getIndexInRoute$me_oriient_sdk_realtime", "setIndexInRoute$me_oriient_sdk_realtime", "(I)V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RouteFloorTransition implements IPSRouteFloorTransition {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    private final String buildingId;

    /* renamed from: c, reason: from kotlin metadata */
    private final int type;

    /* renamed from: d, reason: from kotlin metadata */
    private final int floorOrder;

    /* renamed from: e, reason: from kotlin metadata */
    private final int destinationFloorOrder;

    /* renamed from: f, reason: from kotlin metadata */
    private final double x;

    /* renamed from: g, reason: from kotlin metadata */
    private final double y;

    /* renamed from: h, reason: from kotlin metadata */
    private final double z;

    /* renamed from: i, reason: from kotlin metadata */
    private int indexInRoute;

    public RouteFloorTransition(String id, String buildingId, int i, int i2, int i3, double d, double d2, double d3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        this.id = id;
        this.buildingId = buildingId;
        this.type = i;
        this.floorOrder = i2;
        this.destinationFloorOrder = i3;
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.indexInRoute = i4;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: getBuildingId-wMWW5LA$me_oriient_sdk_realtime, reason: not valid java name */
    public final String m479getBuildingIdwMWW5LA$me_oriient_sdk_realtime() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRouteFloorTransition
    public int getDestinationFloorOrder() {
        return this.destinationFloorOrder;
    }

    public final int getDestinationFloorOrder$me_oriient_sdk_realtime() {
        return this.destinationFloorOrder;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    public int getFloorOrder() {
        return this.floorOrder;
    }

    public final int getFloorOrder$me_oriient_sdk_realtime() {
        return this.floorOrder;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRouteFloorTransition
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getId$me_oriient_sdk_realtime() {
        return this.id;
    }

    /* renamed from: getIndexInRoute$me_oriient_sdk_realtime, reason: from getter */
    public final int getIndexInRoute() {
        return this.indexInRoute;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRouteFloorTransition
    public int getIndexOnRoute() {
        return this.indexInRoute;
    }

    @Override // me.oriient.ipssdk.api.models.IPSRouteFloorTransition
    public int getType() {
        return this.type;
    }

    public final int getType$me_oriient_sdk_realtime() {
        return this.type;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getX() {
        return this.x;
    }

    public final double getX$me_oriient_sdk_realtime() {
        return this.x;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getY() {
        return this.y;
    }

    public final double getY$me_oriient_sdk_realtime() {
        return this.y;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getZ() {
        return this.z;
    }

    public final double getZ$me_oriient_sdk_realtime() {
        return this.z;
    }

    public final void setIndexInRoute$me_oriient_sdk_realtime(int i) {
        this.indexInRoute = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteFloorTransition{id='");
        sb.append(this.id);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", floorOrder=");
        sb.append(this.floorOrder);
        sb.append(", destinationFloorOrder=");
        sb.append(this.destinationFloorOrder);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        return b.p(sb, this.z, '}');
    }
}
