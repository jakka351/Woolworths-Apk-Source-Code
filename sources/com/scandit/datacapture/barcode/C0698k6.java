package com.scandit.datacapture.barcode;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0698k6 implements L4 {
    private final BarcodePickElementsCache b;
    private final Function1 c;

    public C0698k6(BarcodePickElementsCache customViewCache, Function1 quadrilateralMapper) {
        Intrinsics.h(customViewCache, "customViewCache");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        this.b = customViewCache;
        this.c = quadrilateralMapper;
    }

    @Override // com.scandit.datacapture.barcode.L4
    public final J4 a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        View viewB;
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        Quadrilateral quadrilateralBoundingBox = QuadrilateralUtilsKt.boundingBox((Quadrilateral) this.c.invoke(track.d()));
        C0549c5 c0549c5 = (C0549c5) this.b.a(track.b(), pickState, barcodePickState);
        if (c0549c5 == null || (viewB = c0549c5.b()) == null) {
            return new J4(quadrilateralBoundingBox, pickState);
        }
        viewB.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Size2 size2 = new Size2(viewB.getMeasuredWidth(), viewB.getMeasuredHeight());
        float f = 2;
        float width = size2.getWidth() / f;
        float height = size2.getHeight() / f;
        Point center = QuadrilateralUtilsKt.getCenter(quadrilateralBoundingBox);
        return new J4(new Quadrilateral(new Point(center.getX() - width, center.getY() - height), new Point(center.getX() + width, center.getY() - height), new Point(center.getX() + width, center.getY() + height), new Point(center.getX() - width, center.getY() + height)), pickState);
    }
}
