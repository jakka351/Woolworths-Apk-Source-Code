package me.oriient.internal.services.dataModel.navigation.turnByTurn;

import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002JKB¯\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016B¹\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019JÂ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001J\u0006\u0010@\u001a\u00020AJ&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b'\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b(\u0010\u0019¨\u0006L"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse;", "", "seen1", "", "minimumDistanceToArriveMeters", "", "minimumDistanceToStraightInstructionMeters", "distanceToTurnAfterStraightInstructionMeters", "distanceForTurnAroundInstructionMeters", "maximumDegreesForTurnCalculationLimit", "lastUnnecessaryDistanceTurnInMeters", "sameDirectionTurnsSkipMinLengthMeters", "sameDirectionTurnsSkipMinAngleDegrees", "sameDirectionTurnsSkipMaxAngleDegrees", "oppositeDirectionTurnsSkipMinLengthMeters", "oppositeDirectionTurnsSkipAngleDegrees", "maxTurnAroundEdgeValueDegrees", "minTurnAroundEdgeValueDegrees", "turnAroundUpdateDelayTime", "turnAroundSwitchToNoTurnAroundStateDelayTime", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getDistanceForTurnAroundInstructionMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDistanceToTurnAfterStraightInstructionMeters", "getLastUnnecessaryDistanceTurnInMeters", "getMaxTurnAroundEdgeValueDegrees", "getMaximumDegreesForTurnCalculationLimit", "getMinTurnAroundEdgeValueDegrees", "getMinimumDistanceToArriveMeters", "getMinimumDistanceToStraightInstructionMeters", "getOppositeDirectionTurnsSkipAngleDegrees", "getOppositeDirectionTurnsSkipMinLengthMeters", "getSameDirectionTurnsSkipMaxAngleDegrees", "getSameDirectionTurnsSkipMinAngleDegrees", "getSameDirectionTurnsSkipMinLengthMeters", "getTurnAroundSwitchToNoTurnAroundStateDelayTime", "getTurnAroundUpdateDelayTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse;", "equals", "", "other", "hashCode", "toString", "", "toTurnByTurnConfig", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class TurnByTurnConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Double distanceForTurnAroundInstructionMeters;

    @Nullable
    private final Double distanceToTurnAfterStraightInstructionMeters;

    @Nullable
    private final Double lastUnnecessaryDistanceTurnInMeters;

    @Nullable
    private final Double maxTurnAroundEdgeValueDegrees;

    @Nullable
    private final Double maximumDegreesForTurnCalculationLimit;

    @Nullable
    private final Double minTurnAroundEdgeValueDegrees;

    @Nullable
    private final Double minimumDistanceToArriveMeters;

    @Nullable
    private final Double minimumDistanceToStraightInstructionMeters;

    @Nullable
    private final Double oppositeDirectionTurnsSkipAngleDegrees;

    @Nullable
    private final Double oppositeDirectionTurnsSkipMinLengthMeters;

    @Nullable
    private final Double sameDirectionTurnsSkipMaxAngleDegrees;

    @Nullable
    private final Double sameDirectionTurnsSkipMinAngleDegrees;

    @Nullable
    private final Double sameDirectionTurnsSkipMinLengthMeters;

    @Nullable
    private final Double turnAroundSwitchToNoTurnAroundStateDelayTime;

    @Nullable
    private final Double turnAroundUpdateDelayTime;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<TurnByTurnConfigResponse> serializer() {
            return TurnByTurnConfigResponse$$serializer.INSTANCE;
        }
    }

    public TurnByTurnConfigResponse() {
        this((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 32767, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(TurnByTurnConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || self.minimumDistanceToArriveMeters != null) {
            output.w(serialDesc, 0, DoubleSerializer.f24792a, self.minimumDistanceToArriveMeters);
        }
        if (output.q(serialDesc, 1) || self.minimumDistanceToStraightInstructionMeters != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.minimumDistanceToStraightInstructionMeters);
        }
        if (output.q(serialDesc, 2) || self.distanceToTurnAfterStraightInstructionMeters != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.distanceToTurnAfterStraightInstructionMeters);
        }
        if (output.q(serialDesc, 3) || self.distanceForTurnAroundInstructionMeters != null) {
            output.w(serialDesc, 3, DoubleSerializer.f24792a, self.distanceForTurnAroundInstructionMeters);
        }
        if (output.q(serialDesc, 4) || self.maximumDegreesForTurnCalculationLimit != null) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.maximumDegreesForTurnCalculationLimit);
        }
        if (output.q(serialDesc, 5) || self.lastUnnecessaryDistanceTurnInMeters != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.lastUnnecessaryDistanceTurnInMeters);
        }
        if (output.q(serialDesc, 6) || self.sameDirectionTurnsSkipMinLengthMeters != null) {
            output.w(serialDesc, 6, DoubleSerializer.f24792a, self.sameDirectionTurnsSkipMinLengthMeters);
        }
        if (output.q(serialDesc, 7) || self.sameDirectionTurnsSkipMinAngleDegrees != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.sameDirectionTurnsSkipMinAngleDegrees);
        }
        if (output.q(serialDesc, 8) || self.sameDirectionTurnsSkipMaxAngleDegrees != null) {
            output.w(serialDesc, 8, DoubleSerializer.f24792a, self.sameDirectionTurnsSkipMaxAngleDegrees);
        }
        if (output.q(serialDesc, 9) || self.oppositeDirectionTurnsSkipMinLengthMeters != null) {
            output.w(serialDesc, 9, DoubleSerializer.f24792a, self.oppositeDirectionTurnsSkipMinLengthMeters);
        }
        if (output.q(serialDesc, 10) || self.oppositeDirectionTurnsSkipAngleDegrees != null) {
            output.w(serialDesc, 10, DoubleSerializer.f24792a, self.oppositeDirectionTurnsSkipAngleDegrees);
        }
        if (output.q(serialDesc, 11) || self.maxTurnAroundEdgeValueDegrees != null) {
            output.w(serialDesc, 11, DoubleSerializer.f24792a, self.maxTurnAroundEdgeValueDegrees);
        }
        if (output.q(serialDesc, 12) || self.minTurnAroundEdgeValueDegrees != null) {
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.minTurnAroundEdgeValueDegrees);
        }
        if (output.q(serialDesc, 13) || self.turnAroundUpdateDelayTime != null) {
            output.w(serialDesc, 13, DoubleSerializer.f24792a, self.turnAroundUpdateDelayTime);
        }
        if (!output.q(serialDesc, 14) && self.turnAroundSwitchToNoTurnAroundStateDelayTime == null) {
            return;
        }
        output.w(serialDesc, 14, DoubleSerializer.f24792a, self.turnAroundSwitchToNoTurnAroundStateDelayTime);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getMinimumDistanceToArriveMeters() {
        return this.minimumDistanceToArriveMeters;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getOppositeDirectionTurnsSkipMinLengthMeters() {
        return this.oppositeDirectionTurnsSkipMinLengthMeters;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getOppositeDirectionTurnsSkipAngleDegrees() {
        return this.oppositeDirectionTurnsSkipAngleDegrees;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getMaxTurnAroundEdgeValueDegrees() {
        return this.maxTurnAroundEdgeValueDegrees;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getMinTurnAroundEdgeValueDegrees() {
        return this.minTurnAroundEdgeValueDegrees;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getTurnAroundUpdateDelayTime() {
        return this.turnAroundUpdateDelayTime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getTurnAroundSwitchToNoTurnAroundStateDelayTime() {
        return this.turnAroundSwitchToNoTurnAroundStateDelayTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getMinimumDistanceToStraightInstructionMeters() {
        return this.minimumDistanceToStraightInstructionMeters;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getDistanceToTurnAfterStraightInstructionMeters() {
        return this.distanceToTurnAfterStraightInstructionMeters;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getDistanceForTurnAroundInstructionMeters() {
        return this.distanceForTurnAroundInstructionMeters;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getMaximumDegreesForTurnCalculationLimit() {
        return this.maximumDegreesForTurnCalculationLimit;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getLastUnnecessaryDistanceTurnInMeters() {
        return this.lastUnnecessaryDistanceTurnInMeters;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getSameDirectionTurnsSkipMinLengthMeters() {
        return this.sameDirectionTurnsSkipMinLengthMeters;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getSameDirectionTurnsSkipMinAngleDegrees() {
        return this.sameDirectionTurnsSkipMinAngleDegrees;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getSameDirectionTurnsSkipMaxAngleDegrees() {
        return this.sameDirectionTurnsSkipMaxAngleDegrees;
    }

    @NotNull
    public final TurnByTurnConfigResponse copy(@Nullable Double minimumDistanceToArriveMeters, @Nullable Double minimumDistanceToStraightInstructionMeters, @Nullable Double distanceToTurnAfterStraightInstructionMeters, @Nullable Double distanceForTurnAroundInstructionMeters, @Nullable Double maximumDegreesForTurnCalculationLimit, @Nullable Double lastUnnecessaryDistanceTurnInMeters, @Nullable Double sameDirectionTurnsSkipMinLengthMeters, @Nullable Double sameDirectionTurnsSkipMinAngleDegrees, @Nullable Double sameDirectionTurnsSkipMaxAngleDegrees, @Nullable Double oppositeDirectionTurnsSkipMinLengthMeters, @Nullable Double oppositeDirectionTurnsSkipAngleDegrees, @Nullable Double maxTurnAroundEdgeValueDegrees, @Nullable Double minTurnAroundEdgeValueDegrees, @Nullable Double turnAroundUpdateDelayTime, @Nullable Double turnAroundSwitchToNoTurnAroundStateDelayTime) {
        return new TurnByTurnConfigResponse(minimumDistanceToArriveMeters, minimumDistanceToStraightInstructionMeters, distanceToTurnAfterStraightInstructionMeters, distanceForTurnAroundInstructionMeters, maximumDegreesForTurnCalculationLimit, lastUnnecessaryDistanceTurnInMeters, sameDirectionTurnsSkipMinLengthMeters, sameDirectionTurnsSkipMinAngleDegrees, sameDirectionTurnsSkipMaxAngleDegrees, oppositeDirectionTurnsSkipMinLengthMeters, oppositeDirectionTurnsSkipAngleDegrees, maxTurnAroundEdgeValueDegrees, minTurnAroundEdgeValueDegrees, turnAroundUpdateDelayTime, turnAroundSwitchToNoTurnAroundStateDelayTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnByTurnConfigResponse)) {
            return false;
        }
        TurnByTurnConfigResponse turnByTurnConfigResponse = (TurnByTurnConfigResponse) other;
        return Intrinsics.c(this.minimumDistanceToArriveMeters, turnByTurnConfigResponse.minimumDistanceToArriveMeters) && Intrinsics.c(this.minimumDistanceToStraightInstructionMeters, turnByTurnConfigResponse.minimumDistanceToStraightInstructionMeters) && Intrinsics.c(this.distanceToTurnAfterStraightInstructionMeters, turnByTurnConfigResponse.distanceToTurnAfterStraightInstructionMeters) && Intrinsics.c(this.distanceForTurnAroundInstructionMeters, turnByTurnConfigResponse.distanceForTurnAroundInstructionMeters) && Intrinsics.c(this.maximumDegreesForTurnCalculationLimit, turnByTurnConfigResponse.maximumDegreesForTurnCalculationLimit) && Intrinsics.c(this.lastUnnecessaryDistanceTurnInMeters, turnByTurnConfigResponse.lastUnnecessaryDistanceTurnInMeters) && Intrinsics.c(this.sameDirectionTurnsSkipMinLengthMeters, turnByTurnConfigResponse.sameDirectionTurnsSkipMinLengthMeters) && Intrinsics.c(this.sameDirectionTurnsSkipMinAngleDegrees, turnByTurnConfigResponse.sameDirectionTurnsSkipMinAngleDegrees) && Intrinsics.c(this.sameDirectionTurnsSkipMaxAngleDegrees, turnByTurnConfigResponse.sameDirectionTurnsSkipMaxAngleDegrees) && Intrinsics.c(this.oppositeDirectionTurnsSkipMinLengthMeters, turnByTurnConfigResponse.oppositeDirectionTurnsSkipMinLengthMeters) && Intrinsics.c(this.oppositeDirectionTurnsSkipAngleDegrees, turnByTurnConfigResponse.oppositeDirectionTurnsSkipAngleDegrees) && Intrinsics.c(this.maxTurnAroundEdgeValueDegrees, turnByTurnConfigResponse.maxTurnAroundEdgeValueDegrees) && Intrinsics.c(this.minTurnAroundEdgeValueDegrees, turnByTurnConfigResponse.minTurnAroundEdgeValueDegrees) && Intrinsics.c(this.turnAroundUpdateDelayTime, turnByTurnConfigResponse.turnAroundUpdateDelayTime) && Intrinsics.c(this.turnAroundSwitchToNoTurnAroundStateDelayTime, turnByTurnConfigResponse.turnAroundSwitchToNoTurnAroundStateDelayTime);
    }

    @Nullable
    public final Double getDistanceForTurnAroundInstructionMeters() {
        return this.distanceForTurnAroundInstructionMeters;
    }

    @Nullable
    public final Double getDistanceToTurnAfterStraightInstructionMeters() {
        return this.distanceToTurnAfterStraightInstructionMeters;
    }

    @Nullable
    public final Double getLastUnnecessaryDistanceTurnInMeters() {
        return this.lastUnnecessaryDistanceTurnInMeters;
    }

    @Nullable
    public final Double getMaxTurnAroundEdgeValueDegrees() {
        return this.maxTurnAroundEdgeValueDegrees;
    }

    @Nullable
    public final Double getMaximumDegreesForTurnCalculationLimit() {
        return this.maximumDegreesForTurnCalculationLimit;
    }

    @Nullable
    public final Double getMinTurnAroundEdgeValueDegrees() {
        return this.minTurnAroundEdgeValueDegrees;
    }

    @Nullable
    public final Double getMinimumDistanceToArriveMeters() {
        return this.minimumDistanceToArriveMeters;
    }

    @Nullable
    public final Double getMinimumDistanceToStraightInstructionMeters() {
        return this.minimumDistanceToStraightInstructionMeters;
    }

    @Nullable
    public final Double getOppositeDirectionTurnsSkipAngleDegrees() {
        return this.oppositeDirectionTurnsSkipAngleDegrees;
    }

    @Nullable
    public final Double getOppositeDirectionTurnsSkipMinLengthMeters() {
        return this.oppositeDirectionTurnsSkipMinLengthMeters;
    }

    @Nullable
    public final Double getSameDirectionTurnsSkipMaxAngleDegrees() {
        return this.sameDirectionTurnsSkipMaxAngleDegrees;
    }

    @Nullable
    public final Double getSameDirectionTurnsSkipMinAngleDegrees() {
        return this.sameDirectionTurnsSkipMinAngleDegrees;
    }

    @Nullable
    public final Double getSameDirectionTurnsSkipMinLengthMeters() {
        return this.sameDirectionTurnsSkipMinLengthMeters;
    }

    @Nullable
    public final Double getTurnAroundSwitchToNoTurnAroundStateDelayTime() {
        return this.turnAroundSwitchToNoTurnAroundStateDelayTime;
    }

    @Nullable
    public final Double getTurnAroundUpdateDelayTime() {
        return this.turnAroundUpdateDelayTime;
    }

    public int hashCode() {
        Double d = this.minimumDistanceToArriveMeters;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.minimumDistanceToStraightInstructionMeters;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.distanceToTurnAfterStraightInstructionMeters;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.distanceForTurnAroundInstructionMeters;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.maximumDegreesForTurnCalculationLimit;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.lastUnnecessaryDistanceTurnInMeters;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.sameDirectionTurnsSkipMinLengthMeters;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.sameDirectionTurnsSkipMinAngleDegrees;
        int iHashCode8 = (iHashCode7 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.sameDirectionTurnsSkipMaxAngleDegrees;
        int iHashCode9 = (iHashCode8 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.oppositeDirectionTurnsSkipMinLengthMeters;
        int iHashCode10 = (iHashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.oppositeDirectionTurnsSkipAngleDegrees;
        int iHashCode11 = (iHashCode10 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.maxTurnAroundEdgeValueDegrees;
        int iHashCode12 = (iHashCode11 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.minTurnAroundEdgeValueDegrees;
        int iHashCode13 = (iHashCode12 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.turnAroundUpdateDelayTime;
        int iHashCode14 = (iHashCode13 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.turnAroundSwitchToNoTurnAroundStateDelayTime;
        return iHashCode14 + (d15 != null ? d15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TurnByTurnConfigResponse(minimumDistanceToArriveMeters=" + this.minimumDistanceToArriveMeters + ", minimumDistanceToStraightInstructionMeters=" + this.minimumDistanceToStraightInstructionMeters + ", distanceToTurnAfterStraightInstructionMeters=" + this.distanceToTurnAfterStraightInstructionMeters + ", distanceForTurnAroundInstructionMeters=" + this.distanceForTurnAroundInstructionMeters + ", maximumDegreesForTurnCalculationLimit=" + this.maximumDegreesForTurnCalculationLimit + ", lastUnnecessaryDistanceTurnInMeters=" + this.lastUnnecessaryDistanceTurnInMeters + ", sameDirectionTurnsSkipMinLengthMeters=" + this.sameDirectionTurnsSkipMinLengthMeters + ", sameDirectionTurnsSkipMinAngleDegrees=" + this.sameDirectionTurnsSkipMinAngleDegrees + ", sameDirectionTurnsSkipMaxAngleDegrees=" + this.sameDirectionTurnsSkipMaxAngleDegrees + ", oppositeDirectionTurnsSkipMinLengthMeters=" + this.oppositeDirectionTurnsSkipMinLengthMeters + ", oppositeDirectionTurnsSkipAngleDegrees=" + this.oppositeDirectionTurnsSkipAngleDegrees + ", maxTurnAroundEdgeValueDegrees=" + this.maxTurnAroundEdgeValueDegrees + ", minTurnAroundEdgeValueDegrees=" + this.minTurnAroundEdgeValueDegrees + ", turnAroundUpdateDelayTime=" + this.turnAroundUpdateDelayTime + ", turnAroundSwitchToNoTurnAroundStateDelayTime=" + this.turnAroundSwitchToNoTurnAroundStateDelayTime + ')';
    }

    @NotNull
    public final TurnByTurnConfig toTurnByTurnConfig() {
        Double d = this.minimumDistanceToArriveMeters;
        double dDoubleValue = d != null ? d.doubleValue() : 5.0d;
        Double d2 = this.minimumDistanceToStraightInstructionMeters;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 100.0d;
        Double d3 = this.distanceToTurnAfterStraightInstructionMeters;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 15.0d;
        Double d4 = this.distanceForTurnAroundInstructionMeters;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 1.0d;
        Double d5 = this.maximumDegreesForTurnCalculationLimit;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 145.0d;
        Double d6 = this.lastUnnecessaryDistanceTurnInMeters;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 2.5d;
        Double d7 = this.sameDirectionTurnsSkipMinLengthMeters;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 1.0d;
        Double d8 = this.sameDirectionTurnsSkipMinAngleDegrees;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 40.0d;
        Double d9 = this.sameDirectionTurnsSkipMaxAngleDegrees;
        double dDoubleValue9 = d9 != null ? d9.doubleValue() : 50.0d;
        Double d10 = this.oppositeDirectionTurnsSkipMinLengthMeters;
        double dDoubleValue10 = d10 != null ? d10.doubleValue() : 1.25d;
        Double d11 = this.oppositeDirectionTurnsSkipAngleDegrees;
        double dDoubleValue11 = d11 != null ? d11.doubleValue() : 5.0d;
        Double d12 = this.maxTurnAroundEdgeValueDegrees;
        double dDoubleValue12 = d12 != null ? d12.doubleValue() : 120.0d;
        Double d13 = this.minTurnAroundEdgeValueDegrees;
        double dDoubleValue13 = d13 != null ? d13.doubleValue() : 45.0d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        double d14 = dDoubleValue11;
        double d15 = dDoubleValue;
        double millis = timeUnit.toMillis(1L);
        Double d16 = this.turnAroundUpdateDelayTime;
        long jDoubleValue = (long) (millis * (d16 != null ? d16.doubleValue() : 1.5d));
        double millis2 = timeUnit.toMillis(1L);
        Double d17 = this.turnAroundSwitchToNoTurnAroundStateDelayTime;
        return new TurnByTurnConfig(d15, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue9, dDoubleValue10, d14, dDoubleValue12, dDoubleValue13, jDoubleValue, (long) (millis2 * (d17 != null ? d17.doubleValue() : 0.3d)));
    }

    @Deprecated
    public /* synthetic */ TurnByTurnConfigResponse(int i, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minimumDistanceToArriveMeters = null;
        } else {
            this.minimumDistanceToArriveMeters = d;
        }
        if ((i & 2) == 0) {
            this.minimumDistanceToStraightInstructionMeters = null;
        } else {
            this.minimumDistanceToStraightInstructionMeters = d2;
        }
        if ((i & 4) == 0) {
            this.distanceToTurnAfterStraightInstructionMeters = null;
        } else {
            this.distanceToTurnAfterStraightInstructionMeters = d3;
        }
        if ((i & 8) == 0) {
            this.distanceForTurnAroundInstructionMeters = null;
        } else {
            this.distanceForTurnAroundInstructionMeters = d4;
        }
        if ((i & 16) == 0) {
            this.maximumDegreesForTurnCalculationLimit = null;
        } else {
            this.maximumDegreesForTurnCalculationLimit = d5;
        }
        if ((i & 32) == 0) {
            this.lastUnnecessaryDistanceTurnInMeters = null;
        } else {
            this.lastUnnecessaryDistanceTurnInMeters = d6;
        }
        if ((i & 64) == 0) {
            this.sameDirectionTurnsSkipMinLengthMeters = null;
        } else {
            this.sameDirectionTurnsSkipMinLengthMeters = d7;
        }
        if ((i & 128) == 0) {
            this.sameDirectionTurnsSkipMinAngleDegrees = null;
        } else {
            this.sameDirectionTurnsSkipMinAngleDegrees = d8;
        }
        if ((i & 256) == 0) {
            this.sameDirectionTurnsSkipMaxAngleDegrees = null;
        } else {
            this.sameDirectionTurnsSkipMaxAngleDegrees = d9;
        }
        if ((i & 512) == 0) {
            this.oppositeDirectionTurnsSkipMinLengthMeters = null;
        } else {
            this.oppositeDirectionTurnsSkipMinLengthMeters = d10;
        }
        if ((i & 1024) == 0) {
            this.oppositeDirectionTurnsSkipAngleDegrees = null;
        } else {
            this.oppositeDirectionTurnsSkipAngleDegrees = d11;
        }
        if ((i & 2048) == 0) {
            this.maxTurnAroundEdgeValueDegrees = null;
        } else {
            this.maxTurnAroundEdgeValueDegrees = d12;
        }
        if ((i & 4096) == 0) {
            this.minTurnAroundEdgeValueDegrees = null;
        } else {
            this.minTurnAroundEdgeValueDegrees = d13;
        }
        if ((i & 8192) == 0) {
            this.turnAroundUpdateDelayTime = null;
        } else {
            this.turnAroundUpdateDelayTime = d14;
        }
        if ((i & 16384) == 0) {
            this.turnAroundSwitchToNoTurnAroundStateDelayTime = null;
        } else {
            this.turnAroundSwitchToNoTurnAroundStateDelayTime = d15;
        }
    }

    public TurnByTurnConfigResponse(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Double d14, @Nullable Double d15) {
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
        this.turnAroundUpdateDelayTime = d14;
        this.turnAroundSwitchToNoTurnAroundStateDelayTime = d15;
    }

    public /* synthetic */ TurnByTurnConfigResponse(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5, (i & 32) != 0 ? null : d6, (i & 64) != 0 ? null : d7, (i & 128) != 0 ? null : d8, (i & 256) != 0 ? null : d9, (i & 512) != 0 ? null : d10, (i & 1024) != 0 ? null : d11, (i & 2048) != 0 ? null : d12, (i & 4096) != 0 ? null : d13, (i & 8192) != 0 ? null : d14, (i & 16384) != 0 ? null : d15);
    }
}
