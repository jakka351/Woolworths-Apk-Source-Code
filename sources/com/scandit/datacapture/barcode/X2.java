package com.scandit.datacapture.barcode;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class X2 implements W2 {

    /* renamed from: a, reason: collision with root package name */
    private final Size2 f17341a;
    private final boolean b;
    private final Function1 c;
    private final BarcodePickViewSettings d;

    public X2(Size2 minSize, boolean z, Function1 quadrilateralMapper, BarcodePickViewSettings viewSettings) {
        Intrinsics.h(minSize, "minSize");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(viewSettings, "viewSettings");
        this.f17341a = minSize;
        this.b = z;
        this.c = quadrilateralMapper;
        this.d = viewSettings;
    }

    public final U2 a(View view, TrackedObject trackedObject, BarcodePickState pickState, BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(view, "view");
        Intrinsics.h(trackedObject, "trackedObject");
        Intrinsics.h(pickState, "pickState");
        Intrinsics.h(highlightStyle, "highlightStyle");
        boolean z = this.b;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            Quadrilateral quadrilateral = (Quadrilateral) this.c.invoke(trackedObject.d());
            Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
            Rect rectBoundingBoxRect = QuadrilateralUtilsKt.boundingBoxRect(quadrilateral);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Size2 size2 = new Size2(view.getMeasuredWidth(), view.getMeasuredHeight());
            float f = 2;
            com.scandit.datacapture.core.common.geometry.Rect rect = new com.scandit.datacapture.core.common.geometry.Rect(new Point(center.getX() - (size2.getWidth() / f), center.getY() - (size2.getHeight() / f)), new Size2(rectBoundingBoxRect.width(), rectBoundingBoxRect.height()));
            Point origin = rect.getOrigin();
            Intrinsics.g(origin, "viewRect.origin");
            return new U2(view, rect, new C0669i9(QuadrilateralUtilsKt.Quadrilateral(origin, size2)), pickState, trackedObject);
        }
        Quadrilateral quadrilateral2 = (Quadrilateral) this.c.invoke(trackedObject.d());
        Point center2 = QuadrilateralUtilsKt.getCenter(quadrilateral2);
        Rect rectBoundingBoxRect2 = QuadrilateralUtilsKt.boundingBoxRect(E2.a(quadrilateral2, this.f17341a));
        Size2 Size2 = Size2UtilsKt.Size2(rectBoundingBoxRect2.width(), rectBoundingBoxRect2.height());
        float f2 = 2;
        com.scandit.datacapture.core.common.geometry.Rect rect2 = new com.scandit.datacapture.core.common.geometry.Rect(new Point(center2.getX() - (Size2.getWidth() / f2), center2.getY() - (Size2.getHeight() / f2)), new Size2(rectBoundingBoxRect2.width(), rectBoundingBoxRect2.height()));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) Size2.getHeight();
            layoutParams.width = (int) Size2.getWidth();
        } else {
            layoutParams = new ViewGroup.LayoutParams((int) Size2.getWidth(), (int) Size2.getHeight());
        }
        view.setLayoutParams(layoutParams);
        return new U2(view, rect2, new C0669i9(Od.a(quadrilateral2, highlightStyle, new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * this.d.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * this.d.getMinimumHighlightHeightPx$scandit_barcode_capture()))), pickState, trackedObject);
    }
}
