package me.oriient.internal.services.dataModel.engine;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020%HÖ\u0001J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u00060"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;", "", "seen1", "", "moGridIntervalDegrees", "", "moGridAllowedDeviationDegreesWhenIdle", "moGridAllowedDeviationDegreesWhenWalking", "positionsBufferSize", "minimumWalkingDistance", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "getMinimumWalkingDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMoGridAllowedDeviationDegreesWhenIdle", "getMoGridAllowedDeviationDegreesWhenWalking", "getMoGridIntervalDegrees", "getPositionsBufferSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;", "equals", "", "other", "hashCode", "toConfig", "Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MainOrientationCalculatorConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double minimumWalkingDistance;

    @Nullable
    private final Double moGridAllowedDeviationDegreesWhenIdle;

    @Nullable
    private final Double moGridAllowedDeviationDegreesWhenWalking;

    @Nullable
    private final Double moGridIntervalDegrees;

    @Nullable
    private final Integer positionsBufferSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/MainOrientationCalculatorConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MainOrientationCalculatorConfigResponse> serializer() {
            return MainOrientationCalculatorConfigResponse$$serializer.INSTANCE;
        }
    }

    public MainOrientationCalculatorConfigResponse() {
        this((Double) null, (Double) null, (Double) null, (Integer) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MainOrientationCalculatorConfigResponse copy$default(MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse, Double d, Double d2, Double d3, Integer num, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mainOrientationCalculatorConfigResponse.moGridIntervalDegrees;
        }
        if ((i & 2) != 0) {
            d2 = mainOrientationCalculatorConfigResponse.moGridAllowedDeviationDegreesWhenIdle;
        }
        if ((i & 4) != 0) {
            d3 = mainOrientationCalculatorConfigResponse.moGridAllowedDeviationDegreesWhenWalking;
        }
        if ((i & 8) != 0) {
            num = mainOrientationCalculatorConfigResponse.positionsBufferSize;
        }
        if ((i & 16) != 0) {
            d4 = mainOrientationCalculatorConfigResponse.minimumWalkingDistance;
        }
        Double d5 = d4;
        Double d6 = d3;
        return mainOrientationCalculatorConfigResponse.copy(d, d2, d6, num, d5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MainOrientationCalculatorConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.moGridIntervalDegrees != null) {
            output.w(serialDesc, 0, DoubleSerializer.f24792a, self.moGridIntervalDegrees);
        }
        if (output.q(serialDesc, 1) || self.moGridAllowedDeviationDegreesWhenIdle != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.moGridAllowedDeviationDegreesWhenIdle);
        }
        if (output.q(serialDesc, 2) || self.moGridAllowedDeviationDegreesWhenWalking != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.moGridAllowedDeviationDegreesWhenWalking);
        }
        if (output.q(serialDesc, 3) || self.positionsBufferSize != null) {
            output.w(serialDesc, 3, IntSerializer.f24800a, self.positionsBufferSize);
        }
        if (!output.q(serialDesc, 4) && self.minimumWalkingDistance == null) {
            return;
        }
        output.w(serialDesc, 4, DoubleSerializer.f24792a, self.minimumWalkingDistance);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getMoGridIntervalDegrees() {
        return this.moGridIntervalDegrees;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getMoGridAllowedDeviationDegreesWhenIdle() {
        return this.moGridAllowedDeviationDegreesWhenIdle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getMoGridAllowedDeviationDegreesWhenWalking() {
        return this.moGridAllowedDeviationDegreesWhenWalking;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPositionsBufferSize() {
        return this.positionsBufferSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getMinimumWalkingDistance() {
        return this.minimumWalkingDistance;
    }

    @NotNull
    public final MainOrientationCalculatorConfigResponse copy(@Nullable Double moGridIntervalDegrees, @Nullable Double moGridAllowedDeviationDegreesWhenIdle, @Nullable Double moGridAllowedDeviationDegreesWhenWalking, @Nullable Integer positionsBufferSize, @Nullable Double minimumWalkingDistance) {
        return new MainOrientationCalculatorConfigResponse(moGridIntervalDegrees, moGridAllowedDeviationDegreesWhenIdle, moGridAllowedDeviationDegreesWhenWalking, positionsBufferSize, minimumWalkingDistance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainOrientationCalculatorConfigResponse)) {
            return false;
        }
        MainOrientationCalculatorConfigResponse mainOrientationCalculatorConfigResponse = (MainOrientationCalculatorConfigResponse) other;
        return Intrinsics.c(this.moGridIntervalDegrees, mainOrientationCalculatorConfigResponse.moGridIntervalDegrees) && Intrinsics.c(this.moGridAllowedDeviationDegreesWhenIdle, mainOrientationCalculatorConfigResponse.moGridAllowedDeviationDegreesWhenIdle) && Intrinsics.c(this.moGridAllowedDeviationDegreesWhenWalking, mainOrientationCalculatorConfigResponse.moGridAllowedDeviationDegreesWhenWalking) && Intrinsics.c(this.positionsBufferSize, mainOrientationCalculatorConfigResponse.positionsBufferSize) && Intrinsics.c(this.minimumWalkingDistance, mainOrientationCalculatorConfigResponse.minimumWalkingDistance);
    }

    @Nullable
    public final Double getMinimumWalkingDistance() {
        return this.minimumWalkingDistance;
    }

    @Nullable
    public final Double getMoGridAllowedDeviationDegreesWhenIdle() {
        return this.moGridAllowedDeviationDegreesWhenIdle;
    }

    @Nullable
    public final Double getMoGridAllowedDeviationDegreesWhenWalking() {
        return this.moGridAllowedDeviationDegreesWhenWalking;
    }

    @Nullable
    public final Double getMoGridIntervalDegrees() {
        return this.moGridIntervalDegrees;
    }

    @Nullable
    public final Integer getPositionsBufferSize() {
        return this.positionsBufferSize;
    }

    public int hashCode() {
        Double d = this.moGridIntervalDegrees;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.moGridAllowedDeviationDegreesWhenIdle;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.moGridAllowedDeviationDegreesWhenWalking;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.positionsBufferSize;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d4 = this.minimumWalkingDistance;
        return iHashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    @NotNull
    public final MainOrientationCalculatorConfig toConfig() {
        Double d = this.moGridIntervalDegrees;
        double radians = Math.toRadians(d != null ? d.doubleValue() : 90.0d);
        Double d2 = this.moGridAllowedDeviationDegreesWhenIdle;
        double radians2 = Math.toRadians(d2 != null ? d2.doubleValue() : 12.0d);
        Double d3 = this.moGridAllowedDeviationDegreesWhenWalking;
        double radians3 = Math.toRadians(d3 != null ? d3.doubleValue() : 30.0d);
        Integer num = this.positionsBufferSize;
        int iIntValue = num != null ? num.intValue() : 15;
        Double d4 = this.minimumWalkingDistance;
        return new MainOrientationCalculatorConfig(radians, radians2, radians3, iIntValue, d4 != null ? d4.doubleValue() : 2.0d);
    }

    @NotNull
    public String toString() {
        return "MainOrientationCalculatorConfigResponse(moGridIntervalDegrees=" + this.moGridIntervalDegrees + ", moGridAllowedDeviationDegreesWhenIdle=" + this.moGridAllowedDeviationDegreesWhenIdle + ", moGridAllowedDeviationDegreesWhenWalking=" + this.moGridAllowedDeviationDegreesWhenWalking + ", positionsBufferSize=" + this.positionsBufferSize + ", minimumWalkingDistance=" + this.minimumWalkingDistance + ')';
    }

    @Deprecated
    public /* synthetic */ MainOrientationCalculatorConfigResponse(int i, Double d, Double d2, Double d3, Integer num, Double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.moGridIntervalDegrees = null;
        } else {
            this.moGridIntervalDegrees = d;
        }
        if ((i & 2) == 0) {
            this.moGridAllowedDeviationDegreesWhenIdle = null;
        } else {
            this.moGridAllowedDeviationDegreesWhenIdle = d2;
        }
        if ((i & 4) == 0) {
            this.moGridAllowedDeviationDegreesWhenWalking = null;
        } else {
            this.moGridAllowedDeviationDegreesWhenWalking = d3;
        }
        if ((i & 8) == 0) {
            this.positionsBufferSize = null;
        } else {
            this.positionsBufferSize = num;
        }
        if ((i & 16) == 0) {
            this.minimumWalkingDistance = null;
        } else {
            this.minimumWalkingDistance = d4;
        }
    }

    public MainOrientationCalculatorConfigResponse(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Integer num, @Nullable Double d4) {
        this.moGridIntervalDegrees = d;
        this.moGridAllowedDeviationDegreesWhenIdle = d2;
        this.moGridAllowedDeviationDegreesWhenWalking = d3;
        this.positionsBufferSize = num;
        this.minimumWalkingDistance = d4;
    }

    public /* synthetic */ MainOrientationCalculatorConfigResponse(Double d, Double d2, Double d3, Integer num, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : d4);
    }
}
