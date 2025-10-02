package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C0646h2 extends FunctionReferenceImpl implements Function1 {
    public C0646h2(Object obj) {
        super(1, obj, C0710l2.class, "closestBarcodeToLocation", "closestBarcodeToLocation(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Point p0 = (Point) obj;
        Intrinsics.h(p0, "p0");
        return C0710l2.a((C0710l2) this.receiver, p0);
    }
}
