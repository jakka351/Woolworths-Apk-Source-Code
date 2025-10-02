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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;", "", "seen1", "", "flipAxes", "", "calibrationExpirationTimeSeconds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Double;)V", "getCalibrationExpirationTimeSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFlipAxes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;", "equals", "other", "hashCode", "toConfig", "Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class RtEngineConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double calibrationExpirationTimeSeconds;

    @Nullable
    private final Boolean flipAxes;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/RtEngineConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RtEngineConfigResponse> serializer() {
            return RtEngineConfigResponse$$serializer.INSTANCE;
        }
    }

    public RtEngineConfigResponse() {
        this((Boolean) null, (Double) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RtEngineConfigResponse copy$default(RtEngineConfigResponse rtEngineConfigResponse, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = rtEngineConfigResponse.flipAxes;
        }
        if ((i & 2) != 0) {
            d = rtEngineConfigResponse.calibrationExpirationTimeSeconds;
        }
        return rtEngineConfigResponse.copy(bool, d);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RtEngineConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.flipAxes != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.flipAxes);
        }
        if (!output.q(serialDesc, 1) && self.calibrationExpirationTimeSeconds == null) {
            return;
        }
        output.w(serialDesc, 1, DoubleSerializer.f24792a, self.calibrationExpirationTimeSeconds);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getFlipAxes() {
        return this.flipAxes;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getCalibrationExpirationTimeSeconds() {
        return this.calibrationExpirationTimeSeconds;
    }

    @NotNull
    public final RtEngineConfigResponse copy(@Nullable Boolean flipAxes, @Nullable Double calibrationExpirationTimeSeconds) {
        return new RtEngineConfigResponse(flipAxes, calibrationExpirationTimeSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtEngineConfigResponse)) {
            return false;
        }
        RtEngineConfigResponse rtEngineConfigResponse = (RtEngineConfigResponse) other;
        return Intrinsics.c(this.flipAxes, rtEngineConfigResponse.flipAxes) && Intrinsics.c(this.calibrationExpirationTimeSeconds, rtEngineConfigResponse.calibrationExpirationTimeSeconds);
    }

    @Nullable
    public final Double getCalibrationExpirationTimeSeconds() {
        return this.calibrationExpirationTimeSeconds;
    }

    @Nullable
    public final Boolean getFlipAxes() {
        return this.flipAxes;
    }

    public int hashCode() {
        Boolean bool = this.flipAxes;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.calibrationExpirationTimeSeconds;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @NotNull
    public final RtEngineConfig toConfig() {
        Boolean bool = this.flipAxes;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Double d = this.calibrationExpirationTimeSeconds;
        return new RtEngineConfig(zBooleanValue, d != null ? d.doubleValue() : 3600.0d);
    }

    @NotNull
    public String toString() {
        return "RtEngineConfigResponse(flipAxes=" + this.flipAxes + ", calibrationExpirationTimeSeconds=" + this.calibrationExpirationTimeSeconds + ')';
    }

    @Deprecated
    public /* synthetic */ RtEngineConfigResponse(int i, Boolean bool, Double d, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.flipAxes = null;
        } else {
            this.flipAxes = bool;
        }
        if ((i & 2) == 0) {
            this.calibrationExpirationTimeSeconds = null;
        } else {
            this.calibrationExpirationTimeSeconds = d;
        }
    }

    public RtEngineConfigResponse(@Nullable Boolean bool, @Nullable Double d) {
        this.flipAxes = bool;
        this.calibrationExpirationTimeSeconds = d;
    }

    public /* synthetic */ RtEngineConfigResponse(Boolean bool, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : d);
    }
}
