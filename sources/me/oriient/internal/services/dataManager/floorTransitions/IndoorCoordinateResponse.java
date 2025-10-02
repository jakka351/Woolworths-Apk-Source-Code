package me.oriient.internal.services.dataManager.floorTransitions;

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
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006#"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "", "seen1", "", "x", "", "y", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DD)V", "getX", "()D", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toIndoorCoordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class IndoorCoordinateResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double x;
    private final double y;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<IndoorCoordinateResponse> serializer() {
            return IndoorCoordinateResponse$$serializer.INSTANCE;
        }
    }

    public IndoorCoordinateResponse(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public static /* synthetic */ IndoorCoordinateResponse copy$default(IndoorCoordinateResponse indoorCoordinateResponse, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = indoorCoordinateResponse.x;
        }
        if ((i & 2) != 0) {
            d2 = indoorCoordinateResponse.y;
        }
        return indoorCoordinateResponse.copy(d, d2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(IndoorCoordinateResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.x);
        output.G(serialDesc, 1, self.y);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final IndoorCoordinateResponse copy(double x, double y) {
        return new IndoorCoordinateResponse(x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndoorCoordinateResponse)) {
            return false;
        }
        IndoorCoordinateResponse indoorCoordinateResponse = (IndoorCoordinateResponse) other;
        return Double.compare(this.x, indoorCoordinateResponse.x) == 0 && Double.compare(this.y, indoorCoordinateResponse.y) == 0;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
    }

    @NotNull
    public final IndoorCoordinate toIndoorCoordinate() {
        return new IndoorCoordinate(this.x, this.y, 0.0d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorCoordinateResponse(x=");
        sb.append(this.x);
        sb.append(", y=");
        return E.a(sb, this.y, ')');
    }

    @Deprecated
    public /* synthetic */ IndoorCoordinateResponse(int i, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, IndoorCoordinateResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.x = d;
        this.y = d2;
    }
}
