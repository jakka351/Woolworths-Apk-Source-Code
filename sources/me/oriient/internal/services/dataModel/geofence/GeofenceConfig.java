package me.oriient.internal.services.dataModel.geofence;

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
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.scheduler.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J&\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203HÁ\u0001¢\u0006\u0002\b4R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u00067"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "", "seen1", "", "geofenceStabilityTimeLimitMillis", "", "circleConfig", "Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;", "polygonConfig", "Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;", "additionalPercentageToEnterGeofence", "", "usePolygonalGeofence", "", "geofenceFreshnessTimeLimitMillis", "geofencingRequiresHighAccuracy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;DZJZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;DZJZ)V", "getAdditionalPercentageToEnterGeofence", "()D", "getCircleConfig", "()Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;", "getGeofenceFreshnessTimeLimitMillis", "()J", "getGeofenceStabilityTimeLimitMillis", "getGeofencingRequiresHighAccuracy", "()Z", "getPolygonConfig", "()Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;", "getUsePolygonalGeofence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class GeofenceConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double additionalPercentageToEnterGeofence;

    @NotNull
    private final CircleBasedStrategyConfig circleConfig;
    private final long geofenceFreshnessTimeLimitMillis;
    private final long geofenceStabilityTimeLimitMillis;
    private final boolean geofencingRequiresHighAccuracy;

    @NotNull
    private final PolygonBasedStrategyConfig polygonConfig;
    private final boolean usePolygonalGeofence;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<GeofenceConfig> serializer() {
            return GeofenceConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GeofenceConfig(int i, long j, CircleBasedStrategyConfig circleBasedStrategyConfig, PolygonBasedStrategyConfig polygonBasedStrategyConfig, double d, boolean z, long j2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.a(i, 127, GeofenceConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.geofenceStabilityTimeLimitMillis = j;
        this.circleConfig = circleBasedStrategyConfig;
        this.polygonConfig = polygonBasedStrategyConfig;
        this.additionalPercentageToEnterGeofence = d;
        this.usePolygonalGeofence = z;
        this.geofenceFreshnessTimeLimitMillis = j2;
        this.geofencingRequiresHighAccuracy = z2;
    }

    public static /* synthetic */ GeofenceConfig copy$default(GeofenceConfig geofenceConfig, long j, CircleBasedStrategyConfig circleBasedStrategyConfig, PolygonBasedStrategyConfig polygonBasedStrategyConfig, double d, boolean z, long j2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = geofenceConfig.geofenceStabilityTimeLimitMillis;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            circleBasedStrategyConfig = geofenceConfig.circleConfig;
        }
        CircleBasedStrategyConfig circleBasedStrategyConfig2 = circleBasedStrategyConfig;
        if ((i & 4) != 0) {
            polygonBasedStrategyConfig = geofenceConfig.polygonConfig;
        }
        return geofenceConfig.copy(j3, circleBasedStrategyConfig2, polygonBasedStrategyConfig, (i & 8) != 0 ? geofenceConfig.additionalPercentageToEnterGeofence : d, (i & 16) != 0 ? geofenceConfig.usePolygonalGeofence : z, (i & 32) != 0 ? geofenceConfig.geofenceFreshnessTimeLimitMillis : j2, (i & 64) != 0 ? geofenceConfig.geofencingRequiresHighAccuracy : z2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(GeofenceConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.t(serialDesc, 0, self.geofenceStabilityTimeLimitMillis);
        output.F(serialDesc, 1, CircleBasedStrategyConfig$$serializer.INSTANCE, self.circleConfig);
        output.F(serialDesc, 2, PolygonBasedStrategyConfig$$serializer.INSTANCE, self.polygonConfig);
        output.G(serialDesc, 3, self.additionalPercentageToEnterGeofence);
        output.o(serialDesc, 4, self.usePolygonalGeofence);
        output.t(serialDesc, 5, self.geofenceFreshnessTimeLimitMillis);
        output.o(serialDesc, 6, self.geofencingRequiresHighAccuracy);
    }

    /* renamed from: component1, reason: from getter */
    public final long getGeofenceStabilityTimeLimitMillis() {
        return this.geofenceStabilityTimeLimitMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CircleBasedStrategyConfig getCircleConfig() {
        return this.circleConfig;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PolygonBasedStrategyConfig getPolygonConfig() {
        return this.polygonConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAdditionalPercentageToEnterGeofence() {
        return this.additionalPercentageToEnterGeofence;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUsePolygonalGeofence() {
        return this.usePolygonalGeofence;
    }

    /* renamed from: component6, reason: from getter */
    public final long getGeofenceFreshnessTimeLimitMillis() {
        return this.geofenceFreshnessTimeLimitMillis;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getGeofencingRequiresHighAccuracy() {
        return this.geofencingRequiresHighAccuracy;
    }

    @NotNull
    public final GeofenceConfig copy(long geofenceStabilityTimeLimitMillis, @NotNull CircleBasedStrategyConfig circleConfig, @NotNull PolygonBasedStrategyConfig polygonConfig, double additionalPercentageToEnterGeofence, boolean usePolygonalGeofence, long geofenceFreshnessTimeLimitMillis, boolean geofencingRequiresHighAccuracy) {
        Intrinsics.h(circleConfig, "circleConfig");
        Intrinsics.h(polygonConfig, "polygonConfig");
        return new GeofenceConfig(geofenceStabilityTimeLimitMillis, circleConfig, polygonConfig, additionalPercentageToEnterGeofence, usePolygonalGeofence, geofenceFreshnessTimeLimitMillis, geofencingRequiresHighAccuracy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeofenceConfig)) {
            return false;
        }
        GeofenceConfig geofenceConfig = (GeofenceConfig) other;
        return this.geofenceStabilityTimeLimitMillis == geofenceConfig.geofenceStabilityTimeLimitMillis && Intrinsics.c(this.circleConfig, geofenceConfig.circleConfig) && Intrinsics.c(this.polygonConfig, geofenceConfig.polygonConfig) && Double.compare(this.additionalPercentageToEnterGeofence, geofenceConfig.additionalPercentageToEnterGeofence) == 0 && this.usePolygonalGeofence == geofenceConfig.usePolygonalGeofence && this.geofenceFreshnessTimeLimitMillis == geofenceConfig.geofenceFreshnessTimeLimitMillis && this.geofencingRequiresHighAccuracy == geofenceConfig.geofencingRequiresHighAccuracy;
    }

    public final double getAdditionalPercentageToEnterGeofence() {
        return this.additionalPercentageToEnterGeofence;
    }

    @NotNull
    public final CircleBasedStrategyConfig getCircleConfig() {
        return this.circleConfig;
    }

    public final long getGeofenceFreshnessTimeLimitMillis() {
        return this.geofenceFreshnessTimeLimitMillis;
    }

    public final long getGeofenceStabilityTimeLimitMillis() {
        return this.geofenceStabilityTimeLimitMillis;
    }

    public final boolean getGeofencingRequiresHighAccuracy() {
        return this.geofencingRequiresHighAccuracy;
    }

    @NotNull
    public final PolygonBasedStrategyConfig getPolygonConfig() {
        return this.polygonConfig;
    }

    public final boolean getUsePolygonalGeofence() {
        return this.usePolygonalGeofence;
    }

    public int hashCode() {
        return Boolean.hashCode(this.geofencingRequiresHighAccuracy) + K.a(this.geofenceFreshnessTimeLimitMillis, a.a(this.usePolygonalGeofence, J.a(this.additionalPercentageToEnterGeofence, (this.polygonConfig.hashCode() + ((this.circleConfig.hashCode() + (Long.hashCode(this.geofenceStabilityTimeLimitMillis) * 31)) * 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GeofenceConfig(geofenceStabilityTimeLimitMillis=");
        sb.append(this.geofenceStabilityTimeLimitMillis);
        sb.append(", circleConfig=");
        sb.append(this.circleConfig);
        sb.append(", polygonConfig=");
        sb.append(this.polygonConfig);
        sb.append(", additionalPercentageToEnterGeofence=");
        sb.append(this.additionalPercentageToEnterGeofence);
        sb.append(", usePolygonalGeofence=");
        sb.append(this.usePolygonalGeofence);
        sb.append(", geofenceFreshnessTimeLimitMillis=");
        sb.append(this.geofenceFreshnessTimeLimitMillis);
        sb.append(", geofencingRequiresHighAccuracy=");
        return b.s(sb, this.geofencingRequiresHighAccuracy, ')');
    }

    public GeofenceConfig(long j, @NotNull CircleBasedStrategyConfig circleConfig, @NotNull PolygonBasedStrategyConfig polygonConfig, double d, boolean z, long j2, boolean z2) {
        Intrinsics.h(circleConfig, "circleConfig");
        Intrinsics.h(polygonConfig, "polygonConfig");
        this.geofenceStabilityTimeLimitMillis = j;
        this.circleConfig = circleConfig;
        this.polygonConfig = polygonConfig;
        this.additionalPercentageToEnterGeofence = d;
        this.usePolygonalGeofence = z;
        this.geofenceFreshnessTimeLimitMillis = j2;
        this.geofencingRequiresHighAccuracy = z2;
    }
}
