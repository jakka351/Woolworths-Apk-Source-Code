package me.oriient.positioningengine.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lme/oriient/positioningengine/common/CalibrationUpdate;", "", "progressPercent", "", "(D)V", "getProgressPercent", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CalibrationUpdate {
    private final double progressPercent;

    public CalibrationUpdate(double d) {
        this.progressPercent = d;
    }

    public static /* synthetic */ CalibrationUpdate copy$default(CalibrationUpdate calibrationUpdate, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = calibrationUpdate.progressPercent;
        }
        return calibrationUpdate.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getProgressPercent() {
        return this.progressPercent;
    }

    @NotNull
    public final CalibrationUpdate copy(double progressPercent) {
        return new CalibrationUpdate(progressPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalibrationUpdate) && Double.compare(this.progressPercent, ((CalibrationUpdate) other).progressPercent) == 0;
    }

    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public int hashCode() {
        return Double.hashCode(this.progressPercent);
    }

    @NotNull
    public String toString() {
        return a.a(new StringBuilder("CalibrationUpdate(progressPercent="), this.progressPercent, ')');
    }
}
