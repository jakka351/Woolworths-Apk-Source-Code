package me.oriient.internal.infra.locationManager;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0000J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\fHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u00060"}, d2 = {"Lme/oriient/internal/infra/locationManager/SystemLocation;", "", h.a.b, "", h.a.c, "altitude", "horizontalAccuracy", "verticalAccuracyMeters", "heading", "timestampMs", "", "provider", "", "elapsedRealtimeNanos", "(DDLjava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;JLjava/lang/String;J)V", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getElapsedRealtimeNanos", "()J", "getHeading", "getHorizontalAccuracy", "()D", "getLatitude", "getLongitude", "getProvider", "()Ljava/lang/String;", "getTimestampMs", "getVerticalAccuracyMeters", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;JLjava/lang/String;J)Lme/oriient/internal/infra/locationManager/SystemLocation;", "distanceTo", "coordinate", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SystemLocation {

    @Nullable
    private final Double altitude;
    private final long elapsedRealtimeNanos;

    @Nullable
    private final Double heading;
    private final double horizontalAccuracy;
    private final double latitude;
    private final double longitude;

    @Nullable
    private final String provider;
    private final long timestampMs;

    @Nullable
    private final Double verticalAccuracyMeters;

    public SystemLocation(double d, double d2, @Nullable Double d3, double d4, @Nullable Double d5, @Nullable Double d6, long j, @Nullable String str, long j2) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.horizontalAccuracy = d4;
        this.verticalAccuracyMeters = d5;
        this.heading = d6;
        this.timestampMs = j;
        this.provider = str;
        this.elapsedRealtimeNanos = j2;
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component4, reason: from getter */
    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getHeading() {
        return this.heading;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* renamed from: component9, reason: from getter */
    public final long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    @NotNull
    public final SystemLocation copy(double latitude, double longitude, @Nullable Double altitude, double horizontalAccuracy, @Nullable Double verticalAccuracyMeters, @Nullable Double heading, long timestampMs, @Nullable String provider, long elapsedRealtimeNanos) {
        return new SystemLocation(latitude, longitude, altitude, horizontalAccuracy, verticalAccuracyMeters, heading, timestampMs, provider, elapsedRealtimeNanos);
    }

    public final double distanceTo(double latitude, double longitude) {
        return me.oriient.internal.services.dataManager.utils.e.a(this.latitude, this.longitude, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemLocation)) {
            return false;
        }
        SystemLocation systemLocation = (SystemLocation) other;
        return Double.compare(this.latitude, systemLocation.latitude) == 0 && Double.compare(this.longitude, systemLocation.longitude) == 0 && Intrinsics.c(this.altitude, systemLocation.altitude) && Double.compare(this.horizontalAccuracy, systemLocation.horizontalAccuracy) == 0 && Intrinsics.c(this.verticalAccuracyMeters, systemLocation.verticalAccuracyMeters) && Intrinsics.c(this.heading, systemLocation.heading) && this.timestampMs == systemLocation.timestampMs && Intrinsics.c(this.provider, systemLocation.provider) && this.elapsedRealtimeNanos == systemLocation.elapsedRealtimeNanos;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    public final long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    @Nullable
    public final Double getHeading() {
        return this.heading;
    }

    public final double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getProvider() {
        return this.provider;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @Nullable
    public final Double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters;
    }

    public int hashCode() {
        int iA = J.a(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        Double d = this.altitude;
        int iA2 = J.a(this.horizontalAccuracy, (iA + (d == null ? 0 : d.hashCode())) * 31, 31);
        Double d2 = this.verticalAccuracyMeters;
        int iHashCode = (iA2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.heading;
        int iA3 = K.a(this.timestampMs, (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31, 31);
        String str = this.provider;
        return Long.hashCode(this.elapsedRealtimeNanos) + ((iA3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemLocation(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        sb.append(this.altitude);
        sb.append(", horizontalAccuracy=");
        sb.append(this.horizontalAccuracy);
        sb.append(", verticalAccuracyMeters=");
        sb.append(this.verticalAccuracyMeters);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", timestampMs=");
        sb.append(this.timestampMs);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", elapsedRealtimeNanos=");
        return androidx.camera.core.impl.b.q(sb, this.elapsedRealtimeNanos, ')');
    }

    public final double distanceTo(@NotNull SystemLocation coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return me.oriient.internal.services.dataManager.utils.e.a(this.latitude, this.longitude, coordinate.latitude, coordinate.longitude);
    }
}
