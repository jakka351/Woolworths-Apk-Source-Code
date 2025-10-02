package me.oriient.internal.services.dataManager.floorTransitions;

import androidx.annotation.Keep;
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
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 92\u00020\u0001:\u000289Bo\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0006\u0010.\u001a\u00020/J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÁ\u0001¢\u0006\u0002\b7R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006:"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/TwoPointsResponse;", "", "seen1", "", "transitionId", "", "transitionName", "firstPointFloorId", "firstPointCoordinates", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "secondPointFloorId", "secondPointCoordinates", "directed", "", "accessible", "type", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;Ljava/lang/String;Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;ZZLjava/lang/String;)V", "getAccessible", "()Z", "getDirected", "getFirstPointCoordinates", "()Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "getFirstPointFloorId", "()Ljava/lang/String;", "getSecondPointCoordinates", "getSecondPointFloorId", "getTransitionId", "getTransitionName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "toTwoPoints", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$TwoPoints;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class TwoPointsResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final boolean accessible;
    private final boolean directed;

    @NotNull
    private final IndoorCoordinateResponse firstPointCoordinates;

    @NotNull
    private final String firstPointFloorId;

    @NotNull
    private final IndoorCoordinateResponse secondPointCoordinates;

    @NotNull
    private final String secondPointFloorId;

    @NotNull
    private final String transitionId;

    @NotNull
    private final String transitionName;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/TwoPointsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/TwoPointsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<TwoPointsResponse> serializer() {
            return TwoPointsResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TwoPointsResponse(int i, String str, String str2, String str3, IndoorCoordinateResponse indoorCoordinateResponse, String str4, IndoorCoordinateResponse indoorCoordinateResponse2, boolean z, boolean z2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptionsKt.a(i, 511, TwoPointsResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.transitionId = str;
        this.transitionName = str2;
        this.firstPointFloorId = str3;
        this.firstPointCoordinates = indoorCoordinateResponse;
        this.secondPointFloorId = str4;
        this.secondPointCoordinates = indoorCoordinateResponse2;
        this.directed = z;
        this.accessible = z2;
        this.type = str5;
    }

    public static /* synthetic */ TwoPointsResponse copy$default(TwoPointsResponse twoPointsResponse, String str, String str2, String str3, IndoorCoordinateResponse indoorCoordinateResponse, String str4, IndoorCoordinateResponse indoorCoordinateResponse2, boolean z, boolean z2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twoPointsResponse.transitionId;
        }
        if ((i & 2) != 0) {
            str2 = twoPointsResponse.transitionName;
        }
        if ((i & 4) != 0) {
            str3 = twoPointsResponse.firstPointFloorId;
        }
        if ((i & 8) != 0) {
            indoorCoordinateResponse = twoPointsResponse.firstPointCoordinates;
        }
        if ((i & 16) != 0) {
            str4 = twoPointsResponse.secondPointFloorId;
        }
        if ((i & 32) != 0) {
            indoorCoordinateResponse2 = twoPointsResponse.secondPointCoordinates;
        }
        if ((i & 64) != 0) {
            z = twoPointsResponse.directed;
        }
        if ((i & 128) != 0) {
            z2 = twoPointsResponse.accessible;
        }
        if ((i & 256) != 0) {
            str5 = twoPointsResponse.type;
        }
        boolean z3 = z2;
        String str6 = str5;
        IndoorCoordinateResponse indoorCoordinateResponse3 = indoorCoordinateResponse2;
        boolean z4 = z;
        String str7 = str4;
        String str8 = str3;
        return twoPointsResponse.copy(str, str2, str8, indoorCoordinateResponse, str7, indoorCoordinateResponse3, z4, z3, str6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(TwoPointsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.transitionId);
        output.p(serialDesc, 1, self.transitionName);
        output.p(serialDesc, 2, self.firstPointFloorId);
        IndoorCoordinateResponse$$serializer indoorCoordinateResponse$$serializer = IndoorCoordinateResponse$$serializer.INSTANCE;
        output.F(serialDesc, 3, indoorCoordinateResponse$$serializer, self.firstPointCoordinates);
        output.p(serialDesc, 4, self.secondPointFloorId);
        output.F(serialDesc, 5, indoorCoordinateResponse$$serializer, self.secondPointCoordinates);
        output.o(serialDesc, 6, self.directed);
        output.o(serialDesc, 7, self.accessible);
        output.p(serialDesc, 8, self.type);
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
    public final String getFirstPointFloorId() {
        return this.firstPointFloorId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IndoorCoordinateResponse getFirstPointCoordinates() {
        return this.firstPointCoordinates;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSecondPointFloorId() {
        return this.secondPointFloorId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final IndoorCoordinateResponse getSecondPointCoordinates() {
        return this.secondPointCoordinates;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDirected() {
        return this.directed;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAccessible() {
        return this.accessible;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TwoPointsResponse copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinateResponse firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinateResponse secondPointCoordinates, boolean directed, boolean accessible, @NotNull String type) {
        Intrinsics.h(transitionId, "transitionId");
        Intrinsics.h(transitionName, "transitionName");
        Intrinsics.h(firstPointFloorId, "firstPointFloorId");
        Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
        Intrinsics.h(secondPointFloorId, "secondPointFloorId");
        Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
        Intrinsics.h(type, "type");
        return new TwoPointsResponse(transitionId, transitionName, firstPointFloorId, firstPointCoordinates, secondPointFloorId, secondPointCoordinates, directed, accessible, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoPointsResponse)) {
            return false;
        }
        TwoPointsResponse twoPointsResponse = (TwoPointsResponse) other;
        return Intrinsics.c(this.transitionId, twoPointsResponse.transitionId) && Intrinsics.c(this.transitionName, twoPointsResponse.transitionName) && Intrinsics.c(this.firstPointFloorId, twoPointsResponse.firstPointFloorId) && Intrinsics.c(this.firstPointCoordinates, twoPointsResponse.firstPointCoordinates) && Intrinsics.c(this.secondPointFloorId, twoPointsResponse.secondPointFloorId) && Intrinsics.c(this.secondPointCoordinates, twoPointsResponse.secondPointCoordinates) && this.directed == twoPointsResponse.directed && this.accessible == twoPointsResponse.accessible && Intrinsics.c(this.type, twoPointsResponse.type);
    }

    public final boolean getAccessible() {
        return this.accessible;
    }

    public final boolean getDirected() {
        return this.directed;
    }

    @NotNull
    public final IndoorCoordinateResponse getFirstPointCoordinates() {
        return this.firstPointCoordinates;
    }

    @NotNull
    public final String getFirstPointFloorId() {
        return this.firstPointFloorId;
    }

    @NotNull
    public final IndoorCoordinateResponse getSecondPointCoordinates() {
        return this.secondPointCoordinates;
    }

    @NotNull
    public final String getSecondPointFloorId() {
        return this.secondPointFloorId;
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
        return this.type.hashCode() + me.oriient.internal.infra.scheduler.a.a(this.accessible, me.oriient.internal.infra.scheduler.a.a(this.directed, (this.secondPointCoordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.secondPointFloorId, (this.firstPointCoordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.firstPointFloorId, me.oriient.internal.infra.rest.a.a(this.transitionName, this.transitionId.hashCode() * 31, 31), 31)) * 31, 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TwoPointsResponse(transitionId=");
        sb.append(this.transitionId);
        sb.append(", transitionName=");
        sb.append(this.transitionName);
        sb.append(", firstPointFloorId=");
        sb.append(this.firstPointFloorId);
        sb.append(", firstPointCoordinates=");
        sb.append(this.firstPointCoordinates);
        sb.append(", secondPointFloorId=");
        sb.append(this.secondPointFloorId);
        sb.append(", secondPointCoordinates=");
        sb.append(this.secondPointCoordinates);
        sb.append(", directed=");
        sb.append(this.directed);
        sb.append(", accessible=");
        sb.append(this.accessible);
        sb.append(", type=");
        return me.oriient.internal.infra.rest.e.a(sb, this.type, ')');
    }

    @NotNull
    public final FloorTransitions.TwoPoints toTwoPoints() {
        return new FloorTransitions.TwoPoints(this.transitionId, this.transitionName, this.firstPointFloorId, this.firstPointCoordinates.toIndoorCoordinate(), this.secondPointFloorId, this.secondPointCoordinates.toIndoorCoordinate(), this.directed, this.accessible, this.type);
    }

    public TwoPointsResponse(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinateResponse firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinateResponse secondPointCoordinates, boolean z, boolean z2, @NotNull String type) {
        Intrinsics.h(transitionId, "transitionId");
        Intrinsics.h(transitionName, "transitionName");
        Intrinsics.h(firstPointFloorId, "firstPointFloorId");
        Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
        Intrinsics.h(secondPointFloorId, "secondPointFloorId");
        Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
        Intrinsics.h(type, "type");
        this.transitionId = transitionId;
        this.transitionName = transitionName;
        this.firstPointFloorId = firstPointFloorId;
        this.firstPointCoordinates = firstPointCoordinates;
        this.secondPointFloorId = secondPointFloorId;
        this.secondPointCoordinates = secondPointCoordinates;
        this.directed = z;
        this.accessible = z2;
        this.type = type;
    }
}
