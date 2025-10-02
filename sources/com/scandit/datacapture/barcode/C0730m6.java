package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0730m6 implements L4 {
    private final Size2 b;
    private final Function1 c;

    public C0730m6(Size2 minSize, Function1 quadrilateralMapper) {
        Intrinsics.h(minSize, "minSize");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        this.b = minSize;
        this.c = quadrilateralMapper;
    }

    @Override // com.scandit.datacapture.barcode.L4
    public final J4 a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        return new J4(QuadrilateralUtilsKt.boundingBox(E2.a((Quadrilateral) this.c.invoke(track.d()), this.b)), pickState);
    }
}
