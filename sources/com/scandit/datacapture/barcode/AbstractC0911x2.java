package com.scandit.datacapture.barcode;

import android.graphics.Path;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;

/* renamed from: com.scandit.datacapture.barcode.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0911x2 {
    public static final Path a(Quadrilateral quadrilateral) {
        Path path = new Path();
        Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
        path.addCircle(center.getX(), center.getY(), AbstractC0665i5.a(), Path.Direction.CW);
        return path;
    }

    public static final Path b(Quadrilateral quadrilateral) {
        Path path = new Path();
        Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
        path.addCircle(center.getX(), center.getY(), AbstractC0665i5.b(), Path.Direction.CW);
        return path;
    }
}
