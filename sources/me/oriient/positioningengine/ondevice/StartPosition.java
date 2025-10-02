package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.models.Heading;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lme/oriient/positioningengine/ondevice/StartPosition;", "", "x", "", "y", "accuracy", "heading", "Lme/oriient/positioningengine/ondevice/models/Heading;", "isExternal", "", "(DDDLme/oriient/positioningengine/ondevice/models/Heading;Z)V", "getAccuracy", "()D", "getHeading", "()Lme/oriient/positioningengine/ondevice/models/Heading;", "()Z", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StartPosition {
    private final double accuracy;

    @Nullable
    private final Heading heading;
    private final boolean isExternal;
    private final double x;
    private final double y;

    public StartPosition(double d, double d2, double d3, @Nullable Heading heading, boolean z) {
        this.x = d;
        this.y = d2;
        this.accuracy = d3;
        this.heading = heading;
        this.isExternal = z;
    }

    public static /* synthetic */ StartPosition copy$default(StartPosition startPosition, double d, double d2, double d3, Heading heading, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = startPosition.x;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = startPosition.y;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = startPosition.accuracy;
        }
        return startPosition.copy(d4, d5, d3, (i & 8) != 0 ? startPosition.heading : heading, (i & 16) != 0 ? startPosition.isExternal : z);
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

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Heading getHeading() {
        return this.heading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    @NotNull
    public final StartPosition copy(double x, double y, double accuracy, @Nullable Heading heading, boolean isExternal) {
        return new StartPosition(x, y, accuracy, heading, isExternal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartPosition)) {
            return false;
        }
        StartPosition startPosition = (StartPosition) other;
        return Double.compare(this.x, startPosition.x) == 0 && Double.compare(this.y, startPosition.y) == 0 && Double.compare(this.accuracy, startPosition.accuracy) == 0 && Intrinsics.c(this.heading, startPosition.heading) && this.isExternal == startPosition.isExternal;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Heading getHeading() {
        return this.heading;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        int iA = me.oriient.positioningengine.common.v.a(this.accuracy, me.oriient.positioningengine.common.v.a(this.y, Double.hashCode(this.x) * 31, 31), 31);
        Heading heading = this.heading;
        return Boolean.hashCode(this.isExternal) + ((iA + (heading == null ? 0 : heading.hashCode())) * 31);
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StartPosition(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", isExternal=");
        return androidx.camera.core.impl.b.s(sb, this.isExternal, ')');
    }
}
