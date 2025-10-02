package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006."}, d2 = {"Lme/oriient/navigation/common/models/Turn;", "", "id", "", "coordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "direction", "Lme/oriient/navigation/common/models/TurnDirection;", "buildingId", "floorOrder", "", "distanceFromUser", "", "distanceFromStart", "distanceFromPreviousTurn", "angleInDegrees", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/navigation/common/models/TurnDirection;Ljava/lang/String;IDDDD)V", "getAngleInDegrees", "()D", "getBuildingId", "()Ljava/lang/String;", "getCoordinate", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getDirection", "()Lme/oriient/navigation/common/models/TurnDirection;", "getDistanceFromPreviousTurn", "getDistanceFromStart", "getDistanceFromUser", "getFloorOrder", "()I", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Turn {
    private final double angleInDegrees;

    @NotNull
    private final String buildingId;

    @NotNull
    private final IndoorCoordinate coordinate;

    @NotNull
    private final TurnDirection direction;
    private final double distanceFromPreviousTurn;
    private final double distanceFromStart;
    private final double distanceFromUser;
    private final int floorOrder;

    @NotNull
    private final String id;

    public Turn(@NotNull String id, @NotNull IndoorCoordinate coordinate, @NotNull TurnDirection direction, @NotNull String buildingId, int i, double d, double d2, double d3, double d4) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(direction, "direction");
        Intrinsics.h(buildingId, "buildingId");
        this.id = id;
        this.coordinate = coordinate;
        this.direction = direction;
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.distanceFromUser = d;
        this.distanceFromStart = d2;
        this.distanceFromPreviousTurn = d3;
        this.angleInDegrees = d4;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TurnDirection getDirection() {
        return this.direction;
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

    /* renamed from: component6, reason: from getter */
    public final double getDistanceFromUser() {
        return this.distanceFromUser;
    }

    /* renamed from: component7, reason: from getter */
    public final double getDistanceFromStart() {
        return this.distanceFromStart;
    }

    /* renamed from: component8, reason: from getter */
    public final double getDistanceFromPreviousTurn() {
        return this.distanceFromPreviousTurn;
    }

    /* renamed from: component9, reason: from getter */
    public final double getAngleInDegrees() {
        return this.angleInDegrees;
    }

    @NotNull
    public final Turn copy(@NotNull String id, @NotNull IndoorCoordinate coordinate, @NotNull TurnDirection direction, @NotNull String buildingId, int floorOrder, double distanceFromUser, double distanceFromStart, double distanceFromPreviousTurn, double angleInDegrees) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(direction, "direction");
        Intrinsics.h(buildingId, "buildingId");
        return new Turn(id, coordinate, direction, buildingId, floorOrder, distanceFromUser, distanceFromStart, distanceFromPreviousTurn, angleInDegrees);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Turn)) {
            return false;
        }
        Turn turn = (Turn) other;
        return Intrinsics.c(this.id, turn.id) && Intrinsics.c(this.coordinate, turn.coordinate) && this.direction == turn.direction && Intrinsics.c(this.buildingId, turn.buildingId) && this.floorOrder == turn.floorOrder && Double.compare(this.distanceFromUser, turn.distanceFromUser) == 0 && Double.compare(this.distanceFromStart, turn.distanceFromStart) == 0 && Double.compare(this.distanceFromPreviousTurn, turn.distanceFromPreviousTurn) == 0 && Double.compare(this.angleInDegrees, turn.angleInDegrees) == 0;
    }

    public final double getAngleInDegrees() {
        return this.angleInDegrees;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final IndoorCoordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final TurnDirection getDirection() {
        return this.direction;
    }

    public final double getDistanceFromPreviousTurn() {
        return this.distanceFromPreviousTurn;
    }

    public final double getDistanceFromStart() {
        return this.distanceFromStart;
    }

    public final double getDistanceFromUser() {
        return this.distanceFromUser;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Double.hashCode(this.angleInDegrees) + android.support.v4.media.session.a.a(this.distanceFromPreviousTurn, android.support.v4.media.session.a.a(this.distanceFromStart, android.support.v4.media.session.a.a(this.distanceFromUser, androidx.camera.core.impl.b.a(this.floorOrder, androidx.camera.core.impl.b.c((this.direction.hashCode() + ((this.coordinate.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.buildingId), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Turn(id=");
        sb.append(this.id);
        sb.append(", coordinate=");
        sb.append(this.coordinate);
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorOrder=");
        sb.append(this.floorOrder);
        sb.append(", distanceFromUser=");
        sb.append(this.distanceFromUser);
        sb.append(", distanceFromStart=");
        sb.append(this.distanceFromStart);
        sb.append(", distanceFromPreviousTurn=");
        sb.append(this.distanceFromPreviousTurn);
        sb.append(", angleInDegrees=");
        return androidx.camera.core.impl.b.p(sb, this.angleInDegrees, ')');
    }
}
