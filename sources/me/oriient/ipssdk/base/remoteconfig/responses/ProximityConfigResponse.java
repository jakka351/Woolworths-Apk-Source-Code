package me.oriient.ipssdk.base.remoteconfig.responses;

import androidx.annotation.Keep;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.base.remoteconfig.ProximityConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020(HÖ\u0001J&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÁ\u0001¢\u0006\u0002\b0R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u00063"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse;", "", "seen1", "", "pendingRequestTimeoutSeconds", "", "positionUpdatesThrottlingSeconds", "closeWalkingDistanceMeters", "mediumWalkingDistanceMeters", "longWalkingDistanceMeters", "resolverErrorsToDropState", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "getCloseWalkingDistanceMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongWalkingDistanceMeters", "getMediumWalkingDistanceMeters", "getPendingRequestTimeoutSeconds", "getPositionUpdatesThrottlingSeconds", "getResolverErrorsToDropState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lme/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse;", "equals", "", "other", "hashCode", "toProximityConfig", "Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_base", "$serializer", "Companion", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class ProximityConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double closeWalkingDistanceMeters;

    @Nullable
    private final Double longWalkingDistanceMeters;

    @Nullable
    private final Double mediumWalkingDistanceMeters;

    @Nullable
    private final Double pendingRequestTimeoutSeconds;

    @Nullable
    private final Double positionUpdatesThrottlingSeconds;

    @Nullable
    private final Integer resolverErrorsToDropState;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/base/remoteconfig/responses/ProximityConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<ProximityConfigResponse> serializer() {
            return ProximityConfigResponse$$serializer.INSTANCE;
        }
    }

    public ProximityConfigResponse() {
        this((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProximityConfigResponse copy$default(ProximityConfigResponse proximityConfigResponse, Double d, Double d2, Double d3, Double d4, Double d5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = proximityConfigResponse.pendingRequestTimeoutSeconds;
        }
        if ((i & 2) != 0) {
            d2 = proximityConfigResponse.positionUpdatesThrottlingSeconds;
        }
        if ((i & 4) != 0) {
            d3 = proximityConfigResponse.closeWalkingDistanceMeters;
        }
        if ((i & 8) != 0) {
            d4 = proximityConfigResponse.mediumWalkingDistanceMeters;
        }
        if ((i & 16) != 0) {
            d5 = proximityConfigResponse.longWalkingDistanceMeters;
        }
        if ((i & 32) != 0) {
            num = proximityConfigResponse.resolverErrorsToDropState;
        }
        Double d6 = d5;
        Integer num2 = num;
        return proximityConfigResponse.copy(d, d2, d3, d4, d6, num2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_base(ProximityConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.pendingRequestTimeoutSeconds != null) {
            output.w(serialDesc, 0, DoubleSerializer.f24792a, self.pendingRequestTimeoutSeconds);
        }
        if (output.q(serialDesc, 1) || self.positionUpdatesThrottlingSeconds != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.positionUpdatesThrottlingSeconds);
        }
        if (output.q(serialDesc, 2) || self.closeWalkingDistanceMeters != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.closeWalkingDistanceMeters);
        }
        if (output.q(serialDesc, 3) || self.mediumWalkingDistanceMeters != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.mediumWalkingDistanceMeters);
        }
        if (output.q(serialDesc, 4) || self.longWalkingDistanceMeters != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.longWalkingDistanceMeters);
        }
        if (!output.q(serialDesc, 5) && self.resolverErrorsToDropState == null) {
            return;
        }
        output.w(serialDesc, 5, IntSerializer.f24800a, self.resolverErrorsToDropState);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getPendingRequestTimeoutSeconds() {
        return this.pendingRequestTimeoutSeconds;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getPositionUpdatesThrottlingSeconds() {
        return this.positionUpdatesThrottlingSeconds;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getCloseWalkingDistanceMeters() {
        return this.closeWalkingDistanceMeters;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getMediumWalkingDistanceMeters() {
        return this.mediumWalkingDistanceMeters;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getLongWalkingDistanceMeters() {
        return this.longWalkingDistanceMeters;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getResolverErrorsToDropState() {
        return this.resolverErrorsToDropState;
    }

    @NotNull
    public final ProximityConfigResponse copy(@Nullable Double pendingRequestTimeoutSeconds, @Nullable Double positionUpdatesThrottlingSeconds, @Nullable Double closeWalkingDistanceMeters, @Nullable Double mediumWalkingDistanceMeters, @Nullable Double longWalkingDistanceMeters, @Nullable Integer resolverErrorsToDropState) {
        return new ProximityConfigResponse(pendingRequestTimeoutSeconds, positionUpdatesThrottlingSeconds, closeWalkingDistanceMeters, mediumWalkingDistanceMeters, longWalkingDistanceMeters, resolverErrorsToDropState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProximityConfigResponse)) {
            return false;
        }
        ProximityConfigResponse proximityConfigResponse = (ProximityConfigResponse) other;
        return Intrinsics.c(this.pendingRequestTimeoutSeconds, proximityConfigResponse.pendingRequestTimeoutSeconds) && Intrinsics.c(this.positionUpdatesThrottlingSeconds, proximityConfigResponse.positionUpdatesThrottlingSeconds) && Intrinsics.c(this.closeWalkingDistanceMeters, proximityConfigResponse.closeWalkingDistanceMeters) && Intrinsics.c(this.mediumWalkingDistanceMeters, proximityConfigResponse.mediumWalkingDistanceMeters) && Intrinsics.c(this.longWalkingDistanceMeters, proximityConfigResponse.longWalkingDistanceMeters) && Intrinsics.c(this.resolverErrorsToDropState, proximityConfigResponse.resolverErrorsToDropState);
    }

    @Nullable
    public final Double getCloseWalkingDistanceMeters() {
        return this.closeWalkingDistanceMeters;
    }

    @Nullable
    public final Double getLongWalkingDistanceMeters() {
        return this.longWalkingDistanceMeters;
    }

    @Nullable
    public final Double getMediumWalkingDistanceMeters() {
        return this.mediumWalkingDistanceMeters;
    }

    @Nullable
    public final Double getPendingRequestTimeoutSeconds() {
        return this.pendingRequestTimeoutSeconds;
    }

    @Nullable
    public final Double getPositionUpdatesThrottlingSeconds() {
        return this.positionUpdatesThrottlingSeconds;
    }

    @Nullable
    public final Integer getResolverErrorsToDropState() {
        return this.resolverErrorsToDropState;
    }

    public int hashCode() {
        Double d = this.pendingRequestTimeoutSeconds;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.positionUpdatesThrottlingSeconds;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.closeWalkingDistanceMeters;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.mediumWalkingDistanceMeters;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.longWalkingDistanceMeters;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num = this.resolverErrorsToDropState;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final ProximityConfig toProximityConfig() {
        Double d = this.pendingRequestTimeoutSeconds;
        double dDoubleValue = d != null ? d.doubleValue() : 5.0d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = (long) (dDoubleValue * timeUnit.toMillis(1L));
        Double d2 = this.positionUpdatesThrottlingSeconds;
        long jDoubleValue = (long) ((d2 != null ? d2.doubleValue() : 1.0d) * timeUnit.toMillis(1L));
        Double d3 = this.closeWalkingDistanceMeters;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 3.0d;
        Double d4 = this.mediumWalkingDistanceMeters;
        double dDoubleValue3 = d4 != null ? d4.doubleValue() : 7.0d;
        Double d5 = this.longWalkingDistanceMeters;
        double dDoubleValue4 = d5 != null ? d5.doubleValue() : 11.0d;
        Integer num = this.resolverErrorsToDropState;
        return new ProximityConfig(millis, jDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, num != null ? num.intValue() : 5);
    }

    @NotNull
    public String toString() {
        return "ProximityConfigResponse(pendingRequestTimeoutSeconds=" + this.pendingRequestTimeoutSeconds + ", positionUpdatesThrottlingSeconds=" + this.positionUpdatesThrottlingSeconds + ", closeWalkingDistanceMeters=" + this.closeWalkingDistanceMeters + ", mediumWalkingDistanceMeters=" + this.mediumWalkingDistanceMeters + ", longWalkingDistanceMeters=" + this.longWalkingDistanceMeters + ", resolverErrorsToDropState=" + this.resolverErrorsToDropState + ')';
    }

    @Deprecated
    public /* synthetic */ ProximityConfigResponse(int i, Double d, Double d2, Double d3, Double d4, Double d5, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pendingRequestTimeoutSeconds = null;
        } else {
            this.pendingRequestTimeoutSeconds = d;
        }
        if ((i & 2) == 0) {
            this.positionUpdatesThrottlingSeconds = null;
        } else {
            this.positionUpdatesThrottlingSeconds = d2;
        }
        if ((i & 4) == 0) {
            this.closeWalkingDistanceMeters = null;
        } else {
            this.closeWalkingDistanceMeters = d3;
        }
        if ((i & 8) == 0) {
            this.mediumWalkingDistanceMeters = null;
        } else {
            this.mediumWalkingDistanceMeters = d4;
        }
        if ((i & 16) == 0) {
            this.longWalkingDistanceMeters = null;
        } else {
            this.longWalkingDistanceMeters = d5;
        }
        if ((i & 32) == 0) {
            this.resolverErrorsToDropState = null;
        } else {
            this.resolverErrorsToDropState = num;
        }
    }

    public ProximityConfigResponse(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Integer num) {
        this.pendingRequestTimeoutSeconds = d;
        this.positionUpdatesThrottlingSeconds = d2;
        this.closeWalkingDistanceMeters = d3;
        this.mediumWalkingDistanceMeters = d4;
        this.longWalkingDistanceMeters = d5;
        this.resolverErrorsToDropState = num;
    }

    public /* synthetic */ ProximityConfigResponse(Double d, Double d2, Double d3, Double d4, Double d5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5, (i & 32) != 0 ? null : num);
    }
}
