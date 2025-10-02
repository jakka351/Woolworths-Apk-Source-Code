package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C0521a9 extends FunctionReferenceImpl implements Function1 {
    public C0521a9(Object obj) {
        super(1, obj, BarcodePickDataCaptureViewWrapper.class, "mapFrameQuadrilateralToView", "mapFrameQuadrilateralToView(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Quadrilateral p0 = (Quadrilateral) obj;
        Intrinsics.h(p0, "p0");
        return ((BarcodePickDataCaptureViewWrapper) this.receiver).mapFrameQuadrilateralToView(p0);
    }
}
