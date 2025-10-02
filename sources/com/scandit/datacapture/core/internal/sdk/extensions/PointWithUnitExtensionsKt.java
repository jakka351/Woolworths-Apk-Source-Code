package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"toPixels", "Lcom/scandit/datacapture/core/common/geometry/Point;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scale", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "displayDensity", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointWithUnitExtensionsKt {
    @NotNull
    public static final Point toPixels(@NotNull PointWithUnit pointWithUnit, @NotNull Size2 scale, float f) {
        Intrinsics.h(pointWithUnit, "<this>");
        Intrinsics.h(scale, "scale");
        FloatWithUnit x = pointWithUnit.getX();
        Intrinsics.g(x, "x");
        float pixels = FloatWithUnitExtensionsKt.toPixels(x, scale.getWidth(), f);
        FloatWithUnit y = pointWithUnit.getY();
        Intrinsics.g(y, "y");
        return new Point(pixels, FloatWithUnitExtensionsKt.toPixels(y, scale.getHeight(), f));
    }
}
