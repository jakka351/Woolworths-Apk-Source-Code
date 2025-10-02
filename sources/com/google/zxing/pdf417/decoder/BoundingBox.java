package com.google.zxing.pdf417.decoder;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
final class BoundingBox {

    /* renamed from: a, reason: collision with root package name */
    public final BitMatrix f16201a;
    public final ResultPoint b;
    public final ResultPoint c;
    public final ResultPoint d;
    public final ResultPoint e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        boolean z = resultPoint == null || resultPoint2 == null;
        boolean z2 = resultPoint3 == null || resultPoint4 == null;
        if (z && z2) {
            throw NotFoundException.f;
        }
        if (z) {
            resultPoint = new ResultPoint(BitmapDescriptorFactory.HUE_RED, resultPoint3.b);
            resultPoint2 = new ResultPoint(BitmapDescriptorFactory.HUE_RED, resultPoint4.b);
        } else if (z2) {
            int i = bitMatrix.d;
            resultPoint3 = new ResultPoint(i - 1, resultPoint.b);
            resultPoint4 = new ResultPoint(i - 1, resultPoint2.b);
        }
        this.f16201a = bitMatrix;
        this.b = resultPoint;
        this.c = resultPoint2;
        this.d = resultPoint3;
        this.e = resultPoint4;
        this.f = (int) Math.min(resultPoint.f16132a, resultPoint2.f16132a);
        this.g = (int) Math.max(resultPoint3.f16132a, resultPoint4.f16132a);
        this.h = (int) Math.min(resultPoint.b, resultPoint3.b);
        this.i = (int) Math.max(resultPoint2.b, resultPoint4.b);
    }

    public BoundingBox(BoundingBox boundingBox) {
        this.f16201a = boundingBox.f16201a;
        this.b = boundingBox.b;
        this.c = boundingBox.c;
        this.d = boundingBox.d;
        this.e = boundingBox.e;
        this.f = boundingBox.f;
        this.g = boundingBox.g;
        this.h = boundingBox.h;
        this.i = boundingBox.i;
    }
}
