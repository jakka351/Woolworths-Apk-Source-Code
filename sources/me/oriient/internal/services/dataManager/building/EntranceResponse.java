package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002()B?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006*"}, d2 = {"Lme/oriient/internal/services/dataManager/building/EntranceResponse;", "", "seen1", "", "entranceId", "", lqlqqlq.mmm006Dm006Dm, "isMain", "", "coordinates", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLme/oriient/internal/services/dataManager/building/CoordinateResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZLme/oriient/internal/services/dataManager/building/CoordinateResponse;)V", "getCoordinates", "()Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "getDescription", "()Ljava/lang/String;", "getEntranceId", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toEntrance", "Lme/oriient/internal/services/dataManager/building/Entrance;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class EntranceResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final CoordinateResponse coordinates;

    @NotNull
    private final String description;

    @NotNull
    private final String entranceId;
    private final boolean isMain;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/EntranceResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/EntranceResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EntranceResponse> serializer() {
            return EntranceResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ EntranceResponse(int i, String str, String str2, boolean z, CoordinateResponse coordinateResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, EntranceResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.entranceId = str;
        this.description = str2;
        this.isMain = z;
        this.coordinates = coordinateResponse;
    }

    public static /* synthetic */ EntranceResponse copy$default(EntranceResponse entranceResponse, String str, String str2, boolean z, CoordinateResponse coordinateResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entranceResponse.entranceId;
        }
        if ((i & 2) != 0) {
            str2 = entranceResponse.description;
        }
        if ((i & 4) != 0) {
            z = entranceResponse.isMain;
        }
        if ((i & 8) != 0) {
            coordinateResponse = entranceResponse.coordinates;
        }
        return entranceResponse.copy(str, str2, z, coordinateResponse);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EntranceResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.entranceId);
        output.p(serialDesc, 1, self.description);
        output.o(serialDesc, 2, self.isMain);
        output.F(serialDesc, 3, CoordinateResponse$$serializer.INSTANCE, self.coordinates);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEntranceId() {
        return this.entranceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMain() {
        return this.isMain;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final EntranceResponse copy(@NotNull String entranceId, @NotNull String description, boolean isMain, @NotNull CoordinateResponse coordinates) {
        Intrinsics.h(entranceId, "entranceId");
        Intrinsics.h(description, "description");
        Intrinsics.h(coordinates, "coordinates");
        return new EntranceResponse(entranceId, description, isMain, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceResponse)) {
            return false;
        }
        EntranceResponse entranceResponse = (EntranceResponse) other;
        return Intrinsics.c(this.entranceId, entranceResponse.entranceId) && Intrinsics.c(this.description, entranceResponse.description) && this.isMain == entranceResponse.isMain && Intrinsics.c(this.coordinates, entranceResponse.coordinates);
    }

    @NotNull
    public final CoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getEntranceId() {
        return this.entranceId;
    }

    public int hashCode() {
        return this.coordinates.hashCode() + me.oriient.internal.infra.scheduler.a.a(this.isMain, me.oriient.internal.infra.rest.a.a(this.description, this.entranceId.hashCode() * 31, 31), 31);
    }

    public final boolean isMain() {
        return this.isMain;
    }

    @NotNull
    public final Entrance toEntrance() {
        return new Entrance(this.entranceId, this.description, this.isMain, this.coordinates.getX(), this.coordinates.getY());
    }

    @NotNull
    public String toString() {
        return "EntranceResponse(entranceId=" + this.entranceId + ", description=" + this.description + ", isMain=" + this.isMain + ", coordinates=" + this.coordinates + ')';
    }

    public EntranceResponse(@NotNull String entranceId, @NotNull String description, boolean z, @NotNull CoordinateResponse coordinates) {
        Intrinsics.h(entranceId, "entranceId");
        Intrinsics.h(description, "description");
        Intrinsics.h(coordinates, "coordinates");
        this.entranceId = entranceId;
        this.description = description;
        this.isMain = z;
        this.coordinates = coordinates;
    }
}
