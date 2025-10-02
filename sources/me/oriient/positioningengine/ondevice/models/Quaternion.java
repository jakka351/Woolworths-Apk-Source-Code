package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lme/oriient/positioningengine/ondevice/models/Quaternion;", "", "list", "", "", "(Ljava/util/List;)V", "x", "y", "z", "w", "(DDDD)V", "pitchRadians", "getPitchRadians", "()D", "rollRadians", "getRollRadians", "getW", "getX", "getY", "yawRadians", "getYawRadians", "getZ", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Quaternion {
    private final double w;
    private final double x;
    private final double y;
    private final double z;

    public Quaternion(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.w = d4;
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = quaternion.x;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = quaternion.y;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = quaternion.z;
        }
        return quaternion.copy(d5, d6, d3, (i & 8) != 0 ? quaternion.w : d4);
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
    public final double getW() {
        return this.w;
    }

    @NotNull
    public final Quaternion copy(double x, double y, double z, double w) {
        return new Quaternion(x, y, z, w);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) other;
        return Double.compare(this.x, quaternion.x) == 0 && Double.compare(this.y, quaternion.y) == 0 && Double.compare(this.z, quaternion.z) == 0 && Double.compare(this.w, quaternion.w) == 0;
    }

    public final double getPitchRadians() {
        return Math.asin(((this.w * this.x) + (this.y * this.z)) * 2.0f);
    }

    public final double getRollRadians() {
        double d = 2.0f;
        double d2 = this.x;
        double d3 = this.w;
        double d4 = this.y;
        double d5 = this.z;
        return Math.atan2(((d4 * d5) + (d2 * d3)) * d, 1.0f - (((d3 * d3) + (d5 * d5)) * d));
    }

    public final double getW() {
        return this.w;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getYawRadians() {
        double d = 2.0f;
        double d2 = this.x;
        double d3 = this.y;
        double d4 = this.w;
        double d5 = this.z;
        return Math.atan2(((d4 * d5) + (d2 * d3)) * d, 1.0f - (((d5 * d5) + (d3 * d3)) * d));
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        return Double.hashCode(this.w) + v.a(this.z, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Quaternion(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append(", w=");
        return me.oriient.positioningengine.common.a.a(sb, this.w, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(@NotNull List<Double> list) {
        this(list.get(1).doubleValue(), list.get(2).doubleValue(), list.get(3).doubleValue(), list.get(0).doubleValue());
        Intrinsics.h(list, "list");
    }
}
