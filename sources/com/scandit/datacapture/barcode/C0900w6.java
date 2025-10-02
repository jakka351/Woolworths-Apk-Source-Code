package com.scandit.datacapture.barcode;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0900w6 implements L4 {
    private static final Lazy f = LazyKt.b(C0885v6.f18236a);
    private static final Lazy g = LazyKt.b(C0870u6.f18221a);
    private final Context b;
    private final Function1 c;
    private final InterfaceC0601e5 d;
    private final BarcodePickViewHighlightStyle e;

    public C0900w6(Context context, Function1 quadrilateralMapper, InterfaceC0601e5 cache, BarcodePickViewHighlightStyle.DotWithIcons highlightStyle) {
        Intrinsics.h(context, "context");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(cache, "cache");
        Intrinsics.h(highlightStyle, "highlightStyle");
        this.b = context;
        this.c = quadrilateralMapper;
        this.d = cache;
        this.e = highlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.L4
    public final J4 a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        int iIntValue;
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        boolean z = false;
        boolean z2 = ((C0533b5) this.d.a(track.b(), pickState, barcodePickState)).c().a(this.b) != null;
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.e;
        int i = AbstractC0665i5.c;
        Intrinsics.h(barcodePickViewHighlightStyle, "<this>");
        if (!z2 && (((barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) || (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) && (pickState == BarcodePickState.IGNORE || pickState == BarcodePickState.UNKNOWN))) {
            z = true;
        }
        if (z) {
            iIntValue = ((Number) f.getD()).intValue();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) g.getD()).intValue();
        }
        Point center = QuadrilateralUtilsKt.getCenter(QuadrilateralUtilsKt.boundingBox((Quadrilateral) this.c.invoke(track.d())));
        float f2 = iIntValue;
        return new J4(new Quadrilateral(new Point(center.getX() - f2, center.getY() - f2), new Point(center.getX() + f2, center.getY() - f2), new Point(center.getX() + f2, center.getY() + f2), new Point(center.getX() - f2, center.getY() + f2)), pickState);
    }
}
