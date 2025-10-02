package me.oriient.internal.services.dataManager.floorTransitions;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212BY\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0005HÖ\u0001J&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÁ\u0001¢\u0006\u0002\b0R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u00063"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/SinglePointResponse;", "", "seen1", "", "transitionId", "", "transitionName", "coordinates", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "accessible", "", "type", "floorIds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;ZLjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;ZLjava/lang/String;Ljava/util/List;)V", "getAccessible", "()Z", "getCoordinates", "()Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "getFloorIds", "()Ljava/util/List;", "getTransitionId", "()Ljava/lang/String;", "getTransitionName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toSinglePoint", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$SinglePoint;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class SinglePointResponse {
    private final boolean accessible;

    @NotNull
    private final IndoorCoordinateResponse coordinates;

    @NotNull
    private final List<String> floorIds;

    @NotNull
    private final String transitionId;

    @NotNull
    private final String transitionName;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.f24821a)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/SinglePointResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/SinglePointResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SinglePointResponse> serializer() {
            return SinglePointResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SinglePointResponse(int i, String str, String str2, IndoorCoordinateResponse indoorCoordinateResponse, boolean z, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, SinglePointResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.transitionId = str;
        this.transitionName = str2;
        this.coordinates = indoorCoordinateResponse;
        this.accessible = z;
        this.type = str3;
        this.floorIds = list;
    }

    public static /* synthetic */ SinglePointResponse copy$default(SinglePointResponse singlePointResponse, String str, String str2, IndoorCoordinateResponse indoorCoordinateResponse, boolean z, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singlePointResponse.transitionId;
        }
        if ((i & 2) != 0) {
            str2 = singlePointResponse.transitionName;
        }
        if ((i & 4) != 0) {
            indoorCoordinateResponse = singlePointResponse.coordinates;
        }
        if ((i & 8) != 0) {
            z = singlePointResponse.accessible;
        }
        if ((i & 16) != 0) {
            str3 = singlePointResponse.type;
        }
        if ((i & 32) != 0) {
            list = singlePointResponse.floorIds;
        }
        String str4 = str3;
        List list2 = list;
        return singlePointResponse.copy(str, str2, indoorCoordinateResponse, z, str4, list2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(SinglePointResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.transitionId);
        output.p(serialDesc, 1, self.transitionName);
        output.F(serialDesc, 2, IndoorCoordinateResponse$$serializer.INSTANCE, self.coordinates);
        output.o(serialDesc, 3, self.accessible);
        output.p(serialDesc, 4, self.type);
        output.F(serialDesc, 5, kSerializerArr[5], self.floorIds);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTransitionId() {
        return this.transitionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTransitionName() {
        return this.transitionName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IndoorCoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> component6() {
        return this.floorIds;
    }

    @NotNull
    public final SinglePointResponse copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinateResponse coordinates, boolean accessible, @NotNull String type, @NotNull List<String> floorIds) {
        Intrinsics.h(transitionId, "transitionId");
        Intrinsics.h(transitionName, "transitionName");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(type, "type");
        Intrinsics.h(floorIds, "floorIds");
        return new SinglePointResponse(transitionId, transitionName, coordinates, accessible, type, floorIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SinglePointResponse)) {
            return false;
        }
        SinglePointResponse singlePointResponse = (SinglePointResponse) other;
        return Intrinsics.c(this.transitionId, singlePointResponse.transitionId) && Intrinsics.c(this.transitionName, singlePointResponse.transitionName) && Intrinsics.c(this.coordinates, singlePointResponse.coordinates) && this.accessible == singlePointResponse.accessible && Intrinsics.c(this.type, singlePointResponse.type) && Intrinsics.c(this.floorIds, singlePointResponse.floorIds);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    @NotNull
    public final IndoorCoordinateResponse getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final List<String> getFloorIds() {
        return this.floorIds;
    }

    @NotNull
    public final String getTransitionId() {
        return this.transitionId;
    }

    @NotNull
    public final String getTransitionName() {
        return this.transitionName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.floorIds.hashCode() + me.oriient.internal.infra.rest.a.a(this.type, me.oriient.internal.infra.scheduler.a.a(this.accessible, (this.coordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.transitionName, this.transitionId.hashCode() * 31, 31)) * 31, 31), 31);
    }

    @NotNull
    public final FloorTransitions.SinglePoint toSinglePoint() {
        return new FloorTransitions.SinglePoint(this.transitionId, this.transitionName, this.coordinates.toIndoorCoordinate(), this.accessible, this.type, this.floorIds);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SinglePointResponse(transitionId=");
        sb.append(this.transitionId);
        sb.append(", transitionName=");
        sb.append(this.transitionName);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", floorIds=");
        return m.a(sb, this.floorIds, ')');
    }

    public SinglePointResponse(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinateResponse coordinates, boolean z, @NotNull String type, @NotNull List<String> floorIds) {
        Intrinsics.h(transitionId, "transitionId");
        Intrinsics.h(transitionName, "transitionName");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(type, "type");
        Intrinsics.h(floorIds, "floorIds");
        this.transitionId = transitionId;
        this.transitionName = transitionName;
        this.coordinates = coordinates;
        this.accessible = z;
        this.type = type;
        this.floorIds = floorIds;
    }
}
