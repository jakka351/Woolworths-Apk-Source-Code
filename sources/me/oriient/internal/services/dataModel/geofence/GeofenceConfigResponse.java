package me.oriient.internal.services.dataModel.geofence;

import androidx.annotation.Keep;
import com.medallia.digital.mobilesdk.l3;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015B\u0095\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u009e\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0006\u0010:\u001a\u00020;J\t\u0010<\u001a\u00020=HÖ\u0001J&\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DHÁ\u0001¢\u0006\u0002\bER\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b&\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b'\u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b(\u0010!¨\u0006H"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse;", "", "seen1", "", "defaultBuildingsFetchRadius", "", "nearbyBuildingsSearchRadiusMeters", "periodicGeofenceCheckIntervalSeconds", "", "geofenceStabilityTimeLimitSeconds", "locationThrottlingDurationSeconds", "maximumLocationAccuracyToAutoStartMeters", "shouldMonitorAppStateForGeofencing", "", "appStateThrottlingDurationSeconds", "additionalPercentageToEnterGeofence", "usePolygonalGeofence", "geofenceFreshnessTimeLimitSeconds", "geofencingRequiresHighAccuracy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getAdditionalPercentageToEnterGeofence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAppStateThrottlingDurationSeconds", "getDefaultBuildingsFetchRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGeofenceFreshnessTimeLimitSeconds", "getGeofenceStabilityTimeLimitSeconds", "getGeofencingRequiresHighAccuracy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLocationThrottlingDurationSeconds", "getMaximumLocationAccuracyToAutoStartMeters", "getNearbyBuildingsSearchRadiusMeters", "getPeriodicGeofenceCheckIntervalSeconds", "getShouldMonitorAppStateForGeofencing", "getUsePolygonalGeofence", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;)Lme/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse;", "equals", "other", "hashCode", "toGeofenceConfig", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class GeofenceConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double additionalPercentageToEnterGeofence;

    @Nullable
    private final Double appStateThrottlingDurationSeconds;

    @Nullable
    private final Float defaultBuildingsFetchRadius;

    @Nullable
    private final Double geofenceFreshnessTimeLimitSeconds;

    @Nullable
    private final Double geofenceStabilityTimeLimitSeconds;

    @Nullable
    private final Boolean geofencingRequiresHighAccuracy;

    @Nullable
    private final Double locationThrottlingDurationSeconds;

    @Nullable
    private final Double maximumLocationAccuracyToAutoStartMeters;

    @Nullable
    private final Float nearbyBuildingsSearchRadiusMeters;

    @Nullable
    private final Double periodicGeofenceCheckIntervalSeconds;

    @Nullable
    private final Boolean shouldMonitorAppStateForGeofencing;

    @Nullable
    private final Boolean usePolygonalGeofence;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/geofence/GeofenceConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<GeofenceConfigResponse> serializer() {
            return GeofenceConfigResponse$$serializer.INSTANCE;
        }
    }

    public GeofenceConfigResponse() {
        this((Float) null, (Float) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Boolean) null, l3.b, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GeofenceConfigResponse copy$default(GeofenceConfigResponse geofenceConfigResponse, Float f, Float f2, Double d, Double d2, Double d3, Double d4, Boolean bool, Double d5, Double d6, Boolean bool2, Double d7, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = geofenceConfigResponse.defaultBuildingsFetchRadius;
        }
        if ((i & 2) != 0) {
            f2 = geofenceConfigResponse.nearbyBuildingsSearchRadiusMeters;
        }
        if ((i & 4) != 0) {
            d = geofenceConfigResponse.periodicGeofenceCheckIntervalSeconds;
        }
        if ((i & 8) != 0) {
            d2 = geofenceConfigResponse.geofenceStabilityTimeLimitSeconds;
        }
        if ((i & 16) != 0) {
            d3 = geofenceConfigResponse.locationThrottlingDurationSeconds;
        }
        if ((i & 32) != 0) {
            d4 = geofenceConfigResponse.maximumLocationAccuracyToAutoStartMeters;
        }
        if ((i & 64) != 0) {
            bool = geofenceConfigResponse.shouldMonitorAppStateForGeofencing;
        }
        if ((i & 128) != 0) {
            d5 = geofenceConfigResponse.appStateThrottlingDurationSeconds;
        }
        if ((i & 256) != 0) {
            d6 = geofenceConfigResponse.additionalPercentageToEnterGeofence;
        }
        if ((i & 512) != 0) {
            bool2 = geofenceConfigResponse.usePolygonalGeofence;
        }
        if ((i & 1024) != 0) {
            d7 = geofenceConfigResponse.geofenceFreshnessTimeLimitSeconds;
        }
        if ((i & 2048) != 0) {
            bool3 = geofenceConfigResponse.geofencingRequiresHighAccuracy;
        }
        Double d8 = d7;
        Boolean bool4 = bool3;
        Double d9 = d6;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        Double d10 = d5;
        Double d11 = d3;
        Double d12 = d4;
        return geofenceConfigResponse.copy(f, f2, d, d2, d11, d12, bool6, d10, d9, bool5, d8, bool4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(GeofenceConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.defaultBuildingsFetchRadius != null) {
            output.w(serialDesc, 0, FloatSerializer.f24797a, self.defaultBuildingsFetchRadius);
        }
        if (output.q(serialDesc, 1) || self.nearbyBuildingsSearchRadiusMeters != null) {
            output.w(serialDesc, 1, FloatSerializer.f24797a, self.nearbyBuildingsSearchRadiusMeters);
        }
        if (output.q(serialDesc, 2) || self.periodicGeofenceCheckIntervalSeconds != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.periodicGeofenceCheckIntervalSeconds);
        }
        if (output.q(serialDesc, 3) || self.geofenceStabilityTimeLimitSeconds != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.geofenceStabilityTimeLimitSeconds);
        }
        if (output.q(serialDesc, 4) || self.locationThrottlingDurationSeconds != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.locationThrottlingDurationSeconds);
        }
        if (output.q(serialDesc, 5) || self.maximumLocationAccuracyToAutoStartMeters != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.maximumLocationAccuracyToAutoStartMeters);
        }
        if (output.q(serialDesc, 6) || self.shouldMonitorAppStateForGeofencing != null) {
            output.w(serialDesc, 6, BooleanSerializer.f24779a, self.shouldMonitorAppStateForGeofencing);
        }
        if (output.q(serialDesc, 7) || self.appStateThrottlingDurationSeconds != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.appStateThrottlingDurationSeconds);
        }
        if (output.q(serialDesc, 8) || self.additionalPercentageToEnterGeofence != null) {
            output.w(serialDesc, 8, DoubleSerializer.f24792a, self.additionalPercentageToEnterGeofence);
        }
        if (output.q(serialDesc, 9) || self.usePolygonalGeofence != null) {
            output.w(serialDesc, 9, BooleanSerializer.f24779a, self.usePolygonalGeofence);
        }
        if (output.q(serialDesc, 10) || self.geofenceFreshnessTimeLimitSeconds != null) {
            output.w(serialDesc, 10, DoubleSerializer.f24792a, self.geofenceFreshnessTimeLimitSeconds);
        }
        if (!output.q(serialDesc, 11) && self.geofencingRequiresHighAccuracy == null) {
            return;
        }
        output.w(serialDesc, 11, BooleanSerializer.f24779a, self.geofencingRequiresHighAccuracy);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getDefaultBuildingsFetchRadius() {
        return this.defaultBuildingsFetchRadius;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getUsePolygonalGeofence() {
        return this.usePolygonalGeofence;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getGeofenceFreshnessTimeLimitSeconds() {
        return this.geofenceFreshnessTimeLimitSeconds;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getGeofencingRequiresHighAccuracy() {
        return this.geofencingRequiresHighAccuracy;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getNearbyBuildingsSearchRadiusMeters() {
        return this.nearbyBuildingsSearchRadiusMeters;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getPeriodicGeofenceCheckIntervalSeconds() {
        return this.periodicGeofenceCheckIntervalSeconds;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getGeofenceStabilityTimeLimitSeconds() {
        return this.geofenceStabilityTimeLimitSeconds;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getShouldMonitorAppStateForGeofencing() {
        return this.shouldMonitorAppStateForGeofencing;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getAppStateThrottlingDurationSeconds() {
        return this.appStateThrottlingDurationSeconds;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getAdditionalPercentageToEnterGeofence() {
        return this.additionalPercentageToEnterGeofence;
    }

    @NotNull
    public final GeofenceConfigResponse copy(@Nullable Float defaultBuildingsFetchRadius, @Nullable Float nearbyBuildingsSearchRadiusMeters, @Nullable Double periodicGeofenceCheckIntervalSeconds, @Nullable Double geofenceStabilityTimeLimitSeconds, @Nullable Double locationThrottlingDurationSeconds, @Nullable Double maximumLocationAccuracyToAutoStartMeters, @Nullable Boolean shouldMonitorAppStateForGeofencing, @Nullable Double appStateThrottlingDurationSeconds, @Nullable Double additionalPercentageToEnterGeofence, @Nullable Boolean usePolygonalGeofence, @Nullable Double geofenceFreshnessTimeLimitSeconds, @Nullable Boolean geofencingRequiresHighAccuracy) {
        return new GeofenceConfigResponse(defaultBuildingsFetchRadius, nearbyBuildingsSearchRadiusMeters, periodicGeofenceCheckIntervalSeconds, geofenceStabilityTimeLimitSeconds, locationThrottlingDurationSeconds, maximumLocationAccuracyToAutoStartMeters, shouldMonitorAppStateForGeofencing, appStateThrottlingDurationSeconds, additionalPercentageToEnterGeofence, usePolygonalGeofence, geofenceFreshnessTimeLimitSeconds, geofencingRequiresHighAccuracy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeofenceConfigResponse)) {
            return false;
        }
        GeofenceConfigResponse geofenceConfigResponse = (GeofenceConfigResponse) other;
        return Intrinsics.c(this.defaultBuildingsFetchRadius, geofenceConfigResponse.defaultBuildingsFetchRadius) && Intrinsics.c(this.nearbyBuildingsSearchRadiusMeters, geofenceConfigResponse.nearbyBuildingsSearchRadiusMeters) && Intrinsics.c(this.periodicGeofenceCheckIntervalSeconds, geofenceConfigResponse.periodicGeofenceCheckIntervalSeconds) && Intrinsics.c(this.geofenceStabilityTimeLimitSeconds, geofenceConfigResponse.geofenceStabilityTimeLimitSeconds) && Intrinsics.c(this.locationThrottlingDurationSeconds, geofenceConfigResponse.locationThrottlingDurationSeconds) && Intrinsics.c(this.maximumLocationAccuracyToAutoStartMeters, geofenceConfigResponse.maximumLocationAccuracyToAutoStartMeters) && Intrinsics.c(this.shouldMonitorAppStateForGeofencing, geofenceConfigResponse.shouldMonitorAppStateForGeofencing) && Intrinsics.c(this.appStateThrottlingDurationSeconds, geofenceConfigResponse.appStateThrottlingDurationSeconds) && Intrinsics.c(this.additionalPercentageToEnterGeofence, geofenceConfigResponse.additionalPercentageToEnterGeofence) && Intrinsics.c(this.usePolygonalGeofence, geofenceConfigResponse.usePolygonalGeofence) && Intrinsics.c(this.geofenceFreshnessTimeLimitSeconds, geofenceConfigResponse.geofenceFreshnessTimeLimitSeconds) && Intrinsics.c(this.geofencingRequiresHighAccuracy, geofenceConfigResponse.geofencingRequiresHighAccuracy);
    }

    @Nullable
    public final Double getAdditionalPercentageToEnterGeofence() {
        return this.additionalPercentageToEnterGeofence;
    }

    @Nullable
    public final Double getAppStateThrottlingDurationSeconds() {
        return this.appStateThrottlingDurationSeconds;
    }

    @Nullable
    public final Float getDefaultBuildingsFetchRadius() {
        return this.defaultBuildingsFetchRadius;
    }

    @Nullable
    public final Double getGeofenceFreshnessTimeLimitSeconds() {
        return this.geofenceFreshnessTimeLimitSeconds;
    }

    @Nullable
    public final Double getGeofenceStabilityTimeLimitSeconds() {
        return this.geofenceStabilityTimeLimitSeconds;
    }

    @Nullable
    public final Boolean getGeofencingRequiresHighAccuracy() {
        return this.geofencingRequiresHighAccuracy;
    }

    @Nullable
    public final Double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    @Nullable
    public final Double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    @Nullable
    public final Float getNearbyBuildingsSearchRadiusMeters() {
        return this.nearbyBuildingsSearchRadiusMeters;
    }

    @Nullable
    public final Double getPeriodicGeofenceCheckIntervalSeconds() {
        return this.periodicGeofenceCheckIntervalSeconds;
    }

    @Nullable
    public final Boolean getShouldMonitorAppStateForGeofencing() {
        return this.shouldMonitorAppStateForGeofencing;
    }

    @Nullable
    public final Boolean getUsePolygonalGeofence() {
        return this.usePolygonalGeofence;
    }

    public int hashCode() {
        Float f = this.defaultBuildingsFetchRadius;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.nearbyBuildingsSearchRadiusMeters;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Double d = this.periodicGeofenceCheckIntervalSeconds;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.geofenceStabilityTimeLimitSeconds;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.locationThrottlingDurationSeconds;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.maximumLocationAccuracyToAutoStartMeters;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool = this.shouldMonitorAppStateForGeofencing;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d5 = this.appStateThrottlingDurationSeconds;
        int iHashCode8 = (iHashCode7 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.additionalPercentageToEnterGeofence;
        int iHashCode9 = (iHashCode8 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool2 = this.usePolygonalGeofence;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d7 = this.geofenceFreshnessTimeLimitSeconds;
        int iHashCode11 = (iHashCode10 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Boolean bool3 = this.geofencingRequiresHighAccuracy;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final GeofenceConfig toGeofenceConfig() {
        Double d = this.additionalPercentageToEnterGeofence;
        double dDoubleValue = d != null ? d.doubleValue() : 40.0d;
        Boolean bool = this.usePolygonalGeofence;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Double d2 = this.geofenceStabilityTimeLimitSeconds;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 2.0d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = (long) (dDoubleValue2 * timeUnit.toMillis(1L));
        double dFloatValue = this.defaultBuildingsFetchRadius != null ? r7.floatValue() : 15000.0d;
        double dFloatValue2 = this.nearbyBuildingsSearchRadiusMeters != null ? r7.floatValue() : 500.0d;
        Double d3 = this.periodicGeofenceCheckIntervalSeconds;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 30.0d;
        Double d4 = this.locationThrottlingDurationSeconds;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 1.0d;
        Boolean bool2 = this.shouldMonitorAppStateForGeofencing;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Double d5 = this.appStateThrottlingDurationSeconds;
        CircleBasedStrategyConfig circleBasedStrategyConfig = new CircleBasedStrategyConfig(dFloatValue, dFloatValue2, dDoubleValue3, dDoubleValue4, zBooleanValue2, d5 != null ? d5.doubleValue() : 5.0d);
        double dFloatValue3 = this.defaultBuildingsFetchRadius != null ? r2.floatValue() : 15000.0d;
        double dFloatValue4 = this.nearbyBuildingsSearchRadiusMeters != null ? r2.floatValue() : 500.0d;
        Double d6 = this.maximumLocationAccuracyToAutoStartMeters;
        double dDoubleValue5 = d6 != null ? d6.doubleValue() : 50.0d;
        Double d7 = this.locationThrottlingDurationSeconds;
        PolygonBasedStrategyConfig polygonBasedStrategyConfig = new PolygonBasedStrategyConfig(dFloatValue3, dFloatValue4, dDoubleValue5, d7 != null ? d7.doubleValue() : 1.0d);
        Double d8 = this.geofenceFreshnessTimeLimitSeconds;
        long jDoubleValue = (long) ((d8 != null ? d8.doubleValue() : 250.0d) * timeUnit.toMillis(1L));
        Boolean bool3 = this.geofencingRequiresHighAccuracy;
        return new GeofenceConfig(millis, circleBasedStrategyConfig, polygonBasedStrategyConfig, dDoubleValue, zBooleanValue, jDoubleValue, bool3 != null ? bool3.booleanValue() : false);
    }

    @NotNull
    public String toString() {
        return "GeofenceConfigResponse(defaultBuildingsFetchRadius=" + this.defaultBuildingsFetchRadius + ", nearbyBuildingsSearchRadiusMeters=" + this.nearbyBuildingsSearchRadiusMeters + ", periodicGeofenceCheckIntervalSeconds=" + this.periodicGeofenceCheckIntervalSeconds + ", geofenceStabilityTimeLimitSeconds=" + this.geofenceStabilityTimeLimitSeconds + ", locationThrottlingDurationSeconds=" + this.locationThrottlingDurationSeconds + ", maximumLocationAccuracyToAutoStartMeters=" + this.maximumLocationAccuracyToAutoStartMeters + ", shouldMonitorAppStateForGeofencing=" + this.shouldMonitorAppStateForGeofencing + ", appStateThrottlingDurationSeconds=" + this.appStateThrottlingDurationSeconds + ", additionalPercentageToEnterGeofence=" + this.additionalPercentageToEnterGeofence + ", usePolygonalGeofence=" + this.usePolygonalGeofence + ", geofenceFreshnessTimeLimitSeconds=" + this.geofenceFreshnessTimeLimitSeconds + ", geofencingRequiresHighAccuracy=" + this.geofencingRequiresHighAccuracy + ')';
    }

    @Deprecated
    public /* synthetic */ GeofenceConfigResponse(int i, Float f, Float f2, Double d, Double d2, Double d3, Double d4, Boolean bool, Double d5, Double d6, Boolean bool2, Double d7, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.defaultBuildingsFetchRadius = null;
        } else {
            this.defaultBuildingsFetchRadius = f;
        }
        if ((i & 2) == 0) {
            this.nearbyBuildingsSearchRadiusMeters = null;
        } else {
            this.nearbyBuildingsSearchRadiusMeters = f2;
        }
        if ((i & 4) == 0) {
            this.periodicGeofenceCheckIntervalSeconds = null;
        } else {
            this.periodicGeofenceCheckIntervalSeconds = d;
        }
        if ((i & 8) == 0) {
            this.geofenceStabilityTimeLimitSeconds = null;
        } else {
            this.geofenceStabilityTimeLimitSeconds = d2;
        }
        if ((i & 16) == 0) {
            this.locationThrottlingDurationSeconds = null;
        } else {
            this.locationThrottlingDurationSeconds = d3;
        }
        if ((i & 32) == 0) {
            this.maximumLocationAccuracyToAutoStartMeters = null;
        } else {
            this.maximumLocationAccuracyToAutoStartMeters = d4;
        }
        if ((i & 64) == 0) {
            this.shouldMonitorAppStateForGeofencing = null;
        } else {
            this.shouldMonitorAppStateForGeofencing = bool;
        }
        if ((i & 128) == 0) {
            this.appStateThrottlingDurationSeconds = null;
        } else {
            this.appStateThrottlingDurationSeconds = d5;
        }
        if ((i & 256) == 0) {
            this.additionalPercentageToEnterGeofence = null;
        } else {
            this.additionalPercentageToEnterGeofence = d6;
        }
        if ((i & 512) == 0) {
            this.usePolygonalGeofence = null;
        } else {
            this.usePolygonalGeofence = bool2;
        }
        if ((i & 1024) == 0) {
            this.geofenceFreshnessTimeLimitSeconds = null;
        } else {
            this.geofenceFreshnessTimeLimitSeconds = d7;
        }
        if ((i & 2048) == 0) {
            this.geofencingRequiresHighAccuracy = null;
        } else {
            this.geofencingRequiresHighAccuracy = bool3;
        }
    }

    public GeofenceConfigResponse(@Nullable Float f, @Nullable Float f2, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Boolean bool, @Nullable Double d5, @Nullable Double d6, @Nullable Boolean bool2, @Nullable Double d7, @Nullable Boolean bool3) {
        this.defaultBuildingsFetchRadius = f;
        this.nearbyBuildingsSearchRadiusMeters = f2;
        this.periodicGeofenceCheckIntervalSeconds = d;
        this.geofenceStabilityTimeLimitSeconds = d2;
        this.locationThrottlingDurationSeconds = d3;
        this.maximumLocationAccuracyToAutoStartMeters = d4;
        this.shouldMonitorAppStateForGeofencing = bool;
        this.appStateThrottlingDurationSeconds = d5;
        this.additionalPercentageToEnterGeofence = d6;
        this.usePolygonalGeofence = bool2;
        this.geofenceFreshnessTimeLimitSeconds = d7;
        this.geofencingRequiresHighAccuracy = bool3;
    }

    public /* synthetic */ GeofenceConfigResponse(Float f, Float f2, Double d, Double d2, Double d3, Double d4, Boolean bool, Double d5, Double d6, Boolean bool2, Double d7, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : d4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : d5, (i & 256) != 0 ? null : d6, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : d7, (i & 2048) != 0 ? null : bool3);
    }
}
