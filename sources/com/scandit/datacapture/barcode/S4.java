package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class S4 {
    public static final BarcodePickDrawer a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar, BarcodePickBasicOverlay container, InterfaceC0826s7 styleBehaviour, BarcodePickElementsCache elementsProvider, BarcodePickViewHighlightStyle highlightStyle, L4 drawDataFactory) {
        Intrinsics.h(aVar, "<this>");
        Intrinsics.h(container, "container");
        Intrinsics.h(styleBehaviour, "styleBehaviour");
        Intrinsics.h(elementsProvider, "elementsProvider");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        return new R4(container, styleBehaviour, elementsProvider, highlightStyle, drawDataFactory, new HashMap(), false, new ArrayList());
    }
}
