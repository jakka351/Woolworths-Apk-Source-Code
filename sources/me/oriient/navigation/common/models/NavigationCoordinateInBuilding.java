package me.oriient.navigation.common.models;

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
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding;", "", "seen1", "", "buildingId", "", "floorOrder", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;)V", "getBuildingId", "()Ljava/lang/String;", "getCoordinate", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getFloorOrder", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class NavigationCoordinateInBuilding {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String buildingId;

    @NotNull
    private final IndoorCoordinate coordinate;
    private final int floorOrder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/common/models/NavigationCoordinateInBuilding;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<NavigationCoordinateInBuilding> serializer() {
            return NavigationCoordinateInBuilding$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ NavigationCoordinateInBuilding(int i, String str, int i2, IndoorCoordinate indoorCoordinate, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, NavigationCoordinateInBuilding$$serializer.INSTANCE.getB());
            throw null;
        }
        this.buildingId = str;
        this.floorOrder = i2;
        this.coordinate = indoorCoordinate;
    }

    public static /* synthetic */ NavigationCoordinateInBuilding copy$default(NavigationCoordinateInBuilding navigationCoordinateInBuilding, String str, int i, IndoorCoordinate indoorCoordinate, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationCoordinateInBuilding.buildingId;
        }
        if ((i2 & 2) != 0) {
            i = navigationCoordinateInBuilding.floorOrder;
        }
        if ((i2 & 4) != 0) {
            indoorCoordinate = navigationCoordinateInBuilding.coordinate;
        }
        return navigationCoordinateInBuilding.copy(str, i, indoorCoordinate);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_navigation_publishRelease(NavigationCoordinateInBuilding self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.buildingId);
        output.C(1, self.floorOrder, serialDesc);
        output.F(serialDesc, 2, IndoorCoordinate$$serializer.INSTANCE, self.coordinate);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final NavigationCoordinateInBuilding copy(@NotNull String buildingId, int floorOrder, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        return new NavigationCoordinateInBuilding(buildingId, floorOrder, coordinate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationCoordinateInBuilding)) {
            return false;
        }
        NavigationCoordinateInBuilding navigationCoordinateInBuilding = (NavigationCoordinateInBuilding) other;
        return Intrinsics.c(this.buildingId, navigationCoordinateInBuilding.buildingId) && this.floorOrder == navigationCoordinateInBuilding.floorOrder && Intrinsics.c(this.coordinate, navigationCoordinateInBuilding.coordinate);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    public int hashCode() {
        return this.coordinate.hashCode() + androidx.camera.core.impl.b.a(this.floorOrder, this.buildingId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "NavigationCoordinateInBuilding(buildingId=" + this.buildingId + ", floorOrder=" + this.floorOrder + ", coordinate=" + this.coordinate + ')';
    }

    public NavigationCoordinateInBuilding(@NotNull String buildingId, int i, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.coordinate = coordinate;
    }
}
