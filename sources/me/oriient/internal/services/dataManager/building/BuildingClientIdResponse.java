package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingClientIdResponse;", "", "seen1", "", "clientBuildingId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getClientBuildingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class BuildingClientIdResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String clientBuildingId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingClientIdResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/BuildingClientIdResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<BuildingClientIdResponse> serializer() {
            return BuildingClientIdResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ BuildingClientIdResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.clientBuildingId = str;
        } else {
            PluginExceptionsKt.a(i, 1, BuildingClientIdResponse$$serializer.INSTANCE.getB());
            throw null;
        }
    }

    public static /* synthetic */ BuildingClientIdResponse copy$default(BuildingClientIdResponse buildingClientIdResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingClientIdResponse.clientBuildingId;
        }
        return buildingClientIdResponse.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final BuildingClientIdResponse copy(@NotNull String clientBuildingId) {
        Intrinsics.h(clientBuildingId, "clientBuildingId");
        return new BuildingClientIdResponse(clientBuildingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuildingClientIdResponse) && Intrinsics.c(this.clientBuildingId, ((BuildingClientIdResponse) other).clientBuildingId);
    }

    @NotNull
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    public int hashCode() {
        return this.clientBuildingId.hashCode();
    }

    @NotNull
    public String toString() {
        return me.oriient.internal.infra.rest.e.a(new StringBuilder("BuildingClientIdResponse(clientBuildingId="), this.clientBuildingId, ')');
    }

    public BuildingClientIdResponse(@NotNull String clientBuildingId) {
        Intrinsics.h(clientBuildingId, "clientBuildingId");
        this.clientBuildingId = clientBuildingId;
    }
}
