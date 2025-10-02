package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BY\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lme/oriient/navigation/common/models/FloorTransition;", "", "seen1", "", "id", "", "type", "Lme/oriient/navigation/common/models/FloorTransitionType;", "buildingId", "floorOrder", "indexOnRoute", "destinationFloorOrder", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lme/oriient/navigation/common/models/FloorTransitionType;Ljava/lang/String;IIILme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lme/oriient/navigation/common/models/FloorTransitionType;Ljava/lang/String;IIILme/oriient/internal/services/dataManager/common/IndoorCoordinate;)V", "getBuildingId", "()Ljava/lang/String;", "getCoordinate", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getDestinationFloorOrder", "()I", "getFloorOrder", "getId", "getIndexOnRoute", "getType", "()Lme/oriient/navigation/common/models/FloorTransitionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class FloorTransition {

    @NotNull
    private final String buildingId;

    @NotNull
    private final IndoorCoordinate coordinate;
    private final int destinationFloorOrder;
    private final int floorOrder;

    @NotNull
    private final String id;
    private final int indexOnRoute;

    @NotNull
    private final FloorTransitionType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, FloorTransitionType.INSTANCE.serializer(), null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/navigation/common/models/FloorTransition$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/common/models/FloorTransition;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorTransition> serializer() {
            return FloorTransition$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorTransition(int i, String str, FloorTransitionType floorTransitionType, String str2, int i2, int i3, int i4, IndoorCoordinate indoorCoordinate, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.a(i, 127, FloorTransition$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.type = floorTransitionType;
        this.buildingId = str2;
        this.floorOrder = i2;
        this.indexOnRoute = i3;
        this.destinationFloorOrder = i4;
        this.coordinate = indoorCoordinate;
    }

    public static /* synthetic */ FloorTransition copy$default(FloorTransition floorTransition, String str, FloorTransitionType floorTransitionType, String str2, int i, int i2, int i3, IndoorCoordinate indoorCoordinate, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = floorTransition.id;
        }
        if ((i4 & 2) != 0) {
            floorTransitionType = floorTransition.type;
        }
        if ((i4 & 4) != 0) {
            str2 = floorTransition.buildingId;
        }
        if ((i4 & 8) != 0) {
            i = floorTransition.floorOrder;
        }
        if ((i4 & 16) != 0) {
            i2 = floorTransition.indexOnRoute;
        }
        if ((i4 & 32) != 0) {
            i3 = floorTransition.destinationFloorOrder;
        }
        if ((i4 & 64) != 0) {
            indoorCoordinate = floorTransition.coordinate;
        }
        int i5 = i3;
        IndoorCoordinate indoorCoordinate2 = indoorCoordinate;
        int i6 = i2;
        String str3 = str2;
        return floorTransition.copy(str, floorTransitionType, str3, i, i6, i5, indoorCoordinate2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_navigation_publishRelease(FloorTransition self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.id);
        output.F(serialDesc, 1, kSerializerArr[1], self.type);
        output.p(serialDesc, 2, self.buildingId);
        output.C(3, self.floorOrder, serialDesc);
        output.C(4, self.indexOnRoute, serialDesc);
        output.C(5, self.destinationFloorOrder, serialDesc);
        output.F(serialDesc, 6, IndoorCoordinate$$serializer.INSTANCE, self.coordinate);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FloorTransitionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    /* renamed from: component5, reason: from getter */
    public final int getIndexOnRoute() {
        return this.indexOnRoute;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDestinationFloorOrder() {
        return this.destinationFloorOrder;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final FloorTransition copy(@NotNull String id, @NotNull FloorTransitionType type, @NotNull String buildingId, int floorOrder, int indexOnRoute, int destinationFloorOrder, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        return new FloorTransition(id, type, buildingId, floorOrder, indexOnRoute, destinationFloorOrder, coordinate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorTransition)) {
            return false;
        }
        FloorTransition floorTransition = (FloorTransition) other;
        return Intrinsics.c(this.id, floorTransition.id) && this.type == floorTransition.type && Intrinsics.c(this.buildingId, floorTransition.buildingId) && this.floorOrder == floorTransition.floorOrder && this.indexOnRoute == floorTransition.indexOnRoute && this.destinationFloorOrder == floorTransition.destinationFloorOrder && Intrinsics.c(this.coordinate, floorTransition.coordinate);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final int getDestinationFloorOrder() {
        return this.destinationFloorOrder;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIndexOnRoute() {
        return this.indexOnRoute;
    }

    @NotNull
    public final FloorTransitionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.coordinate.hashCode() + androidx.camera.core.impl.b.a(this.destinationFloorOrder, androidx.camera.core.impl.b.a(this.indexOnRoute, androidx.camera.core.impl.b.a(this.floorOrder, androidx.camera.core.impl.b.c((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.buildingId), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "FloorTransition(id=" + this.id + ", type=" + this.type + ", buildingId=" + this.buildingId + ", floorOrder=" + this.floorOrder + ", indexOnRoute=" + this.indexOnRoute + ", destinationFloorOrder=" + this.destinationFloorOrder + ", coordinate=" + this.coordinate + ')';
    }

    public FloorTransition(@NotNull String id, @NotNull FloorTransitionType type, @NotNull String buildingId, int i, int i2, int i3, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        this.id = id;
        this.type = type;
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.indexOnRoute = i2;
        this.destinationFloorOrder = i3;
        this.coordinate = coordinate;
    }
}
