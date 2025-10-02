package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015HÁ\u0001¢\u0006\u0002\b\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "", "seen1", "", h.a.b, "", h.a.c, "altitude", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDLjava/lang/Double;)V", "Ljava/lang/Double;", "toWorldCoordinate", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final class WorldCoordinateResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double altitude;
    private final double latitude;
    private final double longitude;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WorldCoordinateResponse> serializer() {
            return WorldCoordinateResponse$$serializer.INSTANCE;
        }
    }

    public WorldCoordinateResponse(double d, double d2, @Nullable Double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(WorldCoordinateResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.latitude);
        output.G(serialDesc, 1, self.longitude);
        if (!output.q(serialDesc, 2) && Intrinsics.c(self.altitude, Double.valueOf(0.0d))) {
            return;
        }
        output.w(serialDesc, 2, DoubleSerializer.f24792a, self.altitude);
    }

    @NotNull
    public final WorldCoordinate toWorldCoordinate() {
        double d = this.latitude;
        double d2 = this.longitude;
        Double d3 = this.altitude;
        return new WorldCoordinate(d, d2, d3 != null ? d3.doubleValue() : 0.0d);
    }

    @Deprecated
    public /* synthetic */ WorldCoordinateResponse(int i, double d, double d2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, WorldCoordinateResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.latitude = d;
        this.longitude = d2;
        if ((i & 4) == 0) {
            this.altitude = Double.valueOf(0.0d);
        } else {
            this.altitude = d3;
        }
    }

    public /* synthetic */ WorldCoordinateResponse(double d, double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? Double.valueOf(0.0d) : d3);
    }
}
