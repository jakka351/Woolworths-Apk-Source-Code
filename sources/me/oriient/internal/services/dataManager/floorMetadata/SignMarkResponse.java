package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.dataManager.building.CoordinateResponse;
import me.oriient.internal.services.dataManager.building.CoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006*"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkResponse;", "", "seen1", "", "signMarkId", "", TextBundle.TEXT_ENTRY, "coordinates", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "metadata", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;Ljava/lang/String;)V", "getCoordinates", "()Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "getMetadata", "()Ljava/lang/String;", "getSignMarkId", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toSignMark", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMark;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class SignMarkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final CoordinateResponse coordinates;

    @Nullable
    private final String metadata;

    @NotNull
    private final String signMarkId;

    @NotNull
    private final String text;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SignMarkResponse> serializer() {
            return SignMarkResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SignMarkResponse(int i, String str, String str2, CoordinateResponse coordinateResponse, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, SignMarkResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.signMarkId = str;
        this.text = str2;
        this.coordinates = coordinateResponse;
        if ((i & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = str3;
        }
    }

    public static /* synthetic */ SignMarkResponse copy$default(SignMarkResponse signMarkResponse, String str, String str2, CoordinateResponse coordinateResponse, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signMarkResponse.signMarkId;
        }
        if ((i & 2) != 0) {
            str2 = signMarkResponse.text;
        }
        if ((i & 4) != 0) {
            coordinateResponse = signMarkResponse.coordinates;
        }
        if ((i & 8) != 0) {
            str3 = signMarkResponse.metadata;
        }
        return signMarkResponse.copy(str, str2, coordinateResponse, str3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SignMarkResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.signMarkId);
        output.p(serialDesc, 1, self.text);
        output.F(serialDesc, 2, CoordinateResponse$$serializer.INSTANCE, self.coordinates);
        if (!output.q(serialDesc, 3) && self.metadata == null) {
            return;
        }
        output.w(serialDesc, 3, StringSerializer.f24821a, self.metadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSignMarkId() {
        return this.signMarkId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final SignMarkResponse copy(@NotNull String signMarkId, @NotNull String text, @NotNull CoordinateResponse coordinates, @Nullable String metadata) {
        Intrinsics.h(signMarkId, "signMarkId");
        Intrinsics.h(text, "text");
        Intrinsics.h(coordinates, "coordinates");
        return new SignMarkResponse(signMarkId, text, coordinates, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignMarkResponse)) {
            return false;
        }
        SignMarkResponse signMarkResponse = (SignMarkResponse) other;
        return Intrinsics.c(this.signMarkId, signMarkResponse.signMarkId) && Intrinsics.c(this.text, signMarkResponse.text) && Intrinsics.c(this.coordinates, signMarkResponse.coordinates) && Intrinsics.c(this.metadata, signMarkResponse.metadata);
    }

    @NotNull
    public final CoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getSignMarkId() {
        return this.signMarkId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.coordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.text, this.signMarkId.hashCode() * 31, 31)) * 31;
        String str = this.metadata;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final SignMark toSignMark() {
        SignMarkMetadataResponse signMarkMetadataResponse;
        String str = this.metadata;
        if (str == null || (signMarkMetadataResponse = (SignMarkMetadataResponse) JsonSerializationKt.parseAsJson(str, Reflection.b(SignMarkMetadataResponse.class))) == null) {
            signMarkMetadataResponse = new SignMarkMetadataResponse((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        return new SignMark(this.signMarkId, this.text, new IndoorCoordinate(this.coordinates.getX(), this.coordinates.getY(), 0.0d, 4, (DefaultConstructorMarker) null), signMarkMetadataResponse.toSignMarkMetadata(), this.metadata);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SignMarkResponse(signMarkId=");
        sb.append(this.signMarkId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", metadata=");
        return me.oriient.internal.infra.rest.e.a(sb, this.metadata, ')');
    }

    public SignMarkResponse(@NotNull String signMarkId, @NotNull String text, @NotNull CoordinateResponse coordinates, @Nullable String str) {
        Intrinsics.h(signMarkId, "signMarkId");
        Intrinsics.h(text, "text");
        Intrinsics.h(coordinates, "coordinates");
        this.signMarkId = signMarkId;
        this.text = text;
        this.coordinates = coordinates;
        this.metadata = str;
    }

    public /* synthetic */ SignMarkResponse(String str, String str2, CoordinateResponse coordinateResponse, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, coordinateResponse, (i & 8) != 0 ? null : str3);
    }
}
