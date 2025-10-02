package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Paint;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class C2 {
    public static BarcodePickDrawer a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar, BarcodePickBasicOverlay barcodePickBasicOverlay, Function1 onTrackTap, BarcodePickViewHighlightStyle highlightStyle, Function1 quadrilateralMapper, D2 drawSettings, InterfaceC0601e5 elementsProvider) {
        Context context = barcodePickBasicOverlay.getContext();
        Intrinsics.g(context, "container.context");
        Intrinsics.h(elementsProvider, "elementsProvider");
        Intrinsics.h(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.h(drawSettings, "drawSettings");
        C0896w2 c0896w2 = new C0896w2(context, elementsProvider, quadrilateralMapper, drawSettings);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0642ge c0642ge = new C0642ge(new C0941z2(linkedHashMap), A2.f17088a, new B2(onTrackTap));
        Paint tapPaint = AbstractC0777p6.b();
        Paint boundingBoxPaint = AbstractC0777p6.a();
        Intrinsics.h(aVar, "<this>");
        Intrinsics.h(onTrackTap, "onTrackTap");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(tapPaint, "tapPaint");
        Intrinsics.h(boundingBoxPaint, "boundingBoxPaint");
        return new C0926y2(barcodePickBasicOverlay, highlightStyle, c0896w2, drawSettings, linkedHashMap, c0642ge, tapPaint, boundingBoxPaint);
    }
}
