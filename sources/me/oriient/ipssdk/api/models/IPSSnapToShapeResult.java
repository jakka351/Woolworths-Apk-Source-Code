package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSnapToShapeResult;", "", "snappedCoordinate", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "shape", "Lme/oriient/ipssdk/api/models/IPSShape;", "indexInInputList", "", "distance", "", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSShape;ID)V", "getDistance", "()D", "getIndexInInputList", "()I", "getShape", "()Lme/oriient/ipssdk/api/models/IPSShape;", "getSnappedCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSSnapToShapeResult {
    private final double distance;
    private final int indexInInputList;

    @NotNull
    private final IPSShape shape;

    @NotNull
    private final IPSCoordinate snappedCoordinate;

    public IPSSnapToShapeResult(@NotNull IPSCoordinate snappedCoordinate, @NotNull IPSShape shape, int i, double d) {
        Intrinsics.h(snappedCoordinate, "snappedCoordinate");
        Intrinsics.h(shape, "shape");
        this.snappedCoordinate = snappedCoordinate;
        this.shape = shape;
        this.indexInInputList = i;
        this.distance = d;
    }

    public static /* synthetic */ IPSSnapToShapeResult copy$default(IPSSnapToShapeResult iPSSnapToShapeResult, IPSCoordinate iPSCoordinate, IPSShape iPSShape, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iPSCoordinate = iPSSnapToShapeResult.snappedCoordinate;
        }
        if ((i2 & 2) != 0) {
            iPSShape = iPSSnapToShapeResult.shape;
        }
        if ((i2 & 4) != 0) {
            i = iPSSnapToShapeResult.indexInInputList;
        }
        if ((i2 & 8) != 0) {
            d = iPSSnapToShapeResult.distance;
        }
        int i3 = i;
        return iPSSnapToShapeResult.copy(iPSCoordinate, iPSShape, i3, d);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IPSCoordinate getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IPSShape getShape() {
        return this.shape;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIndexInInputList() {
        return this.indexInInputList;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final IPSSnapToShapeResult copy(@NotNull IPSCoordinate snappedCoordinate, @NotNull IPSShape shape, int indexInInputList, double distance) {
        Intrinsics.h(snappedCoordinate, "snappedCoordinate");
        Intrinsics.h(shape, "shape");
        return new IPSSnapToShapeResult(snappedCoordinate, shape, indexInInputList, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSSnapToShapeResult)) {
            return false;
        }
        IPSSnapToShapeResult iPSSnapToShapeResult = (IPSSnapToShapeResult) other;
        return Intrinsics.c(this.snappedCoordinate, iPSSnapToShapeResult.snappedCoordinate) && Intrinsics.c(this.shape, iPSSnapToShapeResult.shape) && this.indexInInputList == iPSSnapToShapeResult.indexInInputList && Double.compare(this.distance, iPSSnapToShapeResult.distance) == 0;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final int getIndexInInputList() {
        return this.indexInInputList;
    }

    @NotNull
    public final IPSShape getShape() {
        return this.shape;
    }

    @NotNull
    public final IPSCoordinate getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    public int hashCode() {
        return Double.hashCode(this.distance) + b.a(this.indexInInputList, (this.shape.hashCode() + (this.snappedCoordinate.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IPSSnapToShapeResult(snappedCoordinate=");
        sb.append(this.snappedCoordinate);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", indexInInputList=");
        sb.append(this.indexInInputList);
        sb.append(", distance=");
        return b.p(sb, this.distance, ')');
    }
}
