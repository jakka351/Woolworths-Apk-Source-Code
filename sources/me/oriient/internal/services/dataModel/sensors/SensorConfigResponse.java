package me.oriient.internal.services.dataModel.sensors;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BK\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006."}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;", "", "seen1", "", "timeJumpCorrectionThresholdsSec", "", "timeJumpWarningThresholdsSec", "sameValueThresholdSec", "forceCriticalPriority", "", "maxReportLatencyMicroSec", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V", "getForceCriticalPriority", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxReportLatencyMicroSec", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSameValueThresholdSec", "getTimeJumpCorrectionThresholdsSec", "getTimeJumpWarningThresholdsSec", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SensorConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Boolean forceCriticalPriority;

    @Nullable
    private final Double maxReportLatencyMicroSec;

    @Nullable
    private final Double sameValueThresholdSec;

    @Nullable
    private final Double timeJumpCorrectionThresholdsSec;

    @Nullable
    private final Double timeJumpWarningThresholdsSec;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/sensors/SensorConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SensorConfigResponse> serializer() {
            return SensorConfigResponse$$serializer.INSTANCE;
        }
    }

    public SensorConfigResponse() {
        this((Double) null, (Double) null, (Double) null, (Boolean) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SensorConfigResponse copy$default(SensorConfigResponse sensorConfigResponse, Double d, Double d2, Double d3, Boolean bool, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = sensorConfigResponse.timeJumpCorrectionThresholdsSec;
        }
        if ((i & 2) != 0) {
            d2 = sensorConfigResponse.timeJumpWarningThresholdsSec;
        }
        if ((i & 4) != 0) {
            d3 = sensorConfigResponse.sameValueThresholdSec;
        }
        if ((i & 8) != 0) {
            bool = sensorConfigResponse.forceCriticalPriority;
        }
        if ((i & 16) != 0) {
            d4 = sensorConfigResponse.maxReportLatencyMicroSec;
        }
        Double d5 = d4;
        Double d6 = d3;
        return sensorConfigResponse.copy(d, d2, d6, bool, d5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SensorConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.timeJumpCorrectionThresholdsSec != null) {
            output.w(serialDesc, 0, DoubleSerializer.f24792a, self.timeJumpCorrectionThresholdsSec);
        }
        if (output.q(serialDesc, 1) || self.timeJumpWarningThresholdsSec != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.timeJumpWarningThresholdsSec);
        }
        if (output.q(serialDesc, 2) || self.sameValueThresholdSec != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.sameValueThresholdSec);
        }
        if (output.q(serialDesc, 3) || self.forceCriticalPriority != null) {
            output.w(serialDesc, 3, BooleanSerializer.f24779a, self.forceCriticalPriority);
        }
        if (!output.q(serialDesc, 4) && self.maxReportLatencyMicroSec == null) {
            return;
        }
        output.w(serialDesc, 4, DoubleSerializer.f24792a, self.maxReportLatencyMicroSec);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getTimeJumpCorrectionThresholdsSec() {
        return this.timeJumpCorrectionThresholdsSec;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getTimeJumpWarningThresholdsSec() {
        return this.timeJumpWarningThresholdsSec;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getSameValueThresholdSec() {
        return this.sameValueThresholdSec;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getForceCriticalPriority() {
        return this.forceCriticalPriority;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    @NotNull
    public final SensorConfigResponse copy(@Nullable Double timeJumpCorrectionThresholdsSec, @Nullable Double timeJumpWarningThresholdsSec, @Nullable Double sameValueThresholdSec, @Nullable Boolean forceCriticalPriority, @Nullable Double maxReportLatencyMicroSec) {
        return new SensorConfigResponse(timeJumpCorrectionThresholdsSec, timeJumpWarningThresholdsSec, sameValueThresholdSec, forceCriticalPriority, maxReportLatencyMicroSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorConfigResponse)) {
            return false;
        }
        SensorConfigResponse sensorConfigResponse = (SensorConfigResponse) other;
        return Intrinsics.c(this.timeJumpCorrectionThresholdsSec, sensorConfigResponse.timeJumpCorrectionThresholdsSec) && Intrinsics.c(this.timeJumpWarningThresholdsSec, sensorConfigResponse.timeJumpWarningThresholdsSec) && Intrinsics.c(this.sameValueThresholdSec, sensorConfigResponse.sameValueThresholdSec) && Intrinsics.c(this.forceCriticalPriority, sensorConfigResponse.forceCriticalPriority) && Intrinsics.c(this.maxReportLatencyMicroSec, sensorConfigResponse.maxReportLatencyMicroSec);
    }

    @Nullable
    public final Boolean getForceCriticalPriority() {
        return this.forceCriticalPriority;
    }

    @Nullable
    public final Double getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    @Nullable
    public final Double getSameValueThresholdSec() {
        return this.sameValueThresholdSec;
    }

    @Nullable
    public final Double getTimeJumpCorrectionThresholdsSec() {
        return this.timeJumpCorrectionThresholdsSec;
    }

    @Nullable
    public final Double getTimeJumpWarningThresholdsSec() {
        return this.timeJumpWarningThresholdsSec;
    }

    public int hashCode() {
        Double d = this.timeJumpCorrectionThresholdsSec;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.timeJumpWarningThresholdsSec;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.sameValueThresholdSec;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.forceCriticalPriority;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d4 = this.maxReportLatencyMicroSec;
        return iHashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SensorConfigResponse(timeJumpCorrectionThresholdsSec=" + this.timeJumpCorrectionThresholdsSec + ", timeJumpWarningThresholdsSec=" + this.timeJumpWarningThresholdsSec + ", sameValueThresholdSec=" + this.sameValueThresholdSec + ", forceCriticalPriority=" + this.forceCriticalPriority + ", maxReportLatencyMicroSec=" + this.maxReportLatencyMicroSec + ')';
    }

    @Deprecated
    public /* synthetic */ SensorConfigResponse(int i, Double d, Double d2, Double d3, Boolean bool, Double d4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.timeJumpCorrectionThresholdsSec = null;
        } else {
            this.timeJumpCorrectionThresholdsSec = d;
        }
        if ((i & 2) == 0) {
            this.timeJumpWarningThresholdsSec = null;
        } else {
            this.timeJumpWarningThresholdsSec = d2;
        }
        if ((i & 4) == 0) {
            this.sameValueThresholdSec = null;
        } else {
            this.sameValueThresholdSec = d3;
        }
        if ((i & 8) == 0) {
            this.forceCriticalPriority = null;
        } else {
            this.forceCriticalPriority = bool;
        }
        if ((i & 16) == 0) {
            this.maxReportLatencyMicroSec = null;
        } else {
            this.maxReportLatencyMicroSec = d4;
        }
    }

    public SensorConfigResponse(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Boolean bool, @Nullable Double d4) {
        this.timeJumpCorrectionThresholdsSec = d;
        this.timeJumpWarningThresholdsSec = d2;
        this.sameValueThresholdSec = d3;
        this.forceCriticalPriority = bool;
        this.maxReportLatencyMicroSec = d4;
    }

    public /* synthetic */ SensorConfigResponse(Double d, Double d2, Double d3, Boolean bool, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : d4);
    }
}
