package me.oriient.internal.services.dataModel.navigation.turnByTurn;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "", "minimumDistanceToArriveMeters", "", "minimumDistanceToStraightInstructionMeters", "distanceToTurnAfterStraightInstructionMeters", "distanceForTurnAroundInstructionMeters", "maximumDegreesForTurnCalculationLimit", "lastUnnecessaryDistanceTurnInMeters", "sameDirectionTurnsSkipMinLengthMeters", "sameDirectionTurnsSkipMinAngleDegrees", "sameDirectionTurnsSkipMaxAngleDegrees", "oppositeDirectionTurnsSkipMinLengthMeters", "oppositeDirectionTurnsSkipAngleDegrees", "maxTurnAroundEdgeValueDegrees", "minTurnAroundEdgeValueDegrees", "turnAroundUpdateDelayTimeMillis", "", "turnAroundSwitchToNoTurnAroundStateDelayTimeMillis", "(DDDDDDDDDDDDDJJ)V", "getDistanceForTurnAroundInstructionMeters", "()D", "getDistanceToTurnAfterStraightInstructionMeters", "getLastUnnecessaryDistanceTurnInMeters", "getMaxTurnAroundEdgeValueDegrees", "getMaximumDegreesForTurnCalculationLimit", "getMinTurnAroundEdgeValueDegrees", "getMinimumDistanceToArriveMeters", "getMinimumDistanceToStraightInstructionMeters", "getOppositeDirectionTurnsSkipAngleDegrees", "getOppositeDirectionTurnsSkipMinLengthMeters", "getSameDirectionTurnsSkipMaxAngleDegrees", "getSameDirectionTurnsSkipMinAngleDegrees", "getSameDirectionTurnsSkipMinLengthMeters", "sameDirectionTurnsSkipRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "getSameDirectionTurnsSkipRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getTurnAroundSwitchToNoTurnAroundStateDelayTimeMillis", "()J", "getTurnAroundUpdateDelayTimeMillis", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TurnByTurnConfig {
    private final double distanceForTurnAroundInstructionMeters;
    private final double distanceToTurnAfterStraightInstructionMeters;
    private final double lastUnnecessaryDistanceTurnInMeters;
    private final double maxTurnAroundEdgeValueDegrees;
    private final double maximumDegreesForTurnCalculationLimit;
    private final double minTurnAroundEdgeValueDegrees;
    private final double minimumDistanceToArriveMeters;
    private final double minimumDistanceToStraightInstructionMeters;
    private final double oppositeDirectionTurnsSkipAngleDegrees;
    private final double oppositeDirectionTurnsSkipMinLengthMeters;
    private final double sameDirectionTurnsSkipMaxAngleDegrees;
    private final double sameDirectionTurnsSkipMinAngleDegrees;
    private final double sameDirectionTurnsSkipMinLengthMeters;

    @NotNull
    private final ClosedFloatingPointRange<Double> sameDirectionTurnsSkipRange;
    private final long turnAroundSwitchToNoTurnAroundStateDelayTimeMillis;
    private final long turnAroundUpdateDelayTimeMillis;

    public TurnByTurnConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, long j, long j2) {
        this.minimumDistanceToArriveMeters = d;
        this.minimumDistanceToStraightInstructionMeters = d2;
        this.distanceToTurnAfterStraightInstructionMeters = d3;
        this.distanceForTurnAroundInstructionMeters = d4;
        this.maximumDegreesForTurnCalculationLimit = d5;
        this.lastUnnecessaryDistanceTurnInMeters = d6;
        this.sameDirectionTurnsSkipMinLengthMeters = d7;
        this.sameDirectionTurnsSkipMinAngleDegrees = d8;
        this.sameDirectionTurnsSkipMaxAngleDegrees = d9;
        this.oppositeDirectionTurnsSkipMinLengthMeters = d10;
        this.oppositeDirectionTurnsSkipAngleDegrees = d11;
        this.maxTurnAroundEdgeValueDegrees = d12;
        this.minTurnAroundEdgeValueDegrees = d13;
        this.turnAroundUpdateDelayTimeMillis = j;
        this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis = j2;
        this.sameDirectionTurnsSkipRange = RangesKt.i(d8, d9);
    }

    public static /* synthetic */ TurnByTurnConfig copy$default(TurnByTurnConfig turnByTurnConfig, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, long j, long j2, int i, Object obj) {
        long j3;
        long j4;
        double d14 = (i & 1) != 0 ? turnByTurnConfig.minimumDistanceToArriveMeters : d;
        double d15 = (i & 2) != 0 ? turnByTurnConfig.minimumDistanceToStraightInstructionMeters : d2;
        double d16 = (i & 4) != 0 ? turnByTurnConfig.distanceToTurnAfterStraightInstructionMeters : d3;
        double d17 = (i & 8) != 0 ? turnByTurnConfig.distanceForTurnAroundInstructionMeters : d4;
        double d18 = (i & 16) != 0 ? turnByTurnConfig.maximumDegreesForTurnCalculationLimit : d5;
        double d19 = (i & 32) != 0 ? turnByTurnConfig.lastUnnecessaryDistanceTurnInMeters : d6;
        double d20 = (i & 64) != 0 ? turnByTurnConfig.sameDirectionTurnsSkipMinLengthMeters : d7;
        double d21 = d14;
        double d22 = (i & 128) != 0 ? turnByTurnConfig.sameDirectionTurnsSkipMinAngleDegrees : d8;
        double d23 = (i & 256) != 0 ? turnByTurnConfig.sameDirectionTurnsSkipMaxAngleDegrees : d9;
        double d24 = (i & 512) != 0 ? turnByTurnConfig.oppositeDirectionTurnsSkipMinLengthMeters : d10;
        double d25 = (i & 1024) != 0 ? turnByTurnConfig.oppositeDirectionTurnsSkipAngleDegrees : d11;
        double d26 = (i & 2048) != 0 ? turnByTurnConfig.maxTurnAroundEdgeValueDegrees : d12;
        double d27 = (i & 4096) != 0 ? turnByTurnConfig.minTurnAroundEdgeValueDegrees : d13;
        long j5 = (i & 8192) != 0 ? turnByTurnConfig.turnAroundUpdateDelayTimeMillis : j;
        if ((i & 16384) != 0) {
            j4 = j5;
            j3 = turnByTurnConfig.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis;
        } else {
            j3 = j2;
            j4 = j5;
        }
        return turnByTurnConfig.copy(d21, d15, d16, d17, d18, d19, d20, d22, d23, d24, d25, d26, d27, j4, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMinimumDistanceToArriveMeters() {
        return this.minimumDistanceToArriveMeters;
    }

    /* renamed from: component10, reason: from getter */
    public final double getOppositeDirectionTurnsSkipMinLengthMeters() {
        return this.oppositeDirectionTurnsSkipMinLengthMeters;
    }

    /* renamed from: component11, reason: from getter */
    public final double getOppositeDirectionTurnsSkipAngleDegrees() {
        return this.oppositeDirectionTurnsSkipAngleDegrees;
    }

    /* renamed from: component12, reason: from getter */
    public final double getMaxTurnAroundEdgeValueDegrees() {
        return this.maxTurnAroundEdgeValueDegrees;
    }

    /* renamed from: component13, reason: from getter */
    public final double getMinTurnAroundEdgeValueDegrees() {
        return this.minTurnAroundEdgeValueDegrees;
    }

    /* renamed from: component14, reason: from getter */
    public final long getTurnAroundUpdateDelayTimeMillis() {
        return this.turnAroundUpdateDelayTimeMillis;
    }

    /* renamed from: component15, reason: from getter */
    public final long getTurnAroundSwitchToNoTurnAroundStateDelayTimeMillis() {
        return this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMinimumDistanceToStraightInstructionMeters() {
        return this.minimumDistanceToStraightInstructionMeters;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDistanceToTurnAfterStraightInstructionMeters() {
        return this.distanceToTurnAfterStraightInstructionMeters;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDistanceForTurnAroundInstructionMeters() {
        return this.distanceForTurnAroundInstructionMeters;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMaximumDegreesForTurnCalculationLimit() {
        return this.maximumDegreesForTurnCalculationLimit;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLastUnnecessaryDistanceTurnInMeters() {
        return this.lastUnnecessaryDistanceTurnInMeters;
    }

    /* renamed from: component7, reason: from getter */
    public final double getSameDirectionTurnsSkipMinLengthMeters() {
        return this.sameDirectionTurnsSkipMinLengthMeters;
    }

    /* renamed from: component8, reason: from getter */
    public final double getSameDirectionTurnsSkipMinAngleDegrees() {
        return this.sameDirectionTurnsSkipMinAngleDegrees;
    }

    /* renamed from: component9, reason: from getter */
    public final double getSameDirectionTurnsSkipMaxAngleDegrees() {
        return this.sameDirectionTurnsSkipMaxAngleDegrees;
    }

    @NotNull
    public final TurnByTurnConfig copy(double minimumDistanceToArriveMeters, double minimumDistanceToStraightInstructionMeters, double distanceToTurnAfterStraightInstructionMeters, double distanceForTurnAroundInstructionMeters, double maximumDegreesForTurnCalculationLimit, double lastUnnecessaryDistanceTurnInMeters, double sameDirectionTurnsSkipMinLengthMeters, double sameDirectionTurnsSkipMinAngleDegrees, double sameDirectionTurnsSkipMaxAngleDegrees, double oppositeDirectionTurnsSkipMinLengthMeters, double oppositeDirectionTurnsSkipAngleDegrees, double maxTurnAroundEdgeValueDegrees, double minTurnAroundEdgeValueDegrees, long turnAroundUpdateDelayTimeMillis, long turnAroundSwitchToNoTurnAroundStateDelayTimeMillis) {
        return new TurnByTurnConfig(minimumDistanceToArriveMeters, minimumDistanceToStraightInstructionMeters, distanceToTurnAfterStraightInstructionMeters, distanceForTurnAroundInstructionMeters, maximumDegreesForTurnCalculationLimit, lastUnnecessaryDistanceTurnInMeters, sameDirectionTurnsSkipMinLengthMeters, sameDirectionTurnsSkipMinAngleDegrees, sameDirectionTurnsSkipMaxAngleDegrees, oppositeDirectionTurnsSkipMinLengthMeters, oppositeDirectionTurnsSkipAngleDegrees, maxTurnAroundEdgeValueDegrees, minTurnAroundEdgeValueDegrees, turnAroundUpdateDelayTimeMillis, turnAroundSwitchToNoTurnAroundStateDelayTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnByTurnConfig)) {
            return false;
        }
        TurnByTurnConfig turnByTurnConfig = (TurnByTurnConfig) other;
        return Double.compare(this.minimumDistanceToArriveMeters, turnByTurnConfig.minimumDistanceToArriveMeters) == 0 && Double.compare(this.minimumDistanceToStraightInstructionMeters, turnByTurnConfig.minimumDistanceToStraightInstructionMeters) == 0 && Double.compare(this.distanceToTurnAfterStraightInstructionMeters, turnByTurnConfig.distanceToTurnAfterStraightInstructionMeters) == 0 && Double.compare(this.distanceForTurnAroundInstructionMeters, turnByTurnConfig.distanceForTurnAroundInstructionMeters) == 0 && Double.compare(this.maximumDegreesForTurnCalculationLimit, turnByTurnConfig.maximumDegreesForTurnCalculationLimit) == 0 && Double.compare(this.lastUnnecessaryDistanceTurnInMeters, turnByTurnConfig.lastUnnecessaryDistanceTurnInMeters) == 0 && Double.compare(this.sameDirectionTurnsSkipMinLengthMeters, turnByTurnConfig.sameDirectionTurnsSkipMinLengthMeters) == 0 && Double.compare(this.sameDirectionTurnsSkipMinAngleDegrees, turnByTurnConfig.sameDirectionTurnsSkipMinAngleDegrees) == 0 && Double.compare(this.sameDirectionTurnsSkipMaxAngleDegrees, turnByTurnConfig.sameDirectionTurnsSkipMaxAngleDegrees) == 0 && Double.compare(this.oppositeDirectionTurnsSkipMinLengthMeters, turnByTurnConfig.oppositeDirectionTurnsSkipMinLengthMeters) == 0 && Double.compare(this.oppositeDirectionTurnsSkipAngleDegrees, turnByTurnConfig.oppositeDirectionTurnsSkipAngleDegrees) == 0 && Double.compare(this.maxTurnAroundEdgeValueDegrees, turnByTurnConfig.maxTurnAroundEdgeValueDegrees) == 0 && Double.compare(this.minTurnAroundEdgeValueDegrees, turnByTurnConfig.minTurnAroundEdgeValueDegrees) == 0 && this.turnAroundUpdateDelayTimeMillis == turnByTurnConfig.turnAroundUpdateDelayTimeMillis && this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis == turnByTurnConfig.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis;
    }

    public final double getDistanceForTurnAroundInstructionMeters() {
        return this.distanceForTurnAroundInstructionMeters;
    }

    public final double getDistanceToTurnAfterStraightInstructionMeters() {
        return this.distanceToTurnAfterStraightInstructionMeters;
    }

    public final double getLastUnnecessaryDistanceTurnInMeters() {
        return this.lastUnnecessaryDistanceTurnInMeters;
    }

    public final double getMaxTurnAroundEdgeValueDegrees() {
        return this.maxTurnAroundEdgeValueDegrees;
    }

    public final double getMaximumDegreesForTurnCalculationLimit() {
        return this.maximumDegreesForTurnCalculationLimit;
    }

    public final double getMinTurnAroundEdgeValueDegrees() {
        return this.minTurnAroundEdgeValueDegrees;
    }

    public final double getMinimumDistanceToArriveMeters() {
        return this.minimumDistanceToArriveMeters;
    }

    public final double getMinimumDistanceToStraightInstructionMeters() {
        return this.minimumDistanceToStraightInstructionMeters;
    }

    public final double getOppositeDirectionTurnsSkipAngleDegrees() {
        return this.oppositeDirectionTurnsSkipAngleDegrees;
    }

    public final double getOppositeDirectionTurnsSkipMinLengthMeters() {
        return this.oppositeDirectionTurnsSkipMinLengthMeters;
    }

    public final double getSameDirectionTurnsSkipMaxAngleDegrees() {
        return this.sameDirectionTurnsSkipMaxAngleDegrees;
    }

    public final double getSameDirectionTurnsSkipMinAngleDegrees() {
        return this.sameDirectionTurnsSkipMinAngleDegrees;
    }

    public final double getSameDirectionTurnsSkipMinLengthMeters() {
        return this.sameDirectionTurnsSkipMinLengthMeters;
    }

    @NotNull
    public final ClosedFloatingPointRange<Double> getSameDirectionTurnsSkipRange() {
        return this.sameDirectionTurnsSkipRange;
    }

    public final long getTurnAroundSwitchToNoTurnAroundStateDelayTimeMillis() {
        return this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis;
    }

    public final long getTurnAroundUpdateDelayTimeMillis() {
        return this.turnAroundUpdateDelayTimeMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis) + K.a(this.turnAroundUpdateDelayTimeMillis, J.a(this.minTurnAroundEdgeValueDegrees, J.a(this.maxTurnAroundEdgeValueDegrees, J.a(this.oppositeDirectionTurnsSkipAngleDegrees, J.a(this.oppositeDirectionTurnsSkipMinLengthMeters, J.a(this.sameDirectionTurnsSkipMaxAngleDegrees, J.a(this.sameDirectionTurnsSkipMinAngleDegrees, J.a(this.sameDirectionTurnsSkipMinLengthMeters, J.a(this.lastUnnecessaryDistanceTurnInMeters, J.a(this.maximumDegreesForTurnCalculationLimit, J.a(this.distanceForTurnAroundInstructionMeters, J.a(this.distanceToTurnAfterStraightInstructionMeters, J.a(this.minimumDistanceToStraightInstructionMeters, Double.hashCode(this.minimumDistanceToArriveMeters) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TurnByTurnConfig(minimumDistanceToArriveMeters=");
        sb.append(this.minimumDistanceToArriveMeters);
        sb.append(", minimumDistanceToStraightInstructionMeters=");
        sb.append(this.minimumDistanceToStraightInstructionMeters);
        sb.append(", distanceToTurnAfterStraightInstructionMeters=");
        sb.append(this.distanceToTurnAfterStraightInstructionMeters);
        sb.append(", distanceForTurnAroundInstructionMeters=");
        sb.append(this.distanceForTurnAroundInstructionMeters);
        sb.append(", maximumDegreesForTurnCalculationLimit=");
        sb.append(this.maximumDegreesForTurnCalculationLimit);
        sb.append(", lastUnnecessaryDistanceTurnInMeters=");
        sb.append(this.lastUnnecessaryDistanceTurnInMeters);
        sb.append(", sameDirectionTurnsSkipMinLengthMeters=");
        sb.append(this.sameDirectionTurnsSkipMinLengthMeters);
        sb.append(", sameDirectionTurnsSkipMinAngleDegrees=");
        sb.append(this.sameDirectionTurnsSkipMinAngleDegrees);
        sb.append(", sameDirectionTurnsSkipMaxAngleDegrees=");
        sb.append(this.sameDirectionTurnsSkipMaxAngleDegrees);
        sb.append(", oppositeDirectionTurnsSkipMinLengthMeters=");
        sb.append(this.oppositeDirectionTurnsSkipMinLengthMeters);
        sb.append(", oppositeDirectionTurnsSkipAngleDegrees=");
        sb.append(this.oppositeDirectionTurnsSkipAngleDegrees);
        sb.append(", maxTurnAroundEdgeValueDegrees=");
        sb.append(this.maxTurnAroundEdgeValueDegrees);
        sb.append(", minTurnAroundEdgeValueDegrees=");
        sb.append(this.minTurnAroundEdgeValueDegrees);
        sb.append(", turnAroundUpdateDelayTimeMillis=");
        sb.append(this.turnAroundUpdateDelayTimeMillis);
        sb.append(", turnAroundSwitchToNoTurnAroundStateDelayTimeMillis=");
        return b.q(sb, this.turnAroundSwitchToNoTurnAroundStateDelayTimeMillis, ')');
    }
}
