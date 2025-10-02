package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.j9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0685j9 implements L4 {
    private final Function1 b;
    private final Size2 c;

    public C0685j9(Size2 minSize, Function1 quadrilateralMapper) {
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(minSize, "minSize");
        this.b = quadrilateralMapper;
        this.c = minSize;
    }

    @Override // com.scandit.datacapture.barcode.L4
    public final J4 a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        return new J4(E2.a((Quadrilateral) this.b.invoke(track.d()), this.c), pickState);
    }
}
