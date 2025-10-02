package me.oriient.positioningengine.ondevice.debugging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "", "()V", "AcquireLockAt", "ChangeFloor", "CompleteCalibration", "DwellAround", "LoseCalibration", "MoveTo", "StandStill", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$AcquireLockAt;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$ChangeFloor;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$CompleteCalibration;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$DwellAround;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$LoseCalibration;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$MoveTo;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$StandStill;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PositioningDebuggingWalkSegment {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$AcquireLockAt;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "x", "", "y", "accuracy", "durationMillis", "", "(DDDJ)V", "getAccuracy", "()D", "getDurationMillis", "()J", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AcquireLockAt extends PositioningDebuggingWalkSegment {
        private final double accuracy;
        private final long durationMillis;
        private final double x;
        private final double y;

        public AcquireLockAt(double d, double d2, double d3, long j) {
            super(null);
            this.x = d;
            this.y = d2;
            this.accuracy = d3;
            this.durationMillis = j;
        }

        public static /* synthetic */ AcquireLockAt copy$default(AcquireLockAt acquireLockAt, double d, double d2, double d3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                d = acquireLockAt.x;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = acquireLockAt.y;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = acquireLockAt.accuracy;
            }
            return acquireLockAt.copy(d4, d5, d3, (i & 8) != 0 ? acquireLockAt.durationMillis : j);
        }

        /* renamed from: component1, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* renamed from: component4, reason: from getter */
        public final long getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final AcquireLockAt copy(double x, double y, double accuracy, long durationMillis) {
            return new AcquireLockAt(x, y, accuracy, durationMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AcquireLockAt)) {
                return false;
            }
            AcquireLockAt acquireLockAt = (AcquireLockAt) other;
            return Double.compare(this.x, acquireLockAt.x) == 0 && Double.compare(this.y, acquireLockAt.y) == 0 && Double.compare(this.accuracy, acquireLockAt.accuracy) == 0 && this.durationMillis == acquireLockAt.durationMillis;
        }

        public final double getAccuracy() {
            return this.accuracy;
        }

        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMillis) + v.a(this.accuracy, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AcquireLockAt(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", accuracy=");
            sb.append(this.accuracy);
            sb.append(", durationMillis=");
            return androidx.camera.core.impl.b.q(sb, this.durationMillis, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$ChangeFloor;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "floorOrder", "", "(I)V", "getFloorOrder", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFloor extends PositioningDebuggingWalkSegment {
        private final int floorOrder;

        public ChangeFloor(int i) {
            super(null);
            this.floorOrder = i;
        }

        public static /* synthetic */ ChangeFloor copy$default(ChangeFloor changeFloor, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = changeFloor.floorOrder;
            }
            return changeFloor.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getFloorOrder() {
            return this.floorOrder;
        }

        @NotNull
        public final ChangeFloor copy(int floorOrder) {
            return new ChangeFloor(floorOrder);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeFloor) && this.floorOrder == ((ChangeFloor) other).floorOrder;
        }

        public final int getFloorOrder() {
            return this.floorOrder;
        }

        public int hashCode() {
            return Integer.hashCode(this.floorOrder);
        }

        @NotNull
        public String toString() {
            return YU.a.l(new StringBuilder("ChangeFloor(floorOrder="), this.floorOrder, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$CompleteCalibration;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "durationMillis", "", "(J)V", "getDurationMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CompleteCalibration extends PositioningDebuggingWalkSegment {
        private final long durationMillis;

        public CompleteCalibration(long j) {
            super(null);
            this.durationMillis = j;
        }

        public static /* synthetic */ CompleteCalibration copy$default(CompleteCalibration completeCalibration, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = completeCalibration.durationMillis;
            }
            return completeCalibration.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final CompleteCalibration copy(long durationMillis) {
            return new CompleteCalibration(durationMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CompleteCalibration) && this.durationMillis == ((CompleteCalibration) other).durationMillis;
        }

        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMillis);
        }

        @NotNull
        public String toString() {
            return androidx.camera.core.impl.b.q(new StringBuilder("CompleteCalibration(durationMillis="), this.durationMillis, ')');
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$DwellAround;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "x", "", "y", "deviation", "accuracy", "durationMillis", "", "(DDDDJ)V", "getAccuracy", "()D", "getDeviation", "getDurationMillis", "()J", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DwellAround extends PositioningDebuggingWalkSegment {
        private final double accuracy;
        private final double deviation;
        private final long durationMillis;
        private final double x;
        private final double y;

        public DwellAround(double d, double d2, double d3, double d4, long j) {
            super(null);
            this.x = d;
            this.y = d2;
            this.deviation = d3;
            this.accuracy = d4;
            this.durationMillis = j;
        }

        public static /* synthetic */ DwellAround copy$default(DwellAround dwellAround, double d, double d2, double d3, double d4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                d = dwellAround.x;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = dwellAround.y;
            }
            return dwellAround.copy(d5, d2, (i & 4) != 0 ? dwellAround.deviation : d3, (i & 8) != 0 ? dwellAround.accuracy : d4, (i & 16) != 0 ? dwellAround.durationMillis : j);
        }

        /* renamed from: component1, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDeviation() {
            return this.deviation;
        }

        /* renamed from: component4, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* renamed from: component5, reason: from getter */
        public final long getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final DwellAround copy(double x, double y, double deviation, double accuracy, long durationMillis) {
            return new DwellAround(x, y, deviation, accuracy, durationMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DwellAround)) {
                return false;
            }
            DwellAround dwellAround = (DwellAround) other;
            return Double.compare(this.x, dwellAround.x) == 0 && Double.compare(this.y, dwellAround.y) == 0 && Double.compare(this.deviation, dwellAround.deviation) == 0 && Double.compare(this.accuracy, dwellAround.accuracy) == 0 && this.durationMillis == dwellAround.durationMillis;
        }

        public final double getAccuracy() {
            return this.accuracy;
        }

        public final double getDeviation() {
            return this.deviation;
        }

        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMillis) + v.a(this.accuracy, v.a(this.deviation, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("DwellAround(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", deviation=");
            sb.append(this.deviation);
            sb.append(", accuracy=");
            sb.append(this.accuracy);
            sb.append(", durationMillis=");
            return androidx.camera.core.impl.b.q(sb, this.durationMillis, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$LoseCalibration;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "reason", "", "(I)V", "getReason", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoseCalibration extends PositioningDebuggingWalkSegment {
        private final int reason;

        public LoseCalibration(int i) {
            super(null);
            this.reason = i;
        }

        public static /* synthetic */ LoseCalibration copy$default(LoseCalibration loseCalibration, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = loseCalibration.reason;
            }
            return loseCalibration.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getReason() {
            return this.reason;
        }

        @NotNull
        public final LoseCalibration copy(int reason) {
            return new LoseCalibration(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoseCalibration) && this.reason == ((LoseCalibration) other).reason;
        }

        public final int getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Integer.hashCode(this.reason);
        }

        @NotNull
        public String toString() {
            return YU.a.l(new StringBuilder("LoseCalibration(reason="), this.reason, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$MoveTo;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "x", "", "y", "accuracy", "speed", "(DDDD)V", "getAccuracy", "()D", "getSpeed", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveTo extends PositioningDebuggingWalkSegment {
        private final double accuracy;
        private final double speed;
        private final double x;
        private final double y;

        public MoveTo(double d, double d2, double d3, double d4) {
            super(null);
            this.x = d;
            this.y = d2;
            this.accuracy = d3;
            this.speed = d4;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, double d, double d2, double d3, double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = moveTo.x;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = moveTo.y;
            }
            double d6 = d2;
            if ((i & 4) != 0) {
                d3 = moveTo.accuracy;
            }
            return moveTo.copy(d5, d6, d3, (i & 8) != 0 ? moveTo.speed : d4);
        }

        /* renamed from: component1, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* renamed from: component4, reason: from getter */
        public final double getSpeed() {
            return this.speed;
        }

        @NotNull
        public final MoveTo copy(double x, double y, double accuracy, double speed) {
            return new MoveTo(x, y, accuracy, speed);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) other;
            return Double.compare(this.x, moveTo.x) == 0 && Double.compare(this.y, moveTo.y) == 0 && Double.compare(this.accuracy, moveTo.accuracy) == 0 && Double.compare(this.speed, moveTo.speed) == 0;
        }

        public final double getAccuracy() {
            return this.accuracy;
        }

        public final double getSpeed() {
            return this.speed;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public int hashCode() {
            return Double.hashCode(this.speed) + v.a(this.accuracy, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", accuracy=");
            sb.append(this.accuracy);
            sb.append(", speed=");
            return me.oriient.positioningengine.common.a.a(sb, this.speed, ')');
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment$StandStill;", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "x", "", "y", "accuracy", "durationMillis", "", "(DDDJ)V", "getAccuracy", "()D", "getDurationMillis", "()J", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StandStill extends PositioningDebuggingWalkSegment {
        private final double accuracy;
        private final long durationMillis;
        private final double x;
        private final double y;

        public StandStill(double d, double d2, double d3, long j) {
            super(null);
            this.x = d;
            this.y = d2;
            this.accuracy = d3;
            this.durationMillis = j;
        }

        public static /* synthetic */ StandStill copy$default(StandStill standStill, double d, double d2, double d3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                d = standStill.x;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = standStill.y;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = standStill.accuracy;
            }
            return standStill.copy(d4, d5, d3, (i & 8) != 0 ? standStill.durationMillis : j);
        }

        /* renamed from: component1, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final double getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* renamed from: component4, reason: from getter */
        public final long getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final StandStill copy(double x, double y, double accuracy, long durationMillis) {
            return new StandStill(x, y, accuracy, durationMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StandStill)) {
                return false;
            }
            StandStill standStill = (StandStill) other;
            return Double.compare(this.x, standStill.x) == 0 && Double.compare(this.y, standStill.y) == 0 && Double.compare(this.accuracy, standStill.accuracy) == 0 && this.durationMillis == standStill.durationMillis;
        }

        public final double getAccuracy() {
            return this.accuracy;
        }

        public final long getDurationMillis() {
            return this.durationMillis;
        }

        public final double getX() {
            return this.x;
        }

        public final double getY() {
            return this.y;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMillis) + v.a(this.accuracy, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("StandStill(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", accuracy=");
            sb.append(this.accuracy);
            sb.append(", durationMillis=");
            return androidx.camera.core.impl.b.q(sb, this.durationMillis, ')');
        }
    }

    public /* synthetic */ PositioningDebuggingWalkSegment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PositioningDebuggingWalkSegment() {
    }
}
