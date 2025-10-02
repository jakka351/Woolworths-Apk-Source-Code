package me.oriient.internal.services.dataManager.floorMetadata;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRangeResponse;", "", "seen1", "", "belowMeters", "", "aboveMeters", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Float;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getAboveMeters", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBelowMeters", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRangeResponse;", "equals", "", "other", "hashCode", "toSignMarkVisibleRange", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRange;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SignMarkVisibleRangeResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Float aboveMeters;

    @Nullable
    private final Float belowMeters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRangeResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRangeResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SignMarkVisibleRangeResponse> serializer() {
            return SignMarkVisibleRangeResponse$$serializer.INSTANCE;
        }
    }

    public SignMarkVisibleRangeResponse() {
        this((Float) null, (Float) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SignMarkVisibleRangeResponse copy$default(SignMarkVisibleRangeResponse signMarkVisibleRangeResponse, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = signMarkVisibleRangeResponse.belowMeters;
        }
        if ((i & 2) != 0) {
            f2 = signMarkVisibleRangeResponse.aboveMeters;
        }
        return signMarkVisibleRangeResponse.copy(f, f2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SignMarkVisibleRangeResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.belowMeters != null) {
            output.w(serialDesc, 0, FloatSerializer.f24797a, self.belowMeters);
        }
        if (!output.q(serialDesc, 1) && self.aboveMeters == null) {
            return;
        }
        output.w(serialDesc, 1, FloatSerializer.f24797a, self.aboveMeters);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getBelowMeters() {
        return this.belowMeters;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getAboveMeters() {
        return this.aboveMeters;
    }

    @NotNull
    public final SignMarkVisibleRangeResponse copy(@Nullable Float belowMeters, @Nullable Float aboveMeters) {
        return new SignMarkVisibleRangeResponse(belowMeters, aboveMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignMarkVisibleRangeResponse)) {
            return false;
        }
        SignMarkVisibleRangeResponse signMarkVisibleRangeResponse = (SignMarkVisibleRangeResponse) other;
        return Intrinsics.c(this.belowMeters, signMarkVisibleRangeResponse.belowMeters) && Intrinsics.c(this.aboveMeters, signMarkVisibleRangeResponse.aboveMeters);
    }

    @Nullable
    public final Float getAboveMeters() {
        return this.aboveMeters;
    }

    @Nullable
    public final Float getBelowMeters() {
        return this.belowMeters;
    }

    public int hashCode() {
        Float f = this.belowMeters;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.aboveMeters;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public final SignMarkVisibleRange toSignMarkVisibleRange() {
        return new SignMarkVisibleRange(this.belowMeters, this.aboveMeters);
    }

    @NotNull
    public String toString() {
        return "SignMarkVisibleRangeResponse(belowMeters=" + this.belowMeters + ", aboveMeters=" + this.aboveMeters + ')';
    }

    @Deprecated
    public /* synthetic */ SignMarkVisibleRangeResponse(int i, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.belowMeters = null;
        } else {
            this.belowMeters = f;
        }
        if ((i & 2) == 0) {
            this.aboveMeters = null;
        } else {
            this.aboveMeters = f2;
        }
    }

    public SignMarkVisibleRangeResponse(@Nullable Float f, @Nullable Float f2) {
        this.belowMeters = f;
        this.aboveMeters = f2;
    }

    public /* synthetic */ SignMarkVisibleRangeResponse(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
