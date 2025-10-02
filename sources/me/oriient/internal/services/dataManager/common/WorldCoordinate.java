package me.oriient.internal.services.dataManager.common;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.dataManager.building.E;
import me.oriient.internal.services.dataManager.utils.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0000J\u001c\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J(\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005H\u0002J \u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005H\u0002J\u001e\u0010'\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019H\u0002J\t\u0010(\u001a\u00020)HÖ\u0001J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u00064"}, d2 = {"Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "", "seen1", "", h.a.b, "", h.a.c, "altitude", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDD)V", "getAltitude", "()D", "getLatitude", "getLongitude", "component1", "component2", "component3", "copy", "distanceTo", "coordinate", "doesIntersectWithPolygon", "", "polygon", "", "radiusMeters", "equals", "other", "hashCode", "isLineIntersectingCircle", "startPoint", "endPoint", "circleCenter", "circleRadius", "isPointInsideCircle", "point", "center", "radius", "isPointInsidePolygon", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class WorldCoordinate {

    @NotNull
    private static final Companion Companion = new Companion();
    private static final double DEGREES_EQUIVALENT_OF_1_METER = 9.01E-6d;
    private final double altitude;
    private final double latitude;
    private final double longitude;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/dataManager/common/WorldCoordinate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEGREES_EQUIVALENT_OF_1_METER", "D", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WorldCoordinate> serializer() {
            return WorldCoordinate$$serializer.INSTANCE;
        }
    }

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

    private final boolean isLineIntersectingCircle(WorldCoordinate startPoint, WorldCoordinate endPoint, WorldCoordinate circleCenter, double circleRadius) {
        double d = endPoint.latitude;
        double d2 = startPoint.latitude;
        double d3 = d - d2;
        double d4 = endPoint.longitude;
        double d5 = startPoint.longitude;
        double d6 = d4 - d5;
        double d7 = d2 - circleCenter.latitude;
        double d8 = d5 - circleCenter.longitude;
        double d9 = (d6 * d6) + (d3 * d3);
        double d10 = 2;
        double d11 = ((d6 * d8) + (d3 * d7)) * d10;
        double d12 = (d11 * d11) - ((4 * d9) * (((d8 * d8) + (d7 * d7)) - (circleRadius * circleRadius)));
        if (d12 < 0.0d) {
            return false;
        }
        double d13 = -d11;
        double d14 = d10 * d9;
        double dSqrt = (d13 - Math.sqrt(d12)) / d14;
        double dSqrt2 = (Math.sqrt(d12) + d13) / d14;
        if (0.0d > dSqrt || dSqrt > 1.0d) {
            return 0.0d <= dSqrt2 && dSqrt2 <= 1.0d;
        }
        return true;
    }

    private final boolean isPointInsideCircle(WorldCoordinate point, WorldCoordinate center, double radius) {
        return point.distanceTo(center) <= radius;
    }

    private final boolean isPointInsidePolygon(WorldCoordinate coordinate, List<WorldCoordinate> polygon) {
        int size = polygon.size() - 1;
        int size2 = polygon.size();
        boolean z = false;
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            WorldCoordinate worldCoordinate = polygon.get(i2);
            WorldCoordinate worldCoordinate2 = polygon.get(i);
            double d = worldCoordinate.longitude;
            double d2 = coordinate.longitude;
            if ((d < d2 && worldCoordinate2.longitude >= d2) || (worldCoordinate2.longitude < d2 && d >= d2)) {
                double d3 = worldCoordinate.latitude;
                if (((worldCoordinate2.latitude - d3) * ((d2 - d) / (worldCoordinate2.longitude - d))) + d3 < coordinate.latitude) {
                    z = !z;
                }
            }
            i = i2;
        }
        return z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(WorldCoordinate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.latitude);
        output.G(serialDesc, 1, self.longitude);
        if (!output.q(serialDesc, 2) && Double.compare(self.altitude, 0.0d) == 0) {
            return;
        }
        output.G(serialDesc, 2, self.altitude);
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
        return e.a(this.latitude, this.longitude, latitude, longitude);
    }

    public final boolean doesIntersectWithPolygon(@NotNull List<WorldCoordinate> polygon, double radiusMeters) {
        Intrinsics.h(polygon, "polygon");
        if (isPointInsidePolygon(this, polygon)) {
            return true;
        }
        double d = radiusMeters * DEGREES_EQUIVALENT_OF_1_METER;
        int size = polygon.size();
        int i = 0;
        while (i < size) {
            WorldCoordinate worldCoordinate = polygon.get(i);
            i++;
            if (isLineIntersectingCircle(worldCoordinate, polygon.get(i % polygon.size()), this, d)) {
                return true;
            }
        }
        int size2 = polygon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (isPointInsideCircle(polygon.get(i2), this, d)) {
                return true;
            }
        }
        return false;
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
        return Double.hashCode(this.altitude) + J.a(this.longitude, Double.hashCode(this.latitude) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("WorldCoordinate(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        return E.a(sb, this.altitude, ')');
    }

    public final double distanceTo(@NotNull WorldCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return e.a(this.latitude, this.longitude, coordinate.latitude, coordinate.longitude);
    }

    @Deprecated
    public /* synthetic */ WorldCoordinate(int i, double d, double d2, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, WorldCoordinate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.latitude = d;
        this.longitude = d2;
        if ((i & 4) == 0) {
            this.altitude = 0.0d;
        } else {
            this.altitude = d3;
        }
    }

    public /* synthetic */ WorldCoordinate(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3);
    }
}
