package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingWalk;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingWalkSegment;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006J\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalkBuilder;", "", "startCalibrated", "", "(Z)V", "accuracy", "", "segments", "", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "speedKmPerHour", "acquireLockAt", "x", "y", "durationMillis", "", "build", "Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalk;", "changeFloorTo", "floorOrder", "", "completeCalibration", "dwellAround", "deviation", "loseAndRecoverLockAt", "loseCalibration", "reason", "setAccuracy", "value", "setSpeed", "standStillAt", "walkTo", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSPositioningDebuggingWalkBuilder {
    private double accuracy;

    @NotNull
    private final List<PositioningDebuggingWalkSegment> segments;
    private double speedKmPerHour;
    private final boolean startCalibrated;

    public IPSPositioningDebuggingWalkBuilder() {
        this(false, 1, null);
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder acquireLockAt(double x, double y, long durationMillis) {
        this.segments.add(new PositioningDebuggingWalkSegment.AcquireLockAt(x, y, this.accuracy, durationMillis));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalk build() {
        return new IPSPositioningDebuggingWalk(new PositioningDebuggingWalk(this.startCalibrated, this.segments));
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder changeFloorTo(int floorOrder) {
        this.segments.add(new PositioningDebuggingWalkSegment.ChangeFloor(floorOrder));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder completeCalibration(long durationMillis) {
        this.segments.add(new PositioningDebuggingWalkSegment.CompleteCalibration(durationMillis));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder dwellAround(double x, double y, double deviation, long durationMillis) {
        this.segments.add(new PositioningDebuggingWalkSegment.DwellAround(x, y, deviation, this.accuracy, durationMillis));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder loseAndRecoverLockAt(double x, double y, long durationMillis) {
        this.segments.add(new PositioningDebuggingWalkSegment.AcquireLockAt(x, y, this.accuracy, durationMillis));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder loseCalibration(int reason) {
        this.segments.add(new PositioningDebuggingWalkSegment.LoseCalibration(reason));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder setAccuracy(double value) {
        this.accuracy = value;
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder setSpeed(double value) {
        this.speedKmPerHour = value;
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder standStillAt(double x, double y, long durationMillis) {
        this.segments.add(new PositioningDebuggingWalkSegment.StandStill(x, y, this.accuracy, durationMillis));
        return this;
    }

    @NotNull
    public final IPSPositioningDebuggingWalkBuilder walkTo(double x, double y) {
        this.segments.add(new PositioningDebuggingWalkSegment.MoveTo(x, y, this.accuracy, this.speedKmPerHour));
        return this;
    }

    public IPSPositioningDebuggingWalkBuilder(boolean z) {
        this.startCalibrated = z;
        this.segments = new ArrayList();
        this.accuracy = 2.0d;
        this.speedKmPerHour = 5.0d;
    }

    public /* synthetic */ IPSPositioningDebuggingWalkBuilder(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
