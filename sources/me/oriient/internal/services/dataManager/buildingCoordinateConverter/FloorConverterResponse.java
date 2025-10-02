package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0003657B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ8\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse;", "", "", "floorId", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;", "translation", "", "rotationRadians", "scale", "<init>", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;FLme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;FLme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/j;", "toFloorConverterData", "()Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/j;", "component1", "()Ljava/lang/String;", "component2", "()Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;", "component3", "()F", "component4", "copy", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;FLme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;)Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFloorId", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;", "getTranslation", "F", "getRotationRadians", "getRotationRadians$annotations", "()V", "getScale", "Companion", "$serializer", "PointResponse", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class FloorConverterResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String floorId;
    private final float rotationRadians;

    @NotNull
    private final PointResponse scale;

    @NotNull
    private final PointResponse translation;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorConverterResponse> serializer() {
            return FloorConverterResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorConverterResponse(int i, String str, PointResponse pointResponse, @SerialName float f, PointResponse pointResponse2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, FloorConverterResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.floorId = str;
        this.translation = pointResponse;
        this.rotationRadians = f;
        this.scale = pointResponse2;
    }

    public static /* synthetic */ FloorConverterResponse copy$default(FloorConverterResponse floorConverterResponse, String str, PointResponse pointResponse, float f, PointResponse pointResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorConverterResponse.floorId;
        }
        if ((i & 2) != 0) {
            pointResponse = floorConverterResponse.translation;
        }
        if ((i & 4) != 0) {
            f = floorConverterResponse.rotationRadians;
        }
        if ((i & 8) != 0) {
            pointResponse2 = floorConverterResponse.scale;
        }
        return floorConverterResponse.copy(str, pointResponse, f, pointResponse2);
    }

    @SerialName
    public static /* synthetic */ void getRotationRadians$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorConverterResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.floorId);
        FloorConverterResponse$PointResponse$$serializer floorConverterResponse$PointResponse$$serializer = FloorConverterResponse$PointResponse$$serializer.INSTANCE;
        output.F(serialDesc, 1, floorConverterResponse$PointResponse$$serializer, self.translation);
        output.B(serialDesc, 2, self.rotationRadians);
        output.F(serialDesc, 3, floorConverterResponse$PointResponse$$serializer, self.scale);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PointResponse getTranslation() {
        return this.translation;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRotationRadians() {
        return this.rotationRadians;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PointResponse getScale() {
        return this.scale;
    }

    @NotNull
    public final FloorConverterResponse copy(@NotNull String floorId, @NotNull PointResponse translation, float rotationRadians, @NotNull PointResponse scale) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(translation, "translation");
        Intrinsics.h(scale, "scale");
        return new FloorConverterResponse(floorId, translation, rotationRadians, scale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorConverterResponse)) {
            return false;
        }
        FloorConverterResponse floorConverterResponse = (FloorConverterResponse) other;
        return Intrinsics.c(this.floorId, floorConverterResponse.floorId) && Intrinsics.c(this.translation, floorConverterResponse.translation) && Float.compare(this.rotationRadians, floorConverterResponse.rotationRadians) == 0 && Intrinsics.c(this.scale, floorConverterResponse.scale);
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final float getRotationRadians() {
        return this.rotationRadians;
    }

    @NotNull
    public final PointResponse getScale() {
        return this.scale;
    }

    @NotNull
    public final PointResponse getTranslation() {
        return this.translation;
    }

    public int hashCode() {
        return this.scale.hashCode() + android.support.v4.media.session.a.b(this.rotationRadians, (this.translation.hashCode() + (this.floorId.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public final j toFloorConverterData() {
        return new j(this.floorId, this.translation.getX(), this.translation.getY(), (float) Math.toDegrees(this.rotationRadians), this.scale.getX(), this.scale.getY());
    }

    @NotNull
    public String toString() {
        return "FloorConverterResponse(floorId=" + this.floorId + ", translation=" + this.translation + ", rotationRadians=" + this.rotationRadians + ", scale=" + this.scale + ')';
    }

    public FloorConverterResponse(@NotNull String floorId, @NotNull PointResponse translation, float f, @NotNull PointResponse scale) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(translation, "translation");
        Intrinsics.h(scale, "scale");
        this.floorId = floorId;
        this.translation = translation;
        this.rotationRadians = f;
        this.scale = scale;
    }

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;", "", "seen1", "", "x", "", "y", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PointResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final float x;
        private final float y;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorConverterResponse$PointResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<PointResponse> serializer() {
                return FloorConverterResponse$PointResponse$$serializer.INSTANCE;
            }
        }

        public PointResponse(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ PointResponse copy$default(PointResponse pointResponse, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pointResponse.x;
            }
            if ((i & 2) != 0) {
                f2 = pointResponse.y;
            }
            return pointResponse.copy(f, f2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(PointResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.B(serialDesc, 0, self.x);
            output.B(serialDesc, 1, self.y);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final PointResponse copy(float x, float y) {
            return new PointResponse(x, y);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointResponse)) {
                return false;
            }
            PointResponse pointResponse = (PointResponse) other;
            return Float.compare(this.x, pointResponse.x) == 0 && Float.compare(this.y, pointResponse.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PointResponse(x=");
            sb.append(this.x);
            sb.append(", y=");
            return android.support.v4.media.session.a.r(sb, this.y, ')');
        }

        @Deprecated
        public /* synthetic */ PointResponse(int i, float f, float f2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, FloorConverterResponse$PointResponse$$serializer.INSTANCE.getB());
                throw null;
            }
            this.x = f;
            this.y = f2;
        }
    }
}
