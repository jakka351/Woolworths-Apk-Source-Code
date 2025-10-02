package me.oriient.positioningengine.ondevice.debugging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalk;", "", "startCalibrated", "", "segments", "", "Lme/oriient/positioningengine/ondevice/debugging/PositioningDebuggingWalkSegment;", "(ZLjava/util/List;)V", "getSegments", "()Ljava/util/List;", "getStartCalibrated", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PositioningDebuggingWalk {

    @NotNull
    private final List<PositioningDebuggingWalkSegment> segments;
    private final boolean startCalibrated;

    /* JADX WARN: Multi-variable type inference failed */
    public PositioningDebuggingWalk(boolean z, @NotNull List<? extends PositioningDebuggingWalkSegment> segments) {
        Intrinsics.h(segments, "segments");
        this.startCalibrated = z;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositioningDebuggingWalk copy$default(PositioningDebuggingWalk positioningDebuggingWalk, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = positioningDebuggingWalk.startCalibrated;
        }
        if ((i & 2) != 0) {
            list = positioningDebuggingWalk.segments;
        }
        return positioningDebuggingWalk.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getStartCalibrated() {
        return this.startCalibrated;
    }

    @NotNull
    public final List<PositioningDebuggingWalkSegment> component2() {
        return this.segments;
    }

    @NotNull
    public final PositioningDebuggingWalk copy(boolean startCalibrated, @NotNull List<? extends PositioningDebuggingWalkSegment> segments) {
        Intrinsics.h(segments, "segments");
        return new PositioningDebuggingWalk(startCalibrated, segments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningDebuggingWalk)) {
            return false;
        }
        PositioningDebuggingWalk positioningDebuggingWalk = (PositioningDebuggingWalk) other;
        return this.startCalibrated == positioningDebuggingWalk.startCalibrated && Intrinsics.c(this.segments, positioningDebuggingWalk.segments);
    }

    @NotNull
    public final List<PositioningDebuggingWalkSegment> getSegments() {
        return this.segments;
    }

    public final boolean getStartCalibrated() {
        return this.startCalibrated;
    }

    public int hashCode() {
        return this.segments.hashCode() + (Boolean.hashCode(this.startCalibrated) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PositioningDebuggingWalk(startCalibrated=");
        sb.append(this.startCalibrated);
        sb.append(", segments=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.segments, ')');
    }
}
