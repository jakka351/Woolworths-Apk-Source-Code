package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lme/oriient/navigation/common/models/NavigationPosition;", "", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "heading", "Lme/oriient/navigation/common/models/NavigationHeading;", "serverTimeMillis", "", "buildingId", "", "floorOrder", "", "(Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/navigation/common/models/NavigationHeading;JLjava/lang/String;I)V", "getBuildingId", "()Ljava/lang/String;", "getCoordinate", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getFloorOrder", "()I", "getHeading", "()Lme/oriient/navigation/common/models/NavigationHeading;", "getServerTimeMillis", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationPosition {

    @NotNull
    private final String buildingId;

    @NotNull
    private final IndoorCoordinate coordinate;
    private final int floorOrder;

    @NotNull
    private final NavigationHeading heading;
    private final long serverTimeMillis;

    public NavigationPosition(@NotNull IndoorCoordinate coordinate, @NotNull NavigationHeading heading, long j, @NotNull String buildingId, int i) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(buildingId, "buildingId");
        this.coordinate = coordinate;
        this.heading = heading;
        this.serverTimeMillis = j;
        this.buildingId = buildingId;
        this.floorOrder = i;
    }

    public static /* synthetic */ NavigationPosition copy$default(NavigationPosition navigationPosition, IndoorCoordinate indoorCoordinate, NavigationHeading navigationHeading, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            indoorCoordinate = navigationPosition.coordinate;
        }
        if ((i2 & 2) != 0) {
            navigationHeading = navigationPosition.heading;
        }
        if ((i2 & 4) != 0) {
            j = navigationPosition.serverTimeMillis;
        }
        if ((i2 & 8) != 0) {
            str = navigationPosition.buildingId;
        }
        if ((i2 & 16) != 0) {
            i = navigationPosition.floorOrder;
        }
        long j2 = j;
        return navigationPosition.copy(indoorCoordinate, navigationHeading, j2, str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavigationHeading getHeading() {
        return this.heading;
    }

    /* renamed from: component3, reason: from getter */
    public final long getServerTimeMillis() {
        return this.serverTimeMillis;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final NavigationPosition copy(@NotNull IndoorCoordinate coordinate, @NotNull NavigationHeading heading, long serverTimeMillis, @NotNull String buildingId, int floorOrder) {
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(buildingId, "buildingId");
        return new NavigationPosition(coordinate, heading, serverTimeMillis, buildingId, floorOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationPosition)) {
            return false;
        }
        NavigationPosition navigationPosition = (NavigationPosition) other;
        return Intrinsics.c(this.coordinate, navigationPosition.coordinate) && Intrinsics.c(this.heading, navigationPosition.heading) && this.serverTimeMillis == navigationPosition.serverTimeMillis && Intrinsics.c(this.buildingId, navigationPosition.buildingId) && this.floorOrder == navigationPosition.floorOrder;
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
    public final NavigationHeading getHeading() {
        return this.heading;
    }

    public final long getServerTimeMillis() {
        return this.serverTimeMillis;
    }

    public int hashCode() {
        return Integer.hashCode(this.floorOrder) + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.b((this.heading.hashCode() + (this.coordinate.hashCode() * 31)) * 31, 31, this.serverTimeMillis), 31, this.buildingId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationPosition(coordinate=");
        sb.append(this.coordinate);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", serverTimeMillis=");
        sb.append(this.serverTimeMillis);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorOrder=");
        return YU.a.l(sb, this.floorOrder, ')');
    }
}
