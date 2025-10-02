package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0001¨\u0006\r"}, d2 = {"rotatedByVector", "Lcom/scandit/datacapture/core/common/geometry/Point;", "pivot", "vector", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "rotatedDegrees", "degrees", "", "scaled", "scale", "", "toJson", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointUtilsKt {
    @NotNull
    public static final Point rotatedByVector(@NotNull Point point, @NotNull Point pivot, @NotNull Vector vector) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(pivot, "pivot");
        Intrinsics.h(vector, "vector");
        Vector vectorNormalized = vector.normalized();
        float dy = vectorNormalized.getDy();
        float dx = vectorNormalized.getDx();
        float f = point.x;
        float f2 = pivot.x;
        float f3 = f - f2;
        float f4 = point.y;
        float f5 = pivot.y;
        float f6 = f4 - f5;
        return new Point(((f3 * dx) - (f6 * dy)) + f2, (f6 * dx) + (f3 * dy) + f5);
    }

    @NotNull
    public static final Point rotatedDegrees(@NotNull Point point, @NotNull Point pivot, int i) {
        Intrinsics.h(point, "<this>");
        Intrinsics.h(pivot, "pivot");
        double radians = Math.toRadians(i);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        float f = point.x;
        float f2 = pivot.x;
        double d = f - f2;
        float f3 = point.y;
        float f4 = pivot.y;
        double d2 = f3 - f4;
        return new Point((float) (((dCos * d) - (dSin * d2)) + f2), (float) ((dCos * d2) + ((-dSin) * d) + f4));
    }

    @NotNull
    public static final Point scaled(@NotNull Point point, float f) {
        Intrinsics.h(point, "<this>");
        return new Point(point.x * f, point.y * f);
    }

    public static final /* synthetic */ String toJson(Point point) {
        Intrinsics.h(point, "<this>");
        String strPointToJson = NativeStructSerializer.pointToJson(point);
        Intrinsics.g(strPointToJson, "pointToJson(this)");
        return strPointToJson;
    }
}
