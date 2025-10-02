package me.oriient.navigation.turnByTurn.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lme/oriient/navigation/turnByTurn/models/NavigationInstruction;", "", "direction", "Lme/oriient/navigation/turnByTurn/models/NavigationDirection;", "distance", "", "(Lme/oriient/navigation/turnByTurn/models/NavigationDirection;Ljava/lang/Double;)V", "getDirection", "()Lme/oriient/navigation/turnByTurn/models/NavigationDirection;", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Lme/oriient/navigation/turnByTurn/models/NavigationDirection;Ljava/lang/Double;)Lme/oriient/navigation/turnByTurn/models/NavigationInstruction;", "equals", "", "other", "hashCode", "", "toString", "", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NavigationInstruction {

    @NotNull
    private final NavigationDirection direction;

    @Nullable
    private final Double distance;

    public NavigationInstruction(@NotNull NavigationDirection direction, @Nullable Double d) {
        Intrinsics.h(direction, "direction");
        this.direction = direction;
        this.distance = d;
    }

    public static /* synthetic */ NavigationInstruction copy$default(NavigationInstruction navigationInstruction, NavigationDirection navigationDirection, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationDirection = navigationInstruction.direction;
        }
        if ((i & 2) != 0) {
            d = navigationInstruction.distance;
        }
        return navigationInstruction.copy(navigationDirection, d);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavigationDirection getDirection() {
        return this.direction;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    @NotNull
    public final NavigationInstruction copy(@NotNull NavigationDirection direction, @Nullable Double distance) {
        Intrinsics.h(direction, "direction");
        return new NavigationInstruction(direction, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationInstruction)) {
            return false;
        }
        NavigationInstruction navigationInstruction = (NavigationInstruction) other;
        return this.direction == navigationInstruction.direction && Intrinsics.c(this.distance, navigationInstruction.distance);
    }

    @NotNull
    public final NavigationDirection getDirection() {
        return this.direction;
    }

    @Nullable
    public final Double getDistance() {
        return this.distance;
    }

    public int hashCode() {
        int iHashCode = this.direction.hashCode() * 31;
        Double d = this.distance;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    @NotNull
    public String toString() {
        return "NavigationInstruction(direction=" + this.direction + ", distance=" + this.distance + ')';
    }
}
