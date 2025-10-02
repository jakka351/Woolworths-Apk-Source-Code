package me.oriient.internal.services.dataModel.navigation;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.scheduler.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jw\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006."}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "", "isNavigationDataPreloadingEnabled", "", "minDistanceToRecalculateNavRouteMeters", "", "shouldUseTailTrimming", "maxPositionJumpMeters", "acceptableDistanceToRouteSegmentMeters", "routeSegmentLengthMeters", "distanceShrinkingRation", "routeRecalculationDistanceMeters", "allowFirstWaypointTrimming", "firstWaypointTrimmingMaxDistance", "minDistanceBetweenStartAndPosition", "(ZDZDDDDDZDD)V", "getAcceptableDistanceToRouteSegmentMeters", "()D", "getAllowFirstWaypointTrimming", "()Z", "getDistanceShrinkingRation", "getFirstWaypointTrimmingMaxDistance", "getMaxPositionJumpMeters", "getMinDistanceBetweenStartAndPosition", "getMinDistanceToRecalculateNavRouteMeters", "getRouteRecalculationDistanceMeters", "getRouteSegmentLengthMeters", "getShouldUseTailTrimming", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NavigationConfig {
    private final double acceptableDistanceToRouteSegmentMeters;
    private final boolean allowFirstWaypointTrimming;
    private final double distanceShrinkingRation;
    private final double firstWaypointTrimmingMaxDistance;
    private final boolean isNavigationDataPreloadingEnabled;
    private final double maxPositionJumpMeters;
    private final double minDistanceBetweenStartAndPosition;
    private final double minDistanceToRecalculateNavRouteMeters;
    private final double routeRecalculationDistanceMeters;
    private final double routeSegmentLengthMeters;
    private final boolean shouldUseTailTrimming;

    public NavigationConfig(boolean z, double d, boolean z2, double d2, double d3, double d4, double d5, double d6, boolean z3, double d7, double d8) {
        this.isNavigationDataPreloadingEnabled = z;
        this.minDistanceToRecalculateNavRouteMeters = d;
        this.shouldUseTailTrimming = z2;
        this.maxPositionJumpMeters = d2;
        this.acceptableDistanceToRouteSegmentMeters = d3;
        this.routeSegmentLengthMeters = d4;
        this.distanceShrinkingRation = d5;
        this.routeRecalculationDistanceMeters = d6;
        this.allowFirstWaypointTrimming = z3;
        this.firstWaypointTrimmingMaxDistance = d7;
        this.minDistanceBetweenStartAndPosition = d8;
    }

    public static /* synthetic */ NavigationConfig copy$default(NavigationConfig navigationConfig, boolean z, double d, boolean z2, double d2, double d3, double d4, double d5, double d6, boolean z3, double d7, double d8, int i, Object obj) {
        double d9;
        double d10;
        boolean z4 = (i & 1) != 0 ? navigationConfig.isNavigationDataPreloadingEnabled : z;
        double d11 = (i & 2) != 0 ? navigationConfig.minDistanceToRecalculateNavRouteMeters : d;
        boolean z5 = (i & 4) != 0 ? navigationConfig.shouldUseTailTrimming : z2;
        double d12 = (i & 8) != 0 ? navigationConfig.maxPositionJumpMeters : d2;
        double d13 = (i & 16) != 0 ? navigationConfig.acceptableDistanceToRouteSegmentMeters : d3;
        double d14 = (i & 32) != 0 ? navigationConfig.routeSegmentLengthMeters : d4;
        double d15 = (i & 64) != 0 ? navigationConfig.distanceShrinkingRation : d5;
        double d16 = (i & 128) != 0 ? navigationConfig.routeRecalculationDistanceMeters : d6;
        boolean z6 = z4;
        boolean z7 = (i & 256) != 0 ? navigationConfig.allowFirstWaypointTrimming : z3;
        double d17 = d11;
        double d18 = (i & 512) != 0 ? navigationConfig.firstWaypointTrimmingMaxDistance : d7;
        if ((i & 1024) != 0) {
            d10 = d18;
            d9 = navigationConfig.minDistanceBetweenStartAndPosition;
        } else {
            d9 = d8;
            d10 = d18;
        }
        return navigationConfig.copy(z6, d17, z5, d12, d13, d14, d15, d16, z7, d10, d9);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNavigationDataPreloadingEnabled() {
        return this.isNavigationDataPreloadingEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final double getFirstWaypointTrimmingMaxDistance() {
        return this.firstWaypointTrimmingMaxDistance;
    }

    /* renamed from: component11, reason: from getter */
    public final double getMinDistanceBetweenStartAndPosition() {
        return this.minDistanceBetweenStartAndPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMinDistanceToRecalculateNavRouteMeters() {
        return this.minDistanceToRecalculateNavRouteMeters;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldUseTailTrimming() {
        return this.shouldUseTailTrimming;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMaxPositionJumpMeters() {
        return this.maxPositionJumpMeters;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAcceptableDistanceToRouteSegmentMeters() {
        return this.acceptableDistanceToRouteSegmentMeters;
    }

    /* renamed from: component6, reason: from getter */
    public final double getRouteSegmentLengthMeters() {
        return this.routeSegmentLengthMeters;
    }

    /* renamed from: component7, reason: from getter */
    public final double getDistanceShrinkingRation() {
        return this.distanceShrinkingRation;
    }

    /* renamed from: component8, reason: from getter */
    public final double getRouteRecalculationDistanceMeters() {
        return this.routeRecalculationDistanceMeters;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAllowFirstWaypointTrimming() {
        return this.allowFirstWaypointTrimming;
    }

    @NotNull
    public final NavigationConfig copy(boolean isNavigationDataPreloadingEnabled, double minDistanceToRecalculateNavRouteMeters, boolean shouldUseTailTrimming, double maxPositionJumpMeters, double acceptableDistanceToRouteSegmentMeters, double routeSegmentLengthMeters, double distanceShrinkingRation, double routeRecalculationDistanceMeters, boolean allowFirstWaypointTrimming, double firstWaypointTrimmingMaxDistance, double minDistanceBetweenStartAndPosition) {
        return new NavigationConfig(isNavigationDataPreloadingEnabled, minDistanceToRecalculateNavRouteMeters, shouldUseTailTrimming, maxPositionJumpMeters, acceptableDistanceToRouteSegmentMeters, routeSegmentLengthMeters, distanceShrinkingRation, routeRecalculationDistanceMeters, allowFirstWaypointTrimming, firstWaypointTrimmingMaxDistance, minDistanceBetweenStartAndPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationConfig)) {
            return false;
        }
        NavigationConfig navigationConfig = (NavigationConfig) other;
        return this.isNavigationDataPreloadingEnabled == navigationConfig.isNavigationDataPreloadingEnabled && Double.compare(this.minDistanceToRecalculateNavRouteMeters, navigationConfig.minDistanceToRecalculateNavRouteMeters) == 0 && this.shouldUseTailTrimming == navigationConfig.shouldUseTailTrimming && Double.compare(this.maxPositionJumpMeters, navigationConfig.maxPositionJumpMeters) == 0 && Double.compare(this.acceptableDistanceToRouteSegmentMeters, navigationConfig.acceptableDistanceToRouteSegmentMeters) == 0 && Double.compare(this.routeSegmentLengthMeters, navigationConfig.routeSegmentLengthMeters) == 0 && Double.compare(this.distanceShrinkingRation, navigationConfig.distanceShrinkingRation) == 0 && Double.compare(this.routeRecalculationDistanceMeters, navigationConfig.routeRecalculationDistanceMeters) == 0 && this.allowFirstWaypointTrimming == navigationConfig.allowFirstWaypointTrimming && Double.compare(this.firstWaypointTrimmingMaxDistance, navigationConfig.firstWaypointTrimmingMaxDistance) == 0 && Double.compare(this.minDistanceBetweenStartAndPosition, navigationConfig.minDistanceBetweenStartAndPosition) == 0;
    }

    public final double getAcceptableDistanceToRouteSegmentMeters() {
        return this.acceptableDistanceToRouteSegmentMeters;
    }

    public final boolean getAllowFirstWaypointTrimming() {
        return this.allowFirstWaypointTrimming;
    }

    public final double getDistanceShrinkingRation() {
        return this.distanceShrinkingRation;
    }

    public final double getFirstWaypointTrimmingMaxDistance() {
        return this.firstWaypointTrimmingMaxDistance;
    }

    public final double getMaxPositionJumpMeters() {
        return this.maxPositionJumpMeters;
    }

    public final double getMinDistanceBetweenStartAndPosition() {
        return this.minDistanceBetweenStartAndPosition;
    }

    public final double getMinDistanceToRecalculateNavRouteMeters() {
        return this.minDistanceToRecalculateNavRouteMeters;
    }

    public final double getRouteRecalculationDistanceMeters() {
        return this.routeRecalculationDistanceMeters;
    }

    public final double getRouteSegmentLengthMeters() {
        return this.routeSegmentLengthMeters;
    }

    public final boolean getShouldUseTailTrimming() {
        return this.shouldUseTailTrimming;
    }

    public int hashCode() {
        return Double.hashCode(this.minDistanceBetweenStartAndPosition) + J.a(this.firstWaypointTrimmingMaxDistance, a.a(this.allowFirstWaypointTrimming, J.a(this.routeRecalculationDistanceMeters, J.a(this.distanceShrinkingRation, J.a(this.routeSegmentLengthMeters, J.a(this.acceptableDistanceToRouteSegmentMeters, J.a(this.maxPositionJumpMeters, a.a(this.shouldUseTailTrimming, J.a(this.minDistanceToRecalculateNavRouteMeters, Boolean.hashCode(this.isNavigationDataPreloadingEnabled) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isNavigationDataPreloadingEnabled() {
        return this.isNavigationDataPreloadingEnabled;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationConfig(isNavigationDataPreloadingEnabled=");
        sb.append(this.isNavigationDataPreloadingEnabled);
        sb.append(", minDistanceToRecalculateNavRouteMeters=");
        sb.append(this.minDistanceToRecalculateNavRouteMeters);
        sb.append(", shouldUseTailTrimming=");
        sb.append(this.shouldUseTailTrimming);
        sb.append(", maxPositionJumpMeters=");
        sb.append(this.maxPositionJumpMeters);
        sb.append(", acceptableDistanceToRouteSegmentMeters=");
        sb.append(this.acceptableDistanceToRouteSegmentMeters);
        sb.append(", routeSegmentLengthMeters=");
        sb.append(this.routeSegmentLengthMeters);
        sb.append(", distanceShrinkingRation=");
        sb.append(this.distanceShrinkingRation);
        sb.append(", routeRecalculationDistanceMeters=");
        sb.append(this.routeRecalculationDistanceMeters);
        sb.append(", allowFirstWaypointTrimming=");
        sb.append(this.allowFirstWaypointTrimming);
        sb.append(", firstWaypointTrimmingMaxDistance=");
        sb.append(this.firstWaypointTrimmingMaxDistance);
        sb.append(", minDistanceBetweenStartAndPosition=");
        return b.p(sb, this.minDistanceBetweenStartAndPosition, ')');
    }
}
