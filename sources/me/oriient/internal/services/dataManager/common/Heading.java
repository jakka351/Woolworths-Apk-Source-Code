package me.oriient.internal.services.dataManager.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/services/dataManager/common/Heading;", "", "x", "", "y", "z", "(DDD)V", "angle", "(DDDD)V", "getAngle", "()D", "getX", "getY", "getZ", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Heading {
    private final double angle;
    private final double x;
    private final double y;
    private final double z;

    public Heading(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.angle = d4;
    }

    public static /* synthetic */ Heading copy$default(Heading heading, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = heading.x;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = heading.y;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = heading.z;
        }
        return heading.copy(d5, d6, d3, (i & 8) != 0 ? heading.angle : d4);
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
    public final double getAngle() {
        return this.angle;
    }

    @NotNull
    public final Heading copy(double x, double y, double z, double angle) {
        return new Heading(x, y, z, angle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Heading)) {
            return false;
        }
        Heading heading = (Heading) other;
        return Double.compare(this.x, heading.x) == 0 && Double.compare(this.y, heading.y) == 0 && Double.compare(this.z, heading.z) == 0 && Double.compare(this.angle, heading.angle) == 0;
    }

    public final double getAngle() {
        return this.angle;
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
        return Double.hashCode(this.angle) + J.a(this.z, J.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Heading(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append(", angle=");
        return E.a(sb, this.angle, ')');
    }

    public /* synthetic */ Heading(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3);
    }

    public Heading(double d, double d2, double d3) {
        this(d, d2, d3, Math.toDegrees(Math.atan2(d2, d)));
    }
}
