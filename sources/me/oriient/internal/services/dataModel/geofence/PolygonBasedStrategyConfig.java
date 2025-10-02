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
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006'"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;", "", "seen1", "", "fetchRadiusMeters", "", "searchRadiusMeters", "maximumLocationAccuracyToAutoStartMeters", "locationThrottlingDurationSeconds", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDDD)V", "getFetchRadiusMeters", "()D", "getLocationThrottlingDurationSeconds", "getMaximumLocationAccuracyToAutoStartMeters", "getSearchRadiusMeters", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class PolygonBasedStrategyConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double fetchRadiusMeters;
    private final double locationThrottlingDurationSeconds;
    private final double maximumLocationAccuracyToAutoStartMeters;
    private final double searchRadiusMeters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/geofence/PolygonBasedStrategyConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PolygonBasedStrategyConfig> serializer() {
            return PolygonBasedStrategyConfig$$serializer.INSTANCE;
        }
    }

    public PolygonBasedStrategyConfig(double d, double d2, double d3, double d4) {
        this.fetchRadiusMeters = d;
        this.searchRadiusMeters = d2;
        this.maximumLocationAccuracyToAutoStartMeters = d3;
        this.locationThrottlingDurationSeconds = d4;
    }

    public static /* synthetic */ PolygonBasedStrategyConfig copy$default(PolygonBasedStrategyConfig polygonBasedStrategyConfig, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = polygonBasedStrategyConfig.fetchRadiusMeters;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = polygonBasedStrategyConfig.searchRadiusMeters;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = polygonBasedStrategyConfig.maximumLocationAccuracyToAutoStartMeters;
        }
        return polygonBasedStrategyConfig.copy(d5, d6, d3, (i & 8) != 0 ? polygonBasedStrategyConfig.locationThrottlingDurationSeconds : d4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(PolygonBasedStrategyConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.fetchRadiusMeters);
        output.G(serialDesc, 1, self.searchRadiusMeters);
        output.G(serialDesc, 2, self.maximumLocationAccuracyToAutoStartMeters);
        output.G(serialDesc, 3, self.locationThrottlingDurationSeconds);
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
    public final double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    @NotNull
    public final PolygonBasedStrategyConfig copy(double fetchRadiusMeters, double searchRadiusMeters, double maximumLocationAccuracyToAutoStartMeters, double locationThrottlingDurationSeconds) {
        return new PolygonBasedStrategyConfig(fetchRadiusMeters, searchRadiusMeters, maximumLocationAccuracyToAutoStartMeters, locationThrottlingDurationSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolygonBasedStrategyConfig)) {
            return false;
        }
        PolygonBasedStrategyConfig polygonBasedStrategyConfig = (PolygonBasedStrategyConfig) other;
        return Double.compare(this.fetchRadiusMeters, polygonBasedStrategyConfig.fetchRadiusMeters) == 0 && Double.compare(this.searchRadiusMeters, polygonBasedStrategyConfig.searchRadiusMeters) == 0 && Double.compare(this.maximumLocationAccuracyToAutoStartMeters, polygonBasedStrategyConfig.maximumLocationAccuracyToAutoStartMeters) == 0 && Double.compare(this.locationThrottlingDurationSeconds, polygonBasedStrategyConfig.locationThrottlingDurationSeconds) == 0;
    }

    public final double getFetchRadiusMeters() {
        return this.fetchRadiusMeters;
    }

    public final double getLocationThrottlingDurationSeconds() {
        return this.locationThrottlingDurationSeconds;
    }

    public final double getMaximumLocationAccuracyToAutoStartMeters() {
        return this.maximumLocationAccuracyToAutoStartMeters;
    }

    public final double getSearchRadiusMeters() {
        return this.searchRadiusMeters;
    }

    public int hashCode() {
        return Double.hashCode(this.locationThrottlingDurationSeconds) + J.a(this.maximumLocationAccuracyToAutoStartMeters, J.a(this.searchRadiusMeters, Double.hashCode(this.fetchRadiusMeters) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PolygonBasedStrategyConfig(fetchRadiusMeters=");
        sb.append(this.fetchRadiusMeters);
        sb.append(", searchRadiusMeters=");
        sb.append(this.searchRadiusMeters);
        sb.append(", maximumLocationAccuracyToAutoStartMeters=");
        sb.append(this.maximumLocationAccuracyToAutoStartMeters);
        sb.append(", locationThrottlingDurationSeconds=");
        return E.a(sb, this.locationThrottlingDurationSeconds, ')');
    }

    @Deprecated
    public /* synthetic */ PolygonBasedStrategyConfig(int i, double d, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, PolygonBasedStrategyConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.fetchRadiusMeters = d;
        this.searchRadiusMeters = d2;
        this.maximumLocationAccuracyToAutoStartMeters = d3;
        this.locationThrottlingDurationSeconds = d4;
    }
}
