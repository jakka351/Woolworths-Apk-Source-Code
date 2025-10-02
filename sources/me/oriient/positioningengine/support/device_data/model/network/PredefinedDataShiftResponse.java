package me.oriient.positioningengine.support.device_data.model.network;

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
import me.oriient.positioningengine.common.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002'(B;\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;", "", "seen1", "", "estimatedDataShift", "", "didEstimatedLastEstimationTime", "", "enforceNewEstimation", "updateDateDataShift", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DZZLjava/lang/String;)V", "getDidEstimatedLastEstimationTime", "()Z", "getEnforceNewEstimation", "getEstimatedDataShift", "()D", "getUpdateDateDataShift", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class PredefinedDataShiftResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final boolean didEstimatedLastEstimationTime;
    private final boolean enforceNewEstimation;
    private final double estimatedDataShift;

    @NotNull
    private final String updateDateDataShift;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/support/device_data/model/network/PredefinedDataShiftResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PredefinedDataShiftResponse> serializer() {
            return PredefinedDataShiftResponse$$serializer.INSTANCE;
        }
    }

    public PredefinedDataShiftResponse(double d, boolean z, boolean z2, @NotNull String updateDateDataShift) {
        Intrinsics.h(updateDateDataShift, "updateDateDataShift");
        this.estimatedDataShift = d;
        this.didEstimatedLastEstimationTime = z;
        this.enforceNewEstimation = z2;
        this.updateDateDataShift = updateDateDataShift;
    }

    public static /* synthetic */ PredefinedDataShiftResponse copy$default(PredefinedDataShiftResponse predefinedDataShiftResponse, double d, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = predefinedDataShiftResponse.estimatedDataShift;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            z = predefinedDataShiftResponse.didEstimatedLastEstimationTime;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = predefinedDataShiftResponse.enforceNewEstimation;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = predefinedDataShiftResponse.updateDateDataShift;
        }
        return predefinedDataShiftResponse.copy(d2, z3, z4, str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(PredefinedDataShiftResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.estimatedDataShift);
        output.o(serialDesc, 1, self.didEstimatedLastEstimationTime);
        output.o(serialDesc, 2, self.enforceNewEstimation);
        output.p(serialDesc, 3, self.updateDateDataShift);
    }

    /* renamed from: component1, reason: from getter */
    public final double getEstimatedDataShift() {
        return this.estimatedDataShift;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDidEstimatedLastEstimationTime() {
        return this.didEstimatedLastEstimationTime;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnforceNewEstimation() {
        return this.enforceNewEstimation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUpdateDateDataShift() {
        return this.updateDateDataShift;
    }

    @NotNull
    public final PredefinedDataShiftResponse copy(double estimatedDataShift, boolean didEstimatedLastEstimationTime, boolean enforceNewEstimation, @NotNull String updateDateDataShift) {
        Intrinsics.h(updateDateDataShift, "updateDateDataShift");
        return new PredefinedDataShiftResponse(estimatedDataShift, didEstimatedLastEstimationTime, enforceNewEstimation, updateDateDataShift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredefinedDataShiftResponse)) {
            return false;
        }
        PredefinedDataShiftResponse predefinedDataShiftResponse = (PredefinedDataShiftResponse) other;
        return Double.compare(this.estimatedDataShift, predefinedDataShiftResponse.estimatedDataShift) == 0 && this.didEstimatedLastEstimationTime == predefinedDataShiftResponse.didEstimatedLastEstimationTime && this.enforceNewEstimation == predefinedDataShiftResponse.enforceNewEstimation && Intrinsics.c(this.updateDateDataShift, predefinedDataShiftResponse.updateDateDataShift);
    }

    public final boolean getDidEstimatedLastEstimationTime() {
        return this.didEstimatedLastEstimationTime;
    }

    public final boolean getEnforceNewEstimation() {
        return this.enforceNewEstimation;
    }

    public final double getEstimatedDataShift() {
        return this.estimatedDataShift;
    }

    @NotNull
    public final String getUpdateDateDataShift() {
        return this.updateDateDataShift;
    }

    public int hashCode() {
        return this.updateDateDataShift.hashCode() + x.a(this.enforceNewEstimation, x.a(this.didEstimatedLastEstimationTime, Double.hashCode(this.estimatedDataShift) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PredefinedDataShiftResponse(estimatedDataShift=");
        sb.append(this.estimatedDataShift);
        sb.append(", didEstimatedLastEstimationTime=");
        sb.append(this.didEstimatedLastEstimationTime);
        sb.append(", enforceNewEstimation=");
        sb.append(this.enforceNewEstimation);
        sb.append(", updateDateDataShift=");
        return b.r(sb, this.updateDateDataShift, ')');
    }

    @Deprecated
    public /* synthetic */ PredefinedDataShiftResponse(int i, double d, boolean z, boolean z2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, PredefinedDataShiftResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.estimatedDataShift = d;
        this.didEstimatedLastEstimationTime = z;
        this.enforceNewEstimation = z2;
        this.updateDateDataShift = str;
    }
}
