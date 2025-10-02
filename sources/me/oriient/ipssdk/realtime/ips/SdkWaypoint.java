package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkWaypoint;", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "", "id", "buildingId", "", "floorOrder", "", "x", "y", "z", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDD)V", "getId", "()Ljava/lang/String;", "getX", "()D", "getY", "getZ", "getBuildingId", "getFloorOrder", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;IDDD)Lme/oriient/ipssdk/realtime/ips/SdkWaypoint;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SdkWaypoint implements IPSWaypoint {

    /* renamed from: a, reason: collision with root package name */
    private final String f25863a;
    private final String b;
    private final int c;
    private final double d;
    private final double e;
    private final double f;

    public SdkWaypoint(@NotNull String id, @NotNull String buildingId, int i, double d, double d2, double d3) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        this.f25863a = id;
        this.b = buildingId;
        this.c = i;
        this.d = d;
        this.e = d2;
        this.f = d3;
    }

    public static /* synthetic */ SdkWaypoint copy$default(SdkWaypoint sdkWaypoint, String str, String str2, int i, double d, double d2, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkWaypoint.f25863a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkWaypoint.b;
        }
        if ((i2 & 4) != 0) {
            i = sdkWaypoint.c;
        }
        if ((i2 & 8) != 0) {
            d = sdkWaypoint.d;
        }
        if ((i2 & 16) != 0) {
            d2 = sdkWaypoint.e;
        }
        if ((i2 & 32) != 0) {
            d3 = sdkWaypoint.f;
        }
        double d4 = d3;
        double d5 = d2;
        int i3 = i;
        return sdkWaypoint.copy(str, str2, i3, d, d5, d4);
    }

    @NotNull
    public final SdkWaypoint copy(@NotNull String id, @NotNull String buildingId, int floorOrder, double x, double y, double z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        return new SdkWaypoint(id, buildingId, floorOrder, x, y, z);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkWaypoint)) {
            return false;
        }
        SdkWaypoint sdkWaypoint = (SdkWaypoint) other;
        return Intrinsics.c(this.f25863a, sdkWaypoint.f25863a) && Intrinsics.c(this.b, sdkWaypoint.b) && this.c == sdkWaypoint.c && Double.compare(this.d, sdkWaypoint.d) == 0 && Double.compare(this.e, sdkWaypoint.e) == 0 && Double.compare(this.f, sdkWaypoint.f) == 0;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    /* renamed from: getBuildingId, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    /* renamed from: getFloorOrder, reason: from getter */
    public int getC() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSWaypoint
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF25863a() {
        return this.f25863a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getX, reason: from getter */
    public double getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getY, reason: from getter */
    public double getE() {
        return this.e;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    /* renamed from: getZ, reason: from getter */
    public double getF() {
        return this.f;
    }

    public int hashCode() {
        return Double.hashCode(this.f) + android.support.v4.media.session.a.a(this.e, android.support.v4.media.session.a.a(this.d, androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.c(this.f25863a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SdkWaypoint(id=");
        sb.append(this.f25863a);
        sb.append(", buildingId=");
        sb.append(this.b);
        sb.append(", floorOrder=");
        sb.append(this.c);
        sb.append(", x=");
        sb.append(this.d);
        sb.append(", y=");
        sb.append(this.e);
        sb.append(", z=");
        return androidx.camera.core.impl.b.p(sb, this.f, ')');
    }
}
