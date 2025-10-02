package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006\""}, d2 = {"Lme/oriient/navigation/common/models/CoordinateInFloorCore;", "", "", "x", "y", "z", "", "floorOrder", "<init>", "(DDDI)V", "component1", "()D", "component2", "component3", "component4", "()I", "copy", "(DDDI)Lme/oriient/navigation/common/models/CoordinateInFloorCore;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getX", "getY", "getZ", "I", "getFloorOrder", "Companion", "me/oriient/navigation/common/models/a", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CoordinateInFloorCore {

    @NotNull
    public static final a Companion = new a();
    private final int floorOrder;
    private final double x;
    private final double y;
    private final double z;

    public CoordinateInFloorCore(double d, double d2, double d3, int i) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.floorOrder = i;
    }

    public static /* synthetic */ CoordinateInFloorCore copy$default(CoordinateInFloorCore coordinateInFloorCore, double d, double d2, double d3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = coordinateInFloorCore.x;
        }
        double d4 = d;
        if ((i2 & 2) != 0) {
            d2 = coordinateInFloorCore.y;
        }
        double d5 = d2;
        if ((i2 & 4) != 0) {
            d3 = coordinateInFloorCore.z;
        }
        double d6 = d3;
        if ((i2 & 8) != 0) {
            i = coordinateInFloorCore.floorOrder;
        }
        return coordinateInFloorCore.copy(d4, d5, d6, i);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final CoordinateInFloorCore copy(double x, double y, double z, int floorOrder) {
        return new CoordinateInFloorCore(x, y, z, floorOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinateInFloorCore)) {
            return false;
        }
        CoordinateInFloorCore coordinateInFloorCore = (CoordinateInFloorCore) other;
        return Double.compare(this.x, coordinateInFloorCore.x) == 0 && Double.compare(this.y, coordinateInFloorCore.y) == 0 && Double.compare(this.z, coordinateInFloorCore.z) == 0 && this.floorOrder == coordinateInFloorCore.floorOrder;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        return Integer.hashCode(this.floorOrder) + android.support.v4.media.session.a.a(this.z, android.support.v4.media.session.a.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CoordinateInFloorCore(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append(", floorOrder=");
        return YU.a.l(sb, this.floorOrder, ')');
    }
}
