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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tJ\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006,"}, d2 = {"Lme/oriient/navigation/common/models/NavigationWaypoint;", "", "seen1", "", "id", "", "buildingId", "floorOrder", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;)V", "getBuildingId", "()Ljava/lang/String;", "getCoordinate", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getFloorOrder", "()I", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "plainDistance", "", "to", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class NavigationWaypoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final String USER_ID = "me.oriient._UserPositionAsWaypointID_";

    @NotNull
    private final String buildingId;

    @NotNull
    private final IndoorCoordinate coordinate;
    private final int floorOrder;

    @NotNull
    private final String id;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/navigation/common/models/NavigationWaypoint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/common/models/NavigationWaypoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "USER_ID", "Ljava/lang/String;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<NavigationWaypoint> serializer() {
            return NavigationWaypoint$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ NavigationWaypoint(int i, String str, String str2, int i2, IndoorCoordinate indoorCoordinate, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, NavigationWaypoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.buildingId = str2;
        this.floorOrder = i2;
        this.coordinate = indoorCoordinate;
    }

    public static /* synthetic */ NavigationWaypoint copy$default(NavigationWaypoint navigationWaypoint, String str, String str2, int i, IndoorCoordinate indoorCoordinate, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationWaypoint.id;
        }
        if ((i2 & 2) != 0) {
            str2 = navigationWaypoint.buildingId;
        }
        if ((i2 & 4) != 0) {
            i = navigationWaypoint.floorOrder;
        }
        if ((i2 & 8) != 0) {
            indoorCoordinate = navigationWaypoint.coordinate;
        }
        return navigationWaypoint.copy(str, str2, i, indoorCoordinate);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_navigation_publishRelease(NavigationWaypoint self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.buildingId);
        output.C(2, self.floorOrder, serialDesc);
        output.F(serialDesc, 3, IndoorCoordinate$$serializer.INSTANCE, self.coordinate);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final NavigationWaypoint copy(@NotNull String id, @NotNull String buildingId, int floorOrder, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        return new NavigationWaypoint(id, buildingId, floorOrder, coordinate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationWaypoint)) {
            return false;
        }
        NavigationWaypoint navigationWaypoint = (NavigationWaypoint) other;
        return Intrinsics.c(this.id, navigationWaypoint.id) && Intrinsics.c(this.buildingId, navigationWaypoint.buildingId) && this.floorOrder == navigationWaypoint.floorOrder && Intrinsics.c(this.coordinate, navigationWaypoint.coordinate);
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

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.coordinate.hashCode() + androidx.camera.core.impl.b.a(this.floorOrder, androidx.camera.core.impl.b.c(this.id.hashCode() * 31, 31, this.buildingId), 31);
    }

    public final double plainDistance(@NotNull IndoorCoordinate to) {
        Intrinsics.h(to, "to");
        double d = 2;
        return Math.sqrt(Math.pow(this.coordinate.getY() - to.getY(), d) + Math.pow(this.coordinate.getX() - to.getX(), d));
    }

    @NotNull
    public String toString() {
        return "NavigationWaypoint(id=" + this.id + ", buildingId=" + this.buildingId + ", floorOrder=" + this.floorOrder + ", coordinate=" + this.coordinate + ')';
    }

    public NavigationWaypoint(@NotNull String id, @NotNull String buildingId, int i, @NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(id, "id");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(coordinate, "coordinate");
        this.id = id;
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.coordinate = coordinate;
    }
}
