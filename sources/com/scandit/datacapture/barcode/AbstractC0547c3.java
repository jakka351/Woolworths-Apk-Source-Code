package com.scandit.datacapture.barcode;

import android.graphics.Paint;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0547c3 {
    public static BarcodePickDrawer a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar, BarcodePickBasicOverlay container, boolean z, Function1 onTrackTap, BarcodePickViewHighlightStyle.CustomView highlightStyle, C0583d3 drawSettings, W2 drawDataFactory, BarcodePickElementsCache cache, boolean z2) {
        HashMap map = new HashMap();
        C0642ge c0642ge = new C0642ge(new Z2(map), C0515a3.f17372a, new C0531b3(onTrackTap));
        Paint tapPaint = AbstractC0762o6.a();
        Intrinsics.h(aVar, "<this>");
        Intrinsics.h(container, "container");
        Intrinsics.h(onTrackTap, "onTrackTap");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(drawSettings, "drawSettings");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        Intrinsics.h(tapPaint, "tapPaint");
        Intrinsics.h(cache, "cache");
        return new Y2(container, z, c0642ge, highlightStyle, drawSettings, drawDataFactory, cache, tapPaint, map, z2);
    }
}
