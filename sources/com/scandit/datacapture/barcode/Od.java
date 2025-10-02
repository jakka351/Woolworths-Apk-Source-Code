package com.scandit.datacapture.barcode;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Od {
    public static final Quadrilateral a(Quadrilateral quadrilateral, BarcodePickViewHighlightStyle style, Size2 minSize) {
        Intrinsics.h(quadrilateral, "<this>");
        Intrinsics.h(style, "style");
        Intrinsics.h(minSize, "minSize");
        if (!(style instanceof BarcodePickViewHighlightStyle.Rectangular) && !(style instanceof BarcodePickViewHighlightStyle.RectangularWithIcons)) {
            if (style instanceof BarcodePickViewHighlightStyle.Dot) {
                Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
                float x = center.getX() - AbstractC0665i5.a();
                float fA = AbstractC0665i5.a() + center.getX();
                float y = center.getY() - AbstractC0665i5.a();
                float fA2 = AbstractC0665i5.a() + center.getY();
                return new Quadrilateral(new Point(x, y), new Point(fA, y), new Point(fA, fA2), new Point(x, fA2));
            }
            if (style instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
                Point center2 = QuadrilateralUtilsKt.getCenter(quadrilateral);
                float x2 = center2.getX() - AbstractC0665i5.a();
                float fA3 = AbstractC0665i5.a() + center2.getX();
                float y2 = center2.getY() - AbstractC0665i5.a();
                float fA4 = AbstractC0665i5.a() + center2.getY();
                return new Quadrilateral(new Point(x2, y2), new Point(fA3, y2), new Point(fA3, fA4), new Point(x2, fA4));
            }
            if (!(style instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            RectF rectF = new RectF(ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX()), ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY()), ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX()), ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY()));
            float fHeight = rectF.height();
            float fWidth = rectF.width();
            if (fWidth > minSize.getWidth() && fHeight > minSize.getHeight()) {
                return QuadrilateralUtilsKt.Quadrilateral(rectF);
            }
            float f = 2;
            rectF.inset(-(Math.max(BitmapDescriptorFactory.HUE_RED, minSize.getWidth() - fWidth) / f), -(Math.max(BitmapDescriptorFactory.HUE_RED, minSize.getHeight() - fHeight) / f));
            return QuadrilateralUtilsKt.Quadrilateral(rectF);
        }
        return E2.a(quadrilateral, minSize);
    }
}
