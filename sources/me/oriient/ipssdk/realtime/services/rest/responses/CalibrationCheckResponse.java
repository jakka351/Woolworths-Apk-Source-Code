package me.oriient.ipssdk.realtime.services.rest.responses;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006*"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/CalibrationCheckResponse;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "needsCalibration", "", "expirationTimeUtc", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "getExpirationTimeUtc", "()Ljava/lang/Long;", "setExpirationTimeUtc", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNeedsCalibration", "()Ljava/lang/Boolean;", "setNeedsCalibration", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lme/oriient/ipssdk/realtime/services/rest/responses/CalibrationCheckResponse;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class CalibrationCheckResponse implements PostProcessable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long expirationTimeUtc;

    @Nullable
    private Boolean needsCalibration;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/CalibrationCheckResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/CalibrationCheckResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<CalibrationCheckResponse> serializer() {
            return CalibrationCheckResponse$$serializer.INSTANCE;
        }
    }

    public CalibrationCheckResponse() {
        this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CalibrationCheckResponse copy$default(CalibrationCheckResponse calibrationCheckResponse, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = calibrationCheckResponse.needsCalibration;
        }
        if ((i & 2) != 0) {
            l = calibrationCheckResponse.expirationTimeUtc;
        }
        return calibrationCheckResponse.copy(bool, l);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(CalibrationCheckResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.needsCalibration != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.needsCalibration);
        }
        if (!output.q(serialDesc, 1) && self.expirationTimeUtc == null) {
            return;
        }
        output.w(serialDesc, 1, LongSerializer.f24804a, self.expirationTimeUtc);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getNeedsCalibration() {
        return this.needsCalibration;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getExpirationTimeUtc() {
        return this.expirationTimeUtc;
    }

    @NotNull
    public final CalibrationCheckResponse copy(@Nullable Boolean needsCalibration, @Nullable Long expirationTimeUtc) {
        return new CalibrationCheckResponse(needsCalibration, expirationTimeUtc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibrationCheckResponse)) {
            return false;
        }
        CalibrationCheckResponse calibrationCheckResponse = (CalibrationCheckResponse) other;
        return Intrinsics.c(this.needsCalibration, calibrationCheckResponse.needsCalibration) && Intrinsics.c(this.expirationTimeUtc, calibrationCheckResponse.expirationTimeUtc);
    }

    @Nullable
    public final Long getExpirationTimeUtc() {
        return this.expirationTimeUtc;
    }

    @Nullable
    public final Boolean getNeedsCalibration() {
        return this.needsCalibration;
    }

    public int hashCode() {
        Boolean bool = this.needsCalibration;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.expirationTimeUtc;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final void setExpirationTimeUtc(@Nullable Long l) {
        this.expirationTimeUtc = l;
    }

    public final void setNeedsCalibration(@Nullable Boolean bool) {
        this.needsCalibration = bool;
    }

    @NotNull
    public String toString() {
        return "CalibrationCheckResponse(needsCalibration=" + this.needsCalibration + ", expirationTimeUtc=" + this.expirationTimeUtc + ')';
    }

    @Deprecated
    public /* synthetic */ CalibrationCheckResponse(int i, Boolean bool, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.needsCalibration = null;
        } else {
            this.needsCalibration = bool;
        }
        if ((i & 2) == 0) {
            this.expirationTimeUtc = null;
        } else {
            this.expirationTimeUtc = l;
        }
    }

    public CalibrationCheckResponse(@Nullable Boolean bool, @Nullable Long l) {
        this.needsCalibration = bool;
        this.expirationTimeUtc = l;
    }

    public /* synthetic */ CalibrationCheckResponse(Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l);
    }
}
