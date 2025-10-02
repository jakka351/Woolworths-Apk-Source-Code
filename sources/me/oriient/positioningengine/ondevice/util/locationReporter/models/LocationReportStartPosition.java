package me.oriient.positioningengine.ondevice.util.locationReporter.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+BC\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;", "", "seen1", "", "x", "", "y", "accuracy", "heading", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;", "isExternal", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDLme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDDLme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Z)V", "getAccuracy", "()D", "getHeading", "()Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;", "()Z", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class LocationReportStartPosition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double accuracy;

    @Nullable
    private final LocationReportCoordinate heading;
    private final boolean isExternal;
    private final double x;
    private final double y;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LocationReportStartPosition> serializer() {
            return LocationReportStartPosition$$serializer.INSTANCE;
        }
    }

    public LocationReportStartPosition(double d, double d2, double d3, @Nullable LocationReportCoordinate locationReportCoordinate, boolean z) {
        this.x = d;
        this.y = d2;
        this.accuracy = d3;
        this.heading = locationReportCoordinate;
        this.isExternal = z;
    }

    public static /* synthetic */ LocationReportStartPosition copy$default(LocationReportStartPosition locationReportStartPosition, double d, double d2, double d3, LocationReportCoordinate locationReportCoordinate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationReportStartPosition.x;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = locationReportStartPosition.y;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = locationReportStartPosition.accuracy;
        }
        return locationReportStartPosition.copy(d4, d5, d3, (i & 8) != 0 ? locationReportStartPosition.heading : locationReportCoordinate, (i & 16) != 0 ? locationReportStartPosition.isExternal : z);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(LocationReportStartPosition self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.x);
        output.G(serialDesc, 1, self.y);
        output.G(serialDesc, 2, self.accuracy);
        output.w(serialDesc, 3, LocationReportCoordinate$$serializer.INSTANCE, self.heading);
        output.o(serialDesc, 4, self.isExternal);
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
    public final double getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final LocationReportCoordinate getHeading() {
        return this.heading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    @NotNull
    public final LocationReportStartPosition copy(double x, double y, double accuracy, @Nullable LocationReportCoordinate heading, boolean isExternal) {
        return new LocationReportStartPosition(x, y, accuracy, heading, isExternal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationReportStartPosition)) {
            return false;
        }
        LocationReportStartPosition locationReportStartPosition = (LocationReportStartPosition) other;
        return Double.compare(this.x, locationReportStartPosition.x) == 0 && Double.compare(this.y, locationReportStartPosition.y) == 0 && Double.compare(this.accuracy, locationReportStartPosition.accuracy) == 0 && Intrinsics.c(this.heading, locationReportStartPosition.heading) && this.isExternal == locationReportStartPosition.isExternal;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final LocationReportCoordinate getHeading() {
        return this.heading;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        int iA = v.a(this.accuracy, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
        LocationReportCoordinate locationReportCoordinate = this.heading;
        return Boolean.hashCode(this.isExternal) + ((iA + (locationReportCoordinate == null ? 0 : locationReportCoordinate.hashCode())) * 31);
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationReportStartPosition(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", isExternal=");
        return b.s(sb, this.isExternal, ')');
    }

    @Deprecated
    public /* synthetic */ LocationReportStartPosition(int i, double d, double d2, double d3, LocationReportCoordinate locationReportCoordinate, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, LocationReportStartPosition$$serializer.INSTANCE.getB());
            throw null;
        }
        this.x = d;
        this.y = d2;
        this.accuracy = d3;
        this.heading = locationReportCoordinate;
        this.isExternal = z;
    }
}
