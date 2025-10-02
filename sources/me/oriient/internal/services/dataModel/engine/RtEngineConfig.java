package me.oriient.internal.services.dataModel.engine;

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
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;", "", "seen1", "", "flipAxes", "", "calibrationExpirationTimeSeconds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZD)V", "getCalibrationExpirationTimeSeconds", "()D", "getFlipAxes", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class RtEngineConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double calibrationExpirationTimeSeconds;
    private final boolean flipAxes;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/RtEngineConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/RtEngineConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RtEngineConfig> serializer() {
            return RtEngineConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RtEngineConfig(int i, boolean z, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RtEngineConfig$$serializer.INSTANCE.getB());
            throw null;
        }
        this.flipAxes = z;
        this.calibrationExpirationTimeSeconds = d;
    }

    public static /* synthetic */ RtEngineConfig copy$default(RtEngineConfig rtEngineConfig, boolean z, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rtEngineConfig.flipAxes;
        }
        if ((i & 2) != 0) {
            d = rtEngineConfig.calibrationExpirationTimeSeconds;
        }
        return rtEngineConfig.copy(z, d);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RtEngineConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.flipAxes);
        output.G(serialDesc, 1, self.calibrationExpirationTimeSeconds);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCalibrationExpirationTimeSeconds() {
        return this.calibrationExpirationTimeSeconds;
    }

    @NotNull
    public final RtEngineConfig copy(boolean flipAxes, double calibrationExpirationTimeSeconds) {
        return new RtEngineConfig(flipAxes, calibrationExpirationTimeSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtEngineConfig)) {
            return false;
        }
        RtEngineConfig rtEngineConfig = (RtEngineConfig) other;
        return this.flipAxes == rtEngineConfig.flipAxes && Double.compare(this.calibrationExpirationTimeSeconds, rtEngineConfig.calibrationExpirationTimeSeconds) == 0;
    }

    public final double getCalibrationExpirationTimeSeconds() {
        return this.calibrationExpirationTimeSeconds;
    }

    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    public int hashCode() {
        return Double.hashCode(this.calibrationExpirationTimeSeconds) + (Boolean.hashCode(this.flipAxes) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RtEngineConfig(flipAxes=");
        sb.append(this.flipAxes);
        sb.append(", calibrationExpirationTimeSeconds=");
        return E.a(sb, this.calibrationExpirationTimeSeconds, ')');
    }

    public RtEngineConfig(boolean z, double d) {
        this.flipAxes = z;
        this.calibrationExpirationTimeSeconds = d;
    }
}
