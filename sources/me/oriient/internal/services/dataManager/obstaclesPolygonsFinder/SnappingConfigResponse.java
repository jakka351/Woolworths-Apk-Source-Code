package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import androidx.annotation.Keep;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006("}, d2 = {"Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/SnappingConfigResponse;", "", "seen1", "", "enableSnappingWhenConvertingCoordinates", "", "snappingWhenConvertingMaxDistanceMeters", "", "tooFarToSnapWarningDistanceMeters", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "getEnableSnappingWhenConvertingCoordinates", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSnappingWhenConvertingMaxDistanceMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTooFarToSnapWarningDistanceMeters", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/SnappingConfigResponse;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SnappingConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Boolean enableSnappingWhenConvertingCoordinates;

    @Nullable
    private final Double snappingWhenConvertingMaxDistanceMeters;

    @Nullable
    private final Double tooFarToSnapWarningDistanceMeters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/SnappingConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/obstaclesPolygonsFinder/SnappingConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SnappingConfigResponse> serializer() {
            return SnappingConfigResponse$$serializer.INSTANCE;
        }
    }

    public SnappingConfigResponse() {
        this((Boolean) null, (Double) null, (Double) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SnappingConfigResponse copy$default(SnappingConfigResponse snappingConfigResponse, Boolean bool, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = snappingConfigResponse.enableSnappingWhenConvertingCoordinates;
        }
        if ((i & 2) != 0) {
            d = snappingConfigResponse.snappingWhenConvertingMaxDistanceMeters;
        }
        if ((i & 4) != 0) {
            d2 = snappingConfigResponse.tooFarToSnapWarningDistanceMeters;
        }
        return snappingConfigResponse.copy(bool, d, d2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SnappingConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.enableSnappingWhenConvertingCoordinates != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.enableSnappingWhenConvertingCoordinates);
        }
        if (output.q(serialDesc, 1) || self.snappingWhenConvertingMaxDistanceMeters != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.snappingWhenConvertingMaxDistanceMeters);
        }
        if (!output.q(serialDesc, 2) && self.tooFarToSnapWarningDistanceMeters == null) {
            return;
        }
        output.w(serialDesc, 2, DoubleSerializer.f24792a, self.tooFarToSnapWarningDistanceMeters);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getEnableSnappingWhenConvertingCoordinates() {
        return this.enableSnappingWhenConvertingCoordinates;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getSnappingWhenConvertingMaxDistanceMeters() {
        return this.snappingWhenConvertingMaxDistanceMeters;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getTooFarToSnapWarningDistanceMeters() {
        return this.tooFarToSnapWarningDistanceMeters;
    }

    @NotNull
    public final SnappingConfigResponse copy(@Nullable Boolean enableSnappingWhenConvertingCoordinates, @Nullable Double snappingWhenConvertingMaxDistanceMeters, @Nullable Double tooFarToSnapWarningDistanceMeters) {
        return new SnappingConfigResponse(enableSnappingWhenConvertingCoordinates, snappingWhenConvertingMaxDistanceMeters, tooFarToSnapWarningDistanceMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnappingConfigResponse)) {
            return false;
        }
        SnappingConfigResponse snappingConfigResponse = (SnappingConfigResponse) other;
        return Intrinsics.c(this.enableSnappingWhenConvertingCoordinates, snappingConfigResponse.enableSnappingWhenConvertingCoordinates) && Intrinsics.c(this.snappingWhenConvertingMaxDistanceMeters, snappingConfigResponse.snappingWhenConvertingMaxDistanceMeters) && Intrinsics.c(this.tooFarToSnapWarningDistanceMeters, snappingConfigResponse.tooFarToSnapWarningDistanceMeters);
    }

    @Nullable
    public final Boolean getEnableSnappingWhenConvertingCoordinates() {
        return this.enableSnappingWhenConvertingCoordinates;
    }

    @Nullable
    public final Double getSnappingWhenConvertingMaxDistanceMeters() {
        return this.snappingWhenConvertingMaxDistanceMeters;
    }

    @Nullable
    public final Double getTooFarToSnapWarningDistanceMeters() {
        return this.tooFarToSnapWarningDistanceMeters;
    }

    public int hashCode() {
        Boolean bool = this.enableSnappingWhenConvertingCoordinates;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.snappingWhenConvertingMaxDistanceMeters;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.tooFarToSnapWarningDistanceMeters;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SnappingConfigResponse(enableSnappingWhenConvertingCoordinates=" + this.enableSnappingWhenConvertingCoordinates + ", snappingWhenConvertingMaxDistanceMeters=" + this.snappingWhenConvertingMaxDistanceMeters + ", tooFarToSnapWarningDistanceMeters=" + this.tooFarToSnapWarningDistanceMeters + ')';
    }

    @Deprecated
    public /* synthetic */ SnappingConfigResponse(int i, Boolean bool, Double d, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enableSnappingWhenConvertingCoordinates = null;
        } else {
            this.enableSnappingWhenConvertingCoordinates = bool;
        }
        if ((i & 2) == 0) {
            this.snappingWhenConvertingMaxDistanceMeters = null;
        } else {
            this.snappingWhenConvertingMaxDistanceMeters = d;
        }
        if ((i & 4) == 0) {
            this.tooFarToSnapWarningDistanceMeters = null;
        } else {
            this.tooFarToSnapWarningDistanceMeters = d2;
        }
    }

    public SnappingConfigResponse(@Nullable Boolean bool, @Nullable Double d, @Nullable Double d2) {
        this.enableSnappingWhenConvertingCoordinates = bool;
        this.snappingWhenConvertingMaxDistanceMeters = d;
        this.tooFarToSnapWarningDistanceMeters = d2;
    }

    public /* synthetic */ SnappingConfigResponse(Boolean bool, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2);
    }
}
