package me.oriient.internal.services.dataModel.geofence;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.scheduler.a;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;", "", "seen1", "", "fetchRadiusMeters", "", "searchRadiusMeters", "periodicGeofenceCheckIntervalSeconds", "locationThrottlingDurationSeconds", "shouldMonitorAppStateForGeofencing", "", "appStateThrottlingDurationSeconds", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDZDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDDDZD)V", "getAppStateThrottlingDurationSeconds", "()D", "getFetchRadiusMeters", "getLocationThrottlingDurationSeconds", "getPeriodicGeofenceCheckIntervalSeconds", "getSearchRadiusMeters", "getShouldMonitorAppStateForGeofencing", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class CircleBasedStrategyConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double appStateThrottlingDurationSeconds;
    private final double fetchRadiusMeters;
    private final double locationThrottlingDurationSeconds;
    private final double periodicGeofenceCheckIntervalSeconds;
    private final double searchRadiusMeters;
    private final boolean shouldMonitorAppStateForGeofencing;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/geofence/CircleBasedStrategyConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CircleBasedStrategyConfig> serializer() {
            return CircleBasedStrategyConfig$$serializer.INSTANCE;
        }
    }

    public CircleBasedStrategyConfig(double d, double d2, double d3, double d4, boolean z, double d5) {
        this.fetchRadiusMeters = d;
        this.searchRadiusMeters = d2;
        this.periodicGeofenceCheckIntervalSeconds = d3;
        this.locationThrottlingDurationSeconds = d4;
        this.shouldMonitorAppStateForGeofencing = z;
        this.appStateThrottlingDurationSeconds = d5;
    }

    public static /* synthetic */ CircleBasedStrategyConfig copy$default(CircleBasedStrategyConfig circleBasedStrategyConfig, double d, double d2, double d3, double d4, boolean z, double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = circleBasedStrategyConfig.fetchRadiusMeters;
        }
        return circleBasedStrategyConfig.copy(d, (i & 2) != 0 ? circleBasedStrategyConfig.searchRadiusMeters : d2, (i & 4) != 0 ? circleBasedStrategyConfig.periodicGeofenceCheckIntervalSeconds : d3, (i & 8) != 0 ? circleBasedStrategyConfig.locationThrottlingDurationSeconds : d4, (i & 16) != 0 ? circleBasedStrategyConfig.shouldMonitorAppStateForGeofencing : z, (i & 32) != 0 ? circleBasedStrategyConfig.appStateThrottlingDurationSeconds : d5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(CircleBasedStrategyConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.fetchRadiusMeters);
        output.G(serialDesc, 1, self.searchRadiusMeters);
        output.G(serialDesc, 2, self.periodicGeofenceCheckIntervalSeconds);
        output.G(serialDesc, 3, self.locationThrottlingDurationSeconds);
        output.o(serialDesc, 4, self.shouldMonitorAppStateForGeofencing);
        output.G(serialDesc, 5, self.appStateThrottlingDurationSeconds);
    }

    /* renamed from: component1, reason: from getter */
    public final double getFetchRadiusMeters() {
        return this.fetchRadiusMeters;
    }

    /* renamed from: component2, reason: from getter */
    public final double getSearchRadiusMeters() {
        return this.searchRadiusMeters;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPeriodicGeofenceCheckIntervalSeconds() {
        return this.periodicGeofenceCheckIntervalSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldMonitorAppStateForGeofencing() {
        return this.shouldMonitorAppStateForGeofencing;
    }

    /* renamed from: component6, reason: from getter */
    public final double getAppStateThrottlingDurationSeconds() {
        return this.appStateThrottlingDurationSeconds;
    }

    @NotNull
    public final CircleBasedStrategyConfig copy(double fetchRadiusMeters, double searchRadiusMeters, double periodicGeofenceCheckIntervalSeconds, double locationThrottlingDurationSeconds, boolean shouldMonitorAppStateForGeofencing, double appStateThrottlingDurationSeconds) {
        return new CircleBasedStrategyConfig(fetchRadiusMeters, searchRadiusMeters, periodicGeofenceCheckIntervalSeconds, locationThrottlingDurationSeconds, shouldMonitorAppStateForGeofencing, appStateThrottlingDurationSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircleBasedStrategyConfig)) {
            return false;
        }
        CircleBasedStrategyConfig circleBasedStrategyConfig = (CircleBasedStrategyConfig) other;
        return Double.compare(this.fetchRadiusMeters, circleBasedStrategyConfig.fetchRadiusMeters) == 0 && Double.compare(this.searchRadiusMeters, circleBasedStrategyConfig.searchRadiusMeters) == 0 && Double.compare(this.periodicGeofenceCheckIntervalSeconds, circleBasedStrategyConfig.periodicGeofenceCheckIntervalSeconds) == 0 && Double.compare(this.locationThrottlingDurationSeconds, circleBasedStrategyConfig.locationThrottlingDurationSeconds) == 0 && this.shouldMonitorAppStateForGeofencing == circleBasedStrategyConfig.shouldMonitorAppStateForGeofencing && Double.compare(this.appStateThrottlingDurationSeconds, circleBasedStrategyConfig.appStateThrottlingDurationSeconds) == 0;
    }

    public final double getAppStateThrottlingDurationSeconds() {
        return this.appStateThrottlingDurationSeconds;
    }

    public final double getFetchRadiusMeters() {
        return this.fetchRadiusMeters;
    }

    public final double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    public final double getPeriodicGeofenceCheckIntervalSeconds() {
        return this.periodicGeofenceCheckIntervalSeconds;
    }

    public final double getSearchRadiusMeters() {
        return this.searchRadiusMeters;
    }

    public final boolean getShouldMonitorAppStateForGeofencing() {
        return this.shouldMonitorAppStateForGeofencing;
    }

    public int hashCode() {
        return Double.hashCode(this.appStateThrottlingDurationSeconds) + a.a(this.shouldMonitorAppStateForGeofencing, J.a(this.locationThrottlingDurationSeconds, J.a(this.periodicGeofenceCheckIntervalSeconds, J.a(this.searchRadiusMeters, Double.hashCode(this.fetchRadiusMeters) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CircleBasedStrategyConfig(fetchRadiusMeters=");
        sb.append(this.fetchRadiusMeters);
        sb.append(", searchRadiusMeters=");
        sb.append(this.searchRadiusMeters);
        sb.append(", periodicGeofenceCheckIntervalSeconds=");
        sb.append(this.periodicGeofenceCheckIntervalSeconds);
        sb.append(", locationThrottlingDurationSeconds=");
        sb.append(this.locationThrottlingDurationSeconds);
        sb.append(", shouldMonitorAppStateForGeofencing=");
        sb.append(this.shouldMonitorAppStateForGeofencing);
        sb.append(", appStateThrottlingDurationSeconds=");
        return E.a(sb, this.appStateThrottlingDurationSeconds, ')');
    }

    @Deprecated
    public /* synthetic */ CircleBasedStrategyConfig(int i, double d, double d2, double d3, double d4, boolean z, double d5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, CircleBasedStrategyConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.fetchRadiusMeters = d;
        this.searchRadiusMeters = d2;
        this.periodicGeofenceCheckIntervalSeconds = d3;
        this.locationThrottlingDurationSeconds = d4;
        this.shouldMonitorAppStateForGeofencing = z;
        this.appStateThrottlingDurationSeconds = d5;
    }
}
