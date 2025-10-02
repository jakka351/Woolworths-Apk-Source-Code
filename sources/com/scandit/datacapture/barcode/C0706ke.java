package com.scandit.datacapture.barcode;

import android.graphics.Path;
import android.graphics.RectF;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.ke, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0706ke implements InterfaceC0690je {
    private final DataCaptureView b;
    private final RectF c = new RectF();

    public C0706ke(DataCaptureView dataCaptureView) {
        this.b = dataCaptureView;
    }

    public final C0722le a(TrackedBarcode trackedBarcode, boolean z) {
        Point center;
        Quadrilateral quadrilateralMapFrameQuadrilateralToView;
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        int identifier = trackedBarcode.getIdentifier();
        DataCaptureView dataCaptureView = this.b;
        if (dataCaptureView == null || (center = dataCaptureView.mapFramePointToView(QuadrilateralUtilsKt.getCenter(trackedBarcode.getLocation()))) == null) {
            center = QuadrilateralUtilsKt.getCenter(trackedBarcode.getLocation());
        }
        Quadrilateral location = trackedBarcode.getLocation();
        RectF rectF = this.c;
        DataCaptureView dataCaptureView2 = this.b;
        if (dataCaptureView2 != null && (quadrilateralMapFrameQuadrilateralToView = dataCaptureView2.mapFrameQuadrilateralToView(location)) != null) {
            location = quadrilateralMapFrameQuadrilateralToView;
        }
        rectF.left = ComparisonsKt.e(new float[]{location.getTopRight().getX(), location.getBottomRight().getX(), location.getBottomLeft().getX()}, location.getTopLeft().getX());
        rectF.top = ComparisonsKt.e(new float[]{location.getTopRight().getY(), location.getBottomRight().getY(), location.getBottomLeft().getY()}, location.getTopLeft().getY());
        rectF.right = ComparisonsKt.b(new float[]{location.getTopRight().getX(), location.getBottomRight().getX(), location.getBottomLeft().getX()}, location.getTopLeft().getX());
        rectF.bottom = ComparisonsKt.b(new float[]{location.getTopRight().getY(), location.getBottomRight().getY(), location.getBottomLeft().getY()}, location.getTopLeft().getY());
        float fMin = Math.min(rectF.width(), rectF.height());
        InterfaceC0690je.f17824a.getClass();
        return new C0722le(identifier, z, center, RangesKt.b(fMin / C0674ie.a(), 0.5f, 1.0f));
    }

    public final Path a(TrackedBarcode trackedBarcode) {
        Quadrilateral quadrilateralMapFrameQuadrilateralToView;
        Intrinsics.h(trackedBarcode, "trackedBarcode");
        Quadrilateral location = trackedBarcode.getLocation();
        DataCaptureView dataCaptureView = this.b;
        if (dataCaptureView != null && (quadrilateralMapFrameQuadrilateralToView = dataCaptureView.mapFrameQuadrilateralToView(location)) != null) {
            location = quadrilateralMapFrameQuadrilateralToView;
        }
        Path path = new Path();
        path.moveTo(location.getTopLeft().getX(), location.getTopLeft().getY());
        path.lineTo(location.getTopRight().getX(), location.getTopRight().getY());
        path.lineTo(location.getBottomRight().getX(), location.getBottomRight().getY());
        path.lineTo(location.getBottomLeft().getX(), location.getBottomLeft().getY());
        path.close();
        return path;
    }
}
