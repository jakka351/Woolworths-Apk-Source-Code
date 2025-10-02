package me.oriient.positioningengine.support.device_data.model;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.positioningengine.common.x;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BE\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\"J\t\u0010#\u001a\u00020\nHÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006."}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "", "seen1", "", "estimatedDataShift", "", "didEstimatedLastEstimationTime", "", "enforceNewEstimation", "updateDateDataShiftIso", "", "lastSuccessfulCalibrationDateIso", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DZZLjava/lang/String;Ljava/lang/String;)V", "getDidEstimatedLastEstimationTime", "()Z", "getEnforceNewEstimation", "getEstimatedDataShift", "()D", "getLastSuccessfulCalibrationDateIso", "()Ljava/lang/String;", "getUpdateDateDataShiftIso", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "logDescription", "", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class PredefinedDataShift {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final boolean didEstimatedLastEstimationTime;
    private final boolean enforceNewEstimation;
    private final double estimatedDataShift;

    @Nullable
    private final String lastSuccessfulCalibrationDateIso;

    @NotNull
    private final String updateDateDataShiftIso;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PredefinedDataShift> serializer() {
            return PredefinedDataShift$$serializer.INSTANCE;
        }
    }

    public PredefinedDataShift(double d, boolean z, boolean z2, @NotNull String updateDateDataShiftIso, @Nullable String str) {
        Intrinsics.h(updateDateDataShiftIso, "updateDateDataShiftIso");
        this.estimatedDataShift = d;
        this.didEstimatedLastEstimationTime = z;
        this.enforceNewEstimation = z2;
        this.updateDateDataShiftIso = updateDateDataShiftIso;
        this.lastSuccessfulCalibrationDateIso = str;
    }

    public static /* synthetic */ PredefinedDataShift copy$default(PredefinedDataShift predefinedDataShift, double d, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = predefinedDataShift.estimatedDataShift;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            z = predefinedDataShift.didEstimatedLastEstimationTime;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = predefinedDataShift.enforceNewEstimation;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = predefinedDataShift.updateDateDataShiftIso;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = predefinedDataShift.lastSuccessfulCalibrationDateIso;
        }
        return predefinedDataShift.copy(d2, z3, z4, str3, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(PredefinedDataShift self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.estimatedDataShift);
        output.o(serialDesc, 1, self.didEstimatedLastEstimationTime);
        output.o(serialDesc, 2, self.enforceNewEstimation);
        output.p(serialDesc, 3, self.updateDateDataShiftIso);
        if (!output.q(serialDesc, 4) && self.lastSuccessfulCalibrationDateIso == null) {
            return;
        }
        output.w(serialDesc, 4, StringSerializer.f24821a, self.lastSuccessfulCalibrationDateIso);
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
    public final String getUpdateDateDataShiftIso() {
        return this.updateDateDataShiftIso;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getLastSuccessfulCalibrationDateIso() {
        return this.lastSuccessfulCalibrationDateIso;
    }

    @NotNull
    public final PredefinedDataShift copy(double estimatedDataShift, boolean didEstimatedLastEstimationTime, boolean enforceNewEstimation, @NotNull String updateDateDataShiftIso, @Nullable String lastSuccessfulCalibrationDateIso) {
        Intrinsics.h(updateDateDataShiftIso, "updateDateDataShiftIso");
        return new PredefinedDataShift(estimatedDataShift, didEstimatedLastEstimationTime, enforceNewEstimation, updateDateDataShiftIso, lastSuccessfulCalibrationDateIso);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredefinedDataShift)) {
            return false;
        }
        PredefinedDataShift predefinedDataShift = (PredefinedDataShift) other;
        return Double.compare(this.estimatedDataShift, predefinedDataShift.estimatedDataShift) == 0 && this.didEstimatedLastEstimationTime == predefinedDataShift.didEstimatedLastEstimationTime && this.enforceNewEstimation == predefinedDataShift.enforceNewEstimation && Intrinsics.c(this.updateDateDataShiftIso, predefinedDataShift.updateDateDataShiftIso) && Intrinsics.c(this.lastSuccessfulCalibrationDateIso, predefinedDataShift.lastSuccessfulCalibrationDateIso);
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

    @Nullable
    public final String getLastSuccessfulCalibrationDateIso() {
        return this.lastSuccessfulCalibrationDateIso;
    }

    @NotNull
    public final String getUpdateDateDataShiftIso() {
        return this.updateDateDataShiftIso;
    }

    public int hashCode() {
        int iA = z.a(this.updateDateDataShiftIso, x.a(this.enforceNewEstimation, x.a(this.didEstimatedLastEstimationTime, Double.hashCode(this.estimatedDataShift) * 31, 31), 31), 31);
        String str = this.lastSuccessfulCalibrationDateIso;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final Map<String, String> logDescription() {
        return MapsKt.j(new Pair("estimatedDataShift", String.valueOf(this.estimatedDataShift)), new Pair("didEstimatedLastEstimationTime", String.valueOf(this.didEstimatedLastEstimationTime)), new Pair("enforceNewEstimation", String.valueOf(this.enforceNewEstimation)), new Pair("updateDateDataShift", this.updateDateDataShiftIso));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PredefinedDataShift(estimatedDataShift=");
        sb.append(this.estimatedDataShift);
        sb.append(", didEstimatedLastEstimationTime=");
        sb.append(this.didEstimatedLastEstimationTime);
        sb.append(", enforceNewEstimation=");
        sb.append(this.enforceNewEstimation);
        sb.append(", updateDateDataShiftIso=");
        sb.append(this.updateDateDataShiftIso);
        sb.append(", lastSuccessfulCalibrationDateIso=");
        return b.r(sb, this.lastSuccessfulCalibrationDateIso, ')');
    }

    @Deprecated
    public /* synthetic */ PredefinedDataShift(int i, double d, boolean z, boolean z2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, PredefinedDataShift$$serializer.INSTANCE.getB());
            throw null;
        }
        this.estimatedDataShift = d;
        this.didEstimatedLastEstimationTime = z;
        this.enforceNewEstimation = z2;
        this.updateDateDataShiftIso = str;
        if ((i & 16) == 0) {
            this.lastSuccessfulCalibrationDateIso = null;
        } else {
            this.lastSuccessfulCalibrationDateIso = str2;
        }
    }

    public /* synthetic */ PredefinedDataShift(double d, boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, z, z2, str, (i & 16) != 0 ? null : str2);
    }
}
