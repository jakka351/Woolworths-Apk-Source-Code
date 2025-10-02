package me.oriient.internal.services.dataModel.navigation;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@B\u0087\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B\u0089\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0092\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u000206HÖ\u0001J&\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÁ\u0001¢\u0006\u0002\b>R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0004\u0010\u0015R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b \u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018¨\u0006A"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/NavigationConfigResponse;", "", "seen1", "", "isNavigationDataPreloadingEnabled", "", "minDistanceToRecalculateNavRouteMeters", "", "shouldUseTailTrimming", "tailTrimming_maxPositionJumpMeters", "tailTrimming_AcceptableDistanceToRouteSegmentMeters", "tailTrimming_RouteSegmentLengthMeters", "tailTrimming_DistanceShrinkingRation", "tailTrimming_RouteRecalculationDistanceMeters", "tailTrimming_AllowFirstWaypointTrimming", "tailTrimming_FirstWaypointTrimmingMaxDistance", "minDistanceBetweenStartAndPosition", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinDistanceBetweenStartAndPosition", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDistanceToRecalculateNavRouteMeters", "getShouldUseTailTrimming", "getTailTrimming_AcceptableDistanceToRouteSegmentMeters", "getTailTrimming_AllowFirstWaypointTrimming", "getTailTrimming_DistanceShrinkingRation", "getTailTrimming_FirstWaypointTrimmingMaxDistance", "getTailTrimming_RouteRecalculationDistanceMeters", "getTailTrimming_RouteSegmentLengthMeters", "getTailTrimming_maxPositionJumpMeters", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/navigation/NavigationConfigResponse;", "equals", "other", "hashCode", "toNavigationConfig", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfig;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class NavigationConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Boolean isNavigationDataPreloadingEnabled;

    @Nullable
    private final Double minDistanceBetweenStartAndPosition;

    @Nullable
    private final Double minDistanceToRecalculateNavRouteMeters;

    @Nullable
    private final Boolean shouldUseTailTrimming;

    @Nullable
    private final Double tailTrimming_AcceptableDistanceToRouteSegmentMeters;

    @Nullable
    private final Boolean tailTrimming_AllowFirstWaypointTrimming;

    @Nullable
    private final Double tailTrimming_DistanceShrinkingRation;

    @Nullable
    private final Double tailTrimming_FirstWaypointTrimmingMaxDistance;

    @Nullable
    private final Double tailTrimming_RouteRecalculationDistanceMeters;

    @Nullable
    private final Double tailTrimming_RouteSegmentLengthMeters;

    @Nullable
    private final Double tailTrimming_maxPositionJumpMeters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/NavigationConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/navigation/NavigationConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<NavigationConfigResponse> serializer() {
            return NavigationConfigResponse$$serializer.INSTANCE;
        }
    }

    public NavigationConfigResponse() {
        this((Boolean) null, (Double) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Double) null, (Double) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NavigationConfigResponse copy$default(NavigationConfigResponse navigationConfigResponse, Boolean bool, Double d, Boolean bool2, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = navigationConfigResponse.isNavigationDataPreloadingEnabled;
        }
        if ((i & 2) != 0) {
            d = navigationConfigResponse.minDistanceToRecalculateNavRouteMeters;
        }
        if ((i & 4) != 0) {
            bool2 = navigationConfigResponse.shouldUseTailTrimming;
        }
        if ((i & 8) != 0) {
            d2 = navigationConfigResponse.tailTrimming_maxPositionJumpMeters;
        }
        if ((i & 16) != 0) {
            d3 = navigationConfigResponse.tailTrimming_AcceptableDistanceToRouteSegmentMeters;
        }
        if ((i & 32) != 0) {
            d4 = navigationConfigResponse.tailTrimming_RouteSegmentLengthMeters;
        }
        if ((i & 64) != 0) {
            d5 = navigationConfigResponse.tailTrimming_DistanceShrinkingRation;
        }
        if ((i & 128) != 0) {
            d6 = navigationConfigResponse.tailTrimming_RouteRecalculationDistanceMeters;
        }
        if ((i & 256) != 0) {
            bool3 = navigationConfigResponse.tailTrimming_AllowFirstWaypointTrimming;
        }
        if ((i & 512) != 0) {
            d7 = navigationConfigResponse.tailTrimming_FirstWaypointTrimmingMaxDistance;
        }
        if ((i & 1024) != 0) {
            d8 = navigationConfigResponse.minDistanceBetweenStartAndPosition;
        }
        Double d9 = d7;
        Double d10 = d8;
        Double d11 = d6;
        Boolean bool4 = bool3;
        Double d12 = d4;
        Double d13 = d5;
        Double d14 = d3;
        Boolean bool5 = bool2;
        return navigationConfigResponse.copy(bool, d, bool5, d2, d14, d12, d13, d11, bool4, d9, d10);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(NavigationConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.isNavigationDataPreloadingEnabled != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.isNavigationDataPreloadingEnabled);
        }
        if (output.q(serialDesc, 1) || self.minDistanceToRecalculateNavRouteMeters != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.minDistanceToRecalculateNavRouteMeters);
        }
        if (output.q(serialDesc, 2) || self.shouldUseTailTrimming != null) {
            output.w(serialDesc, 2, BooleanSerializer.f24779a, self.shouldUseTailTrimming);
        }
        if (output.q(serialDesc, 3) || self.tailTrimming_maxPositionJumpMeters != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.tailTrimming_maxPositionJumpMeters);
        }
        if (output.q(serialDesc, 4) || self.tailTrimming_AcceptableDistanceToRouteSegmentMeters != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.tailTrimming_AcceptableDistanceToRouteSegmentMeters);
        }
        if (output.q(serialDesc, 5) || self.tailTrimming_RouteSegmentLengthMeters != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.tailTrimming_RouteSegmentLengthMeters);
        }
        if (output.q(serialDesc, 6) || self.tailTrimming_DistanceShrinkingRation != null) {
            output.w(serialDesc, 6, DoubleSerializer.f24792a, self.tailTrimming_DistanceShrinkingRation);
        }
        if (output.q(serialDesc, 7) || self.tailTrimming_RouteRecalculationDistanceMeters != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.tailTrimming_RouteRecalculationDistanceMeters);
        }
        if (output.q(serialDesc, 8) || self.tailTrimming_AllowFirstWaypointTrimming != null) {
            output.w(serialDesc, 8, BooleanSerializer.f24779a, self.tailTrimming_AllowFirstWaypointTrimming);
        }
        if (output.q(serialDesc, 9) || self.tailTrimming_FirstWaypointTrimmingMaxDistance != null) {
            output.w(serialDesc, 9, DoubleSerializer.f24792a, self.tailTrimming_FirstWaypointTrimmingMaxDistance);
        }
        if (!output.q(serialDesc, 10) && self.minDistanceBetweenStartAndPosition == null) {
            return;
        }
        output.w(serialDesc, 10, DoubleSerializer.f24792a, self.minDistanceBetweenStartAndPosition);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsNavigationDataPreloadingEnabled() {
        return this.isNavigationDataPreloadingEnabled;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getTailTrimming_FirstWaypointTrimmingMaxDistance() {
        return this.tailTrimming_FirstWaypointTrimmingMaxDistance;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getMinDistanceBetweenStartAndPosition() {
        return this.minDistanceBetweenStartAndPosition;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getMinDistanceToRecalculateNavRouteMeters() {
        return this.minDistanceToRecalculateNavRouteMeters;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getShouldUseTailTrimming() {
        return this.shouldUseTailTrimming;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getTailTrimming_maxPositionJumpMeters() {
        return this.tailTrimming_maxPositionJumpMeters;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getTailTrimming_AcceptableDistanceToRouteSegmentMeters() {
        return this.tailTrimming_AcceptableDistanceToRouteSegmentMeters;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getTailTrimming_RouteSegmentLengthMeters() {
        return this.tailTrimming_RouteSegmentLengthMeters;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getTailTrimming_DistanceShrinkingRation() {
        return this.tailTrimming_DistanceShrinkingRation;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getTailTrimming_RouteRecalculationDistanceMeters() {
        return this.tailTrimming_RouteRecalculationDistanceMeters;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getTailTrimming_AllowFirstWaypointTrimming() {
        return this.tailTrimming_AllowFirstWaypointTrimming;
    }

    @NotNull
    public final NavigationConfigResponse copy(@Nullable Boolean isNavigationDataPreloadingEnabled, @Nullable Double minDistanceToRecalculateNavRouteMeters, @Nullable Boolean shouldUseTailTrimming, @Nullable Double tailTrimming_maxPositionJumpMeters, @Nullable Double tailTrimming_AcceptableDistanceToRouteSegmentMeters, @Nullable Double tailTrimming_RouteSegmentLengthMeters, @Nullable Double tailTrimming_DistanceShrinkingRation, @Nullable Double tailTrimming_RouteRecalculationDistanceMeters, @Nullable Boolean tailTrimming_AllowFirstWaypointTrimming, @Nullable Double tailTrimming_FirstWaypointTrimmingMaxDistance, @Nullable Double minDistanceBetweenStartAndPosition) {
        return new NavigationConfigResponse(isNavigationDataPreloadingEnabled, minDistanceToRecalculateNavRouteMeters, shouldUseTailTrimming, tailTrimming_maxPositionJumpMeters, tailTrimming_AcceptableDistanceToRouteSegmentMeters, tailTrimming_RouteSegmentLengthMeters, tailTrimming_DistanceShrinkingRation, tailTrimming_RouteRecalculationDistanceMeters, tailTrimming_AllowFirstWaypointTrimming, tailTrimming_FirstWaypointTrimmingMaxDistance, minDistanceBetweenStartAndPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationConfigResponse)) {
            return false;
        }
        NavigationConfigResponse navigationConfigResponse = (NavigationConfigResponse) other;
        return Intrinsics.c(this.isNavigationDataPreloadingEnabled, navigationConfigResponse.isNavigationDataPreloadingEnabled) && Intrinsics.c(this.minDistanceToRecalculateNavRouteMeters, navigationConfigResponse.minDistanceToRecalculateNavRouteMeters) && Intrinsics.c(this.shouldUseTailTrimming, navigationConfigResponse.shouldUseTailTrimming) && Intrinsics.c(this.tailTrimming_maxPositionJumpMeters, navigationConfigResponse.tailTrimming_maxPositionJumpMeters) && Intrinsics.c(this.tailTrimming_AcceptableDistanceToRouteSegmentMeters, navigationConfigResponse.tailTrimming_AcceptableDistanceToRouteSegmentMeters) && Intrinsics.c(this.tailTrimming_RouteSegmentLengthMeters, navigationConfigResponse.tailTrimming_RouteSegmentLengthMeters) && Intrinsics.c(this.tailTrimming_DistanceShrinkingRation, navigationConfigResponse.tailTrimming_DistanceShrinkingRation) && Intrinsics.c(this.tailTrimming_RouteRecalculationDistanceMeters, navigationConfigResponse.tailTrimming_RouteRecalculationDistanceMeters) && Intrinsics.c(this.tailTrimming_AllowFirstWaypointTrimming, navigationConfigResponse.tailTrimming_AllowFirstWaypointTrimming) && Intrinsics.c(this.tailTrimming_FirstWaypointTrimmingMaxDistance, navigationConfigResponse.tailTrimming_FirstWaypointTrimmingMaxDistance) && Intrinsics.c(this.minDistanceBetweenStartAndPosition, navigationConfigResponse.minDistanceBetweenStartAndPosition);
    }

    @Nullable
    public final Double getMinDistanceBetweenStartAndPosition() {
        return this.minDistanceBetweenStartAndPosition;
    }

    @Nullable
    public final Double getMinDistanceToRecalculateNavRouteMeters() {
        return this.minDistanceToRecalculateNavRouteMeters;
    }

    @Nullable
    public final Boolean getShouldUseTailTrimming() {
        return this.shouldUseTailTrimming;
    }

    @Nullable
    public final Double getTailTrimming_AcceptableDistanceToRouteSegmentMeters() {
        return this.tailTrimming_AcceptableDistanceToRouteSegmentMeters;
    }

    @Nullable
    public final Boolean getTailTrimming_AllowFirstWaypointTrimming() {
        return this.tailTrimming_AllowFirstWaypointTrimming;
    }

    @Nullable
    public final Double getTailTrimming_DistanceShrinkingRation() {
        return this.tailTrimming_DistanceShrinkingRation;
    }

    @Nullable
    public final Double getTailTrimming_FirstWaypointTrimmingMaxDistance() {
        return this.tailTrimming_FirstWaypointTrimmingMaxDistance;
    }

    @Nullable
    public final Double getTailTrimming_RouteRecalculationDistanceMeters() {
        return this.tailTrimming_RouteRecalculationDistanceMeters;
    }

    @Nullable
    public final Double getTailTrimming_RouteSegmentLengthMeters() {
        return this.tailTrimming_RouteSegmentLengthMeters;
    }

    @Nullable
    public final Double getTailTrimming_maxPositionJumpMeters() {
        return this.tailTrimming_maxPositionJumpMeters;
    }

    public int hashCode() {
        Boolean bool = this.isNavigationDataPreloadingEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.minDistanceToRecalculateNavRouteMeters;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool2 = this.shouldUseTailTrimming;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d2 = this.tailTrimming_maxPositionJumpMeters;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.tailTrimming_AcceptableDistanceToRouteSegmentMeters;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.tailTrimming_RouteSegmentLengthMeters;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.tailTrimming_DistanceShrinkingRation;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.tailTrimming_RouteRecalculationDistanceMeters;
        int iHashCode8 = (iHashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool3 = this.tailTrimming_AllowFirstWaypointTrimming;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Double d7 = this.tailTrimming_FirstWaypointTrimmingMaxDistance;
        int iHashCode10 = (iHashCode9 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.minDistanceBetweenStartAndPosition;
        return iHashCode10 + (d8 != null ? d8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNavigationDataPreloadingEnabled() {
        return this.isNavigationDataPreloadingEnabled;
    }

    @NotNull
    public final NavigationConfig toNavigationConfig() {
        Boolean bool = this.isNavigationDataPreloadingEnabled;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Double d = this.minDistanceToRecalculateNavRouteMeters;
        double dDoubleValue = d != null ? d.doubleValue() : 1.0d;
        Boolean bool2 = this.shouldUseTailTrimming;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Double d2 = this.tailTrimming_maxPositionJumpMeters;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 8.0d;
        Double d3 = this.tailTrimming_AcceptableDistanceToRouteSegmentMeters;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 3.5d;
        Double d4 = this.tailTrimming_RouteSegmentLengthMeters;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.5d;
        Double d5 = this.tailTrimming_DistanceShrinkingRation;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.75d;
        Double d6 = this.tailTrimming_RouteRecalculationDistanceMeters;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 2.0d;
        Boolean bool3 = this.tailTrimming_AllowFirstWaypointTrimming;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        Double d7 = this.tailTrimming_FirstWaypointTrimmingMaxDistance;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 5.0d;
        Double d8 = this.minDistanceBetweenStartAndPosition;
        return new NavigationConfig(zBooleanValue, dDoubleValue, zBooleanValue2, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, zBooleanValue3, dDoubleValue7, d8 != null ? d8.doubleValue() : 0.05d);
    }

    @NotNull
    public String toString() {
        return "NavigationConfigResponse(isNavigationDataPreloadingEnabled=" + this.isNavigationDataPreloadingEnabled + ", minDistanceToRecalculateNavRouteMeters=" + this.minDistanceToRecalculateNavRouteMeters + ", shouldUseTailTrimming=" + this.shouldUseTailTrimming + ", tailTrimming_maxPositionJumpMeters=" + this.tailTrimming_maxPositionJumpMeters + ", tailTrimming_AcceptableDistanceToRouteSegmentMeters=" + this.tailTrimming_AcceptableDistanceToRouteSegmentMeters + ", tailTrimming_RouteSegmentLengthMeters=" + this.tailTrimming_RouteSegmentLengthMeters + ", tailTrimming_DistanceShrinkingRation=" + this.tailTrimming_DistanceShrinkingRation + ", tailTrimming_RouteRecalculationDistanceMeters=" + this.tailTrimming_RouteRecalculationDistanceMeters + ", tailTrimming_AllowFirstWaypointTrimming=" + this.tailTrimming_AllowFirstWaypointTrimming + ", tailTrimming_FirstWaypointTrimmingMaxDistance=" + this.tailTrimming_FirstWaypointTrimmingMaxDistance + ", minDistanceBetweenStartAndPosition=" + this.minDistanceBetweenStartAndPosition + ')';
    }

    @Deprecated
    public /* synthetic */ NavigationConfigResponse(int i, Boolean bool, Double d, Boolean bool2, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isNavigationDataPreloadingEnabled = null;
        } else {
            this.isNavigationDataPreloadingEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.minDistanceToRecalculateNavRouteMeters = null;
        } else {
            this.minDistanceToRecalculateNavRouteMeters = d;
        }
        if ((i & 4) == 0) {
            this.shouldUseTailTrimming = null;
        } else {
            this.shouldUseTailTrimming = bool2;
        }
        if ((i & 8) == 0) {
            this.tailTrimming_maxPositionJumpMeters = null;
        } else {
            this.tailTrimming_maxPositionJumpMeters = d2;
        }
        if ((i & 16) == 0) {
            this.tailTrimming_AcceptableDistanceToRouteSegmentMeters = null;
        } else {
            this.tailTrimming_AcceptableDistanceToRouteSegmentMeters = d3;
        }
        if ((i & 32) == 0) {
            this.tailTrimming_RouteSegmentLengthMeters = null;
        } else {
            this.tailTrimming_RouteSegmentLengthMeters = d4;
        }
        if ((i & 64) == 0) {
            this.tailTrimming_DistanceShrinkingRation = null;
        } else {
            this.tailTrimming_DistanceShrinkingRation = d5;
        }
        if ((i & 128) == 0) {
            this.tailTrimming_RouteRecalculationDistanceMeters = null;
        } else {
            this.tailTrimming_RouteRecalculationDistanceMeters = d6;
        }
        if ((i & 256) == 0) {
            this.tailTrimming_AllowFirstWaypointTrimming = null;
        } else {
            this.tailTrimming_AllowFirstWaypointTrimming = bool3;
        }
        if ((i & 512) == 0) {
            this.tailTrimming_FirstWaypointTrimmingMaxDistance = null;
        } else {
            this.tailTrimming_FirstWaypointTrimmingMaxDistance = d7;
        }
        if ((i & 1024) == 0) {
            this.minDistanceBetweenStartAndPosition = null;
        } else {
            this.minDistanceBetweenStartAndPosition = d8;
        }
    }

    public NavigationConfigResponse(@Nullable Boolean bool, @Nullable Double d, @Nullable Boolean bool2, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Boolean bool3, @Nullable Double d7, @Nullable Double d8) {
        this.isNavigationDataPreloadingEnabled = bool;
        this.minDistanceToRecalculateNavRouteMeters = d;
        this.shouldUseTailTrimming = bool2;
        this.tailTrimming_maxPositionJumpMeters = d2;
        this.tailTrimming_AcceptableDistanceToRouteSegmentMeters = d3;
        this.tailTrimming_RouteSegmentLengthMeters = d4;
        this.tailTrimming_DistanceShrinkingRation = d5;
        this.tailTrimming_RouteRecalculationDistanceMeters = d6;
        this.tailTrimming_AllowFirstWaypointTrimming = bool3;
        this.tailTrimming_FirstWaypointTrimmingMaxDistance = d7;
        this.minDistanceBetweenStartAndPosition = d8;
    }

    public /* synthetic */ NavigationConfigResponse(Boolean bool, Double d, Boolean bool2, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool3, Double d7, Double d8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : d4, (i & 64) != 0 ? null : d5, (i & 128) != 0 ? null : d6, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : d7, (i & 1024) != 0 ? null : d8);
    }
}
