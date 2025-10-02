package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002¨\u0006\u000b"}, d2 = {"distance", "", "Lcom/scandit/datacapture/core/common/geometry/Point;", "other", "distanceSquared", "div", "value", "dotProductSquared", "minus", "plus", "times", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointExtensionsKt {
    public static final float distance(@NotNull Point point, @NotNull Point other) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(other, "other");
        return (float) Math.sqrt(distanceSquared(point, other));
    }

    public static final float distanceSquared(@NotNull Point point, @NotNull Point other) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(other, "other");
        float x = point.getX() - other.getX();
        float y = point.getY() - other.getY();
        return (y * y) + (x * x);
    }

    @NotNull
    public static final Point div(@NotNull Point point, float f) {
        Intrinsics.h(point, "<this>");
        return new Point(point.getX() / f, point.getY() / f);
    }

    public static final float dotProductSquared(@NotNull Point point) {
        Intrinsics.h(point, "<this>");
        return (point.getY() * point.getY()) + (point.getX() * point.getX());
    }

    @NotNull
    public static final Point minus(@NotNull Point point, @NotNull Point other) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(other, "other");
        return new Point(point.getX() - other.getX(), point.getY() - other.getY());
    }

    @NotNull
    public static final Point plus(@NotNull Point point, @NotNull Point other) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(other, "other");
        return new Point(other.getX() + point.getX(), other.getY() + point.getY());
    }

    @NotNull
    public static final Point times(@NotNull Point point, float f) {
        Intrinsics.h(point, "<this>");
        return new Point(point.getX() * f, point.getY() * f);
    }
}
