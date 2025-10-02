package me.oriient.positioningengine.common.models;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\r¨\u0006#"}, d2 = {"Lme/oriient/positioningengine/common/models/WorldCoordinate;", "Ljava/io/Serializable;", "", h.a.b, h.a.c, "altitude", "<init>", "(DDD)V", "distanceTo", "(DD)D", "coordinate", "(Lme/oriient/positioningengine/common/models/WorldCoordinate;)D", "component1", "()D", "component2", "component3", "copy", "(DDD)Lme/oriient/positioningengine/common/models/WorldCoordinate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "getLongitude", "getAltitude", "Companion", "me/oriient/positioningengine/common/models/e", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class WorldCoordinate implements Serializable {

    @NotNull
    public static final e Companion = new e();
    private static final long serialVersionUID = 1;
    private final double altitude;
    private final double latitude;
    private final double longitude;

    public WorldCoordinate(double d, double d2, double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
    }

    public static /* synthetic */ WorldCoordinate copy$default(WorldCoordinate worldCoordinate, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = worldCoordinate.latitude;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = worldCoordinate.longitude;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = worldCoordinate.altitude;
        }
        return worldCoordinate.copy(d4, d5, d3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final WorldCoordinate copy(double latitude, double longitude, double altitude) {
        return new WorldCoordinate(latitude, longitude, altitude);
    }

    public final double distanceTo(double latitude, double longitude) {
        return f.a(this.latitude, this.longitude, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCoordinate)) {
            return false;
        }
        WorldCoordinate worldCoordinate = (WorldCoordinate) other;
        return Double.compare(this.latitude, worldCoordinate.latitude) == 0 && Double.compare(this.longitude, worldCoordinate.longitude) == 0 && Double.compare(this.altitude, worldCoordinate.altitude) == 0;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.altitude) + v.a(this.longitude, Double.hashCode(this.latitude) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WorldCoordinate(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        return me.oriient.positioningengine.common.a.a(sb, this.altitude, ')');
    }

    public final double distanceTo(@NotNull WorldCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return f.a(this.latitude, this.longitude, coordinate.latitude, coordinate.longitude);
    }
}
